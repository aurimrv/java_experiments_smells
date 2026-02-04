package ds.seed6733;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1001");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1002");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1003");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1004");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1005");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (byte) 0);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1006");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1007");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1008");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
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
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1009");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray15, (int) (short) -1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin2.maxMin2(intArray23, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1010");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1011");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
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
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1012");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray19, 1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin2.maxMin2(intArray25, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1013");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 0);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, 0);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1014");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        int[] intArray27 = ds.MaxMin2.maxMin2(intArray25, (int) (byte) 0);
        int[] intArray29 = ds.MaxMin2.maxMin2(intArray25, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = ds.MaxMin2.maxMin2(intArray29, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0]");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1015");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 0);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray19, (int) (byte) 0);
        java.lang.Class<?> wildcardClass24 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1016");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1017");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (-1));
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (-1));
        java.lang.Class<?> wildcardClass26 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1018");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin2.maxMin2(intArray19, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1019");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1020");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (-1));
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1021");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1022");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1023");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
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
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1024");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1025");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray17, 1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray17, 1);
        int[] intArray27 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray29 = ds.MaxMin2.maxMin2(intArray27, (int) (short) -1);
        java.lang.Class<?> wildcardClass30 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1026");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1027");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (-1));
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1028");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
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
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1029");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1030");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1031");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) (byte) -1);
        int[] intArray27 = ds.MaxMin2.maxMin2(intArray23, (int) (short) -1);
        java.lang.Class<?> wildcardClass28 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1032");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1033");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1034");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1035");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 0);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1036");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (-1));
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1037");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1038");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 1);
        java.lang.Class<?> wildcardClass18 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1039");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1040");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1041");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1042");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1043");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
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
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1044");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1045");
        int[] intArray2 = new int[] { (short) 100, (byte) 1 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) 0);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1046");
        int[] intArray2 = new int[] { (short) 100, (byte) 1 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) 0);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1047");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1048");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1049");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1050");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (-1));
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1051");
        int[] intArray2 = new int[] { (short) 100, (byte) 1 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) 0);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1052");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray21, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin2.maxMin2(intArray21, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1053");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        int[] intArray27 = ds.MaxMin2.maxMin2(intArray25, (int) (byte) 0);
        int[] intArray29 = ds.MaxMin2.maxMin2(intArray25, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0]");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1054");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 1);
        java.lang.Class<?> wildcardClass16 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1055");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
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
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1056");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1057");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1058");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1059");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1060");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (-1));
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1061");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (-1));
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin2.maxMin2(intArray23, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1062");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) (short) -1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin2.maxMin2(intArray23, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1063");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        java.lang.Class<?> wildcardClass18 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1064");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1065");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 0);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1066");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1067");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, 0);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray21, (int) (short) 1);
        int[] intArray27 = ds.MaxMin2.maxMin2(intArray21, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1068");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1069");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1070");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1071");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray19, 1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray19, (int) (short) 0);
        int[] intArray27 = ds.MaxMin2.maxMin2(intArray25, (-1));
        int[] intArray29 = ds.MaxMin2.maxMin2(intArray25, 0);
        int[] intArray31 = ds.MaxMin2.maxMin2(intArray25, 0);
        java.lang.Class<?> wildcardClass32 = intArray31.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1072");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray19, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1073");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, 1);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
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
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1074");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray17, 1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray17, 1);
        int[] intArray27 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray29 = ds.MaxMin2.maxMin2(intArray27, (int) (short) -1);
        java.lang.Class<?> wildcardClass30 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1075");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin2.maxMin2(intArray23, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1076");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1077");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1078");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, 0);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1079");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1080");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1081");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
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
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1082");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin2.maxMin2(intArray19, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1083");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1084");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1085");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 0);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1086");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1087");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1088");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1089");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray11, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1090");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 1);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
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
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1091");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1092");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1093");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1094");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1095");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1096");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray13, 0);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1097");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (-1));
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1098");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (byte) 0);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, 0);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1099");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 0);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1100");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1101");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray19, 1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) (byte) 1);
        int[] intArray27 = ds.MaxMin2.maxMin2(intArray23, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = ds.MaxMin2.maxMin2(intArray27, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1102");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1103");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray15, (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1104");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1105");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray19, (int) (short) 0);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray19, (int) (short) 1);
        java.lang.Class<?> wildcardClass26 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1106");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1107");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = ds.MaxMin2.maxMin2(intArray21, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1108");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1109");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
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
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1110");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) (byte) -1);
        int[] intArray27 = ds.MaxMin2.maxMin2(intArray25, 0);
        int[] intArray29 = ds.MaxMin2.maxMin2(intArray27, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0]");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1111");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1112");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
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
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1113");
        int[] intArray2 = new int[] { (short) 100, (byte) 1 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) 0);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1114");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1115");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) (byte) -1);
        int[] intArray27 = ds.MaxMin2.maxMin2(intArray23, (int) (short) -1);
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1116");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        java.lang.Class<?> wildcardClass20 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1117");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1118");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1119");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) (byte) 0);
        int[] intArray27 = ds.MaxMin2.maxMin2(intArray25, (int) (byte) 1);
        int[] intArray29 = ds.MaxMin2.maxMin2(intArray25, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0]");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1120");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray15, (int) (short) -1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin2.maxMin2(intArray23, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1121");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (-1));
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
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
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1122");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, 0);
        java.lang.Class<?> wildcardClass22 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1123");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1124");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1125");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (-1));
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (-1));
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
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
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1126");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) (byte) -1);
        java.lang.Class<?> wildcardClass26 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1127");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1128");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray13, 1);
        java.lang.Class<?> wildcardClass22 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1129");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ds.MaxMin2.maxMin2(intArray5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1130");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1131");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin2.maxMin2(intArray25, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1132");
        int[] intArray2 = new int[] { 100, 0 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1133");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (short) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1134");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray7, 0);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1135");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1136");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1137");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
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
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1138");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 1);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1139");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray5, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1140");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1141");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1142");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray19, 1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray19, (int) (short) 0);
        int[] intArray27 = ds.MaxMin2.maxMin2(intArray25, (-1));
        int[] intArray29 = ds.MaxMin2.maxMin2(intArray25, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = ds.MaxMin2.maxMin2(intArray29, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0]");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1143");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray19, (int) (short) 0);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, 0);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1144");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
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
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1145");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) (byte) -1);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1146");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1147");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1148");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) (byte) -1);
        java.lang.Class<?> wildcardClass26 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1149");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1150");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, (-1));
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1151");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1152");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
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
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1153");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, 0);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1154");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1155");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1156");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1157");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray19, (int) (short) 0);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1158");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1159");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, (int) (short) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1160");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1161");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) (short) 0);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin2.maxMin2(intArray25, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1162");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1163");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
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
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1164");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (-1));
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1165");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1166");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1167");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1168");
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
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1169");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1170");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray17, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1171");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1172");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1173");
        int[] intArray2 = new int[] { (short) 100, (byte) 1 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) 0);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1174");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray13, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1175");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1176");
        int[] intArray2 = new int[] { (short) 100, (byte) 1 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) 0);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1177");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
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
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1178");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin2.maxMin2(intArray25, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1179");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1180");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray15, (int) (short) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) (short) -1);
        int[] intArray27 = ds.MaxMin2.maxMin2(intArray25, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1181");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (-1));
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
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
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1182");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, 0);
        java.lang.Class<?> wildcardClass22 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1183");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (-1));
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1184");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1185");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1186");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (-1));
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray19, 0);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) (short) 0);
        int[] intArray27 = ds.MaxMin2.maxMin2(intArray25, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1187");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1188");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1189");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
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
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1190");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (byte) 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1191");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1192");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin2.maxMin2(intArray23, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1193");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) (short) -1);
        java.lang.Class<?> wildcardClass24 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1194");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (byte) 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1195");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1196");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) (short) 0);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) (short) 1);
        int[] intArray27 = ds.MaxMin2.maxMin2(intArray23, (-1));
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1197");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1198");
        int[] intArray2 = new int[] { (short) 100, (byte) 1 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) 0);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray4, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1199");
        int[] intArray2 = new int[] { (short) 100, (byte) 1 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) 0);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 1);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1200");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray11, (-1));
        java.lang.Class<?> wildcardClass20 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1201");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 1);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1202");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 1);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1203");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
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
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1204");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1205");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 1);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1206");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
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
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1207");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1208");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin2.maxMin2(intArray25, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1209");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1210");
        int[] intArray2 = new int[] { (short) 100, (byte) 1 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) 0);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1211");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1212");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1213");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1214");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray17, 1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin2.maxMin2(intArray23, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1215");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1216");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1217");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray19, (int) (short) 0);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1218");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 0);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1219");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = ds.MaxMin2.maxMin2(intArray21, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1220");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin2.maxMin2(intArray7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1221");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (short) 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray19, (int) (byte) 0);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1222");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
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
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1223");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (byte) 0);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1224");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        int[] intArray27 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1225");
        int[] intArray4 = new int[] { (short) 0, (short) 100, (-1), (byte) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray12, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 100, -1, 0]");
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
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1226");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 0);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }
}

