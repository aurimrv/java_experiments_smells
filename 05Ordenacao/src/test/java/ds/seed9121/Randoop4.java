package ds.seed9121;

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
        int[] intArray0 = new int[] {};
        ds.Ordenacao.ordena(intArray0, (int) (short) 1);
        ds.Ordenacao.ordena(intArray0, (int) (byte) 0);
        ds.Ordenacao.ordena(intArray0, (int) (byte) 0);
        ds.Ordenacao.ordena(intArray0, (int) (byte) 1);
        ds.Ordenacao.ordena(intArray0, 0);
        ds.Ordenacao.ordena(intArray0, (int) (byte) -1);
        ds.Ordenacao.ordena(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2002");
        int[] intArray0 = new int[] {};
        ds.Ordenacao.ordena(intArray0, (int) (short) 1);
        ds.Ordenacao.ordena(intArray0, (int) (byte) 0);
        ds.Ordenacao.ordena(intArray0, (int) (byte) 0);
        ds.Ordenacao.ordena(intArray0, (int) (byte) 1);
        ds.Ordenacao.ordena(intArray0, 0);
        ds.Ordenacao.ordena(intArray0, (int) (byte) -1);
        ds.Ordenacao.ordena(intArray0, (int) (short) 1);
        ds.Ordenacao.ordena(intArray0, 0);
        ds.Ordenacao.ordena(intArray0, (int) (short) 1);
        ds.Ordenacao.ordena(intArray0, 0);
        ds.Ordenacao.ordena(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }
}

