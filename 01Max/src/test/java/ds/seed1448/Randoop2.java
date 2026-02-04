package ds.seed1448;

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
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
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
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1002");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1003");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1004");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1005");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
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
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1006");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1007");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item19 = ds.Max.max(itemArray1, 0);
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
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1008");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1009");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1010");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
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
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1011");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item19 = ds.Max.max(itemArray1, 0);
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
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1012");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1013");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) '#');
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
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1014");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1015");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        ds.Item item21 = ds.Max.max(itemArray1, 1);
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
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1016");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1017");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1018");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1019");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, 1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1020");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
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
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1021");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
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
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1022");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1023");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1024");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1025");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        ds.Item item21 = ds.Max.max(itemArray1, 1);
        ds.Item item23 = ds.Max.max(itemArray1, 0);
        ds.Item item25 = ds.Max.max(itemArray1, (-1));
        ds.Item item27 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item29 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item31 = ds.Max.max(itemArray1, (int) '#');
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
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1026");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1027");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
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
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1028");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1029");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1030");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
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
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1031");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1032");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
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
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1033");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
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
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1034");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1035");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
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
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1036");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        ds.Item item21 = ds.Max.max(itemArray1, 1);
        ds.Item item23 = ds.Max.max(itemArray1, 0);
        ds.Item item25 = ds.Max.max(itemArray1, (-1));
        ds.Item item27 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item29 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass30 = item29.getClass();
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
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1037");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
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
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1038");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1039");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
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
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1040");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1041");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
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
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1042");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1043");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1044");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        java.lang.Class<?> wildcardClass6 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1045");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1046");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1047");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1048");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1049");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1050");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1051");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1052");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1053");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1054");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
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
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1055");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1056");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, 1);
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
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1057");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1058");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1059");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1060");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1061");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1062");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1063");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
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
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1064");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1065");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        ds.Item item21 = ds.Max.max(itemArray1, 1);
        ds.Item item23 = ds.Max.max(itemArray1, 0);
        ds.Item item25 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item27 = ds.Max.max(itemArray1, (int) (byte) 100);
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
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1066");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item23 = ds.Max.max(itemArray1, 1);
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
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1067");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1068");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
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
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1069");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1070");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1071");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1072");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1073");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1074");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1075");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, 1);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
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
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1076");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
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
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1077");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
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
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1078");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1079");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1080");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1081");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1082");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1083");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1084");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1085");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1086");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        java.lang.Class<?> wildcardClass8 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1087");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1088");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
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
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1089");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
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
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1090");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1091");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1092");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = ds.Max.max(itemArray1, (int) (short) 100);
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
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1093");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item21 = ds.Max.max(itemArray1, 0);
        ds.Item item23 = ds.Max.max(itemArray1, (-1));
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
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1094");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1095");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1096");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
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
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1097");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
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
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1098");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1099");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        java.lang.Class<?> wildcardClass10 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1100");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1101");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
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
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1102");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1103");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, 1);
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
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1104");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1105");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1106");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1107");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
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
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1108");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        ds.Item item21 = ds.Max.max(itemArray1, 0);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1109");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1110");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
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
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1111");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1112");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, 1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item25 = ds.Max.max(itemArray1, 0);
        ds.Item item27 = ds.Max.max(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item29 = ds.Max.max(itemArray1, (int) ' ');
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
        org.junit.Assert.assertNull(item27);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1113");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1114");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1115");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
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
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1116");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1117");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1118");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
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
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1119");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
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
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1120");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
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
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1121");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1122");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1123");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1124");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
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
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1125");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
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
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1126");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
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
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1127");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
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
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1128");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1129");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1130");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
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
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1131");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = ds.Max.max(itemArray1, (int) (short) 100);
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
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1132");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1133");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1134");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
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
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1135");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1136");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1137");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
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
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1138");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1139");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (-1));
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
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1140");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
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
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1141");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1142");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
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
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1143");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (-1));
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
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1144");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1145");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1146");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
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
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1147");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
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
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1148");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, 1);
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
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1149");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1150");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1151");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
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
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1152");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        ds.Item item15 = ds.Max.max(itemArray1, 0);
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
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1153");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
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
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1154");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, 1);
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
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1155");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, 1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item25 = ds.Max.max(itemArray1, 0);
        ds.Item item27 = ds.Max.max(itemArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass28 = itemArray1.getClass();
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
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1156");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
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
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1157");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
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
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1158");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1159");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1160");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1161");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1162");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1163");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1164");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1165");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1166");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
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
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1167");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1168");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1169");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1170");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
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
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1171");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
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
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1172");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1173");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1174");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1175");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1176");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 10);
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
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1177");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1178");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
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
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1179");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1180");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1181");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
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
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1182");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1183");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
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
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1184");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1185");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1186");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1187");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
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
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1188");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1189");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1190");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1191");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1192");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) '#');
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
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1193");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1194");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1195");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1196");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1197");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1198");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1199");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        ds.Item item21 = ds.Max.max(itemArray1, 1);
        ds.Item item23 = ds.Max.max(itemArray1, 0);
        ds.Item item25 = ds.Max.max(itemArray1, (-1));
        ds.Item item27 = ds.Max.max(itemArray1, (int) (short) 0);
        java.lang.Class<?> wildcardClass28 = itemArray1.getClass();
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
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1200");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1201");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1202");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1203");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
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
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1204");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1205");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
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
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1206");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1207");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1208");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
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
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1209");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1210");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
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
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1211");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1212");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1213");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
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
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1214");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1215");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1216");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
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
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1217");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1218");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
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
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1219");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
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
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1220");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1221");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1222");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1223");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1224");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
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
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1225");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1226");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
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
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1227");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        ds.Item item21 = ds.Max.max(itemArray1, 1);
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
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1228");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
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
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1229");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
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
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1230");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1231");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1232");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1233");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        ds.Item item21 = ds.Max.max(itemArray1, 1);
        ds.Item item23 = ds.Max.max(itemArray1, 0);
        ds.Item item25 = ds.Max.max(itemArray1, (-1));
        ds.Item item27 = ds.Max.max(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass28 = item27.getClass();
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
        org.junit.Assert.assertNull(item27);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1234");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1235");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
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
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1236");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1237");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1238");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1239");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1240");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
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
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1241");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1242");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1243");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
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
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1244");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
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
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1245");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1246");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
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
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1247");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
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
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1248");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1249");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1250");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1251");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1252");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item17 = ds.Max.max(itemArray1, 1);
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
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1253");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
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
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1254");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
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
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1255");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1256");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1257");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (-1));
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1258");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1259");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
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
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1260");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1261");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1262");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1263");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = ds.Max.max(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1264");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1265");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
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
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1266");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1267");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
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
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1268");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1269");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1270");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1271");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1272");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
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
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1273");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1274");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
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
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1275");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1276");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1277");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, 1);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
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
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1278");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
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
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1279");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item17 = ds.Max.max(itemArray1, 1);
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
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1280");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1281");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = ds.Max.max(itemArray1, (int) (short) 100);
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
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1282");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1283");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1284");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 10);
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
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1285");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1286");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1287");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1288");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1289");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1290");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
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
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1291");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1292");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1293");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1294");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1295");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1296");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1297");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (-1));
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
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1298");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        ds.Item item21 = ds.Max.max(itemArray1, 1);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item25 = ds.Max.max(itemArray1, 0);
        ds.Item item27 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item29 = ds.Max.max(itemArray1, (int) '#');
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
        org.junit.Assert.assertNull(item27);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1299");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1300");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1301");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1302");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1303");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
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
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1304");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
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
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1305");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        ds.Item item21 = ds.Max.max(itemArray1, 1);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1306");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1307");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1308");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1309");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1310");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1311");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
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
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1312");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1313");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
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
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1314");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
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
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1315");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
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
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1316");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        ds.Item item21 = ds.Max.max(itemArray1, 1);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item25 = ds.Max.max(itemArray1, 0);
        ds.Item item27 = ds.Max.max(itemArray1, 1);
        java.lang.Class<?> wildcardClass28 = itemArray1.getClass();
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
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1317");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        java.lang.Class<?> wildcardClass10 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1318");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
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
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1319");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1320");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1321");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
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
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1322");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1323");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
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
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1324");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
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
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1325");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1326");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, 1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1327");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item17 = ds.Max.max(itemArray1, 1);
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
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1328");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1329");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
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
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1330");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1331");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1332");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1333");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
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
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1334");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1335");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1336");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1337");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1338");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1339");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
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
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1340");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1341");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1342");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, 1);
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
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1343");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1344");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1345");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1346");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1347");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = ds.Max.max(itemArray1, (int) ' ');
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
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1348");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
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
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1349");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item17 = ds.Max.max(itemArray1, 1);
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
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1350");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1351");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
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
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1352");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1353");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1354");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, 0);
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
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1355");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, 1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item25 = ds.Max.max(itemArray1, 0);
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
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1356");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1357");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1358");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1359");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1360");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1361");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1362");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1363");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
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
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1364");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1365");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item21 = ds.Max.max(itemArray1, 0);
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
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1366");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1367");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1368");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1369");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1370");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1371");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1372");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1373");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1374");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1375");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1376");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1377");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1378");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        ds.Item item21 = ds.Max.max(itemArray1, 1);
        ds.Item item23 = ds.Max.max(itemArray1, 0);
        ds.Item item25 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1379");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        ds.Item item21 = ds.Max.max(itemArray1, 1);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item25 = ds.Max.max(itemArray1, 0);
        ds.Item item27 = ds.Max.max(itemArray1, 0);
        ds.Item item29 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass30 = item29.getClass();
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
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1380");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1381");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
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
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1382");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item21 = ds.Max.max(itemArray1, 0);
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
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1383");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1384");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = ds.Max.max(itemArray1, (int) '#');
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
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1385");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1386");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1387");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1388");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1389");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1390");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1391");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
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
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1392");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1393");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1394");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1395");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1396");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1397");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1398");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1399");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
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
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1400");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
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
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1401");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item25 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1402");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
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
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1403");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1404");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1405");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        ds.Item item21 = ds.Max.max(itemArray1, 1);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item25 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1406");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1407");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1408");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1409");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1410");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1411");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1412");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
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
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1413");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1414");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
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
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1415");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1416");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
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
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1417");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
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
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1418");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1419");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1420");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1421");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (-1));
        ds.Item item15 = ds.Max.max(itemArray1, 0);
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
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1422");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
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
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1423");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1424");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1425");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
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
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1426");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1427");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1428");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1429");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1430");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item21 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = ds.Max.max(itemArray1, (int) (short) 100);
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
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1431");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1432");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, 1);
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
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1433");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, 1);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
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
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1434");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1435");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1436");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
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
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1437");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1438");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1439");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
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
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1440");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1441");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1442");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1443");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1444");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1445");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1446");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1447");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1448");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1449");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1450");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
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
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1451");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
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
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1452");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1453");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item23 = ds.Max.max(itemArray1, 0);
        ds.Item item25 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1454");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, 1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item25 = ds.Max.max(itemArray1, (int) ' ');
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
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1455");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1456");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1457");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1458");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1459");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1460");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1461");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1462");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1463");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1464");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1465");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, 0);
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
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1466");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item25 = ds.Max.max(itemArray1, 0);
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
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1467");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
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
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1468");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
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
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1469");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, 0);
        ds.Item item21 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1470");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1471");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = ds.Max.max(itemArray0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1472");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
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
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1473");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item21 = ds.Max.max(itemArray1, 0);
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
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1474");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        ds.Item item21 = ds.Max.max(itemArray1, 1);
        ds.Item item23 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item25 = ds.Max.max(itemArray1, 0);
        ds.Item item27 = ds.Max.max(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item29 = ds.Max.max(itemArray1, (int) ' ');
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
        org.junit.Assert.assertNull(item27);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1475");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
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
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1476");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1477");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1478");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1479");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
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
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1480");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
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
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1481");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
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
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1482");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1483");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item21 = ds.Max.max(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = ds.Max.max(itemArray1, (int) (short) 10);
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
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1484");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1485");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, 0);
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
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1486");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item15 = ds.Max.max(itemArray1, 0);
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
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1487");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 0);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1488");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) -1);
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
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1489");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (-1));
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
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1490");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1491");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1492");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item13 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item19 = ds.Max.max(itemArray1, (-1));
        ds.Item item21 = ds.Max.max(itemArray1, 1);
        ds.Item item23 = ds.Max.max(itemArray1, 0);
        ds.Item item25 = ds.Max.max(itemArray1, (-1));
        ds.Item item27 = ds.Max.max(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass28 = item27.getClass();
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
        org.junit.Assert.assertNull(item27);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1493");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1494");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1495");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1496");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 1);
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
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1497");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, 0);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 1);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (byte) 0);
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
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1498");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, 0);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item11 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) 0);
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
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1499");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (short) 0);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item9 = ds.Max.max(itemArray1, 1);
        ds.Item item11 = ds.Max.max(itemArray1, (-1));
        ds.Item item13 = ds.Max.max(itemArray1, (int) (byte) 0);
        ds.Item item15 = ds.Max.max(itemArray1, (-1));
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
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
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1500");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Item item3 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item5 = ds.Max.max(itemArray1, (int) (byte) -1);
        ds.Item item7 = ds.Max.max(itemArray1, (int) (short) 1);
        ds.Item item9 = ds.Max.max(itemArray1, (int) (byte) 1);
        ds.Item item11 = ds.Max.max(itemArray1, 1);
        ds.Item item13 = ds.Max.max(itemArray1, 0);
        ds.Item item15 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item17 = ds.Max.max(itemArray1, (int) (short) -1);
        ds.Item item19 = ds.Max.max(itemArray1, (int) (byte) 1);
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
}

