package ds.seed1448;

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
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        java.lang.Class<?> wildcardClass5 = itemArray3.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        java.lang.Class<?> wildcardClass5 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass6 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        fPHeapMax1.imprime();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        java.lang.Class<?> wildcardClass12 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        java.lang.Object obj31 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, obj31);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        java.lang.Object obj19 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        ds.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax4.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax31.constroi();
        ds.Item item33 = fPHeapMax31.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) item33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item33);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = item4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item31 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        java.lang.Class<?> wildcardClass5 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = item17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) fPHeapMax19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.imprime();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) fPHeapMax20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax20.refaz((int) '4', 0);
        fPHeapMax20.imprime();
        fPHeapMax20.refaz((int) (byte) 100, 0);
        fPHeapMax20.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        fPHeapMax1.constroi();
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass4 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.constroi();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        fPHeapMax5.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass20 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        java.lang.Class<?> wildcardClass25 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        java.lang.Class<?> wildcardClass27 = itemArray23.getClass();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax4.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax31.imprime();
        fPHeapMax31.refaz(1, (int) (short) 0);
        ds.Item item36 = fPHeapMax31.max();
        fPHeapMax31.imprime();
        fPHeapMax31.constroi();
        ds.Item item39 = fPHeapMax31.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) fPHeapMax31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item39);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item30 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray31 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, 10);
        java.lang.Class<?> wildcardClass34 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        java.lang.Class<?> wildcardClass23 = itemArray19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) wildcardClass23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        java.lang.Class<?> wildcardClass14 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray20);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax23.copia(itemArray31);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray34);
        fPHeapMax9.copia(itemArray34);
        fPHeapMax9.imprime();
        java.lang.Class<?> wildcardClass38 = fPHeapMax9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) wildcardClass38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = item9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 0);
        ds.Item[] itemArray30 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax10.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        ds.Item item36 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.imprime();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) fPHeapMax33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 0);
        ds.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax17.refaz((int) '4', 0);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        fPHeapMax11.copia(itemArray25);
        fPHeapMax11.imprime();
        ds.Item item30 = fPHeapMax11.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) fPHeapMax11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item30);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.Item item34 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        ds.Item item20 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        ds.Item item20 = fPHeapMax1.max();
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax4.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        java.lang.Class<?> wildcardClass18 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.refaz((int) (byte) 10, (-1));
        java.lang.Class<?> wildcardClass27 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax32.copia(itemArray40);
        fPHeapMax20.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        ds.Item item45 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        ds.Item item20 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax29.copia(itemArray34);
        fPHeapMax25.copia(itemArray34);
        fPHeapMax23.copia(itemArray34);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass18 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        java.lang.Class<?> wildcardClass17 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.refaz((int) '4', 0);
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        java.lang.Class<?> wildcardClass20 = fPHeapMax9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) wildcardClass20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.Item item14 = fPHeapMax1.max();
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item15 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        java.lang.Class<?> wildcardClass34 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item27 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        fPHeapMax17.copia(itemArray37);
        fPHeapMax14.copia(itemArray37);
        fPHeapMax9.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        java.lang.Class<?> wildcardClass44 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax10.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item36 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.refaz(10, 10);
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax7.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        fPHeapMax3.copia(itemArray25);
        fPHeapMax1.copia(itemArray25);
        java.lang.Class<?> wildcardClass30 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass4 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.Item item19 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item20 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax27.copia(itemArray35);
        fPHeapMax15.copia(itemArray35);
        fPHeapMax12.copia(itemArray35);
        fPHeapMax6.copia(itemArray35);
        java.lang.Class<?> wildcardClass41 = itemArray35.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) wildcardClass41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        fPHeapMax17.copia(itemArray37);
        fPHeapMax14.copia(itemArray37);
        fPHeapMax9.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item44 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax7.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        fPHeapMax3.copia(itemArray25);
        fPHeapMax1.copia(itemArray25);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item29 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        ds.Item[] itemArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item25 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.refaz(10, 10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        java.lang.Class<?> wildcardClass47 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax9.copia(itemArray14);
        fPHeapMax9.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) fPHeapMax9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        ds.Item item47 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.refaz(10, (int) (short) 10);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass6 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        fPHeapMax17.copia(itemArray37);
        fPHeapMax14.copia(itemArray37);
        fPHeapMax9.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax12.copia(itemArray26);
        fPHeapMax12.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) fPHeapMax12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(1, (int) (byte) 1);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass26 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        ds.Item item20 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) 'a');
        ds.Item item8 = fPHeapMax7.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax14.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        java.lang.Class<?> wildcardClass25 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.Item item2 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax7.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item21 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        java.lang.Class<?> wildcardClass23 = fPHeapMax20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        fPHeapMax9.copia(itemArray29);
        fPHeapMax6.copia(itemArray29);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        fPHeapMax17.copia(itemArray37);
        fPHeapMax14.copia(itemArray37);
        fPHeapMax9.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        ds.Item item44 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        fPHeapMax9.copia(itemArray29);
        fPHeapMax6.copia(itemArray29);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) itemArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(0);
        java.lang.Class<?> wildcardClass30 = fPHeapMax29.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) fPHeapMax29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, 10);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax4.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        fPHeapMax17.copia(itemArray37);
        fPHeapMax14.copia(itemArray37);
        fPHeapMax9.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item45 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.Item item18 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        ds.Item item18 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.refaz(10, 10);
        java.lang.Class<?> wildcardClass18 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        fPHeapMax8.copia(itemArray28);
        fPHeapMax5.copia(itemArray28);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) 'a');
        ds.Item item4 = fPHeapMax3.max();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax10.copia(itemArray15);
        fPHeapMax6.copia(itemArray15);
        fPHeapMax3.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass10 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.constroi();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.Item item25 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item26 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) '4', (int) ' ');
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax35.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) fPHeapMax35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax7.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax7.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        fPHeapMax3.copia(itemArray25);
        fPHeapMax1.copia(itemArray25);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax36.copia(itemArray44);
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray47);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax50.copia(itemArray58);
        ds.Item[] itemArray61 = new ds.Item[] {};
        fPHeapMax50.copia(itemArray61);
        fPHeapMax36.copia(itemArray61);
        fPHeapMax31.copia(itemArray61);
        fPHeapMax1.copia(itemArray61);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray61);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 10, 10);
        fPHeapMax1.refaz((int) 'a', (-1));
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax16.constroi();
        java.lang.Class<?> wildcardClass18 = fPHeapMax16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (-1));
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax10.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax5.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax41.constroi();
        fPHeapMax41.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax45.constroi();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax45.copia(itemArray50);
        fPHeapMax41.copia(itemArray50);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax55.constroi();
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        fPHeapMax61.copia(itemArray63);
        fPHeapMax55.copia(itemArray63);
        fPHeapMax41.copia(itemArray63);
        fPHeapMax39.copia(itemArray63);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) itemArray63);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray63);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item31 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        fPHeapMax17.copia(itemArray37);
        fPHeapMax14.copia(itemArray37);
        fPHeapMax9.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass45 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax10.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax5.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass38 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) '4');
        ds.Item item34 = fPHeapMax33.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item34);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.refaz((int) '#', (int) ' ');
        ds.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax4.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax41.copia(itemArray49);
        fPHeapMax29.copia(itemArray49);
        fPHeapMax26.copia(itemArray49);
        fPHeapMax20.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        ds.Item item56 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item56);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax19.copia(itemArray27);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax31.copia(itemArray39);
        fPHeapMax19.copia(itemArray39);
        fPHeapMax16.copia(itemArray39);
        fPHeapMax10.copia(itemArray39);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax46.imprime();
        fPHeapMax46.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax50.copia(itemArray58);
        fPHeapMax46.copia(itemArray58);
        fPHeapMax10.copia(itemArray58);
        fPHeapMax1.copia(itemArray58);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item64 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, (int) ' ');
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax41.copia(itemArray49);
        fPHeapMax29.copia(itemArray49);
        fPHeapMax26.copia(itemArray49);
        fPHeapMax20.copia(itemArray49);
        fPHeapMax18.copia(itemArray49);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) fPHeapMax18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 100, (int) (short) 1);
        fPHeapMax1.refaz((int) 'a', (int) 'a');
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax7.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax11.imprime();
        ds.Item item13 = fPHeapMax11.max();
        ds.Item item14 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        fPHeapMax11.constroi();
        ds.Item item17 = fPHeapMax11.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) item17);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) 'a', (int) (short) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray23);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray37);
        fPHeapMax12.copia(itemArray37);
        ds.Item item40 = fPHeapMax12.max();
        fPHeapMax12.imprime();
        fPHeapMax12.refaz((int) (short) 10, 0);
        ds.Item item45 = fPHeapMax12.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) fPHeapMax12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item45);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item9 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        ds.Item item11 = fPHeapMax8.max();
        java.lang.Class<?> wildcardClass12 = fPHeapMax8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) fPHeapMax8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 100, (int) (short) 1);
        fPHeapMax1.imprime();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item item12 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.imprime();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 1, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax4.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        java.lang.Object obj20 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, obj20);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        java.lang.Class<?> wildcardClass32 = itemArray26.getClass();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax10.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax5.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax19.imprime();
        ds.Item item21 = fPHeapMax19.max();
        ds.Item item22 = fPHeapMax19.max();
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        ds.Item item25 = fPHeapMax19.max();
        fPHeapMax19.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        fPHeapMax8.copia(itemArray20);
        fPHeapMax5.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.refaz(10, 10);
        ds.Item item18 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item34 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        ds.Item item15 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.imprime();
        ds.Item item48 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax53.constroi();
        fPHeapMax53.imprime();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax57.constroi();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMax60.copia(itemArray62);
        fPHeapMax57.copia(itemArray62);
        fPHeapMax53.copia(itemArray62);
        fPHeapMax51.copia(itemArray62);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) itemArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNotNull(itemArray62);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax7.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass33 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.refaz((int) (short) 100, (int) '#');
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax7.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass18 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        ds.Item item9 = fPHeapMax1.max();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax11.constroi();
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax15.copia(itemArray20);
        fPHeapMax11.copia(itemArray20);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax25.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax25.copia(itemArray33);
        fPHeapMax11.copia(itemArray33);
        fPHeapMax9.copia(itemArray33);
        fPHeapMax9.constroi();
        ds.Item item39 = fPHeapMax9.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) item39);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item39);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        ds.Item item10 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.refaz((int) (byte) 10, (-1));
        fPHeapMax1.refaz((int) (byte) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass30 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item34 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) 'a', (int) (short) 1);
        ds.Item item34 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass35 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass13 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax32.copia(itemArray40);
        fPHeapMax20.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        ds.Item item45 = fPHeapMax1.max();
        java.lang.Object obj47 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, obj47);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item45);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax51.imprime();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        fPHeapMax54.constroi();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMax60.copia(itemArray62);
        fPHeapMax54.copia(itemArray62);
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item67 = null;
        ds.Item[] itemArray68 = new ds.Item[] { item67 };
        fPHeapMax66.copia(itemArray68);
        fPHeapMax66.constroi();
        ds.FPHeapMax fPHeapMax72 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item73 = null;
        ds.Item[] itemArray74 = new ds.Item[] { item73 };
        fPHeapMax72.copia(itemArray74);
        fPHeapMax66.copia(itemArray74);
        fPHeapMax54.copia(itemArray74);
        fPHeapMax51.copia(itemArray74);
        fPHeapMax49.copia(itemArray74);
        fPHeapMax1.copia(itemArray74);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray74);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) 'a');
        fPHeapMax21.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) fPHeapMax21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item[] itemArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.Item item14 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass4 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.refaz((int) (byte) 10, (-1));
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass28 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) '#', 10);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.Item item25 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax29.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax32.copia(itemArray40);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax44.copia(itemArray52);
        fPHeapMax32.copia(itemArray52);
        fPHeapMax29.copia(itemArray52);
        fPHeapMax27.copia(itemArray52);
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax60.constroi();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        fPHeapMax60.copia(itemArray65);
        fPHeapMax27.copia(itemArray65);
        fPHeapMax1.copia(itemArray65);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray65);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item22 = fPHeapMax21.max();
        fPHeapMax21.constroi();
        fPHeapMax21.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item22);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray15);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray29);
        fPHeapMax4.copia(itemArray29);
        ds.Item item32 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        fPHeapMax4.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax38.refaz((int) '4', 0);
        fPHeapMax38.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax38.copia(itemArray46);
        fPHeapMax4.copia(itemArray46);
        fPHeapMax1.copia(itemArray46);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.Item item25 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray17);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray31);
        fPHeapMax6.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        java.lang.Class<?> wildcardClass35 = itemArray31.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax32.copia(itemArray40);
        fPHeapMax20.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        ds.Item item45 = fPHeapMax1.max();
        fPHeapMax1.refaz(100, (int) ' ');
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item45);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        ds.Item item13 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax21.imprime();
        fPHeapMax21.constroi();
        fPHeapMax21.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray17);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray31);
        fPHeapMax6.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 10);
        java.lang.Class<?> wildcardClass38 = fPHeapMax37.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) fPHeapMax37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        ds.Item[] itemArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) 'a', (int) (short) 1);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax40.constroi();
        fPHeapMax40.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax44.copia(itemArray49);
        fPHeapMax40.copia(itemArray49);
        fPHeapMax38.copia(itemArray49);
        java.lang.Class<?> wildcardClass54 = itemArray49.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) itemArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray15);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray29);
        fPHeapMax4.copia(itemArray29);
        ds.Item item32 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        fPHeapMax4.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax38.refaz((int) '4', 0);
        fPHeapMax38.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax38.copia(itemArray46);
        fPHeapMax4.copia(itemArray46);
        fPHeapMax1.copia(itemArray46);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass8 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.imprime();
        ds.Item item7 = fPHeapMax5.max();
        ds.Item item8 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax14.copia(itemArray22);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        fPHeapMax14.copia(itemArray34);
        fPHeapMax11.copia(itemArray34);
        fPHeapMax5.copia(itemArray34);
        fPHeapMax3.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax44.constroi();
        fPHeapMax44.imprime();
        fPHeapMax44.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) fPHeapMax44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.refaz((int) (byte) 10, (-1));
        fPHeapMax1.refaz((int) (byte) 100, (int) (short) 100);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.imprime();
        ds.Item item37 = fPHeapMax35.max();
        ds.Item item38 = fPHeapMax35.max();
        fPHeapMax35.constroi();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax44.copia(itemArray52);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax56.constroi();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMax62.copia(itemArray64);
        fPHeapMax56.copia(itemArray64);
        fPHeapMax44.copia(itemArray64);
        fPHeapMax41.copia(itemArray64);
        fPHeapMax35.copia(itemArray64);
        fPHeapMax33.copia(itemArray64);
        fPHeapMax31.copia(itemArray64);
        fPHeapMax1.copia(itemArray64);
        ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax74.constroi();
        ds.Item item76 = fPHeapMax74.max();
        ds.FPHeapMax fPHeapMax78 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax78.imprime();
        ds.FPHeapMax fPHeapMax81 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax81.constroi();
        fPHeapMax81.imprime();
        ds.FPHeapMax fPHeapMax85 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item86 = null;
        ds.Item[] itemArray87 = new ds.Item[] { item86 };
        fPHeapMax85.copia(itemArray87);
        fPHeapMax85.constroi();
        ds.FPHeapMax fPHeapMax91 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item92 = null;
        ds.Item[] itemArray93 = new ds.Item[] { item92 };
        fPHeapMax91.copia(itemArray93);
        fPHeapMax85.copia(itemArray93);
        fPHeapMax81.copia(itemArray93);
        fPHeapMax78.copia(itemArray93);
        fPHeapMax74.copia(itemArray93);
        fPHeapMax1.copia(itemArray93);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNull(item76);
        org.junit.Assert.assertNotNull(itemArray87);
        org.junit.Assert.assertNotNull(itemArray93);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) 'a', (int) (short) 1);
        ds.Item item36 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax39.refaz((int) '4', 0);
        fPHeapMax39.imprime();
        fPHeapMax39.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item36);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax34.copia(itemArray39);
        fPHeapMax1.copia(itemArray39);
        java.lang.Class<?> wildcardClass43 = itemArray39.getClass();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.refaz((int) (short) 100, (int) '#');
        ds.Item item32 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item31 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.refaz((int) (short) 100, (int) '#');
        fPHeapMax1.constroi();
        ds.Item item33 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax4.copia(itemArray18);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) itemArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(1);
        ds.Item item13 = fPHeapMax12.max();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray14);
        java.lang.Class<?> wildcardClass16 = itemArray14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax19.copia(itemArray27);
        fPHeapMax7.copia(itemArray27);
        fPHeapMax4.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        java.lang.Class<?> wildcardClass33 = itemArray27.getClass();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax36.copia(itemArray44);
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray47);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax50.copia(itemArray58);
        ds.Item[] itemArray61 = new ds.Item[] {};
        fPHeapMax50.copia(itemArray61);
        fPHeapMax36.copia(itemArray61);
        fPHeapMax31.copia(itemArray61);
        fPHeapMax1.copia(itemArray61);
        fPHeapMax1.refaz((int) (byte) 1, (int) (short) 1);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax70.constroi();
        ds.FPHeapMax fPHeapMax73 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item74 = null;
        ds.Item[] itemArray75 = new ds.Item[] { item74 };
        fPHeapMax73.copia(itemArray75);
        fPHeapMax73.constroi();
        ds.FPHeapMax fPHeapMax79 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item80 = null;
        ds.Item[] itemArray81 = new ds.Item[] { item80 };
        fPHeapMax79.copia(itemArray81);
        fPHeapMax73.copia(itemArray81);
        ds.Item[] itemArray84 = new ds.Item[] {};
        fPHeapMax73.copia(itemArray84);
        fPHeapMax70.copia(itemArray84);
        fPHeapMax1.copia(itemArray84);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item88 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertNotNull(itemArray81);
        org.junit.Assert.assertNotNull(itemArray84);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) '4', (int) ' ');
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) 'a');
        ds.Item item4 = fPHeapMax3.max();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax10.copia(itemArray15);
        fPHeapMax6.copia(itemArray15);
        fPHeapMax3.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        java.lang.Class<?> wildcardClass21 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.Item item34 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax37.imprime();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax43.refaz((int) '4', 0);
        fPHeapMax43.imprime();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax43.copia(itemArray51);
        fPHeapMax37.copia(itemArray51);
        ds.Item item55 = fPHeapMax37.max();
        fPHeapMax37.imprime();
        fPHeapMax37.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) fPHeapMax37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNull(item55);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass18 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        java.lang.Class<?> wildcardClass43 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray33);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax36.copia(itemArray44);
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray47);
        fPHeapMax22.copia(itemArray47);
        ds.Item item50 = fPHeapMax22.max();
        fPHeapMax22.imprime();
        fPHeapMax22.refaz(100, 10);
        ds.Item item55 = fPHeapMax22.max();
        java.lang.Class<?> wildcardClass56 = fPHeapMax22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) wildcardClass56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.imprime();
        ds.Item item12 = fPHeapMax10.max();
        ds.Item item13 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) 'a');
        ds.Item item17 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax19.constroi();
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax23.copia(itemArray28);
        fPHeapMax19.copia(itemArray28);
        fPHeapMax16.copia(itemArray28);
        fPHeapMax10.copia(itemArray28);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) itemArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz(1, 0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax4.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax10.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax5.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) 'a', (int) (short) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass19 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        ds.Item item15 = fPHeapMax1.max();
        ds.Item item16 = fPHeapMax1.max();
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax4.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax14.copia(itemArray22);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        fPHeapMax14.copia(itemArray34);
        fPHeapMax11.copia(itemArray34);
        fPHeapMax5.copia(itemArray34);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax41.imprime();
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMax45.copia(itemArray47);
        fPHeapMax45.constroi();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        fPHeapMax45.copia(itemArray53);
        fPHeapMax41.copia(itemArray53);
        fPHeapMax5.copia(itemArray53);
        fPHeapMax1.copia(itemArray53);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray53);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax52.imprime();
        ds.Item item54 = fPHeapMax52.max();
        ds.Item item55 = fPHeapMax52.max();
        fPHeapMax52.constroi();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax58.constroi();
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        fPHeapMax61.copia(itemArray63);
        fPHeapMax61.constroi();
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item68 = null;
        ds.Item[] itemArray69 = new ds.Item[] { item68 };
        fPHeapMax67.copia(itemArray69);
        fPHeapMax61.copia(itemArray69);
        ds.FPHeapMax fPHeapMax73 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item74 = null;
        ds.Item[] itemArray75 = new ds.Item[] { item74 };
        fPHeapMax73.copia(itemArray75);
        fPHeapMax73.constroi();
        ds.FPHeapMax fPHeapMax79 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item80 = null;
        ds.Item[] itemArray81 = new ds.Item[] { item80 };
        fPHeapMax79.copia(itemArray81);
        fPHeapMax73.copia(itemArray81);
        fPHeapMax61.copia(itemArray81);
        fPHeapMax58.copia(itemArray81);
        fPHeapMax52.copia(itemArray81);
        fPHeapMax50.copia(itemArray81);
        fPHeapMax1.copia(itemArray81);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertNotNull(itemArray81);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.refaz(10, 10);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax19.imprime();
        ds.Item item21 = fPHeapMax19.max();
        ds.Item item22 = fPHeapMax19.max();
        ds.Item item23 = fPHeapMax19.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax25.imprime();
        fPHeapMax25.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax34.imprime();
        ds.Item item36 = fPHeapMax34.max();
        ds.Item item37 = fPHeapMax34.max();
        fPHeapMax34.imprime();
        fPHeapMax34.constroi();
        ds.Item item40 = fPHeapMax34.max();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax42.constroi();
        fPHeapMax42.constroi();
        fPHeapMax42.constroi();
        fPHeapMax42.constroi();
        ds.Item item47 = fPHeapMax42.max();
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax50.constroi();
        fPHeapMax50.imprime();
        fPHeapMax50.imprime();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax55.imprime();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMax58.copia(itemArray60);
        fPHeapMax58.constroi();
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        fPHeapMax64.copia(itemArray66);
        fPHeapMax58.copia(itemArray66);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        fPHeapMax70.copia(itemArray72);
        fPHeapMax70.constroi();
        ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item77 = null;
        ds.Item[] itemArray78 = new ds.Item[] { item77 };
        fPHeapMax76.copia(itemArray78);
        fPHeapMax70.copia(itemArray78);
        fPHeapMax58.copia(itemArray78);
        fPHeapMax55.copia(itemArray78);
        fPHeapMax50.copia(itemArray78);
        fPHeapMax42.copia(itemArray78);
        fPHeapMax34.copia(itemArray78);
        fPHeapMax25.copia(itemArray78);
        fPHeapMax19.copia(itemArray78);
        fPHeapMax1.copia(itemArray78);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(itemArray78);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.refaz(100, (int) (short) -1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax12.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax8.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item35 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax16.refaz((int) '4', 0);
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax22.constroi();
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        fPHeapMax22.copia(itemArray34);
        fPHeapMax16.copia(itemArray34);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) fPHeapMax16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        java.lang.Class<?> wildcardClass24 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item7 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax27.copia(itemArray35);
        fPHeapMax15.copia(itemArray35);
        fPHeapMax12.copia(itemArray35);
        fPHeapMax10.copia(itemArray35);
        fPHeapMax6.copia(itemArray35);
        fPHeapMax1.copia(itemArray35);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = item7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.refaz((int) (byte) 10, (-1));
        fPHeapMax1.refaz((int) (byte) 100, (int) (short) 100);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.imprime();
        ds.Item item37 = fPHeapMax35.max();
        ds.Item item38 = fPHeapMax35.max();
        fPHeapMax35.constroi();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax44.copia(itemArray52);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax56.constroi();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMax62.copia(itemArray64);
        fPHeapMax56.copia(itemArray64);
        fPHeapMax44.copia(itemArray64);
        fPHeapMax41.copia(itemArray64);
        fPHeapMax35.copia(itemArray64);
        fPHeapMax33.copia(itemArray64);
        fPHeapMax31.copia(itemArray64);
        fPHeapMax1.copia(itemArray64);
        ds.Item item73 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray64);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax10.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax5.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        fPHeapMax1.constroi();
        ds.Item item38 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item38);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax32.copia(itemArray40);
        fPHeapMax20.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        fPHeapMax1.constroi();
        ds.Item item46 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax32.copia(itemArray40);
        fPHeapMax20.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        java.lang.Class<?> wildcardClass45 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.refaz((int) '4', 0);
        fPHeapMax10.imprime();
        fPHeapMax10.refaz((int) (byte) 100, 0);
        ds.Item item18 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item21 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax41.copia(itemArray49);
        fPHeapMax29.copia(itemArray49);
        fPHeapMax26.copia(itemArray49);
        fPHeapMax24.copia(itemArray49);
        fPHeapMax20.copia(itemArray49);
        fPHeapMax10.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(1, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        ds.Item item9 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax32.copia(itemArray40);
        fPHeapMax20.copia(itemArray40);
        fPHeapMax17.copia(itemArray40);
        fPHeapMax15.copia(itemArray40);
        fPHeapMax11.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax7.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        fPHeapMax3.copia(itemArray25);
        fPHeapMax1.copia(itemArray25);
        fPHeapMax1.constroi();
        ds.Item item31 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax36.copia(itemArray44);
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray47);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax50.copia(itemArray58);
        ds.Item[] itemArray61 = new ds.Item[] {};
        fPHeapMax50.copia(itemArray61);
        fPHeapMax36.copia(itemArray61);
        fPHeapMax31.copia(itemArray61);
        fPHeapMax1.copia(itemArray61);
        fPHeapMax1.refaz((int) (byte) 1, (int) (short) 1);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax70.constroi();
        ds.FPHeapMax fPHeapMax73 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item74 = null;
        ds.Item[] itemArray75 = new ds.Item[] { item74 };
        fPHeapMax73.copia(itemArray75);
        fPHeapMax73.constroi();
        ds.FPHeapMax fPHeapMax79 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item80 = null;
        ds.Item[] itemArray81 = new ds.Item[] { item80 };
        fPHeapMax79.copia(itemArray81);
        fPHeapMax73.copia(itemArray81);
        ds.Item[] itemArray84 = new ds.Item[] {};
        fPHeapMax73.copia(itemArray84);
        fPHeapMax70.copia(itemArray84);
        fPHeapMax1.copia(itemArray84);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertNotNull(itemArray81);
        org.junit.Assert.assertNotNull(itemArray84);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.imprime();
        ds.Item item12 = fPHeapMax10.max();
        ds.Item item13 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        ds.Item item16 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        ds.Item item23 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax34.copia(itemArray42);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMax46.copia(itemArray48);
        fPHeapMax46.constroi();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        fPHeapMax52.copia(itemArray54);
        fPHeapMax46.copia(itemArray54);
        fPHeapMax34.copia(itemArray54);
        fPHeapMax31.copia(itemArray54);
        fPHeapMax26.copia(itemArray54);
        fPHeapMax18.copia(itemArray54);
        fPHeapMax10.copia(itemArray54);
        fPHeapMax1.copia(itemArray54);
        ds.Item item63 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.constroi();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item8 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass8 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 1, 1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax4.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        ds.Item item29 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax17.copia(itemArray22);
        fPHeapMax13.copia(itemArray22);
        fPHeapMax11.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.refaz(100, 100);
        fPHeapMax1.imprime();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) 'a', (int) (short) 1);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax7.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        fPHeapMax3.copia(itemArray25);
        fPHeapMax1.copia(itemArray25);
        fPHeapMax1.constroi();
        ds.Item item31 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item31);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.refaz((int) (short) 100, (int) '#');
        fPHeapMax1.constroi();
        ds.Item item33 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item33);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item20 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item6 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax32.copia(itemArray40);
        fPHeapMax20.copia(itemArray40);
        fPHeapMax17.copia(itemArray40);
        fPHeapMax15.copia(itemArray40);
        fPHeapMax11.copia(itemArray40);
        fPHeapMax5.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item49 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.refaz(10, 10);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (byte) -1);
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (-1));
        ds.Item[] itemArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.imprime();
        ds.Item item12 = fPHeapMax10.max();
        ds.Item item13 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        ds.Item item16 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        ds.Item item23 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax34.copia(itemArray42);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMax46.copia(itemArray48);
        fPHeapMax46.constroi();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        fPHeapMax52.copia(itemArray54);
        fPHeapMax46.copia(itemArray54);
        fPHeapMax34.copia(itemArray54);
        fPHeapMax31.copia(itemArray54);
        fPHeapMax26.copia(itemArray54);
        fPHeapMax18.copia(itemArray54);
        fPHeapMax10.copia(itemArray54);
        fPHeapMax1.copia(itemArray54);
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax65.constroi();
        fPHeapMax65.imprime();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item70 = null;
        ds.Item[] itemArray71 = new ds.Item[] { item70 };
        fPHeapMax69.copia(itemArray71);
        fPHeapMax69.constroi();
        ds.FPHeapMax fPHeapMax75 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item76 = null;
        ds.Item[] itemArray77 = new ds.Item[] { item76 };
        fPHeapMax75.copia(itemArray77);
        fPHeapMax69.copia(itemArray77);
        fPHeapMax65.copia(itemArray77);
        fPHeapMax65.constroi();
        fPHeapMax65.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray77);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax10.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax5.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        fPHeapMax1.constroi();
        ds.Item item38 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) fPHeapMax41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item38);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax33.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax33.copia(itemArray41);
        fPHeapMax21.copia(itemArray41);
        fPHeapMax18.copia(itemArray41);
        fPHeapMax11.copia(itemArray41);
        fPHeapMax1.copia(itemArray41);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) 'a', (int) (short) 10);
        ds.Item item8 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        fPHeapMax11.refaz((int) (byte) 10, 1);
        fPHeapMax11.refaz((int) (byte) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.Item item19 = fPHeapMax1.max();
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) 'a');
        ds.Item item23 = fPHeapMax22.max();
        fPHeapMax22.constroi();
        fPHeapMax22.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) fPHeapMax22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, (int) (byte) 1);
        ds.Item item9 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax44.imprime();
        ds.Item item46 = fPHeapMax44.max();
        ds.Item item47 = fPHeapMax44.max();
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item54 = null;
        ds.Item[] itemArray55 = new ds.Item[] { item54 };
        fPHeapMax53.copia(itemArray55);
        fPHeapMax53.constroi();
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMax59.copia(itemArray61);
        fPHeapMax53.copia(itemArray61);
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item66 = null;
        ds.Item[] itemArray67 = new ds.Item[] { item66 };
        fPHeapMax65.copia(itemArray67);
        fPHeapMax65.constroi();
        ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item72 = null;
        ds.Item[] itemArray73 = new ds.Item[] { item72 };
        fPHeapMax71.copia(itemArray73);
        fPHeapMax65.copia(itemArray73);
        fPHeapMax53.copia(itemArray73);
        fPHeapMax50.copia(itemArray73);
        fPHeapMax44.copia(itemArray73);
        fPHeapMax11.copia(itemArray73);
        fPHeapMax1.copia(itemArray73);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray73);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.refaz((int) (short) 100, (int) '#');
        fPHeapMax1.constroi();
        ds.Item item33 = fPHeapMax1.max();
        ds.Item item34 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item33);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) 'a', (int) (short) 1);
        ds.Item item34 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass35 = item34.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item34);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        ds.Item item33 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.constroi();
        fPHeapMax35.constroi();
        fPHeapMax35.constroi();
        fPHeapMax35.constroi();
        ds.Item item40 = fPHeapMax35.max();
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax43.constroi();
        fPHeapMax43.imprime();
        fPHeapMax43.imprime();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax48.imprime();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        fPHeapMax51.constroi();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        fPHeapMax51.copia(itemArray59);
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        fPHeapMax63.constroi();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item70 = null;
        ds.Item[] itemArray71 = new ds.Item[] { item70 };
        fPHeapMax69.copia(itemArray71);
        fPHeapMax63.copia(itemArray71);
        fPHeapMax51.copia(itemArray71);
        fPHeapMax48.copia(itemArray71);
        fPHeapMax43.copia(itemArray71);
        fPHeapMax35.copia(itemArray71);
        fPHeapMax1.copia(itemArray71);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray71);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax10.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax5.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        fPHeapMax1.constroi();
        ds.Item item38 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item39 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item38);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax10.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax37.imprime();
        fPHeapMax37.constroi();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax41.copia(itemArray49);
        fPHeapMax37.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass55 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax4.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax41.copia(itemArray49);
        fPHeapMax29.copia(itemArray49);
        fPHeapMax26.copia(itemArray49);
        fPHeapMax20.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass7 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        ds.Item item15 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, obj16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax32.copia(itemArray40);
        fPHeapMax20.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        fPHeapMax1.constroi();
        ds.Item[] itemArray46 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax4.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.imprime();
        ds.Item item30 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item30);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.imprime();
        ds.Item item12 = fPHeapMax10.max();
        ds.Item item13 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        ds.Item item16 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        ds.Item item23 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax34.copia(itemArray42);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMax46.copia(itemArray48);
        fPHeapMax46.constroi();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        fPHeapMax52.copia(itemArray54);
        fPHeapMax46.copia(itemArray54);
        fPHeapMax34.copia(itemArray54);
        fPHeapMax31.copia(itemArray54);
        fPHeapMax26.copia(itemArray54);
        fPHeapMax18.copia(itemArray54);
        fPHeapMax10.copia(itemArray54);
        fPHeapMax1.copia(itemArray54);
        ds.Item item63 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNull(item63);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        fPHeapMax4.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz(1, 0);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item6 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax32.copia(itemArray40);
        fPHeapMax20.copia(itemArray40);
        fPHeapMax17.copia(itemArray40);
        fPHeapMax15.copia(itemArray40);
        fPHeapMax11.copia(itemArray40);
        fPHeapMax5.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        java.lang.Class<?> wildcardClass49 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) 'a');
        ds.Item item8 = fPHeapMax7.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax14.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.Item item25 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax28.constroi();
        fPHeapMax28.imprime();
        fPHeapMax28.imprime();
        java.lang.Class<?> wildcardClass32 = fPHeapMax28.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) fPHeapMax28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax10.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        ds.Item item36 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item38 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item36);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, (int) (byte) 1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax12.constroi();
        ds.Item item14 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax19.constroi();
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax23.copia(itemArray31);
        fPHeapMax19.copia(itemArray31);
        fPHeapMax16.copia(itemArray31);
        fPHeapMax12.copia(itemArray31);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) itemArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item9 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.Item item25 = fPHeapMax1.max();
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass8 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) 'a', (int) (short) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax27.copia(itemArray35);
        fPHeapMax15.copia(itemArray35);
        fPHeapMax12.copia(itemArray35);
        fPHeapMax10.copia(itemArray35);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) itemArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        fPHeapMax13.refaz(1, (int) (short) 0);
        ds.Item item18 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        ds.Item item21 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax25.imprime();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax40.constroi();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMax46.copia(itemArray48);
        fPHeapMax40.copia(itemArray48);
        fPHeapMax28.copia(itemArray48);
        fPHeapMax25.copia(itemArray48);
        fPHeapMax23.copia(itemArray48);
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax56.constroi();
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMax59.copia(itemArray61);
        fPHeapMax56.copia(itemArray61);
        fPHeapMax23.copia(itemArray61);
        fPHeapMax13.copia(itemArray61);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) itemArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray61);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 10, 10);
        fPHeapMax1.refaz((int) 'a', (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item14 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax19.copia(itemArray27);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax31.copia(itemArray39);
        fPHeapMax19.copia(itemArray39);
        fPHeapMax16.copia(itemArray39);
        fPHeapMax10.copia(itemArray39);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax46.imprime();
        fPHeapMax46.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax50.copia(itemArray58);
        fPHeapMax46.copia(itemArray58);
        fPHeapMax10.copia(itemArray58);
        fPHeapMax1.copia(itemArray58);
        ds.Item item64 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNull(item64);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax4.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax41.copia(itemArray49);
        fPHeapMax29.copia(itemArray49);
        fPHeapMax26.copia(itemArray49);
        fPHeapMax20.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        ds.Item item56 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item57 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item56);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.Item item19 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item22 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = item22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item22);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.Item item35 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item35);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax6.constroi();
        fPHeapMax6.constroi();
        fPHeapMax6.constroi();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax12.refaz((int) '4', 0);
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        fPHeapMax6.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax10.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        ds.Item item36 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        java.lang.Object obj39 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, obj39);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item36);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.refaz((int) (byte) 10, (-1));
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax28.refaz((int) '4', 0);
        fPHeapMax28.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax34.constroi();
        fPHeapMax34.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax38.constroi();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax38.copia(itemArray46);
        fPHeapMax34.copia(itemArray46);
        fPHeapMax28.copia(itemArray46);
        fPHeapMax1.copia(itemArray46);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item53 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item9 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        ds.Item item11 = fPHeapMax8.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) fPHeapMax8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.imprime();
        ds.Item item48 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (short) 100, (int) ' ');
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item48);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax23.copia(itemArray31);
        fPHeapMax11.copia(itemArray31);
        fPHeapMax8.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        java.lang.Class<?> wildcardClass37 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.Item item25 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax27.constroi();
        fPHeapMax27.imprime();
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax32.imprime();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax35.constroi();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax47.constroi();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item54 = null;
        ds.Item[] itemArray55 = new ds.Item[] { item54 };
        fPHeapMax53.copia(itemArray55);
        fPHeapMax47.copia(itemArray55);
        fPHeapMax35.copia(itemArray55);
        fPHeapMax32.copia(itemArray55);
        fPHeapMax27.copia(itemArray55);
        fPHeapMax1.copia(itemArray55);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray55);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax11.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        fPHeapMax7.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        ds.Item item34 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        ds.Item item43 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNull(item43);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        java.lang.Class<?> wildcardClass19 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 100, (int) (short) 1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        java.lang.Class<?> wildcardClass20 = itemArray17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) wildcardClass20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        fPHeapMax7.copia(itemArray36);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) itemArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax24.constroi();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax24.copia(itemArray32);
        fPHeapMax12.copia(itemArray32);
        fPHeapMax9.copia(itemArray32);
        fPHeapMax3.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) 'a');
        ds.Item item41 = fPHeapMax40.max();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax43.constroi();
        fPHeapMax43.imprime();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax47.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax47.copia(itemArray52);
        fPHeapMax43.copia(itemArray52);
        fPHeapMax40.copia(itemArray52);
        fPHeapMax1.copia(itemArray52);
        java.lang.Class<?> wildcardClass58 = itemArray52.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        fPHeapMax1.refaz((int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item14 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, (int) (byte) 1);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item20 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax19.copia(itemArray27);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax31.copia(itemArray39);
        fPHeapMax19.copia(itemArray39);
        fPHeapMax16.copia(itemArray39);
        fPHeapMax10.copia(itemArray39);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax46.imprime();
        fPHeapMax46.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax50.copia(itemArray58);
        fPHeapMax46.copia(itemArray58);
        fPHeapMax10.copia(itemArray58);
        fPHeapMax1.copia(itemArray58);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item49 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        ds.Item item33 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax37.imprime();
        ds.Item item39 = fPHeapMax37.max();
        ds.Item item40 = fPHeapMax37.max();
        fPHeapMax37.refaz((int) 'a', (int) (short) 10);
        fPHeapMax37.imprime();
        fPHeapMax37.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item40);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.refaz((int) '4', 0);
        fPHeapMax8.imprime();
        fPHeapMax8.refaz((int) (byte) 100, 0);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax38.constroi();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax38.copia(itemArray46);
        fPHeapMax26.copia(itemArray46);
        fPHeapMax23.copia(itemArray46);
        fPHeapMax17.copia(itemArray46);
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax53.imprime();
        fPHeapMax53.constroi();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        fPHeapMax57.constroi();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        fPHeapMax57.copia(itemArray65);
        fPHeapMax53.copia(itemArray65);
        fPHeapMax17.copia(itemArray65);
        fPHeapMax8.copia(itemArray65);
        fPHeapMax1.copia(itemArray65);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray65);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item6 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax32.copia(itemArray40);
        fPHeapMax20.copia(itemArray40);
        fPHeapMax17.copia(itemArray40);
        fPHeapMax15.copia(itemArray40);
        fPHeapMax11.copia(itemArray40);
        fPHeapMax5.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray17);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray31);
        fPHeapMax6.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax39.imprime();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax42.constroi();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax42.copia(itemArray50);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        fPHeapMax54.constroi();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMax60.copia(itemArray62);
        fPHeapMax54.copia(itemArray62);
        fPHeapMax42.copia(itemArray62);
        fPHeapMax39.copia(itemArray62);
        fPHeapMax37.copia(itemArray62);
        fPHeapMax37.imprime();
        fPHeapMax37.refaz((int) 'a', (int) (short) 1);
        ds.Item item72 = fPHeapMax37.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) item72);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNull(item72);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax24.constroi();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax24.copia(itemArray32);
        fPHeapMax12.copia(itemArray32);
        fPHeapMax9.copia(itemArray32);
        fPHeapMax3.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax41.refaz((int) '4', 0);
        fPHeapMax41.refaz(100, 100);
        fPHeapMax41.refaz((int) (short) 100, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) '#', 10);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.refaz(100, 100);
        fPHeapMax1.refaz((int) (short) 100, (int) ' ');
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.imprime();
        fPHeapMax12.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax21.imprime();
        ds.Item item23 = fPHeapMax21.max();
        ds.Item item24 = fPHeapMax21.max();
        fPHeapMax21.imprime();
        fPHeapMax21.constroi();
        ds.Item item27 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax29.constroi();
        fPHeapMax29.constroi();
        fPHeapMax29.constroi();
        fPHeapMax29.constroi();
        ds.Item item34 = fPHeapMax29.max();
        fPHeapMax29.imprime();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax37.constroi();
        fPHeapMax37.imprime();
        fPHeapMax37.imprime();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMax45.copia(itemArray47);
        fPHeapMax45.constroi();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        fPHeapMax45.copia(itemArray53);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        fPHeapMax57.constroi();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        fPHeapMax57.copia(itemArray65);
        fPHeapMax45.copia(itemArray65);
        fPHeapMax42.copia(itemArray65);
        fPHeapMax37.copia(itemArray65);
        fPHeapMax29.copia(itemArray65);
        fPHeapMax21.copia(itemArray65);
        fPHeapMax12.copia(itemArray65);
        fPHeapMax1.copia(itemArray65);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray65);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax4.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax41.copia(itemArray49);
        fPHeapMax29.copia(itemArray49);
        fPHeapMax26.copia(itemArray49);
        fPHeapMax20.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        ds.Item item56 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item56);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax44.copia(itemArray49);
        fPHeapMax11.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        ds.Item item54 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item54);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.refaz((int) '#', (int) ' ');
        ds.Item item30 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item30);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax4.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax41.copia(itemArray49);
        fPHeapMax29.copia(itemArray49);
        fPHeapMax26.copia(itemArray49);
        fPHeapMax20.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        ds.Item item56 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax60.constroi();
        fPHeapMax60.imprime();
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax64.constroi();
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item68 = null;
        ds.Item[] itemArray69 = new ds.Item[] { item68 };
        fPHeapMax67.copia(itemArray69);
        fPHeapMax64.copia(itemArray69);
        fPHeapMax60.copia(itemArray69);
        fPHeapMax58.copia(itemArray69);
        fPHeapMax1.copia(itemArray69);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item56);
        org.junit.Assert.assertNotNull(itemArray69);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, (int) (byte) 1);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item11 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item49 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.refaz((int) ' ', 1);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.Item item35 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        ds.Item item9 = fPHeapMax1.max();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray19);
        ds.Item item21 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        ds.Item item23 = fPHeapMax8.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass31 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.refaz((int) (byte) 10, (-1));
        fPHeapMax1.refaz((int) (byte) 100, (int) (short) 100);
        ds.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray5);
        ds.Item item7 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz(1, 0);
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) 'a', (int) (short) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.refaz(100, 100);
        fPHeapMax1.refaz((int) (short) 100, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test479");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.Item item19 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item22 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item22);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test480");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test481");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test482");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        fPHeapMax17.copia(itemArray37);
        fPHeapMax14.copia(itemArray37);
        fPHeapMax9.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        fPHeapMax1.imprime();
        ds.Item item45 = fPHeapMax1.max();
        fPHeapMax1.refaz(100, (int) (short) 10);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item45);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test483");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test484");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass26 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test485");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass9 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test486");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item32 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item32);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test487");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test488");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test489");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray17);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray31);
        fPHeapMax6.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        fPHeapMax1.refaz((int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test490");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 10, 10);
        fPHeapMax1.refaz((int) 'a', (-1));
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax33.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax33.copia(itemArray41);
        fPHeapMax21.copia(itemArray41);
        fPHeapMax18.copia(itemArray41);
        fPHeapMax16.copia(itemArray41);
        fPHeapMax16.imprime();
        fPHeapMax16.refaz((int) 'a', (int) (short) 1);
        fPHeapMax16.refaz((int) (byte) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test491");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        fPHeapMax7.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test492");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        fPHeapMax1.imprime();
        ds.Item item26 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item26);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test493");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        ds.Item item15 = fPHeapMax1.max();
        ds.Item item16 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test494");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) '4', (int) ' ');
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax39.constroi();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMax45.copia(itemArray47);
        fPHeapMax39.copia(itemArray47);
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        fPHeapMax51.constroi();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        fPHeapMax51.copia(itemArray59);
        fPHeapMax39.copia(itemArray59);
        fPHeapMax36.copia(itemArray59);
        fPHeapMax34.copia(itemArray59);
        fPHeapMax1.copia(itemArray59);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray59);
    }
}

