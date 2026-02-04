package ds.seed5503;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test001");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin2.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        java.lang.Class<?> wildcardClass3 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.copia(itemArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 0, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin3.refaz((int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) 'a', (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass4 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin5.imprime();
        fPHeapMin5.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(0, (java.lang.Object) fPHeapMin5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.imprime();
        fPHeapMin2.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin2.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass4 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        java.lang.Class<?> wildcardClass7 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        java.lang.Class<?> wildcardClass5 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.refaz((int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin7.imprime();
        fPHeapMin7.imprime();
        fPHeapMin7.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 100, (java.lang.Object) fPHeapMin7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        java.lang.Class<?> wildcardClass6 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.imprime();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(0, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        java.lang.Class<?> wildcardClass7 = itemArray3.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.refaz((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin3.diminuiChave((int) 'a', (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.refaz(0, (int) (byte) -1);
        ds.Item item5 = fPHeapMin1.min();
        ds.Item item6 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((-1), (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMin5.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        java.lang.Class<?> wildcardClass2 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        fPHeapMin4.imprime();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin4.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.refaz(0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item[] itemArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.copia(itemArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin5.imprime();
        fPHeapMin5.imprime();
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        fPHeapMin5.copia(itemArray8);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.diminuiChave((int) (short) 0, (java.lang.Object) fPHeapMin5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin3.copia(itemArray5);
        fPHeapMin1.copia(itemArray5);
        java.lang.Class<?> wildcardClass9 = itemArray5.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass6 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin4.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        fPHeapMin2.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin2.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin3.copia(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray3);
        fPHeapMin7.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMin7.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass5 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        java.lang.Class<?> wildcardClass14 = itemArray7.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        fPHeapMin4.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMin4.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        fPHeapMin2.imprime();
        java.lang.Class<?> wildcardClass9 = fPHeapMin2.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) ' ', (java.lang.Object) itemArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        fPHeapMin2.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.refaz((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin3.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) ' ', (java.lang.Object) fPHeapMin8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin11.imprime();
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin11.copia(itemArray13);
        fPHeapMin9.copia(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '4', (java.lang.Object) itemArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.imprime();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray8);
        fPHeapMin2.copia(itemArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMin2.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        java.lang.Class<?> wildcardClass6 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) -1, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        java.lang.Class<?> wildcardClass7 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        fPHeapMin2.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin2.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray5);
        java.lang.Object obj13 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin11.diminuiChave(0, obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.refaz(0, (int) (byte) -1);
        ds.Item item5 = fPHeapMin1.min();
        ds.Item item6 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin9.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        fPHeapMin9.copia(itemArray11);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(10, (java.lang.Object) itemArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin5.refaz(0, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin10.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin10.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin5.copia(itemArray12);
        fPHeapMin2.copia(itemArray12);
        ds.Item[] itemArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.copia(itemArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin2.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.refaz(0, (int) (byte) -1);
        ds.Item item5 = fPHeapMin1.min();
        ds.Item item6 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin9.imprime();
        fPHeapMin9.constroi();
        fPHeapMin9.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(1, (java.lang.Object) fPHeapMin9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin8.copia(itemArray9);
        fPHeapMin6.copia(itemArray9);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin16.imprime();
        fPHeapMin16.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin6.diminuiChave((int) 'a', (java.lang.Object) fPHeapMin16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        fPHeapMin2.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMin2.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMin6.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.imprime();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray5);
        java.lang.Class<?> wildcardClass12 = itemArray5.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin8.copia(itemArray9);
        fPHeapMin6.copia(itemArray9);
        fPHeapMin6.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = fPHeapMin6.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.constroi();
        fPHeapMin2.constroi();
        java.lang.Class<?> wildcardClass5 = fPHeapMin2.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin8.copia(itemArray9);
        fPHeapMin8.constroi();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray14);
        fPHeapMin8.copia(itemArray14);
        fPHeapMin6.copia(itemArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item22 = fPHeapMin6.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '4', (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        fPHeapMin16.imprime();
        fPHeapMin16.constroi();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray20);
        fPHeapMin16.copia(itemArray20);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray20);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((-1), (java.lang.Object) fPHeapMin26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.refaz(0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) 'a', (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray5);
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin11.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.constroi();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin8.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin3.copia(itemArray4);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMin3.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin6.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.diminuiChave((int) 'a', (java.lang.Object) fPHeapMin6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin7.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.constroi();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        java.lang.Class<?> wildcardClass10 = itemArray7.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin10.refaz((int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray4);
        fPHeapMin9.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 0, (java.lang.Object) fPHeapMin9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        fPHeapMin2.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.refaz((int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        fPHeapMin2.copia(itemArray9);
        fPHeapMin2.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = fPHeapMin2.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin11.copia(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 0, (java.lang.Object) itemArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.Item item7 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMin10.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((-1), (java.lang.Object) itemArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin4.copia(itemArray5);
        fPHeapMin4.constroi();
        fPHeapMin4.constroi();
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        fPHeapMin4.copia(itemArray10);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray14);
        fPHeapMin4.copia(itemArray14);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(10, (java.lang.Object) itemArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin8.copia(itemArray10);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray10);
        fPHeapMin6.copia(itemArray10);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray10);
        java.lang.Class<?> wildcardClass17 = fPHeapMin16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(10, (java.lang.Object) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.imprime();
        java.lang.Class<?> wildcardClass4 = fPHeapMin2.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray3);
        java.lang.Class<?> wildcardClass8 = itemArray3.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.refaz((int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        fPHeapMin2.imprime();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin11.copia(itemArray13);
        fPHeapMin2.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = fPHeapMin18.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin8.copia(itemArray9);
        fPHeapMin6.copia(itemArray9);
        fPHeapMin6.constroi();
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin17.constroi();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        fPHeapMin17.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray20);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin6.diminuiChave(10, (java.lang.Object) itemArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMin8.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        fPHeapMin7.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin7.refaz((int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin5.copia(itemArray6);
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((-1), (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin5.copia(itemArray6);
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.constroi();
        fPHeapMin2.constroi();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.diminuiChave((int) '#', obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin10.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin10.copia(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(100, (java.lang.Object) itemArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin2.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray3);
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin7.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) -1, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin5.copia(itemArray6);
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass11 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin7.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin7.imprime();
        fPHeapMin7.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin4.diminuiChave((-1), (java.lang.Object) fPHeapMin7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.imprime();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray8);
        fPHeapMin2.copia(itemArray8);
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin2.copia(itemArray6);
        java.lang.Class<?> wildcardClass11 = fPHeapMin2.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        fPHeapMin2.copia(itemArray9);
        fPHeapMin2.constroi();
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.refaz(0, (int) (byte) -1);
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin8.copia(itemArray9);
        fPHeapMin6.copia(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin6.refaz((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray3);
        java.lang.Class<?> wildcardClass9 = itemArray3.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin7.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        fPHeapMin6.constroi();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        fPHeapMin13.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin11.copia(itemArray15);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        fPHeapMin21.imprime();
        fPHeapMin21.constroi();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray25);
        fPHeapMin21.copia(itemArray25);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray25);
        fPHeapMin11.copia(itemArray25);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray34);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin37.imprime();
        ds.Item[] itemArray39 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray39);
        fPHeapMin37.copia(itemArray39);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray39);
        fPHeapMin35.copia(itemArray39);
        ds.Item[] itemArray44 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray44);
        fPHeapMin45.imprime();
        fPHeapMin45.constroi();
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray49);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray49);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray49);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray49);
        fPHeapMin45.copia(itemArray49);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray49);
        fPHeapMin35.copia(itemArray49);
        fPHeapMin11.copia(itemArray49);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin6.diminuiChave(10, (java.lang.Object) fPHeapMin11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin10.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin10.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin8.copia(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray12);
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        java.lang.Class<?> wildcardClass8 = itemArray4.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.Item item7 = fPHeapMin1.min();
        java.lang.Object obj9 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) -1, obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin3.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray3);
        fPHeapMin7.constroi();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin7.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin8.copia(itemArray9);
        fPHeapMin8.constroi();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray14);
        fPHeapMin8.copia(itemArray14);
        fPHeapMin6.copia(itemArray14);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        ds.Item[] itemArray27 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray27);
        fPHeapMin26.copia(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin6.diminuiChave((int) (byte) 100, (java.lang.Object) itemArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray5);
        fPHeapMin11.imprime();
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass5 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray5);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin14.imprime();
        fPHeapMin14.constroi();
        fPHeapMin14.imprime();
        fPHeapMin14.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin11.diminuiChave((int) (byte) 0, (java.lang.Object) fPHeapMin14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin3.copia(itemArray5);
        fPHeapMin1.copia(itemArray5);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin3.copia(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        fPHeapMin11.imprime();
        fPHeapMin11.constroi();
        fPHeapMin11.imprime();
        fPHeapMin11.imprime();
        fPHeapMin11.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 10, (java.lang.Object) fPHeapMin11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        fPHeapMin2.imprime();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin11.copia(itemArray13);
        fPHeapMin2.copia(itemArray13);
        fPHeapMin2.imprime();
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.insere(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMin6.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        fPHeapMin13.copia(itemArray14);
        fPHeapMin13.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(0, (java.lang.Object) fPHeapMin13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray4);
        java.lang.Class<?> wildcardClass9 = itemArray4.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray8);
        fPHeapMin13.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 0, (java.lang.Object) fPHeapMin13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin2.copia(itemArray6);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        fPHeapMin12.imprime();
        fPHeapMin12.constroi();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        fPHeapMin12.copia(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray16);
        fPHeapMin2.copia(itemArray16);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray29);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray29);
        fPHeapMin27.copia(itemArray29);
        fPHeapMin27.imprime();
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray38);
        fPHeapMin36.copia(itemArray38);
        fPHeapMin27.copia(itemArray38);
        fPHeapMin27.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.diminuiChave((int) (byte) 1, (java.lang.Object) fPHeapMin27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin3.copia(itemArray4);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin3.refaz((int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin6.constroi();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin6.copia(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '#', (java.lang.Object) itemArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 100, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin3.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        fPHeapMin6.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin6.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 100, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass6 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.constroi();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin7.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray3);
        java.lang.Class<?> wildcardClass8 = fPHeapMin7.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin5.copia(itemArray6);
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.imprime();
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin6.imprime();
        fPHeapMin6.imprime();
        fPHeapMin6.imprime();
        fPHeapMin6.imprime();
        fPHeapMin6.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin3.diminuiChave((int) (byte) 10, (java.lang.Object) fPHeapMin6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin9.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((-1), (java.lang.Object) fPHeapMin15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.refaz(0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMin6.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin7.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray1);
        java.lang.Class<?> wildcardClass7 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin3.copia(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        fPHeapMin9.constroi();
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray3);
        fPHeapMin8.constroi();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin8.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        fPHeapMin2.imprime();
        fPHeapMin2.imprime();
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        fPHeapMin20.copia(itemArray21);
        fPHeapMin20.constroi();
        fPHeapMin20.imprime();
        fPHeapMin20.imprime();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin30.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        fPHeapMin30.copia(itemArray32);
        fPHeapMin28.copia(itemArray32);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray32);
        fPHeapMin20.copia(itemArray32);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin17.diminuiChave(0, (java.lang.Object) itemArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray1);
        fPHeapMin6.constroi();
        fPHeapMin6.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMin6.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin3.copia(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        java.lang.Class<?> wildcardClass10 = itemArray5.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.constroi();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin8.copia(itemArray9);
        fPHeapMin6.copia(itemArray9);
        fPHeapMin6.constroi();
        fPHeapMin6.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        fPHeapMin18.imprime();
        fPHeapMin18.constroi();
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray22);
        fPHeapMin18.copia(itemArray22);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin6.diminuiChave((int) (byte) 1, (java.lang.Object) fPHeapMin18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass7 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin7.refaz(0, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin12.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        fPHeapMin12.copia(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        fPHeapMin7.copia(itemArray14);
        fPHeapMin4.copia(itemArray14);
        fPHeapMin1.copia(itemArray14);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin3.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray14);
        fPHeapMin12.copia(itemArray14);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray14);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) ' ', (java.lang.Object) fPHeapMin18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        fPHeapMin9.constroi();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin9.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin17.refaz(0, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin22.imprime();
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        fPHeapMin22.copia(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        fPHeapMin17.copia(itemArray24);
        fPHeapMin15.copia(itemArray24);
        fPHeapMin1.copia(itemArray24);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray24);
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin2.copia(itemArray6);
        fPHeapMin2.constroi();
        java.lang.Class<?> wildcardClass12 = fPHeapMin2.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin8.copia(itemArray9);
        fPHeapMin6.copia(itemArray9);
        fPHeapMin6.constroi();
        fPHeapMin6.imprime();
        fPHeapMin6.constroi();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray1);
        fPHeapMin6.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin6.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin2.copia(itemArray6);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        fPHeapMin12.imprime();
        fPHeapMin12.constroi();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        fPHeapMin12.copia(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray16);
        fPHeapMin2.copia(itemArray16);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin28.imprime();
        ds.Item[] itemArray30 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        fPHeapMin28.copia(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray30);
        fPHeapMin26.copia(itemArray30);
        ds.Item[] itemArray35 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        fPHeapMin36.imprime();
        fPHeapMin36.constroi();
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray40);
        fPHeapMin36.copia(itemArray40);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray40);
        fPHeapMin26.copia(itemArray40);
        fPHeapMin2.copia(itemArray40);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item49 = fPHeapMin2.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray5);
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin11.copia(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((-1), (java.lang.Object) itemArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.constroi();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin2.copia(itemArray5);
        fPHeapMin2.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.diminuiChave((int) 'a', (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.imprime();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray8);
        fPHeapMin2.copia(itemArray8);
        fPHeapMin2.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.refaz((int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        java.lang.Class<?> wildcardClass3 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin8.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.diminuiChave((int) (byte) 100, (java.lang.Object) fPHeapMin8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin11.imprime();
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin11.copia(itemArray13);
        fPHeapMin9.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMin6.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin5.copia(itemArray6);
        fPHeapMin5.constroi();
        fPHeapMin5.imprime();
        fPHeapMin5.constroi();
        fPHeapMin5.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '#', (java.lang.Object) fPHeapMin5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        java.lang.Class<?> wildcardClass11 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        fPHeapMin2.imprime();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin11.copia(itemArray13);
        fPHeapMin2.copia(itemArray13);
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.insere(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray7);
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin10.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        fPHeapMin5.copia(itemArray9);
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        fPHeapMin15.imprime();
        fPHeapMin15.constroi();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray19);
        fPHeapMin15.copia(itemArray19);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray19);
        fPHeapMin5.copia(itemArray19);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) -1, (java.lang.Object) itemArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin2.copia(itemArray6);
        fPHeapMin2.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMin2.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        fPHeapMin2.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.refaz(1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        fPHeapMin7.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin7.refaz((int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin7.refaz(0, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin12.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        fPHeapMin12.copia(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        fPHeapMin7.copia(itemArray14);
        fPHeapMin4.copia(itemArray14);
        fPHeapMin1.copia(itemArray14);
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.imprime();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray8);
        fPHeapMin2.copia(itemArray8);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray23 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray23);
        fPHeapMin22.copia(itemArray23);
        fPHeapMin20.copia(itemArray23);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray23);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.diminuiChave((int) (byte) -1, (java.lang.Object) itemArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray7);
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        fPHeapMin13.copia(itemArray14);
        fPHeapMin13.constroi();
        fPHeapMin13.imprime();
        fPHeapMin13.imprime();
        java.lang.Class<?> wildcardClass20 = fPHeapMin13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin10.diminuiChave(0, (java.lang.Object) wildcardClass20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        fPHeapMin7.copia(itemArray8);
        fPHeapMin7.constroi();
        fPHeapMin7.constroi();
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin7.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        fPHeapMin4.constroi();
        java.lang.Class<?> wildcardClass6 = fPHeapMin4.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray12);
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray19);
        fPHeapMin18.copia(itemArray19);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray19);
        fPHeapMin1.copia(itemArray19);
        java.lang.Class<?> wildcardClass26 = itemArray19.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        fPHeapMin2.copia(itemArray9);
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        fPHeapMin15.imprime();
        fPHeapMin15.constroi();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray19);
        fPHeapMin15.copia(itemArray19);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray19);
        fPHeapMin2.copia(itemArray19);
        ds.Item item27 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.insere(item27);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass8 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.copia(itemArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        java.lang.Class<?> wildcardClass4 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(10);
        ds.Item item6 = fPHeapMin5.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 100, (java.lang.Object) item6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray5);
        fPHeapMin11.constroi();
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin8.refaz((-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin8.copia(itemArray9);
        fPHeapMin6.copia(itemArray9);
        fPHeapMin6.constroi();
        fPHeapMin6.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = fPHeapMin6.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin2.copia(itemArray6);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        fPHeapMin12.imprime();
        fPHeapMin12.constroi();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        fPHeapMin12.copia(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray16);
        fPHeapMin2.copia(itemArray16);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin28.imprime();
        ds.Item[] itemArray30 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        fPHeapMin28.copia(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray30);
        fPHeapMin26.copia(itemArray30);
        ds.Item[] itemArray35 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        fPHeapMin36.imprime();
        fPHeapMin36.constroi();
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray40);
        fPHeapMin36.copia(itemArray40);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray40);
        fPHeapMin26.copia(itemArray40);
        fPHeapMin2.copia(itemArray40);
        ds.Item item49 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.insere(item49);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray3);
        fPHeapMin8.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMin8.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        fPHeapMin9.constroi();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin9.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin17.refaz(0, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin22.imprime();
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        fPHeapMin22.copia(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        fPHeapMin17.copia(itemArray24);
        fPHeapMin15.copia(itemArray24);
        fPHeapMin1.copia(itemArray24);
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        fPHeapMin4.constroi();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin7.imprime();
        fPHeapMin7.imprime();
        fPHeapMin7.imprime();
        fPHeapMin7.constroi();
        fPHeapMin7.constroi();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        fPHeapMin15.constroi();
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        fPHeapMin15.copia(itemArray18);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin23.refaz(0, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin28.imprime();
        ds.Item[] itemArray30 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        fPHeapMin28.copia(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray30);
        fPHeapMin23.copia(itemArray30);
        fPHeapMin21.copia(itemArray30);
        fPHeapMin7.copia(itemArray30);
        fPHeapMin4.copia(itemArray30);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin2.copia(itemArray6);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        fPHeapMin12.imprime();
        fPHeapMin12.constroi();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        fPHeapMin12.copia(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray16);
        fPHeapMin2.copia(itemArray16);
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.insere(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass5 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin5.refaz(0, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin10.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin10.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin5.copia(itemArray12);
        fPHeapMin2.copia(itemArray12);
        java.lang.Class<?> wildcardClass18 = itemArray12.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin3.copia(itemArray4);
        fPHeapMin3.constroi();
        fPHeapMin3.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin3.copia(itemArray9);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        fPHeapMin3.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass8 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) '4');
        fPHeapMin4.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 10, (java.lang.Object) fPHeapMin4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        fPHeapMin2.copia(itemArray9);
        fPHeapMin2.imprime();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
        fPHeapMin17.constroi();
        fPHeapMin17.imprime();
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray20);
        fPHeapMin17.copia(itemArray20);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.diminuiChave((int) (byte) 10, (java.lang.Object) itemArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        fPHeapMin1.constroi();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin3.copia(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin9.refaz((int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        fPHeapMin3.constroi();
        fPHeapMin3.constroi();
        java.lang.Class<?> wildcardClass6 = fPHeapMin3.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        fPHeapMin7.copia(itemArray8);
        fPHeapMin7.constroi();
        fPHeapMin7.constroi();
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin7.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray3);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin11.copia(itemArray12);
        fPHeapMin11.constroi();
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray17);
        fPHeapMin11.copia(itemArray17);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin8.diminuiChave((int) (byte) 100, (java.lang.Object) itemArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray4);
        fPHeapMin8.imprime();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        java.lang.Class<?> wildcardClass17 = itemArray11.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.refaz(0, (int) (byte) -1);
        ds.Item item5 = fPHeapMin1.min();
        ds.Item item6 = fPHeapMin1.min();
        ds.Item item7 = fPHeapMin1.min();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        fPHeapMin2.copia(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.refaz((int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin3.copia(itemArray5);
        fPHeapMin1.copia(itemArray5);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.constroi();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        fPHeapMin2.imprime();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin11.copia(itemArray13);
        fPHeapMin2.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray13);
        fPHeapMin19.constroi();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        fPHeapMin2.imprime();
        fPHeapMin2.imprime();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        fPHeapMin9.imprime();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        fPHeapMin14.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin9.copia(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.diminuiChave(0, (java.lang.Object) fPHeapMin9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin8.copia(itemArray9);
        fPHeapMin8.constroi();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray14);
        fPHeapMin8.copia(itemArray14);
        fPHeapMin6.copia(itemArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item22 = fPHeapMin6.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        fPHeapMin1.imprime();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin8.copia(itemArray10);
        fPHeapMin8.imprime();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        fPHeapMin17.copia(itemArray19);
        fPHeapMin8.copia(itemArray19);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray19);
        fPHeapMin1.copia(itemArray19);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin5.copia(itemArray6);
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) '#', (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin7.refaz(0, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin12.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        fPHeapMin12.copia(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        fPHeapMin7.copia(itemArray14);
        fPHeapMin4.copia(itemArray14);
        fPHeapMin1.copia(itemArray14);
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        fPHeapMin2.imprime();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin11.copia(itemArray13);
        fPHeapMin2.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray13);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray3);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin11.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin7.copia(itemArray12);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(1, obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray11);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        fPHeapMin20.copia(itemArray27);
        fPHeapMin17.copia(itemArray27);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item33 = fPHeapMin17.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray4);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin8.refaz((int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin2.copia(itemArray6);
        fPHeapMin2.constroi();
        fPHeapMin2.imprime();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin3.copia(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        fPHeapMin11.imprime();
        fPHeapMin11.constroi();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray15);
        fPHeapMin11.copia(itemArray15);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray15);
        fPHeapMin9.copia(itemArray15);
        ds.Item[] itemArray23 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin9.copia(itemArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        fPHeapMin7.constroi();
        fPHeapMin7.imprime();
        fPHeapMin7.imprime();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.constroi();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin2.copia(itemArray5);
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.diminuiChave(1, obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.imprime();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass12 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin3.copia(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        fPHeapMin9.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin9.refaz((int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        fPHeapMin2.copia(itemArray9);
        fPHeapMin2.constroi();
        fPHeapMin2.constroi();
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.constroi();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray8);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 100, (java.lang.Object) fPHeapMin12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 1, (java.lang.Object) fPHeapMin5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin8.copia(itemArray10);
        fPHeapMin8.imprime();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        fPHeapMin17.copia(itemArray19);
        fPHeapMin8.copia(itemArray19);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray19);
        fPHeapMin1.copia(itemArray19);
        java.lang.Class<?> wildcardClass26 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        fPHeapMin9.constroi();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin9.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin17.refaz(0, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin22.imprime();
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        fPHeapMin22.copia(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        fPHeapMin17.copia(itemArray24);
        fPHeapMin15.copia(itemArray24);
        fPHeapMin1.copia(itemArray24);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item31 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) '4', 1);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin9.refaz(0, (int) (byte) -1);
        ds.Item item13 = fPHeapMin9.min();
        ds.Item item14 = fPHeapMin9.min();
        ds.Item item15 = fPHeapMin9.min();
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray25);
        fPHeapMin24.copia(itemArray25);
        fPHeapMin22.copia(itemArray25);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray25);
        fPHeapMin9.copia(itemArray25);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin35.imprime();
        ds.Item[] itemArray37 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray37);
        fPHeapMin35.copia(itemArray37);
        fPHeapMin33.copia(itemArray37);
        fPHeapMin9.copia(itemArray37);
        fPHeapMin1.copia(itemArray37);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.imprime();
        fPHeapMin2.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '4');
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin10.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin13.refaz(0, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin18.imprime();
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        fPHeapMin18.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray20);
        fPHeapMin13.copia(itemArray20);
        fPHeapMin10.copia(itemArray20);
        fPHeapMin7.copia(itemArray20);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.diminuiChave(100, (java.lang.Object) itemArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.refaz(0, (int) (byte) -1);
        ds.Item item5 = fPHeapMin1.min();
        ds.Item item6 = fPHeapMin1.min();
        ds.Item item7 = fPHeapMin1.min();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray17 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        fPHeapMin16.copia(itemArray17);
        fPHeapMin14.copia(itemArray17);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray17);
        fPHeapMin1.copia(itemArray17);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin3.copia(itemArray5);
        fPHeapMin1.copia(itemArray5);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin2.copia(itemArray6);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        fPHeapMin12.imprime();
        fPHeapMin12.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        fPHeapMin12.copia(itemArray15);
        fPHeapMin2.copia(itemArray15);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        fPHeapMin22.copia(itemArray24);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray29);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray29);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray29);
        fPHeapMin22.copia(itemArray29);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.diminuiChave((int) (short) 0, (java.lang.Object) fPHeapMin22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.refaz(0, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin6.imprime();
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        fPHeapMin2.copia(itemArray9);
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        fPHeapMin15.imprime();
        fPHeapMin15.constroi();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray19);
        fPHeapMin15.copia(itemArray19);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray19);
        fPHeapMin2.copia(itemArray19);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray19);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item28 = fPHeapMin27.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin4.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin4.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin15.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        fPHeapMin15.copia(itemArray17);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray17);
        fPHeapMin13.copia(itemArray17);
        fPHeapMin1.copia(itemArray17);
        fPHeapMin1.imprime();
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        fPHeapMin1.copia(itemArray24);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        fPHeapMin7.copia(itemArray8);
        fPHeapMin7.constroi();
        fPHeapMin7.constroi();
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin7.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin2.copia(itemArray6);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        fPHeapMin12.imprime();
        fPHeapMin12.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        fPHeapMin12.copia(itemArray15);
        fPHeapMin2.copia(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray15);
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin20.insere(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray8);
        fPHeapMin4.copia(itemArray8);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray8);
        java.lang.Class<?> wildcardClass15 = fPHeapMin14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '#', (java.lang.Object) fPHeapMin14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        fPHeapMin3.constroi();
        fPHeapMin3.constroi();
        fPHeapMin3.imprime();
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        java.lang.Class<?> wildcardClass7 = itemArray3.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.refaz(0, (int) (byte) -1);
        ds.Item item5 = fPHeapMin1.min();
        ds.Item item6 = fPHeapMin1.min();
        ds.Item item7 = fPHeapMin1.min();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray17 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        fPHeapMin16.copia(itemArray17);
        fPHeapMin14.copia(itemArray17);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray17);
        fPHeapMin1.copia(itemArray17);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin27.imprime();
        ds.Item[] itemArray29 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray29);
        fPHeapMin27.copia(itemArray29);
        fPHeapMin25.copia(itemArray29);
        fPHeapMin1.copia(itemArray29);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray44 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray44);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray44);
        fPHeapMin43.copia(itemArray44);
        fPHeapMin41.copia(itemArray44);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '4', (java.lang.Object) fPHeapMin41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin8.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        fPHeapMin11.constroi();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        fPHeapMin11.copia(itemArray14);
        fPHeapMin8.copia(itemArray14);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin22.imprime();
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        fPHeapMin22.copia(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        fPHeapMin20.copia(itemArray24);
        fPHeapMin8.copia(itemArray24);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray24);
        fPHeapMin6.copia(itemArray24);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item32 = fPHeapMin6.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin3.copia(itemArray4);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMin3.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray4);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMin8.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray5);
        fPHeapMin11.imprime();
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin11.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin2.copia(itemArray6);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        fPHeapMin12.imprime();
        fPHeapMin12.constroi();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        fPHeapMin12.copia(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray16);
        fPHeapMin2.copia(itemArray16);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray16);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        fPHeapMin9.copia(itemArray10);
        fPHeapMin9.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 1, (java.lang.Object) fPHeapMin9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray3);
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin8.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        fPHeapMin2.imprime();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin11.copia(itemArray13);
        fPHeapMin2.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray13);
        fPHeapMin18.constroi();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.constroi();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin2.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin10.refaz(0, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin15.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        fPHeapMin15.copia(itemArray17);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray17);
        fPHeapMin10.copia(itemArray17);
        fPHeapMin8.copia(itemArray17);
        java.lang.Class<?> wildcardClass23 = fPHeapMin8.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin10.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin10.copia(itemArray12);
        fPHeapMin8.copia(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.Item[] itemArray17 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        fPHeapMin18.imprime();
        fPHeapMin18.constroi();
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray22);
        fPHeapMin18.copia(itemArray22);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray22);
        fPHeapMin16.copia(itemArray22);
        fPHeapMin1.copia(itemArray22);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item31 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray1);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        fPHeapMin9.copia(itemArray10);
        fPHeapMin9.constroi();
        fPHeapMin9.constroi();
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        fPHeapMin9.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin7.copia(itemArray15);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 0);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.constroi();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray9);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray16);
        fPHeapMin7.copia(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin7.refaz((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.constroi();
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        fPHeapMin12.imprime();
        fPHeapMin12.imprime();
        fPHeapMin12.imprime();
        fPHeapMin12.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        fPHeapMin18.copia(itemArray19);
        fPHeapMin18.constroi();
        fPHeapMin18.constroi();
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        fPHeapMin18.copia(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        fPHeapMin12.copia(itemArray24);
        ds.Item[] itemArray29 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray29);
        fPHeapMin30.imprime();
        fPHeapMin30.imprime();
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin36.imprime();
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray39);
        fPHeapMin36.copia(itemArray39);
        fPHeapMin34.copia(itemArray39);
        fPHeapMin30.copia(itemArray39);
        fPHeapMin12.copia(itemArray39);
        fPHeapMin1.copia(itemArray39);
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.constroi();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin2.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin10.refaz(0, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin15.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        fPHeapMin15.copia(itemArray17);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray17);
        fPHeapMin10.copia(itemArray17);
        fPHeapMin8.copia(itemArray17);
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin8.insere(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        fPHeapMin2.copia(itemArray9);
        fPHeapMin2.constroi();
        fPHeapMin2.constroi();
        fPHeapMin2.constroi();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.refaz(0, (int) (byte) -1);
        ds.Item item5 = fPHeapMin1.min();
        ds.Item item6 = fPHeapMin1.min();
        ds.Item item7 = fPHeapMin1.min();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray17 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        fPHeapMin16.copia(itemArray17);
        fPHeapMin14.copia(itemArray17);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray17);
        fPHeapMin1.copia(itemArray17);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin27.imprime();
        ds.Item[] itemArray29 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray29);
        fPHeapMin27.copia(itemArray29);
        fPHeapMin25.copia(itemArray29);
        fPHeapMin1.copia(itemArray29);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray37);
        ds.Item[] itemArray40 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray40);
        fPHeapMin39.copia(itemArray40);
        fPHeapMin35.copia(itemArray40);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray40);
        fPHeapMin1.copia(itemArray40);
        java.lang.Class<?> wildcardClass46 = itemArray40.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin8.copia(itemArray10);
        fPHeapMin8.imprime();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        fPHeapMin17.copia(itemArray19);
        fPHeapMin8.copia(itemArray19);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray19);
        fPHeapMin1.copia(itemArray19);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item26 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((-1));
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((-1), (java.lang.Object) fPHeapMin13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin10.imprime();
        fPHeapMin10.imprime();
        fPHeapMin10.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 10, (java.lang.Object) fPHeapMin10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray5);
        fPHeapMin11.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMin11.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin7.refaz(0, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin12.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        fPHeapMin12.copia(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        fPHeapMin7.copia(itemArray14);
        fPHeapMin4.copia(itemArray14);
        fPHeapMin1.copia(itemArray14);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        fPHeapMin23.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) -1, (java.lang.Object) fPHeapMin23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin5.copia(itemArray6);
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 100, 0);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.imprime();
        fPHeapMin2.imprime();
        fPHeapMin2.constroi();
        java.lang.Class<?> wildcardClass6 = fPHeapMin2.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin2.copia(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMin11.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.imprime();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.Item item11 = fPHeapMin1.min();
        java.lang.Class<?> wildcardClass12 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin2.copia(itemArray6);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        fPHeapMin12.imprime();
        fPHeapMin12.constroi();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        fPHeapMin12.copia(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray16);
        fPHeapMin2.copia(itemArray16);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin28.imprime();
        ds.Item[] itemArray30 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        fPHeapMin28.copia(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray30);
        fPHeapMin26.copia(itemArray30);
        ds.Item[] itemArray35 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        fPHeapMin36.imprime();
        fPHeapMin36.constroi();
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray40);
        fPHeapMin36.copia(itemArray40);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray40);
        fPHeapMin26.copia(itemArray40);
        fPHeapMin2.copia(itemArray40);
        ds.Item[] itemArray50 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray50);
        fPHeapMin51.constroi();
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray54);
        fPHeapMin51.copia(itemArray54);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray54);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray59);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(itemArray59);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray59);
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(itemArray59);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray59);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray59);
        ds.Item[] itemArray66 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray66);
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(itemArray66);
        ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin(itemArray66);
        fPHeapMin65.copia(itemArray66);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(itemArray66);
        fPHeapMin57.copia(itemArray66);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.diminuiChave((int) (short) 1, (java.lang.Object) fPHeapMin57);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray66);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        fPHeapMin2.imprime();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin11.copia(itemArray13);
        fPHeapMin2.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray13);
        fPHeapMin18.imprime();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.imprime();
        fPHeapMin2.imprime();
        fPHeapMin2.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMin2.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray1);
        fPHeapMin6.constroi();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        fPHeapMin10.copia(itemArray12);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray17);
        fPHeapMin10.copia(itemArray17);
        fPHeapMin10.imprime();
        fPHeapMin10.imprime();
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        fPHeapMin25.copia(itemArray26);
        fPHeapMin25.constroi();
        fPHeapMin25.constroi();
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        fPHeapMin25.copia(itemArray31);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray31);
        fPHeapMin10.copia(itemArray31);
        fPHeapMin6.copia(itemArray31);
        fPHeapMin6.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin6.refaz((int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.imprime();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin12.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        fPHeapMin12.copia(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        fPHeapMin19.copia(itemArray20);
        fPHeapMin19.constroi();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray25);
        fPHeapMin19.copia(itemArray25);
        fPHeapMin17.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.refaz(0, (int) (byte) -1);
        ds.Item item5 = fPHeapMin1.min();
        ds.Item item6 = fPHeapMin1.min();
        ds.Item item7 = fPHeapMin1.min();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray17 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        fPHeapMin16.copia(itemArray17);
        fPHeapMin14.copia(itemArray17);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray17);
        fPHeapMin1.copia(itemArray17);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin27.imprime();
        ds.Item[] itemArray29 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray29);
        fPHeapMin27.copia(itemArray29);
        fPHeapMin25.copia(itemArray29);
        fPHeapMin1.copia(itemArray29);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray37);
        ds.Item[] itemArray40 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray40);
        fPHeapMin39.copia(itemArray40);
        fPHeapMin35.copia(itemArray40);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray40);
        fPHeapMin1.copia(itemArray40);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray47);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray47);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray47);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray47);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray47);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray55 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray55);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray55);
        fPHeapMin54.copia(itemArray55);
        fPHeapMin52.copia(itemArray55);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray55);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(itemArray55);
        fPHeapMin1.copia(itemArray55);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray55);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.constroi();
        fPHeapMin2.constroi();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        fPHeapMin7.copia(itemArray8);
        fPHeapMin7.constroi();
        java.lang.Class<?> wildcardClass12 = fPHeapMin7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.diminuiChave((int) (byte) 100, (java.lang.Object) fPHeapMin7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        fPHeapMin6.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass7 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        fPHeapMin6.constroi();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin12.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        fPHeapMin12.copia(itemArray14);
        fPHeapMin10.copia(itemArray14);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray14);
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        fPHeapMin20.imprime();
        fPHeapMin20.constroi();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray24);
        fPHeapMin20.copia(itemArray24);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray24);
        fPHeapMin18.copia(itemArray24);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin6.diminuiChave((int) 'a', (java.lang.Object) itemArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin5.copia(itemArray6);
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 100, 0);
        ds.Item item14 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin3.copia(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray5);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin10.refaz(0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.imprime();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        fPHeapMin5.copia(itemArray7);
        fPHeapMin5.imprime();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin14.copia(itemArray16);
        fPHeapMin5.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.Item item22 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item22);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        fPHeapMin2.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin10.refaz(0, (int) (byte) -1);
        ds.Item item14 = fPHeapMin10.min();
        ds.Item item15 = fPHeapMin10.min();
        ds.Item item16 = fPHeapMin10.min();
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin25.copia(itemArray26);
        fPHeapMin23.copia(itemArray26);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray26);
        fPHeapMin10.copia(itemArray26);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin36.imprime();
        ds.Item[] itemArray38 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray38);
        fPHeapMin36.copia(itemArray38);
        fPHeapMin34.copia(itemArray38);
        fPHeapMin10.copia(itemArray38);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray46);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray46);
        ds.Item[] itemArray49 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray49);
        fPHeapMin48.copia(itemArray49);
        fPHeapMin44.copia(itemArray49);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray49);
        fPHeapMin10.copia(itemArray49);
        fPHeapMin2.copia(itemArray49);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) '4', (int) 'a');
        fPHeapMin1.constroi();
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin8.copia(itemArray9);
        fPHeapMin6.copia(itemArray9);
        fPHeapMin6.constroi();
        fPHeapMin6.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin6.copia(itemArray16);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.constroi();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin2.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin10.refaz(0, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin15.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        fPHeapMin15.copia(itemArray17);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray17);
        fPHeapMin10.copia(itemArray17);
        fPHeapMin8.copia(itemArray17);
        fPHeapMin8.refaz((int) (byte) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item26 = fPHeapMin8.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin5.copia(itemArray6);
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.imprime();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin19.copia(itemArray20);
        fPHeapMin17.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        fPHeapMin1.refaz((int) '#', (int) (short) 0);
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        fPHeapMin7.constroi();
        fPHeapMin7.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMin7.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin2.copia(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        fPHeapMin11.imprime();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.refaz(0, (int) (byte) -1);
        ds.Item item5 = fPHeapMin1.min();
        ds.Item item6 = fPHeapMin1.min();
        ds.Item item7 = fPHeapMin1.min();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray17 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        fPHeapMin16.copia(itemArray17);
        fPHeapMin14.copia(itemArray17);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray17);
        fPHeapMin1.copia(itemArray17);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin27.imprime();
        ds.Item[] itemArray29 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray29);
        fPHeapMin27.copia(itemArray29);
        fPHeapMin25.copia(itemArray29);
        fPHeapMin1.copia(itemArray29);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray37);
        ds.Item[] itemArray40 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray40);
        fPHeapMin39.copia(itemArray40);
        fPHeapMin35.copia(itemArray40);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray40);
        fPHeapMin1.copia(itemArray40);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray47);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray47);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray47);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray47);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray47);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray55 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray55);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray55);
        fPHeapMin54.copia(itemArray55);
        fPHeapMin52.copia(itemArray55);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray55);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(itemArray55);
        fPHeapMin1.copia(itemArray55);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item63 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray55);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass8 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item4 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin8.copia(itemArray9);
        fPHeapMin6.copia(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray9);
        fPHeapMin14.imprime();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin3.copia(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray5);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMin10.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.imprime();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray1);
        fPHeapMin6.constroi();
        fPHeapMin6.imprime();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        fPHeapMin11.constroi();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        fPHeapMin11.copia(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        fPHeapMin6.copia(itemArray14);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item20 = fPHeapMin19.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) '4', (int) ' ');
        ds.Item item6 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin11.imprime();
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin11.copia(itemArray13);
        fPHeapMin9.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin2.copia(itemArray6);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        fPHeapMin12.imprime();
        fPHeapMin12.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        fPHeapMin12.copia(itemArray15);
        fPHeapMin2.copia(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin19.refaz((int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin5.copia(itemArray6);
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.imprime();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin19.copia(itemArray20);
        fPHeapMin17.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin7.refaz(0, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin12.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        fPHeapMin12.copia(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        fPHeapMin7.copia(itemArray14);
        fPHeapMin4.copia(itemArray14);
        fPHeapMin1.copia(itemArray14);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item22 = fPHeapMin21.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin9.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        fPHeapMin9.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin7.copia(itemArray11);
        java.lang.Class<?> wildcardClass16 = itemArray11.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.constroi();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin2.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin10.refaz(0, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin15.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        fPHeapMin15.copia(itemArray17);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray17);
        fPHeapMin10.copia(itemArray17);
        fPHeapMin8.copia(itemArray17);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        fPHeapMin25.imprime();
        fPHeapMin25.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        fPHeapMin25.copia(itemArray28);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin8.diminuiChave(10, (java.lang.Object) itemArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        fPHeapMin2.imprime();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray5);
        fPHeapMin10.constroi();
        fPHeapMin10.imprime();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        fPHeapMin15.constroi();
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        fPHeapMin15.copia(itemArray18);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray18);
        fPHeapMin10.copia(itemArray18);
        fPHeapMin2.copia(itemArray18);
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        fPHeapMin26.imprime();
        java.lang.Class<?> wildcardClass28 = fPHeapMin26.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.diminuiChave((int) ' ', (java.lang.Object) wildcardClass28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin7.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.imprime();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass4 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray3);
        fPHeapMin8.constroi();
        fPHeapMin8.constroi();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin15.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        fPHeapMin15.copia(itemArray17);
        fPHeapMin13.copia(itemArray17);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin8.diminuiChave(1, (java.lang.Object) itemArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin5.copia(itemArray6);
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.imprime();
        ds.Item item11 = fPHeapMin1.min();
        java.lang.Class<?> wildcardClass12 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass4 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin14.copia(itemArray16);
        fPHeapMin12.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        fPHeapMin7.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin7.refaz((int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.Item item9 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        fPHeapMin9.constroi();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin9.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin17.refaz(0, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin22.imprime();
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        fPHeapMin22.copia(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        fPHeapMin17.copia(itemArray24);
        fPHeapMin15.copia(itemArray24);
        fPHeapMin1.copia(itemArray24);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) ' ', (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.refaz(0, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin6.imprime();
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        fPHeapMin2.imprime();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin11.copia(itemArray13);
        fPHeapMin2.copia(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMin2.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray1);
        fPHeapMin6.refaz(0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.imprime();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin11.copia(itemArray13);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray18);
        fPHeapMin11.copia(itemArray18);
        ds.Item[] itemArray23 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray23);
        fPHeapMin24.imprime();
        fPHeapMin24.constroi();
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray28);
        fPHeapMin24.copia(itemArray28);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray28);
        fPHeapMin11.copia(itemArray28);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray28);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(10, (java.lang.Object) fPHeapMin36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin8.copia(itemArray9);
        fPHeapMin6.copia(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin6.refaz((int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) '4', 1);
        fPHeapMin1.constroi();
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.refaz(0, (int) (byte) -1);
        ds.Item item5 = fPHeapMin1.min();
        ds.Item item6 = fPHeapMin1.min();
        ds.Item item7 = fPHeapMin1.min();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray17 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        fPHeapMin16.copia(itemArray17);
        fPHeapMin14.copia(itemArray17);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray17);
        fPHeapMin1.copia(itemArray17);
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.refaz(0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        fPHeapMin2.copia(itemArray9);
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        fPHeapMin15.imprime();
        fPHeapMin15.constroi();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray19);
        fPHeapMin15.copia(itemArray19);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray19);
        fPHeapMin2.copia(itemArray19);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.refaz((int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.imprime();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        java.lang.Class<?> wildcardClass11 = itemArray4.getClass();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin3.copia(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        fPHeapMin11.imprime();
        fPHeapMin11.constroi();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray15);
        fPHeapMin11.copia(itemArray15);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray15);
        fPHeapMin9.copia(itemArray15);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray15);
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin23.insere(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.imprime();
        fPHeapMin2.imprime();
        fPHeapMin2.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray9);
        fPHeapMin2.copia(itemArray9);
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin7.refaz(0, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin12.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        fPHeapMin12.copia(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        fPHeapMin7.copia(itemArray14);
        fPHeapMin4.copia(itemArray14);
        fPHeapMin1.copia(itemArray14);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray14);
        java.lang.Class<?> wildcardClass22 = itemArray14.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin7.imprime();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray10);
        fPHeapMin7.copia(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin9.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        fPHeapMin9.copia(itemArray11);
        fPHeapMin7.copia(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 0, (java.lang.Object) itemArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        fPHeapMin2.copia(itemArray6);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMin2.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.imprime();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin6.constroi();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin6.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 1, (java.lang.Object) itemArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin9.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        fPHeapMin9.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin7.copia(itemArray11);
        fPHeapMin7.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = fPHeapMin7.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.imprime();
        fPHeapMin2.imprime();
        fPHeapMin2.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray9);
        fPHeapMin2.copia(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = fPHeapMin2.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        fPHeapMin2.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.refaz((int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin9.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        fPHeapMin9.copia(itemArray11);
        fPHeapMin7.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin17.imprime();
        fPHeapMin17.constroi();
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray21);
        fPHeapMin17.copia(itemArray21);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray21);
        fPHeapMin15.copia(itemArray21);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray21);
        fPHeapMin5.copia(itemArray21);
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.constroi();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray12);
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray19);
        fPHeapMin18.copia(itemArray19);
        fPHeapMin1.copia(itemArray19);
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin8.copia(itemArray10);
        fPHeapMin8.imprime();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        fPHeapMin17.copia(itemArray19);
        fPHeapMin8.copia(itemArray19);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray19);
        fPHeapMin1.copia(itemArray19);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
        fPHeapMin28.constroi();
        fPHeapMin28.imprime();
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray31);
        fPHeapMin28.copia(itemArray31);
        fPHeapMin1.copia(itemArray31);
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin4.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin4.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin14.copia(itemArray16);
        fPHeapMin12.copia(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        fPHeapMin22.imprime();
        fPHeapMin22.constroi();
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        fPHeapMin22.copia(itemArray26);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray26);
        fPHeapMin20.copia(itemArray26);
        fPHeapMin1.copia(itemArray26);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray40);
        fPHeapMin38.copia(itemArray40);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray40);
        fPHeapMin36.copia(itemArray40);
        fPHeapMin1.copia(itemArray40);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray3);
        fPHeapMin7.constroi();
        fPHeapMin7.constroi();
        fPHeapMin7.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test479");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin8.copia(itemArray9);
        fPHeapMin8.constroi();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray14);
        fPHeapMin8.copia(itemArray14);
        fPHeapMin6.copia(itemArray14);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray14);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test480");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin5.copia(itemArray6);
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.imprime();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin19.copia(itemArray20);
        fPHeapMin17.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        fPHeapMin1.refaz((int) '#', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test481");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin6.copia(itemArray7);
        fPHeapMin6.constroi();
        fPHeapMin6.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin6.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test482");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin7.refaz(0, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin12.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        fPHeapMin12.copia(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        fPHeapMin7.copia(itemArray14);
        fPHeapMin4.copia(itemArray14);
        fPHeapMin1.copia(itemArray14);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin22.imprime();
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        fPHeapMin22.copia(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        fPHeapMin1.copia(itemArray24);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray38 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray38);
        fPHeapMin37.copia(itemArray38);
        fPHeapMin35.copia(itemArray38);
        ds.Item[] itemArray43 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray43);
        fPHeapMin44.imprime();
        fPHeapMin44.constroi();
        fPHeapMin44.imprime();
        fPHeapMin44.imprime();
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray50);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray53);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray53);
        fPHeapMin51.copia(itemArray53);
        fPHeapMin51.imprime();
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray59);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(itemArray62);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray62);
        fPHeapMin60.copia(itemArray62);
        fPHeapMin51.copia(itemArray62);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray62);
        fPHeapMin44.copia(itemArray62);
        fPHeapMin35.copia(itemArray62);
        fPHeapMin1.copia(itemArray62);
        ds.Item item72 = null;
        ds.Item[] itemArray73 = new ds.Item[] { item72 };
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin(itemArray73);
        ds.FPHeapMin fPHeapMin75 = new ds.FPHeapMin(itemArray73);
        ds.FPHeapMin fPHeapMin76 = new ds.FPHeapMin(itemArray73);
        ds.FPHeapMin fPHeapMin77 = new ds.FPHeapMin(itemArray73);
        ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin(itemArray73);
        ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray81 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin82 = new ds.FPHeapMin(itemArray81);
        ds.FPHeapMin fPHeapMin83 = new ds.FPHeapMin(itemArray81);
        fPHeapMin80.copia(itemArray81);
        fPHeapMin78.copia(itemArray81);
        fPHeapMin78.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '#', (java.lang.Object) fPHeapMin78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertNotNull(itemArray81);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test483");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.Item[] itemArray17 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        fPHeapMin18.copia(itemArray19);
        fPHeapMin18.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray23);
        fPHeapMin24.constroi();
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray27);
        fPHeapMin24.copia(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test484");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin5.copia(itemArray6);
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.imprime();
        ds.Item item11 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test485");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test486");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray1);
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray4);
        fPHeapMin8.imprime();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test487");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray11);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        fPHeapMin20.copia(itemArray27);
        fPHeapMin17.copia(itemArray27);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin17.refaz((int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test488");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.constroi();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin2.copia(itemArray5);
        java.lang.Class<?> wildcardClass8 = itemArray5.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test489");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        fPHeapMin12.imprime();
        fPHeapMin12.imprime();
        fPHeapMin12.imprime();
        fPHeapMin12.imprime();
        fPHeapMin12.constroi();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin21.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray23);
        fPHeapMin21.copia(itemArray23);
        fPHeapMin19.copia(itemArray23);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray23);
        ds.Item[] itemArray28 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        fPHeapMin29.imprime();
        fPHeapMin29.constroi();
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray33);
        fPHeapMin29.copia(itemArray33);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray33);
        fPHeapMin27.copia(itemArray33);
        fPHeapMin12.copia(itemArray33);
        fPHeapMin1.copia(itemArray33);
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test490");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin3.imprime();
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        fPHeapMin3.copia(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test491");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin5.copia(itemArray6);
        fPHeapMin1.copia(itemArray6);
        fPHeapMin1.imprime();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin19.copia(itemArray20);
        fPHeapMin17.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        fPHeapMin1.refaz((int) '#', (int) (short) 0);
        ds.Item item29 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test492");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.refaz((int) '#', 0);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test493");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        fPHeapMin7.copia(itemArray8);
        fPHeapMin7.constroi();
        fPHeapMin7.constroi();
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin7.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        fPHeapMin19.imprime();
        fPHeapMin19.imprime();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin25.imprime();
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray28);
        fPHeapMin25.copia(itemArray28);
        fPHeapMin23.copia(itemArray28);
        fPHeapMin19.copia(itemArray28);
        fPHeapMin1.copia(itemArray28);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray40);
        ds.Item[] itemArray43 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray43);
        fPHeapMin42.copia(itemArray43);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray43);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin48.imprime();
        ds.Item[] itemArray50 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray50);
        fPHeapMin48.copia(itemArray50);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray50);
        fPHeapMin46.copia(itemArray50);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(1, (java.lang.Object) itemArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test494");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin2.copia(itemArray4);
        fPHeapMin2.imprime();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin11.copia(itemArray13);
        fPHeapMin2.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin19.refaz((int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test495");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.refaz(0, (int) (byte) -1);
        ds.Item item5 = fPHeapMin1.min();
        ds.Item item6 = fPHeapMin1.min();
        ds.Item item7 = fPHeapMin1.min();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray17 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        fPHeapMin16.copia(itemArray17);
        fPHeapMin14.copia(itemArray17);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray17);
        fPHeapMin1.copia(itemArray17);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin27.imprime();
        ds.Item[] itemArray29 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray29);
        fPHeapMin27.copia(itemArray29);
        fPHeapMin25.copia(itemArray29);
        fPHeapMin1.copia(itemArray29);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray37);
        ds.Item[] itemArray40 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray40);
        fPHeapMin39.copia(itemArray40);
        fPHeapMin35.copia(itemArray40);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray40);
        fPHeapMin1.copia(itemArray40);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray47);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray47);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray47);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray47);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray47);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray55 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray55);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray55);
        fPHeapMin54.copia(itemArray55);
        fPHeapMin52.copia(itemArray55);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray55);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(itemArray55);
        fPHeapMin1.copia(itemArray55);
        java.lang.Class<?> wildcardClass63 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test496");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin1.copia(itemArray3);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test497");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.refaz(0, (int) (byte) -1);
        ds.Item item5 = fPHeapMin1.min();
        ds.Item item6 = fPHeapMin1.min();
        ds.Item item7 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test498");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        fPHeapMin3.copia(itemArray5);
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        fPHeapMin9.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMin9.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test499");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin7.refaz(0, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin12.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        fPHeapMin12.copia(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        fPHeapMin7.copia(itemArray14);
        fPHeapMin4.copia(itemArray14);
        fPHeapMin1.copia(itemArray14);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin22.imprime();
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        fPHeapMin22.copia(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        fPHeapMin1.copia(itemArray24);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin((int) (short) -1);
        ds.Item[] itemArray38 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray38);
        fPHeapMin37.copia(itemArray38);
        fPHeapMin35.copia(itemArray38);
        ds.Item[] itemArray43 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray43);
        fPHeapMin44.imprime();
        fPHeapMin44.constroi();
        fPHeapMin44.imprime();
        fPHeapMin44.imprime();
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray50);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray53);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray53);
        fPHeapMin51.copia(itemArray53);
        fPHeapMin51.imprime();
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray59);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(itemArray62);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray62);
        fPHeapMin60.copia(itemArray62);
        fPHeapMin51.copia(itemArray62);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray62);
        fPHeapMin44.copia(itemArray62);
        fPHeapMin35.copia(itemArray62);
        fPHeapMin1.copia(itemArray62);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item71 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray62);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test500");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
    }
}

