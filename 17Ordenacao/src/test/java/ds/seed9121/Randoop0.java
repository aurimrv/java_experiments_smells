package ds.seed9121;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0001");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0002");
        ds.Item[] itemArray0 = new ds.Item[] {};
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0003");
        ds.Ordenacao ordenacao0 = new ds.Ordenacao();
        java.lang.Class<?> wildcardClass1 = ordenacao0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0004");
        ds.Item[] itemArray0 = new ds.Item[] {};
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0005");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0006");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0007");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0008");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0009");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0010");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0011");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0012");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0013");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0014");
        ds.Item[] itemArray0 = new ds.Item[] {};
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0015");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0016");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0017");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0018");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0019");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0020");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0021");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0022");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        java.lang.Class<?> wildcardClass3 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0023");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0024");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0025");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0026");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0027");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0028");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0029");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0030");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0031");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0032");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0033");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0034");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0035");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0036");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0037");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0038");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0039");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0040");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0041");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0042");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0043");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0044");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0045");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0046");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0047");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0048");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass5 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0049");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0050");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        java.lang.Class<?> wildcardClass11 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0051");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0052");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0053");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0054");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0055");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0056");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0057");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0058");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0059");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0060");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0061");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0062");
        ds.Item[] itemArray0 = new ds.Item[] {};
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0063");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.shellsort(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0064");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0065");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        java.lang.Class<?> wildcardClass3 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0066");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0067");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0068");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.shellsort(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0069");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0070");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0071");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0072");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0073");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0074");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass11 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0075");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0076");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0077");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0078");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0079");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0080");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0081");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0082");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0083");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0084");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0085");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0086");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0087");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0088");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0089");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0090");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0091");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0092");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0093");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0094");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        java.lang.Class<?> wildcardClass5 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0095");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0096");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0097");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0098");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0099");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0100");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0101");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, 1);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0102");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0103");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0104");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0105");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0106");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0107");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0108");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0109");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0110");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0111");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0112");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0113");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0114");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0115");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0116");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        java.lang.Class<?> wildcardClass7 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0117");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0118");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0119");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0120");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0121");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        java.lang.Class<?> wildcardClass7 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0122");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0123");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0124");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0125");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0126");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0127");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0128");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0129");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0130");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0131");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0132");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0133");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0134");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0135");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0136");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0137");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0138");
        ds.Item[] itemArray0 = null;
        ds.Ordenacao.insercao(itemArray0, 1);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0139");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0140");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0141");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0142");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0143");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0144");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0145");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0146");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0147");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0148");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0149");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0150");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0151");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0152");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.shellsort(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0153");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0154");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0155");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0156");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0157");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        java.lang.Class<?> wildcardClass5 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0158");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0159");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0160");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0161");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0162");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0163");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0164");
        ds.Item[] itemArray0 = null;
        ds.Ordenacao.selecao(itemArray0, 0);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0165");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0166");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0167");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0168");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0169");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0170");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0171");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0172");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0173");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0174");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0175");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0176");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0177");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0178");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0179");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0180");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0181");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0182");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0183");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0184");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0185");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0186");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0187");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0188");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0189");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0190");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0191");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0192");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0193");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0194");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0195");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0196");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0197");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0198");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0199");
        ds.Item[] itemArray0 = null;
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0200");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0201");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0202");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0203");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0204");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0205");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0206");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0207");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0208");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0209");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 1);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0210");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0211");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0212");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        java.lang.Class<?> wildcardClass19 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0213");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0214");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0215");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0216");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0217");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0218");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        java.lang.Class<?> wildcardClass25 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0219");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0220");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0221");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0222");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0223");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0224");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0225");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0226");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0227");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0228");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0229");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        java.lang.Class<?> wildcardClass13 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0230");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0231");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0232");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0233");
        ds.Item[] itemArray0 = null;
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0234");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0235");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        java.lang.Class<?> wildcardClass13 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0236");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0237");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0238");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0239");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0240");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0241");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0242");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0243");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0244");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0245");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0246");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass9 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0247");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0248");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0249");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0250");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0251");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0252");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0253");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0254");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0255");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0256");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0257");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0258");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0259");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0260");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0261");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        java.lang.Class<?> wildcardClass11 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0262");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0263");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0264");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0265");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0266");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0267");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0268");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0269");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0270");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0271");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0272");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0273");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (-1));
        java.lang.Class<?> wildcardClass9 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0274");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0275");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.insercao(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0276");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0277");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0278");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, 0);
        java.lang.Class<?> wildcardClass13 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0279");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0280");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0281");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0282");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0283");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0284");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0285");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0286");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0287");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0288");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0289");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0290");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0291");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0292");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0293");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0294");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0295");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0296");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass7 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0297");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0298");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0299");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0300");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0301");
        ds.Item[] itemArray0 = new ds.Item[] {};
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0302");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0303");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0304");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0305");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0306");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0307");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0308");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        java.lang.Class<?> wildcardClass19 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0309");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0310");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0311");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0312");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0313");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0314");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0315");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0316");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0317");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0318");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0319");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0320");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0321");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0322");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass9 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0323");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0324");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0325");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0326");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0327");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        java.lang.Class<?> wildcardClass11 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0328");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0329");
        ds.Item[] itemArray0 = null;
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0330");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0331");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0332");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0333");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        java.lang.Class<?> wildcardClass17 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0334");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0335");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0336");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass9 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0337");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0338");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0339");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0340");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0341");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0342");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0343");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0344");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0345");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass9 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0346");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0347");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0348");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0349");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0350");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0351");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        java.lang.Class<?> wildcardClass9 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0352");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0353");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0354");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0355");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        java.lang.Class<?> wildcardClass11 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0356");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0357");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0358");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0359");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0360");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0361");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0362");
        ds.Item[] itemArray0 = null;
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0363");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0364");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0365");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0366");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0367");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0368");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0369");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0370");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0371");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0372");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0373");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0374");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, 0);
        java.lang.Class<?> wildcardClass13 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0375");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0376");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0377");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0378");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0379");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0380");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        java.lang.Class<?> wildcardClass13 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0381");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0382");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0383");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0384");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0385");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0386");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0387");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0388");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0389");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0390");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0391");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0392");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0393");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0394");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.shellsort(itemArray1, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray1, (int) (short) 1);
        java.lang.Class<?> wildcardClass6 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0395");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0396");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0397");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0398");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0399");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0400");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0401");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0402");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0403");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0404");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0405");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0406");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        java.lang.Class<?> wildcardClass9 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0407");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0408");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0409");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0410");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0411");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0412");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0413");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0414");
        ds.Item[] itemArray0 = null;
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0415");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0416");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0417");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0418");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0419");
        ds.Item[] itemArray0 = null;
        ds.Ordenacao.insercao(itemArray0, (-1));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0420");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        java.lang.Class<?> wildcardClass11 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0421");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0422");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0423");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0424");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0425");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0426");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0427");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0428");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0429");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0430");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0431");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0432");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0433");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0434");
        ds.Item[] itemArray0 = null;
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0435");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0436");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0437");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0438");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0439");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0440");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0441");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0442");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0443");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0444");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0445");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0446");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass23 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0447");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0448");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0449");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0450");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0451");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0452");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0453");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0454");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0455");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        java.lang.Class<?> wildcardClass17 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0456");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0457");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0458");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0459");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0460");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0461");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0462");
        ds.Item[] itemArray0 = null;
        ds.Ordenacao.selecao(itemArray0, 1);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0463");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0464");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0465");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0466");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0467");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0468");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.shellsort(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0469");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0470");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0471");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0472");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0473");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0474");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0475");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass9 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0476");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0477");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0478");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0479");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        java.lang.Class<?> wildcardClass29 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0480");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0481");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0482");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0483");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0484");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0485");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0486");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0487");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0488");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0489");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0490");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0491");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0492");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0493");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.selecao(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0494");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0495");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0496");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0497");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0498");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0499");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test0500");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.shellsort(itemArray1, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}

