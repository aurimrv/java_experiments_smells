package ds.seed5482;

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
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, 1);
        java.lang.Class<?> wildcardClass18 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1002");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (-1));
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 1);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1003");
        int[] intArray2 = new int[] { 1, (byte) 100 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1004");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        java.lang.Class<?> wildcardClass18 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1005");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1006");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1007");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray13, 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1008");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray9, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1009");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1010");
        int[] intArray2 = new int[] { 1, (byte) 100 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1011");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1012");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1013");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1014");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1015");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin2.maxMin2(intArray23, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1016");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1017");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin2.maxMin2(intArray9, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1018");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1019");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1020");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, (-1));
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray15, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1021");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (short) 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1022");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray3, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (short) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1023");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1024");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray15, (-1));
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1025");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1026");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1027");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin2.maxMin2(intArray19, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1028");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray19, (int) (short) 0);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (-1));
        java.lang.Class<?> wildcardClass26 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1029");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray3, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1030");
        int[] intArray3 = new int[] { (short) 0, 100, ' ' };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 32]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1031");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1032");
        int[] intArray3 = new int[] { (short) 0, 100, ' ' };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 32]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1033");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1034");
        int[] intArray2 = new int[] { 1, (byte) 100 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1]");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1035");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1036");
        int[] intArray2 = new int[] { 1, (byte) 100 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray12, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 1]");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1037");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray3, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray3, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1038");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, (-1));
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray15, 1);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1039");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1040");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray13, 1);
        java.lang.Class<?> wildcardClass20 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1041");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1042");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1043");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray3, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray3, (-1));
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1044");
        int[] intArray2 = new int[] { 1, (byte) 100 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 1]");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1045");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1046");
        int[] intArray2 = new int[] { 1, (byte) 100 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1047");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray3, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1048");
        int[] intArray2 = new int[] { 1, (byte) 100 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 1]");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1049");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1050");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1051");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, 0);
        java.lang.Class<?> wildcardClass14 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1052");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
    }
}

