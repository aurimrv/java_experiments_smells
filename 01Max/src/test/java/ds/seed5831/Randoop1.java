package ds.seed5831;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0501");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0502");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0503");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0504");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, 1);
        java.lang.Class<?> wildcardClass18 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0505");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = item5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0506");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0507");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = item9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0508");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0509");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0510");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0511");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (-1));
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0512");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, 1);
        java.lang.Class<?> wildcardClass18 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0513");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        java.lang.Class<?> wildcardClass14 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0514");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0515");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0516");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (-1));
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = item9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0517");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = item11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0518");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0519");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = ds.Max.max(itemArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0520");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item19 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0521");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        java.lang.Class<?> wildcardClass12 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0522");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = ds.Max.max(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0523");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0524");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        java.lang.Class<?> wildcardClass12 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0525");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        java.lang.Class<?> wildcardClass16 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0526");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0527");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = ds.Max.max(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0528");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0529");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0530");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0531");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0532");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (-1));
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0533");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0534");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        java.lang.Class<?> wildcardClass14 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0535");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item21 = ds.Max.max(itemArray1, 0);
        java.lang.Class<?> wildcardClass22 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0536");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0537");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0538");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        java.lang.Class<?> wildcardClass14 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0539");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0540");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = ds.Max.max(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0541");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0542");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0543");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0544");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = item9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0545");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0546");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0547");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        java.lang.Class<?> wildcardClass12 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0548");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0549");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0550");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0551");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = item9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0552");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0553");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = item11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0554");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0555");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0556");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0557");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0558");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0559");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0560");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0561");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0562");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0563");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0564");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0565");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0566");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0567");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0568");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = item11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0569");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0570");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = item17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0571");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = item7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0572");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0573");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0574");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0575");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        java.lang.Class<?> wildcardClass16 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0576");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0577");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0578");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item21 = ds.Max.max(itemArray1, 0);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0579");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = item17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0580");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0581");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0582");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0583");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0584");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0585");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0586");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0587");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0588");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0589");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        java.lang.Class<?> wildcardClass18 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0590");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0591");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0592");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = item7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0593");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0594");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = item23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0595");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0596");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = item17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0597");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0598");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0599");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = item9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0600");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0601");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = item9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0602");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0603");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = item5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0604");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0605");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = item19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0606");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        java.lang.Class<?> wildcardClass18 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0607");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0608");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0609");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0610");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0611");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = item19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0612");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0613");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0614");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0615");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0616");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0617");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0618");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0619");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0620");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        java.lang.Class<?> wildcardClass14 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0621");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = item19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0622");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0623");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0624");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0625");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0626");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0627");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0628");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0629");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        java.lang.Class<?> wildcardClass20 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0630");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0631");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0632");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0633");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0634");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item23 = ds.Max.max(itemArray1, (-1));
        ds.Item item25 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item27 = ds.Max.max(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0635");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0636");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0637");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0638");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = item9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0639");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0640");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0641");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0642");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        java.lang.Class<?> wildcardClass16 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0643");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = ds.Max.max(itemArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0644");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        java.lang.Class<?> wildcardClass6 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0645");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = item11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0646");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0647");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0648");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0649");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0650");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0651");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0652");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (-1));
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        java.lang.Class<?> wildcardClass14 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0653");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0654");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item25 = ds.Max.max(itemArray1, (int) (short) -1);
        java.lang.Class<?> wildcardClass26 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0655");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0656");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = item11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0657");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0658");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0659");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0660");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0661");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        java.lang.Class<?> wildcardClass12 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0662");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0663");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0664");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0665");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0666");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0667");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0668");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0669");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0670");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        java.lang.Class<?> wildcardClass18 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0671");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0672");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0673");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = item17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0674");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0675");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        java.lang.Class<?> wildcardClass18 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0676");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = item7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0677");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0678");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (-1));
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0679");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, 0);
        java.lang.Class<?> wildcardClass20 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0680");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0681");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0682");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0683");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = item7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0684");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item25 = ds.Max.max(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0685");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = item9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0686");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = item11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0687");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = ds.Max.max(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0688");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0689");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0690");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (-1));
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0691");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = item9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0692");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0693");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item23 = ds.Max.max(itemArray1, (-1));
        java.lang.Class<?> wildcardClass24 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0694");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = ds.Max.max(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0695");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0696");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0697");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0698");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0699");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0700");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0701");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0702");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0703");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        java.lang.Class<?> wildcardClass16 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0704");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (-1));
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0705");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = item19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0706");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = item19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0707");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (-1));
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        java.lang.Class<?> wildcardClass10 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0708");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0709");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = item7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0710");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0711");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = ds.Max.max(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0712");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0713");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (-1));
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0714");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0715");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0716");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item23 = ds.Max.max(itemArray1, (-1));
        ds.Item item25 = ds.Max.max(itemArray1, 0);
        java.lang.Class<?> wildcardClass26 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0717");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0718");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (-1));
        java.lang.Class<?> wildcardClass8 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0719");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0720");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item21 = ds.Max.max(itemArray1, 1);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item25 = ds.Max.max(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0721");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0722");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0723");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0724");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0725");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = item9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0726");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = item17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0727");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0728");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0729");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0730");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0731");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = item17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0732");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = item19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0733");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = item11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0734");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0735");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0736");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0737");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = ds.Max.max(itemArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0738");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item21 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = item21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0739");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0740");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
        java.lang.Class<?> wildcardClass12 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0741");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0742");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0743");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0744");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        java.lang.Class<?> wildcardClass10 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0745");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0746");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = item11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0747");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0748");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0749");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0750");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = ds.Max.max(itemArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0751");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = item11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0752");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item25 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item27 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0753");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0754");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0755");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0756");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0757");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0758");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = item9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0759");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = item19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0760");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0761");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = item11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0762");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0763");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = ds.Max.max(itemArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0764");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0765");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0766");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = item17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0767");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item21 = ds.Max.max(itemArray1, 1);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = item23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0768");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0769");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0770");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0771");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0772");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0773");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0774");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0775");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0776");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0777");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item25 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass26 = item25.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0778");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0779");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0780");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0781");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = item11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0782");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0783");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0784");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = item7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0785");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0786");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0787");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = item9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0788");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0789");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0790");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, 1);
        ds.Item item19 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0791");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0792");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0793");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0794");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0795");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0796");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        java.lang.Class<?> wildcardClass18 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0797");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0798");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0799");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0800");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        java.lang.Class<?> wildcardClass14 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0801");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0802");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0803");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0804");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0805");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0806");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0807");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        java.lang.Class<?> wildcardClass14 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0808");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0809");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0810");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0811");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = item19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0812");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0813");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        java.lang.Class<?> wildcardClass10 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0814");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = item23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0815");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0816");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0817");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0818");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        java.lang.Class<?> wildcardClass16 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0819");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0820");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0821");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0822");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0823");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = item19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0824");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0825");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0826");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (-1));
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        java.lang.Class<?> wildcardClass16 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0827");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = item17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0828");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0829");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0830");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0831");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = ds.Max.max(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0832");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0833");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = item19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0834");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0835");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0836");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0837");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0838");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0839");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0840");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        java.lang.Class<?> wildcardClass18 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0841");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0842");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = item11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0843");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0844");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        java.lang.Class<?> wildcardClass16 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0845");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0846");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item21 = ds.Max.max(itemArray1, 1);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item25 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass26 = item25.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0847");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        java.lang.Class<?> wildcardClass10 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0848");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0849");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = item17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0850");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
        java.lang.Class<?> wildcardClass10 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0851");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 1);
        java.lang.Class<?> wildcardClass18 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0852");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0853");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0854");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0855");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0856");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0857");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0858");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0859");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = item9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0860");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = ds.Max.max(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0861");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        java.lang.Class<?> wildcardClass16 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0862");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0863");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0864");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = item21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0865");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = ds.Max.max(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0866");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item23 = ds.Max.max(itemArray1, (-1));
        ds.Item item25 = ds.Max.max(itemArray1, (int) (short) 0);
        java.lang.Class<?> wildcardClass26 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0867");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0868");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0869");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0870");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0871");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = item19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0872");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0873");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = item17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0874");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0875");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0876");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0877");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0878");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        java.lang.Class<?> wildcardClass12 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0879");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0880");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0881");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0882");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0883");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = item17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0884");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item23 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = item23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0885");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0886");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0887");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item23 = ds.Max.max(itemArray1, (-1));
        ds.Item item25 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item27 = ds.Max.max(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0888");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = ds.Max.max(itemArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0889");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = ds.Max.max(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0890");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0891");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = item21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0892");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0893");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0894");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        java.lang.Class<?> wildcardClass14 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0895");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0896");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0897");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0898");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0899");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0900");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (-1));
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        java.lang.Class<?> wildcardClass12 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0901");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item19 = ds.Max.max(itemArray1, 1);
        java.lang.Class<?> wildcardClass20 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0902");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (-1));
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0903");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0904");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0905");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        java.lang.Class<?> wildcardClass10 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0906");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0907");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0908");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        java.lang.Class<?> wildcardClass12 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0909");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0910");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0911");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = item11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0912");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0913");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0914");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item21 = ds.Max.max(itemArray1, (-1));
        java.lang.Class<?> wildcardClass22 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0915");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0916");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0917");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0918");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0919");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0920");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0921");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0922");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0923");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item19 = ds.Max.max(itemArray1, 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass24 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0924");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = ds.Max.max(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0925");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0926");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0927");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, 1);
        java.lang.Class<?> wildcardClass18 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0928");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        java.lang.Class<?> wildcardClass18 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0929");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        java.lang.Class<?> wildcardClass14 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0930");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0931");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        java.lang.Class<?> wildcardClass14 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0932");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item21 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0933");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0934");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = item19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0935");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = item19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0936");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item21 = ds.Max.max(itemArray1, (-1));
        java.lang.Class<?> wildcardClass22 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0937");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0938");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0939");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        java.lang.Class<?> wildcardClass14 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0940");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = ds.Max.max(itemArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0941");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0942");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0943");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = item17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0944");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0945");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        java.lang.Class<?> wildcardClass8 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0946");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = item7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0947");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = item19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0948");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0949");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = item19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0950");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0951");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0952");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item21 = ds.Max.max(itemArray1, 1);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item25 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0953");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        java.lang.Class<?> wildcardClass20 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0954");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0955");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        java.lang.Class<?> wildcardClass14 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0956");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0957");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0958");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (-1));
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0959");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0960");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item21 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = item21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0961");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0962");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0963");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item21 = ds.Max.max(itemArray1, 0);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item25 = ds.Max.max(itemArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0964");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0965");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0966");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0967");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0968");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = item7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0969");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0970");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = item17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0971");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item21 = ds.Max.max(itemArray1, 1);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item25 = ds.Max.max(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0972");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0973");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0974");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = item17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0975");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        java.lang.Class<?> wildcardClass8 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0976");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = item11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0977");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = ds.Max.max(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0978");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0979");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = item19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0980");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0981");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        java.lang.Class<?> wildcardClass14 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0982");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = ds.Max.max(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0983");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = item9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0984");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0985");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = ds.Max.max(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0986");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0987");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = item7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0988");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0989");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0990");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0991");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) -1);
        java.lang.Class<?> wildcardClass20 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0992");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0993");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0994");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0995");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0996");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0997");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = ds.Max.max(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0998");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (-1));
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0999");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test1000");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item5 = ds.Max.max(itemArray1, 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }
}

