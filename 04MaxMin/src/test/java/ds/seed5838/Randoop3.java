package ds.seed5838;

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
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin3.maxMin3(intArray3, 0);
        int[] intArray7 = ds.MaxMin3.maxMin3(intArray5, 0);
        int[] intArray9 = ds.MaxMin3.maxMin3(intArray7, (-1));
        int[] intArray11 = ds.MaxMin3.maxMin3(intArray7, (-1));
        int[] intArray13 = ds.MaxMin3.maxMin3(intArray7, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin3.maxMin3(intArray7, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1502");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin3.maxMin3(intArray3, 0);
        int[] intArray7 = ds.MaxMin3.maxMin3(intArray3, (int) (short) 0);
        int[] intArray9 = ds.MaxMin3.maxMin3(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin3.maxMin3(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin3.maxMin3(intArray11, 1);
        int[] intArray15 = ds.MaxMin3.maxMin3(intArray11, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin3.maxMin3(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin3.maxMin3(intArray17, 1);
        int[] intArray21 = ds.MaxMin3.maxMin3(intArray17, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
    }
}

