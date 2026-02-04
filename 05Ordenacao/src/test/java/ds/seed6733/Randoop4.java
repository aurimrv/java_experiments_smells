package ds.seed6733;

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
        int[] intArray4 = new int[] { (short) 0, (byte) -1, '4', (short) 1 };
        ds.Ordenacao.ordena(intArray4, (int) (short) -1);
        ds.Ordenacao.ordena(intArray4, (int) (byte) 1);
        ds.Ordenacao.ordena(intArray4, (int) (byte) 0);
        ds.Ordenacao.ordena(intArray4, (int) (short) 1);
        ds.Ordenacao.ordena(intArray4, (int) (byte) 1);
        ds.Ordenacao.ordena(intArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 52, 1]");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2002");
        int[] intArray3 = new int[] { (byte) 0, '4', 0 };
        ds.Ordenacao.ordena(intArray3, (int) (short) -1);
        ds.Ordenacao.ordena(intArray3, (int) (byte) 0);
        ds.Ordenacao.ordena(intArray3, (int) (byte) -1);
        ds.Ordenacao.ordena(intArray3, (int) (short) 1);
        ds.Ordenacao.ordena(intArray3, (int) (byte) 1);
        ds.Ordenacao.ordena(intArray3, (int) (short) -1);
        ds.Ordenacao.ordena(intArray3, (int) (byte) 0);
        ds.Ordenacao.ordena(intArray3, 0);
        ds.Ordenacao.ordena(intArray3, (-1));
        ds.Ordenacao.ordena(intArray3, (int) (short) 1);
        ds.Ordenacao.ordena(intArray3, (int) (short) -1);
        ds.Ordenacao.ordena(intArray3, (int) (byte) 0);
        ds.Ordenacao.ordena(intArray3, 0);
        java.lang.Class<?> wildcardClass30 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 52, 0]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2003");
        int[] intArray0 = new int[] {};
        ds.Ordenacao.ordena(intArray0, (int) (short) -1);
        ds.Ordenacao.ordena(intArray0, (int) (byte) 0);
        ds.Ordenacao.ordena(intArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.ordena(intArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }
}

