package ds.seed1448;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test001");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = obj2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Ignore
    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = obj4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = obj5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
    }

    @Ignore
    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
    }

    @Ignore
    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.imprime();
// flaky:         tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = null;
        tabelaHash0.insere("hi!", obj4);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) '4');
// flaky:         tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash5.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash5.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash5.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) 100L);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0L + "'", obj9, 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = null;
        tabelaHash0.insere("hi!", obj28);
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass5 = tabelaHash4.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash4.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("", (java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Ignore
    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = null;
        tabelaHash0.insere("hi!", obj4);
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Class<?> wildcardClass17 = tabelaHash10.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash5.insere("", (java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass18 = tabelaHash5.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Ignore
    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.imprime();
        java.lang.Class<?> wildcardClass35 = tabelaHash31.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash31);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        java.lang.Object obj43 = tabelaHash38.pesquisa("hi!");
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        java.lang.Object obj47 = tabelaHash45.pesquisa("hi!");
        tabelaHash45.imprime();
        java.lang.Object obj50 = tabelaHash45.pesquisa("hi!");
        tabelaHash38.insere("hi!", obj50);
        tabelaHash31.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.imprime();
        java.lang.Class<?> wildcardClass35 = tabelaHash31.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash31);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash31.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash13.pesquisa("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        java.lang.Object obj25 = tabelaHash19.pesquisa("hi!");
        java.lang.Class<?> wildcardClass26 = tabelaHash19.getClass();
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = null;
        tabelaHash0.insere("hi!", obj28);
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        java.lang.Object obj37 = tabelaHash33.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass41 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash5.imprime();
        java.lang.Object obj17 = tabelaHash5.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash5.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0L + "'", obj17, 0L);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = null;
        tabelaHash0.insere("hi!", obj28);
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass34 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass5 = tabelaHash4.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash4.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        java.lang.Object obj36 = tabelaHash32.pesquisa("");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        java.lang.Object obj44 = tabelaHash38.pesquisa("hi!");
        java.lang.Class<?> wildcardClass45 = tabelaHash38.getClass();
        tabelaHash32.insere("hi!", (java.lang.Object) tabelaHash38);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash32);
        java.lang.Class<?> wildcardClass48 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0L + "'", obj28, 0L);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash13.imprime();
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        tabelaHash0.insere("", obj22);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass25 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = null;
        tabelaHash0.insere("hi!", obj28);
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        java.lang.Object obj37 = tabelaHash33.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash33);
        java.lang.Class<?> wildcardClass39 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = null;
        tabelaHash0.insere("hi!", obj4);
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Ignore
    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object obj8 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.imprime();
        tabelaHash6.imprime();
        java.lang.Object obj12 = tabelaHash6.pesquisa("hi!");
        java.lang.Class<?> wildcardClass13 = tabelaHash6.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash6);
        java.lang.Object obj16 = tabelaHash6.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash31.imprime();
        java.lang.Object obj40 = tabelaHash31.pesquisa("");
        java.lang.Object obj42 = null;
        tabelaHash31.insere("hi!", obj42);
        tabelaHash0.insere("", obj42);
        java.lang.Class<?> wildcardClass45 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        tabelaHash13.insere("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        java.lang.Class<?> wildcardClass23 = tabelaHash13.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass23);
        tabelaHash0.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        java.lang.Object obj33 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass34 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0L + "'", obj31, 0L);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0L + "'", obj33, 0L);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        java.lang.Object obj33 = tabelaHash0.pesquisa("");
        java.lang.Object obj35 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0L + "'", obj31, 0L);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0L + "'", obj33, 0L);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0L + "'", obj35, 0L);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("", (java.lang.Object) 10.0f);
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
// flaky:         tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        java.lang.Object obj12 = tabelaHash7.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj12);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash5.imprime();
        java.lang.Object obj17 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj17);
    }

    @Ignore
    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash13.imprime();
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        tabelaHash0.insere("", obj22);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash0.retira("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) 0 + "'", obj31, (short) 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj20 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Ignore
    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = null;
        tabelaHash0.insere("hi!", obj4);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        java.lang.Object obj33 = tabelaHash0.pesquisa("");
        java.lang.Object obj35 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass36 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0L + "'", obj31, 0L);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0L + "'", obj33, 0L);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0L + "'", obj35, 0L);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        tabelaHash11.insere("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("", obj20);
        tabelaHash0.imprime();
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        java.lang.Object obj12 = tabelaHash7.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj12);
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0L + "'", obj9, 0L);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash13.pesquisa("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        java.lang.Object obj25 = tabelaHash19.pesquisa("hi!");
        java.lang.Class<?> wildcardClass26 = tabelaHash19.getClass();
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.imprime();
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object obj39 = tabelaHash37.pesquisa("hi!");
        tabelaHash37.imprime();
        tabelaHash37.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash30.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj46 = tabelaHash30.pesquisa("hi!");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        java.lang.Object obj50 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.imprime();
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        tabelaHash48.insere("", (java.lang.Object) wildcardClass54);
        java.lang.Object obj57 = tabelaHash48.pesquisa("");
        java.lang.Class<?> wildcardClass58 = obj57.getClass();
        tabelaHash30.insere("", (java.lang.Object) wildcardClass58);
        tabelaHash19.insere("", (java.lang.Object) wildcardClass58);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass28 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash9.imprime();
        java.lang.Object obj18 = tabelaHash9.pesquisa("");
        tabelaHash9.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        java.lang.Class<?> wildcardClass22 = tabelaHash9.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        tabelaHash18.insere("", (java.lang.Object) wildcardClass24);
        java.lang.Object obj27 = tabelaHash18.pesquisa("");
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass28);
        java.lang.Class<?> wildcardClass30 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) 0L);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        tabelaHash34.insere("", (java.lang.Object) 0L);
        tabelaHash27.insere("", (java.lang.Object) 0L);
        tabelaHash11.insere("", (java.lang.Object) tabelaHash27);
        java.lang.Object obj45 = tabelaHash11.pesquisa("hi!");
        java.lang.Class<?> wildcardClass46 = tabelaHash11.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0L + "'", obj20, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass31 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj16 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass34 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0L + "'", obj31, 0L);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1.0f + "'", obj16, 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash13.imprime();
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        tabelaHash0.insere("", obj22);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) 10);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0L + "'", obj31, 0L);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0L + "'", obj9, 0L);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) 0L);
        java.lang.Object obj27 = tabelaHash18.pesquisa("");
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 0L);
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash32);
        java.lang.Class<?> wildcardClass43 = tabelaHash32.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0L + "'", obj27, 0L);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0L + "'", obj28, 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("", (java.lang.Object) 10.0f);
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Ignore
    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
    }

    @Ignore
    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        java.lang.Object obj12 = tabelaHash7.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj12);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        tabelaHash23.insere("", (java.lang.Object) 0L);
        tabelaHash23.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash23.imprime();
        java.lang.Object obj35 = tabelaHash23.pesquisa("");
        java.lang.Class<?> wildcardClass36 = tabelaHash23.getClass();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash23);
        java.lang.Class<?> wildcardClass38 = tabelaHash10.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0L + "'", obj35, 0L);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj18 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj16 = tabelaHash5.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) 0L);
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Class<?> wildcardClass35 = tabelaHash18.getClass();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        java.lang.Class<?> wildcardClass41 = tabelaHash38.getClass();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash38);
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object obj46 = tabelaHash44.pesquisa("hi!");
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash44.insere("", (java.lang.Object) 0L);
        tabelaHash44.imprime();
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        java.lang.Object obj56 = tabelaHash54.pesquisa("hi!");
        tabelaHash54.imprime();
        tabelaHash54.imprime();
        tabelaHash54.imprime();
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        java.lang.Object obj63 = tabelaHash61.pesquisa("hi!");
        tabelaHash61.imprime();
        tabelaHash61.imprime();
        tabelaHash61.insere("", (java.lang.Object) 0L);
        tabelaHash54.insere("", (java.lang.Object) 0L);
        tabelaHash44.insere("", (java.lang.Object) 0L);
        java.lang.Object obj72 = tabelaHash44.pesquisa("");
        java.lang.Class<?> wildcardClass73 = tabelaHash44.getClass();
        tabelaHash38.insere("hi!", (java.lang.Object) wildcardClass73);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0L + "'", obj16, 0L);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 0L + "'", obj72, 0L);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = null;
        tabelaHash0.insere("hi!", obj28);
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj35 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        tabelaHash0.insere("", obj13);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        tabelaHash24.imprime();
        tabelaHash24.insere("", (java.lang.Object) 0L);
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash17.imprime();
        tabelaHash17.retira("");
        tabelaHash17.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash17.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0L + "'", obj9, 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass5 = tabelaHash4.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj18 = tabelaHash10.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash10.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
// flaky:         tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.insere("", (java.lang.Object) 0L);
        java.lang.Object obj40 = tabelaHash31.pesquisa("hi!");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object obj44 = tabelaHash42.pesquisa("hi!");
        tabelaHash42.imprime();
        tabelaHash42.imprime();
        tabelaHash42.insere("", (java.lang.Object) 0L);
        java.lang.Object obj51 = tabelaHash42.pesquisa("");
        tabelaHash42.retira("");
        java.lang.Object obj55 = tabelaHash42.pesquisa("hi!");
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash42);
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        java.lang.Object obj60 = tabelaHash58.pesquisa("hi!");
        tabelaHash58.imprime();
        tabelaHash58.imprime();
        tabelaHash58.imprime();
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        java.lang.Object obj67 = tabelaHash65.pesquisa("hi!");
        tabelaHash65.imprime();
        tabelaHash65.imprime();
        tabelaHash65.insere("", (java.lang.Object) 0L);
        tabelaHash58.insere("", (java.lang.Object) 0L);
        tabelaHash42.insere("", (java.lang.Object) tabelaHash58);
        java.lang.Object obj76 = tabelaHash42.pesquisa("hi!");
        tabelaHash0.insere("", obj76);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 0L + "'", obj51, 0L);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        java.lang.Object obj36 = tabelaHash32.pesquisa("");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        java.lang.Object obj44 = tabelaHash38.pesquisa("hi!");
        java.lang.Class<?> wildcardClass45 = tabelaHash38.getClass();
        tabelaHash32.insere("hi!", (java.lang.Object) tabelaHash38);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash0.retira("");
        java.lang.Object obj51 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0L + "'", obj28, 0L);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = null;
        tabelaHash0.insere("hi!", obj4);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("");
        tabelaHash7.insere("", (java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass13 = tabelaHash7.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        tabelaHash7.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash18.imprime();
        java.lang.Object obj27 = tabelaHash18.pesquisa("");
        tabelaHash5.insere("", obj27);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        java.lang.Class<?> wildcardClass30 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = null;
        tabelaHash0.insere("hi!", obj4);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", obj14);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) 0L);
        java.lang.Object obj27 = tabelaHash18.pesquisa("");
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        tabelaHash18.retira("");
        java.lang.Class<?> wildcardClass33 = tabelaHash18.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0L + "'", obj27, 0L);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash13.imprime();
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        tabelaHash0.insere("", obj22);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash0.retira("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) 0 + "'", obj31, (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = null;
        tabelaHash0.insere("hi!", obj28);
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj35 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("", (java.lang.Object) 10.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass5 = tabelaHash4.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = null;
        tabelaHash0.insere("hi!", obj28);
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        java.lang.Object obj37 = tabelaHash33.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash33);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash33.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.insere("", (java.lang.Object) 0L);
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.imprime();
        tabelaHash36.imprime();
        tabelaHash36.insere("", (java.lang.Object) 0L);
        tabelaHash29.insere("", (java.lang.Object) 0L);
        tabelaHash19.insere("", (java.lang.Object) 0L);
        java.lang.Object obj47 = tabelaHash19.pesquisa("");
        tabelaHash19.retira("");
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        java.lang.Object obj53 = tabelaHash51.pesquisa("hi!");
        java.lang.Object obj55 = tabelaHash51.pesquisa("");
        ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
        java.lang.Object obj59 = tabelaHash57.pesquisa("hi!");
        tabelaHash57.imprime();
        tabelaHash57.imprime();
        java.lang.Object obj63 = tabelaHash57.pesquisa("hi!");
        java.lang.Class<?> wildcardClass64 = tabelaHash57.getClass();
        tabelaHash51.insere("hi!", (java.lang.Object) tabelaHash57);
        tabelaHash19.insere("", (java.lang.Object) tabelaHash51);
        tabelaHash10.insere("", (java.lang.Object) tabelaHash51);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0L + "'", obj47, 0L);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = null;
        tabelaHash0.insere("hi!", obj28);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("hi!");
        java.lang.Object obj35 = null;
        tabelaHash31.insere("hi!", obj35);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass38 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Class<?> wildcardClass15 = tabelaHash5.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass5 = tabelaHash4.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        java.lang.Object obj33 = null;
        tabelaHash0.insere("hi!", obj33);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0L + "'", obj31, 0L);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass5 = tabelaHash4.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        java.lang.Class<?> wildcardClass7 = tabelaHash4.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        java.lang.Object obj36 = tabelaHash32.pesquisa("");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        java.lang.Object obj44 = tabelaHash38.pesquisa("hi!");
        java.lang.Class<?> wildcardClass45 = tabelaHash38.getClass();
        tabelaHash32.insere("hi!", (java.lang.Object) tabelaHash38);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass50 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0L + "'", obj28, 0L);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.imprime();
        java.lang.Class<?> wildcardClass35 = tabelaHash31.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash31);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass38 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Ignore
    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj16 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash5.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        java.lang.Object obj19 = tabelaHash10.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash10.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0L + "'", obj16, 0L);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass20 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        java.lang.Object obj21 = tabelaHash10.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash10.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash5.insere("", (java.lang.Object) (short) 100);
        tabelaHash5.imprime();
        tabelaHash5.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass5 = tabelaHash4.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) 0L);
        java.lang.Object obj27 = tabelaHash18.pesquisa("");
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        java.lang.Object obj37 = tabelaHash32.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash32);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0L + "'", obj27, 0L);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
    }

    @Ignore
    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = null;
        tabelaHash0.insere("hi!", obj11);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = null;
        tabelaHash0.insere("hi!", obj4);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash17.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash17);
        java.lang.Object obj28 = tabelaHash17.pesquisa("");
        tabelaHash17.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        tabelaHash34.insere("", (java.lang.Object) 0L);
        tabelaHash34.imprime();
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object obj46 = tabelaHash44.pesquisa("hi!");
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        java.lang.Object obj53 = tabelaHash51.pesquisa("hi!");
        tabelaHash51.imprime();
        tabelaHash51.imprime();
        tabelaHash51.insere("", (java.lang.Object) 0L);
        tabelaHash44.insere("", (java.lang.Object) 0L);
        tabelaHash34.insere("", (java.lang.Object) 0L);
        tabelaHash34.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash34);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0L + "'", obj28, 0L);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = null;
        tabelaHash0.insere("hi!", obj28);
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj35 = tabelaHash0.pesquisa("");
        java.lang.Object obj37 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
    }

    @Ignore
    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash18.imprime();
        java.lang.Object obj27 = tabelaHash18.pesquisa("");
        tabelaHash5.insere("", obj27);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) 0L);
        tabelaHash16.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) 0L);
        tabelaHash26.insere("", (java.lang.Object) 0L);
        tabelaHash16.insere("", (java.lang.Object) 0L);
        java.lang.Object obj44 = tabelaHash16.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj47 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 0L + "'", obj44, 0L);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0L + "'", obj47, 0L);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) 0L);
        tabelaHash16.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) 0L);
        tabelaHash26.insere("", (java.lang.Object) 0L);
        tabelaHash16.insere("", (java.lang.Object) 0L);
        java.lang.Object obj44 = tabelaHash16.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Class<?> wildcardClass46 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 0L + "'", obj44, 0L);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Ignore
    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) 0L);
        tabelaHash16.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) 0L);
        tabelaHash26.insere("", (java.lang.Object) 0L);
        tabelaHash16.insere("", (java.lang.Object) 0L);
        java.lang.Object obj44 = tabelaHash16.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash16.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 0L + "'", obj44, 0L);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash10.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
    }

    @Ignore
    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash5.imprime();
        java.lang.Object obj17 = tabelaHash5.pesquisa("");
        java.lang.Object obj19 = tabelaHash5.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash5.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0L + "'", obj17, 0L);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0L + "'", obj19, 0L);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash13.imprime();
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        tabelaHash0.insere("", obj22);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash13.insere("", (java.lang.Object) 0L);
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash13.retira("");
        java.lang.Class<?> wildcardClass26 = tabelaHash13.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = null;
        tabelaHash0.insere("hi!", obj28);
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj33 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass36 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj16 = tabelaHash5.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) 0L);
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Class<?> wildcardClass35 = tabelaHash18.getClass();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        java.lang.Class<?> wildcardClass41 = tabelaHash38.getClass();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash38);
        java.lang.Object obj44 = tabelaHash5.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0L + "'", obj16, 0L);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = null;
        tabelaHash0.insere("hi!", obj4);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", obj14);
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0f + "'", obj17, 0.0f);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 0L);
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        tabelaHash24.imprime();
        tabelaHash24.insere("", (java.lang.Object) 0L);
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash7.insere("", (java.lang.Object) 0L);
        java.lang.Object obj35 = tabelaHash7.pesquisa("");
        tabelaHash7.retira("");
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object obj41 = tabelaHash39.pesquisa("hi!");
        java.lang.Object obj43 = tabelaHash39.pesquisa("");
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        java.lang.Object obj47 = tabelaHash45.pesquisa("hi!");
        tabelaHash45.imprime();
        tabelaHash45.imprime();
        java.lang.Object obj51 = tabelaHash45.pesquisa("hi!");
        java.lang.Class<?> wildcardClass52 = tabelaHash45.getClass();
        tabelaHash39.insere("hi!", (java.lang.Object) tabelaHash45);
        tabelaHash7.insere("", (java.lang.Object) tabelaHash39);
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        java.lang.Object obj58 = tabelaHash56.pesquisa("hi!");
        tabelaHash56.imprime();
        tabelaHash56.imprime();
        tabelaHash56.insere("", (java.lang.Object) 0L);
        tabelaHash56.imprime();
        ds.TabelaHash tabelaHash66 = new ds.TabelaHash();
        java.lang.Object obj68 = tabelaHash66.pesquisa("hi!");
        tabelaHash66.imprime();
        tabelaHash66.imprime();
        tabelaHash66.imprime();
        ds.TabelaHash tabelaHash73 = new ds.TabelaHash();
        java.lang.Object obj75 = tabelaHash73.pesquisa("hi!");
        tabelaHash73.imprime();
        tabelaHash73.imprime();
        tabelaHash73.insere("", (java.lang.Object) 0L);
        tabelaHash66.insere("", (java.lang.Object) 0L);
        tabelaHash56.insere("", (java.lang.Object) 0L);
        tabelaHash56.imprime();
        java.lang.Object obj85 = tabelaHash56.pesquisa("");
        ds.TabelaHash tabelaHash87 = new ds.TabelaHash();
        java.lang.Object obj89 = tabelaHash87.pesquisa("hi!");
        tabelaHash87.imprime();
        java.lang.Class<?> wildcardClass91 = tabelaHash87.getClass();
        tabelaHash56.insere("", (java.lang.Object) tabelaHash87);
        tabelaHash56.imprime();
        tabelaHash56.imprime();
        java.lang.Class<?> wildcardClass95 = tabelaHash56.getClass();
        tabelaHash39.insere("", (java.lang.Object) wildcardClass95);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash39);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0L + "'", obj35, 0L);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + 0L + "'", obj85, 0L);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0f + "'", obj8, 1.0f);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj20 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1.0f + "'", obj16, 1.0f);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = null;
        tabelaHash0.insere("hi!", obj28);
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        java.lang.Object obj37 = tabelaHash33.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash0.retira("");
// flaky:         tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
    }

    @Ignore
    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash10.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) 0L);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        tabelaHash34.insere("", (java.lang.Object) 0L);
        tabelaHash27.insere("", (java.lang.Object) 0L);
        tabelaHash11.insere("", (java.lang.Object) tabelaHash27);
        tabelaHash11.imprime();
        java.lang.Class<?> wildcardClass45 = tabelaHash11.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0L + "'", obj20, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash13.imprime();
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        tabelaHash0.insere("", obj22);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash29.insere("", (java.lang.Object) 0L);
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object obj41 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        java.lang.Object obj48 = tabelaHash46.pesquisa("hi!");
        tabelaHash46.imprime();
        tabelaHash46.imprime();
        tabelaHash46.insere("", (java.lang.Object) 0L);
        tabelaHash39.insere("", (java.lang.Object) 0L);
        tabelaHash29.insere("", (java.lang.Object) 0L);
        java.lang.Object obj57 = null;
        tabelaHash29.insere("hi!", obj57);
        java.lang.Object obj60 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.retira("");
        java.lang.Object obj64 = tabelaHash29.pesquisa("hi!");
        tabelaHash0.insere("", obj64);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass5 = tabelaHash4.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.insere("", (java.lang.Object) 0.0d);
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = tabelaHash23.pesquisa("");
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash23);
        java.lang.Object obj28 = tabelaHash23.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj28);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = null;
        tabelaHash0.insere("hi!", obj4);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = null;
        tabelaHash0.insere("hi!", obj28);
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        java.lang.Object obj37 = tabelaHash33.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash33);
        java.lang.Class<?> wildcardClass39 = tabelaHash33.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj18 = tabelaHash10.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) 0L);
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash33.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash33.imprime();
        java.lang.Object obj42 = tabelaHash33.pesquisa("");
        tabelaHash20.insere("", obj42);
        tabelaHash20.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass48 = tabelaHash20.getClass();
        tabelaHash10.insere("hi!", (java.lang.Object) wildcardClass48);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        java.lang.Object obj19 = tabelaHash10.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash10.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash5.imprime();
        java.lang.Object obj17 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash5.retira("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object obj24 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash22.insere("", (java.lang.Object) 0L);
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.imprime();
        tabelaHash35.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash35.imprime();
        java.lang.Object obj44 = tabelaHash35.pesquisa("");
        tabelaHash22.insere("", obj44);
        tabelaHash22.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash22.retira("");
        java.lang.Object obj53 = tabelaHash22.pesquisa("hi!");
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash22);
        java.lang.Class<?> wildcardClass55 = tabelaHash5.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0L + "'", obj17, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (short) 0 + "'", obj53, (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.insere("", (java.lang.Object) 0.0d);
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass23 = tabelaHash14.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        java.lang.Object obj20 = tabelaHash10.pesquisa("");
        java.lang.Object obj22 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash10.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("", (java.lang.Object) 10.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
// flaky:         tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash13.insere("", (java.lang.Object) 0L);
        tabelaHash13.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.imprime();
        java.lang.Object obj26 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0L + "'", obj26, 0L);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash5.insere("", (java.lang.Object) (short) 100);
        tabelaHash5.imprime();
        java.lang.Class<?> wildcardClass19 = tabelaHash5.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) 0L);
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.imprime();
        tabelaHash35.imprime();
        tabelaHash35.insere("", (java.lang.Object) 0L);
        tabelaHash28.insere("", (java.lang.Object) 0L);
        tabelaHash18.insere("", (java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass45 = tabelaHash18.getClass();
        tabelaHash10.insere("", (java.lang.Object) tabelaHash18);
        tabelaHash18.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = obj2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = null;
        tabelaHash0.insere("hi!", obj4);
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass19 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass5 = tabelaHash4.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        java.lang.Object obj16 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = null;
        tabelaHash0.insere("hi!", obj4);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash17.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash17);
        java.lang.Object obj28 = tabelaHash17.pesquisa("");
        tabelaHash17.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0L + "'", obj28, 0L);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object obj6 = tabelaHash4.pesquisa("hi!");
        tabelaHash4.imprime();
        java.lang.Object obj9 = tabelaHash4.pesquisa("hi!");
        tabelaHash4.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        java.lang.Object obj20 = tabelaHash15.pesquisa("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object obj24 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash15.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj31 = tabelaHash15.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) 0L);
        java.lang.Object obj42 = tabelaHash33.pesquisa("");
        java.lang.Object obj44 = tabelaHash33.pesquisa("hi!");
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash33);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0L + "'", obj42, 0L);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = obj14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 0L);
        tabelaHash25.insere("", (java.lang.Object) 0L);
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash13.imprime();
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        tabelaHash0.insere("", obj22);
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.insere("", (java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass19 = tabelaHash13.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass21 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) 0L);
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        java.lang.Class<?> wildcardClass44 = tabelaHash33.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass44);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash9.imprime();
        java.lang.Object obj18 = tabelaHash9.pesquisa("");
        tabelaHash9.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        java.lang.Object obj23 = tabelaHash9.pesquisa("hi!");
        java.lang.Class<?> wildcardClass24 = tabelaHash9.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0L + "'", obj13, 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0L + "'", obj9, 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) '4');
        tabelaHash0.retira("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = null;
        tabelaHash0.insere("hi!", obj28);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.insere("", (java.lang.Object) 0L);
        java.lang.Object obj40 = tabelaHash31.pesquisa("");
        tabelaHash31.retira("");
        java.lang.Object obj44 = tabelaHash31.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0L + "'", obj40, 0L);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        tabelaHash0.insere("", obj13);
        java.lang.Class<?> wildcardClass16 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0L + "'", obj9, 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Class<?> wildcardClass16 = tabelaHash10.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) 0L);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash27.insere("", (java.lang.Object) 0L);
        java.lang.Object obj36 = tabelaHash27.pesquisa("hi!");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        tabelaHash38.insere("", (java.lang.Object) 0L);
        java.lang.Object obj47 = tabelaHash38.pesquisa("");
        tabelaHash38.retira("");
        java.lang.Object obj51 = tabelaHash38.pesquisa("hi!");
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash38);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass54 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0L + "'", obj20, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0L + "'", obj47, 0L);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        tabelaHash30.insere("", (java.lang.Object) 0L);
        tabelaHash30.retira("");
        java.lang.Object obj41 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.imprime();
        java.lang.Object obj44 = tabelaHash30.pesquisa("");
        tabelaHash10.insere("hi!", (java.lang.Object) "");
        tabelaHash10.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) 0L);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash27.insere("", (java.lang.Object) 0L);
        tabelaHash27.imprime();
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object obj39 = tabelaHash37.pesquisa("hi!");
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash37);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash37);
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        tabelaHash37.insere("hi!", (java.lang.Object) wildcardClass47);
        java.lang.Class<?> wildcardClass49 = tabelaHash37.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0L + "'", obj20, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) 0L);
        java.lang.Object obj27 = tabelaHash18.pesquisa("");
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0L + "'", obj27, 0L);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.insere("", (java.lang.Object) 1.0f);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) 0L);
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        java.lang.Object obj27 = tabelaHash16.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash29.insere("", (java.lang.Object) 0L);
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash29);
        tabelaHash29.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash29);
        java.lang.Class<?> wildcardClass43 = tabelaHash29.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        tabelaHash11.insere("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("", obj20);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
        java.lang.Object obj29 = null;
        tabelaHash25.insere("hi!", obj29);
        java.lang.Object obj32 = tabelaHash25.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass34 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = null;
        tabelaHash0.insere("hi!", obj4);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", obj14);
        java.lang.Class<?> wildcardClass16 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash10.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = null;
        tabelaHash0.insere("hi!", obj28);
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash31.imprime();
        java.lang.Object obj40 = tabelaHash31.pesquisa("");
        java.lang.Object obj42 = null;
        tabelaHash31.insere("hi!", obj42);
        tabelaHash0.insere("", obj42);
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass47 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        java.lang.Object obj20 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass30 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        java.lang.Object obj21 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj33 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("");
        tabelaHash35.insere("", (java.lang.Object) 0.0d);
        tabelaHash35.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        java.lang.Object obj47 = tabelaHash45.pesquisa("hi!");
        tabelaHash45.imprime();
        java.lang.Object obj50 = tabelaHash45.pesquisa("hi!");
        tabelaHash35.insere("hi!", (java.lang.Object) tabelaHash45);
        java.lang.Class<?> wildcardClass52 = tabelaHash45.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass52);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0L + "'", obj33, 0L);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash5.imprime();
        java.lang.Class<?> wildcardClass16 = tabelaHash5.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass19 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1.0f + "'", obj16, 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj33 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0L + "'", obj33, 0L);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        java.lang.Class<?> wildcardClass18 = tabelaHash10.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        java.lang.Class<?> wildcardClass19 = tabelaHash10.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Ignore
    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass5 = tabelaHash4.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 0L);
        tabelaHash25.insere("", (java.lang.Object) 0L);
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj50 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj52 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj54 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1.0f + "'", obj16, 1.0f);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = null;
        tabelaHash0.insere("hi!", obj4);
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) 0L);
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        tabelaHash26.insere("", (java.lang.Object) 0L);
        tabelaHash19.insere("", (java.lang.Object) 0L);
        tabelaHash9.insere("", (java.lang.Object) 0L);
        java.lang.Object obj37 = tabelaHash9.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass39 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0L + "'", obj37, 0L);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = new java.lang.Object();
        tabelaHash0.insere("", obj14);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash17.retira("");
        java.lang.Object obj28 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        java.lang.Object obj31 = tabelaHash17.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass33 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) -1);
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0f + "'", obj11, 1.0f);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        java.lang.Object obj36 = tabelaHash32.pesquisa("");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        java.lang.Object obj44 = tabelaHash38.pesquisa("hi!");
        java.lang.Class<?> wildcardClass45 = tabelaHash38.getClass();
        tabelaHash32.insere("hi!", (java.lang.Object) tabelaHash38);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash32);
        java.lang.Class<?> wildcardClass48 = tabelaHash32.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0L + "'", obj28, 0L);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        java.lang.Object obj16 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        java.lang.Class<?> wildcardClass18 = tabelaHash10.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash18.imprime();
        java.lang.Object obj27 = tabelaHash18.pesquisa("");
        tabelaHash5.insere("", obj27);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("");
        tabelaHash31.insere("", (java.lang.Object) 0.0d);
        tabelaHash31.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object obj43 = tabelaHash41.pesquisa("");
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash41);
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        java.lang.Object obj48 = tabelaHash46.pesquisa("hi!");
        tabelaHash46.imprime();
        tabelaHash46.imprime();
        tabelaHash46.insere("", (java.lang.Object) 0L);
        tabelaHash46.imprime();
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        java.lang.Object obj58 = tabelaHash56.pesquisa("hi!");
        tabelaHash56.imprime();
        tabelaHash56.imprime();
        tabelaHash56.imprime();
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        java.lang.Object obj65 = tabelaHash63.pesquisa("hi!");
        tabelaHash63.imprime();
        tabelaHash63.imprime();
        tabelaHash63.insere("", (java.lang.Object) 0L);
        tabelaHash56.insere("", (java.lang.Object) 0L);
        tabelaHash46.insere("", (java.lang.Object) 0L);
        tabelaHash46.retira("");
        tabelaHash31.insere("", (java.lang.Object) "");
        tabelaHash31.retira("hi!");
        ds.TabelaHash tabelaHash79 = new ds.TabelaHash();
        java.lang.Object obj81 = tabelaHash79.pesquisa("hi!");
        tabelaHash79.imprime();
        java.lang.Object obj84 = new java.lang.Object();
        java.lang.Class<?> wildcardClass85 = obj84.getClass();
        tabelaHash79.insere("", (java.lang.Object) wildcardClass85);
        java.lang.Object obj88 = tabelaHash79.pesquisa("");
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash79);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(obj88);
        org.junit.Assert.assertEquals(obj88.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj88), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj88), "class java.lang.Object");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) 0L);
        tabelaHash20.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash20);
        java.lang.Object obj31 = tabelaHash20.pesquisa("");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) 0L);
        tabelaHash33.imprime();
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        java.lang.Object obj45 = tabelaHash43.pesquisa("hi!");
        tabelaHash43.imprime();
        tabelaHash43.imprime();
        tabelaHash43.imprime();
        tabelaHash33.insere("hi!", (java.lang.Object) tabelaHash43);
        java.lang.Class<?> wildcardClass50 = tabelaHash33.getClass();
        tabelaHash20.insere("", (java.lang.Object) tabelaHash33);
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        java.lang.Object obj55 = tabelaHash53.pesquisa("hi!");
        java.lang.Class<?> wildcardClass56 = tabelaHash53.getClass();
        tabelaHash20.insere("", (java.lang.Object) tabelaHash53);
        tabelaHash10.insere("hi!", (java.lang.Object) "");
        tabelaHash10.retira("hi!");
        java.lang.Class<?> wildcardClass61 = tabelaHash10.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0L + "'", obj31, 0L);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash13.insere("", (java.lang.Object) 0L);
        java.lang.Object obj22 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        tabelaHash18.insere("", (java.lang.Object) wildcardClass24);
        java.lang.Object obj27 = tabelaHash18.pesquisa("");
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass28);
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj33 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 1.0f + "'", obj33, 1.0f);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
        java.lang.Object obj4 = tabelaHash2.pesquisa("hi!");
        tabelaHash2.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 0L);
        tabelaHash7.imprime();
        tabelaHash2.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash7.insere("", (java.lang.Object) (short) 100);
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        java.lang.Class<?> wildcardClass22 = tabelaHash7.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 0L);
        tabelaHash25.insere("", (java.lang.Object) 0L);
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj50 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass51 = obj50.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("", (java.lang.Object) 10.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("");
        tabelaHash21.insere("", (java.lang.Object) 0.0d);
        tabelaHash21.insere("", (java.lang.Object) 10.0f);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("hi!");
        tabelaHash21.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj36 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash5.imprime();
        java.lang.Object obj17 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash5.retira("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object obj24 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash22.insere("", (java.lang.Object) 0L);
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.imprime();
        tabelaHash35.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash35.imprime();
        java.lang.Object obj44 = tabelaHash35.pesquisa("");
        tabelaHash22.insere("", obj44);
        tabelaHash22.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash22.retira("");
        java.lang.Object obj53 = tabelaHash22.pesquisa("hi!");
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash22);
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        java.lang.Class<?> wildcardClass57 = tabelaHash22.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0L + "'", obj17, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (short) 0 + "'", obj53, (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = null;
        tabelaHash0.insere("hi!", obj4);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", obj14);
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.insere("", (java.lang.Object) 0L);
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.imprime();
        tabelaHash36.imprime();
        tabelaHash36.insere("", (java.lang.Object) 0L);
        tabelaHash29.insere("", (java.lang.Object) 0L);
        tabelaHash19.insere("", (java.lang.Object) 0L);
        java.lang.Object obj47 = tabelaHash19.pesquisa("");
        tabelaHash19.retira("");
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        java.lang.Object obj53 = tabelaHash51.pesquisa("hi!");
        java.lang.Object obj55 = tabelaHash51.pesquisa("");
        ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
        java.lang.Object obj59 = tabelaHash57.pesquisa("hi!");
        tabelaHash57.imprime();
        tabelaHash57.imprime();
        java.lang.Object obj63 = tabelaHash57.pesquisa("hi!");
        java.lang.Class<?> wildcardClass64 = tabelaHash57.getClass();
        tabelaHash51.insere("hi!", (java.lang.Object) tabelaHash57);
        tabelaHash19.insere("", (java.lang.Object) tabelaHash51);
        tabelaHash19.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0f + "'", obj17, 0.0f);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0L + "'", obj47, 0L);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash5.imprime();
        java.lang.Object obj17 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash5.retira("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object obj24 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash22.insere("", (java.lang.Object) 0L);
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.imprime();
        tabelaHash35.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash35.imprime();
        java.lang.Object obj44 = tabelaHash35.pesquisa("");
        tabelaHash22.insere("", obj44);
        tabelaHash22.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash22.retira("");
        java.lang.Object obj53 = tabelaHash22.pesquisa("hi!");
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash22);
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0L + "'", obj17, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (short) 0 + "'", obj53, (short) 0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = null;
        tabelaHash0.insere("hi!", obj28);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.insere("", (java.lang.Object) 0L);
        java.lang.Object obj40 = tabelaHash31.pesquisa("");
        tabelaHash31.retira("");
        java.lang.Object obj44 = tabelaHash31.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass46 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0L + "'", obj40, 0L);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 0L);
        tabelaHash25.insere("", (java.lang.Object) 0L);
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        java.lang.Object obj50 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.imprime();
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        tabelaHash48.insere("", (java.lang.Object) wildcardClass54);
        java.lang.Object obj57 = tabelaHash48.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash48);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "class java.lang.Object");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        tabelaHash17.insere("", (java.lang.Object) wildcardClass23);
        java.lang.Object obj26 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0.0f);
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash17);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "class java.lang.Object");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = obj12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash31.imprime();
        java.lang.Object obj40 = tabelaHash31.pesquisa("");
        java.lang.Object obj42 = null;
        tabelaHash31.insere("hi!", obj42);
        tabelaHash0.insere("", obj42);
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        java.lang.Object obj51 = tabelaHash49.pesquisa("hi!");
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        tabelaHash49.insere("", (java.lang.Object) 0L);
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        java.lang.Object obj64 = tabelaHash62.pesquisa("hi!");
        tabelaHash62.imprime();
        tabelaHash62.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash62.imprime();
        java.lang.Object obj71 = tabelaHash62.pesquisa("");
        tabelaHash49.insere("", obj71);
        tabelaHash49.imprime();
        tabelaHash49.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash49.retira("");
        java.lang.Object obj80 = tabelaHash49.pesquisa("hi!");
        tabelaHash0.insere("", obj80);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + (short) 0 + "'", obj80, (short) 0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) 0L);
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.imprime();
        tabelaHash35.imprime();
        tabelaHash35.insere("", (java.lang.Object) 0L);
        tabelaHash28.insere("", (java.lang.Object) 0L);
        tabelaHash18.insere("", (java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass45 = tabelaHash18.getClass();
        tabelaHash10.insere("", (java.lang.Object) tabelaHash18);
        tabelaHash10.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "class java.lang.Object");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object obj6 = tabelaHash4.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash4.pesquisa("hi!");
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        java.lang.Object obj13 = tabelaHash4.pesquisa("");
        tabelaHash0.insere("hi!", obj13);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj16 = tabelaHash5.pesquisa("");
        tabelaHash5.insere("", (java.lang.Object) 100);
        tabelaHash5.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0L + "'", obj16, 0L);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj16 = tabelaHash5.pesquisa("");
        tabelaHash5.insere("", (java.lang.Object) 100);
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        java.lang.Class<?> wildcardClass22 = tabelaHash5.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0L + "'", obj16, 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash8.insere("", (java.lang.Object) 0L);
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.insere("", (java.lang.Object) 0L);
        tabelaHash18.insere("", (java.lang.Object) 0L);
        tabelaHash8.insere("", (java.lang.Object) 0L);
        tabelaHash8.imprime();
// flaky:         tabelaHash8.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = tabelaHash40.pesquisa("hi!");
        tabelaHash40.imprime();
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        tabelaHash40.insere("", (java.lang.Object) wildcardClass46);
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash40.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash31.imprime();
        java.lang.Object obj40 = tabelaHash31.pesquisa("");
        java.lang.Object obj42 = null;
        tabelaHash31.insere("hi!", obj42);
        tabelaHash0.insere("", obj42);
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        java.lang.Object obj51 = tabelaHash49.pesquisa("hi!");
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        tabelaHash49.insere("", (java.lang.Object) 0L);
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        java.lang.Object obj64 = tabelaHash62.pesquisa("hi!");
        tabelaHash62.imprime();
        tabelaHash62.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash62.imprime();
        java.lang.Object obj71 = tabelaHash62.pesquisa("");
        tabelaHash49.insere("", obj71);
        tabelaHash49.imprime();
        tabelaHash49.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash49.retira("");
        java.lang.Object obj80 = tabelaHash49.pesquisa("hi!");
        tabelaHash0.insere("", obj80);
        java.lang.Object obj83 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + (short) 0 + "'", obj80, (short) 0);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + '4' + "'", obj83, '4');
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) 0L);
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.imprime();
        tabelaHash35.imprime();
        tabelaHash35.insere("", (java.lang.Object) 0L);
        tabelaHash28.insere("", (java.lang.Object) 0L);
        tabelaHash18.insere("", (java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass45 = tabelaHash18.getClass();
        tabelaHash10.insere("", (java.lang.Object) tabelaHash18);
        java.lang.Class<?> wildcardClass47 = tabelaHash10.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0L + "'", obj12, 0L);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash13.imprime();
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        tabelaHash13.retira("hi!");
        tabelaHash13.imprime();
        java.lang.Object obj27 = tabelaHash13.pesquisa("hi!");
        java.lang.Object obj29 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash13.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        java.lang.Object obj36 = tabelaHash32.pesquisa("");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        java.lang.Object obj44 = tabelaHash38.pesquisa("hi!");
        java.lang.Class<?> wildcardClass45 = tabelaHash38.getClass();
        tabelaHash32.insere("hi!", (java.lang.Object) tabelaHash38);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash32);
        java.lang.Object obj49 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0L + "'", obj28, 0L);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        java.lang.Object obj36 = tabelaHash32.pesquisa("");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        java.lang.Object obj44 = tabelaHash38.pesquisa("hi!");
        java.lang.Class<?> wildcardClass45 = tabelaHash38.getClass();
        tabelaHash32.insere("hi!", (java.lang.Object) tabelaHash38);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash0.retira("");
        java.lang.Object obj51 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0L + "'", obj28, 0L);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object obj6 = tabelaHash4.pesquisa("hi!");
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash4.insere("", (java.lang.Object) 0L);
        tabelaHash4.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        tabelaHash21.insere("", (java.lang.Object) 0L);
        tabelaHash14.insere("", (java.lang.Object) 0L);
        tabelaHash4.insere("", (java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass31 = tabelaHash4.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj16 = tabelaHash5.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = obj16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
        java.lang.Object obj4 = tabelaHash2.pesquisa("hi!");
        java.lang.Object obj6 = null;
        tabelaHash2.insere("hi!", obj6);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.insere("", (java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass15 = tabelaHash9.getClass();
        tabelaHash2.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        java.lang.Object obj20 = tabelaHash10.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        tabelaHash0.insere("", obj13);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        tabelaHash24.imprime();
        tabelaHash24.insere("", (java.lang.Object) 0L);
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash17.imprime();
        tabelaHash17.retira("");
        tabelaHash17.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        java.lang.Class<?> wildcardClass38 = tabelaHash17.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0L + "'", obj9, 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("");
        tabelaHash21.insere("", (java.lang.Object) 0.0d);
        tabelaHash21.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.imprime();
        java.lang.Object obj36 = tabelaHash31.pesquisa("hi!");
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash31);
        java.lang.Object obj39 = tabelaHash31.pesquisa("");
        java.lang.Object obj41 = tabelaHash31.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass43 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass21 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.insere("", (java.lang.Object) 1.0f);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) 0L);
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        java.lang.Object obj27 = tabelaHash16.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash29.insere("", (java.lang.Object) 0L);
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash29);
        tabelaHash29.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash29);
        tabelaHash29.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        tabelaHash14.insere("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj23 = tabelaHash14.pesquisa("");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        tabelaHash25.insere("", (java.lang.Object) wildcardClass31);
        java.lang.Object obj34 = tabelaHash25.pesquisa("");
        tabelaHash14.insere("", obj34);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        java.lang.Class<?> wildcardClass37 = tabelaHash14.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class java.lang.Object");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "class java.lang.Object");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) 0L);
        tabelaHash20.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash20);
        java.lang.Object obj31 = tabelaHash20.pesquisa("");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) 0L);
        tabelaHash33.imprime();
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        java.lang.Object obj45 = tabelaHash43.pesquisa("hi!");
        tabelaHash43.imprime();
        tabelaHash43.imprime();
        tabelaHash43.imprime();
        tabelaHash33.insere("hi!", (java.lang.Object) tabelaHash43);
        java.lang.Class<?> wildcardClass50 = tabelaHash33.getClass();
        tabelaHash20.insere("", (java.lang.Object) tabelaHash33);
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        java.lang.Object obj55 = tabelaHash53.pesquisa("hi!");
        java.lang.Class<?> wildcardClass56 = tabelaHash53.getClass();
        tabelaHash20.insere("", (java.lang.Object) tabelaHash53);
        tabelaHash10.insere("hi!", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass59 = tabelaHash10.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0L + "'", obj31, 0L);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.insere("", (java.lang.Object) 1.0f);
// flaky:         tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
    }

    @Ignore
    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) 0L);
        java.lang.Object obj27 = tabelaHash18.pesquisa("");
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 0L);
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash32);
        tabelaHash32.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash32.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0L + "'", obj27, 0L);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        tabelaHash13.insere("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        java.lang.Class<?> wildcardClass23 = tabelaHash13.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass23);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        tabelaHash23.insere("", (java.lang.Object) 0L);
        tabelaHash23.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash23.imprime();
        java.lang.Object obj35 = tabelaHash23.pesquisa("");
        java.lang.Class<?> wildcardClass36 = tabelaHash23.getClass();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash10.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0L + "'", obj35, 0L);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object obj6 = tabelaHash4.pesquisa("hi!");
        tabelaHash4.imprime();
        java.lang.Object obj9 = tabelaHash4.pesquisa("hi!");
        tabelaHash4.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1L);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        java.lang.Object obj36 = tabelaHash32.pesquisa("");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        java.lang.Object obj44 = tabelaHash38.pesquisa("hi!");
        java.lang.Class<?> wildcardClass45 = tabelaHash38.getClass();
        tabelaHash32.insere("hi!", (java.lang.Object) tabelaHash38);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash32);
        java.lang.Object obj49 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        java.lang.Object obj53 = tabelaHash51.pesquisa("hi!");
        tabelaHash51.imprime();
        java.lang.Object obj56 = tabelaHash51.pesquisa("hi!");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        java.lang.Object obj60 = tabelaHash58.pesquisa("hi!");
        tabelaHash58.imprime();
        tabelaHash58.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash51.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj67 = tabelaHash51.pesquisa("hi!");
        ds.TabelaHash tabelaHash69 = new ds.TabelaHash();
        java.lang.Object obj71 = tabelaHash69.pesquisa("hi!");
        tabelaHash69.imprime();
        java.lang.Object obj74 = new java.lang.Object();
        java.lang.Class<?> wildcardClass75 = obj74.getClass();
        tabelaHash69.insere("", (java.lang.Object) wildcardClass75);
        java.lang.Object obj78 = tabelaHash69.pesquisa("");
        java.lang.Class<?> wildcardClass79 = obj78.getClass();
        tabelaHash51.insere("", (java.lang.Object) wildcardClass79);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash51);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0L + "'", obj28, 0L);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertEquals(obj78.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj78), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj78), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        tabelaHash21.insere("", (java.lang.Object) 0L);
        java.lang.Object obj30 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj32 = tabelaHash21.pesquisa("");
        java.lang.Object obj34 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1.0f + "'", obj16, 1.0f);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0L + "'", obj32, 0L);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0L + "'", obj34, 0L);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) 10);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) '4');
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = null;
        tabelaHash0.insere("hi!", obj11);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0f + "'", obj14, 1.0f);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        java.lang.Object obj19 = tabelaHash13.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = obj19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0L + "'", obj9, 0L);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass22 = tabelaHash21.getClass();
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash21);
        tabelaHash17.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        java.lang.Class<?> wildcardClass26 = tabelaHash17.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) 0L);
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.imprime();
        tabelaHash35.imprime();
        tabelaHash35.insere("", (java.lang.Object) 0L);
        tabelaHash28.insere("", (java.lang.Object) 0L);
        tabelaHash18.insere("", (java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass45 = tabelaHash18.getClass();
        tabelaHash10.insere("", (java.lang.Object) tabelaHash18);
        tabelaHash10.insere("", (java.lang.Object) (short) 1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj12 = null;
        tabelaHash0.insere("", obj12);
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = obj15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash18.imprime();
        java.lang.Object obj27 = tabelaHash18.pesquisa("");
        tabelaHash5.insere("", obj27);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        tabelaHash5.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) 0L);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("");
        tabelaHash27.insere("", (java.lang.Object) 0.0d);
        tabelaHash27.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object obj39 = tabelaHash37.pesquisa("");
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash37);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object obj44 = tabelaHash42.pesquisa("hi!");
        tabelaHash42.imprime();
        tabelaHash42.imprime();
        tabelaHash42.insere("", (java.lang.Object) 0L);
        tabelaHash42.imprime();
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        java.lang.Object obj54 = tabelaHash52.pesquisa("hi!");
        tabelaHash52.imprime();
        tabelaHash52.imprime();
        tabelaHash52.imprime();
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        java.lang.Object obj61 = tabelaHash59.pesquisa("hi!");
        tabelaHash59.imprime();
        tabelaHash59.imprime();
        tabelaHash59.insere("", (java.lang.Object) 0L);
        tabelaHash52.insere("", (java.lang.Object) 0L);
        tabelaHash42.insere("", (java.lang.Object) 0L);
        tabelaHash42.retira("");
        tabelaHash27.insere("", (java.lang.Object) "");
        tabelaHash27.retira("hi!");
        tabelaHash27.retira("");
        java.lang.Object obj77 = tabelaHash27.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash27);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0L + "'", obj20, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj77);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.insere("", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash28.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash28.imprime();
        java.lang.Object obj37 = tabelaHash28.pesquisa("");
        tabelaHash28.retira("hi!");
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash28);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object obj44 = tabelaHash42.pesquisa("hi!");
        tabelaHash42.imprime();
        tabelaHash42.imprime();
        tabelaHash42.insere("", (java.lang.Object) 0L);
        tabelaHash42.imprime();
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        java.lang.Object obj54 = tabelaHash52.pesquisa("hi!");
        tabelaHash52.imprime();
        tabelaHash52.imprime();
        tabelaHash52.imprime();
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        java.lang.Object obj61 = tabelaHash59.pesquisa("hi!");
        tabelaHash59.imprime();
        tabelaHash59.imprime();
        tabelaHash59.insere("", (java.lang.Object) 0L);
        tabelaHash52.insere("", (java.lang.Object) 0L);
        tabelaHash42.insere("", (java.lang.Object) 0L);
        tabelaHash42.retira("");
        tabelaHash42.imprime();
        tabelaHash19.insere("", (java.lang.Object) tabelaHash42);
        tabelaHash19.retira("hi!");
        tabelaHash19.retira("");
        ds.TabelaHash tabelaHash78 = new ds.TabelaHash();
        java.lang.Object obj80 = tabelaHash78.pesquisa("hi!");
        tabelaHash78.imprime();
        tabelaHash78.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash78.imprime();
        java.lang.Object obj87 = tabelaHash78.pesquisa("");
        java.lang.Object obj89 = null;
        tabelaHash78.insere("hi!", obj89);
        java.lang.Object obj92 = tabelaHash78.pesquisa("");
        tabelaHash78.imprime();
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash78);
        tabelaHash10.insere("", (java.lang.Object) tabelaHash78);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNull(obj92);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash31.imprime();
        java.lang.Object obj40 = tabelaHash31.pesquisa("");
        java.lang.Object obj42 = null;
        tabelaHash31.insere("hi!", obj42);
        tabelaHash0.insere("", obj42);
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        java.lang.Object obj51 = tabelaHash49.pesquisa("hi!");
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        tabelaHash49.insere("", (java.lang.Object) 0L);
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        java.lang.Object obj64 = tabelaHash62.pesquisa("hi!");
        tabelaHash62.imprime();
        tabelaHash62.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash62.imprime();
        java.lang.Object obj71 = tabelaHash62.pesquisa("");
        tabelaHash49.insere("", obj71);
        tabelaHash49.imprime();
        tabelaHash49.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash49.retira("");
        java.lang.Object obj80 = tabelaHash49.pesquisa("hi!");
        tabelaHash0.insere("", obj80);
        java.lang.Object obj83 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + (short) 0 + "'", obj80, (short) 0);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + 0L + "'", obj83, 0L);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) 0L);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash29.insere("", (java.lang.Object) 0L);
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object obj41 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        java.lang.Object obj48 = tabelaHash46.pesquisa("hi!");
        tabelaHash46.imprime();
        tabelaHash46.imprime();
        tabelaHash46.insere("", (java.lang.Object) 0L);
        tabelaHash39.insere("", (java.lang.Object) 0L);
        tabelaHash29.insere("", (java.lang.Object) 0L);
        java.lang.Object obj57 = null;
        tabelaHash29.insere("hi!", obj57);
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        java.lang.Object obj62 = tabelaHash60.pesquisa("hi!");
        tabelaHash60.imprime();
        tabelaHash60.imprime();
        tabelaHash60.insere("", (java.lang.Object) 0L);
        java.lang.Object obj69 = tabelaHash60.pesquisa("");
        tabelaHash60.retira("");
        java.lang.Object obj73 = tabelaHash60.pesquisa("hi!");
        tabelaHash29.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash29.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash29);
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass81 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0L + "'", obj20, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 0L + "'", obj69, 0L);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) 0L);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash27.insere("", (java.lang.Object) 0L);
        tabelaHash27.imprime();
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object obj39 = tabelaHash37.pesquisa("hi!");
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash37);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash37);
        tabelaHash11.retira("hi!");
        java.lang.Class<?> wildcardClass47 = tabelaHash11.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0L + "'", obj20, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        java.lang.Class<?> wildcardClass15 = tabelaHash10.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        tabelaHash26.insere("", (java.lang.Object) 0L);
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object obj41 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.imprime();
        tabelaHash39.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash39.imprime();
        java.lang.Object obj48 = tabelaHash39.pesquisa("");
        tabelaHash26.insere("", obj48);
        tabelaHash26.imprime();
        tabelaHash26.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash26);
        java.lang.Object obj55 = tabelaHash26.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.insere("", (java.lang.Object) 1.0f);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) 0L);
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        java.lang.Object obj27 = tabelaHash16.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash29.insere("", (java.lang.Object) 0L);
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash29);
        tabelaHash29.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash29);
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object obj46 = tabelaHash44.pesquisa("hi!");
        tabelaHash44.imprime();
        java.lang.Object obj49 = tabelaHash44.pesquisa("hi!");
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        java.lang.Object obj53 = tabelaHash51.pesquisa("hi!");
        tabelaHash51.imprime();
        tabelaHash51.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash44.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj60 = tabelaHash44.pesquisa("hi!");
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        java.lang.Object obj64 = tabelaHash62.pesquisa("hi!");
        tabelaHash62.imprime();
        java.lang.Object obj67 = new java.lang.Object();
        java.lang.Class<?> wildcardClass68 = obj67.getClass();
        tabelaHash62.insere("", (java.lang.Object) wildcardClass68);
        java.lang.Object obj71 = tabelaHash62.pesquisa("");
        java.lang.Class<?> wildcardClass72 = obj71.getClass();
        tabelaHash44.insere("", (java.lang.Object) wildcardClass72);
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertEquals(obj71.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj71), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj71), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        java.lang.Object obj12 = tabelaHash7.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj12);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        java.lang.Object obj22 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        tabelaHash24.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash17.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj33 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.imprime();
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        tabelaHash35.insere("", (java.lang.Object) wildcardClass41);
        java.lang.Object obj44 = tabelaHash35.pesquisa("");
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        tabelaHash17.insere("", (java.lang.Object) wildcardClass45);
        tabelaHash17.retira("");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        java.lang.Object obj52 = tabelaHash50.pesquisa("hi!");
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
        java.lang.Object obj59 = tabelaHash57.pesquisa("hi!");
        tabelaHash57.imprime();
        tabelaHash57.imprime();
        tabelaHash57.insere("", (java.lang.Object) 0L);
        tabelaHash50.insere("", (java.lang.Object) 0L);
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        tabelaHash50.retira("");
        tabelaHash50.imprime();
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash50);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass73 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "class java.lang.Object");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1.0f + "'", obj16, 1.0f);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0f + "'", obj19, 1.0f);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 0L);
        tabelaHash25.insere("", (java.lang.Object) 0L);
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj50 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj52 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) 0L);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        tabelaHash34.insere("", (java.lang.Object) 0L);
        tabelaHash27.insere("", (java.lang.Object) 0L);
        tabelaHash11.insere("", (java.lang.Object) tabelaHash27);
        java.lang.Object obj45 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash11.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0L + "'", obj20, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        java.lang.Object obj36 = tabelaHash32.pesquisa("");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        java.lang.Object obj44 = tabelaHash38.pesquisa("hi!");
        java.lang.Class<?> wildcardClass45 = tabelaHash38.getClass();
        tabelaHash32.insere("hi!", (java.lang.Object) tabelaHash38);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash32);
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        java.lang.Object obj51 = tabelaHash49.pesquisa("hi!");
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        tabelaHash49.insere("", (java.lang.Object) 0L);
        tabelaHash49.imprime();
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        java.lang.Object obj61 = tabelaHash59.pesquisa("hi!");
        tabelaHash59.imprime();
        tabelaHash59.imprime();
        tabelaHash59.imprime();
        ds.TabelaHash tabelaHash66 = new ds.TabelaHash();
        java.lang.Object obj68 = tabelaHash66.pesquisa("hi!");
        tabelaHash66.imprime();
        tabelaHash66.imprime();
        tabelaHash66.insere("", (java.lang.Object) 0L);
        tabelaHash59.insere("", (java.lang.Object) 0L);
        tabelaHash49.insere("", (java.lang.Object) 0L);
        tabelaHash49.imprime();
        java.lang.Object obj78 = tabelaHash49.pesquisa("");
        ds.TabelaHash tabelaHash80 = new ds.TabelaHash();
        java.lang.Object obj82 = tabelaHash80.pesquisa("hi!");
        tabelaHash80.imprime();
        java.lang.Class<?> wildcardClass84 = tabelaHash80.getClass();
        tabelaHash49.insere("", (java.lang.Object) tabelaHash80);
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        java.lang.Class<?> wildcardClass88 = tabelaHash49.getClass();
        tabelaHash32.insere("", (java.lang.Object) wildcardClass88);
        tabelaHash32.retira("hi!");
        tabelaHash32.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0L + "'", obj28, 0L);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + 0L + "'", obj78, 0L);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash9.imprime();
        java.lang.Object obj18 = tabelaHash9.pesquisa("");
        tabelaHash9.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        tabelaHash9.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash9.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj18);
    }

    @Ignore
    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass32 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) 0L);
        java.lang.Object obj27 = tabelaHash18.pesquisa("");
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 0L);
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash32);
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object obj46 = tabelaHash44.pesquisa("hi!");
        tabelaHash44.imprime();
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        java.lang.Object obj51 = tabelaHash49.pesquisa("hi!");
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        tabelaHash49.insere("", (java.lang.Object) 0L);
        tabelaHash49.imprime();
        tabelaHash44.insere("hi!", (java.lang.Object) tabelaHash49);
        tabelaHash49.imprime();
        java.lang.Object obj61 = tabelaHash49.pesquisa("");
        java.lang.Class<?> wildcardClass62 = tabelaHash49.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash49);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash67 = new ds.TabelaHash();
        java.lang.Object obj69 = tabelaHash67.pesquisa("hi!");
        tabelaHash67.imprime();
        tabelaHash67.imprime();
        tabelaHash67.insere("", (java.lang.Object) 0L);
        java.lang.Object obj76 = tabelaHash67.pesquisa("hi!");
        java.lang.Object obj78 = tabelaHash67.pesquisa("");
        java.lang.Object obj80 = tabelaHash67.pesquisa("");
        java.lang.Class<?> wildcardClass81 = tabelaHash67.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash67);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0L + "'", obj27, 0L);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 0L + "'", obj61, 0L);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + 0L + "'", obj78, 0L);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + 0L + "'", obj80, 0L);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) 0L);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash27.insere("", (java.lang.Object) 0L);
        tabelaHash27.imprime();
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object obj39 = tabelaHash37.pesquisa("hi!");
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash37);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash37);
        tabelaHash37.imprime();
        java.lang.Object obj47 = tabelaHash37.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0L + "'", obj20, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        java.lang.Class<?> wildcardClass19 = tabelaHash10.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0L + "'", obj15, 0L);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj20 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 0L);
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        tabelaHash24.imprime();
        tabelaHash24.insere("", (java.lang.Object) 0L);
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash7.insere("", (java.lang.Object) 0L);
        java.lang.Object obj35 = tabelaHash7.pesquisa("");
        tabelaHash7.retira("");
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object obj41 = tabelaHash39.pesquisa("hi!");
        java.lang.Object obj43 = tabelaHash39.pesquisa("");
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        java.lang.Object obj47 = tabelaHash45.pesquisa("hi!");
        tabelaHash45.imprime();
        tabelaHash45.imprime();
        java.lang.Object obj51 = tabelaHash45.pesquisa("hi!");
        java.lang.Class<?> wildcardClass52 = tabelaHash45.getClass();
        tabelaHash39.insere("hi!", (java.lang.Object) tabelaHash45);
        tabelaHash7.insere("", (java.lang.Object) tabelaHash39);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass56 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0L + "'", obj35, 0L);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass5 = tabelaHash4.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        java.lang.Object obj21 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = obj23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(obj23);
    }

    @Ignore
    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) 0L);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash29.insere("", (java.lang.Object) 0L);
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object obj41 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        java.lang.Object obj48 = tabelaHash46.pesquisa("hi!");
        tabelaHash46.imprime();
        tabelaHash46.imprime();
        tabelaHash46.insere("", (java.lang.Object) 0L);
        tabelaHash39.insere("", (java.lang.Object) 0L);
        tabelaHash29.insere("", (java.lang.Object) 0L);
        java.lang.Object obj57 = null;
        tabelaHash29.insere("hi!", obj57);
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        java.lang.Object obj62 = tabelaHash60.pesquisa("hi!");
        tabelaHash60.imprime();
        tabelaHash60.imprime();
        tabelaHash60.insere("", (java.lang.Object) 0L);
        java.lang.Object obj69 = tabelaHash60.pesquisa("");
        tabelaHash60.retira("");
        java.lang.Object obj73 = tabelaHash60.pesquisa("hi!");
        tabelaHash29.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash29.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash29);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash29.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0L + "'", obj20, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 0L + "'", obj69, 0L);
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        java.lang.Object obj36 = tabelaHash32.pesquisa("");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        java.lang.Object obj44 = tabelaHash38.pesquisa("hi!");
        java.lang.Class<?> wildcardClass45 = tabelaHash38.getClass();
        tabelaHash32.insere("hi!", (java.lang.Object) tabelaHash38);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash32);
        java.lang.Object obj49 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        java.lang.Object obj53 = tabelaHash51.pesquisa("hi!");
        tabelaHash51.imprime();
        java.lang.Object obj56 = tabelaHash51.pesquisa("hi!");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        java.lang.Object obj60 = tabelaHash58.pesquisa("hi!");
        tabelaHash58.imprime();
        tabelaHash58.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash51.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj67 = tabelaHash51.pesquisa("hi!");
        ds.TabelaHash tabelaHash69 = new ds.TabelaHash();
        java.lang.Object obj71 = tabelaHash69.pesquisa("hi!");
        tabelaHash69.imprime();
        java.lang.Object obj74 = new java.lang.Object();
        java.lang.Class<?> wildcardClass75 = obj74.getClass();
        tabelaHash69.insere("", (java.lang.Object) wildcardClass75);
        java.lang.Object obj78 = tabelaHash69.pesquisa("");
        java.lang.Class<?> wildcardClass79 = obj78.getClass();
        tabelaHash51.insere("", (java.lang.Object) wildcardClass79);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash51);
        java.lang.Object obj83 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0L + "'", obj28, 0L);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertEquals(obj78.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj78), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj78), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(obj83);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash13.insere("", (java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass21 = tabelaHash13.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0L + "'", obj9, 0L);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.insere("", (java.lang.Object) 0.0d);
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass23 = tabelaHash14.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass23);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object obj6 = tabelaHash4.pesquisa("hi!");
        tabelaHash4.imprime();
        java.lang.Object obj9 = tabelaHash4.pesquisa("hi!");
        tabelaHash4.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.insere("", (java.lang.Object) 0.0d);
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = tabelaHash23.pesquisa("");
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash23);
        java.lang.Object obj28 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) '4');
        tabelaHash4.insere("", (java.lang.Object) '4');
// flaky:         tabelaHash4.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass22 = tabelaHash21.getClass();
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash21);
        tabelaHash17.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 0L);
        tabelaHash32.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash32);
        java.lang.Object obj43 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        java.lang.Object obj46 = tabelaHash27.pesquisa("");
// flaky:         tabelaHash27.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
    }

    @Ignore
    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) 0L);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("");
        tabelaHash27.insere("", (java.lang.Object) 0.0d);
        tabelaHash27.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object obj39 = tabelaHash37.pesquisa("");
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash37);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object obj44 = tabelaHash42.pesquisa("hi!");
        tabelaHash42.imprime();
        tabelaHash42.imprime();
        tabelaHash42.insere("", (java.lang.Object) 0L);
        tabelaHash42.imprime();
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        java.lang.Object obj54 = tabelaHash52.pesquisa("hi!");
        tabelaHash52.imprime();
        tabelaHash52.imprime();
        tabelaHash52.imprime();
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        java.lang.Object obj61 = tabelaHash59.pesquisa("hi!");
        tabelaHash59.imprime();
        tabelaHash59.imprime();
        tabelaHash59.insere("", (java.lang.Object) 0L);
        tabelaHash52.insere("", (java.lang.Object) 0L);
        tabelaHash42.insere("", (java.lang.Object) 0L);
        tabelaHash42.retira("");
        tabelaHash27.insere("", (java.lang.Object) "");
        tabelaHash27.retira("hi!");
        tabelaHash27.retira("");
        java.lang.Object obj77 = tabelaHash27.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash27);
        java.lang.Class<?> wildcardClass79 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0L + "'", obj20, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Ignore
    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = null;
        tabelaHash0.insere("hi!", obj28);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.insere("", (java.lang.Object) 0L);
        java.lang.Object obj40 = tabelaHash31.pesquisa("");
        tabelaHash31.retira("");
        java.lang.Object obj44 = tabelaHash31.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0L + "'", obj40, 0L);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        java.lang.Object obj36 = tabelaHash32.pesquisa("");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        java.lang.Object obj44 = tabelaHash38.pesquisa("hi!");
        java.lang.Class<?> wildcardClass45 = tabelaHash38.getClass();
        tabelaHash32.insere("hi!", (java.lang.Object) tabelaHash38);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash32);
        java.lang.Object obj49 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        java.lang.Object obj53 = tabelaHash51.pesquisa("hi!");
        tabelaHash51.imprime();
        java.lang.Object obj56 = tabelaHash51.pesquisa("hi!");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        java.lang.Object obj60 = tabelaHash58.pesquisa("hi!");
        tabelaHash58.imprime();
        tabelaHash58.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash51.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj67 = tabelaHash51.pesquisa("hi!");
        ds.TabelaHash tabelaHash69 = new ds.TabelaHash();
        java.lang.Object obj71 = tabelaHash69.pesquisa("hi!");
        tabelaHash69.imprime();
        java.lang.Object obj74 = new java.lang.Object();
        java.lang.Class<?> wildcardClass75 = obj74.getClass();
        tabelaHash69.insere("", (java.lang.Object) wildcardClass75);
        java.lang.Object obj78 = tabelaHash69.pesquisa("");
        java.lang.Class<?> wildcardClass79 = obj78.getClass();
        tabelaHash51.insere("", (java.lang.Object) wildcardClass79);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash51);
        java.lang.Class<?> wildcardClass82 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0L + "'", obj28, 0L);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertEquals(obj78.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj78), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj78), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = null;
        tabelaHash0.insere("hi!", obj11);
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1.0f + "'", obj17, 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        tabelaHash0.insere("", obj13);
        tabelaHash0.imprime();
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0L + "'", obj9, 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) 0L);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash27.insere("", (java.lang.Object) 0L);
        tabelaHash27.imprime();
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object obj39 = tabelaHash37.pesquisa("hi!");
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object obj46 = tabelaHash44.pesquisa("hi!");
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash44.insere("", (java.lang.Object) 0L);
        tabelaHash37.insere("", (java.lang.Object) 0L);
        tabelaHash27.insere("", (java.lang.Object) 0L);
        java.lang.Object obj55 = null;
        tabelaHash27.insere("hi!", obj55);
        java.lang.Object obj58 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.retira("");
        tabelaHash27.retira("hi!");
        tabelaHash11.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj65 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0L + "'", obj20, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + "hi!" + "'", obj65, "hi!");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class java.lang.Object");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass5 = tabelaHash4.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) 1);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.insere("", (java.lang.Object) 0L);
        tabelaHash19.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj30 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) 0L);
        tabelaHash33.imprime();
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        java.lang.Object obj45 = tabelaHash43.pesquisa("hi!");
        tabelaHash43.imprime();
        tabelaHash43.imprime();
        tabelaHash43.imprime();
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        java.lang.Object obj52 = tabelaHash50.pesquisa("hi!");
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        tabelaHash50.insere("", (java.lang.Object) 0L);
        tabelaHash43.insere("", (java.lang.Object) 0L);
        tabelaHash33.insere("", (java.lang.Object) 0L);
        java.lang.Object obj61 = tabelaHash33.pesquisa("");
        tabelaHash33.retira("");
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        java.lang.Object obj67 = tabelaHash65.pesquisa("hi!");
        java.lang.Object obj69 = tabelaHash65.pesquisa("");
        ds.TabelaHash tabelaHash71 = new ds.TabelaHash();
        java.lang.Object obj73 = tabelaHash71.pesquisa("hi!");
        tabelaHash71.imprime();
        tabelaHash71.imprime();
        java.lang.Object obj77 = tabelaHash71.pesquisa("hi!");
        java.lang.Class<?> wildcardClass78 = tabelaHash71.getClass();
        tabelaHash65.insere("hi!", (java.lang.Object) tabelaHash71);
        tabelaHash33.insere("", (java.lang.Object) tabelaHash65);
        tabelaHash33.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash14.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 0L + "'", obj61, 0L);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("", (java.lang.Object) 10.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        java.lang.Object obj36 = tabelaHash32.pesquisa("");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        java.lang.Object obj44 = tabelaHash38.pesquisa("hi!");
        java.lang.Class<?> wildcardClass45 = tabelaHash38.getClass();
        tabelaHash32.insere("hi!", (java.lang.Object) tabelaHash38);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        java.lang.Object obj54 = tabelaHash52.pesquisa("hi!");
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass57 = tabelaHash56.getClass();
        tabelaHash52.insere("hi!", (java.lang.Object) tabelaHash56);
        tabelaHash52.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash52);
        java.lang.Class<?> wildcardClass61 = tabelaHash52.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0L + "'", obj28, 0L);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) 0L);
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object obj24 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash29.insere("", (java.lang.Object) 0L);
        tabelaHash22.insere("", (java.lang.Object) 0L);
        tabelaHash12.insere("", (java.lang.Object) 0L);
        java.lang.Object obj40 = tabelaHash12.pesquisa("");
        tabelaHash12.retira("");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object obj46 = tabelaHash44.pesquisa("hi!");
        java.lang.Object obj48 = tabelaHash44.pesquisa("");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        java.lang.Object obj52 = tabelaHash50.pesquisa("hi!");
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        java.lang.Object obj56 = tabelaHash50.pesquisa("hi!");
        java.lang.Class<?> wildcardClass57 = tabelaHash50.getClass();
        tabelaHash44.insere("hi!", (java.lang.Object) tabelaHash50);
        tabelaHash12.insere("", (java.lang.Object) tabelaHash44);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0L + "'", obj40, 0L);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("", (java.lang.Object) 10.0f);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) 0L);
        tabelaHash11.retira("");
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        tabelaHash24.insere("", (java.lang.Object) wildcardClass30);
        java.lang.Object obj33 = tabelaHash24.pesquisa("");
        java.lang.Class<?> wildcardClass34 = tabelaHash24.getClass();
        tabelaHash11.insere("hi!", (java.lang.Object) wildcardClass34);
        tabelaHash11.retira("hi!");
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object obj41 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        tabelaHash39.insere("", (java.lang.Object) 0L);
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        java.lang.Object obj54 = tabelaHash52.pesquisa("hi!");
        tabelaHash52.imprime();
        tabelaHash52.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash52.imprime();
        java.lang.Object obj61 = tabelaHash52.pesquisa("");
        tabelaHash39.insere("", obj61);
        tabelaHash39.imprime();
        tabelaHash39.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash39.retira("");
        java.lang.Object obj70 = tabelaHash39.pesquisa("hi!");
        tabelaHash11.insere("hi!", obj70);
        tabelaHash0.insere("hi!", obj70);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + (short) 0 + "'", obj70, (short) 0);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 0L);
        tabelaHash25.insere("", (java.lang.Object) 0L);
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        java.lang.Object obj50 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.imprime();
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        tabelaHash48.insere("", (java.lang.Object) wildcardClass54);
        java.lang.Object obj57 = tabelaHash48.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash48);
        java.lang.Class<?> wildcardClass59 = tabelaHash48.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) 0L);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        tabelaHash34.insere("", (java.lang.Object) 0L);
        tabelaHash27.insere("", (java.lang.Object) 0L);
        tabelaHash11.insere("", (java.lang.Object) tabelaHash27);
// flaky:         tabelaHash27.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0L + "'", obj20, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        java.lang.Class<?> wildcardClass18 = tabelaHash10.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        tabelaHash23.insere("", (java.lang.Object) 0L);
        tabelaHash23.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash23.imprime();
        java.lang.Object obj35 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        tabelaHash23.retira("");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = tabelaHash40.pesquisa("hi!");
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        tabelaHash40.insere("", (java.lang.Object) 0L);
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        java.lang.Object obj55 = tabelaHash53.pesquisa("hi!");
        tabelaHash53.imprime();
        tabelaHash53.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash53.imprime();
        java.lang.Object obj62 = tabelaHash53.pesquisa("");
        tabelaHash40.insere("", obj62);
        tabelaHash40.imprime();
        tabelaHash40.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash40.retira("");
        java.lang.Object obj71 = tabelaHash40.pesquisa("hi!");
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash40);
        java.lang.Object obj77 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0L + "'", obj35, 0L);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + (short) 0 + "'", obj71, (short) 0);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 0.0d + "'", obj77, 0.0d);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass5 = tabelaHash4.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        tabelaHash13.insere("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        java.lang.Class<?> wildcardClass23 = tabelaHash13.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass23);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        tabelaHash26.insere("", (java.lang.Object) 0L);
        tabelaHash26.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.imprime();
        tabelaHash36.imprime();
        tabelaHash36.imprime();
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        java.lang.Object obj45 = tabelaHash43.pesquisa("hi!");
        tabelaHash43.imprime();
        tabelaHash43.imprime();
        tabelaHash43.insere("", (java.lang.Object) 0L);
        tabelaHash36.insere("", (java.lang.Object) 0L);
        tabelaHash26.insere("", (java.lang.Object) 0L);
        java.lang.Object obj54 = null;
        tabelaHash26.insere("hi!", obj54);
        java.lang.Object obj57 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.retira("");
        tabelaHash26.retira("hi!");
        tabelaHash26.imprime();
        java.lang.Object obj64 = tabelaHash26.pesquisa("");
        tabelaHash0.insere("", obj64);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj20 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = obj24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = null;
        tabelaHash0.insere("hi!", obj28);
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj38 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj41 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        tabelaHash13.insere("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        java.lang.Class<?> wildcardClass23 = tabelaHash13.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass23);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object obj6 = tabelaHash4.pesquisa("hi!");
        tabelaHash4.imprime();
        java.lang.Object obj9 = tabelaHash4.pesquisa("hi!");
        tabelaHash4.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 0L);
        tabelaHash25.insere("", (java.lang.Object) 0L);
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.retira("");
        java.lang.Object obj45 = tabelaHash15.pesquisa("");
        tabelaHash0.insere("hi!", obj45);
        java.lang.Object obj48 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash13.insere("", (java.lang.Object) 0L);
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash13.imprime();
        java.lang.Object obj25 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        java.lang.Class<?> wildcardClass28 = tabelaHash13.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0L + "'", obj25, 0L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "class java.lang.Object");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = null;
        tabelaHash0.insere("hi!", obj4);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash17.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash17);
        java.lang.Object obj28 = tabelaHash17.pesquisa("");
        tabelaHash17.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass35 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0L + "'", obj28, 0L);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) 0L);
        tabelaHash16.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) 0L);
        tabelaHash26.insere("", (java.lang.Object) 0L);
        tabelaHash16.insere("", (java.lang.Object) 0L);
        java.lang.Object obj44 = tabelaHash16.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Class<?> wildcardClass46 = tabelaHash16.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 0L + "'", obj44, 0L);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) 0L);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        tabelaHash34.insere("", (java.lang.Object) 0L);
        tabelaHash27.insere("", (java.lang.Object) 0L);
        tabelaHash11.insere("", (java.lang.Object) tabelaHash27);
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object obj49 = tabelaHash47.pesquisa("hi!");
        java.lang.Object obj51 = null;
        tabelaHash47.insere("hi!", obj51);
        tabelaHash47.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj57 = tabelaHash47.pesquisa("hi!");
        tabelaHash11.insere("", obj57);
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0L + "'", obj20, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj16 = tabelaHash5.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) 0L);
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Class<?> wildcardClass35 = tabelaHash18.getClass();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        java.lang.Class<?> wildcardClass41 = tabelaHash38.getClass();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash38);
        java.lang.Object obj44 = tabelaHash38.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0L + "'", obj16, 0L);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        tabelaHash10.insere("hi!", (java.lang.Object) (short) 10);
        java.lang.Object obj23 = tabelaHash10.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) 10 + "'", obj23, (short) 10);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj20 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass21 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        tabelaHash23.insere("", (java.lang.Object) 0L);
        tabelaHash23.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash23.imprime();
        java.lang.Object obj35 = tabelaHash23.pesquisa("");
        java.lang.Class<?> wildcardClass36 = tabelaHash23.getClass();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash23);
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object obj41 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.imprime();
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        tabelaHash39.insere("", (java.lang.Object) wildcardClass45);
        java.lang.Object obj48 = tabelaHash39.pesquisa("");
        tabelaHash39.imprime();
        java.lang.Object obj51 = tabelaHash39.pesquisa("");
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        java.lang.Object obj55 = tabelaHash53.pesquisa("hi!");
        tabelaHash53.imprime();
        java.lang.Object obj58 = new java.lang.Object();
        java.lang.Class<?> wildcardClass59 = obj58.getClass();
        tabelaHash53.insere("", (java.lang.Object) wildcardClass59);
        java.lang.Object obj62 = tabelaHash53.pesquisa("");
        ds.TabelaHash tabelaHash64 = new ds.TabelaHash();
        java.lang.Object obj66 = tabelaHash64.pesquisa("hi!");
        tabelaHash64.imprime();
        java.lang.Object obj69 = new java.lang.Object();
        java.lang.Class<?> wildcardClass70 = obj69.getClass();
        tabelaHash64.insere("", (java.lang.Object) wildcardClass70);
        java.lang.Object obj73 = tabelaHash64.pesquisa("");
        tabelaHash53.insere("", obj73);
        tabelaHash39.insere("hi!", (java.lang.Object) tabelaHash53);
        tabelaHash23.insere("", (java.lang.Object) tabelaHash53);
        java.lang.Object obj78 = tabelaHash23.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0L + "'", obj35, 0L);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "class java.lang.Object");
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals(obj62.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "class java.lang.Object");
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertEquals(obj73.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj73), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj73), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + 0L + "'", obj78, 0L);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0L + "'", obj9, 0L);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) 0L);
        tabelaHash28.retira("");
        tabelaHash15.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = tabelaHash40.pesquisa("hi!");
        tabelaHash40.imprime();
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        java.lang.Object obj47 = tabelaHash45.pesquisa("hi!");
        tabelaHash45.imprime();
        tabelaHash45.imprime();
        tabelaHash45.insere("", (java.lang.Object) 0L);
        tabelaHash45.imprime();
        tabelaHash40.insere("hi!", (java.lang.Object) tabelaHash45);
        java.lang.Object obj56 = tabelaHash45.pesquisa("");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        java.lang.Object obj60 = tabelaHash58.pesquisa("hi!");
        tabelaHash58.imprime();
        tabelaHash58.imprime();
        tabelaHash58.insere("", (java.lang.Object) 0L);
        tabelaHash58.imprime();
        ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
        java.lang.Object obj70 = tabelaHash68.pesquisa("hi!");
        tabelaHash68.imprime();
        tabelaHash68.imprime();
        tabelaHash68.imprime();
        tabelaHash58.insere("hi!", (java.lang.Object) tabelaHash68);
        java.lang.Class<?> wildcardClass75 = tabelaHash58.getClass();
        tabelaHash45.insere("", (java.lang.Object) tabelaHash58);
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash45);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash15.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 0L + "'", obj56, 0L);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        tabelaHash0.retira("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) 0L);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash27.insere("", (java.lang.Object) 0L);
        tabelaHash27.imprime();
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object obj39 = tabelaHash37.pesquisa("hi!");
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash37);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash37);
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        tabelaHash37.insere("hi!", (java.lang.Object) wildcardClass47);
        tabelaHash37.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0L + "'", obj20, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("", (java.lang.Object) 10.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) 0L);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        tabelaHash34.insere("", (java.lang.Object) 0L);
        tabelaHash27.insere("", (java.lang.Object) 0L);
        tabelaHash11.insere("", (java.lang.Object) tabelaHash27);
        java.lang.Object obj45 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash11.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0L + "'", obj20, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) 0L);
        tabelaHash21.insere("", (java.lang.Object) 0L);
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash21);
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object obj43 = tabelaHash41.pesquisa("hi!");
        tabelaHash41.imprime();
        tabelaHash41.imprime();
        tabelaHash41.insere("", (java.lang.Object) 0L);
        tabelaHash41.retira("");
        java.lang.Object obj52 = tabelaHash41.pesquisa("hi!");
        tabelaHash41.imprime();
        java.lang.Object obj55 = tabelaHash41.pesquisa("");
        tabelaHash21.insere("hi!", (java.lang.Object) "");
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass21 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 1.0f + "'", obj16, 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        tabelaHash18.insere("", (java.lang.Object) wildcardClass24);
        java.lang.Object obj27 = tabelaHash18.pesquisa("");
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass28);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = tabelaHash40.pesquisa("hi!");
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        tabelaHash40.insere("", (java.lang.Object) 0L);
        tabelaHash33.insere("", (java.lang.Object) 0L);
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.retira("");
        tabelaHash33.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash33);
        java.lang.Object obj56 = tabelaHash33.pesquisa("");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        java.lang.Object obj60 = tabelaHash58.pesquisa("hi!");
        tabelaHash58.imprime();
        java.lang.Object obj63 = tabelaHash58.pesquisa("hi!");
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        java.lang.Object obj67 = tabelaHash65.pesquisa("hi!");
        tabelaHash65.imprime();
        tabelaHash65.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash58.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj74 = tabelaHash58.pesquisa("hi!");
        tabelaHash58.retira("");
        tabelaHash33.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj74);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash13.imprime();
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        tabelaHash13.retira("hi!");
        tabelaHash13.imprime();
        java.lang.Object obj27 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 0L);
        tabelaHash32.imprime();
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object obj44 = tabelaHash42.pesquisa("hi!");
        tabelaHash42.imprime();
        tabelaHash42.imprime();
        tabelaHash42.imprime();
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        java.lang.Object obj51 = tabelaHash49.pesquisa("hi!");
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        tabelaHash49.insere("", (java.lang.Object) 0L);
        tabelaHash42.insere("", (java.lang.Object) 0L);
        tabelaHash32.insere("", (java.lang.Object) 0L);
        java.lang.Object obj60 = tabelaHash32.pesquisa("");
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash32);
// flaky:         tabelaHash13.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 0L + "'", obj60, 0L);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj16 = tabelaHash5.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) 0L);
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Class<?> wildcardClass35 = tabelaHash18.getClass();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash18);
        java.lang.Object obj38 = tabelaHash18.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0L + "'", obj16, 0L);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0L + "'", obj38, 0L);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash5.insere("", (java.lang.Object) (short) 100);
        tabelaHash5.imprime();
        java.lang.Object obj20 = null;
        tabelaHash5.insere("", obj20);
        java.lang.Object obj23 = tabelaHash5.pesquisa("");
        java.lang.Class<?> wildcardClass24 = tabelaHash5.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0L + "'", obj23, 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash13.imprime();
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        tabelaHash13.retira("hi!");
        tabelaHash13.imprime();
        java.lang.Object obj27 = tabelaHash13.pesquisa("hi!");
        java.lang.Object obj29 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        java.lang.Class<?> wildcardClass32 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj18 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj20 = tabelaHash10.pesquisa("");
        java.lang.Object obj22 = tabelaHash10.pesquisa("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        tabelaHash24.imprime();
        tabelaHash24.insere("", (java.lang.Object) 0L);
        tabelaHash24.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object obj43 = tabelaHash41.pesquisa("hi!");
        tabelaHash41.imprime();
        tabelaHash41.imprime();
        tabelaHash41.insere("", (java.lang.Object) 0L);
        tabelaHash34.insere("", (java.lang.Object) 0L);
        tabelaHash24.insere("", (java.lang.Object) 0L);
        tabelaHash24.imprime();
        java.lang.Object obj53 = tabelaHash24.pesquisa("");
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        java.lang.Object obj57 = tabelaHash55.pesquisa("hi!");
        tabelaHash55.imprime();
        java.lang.Class<?> wildcardClass59 = tabelaHash55.getClass();
        tabelaHash24.insere("", (java.lang.Object) tabelaHash55);
        tabelaHash10.insere("", (java.lang.Object) tabelaHash24);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash24.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 0L + "'", obj53, 0L);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash13.imprime();
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        tabelaHash13.retira("hi!");
        tabelaHash13.imprime();
        java.lang.Object obj27 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash0.imprime();
        java.lang.Object obj33 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0L + "'", obj33, 0L);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) 0L);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash29.insere("", (java.lang.Object) 0L);
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object obj41 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        java.lang.Object obj48 = tabelaHash46.pesquisa("hi!");
        tabelaHash46.imprime();
        tabelaHash46.imprime();
        tabelaHash46.insere("", (java.lang.Object) 0L);
        tabelaHash39.insere("", (java.lang.Object) 0L);
        tabelaHash29.insere("", (java.lang.Object) 0L);
        java.lang.Object obj57 = null;
        tabelaHash29.insere("hi!", obj57);
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        java.lang.Object obj62 = tabelaHash60.pesquisa("hi!");
        tabelaHash60.imprime();
        tabelaHash60.imprime();
        tabelaHash60.insere("", (java.lang.Object) 0L);
        java.lang.Object obj69 = tabelaHash60.pesquisa("");
        tabelaHash60.retira("");
        java.lang.Object obj73 = tabelaHash60.pesquisa("hi!");
        tabelaHash29.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash29.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash29);
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0L + "'", obj20, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 0L + "'", obj69, 0L);
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) '4');
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + '4' + "'", obj10, '4');
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = null;
        tabelaHash0.insere("hi!", obj11);
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        tabelaHash23.insere("", (java.lang.Object) 0L);
        tabelaHash23.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash23.insere("", (java.lang.Object) (short) 100);
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object obj39 = tabelaHash37.pesquisa("hi!");
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash37.insere("", (java.lang.Object) 0L);
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        java.lang.Object obj52 = tabelaHash50.pesquisa("hi!");
        tabelaHash50.imprime();
        tabelaHash50.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash50.imprime();
        java.lang.Object obj59 = tabelaHash50.pesquisa("");
        tabelaHash37.insere("", obj59);
        tabelaHash37.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash37);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash13.imprime();
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        tabelaHash13.retira("hi!");
        tabelaHash13.imprime();
        java.lang.Object obj27 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash13.imprime();
        java.lang.Class<?> wildcardClass32 = tabelaHash13.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash13.insere("", (java.lang.Object) 0L);
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash13.imprime();
        java.lang.Object obj25 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash29.insere("", (java.lang.Object) 0L);
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object obj41 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        java.lang.Object obj48 = tabelaHash46.pesquisa("hi!");
        tabelaHash46.imprime();
        tabelaHash46.imprime();
        tabelaHash46.insere("", (java.lang.Object) 0L);
        tabelaHash39.insere("", (java.lang.Object) 0L);
        tabelaHash29.insere("", (java.lang.Object) 0L);
        tabelaHash29.imprime();
        java.lang.Object obj58 = tabelaHash29.pesquisa("");
        java.lang.Object obj60 = tabelaHash29.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass62 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0L + "'", obj25, 0L);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 0L + "'", obj58, 0L);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 0L + "'", obj60, 0L);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("", (java.lang.Object) 10.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = null;
        tabelaHash0.insere("hi!", obj28);
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        java.lang.Object obj43 = tabelaHash38.pesquisa("hi!");
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        java.lang.Object obj47 = tabelaHash45.pesquisa("hi!");
        tabelaHash45.imprime();
        tabelaHash45.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash38.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj54 = tabelaHash38.pesquisa("hi!");
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        java.lang.Object obj58 = tabelaHash56.pesquisa("hi!");
        tabelaHash56.imprime();
        java.lang.Object obj61 = new java.lang.Object();
        java.lang.Class<?> wildcardClass62 = obj61.getClass();
        tabelaHash56.insere("", (java.lang.Object) wildcardClass62);
        java.lang.Object obj65 = tabelaHash56.pesquisa("");
        java.lang.Class<?> wildcardClass66 = obj65.getClass();
        tabelaHash38.insere("", (java.lang.Object) wildcardClass66);
        tabelaHash38.retira("");
        ds.TabelaHash tabelaHash71 = new ds.TabelaHash();
        java.lang.Object obj73 = tabelaHash71.pesquisa("hi!");
        tabelaHash71.imprime();
        tabelaHash71.imprime();
        tabelaHash71.imprime();
        ds.TabelaHash tabelaHash78 = new ds.TabelaHash();
        java.lang.Object obj80 = tabelaHash78.pesquisa("hi!");
        tabelaHash78.imprime();
        tabelaHash78.imprime();
        tabelaHash78.insere("", (java.lang.Object) 0L);
        tabelaHash71.insere("", (java.lang.Object) 0L);
        tabelaHash71.imprime();
        tabelaHash71.imprime();
        tabelaHash71.retira("");
        tabelaHash71.imprime();
        tabelaHash38.insere("hi!", (java.lang.Object) tabelaHash71);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertEquals(obj65.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj65), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj65), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) 10);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash13.insere("", (java.lang.Object) 0L);
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) 1.0f);
        java.lang.Object obj33 = tabelaHash25.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 1.0f + "'", obj33, 1.0f);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.imprime();
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        tabelaHash19.insere("", (java.lang.Object) wildcardClass25);
        java.lang.Object obj28 = tabelaHash19.pesquisa("");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.imprime();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        tabelaHash30.insere("", (java.lang.Object) wildcardClass36);
        java.lang.Object obj39 = tabelaHash30.pesquisa("");
        tabelaHash19.insere("", obj39);
        tabelaHash19.retira("");
        java.lang.Object obj44 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "class java.lang.Object");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "class java.lang.Object");
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        tabelaHash11.insere("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("", obj20);
        tabelaHash0.retira("");
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
        java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        java.lang.Object obj21 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 10);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        tabelaHash26.insere("", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.imprime();
        tabelaHash35.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash35.imprime();
        java.lang.Object obj44 = tabelaHash35.pesquisa("");
        tabelaHash35.retira("hi!");
        tabelaHash26.insere("hi!", (java.lang.Object) tabelaHash35);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash26);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        java.lang.Object obj33 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.imprime();
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = tabelaHash40.pesquisa("hi!");
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        tabelaHash40.insere("", (java.lang.Object) 0L);
        tabelaHash40.imprime();
        tabelaHash35.insere("hi!", (java.lang.Object) tabelaHash40);
        java.lang.Object obj51 = tabelaHash35.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object obj54 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0L + "'", obj31, 0L);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0L + "'", obj33, 0L);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 0L + "'", obj54, 0L);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass5 = tabelaHash4.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash13.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj29 = tabelaHash13.pesquisa("hi!");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.imprime();
        tabelaHash36.imprime();
        tabelaHash36.insere("", (java.lang.Object) 0L);
        tabelaHash36.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash36);
        java.lang.Object obj47 = tabelaHash36.pesquisa("");
        tabelaHash36.insere("", (java.lang.Object) 100);
        tabelaHash13.insere("hi!", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0L + "'", obj47, 0L);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass21 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj16 = tabelaHash5.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) 0L);
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Class<?> wildcardClass35 = tabelaHash18.getClass();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        java.lang.Class<?> wildcardClass41 = tabelaHash38.getClass();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash38);
        java.lang.Class<?> wildcardClass43 = tabelaHash38.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0L + "'", obj16, 0L);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass32 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash10.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        java.lang.Object obj36 = null;
        tabelaHash32.insere("hi!", obj36);
        java.lang.Object obj39 = tabelaHash32.pesquisa("");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object obj43 = tabelaHash41.pesquisa("hi!");
        tabelaHash41.imprime();
        tabelaHash41.imprime();
        tabelaHash41.insere("", (java.lang.Object) 0L);
        tabelaHash41.imprime();
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        java.lang.Object obj53 = tabelaHash51.pesquisa("hi!");
        tabelaHash51.imprime();
        tabelaHash51.imprime();
        tabelaHash51.imprime();
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        java.lang.Object obj60 = tabelaHash58.pesquisa("hi!");
        tabelaHash58.imprime();
        tabelaHash58.imprime();
        tabelaHash58.insere("", (java.lang.Object) 0L);
        tabelaHash51.insere("", (java.lang.Object) 0L);
        tabelaHash41.insere("", (java.lang.Object) 0L);
        java.lang.Object obj69 = tabelaHash41.pesquisa("");
        tabelaHash32.insere("hi!", (java.lang.Object) "");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0L + "'", obj28, 0L);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 0L + "'", obj69, 0L);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        java.lang.Object obj21 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        tabelaHash23.insere("", (java.lang.Object) 0L);
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = tabelaHash40.pesquisa("hi!");
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        tabelaHash40.insere("", (java.lang.Object) 0L);
        tabelaHash33.insere("", (java.lang.Object) 0L);
        tabelaHash23.insere("", (java.lang.Object) 0L);
        tabelaHash23.imprime();
        java.lang.Object obj52 = tabelaHash23.pesquisa("");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        java.lang.Object obj56 = tabelaHash54.pesquisa("hi!");
        tabelaHash54.imprime();
        tabelaHash54.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash54.imprime();
        java.lang.Object obj63 = tabelaHash54.pesquisa("");
        java.lang.Object obj65 = null;
        tabelaHash54.insere("hi!", obj65);
        tabelaHash23.insere("", obj65);
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 0L + "'", obj52, 0L);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        java.lang.Object obj21 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass15 = tabelaHash14.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass15);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        tabelaHash11.insere("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("", obj20);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.insere("", (java.lang.Object) 0L);
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        tabelaHash38.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash38.imprime();
        java.lang.Object obj47 = tabelaHash38.pesquisa("");
        tabelaHash25.insere("", obj47);
        tabelaHash25.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass53 = tabelaHash25.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash25);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        java.lang.Object obj21 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        tabelaHash23.insere("", (java.lang.Object) 0L);
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = tabelaHash40.pesquisa("hi!");
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        tabelaHash40.insere("", (java.lang.Object) 0L);
        tabelaHash33.insere("", (java.lang.Object) 0L);
        tabelaHash23.insere("", (java.lang.Object) 0L);
        tabelaHash23.imprime();
        java.lang.Object obj52 = tabelaHash23.pesquisa("");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        java.lang.Object obj56 = tabelaHash54.pesquisa("hi!");
        tabelaHash54.imprime();
        tabelaHash54.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash54.imprime();
        java.lang.Object obj63 = tabelaHash54.pesquisa("");
        java.lang.Object obj65 = null;
        tabelaHash54.insere("hi!", obj65);
        tabelaHash23.insere("", obj65);
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 0L + "'", obj52, 0L);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object obj6 = tabelaHash4.pesquisa("hi!");
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash4.insere("", (java.lang.Object) 0L);
        java.lang.Object obj13 = tabelaHash4.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) 0L);
        java.lang.Object obj24 = tabelaHash15.pesquisa("");
        tabelaHash15.retira("");
        java.lang.Object obj28 = tabelaHash15.pesquisa("hi!");
        tabelaHash4.insere("hi!", (java.lang.Object) tabelaHash15);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        tabelaHash38.insere("", (java.lang.Object) 0L);
        tabelaHash31.insere("", (java.lang.Object) 0L);
        tabelaHash15.insere("", (java.lang.Object) tabelaHash31);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass49 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0L + "'", obj24, 0L);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj20 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj26 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) 0L);
        tabelaHash28.retira("");
        tabelaHash15.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = tabelaHash40.pesquisa("hi!");
        tabelaHash40.imprime();
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        java.lang.Object obj47 = tabelaHash45.pesquisa("hi!");
        tabelaHash45.imprime();
        tabelaHash45.imprime();
        tabelaHash45.insere("", (java.lang.Object) 0L);
        tabelaHash45.imprime();
        tabelaHash40.insere("hi!", (java.lang.Object) tabelaHash45);
        java.lang.Object obj56 = tabelaHash45.pesquisa("");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        java.lang.Object obj60 = tabelaHash58.pesquisa("hi!");
        tabelaHash58.imprime();
        tabelaHash58.imprime();
        tabelaHash58.insere("", (java.lang.Object) 0L);
        tabelaHash58.imprime();
        ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
        java.lang.Object obj70 = tabelaHash68.pesquisa("hi!");
        tabelaHash68.imprime();
        tabelaHash68.imprime();
        tabelaHash68.imprime();
        tabelaHash58.insere("hi!", (java.lang.Object) tabelaHash68);
        java.lang.Class<?> wildcardClass75 = tabelaHash58.getClass();
        tabelaHash45.insere("", (java.lang.Object) tabelaHash58);
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash45);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash15.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 0L + "'", obj56, 0L);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 0L);
        tabelaHash25.insere("", (java.lang.Object) 0L);
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj50 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj52 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash5.imprime();
        java.lang.Object obj17 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash5.retira("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object obj24 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash22.insere("", (java.lang.Object) 0L);
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.imprime();
        tabelaHash35.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash35.imprime();
        java.lang.Object obj44 = tabelaHash35.pesquisa("");
        tabelaHash22.insere("", obj44);
        tabelaHash22.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash22.retira("");
        java.lang.Object obj53 = tabelaHash22.pesquisa("hi!");
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash22);
        java.lang.Object obj56 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0L + "'", obj17, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (short) 0 + "'", obj53, (short) 0);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        java.lang.Object obj33 = tabelaHash0.pesquisa("");
        java.lang.Object obj35 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0L + "'", obj31, 0L);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0L + "'", obj33, 0L);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0L + "'", obj35, 0L);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = null;
        tabelaHash0.insere("hi!", obj4);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash17.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash17);
        java.lang.Object obj28 = tabelaHash17.pesquisa("");
        tabelaHash17.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        tabelaHash34.insere("", (java.lang.Object) 0L);
        tabelaHash34.imprime();
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object obj46 = tabelaHash44.pesquisa("hi!");
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        java.lang.Object obj53 = tabelaHash51.pesquisa("hi!");
        tabelaHash51.imprime();
        tabelaHash51.imprime();
        tabelaHash51.insere("", (java.lang.Object) 0L);
        tabelaHash44.insere("", (java.lang.Object) 0L);
        tabelaHash34.insere("", (java.lang.Object) 0L);
        tabelaHash34.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash34);
        java.lang.Object obj64 = tabelaHash34.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0L + "'", obj28, 0L);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        tabelaHash23.insere("", (java.lang.Object) 0L);
        tabelaHash23.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash23.imprime();
        java.lang.Object obj35 = tabelaHash23.pesquisa("");
        java.lang.Class<?> wildcardClass36 = tabelaHash23.getClass();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash10.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash10.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0L + "'", obj35, 0L);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) 0L);
        java.lang.Object obj27 = tabelaHash18.pesquisa("hi!");
        java.lang.Object obj29 = tabelaHash18.pesquisa("");
        java.lang.Object obj31 = tabelaHash18.pesquisa("");
        tabelaHash10.insere("", obj31);
        tabelaHash10.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0L + "'", obj31, 0L);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 0L);
        tabelaHash25.insere("", (java.lang.Object) 0L);
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass47 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash13.insere("", (java.lang.Object) 0L);
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash13.imprime();
        java.lang.Object obj25 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash29.insere("", (java.lang.Object) 0L);
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object obj41 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        java.lang.Object obj48 = tabelaHash46.pesquisa("hi!");
        tabelaHash46.imprime();
        tabelaHash46.imprime();
        tabelaHash46.insere("", (java.lang.Object) 0L);
        tabelaHash39.insere("", (java.lang.Object) 0L);
        tabelaHash29.insere("", (java.lang.Object) 0L);
        tabelaHash29.imprime();
        java.lang.Object obj58 = tabelaHash29.pesquisa("");
        java.lang.Object obj60 = tabelaHash29.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0L + "'", obj25, 0L);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 0L + "'", obj58, 0L);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 0L + "'", obj60, 0L);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        tabelaHash18.insere("", (java.lang.Object) wildcardClass24);
        java.lang.Object obj27 = tabelaHash18.pesquisa("");
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass28);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = tabelaHash40.pesquisa("hi!");
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        tabelaHash40.insere("", (java.lang.Object) 0L);
        tabelaHash33.insere("", (java.lang.Object) 0L);
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.retira("");
        tabelaHash33.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash33);
        java.lang.Object obj56 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        java.lang.Object obj36 = tabelaHash32.pesquisa("");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        java.lang.Object obj44 = tabelaHash38.pesquisa("hi!");
        java.lang.Class<?> wildcardClass45 = tabelaHash38.getClass();
        tabelaHash32.insere("hi!", (java.lang.Object) tabelaHash38);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash0.imprime();
        java.lang.Object obj50 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass51 = obj50.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0L + "'", obj28, 0L);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.insere("", (java.lang.Object) 1.0f);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) 0L);
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        java.lang.Object obj27 = tabelaHash16.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash29.insere("", (java.lang.Object) 0L);
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash29);
        tabelaHash29.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash29);
        java.lang.Class<?> wildcardClass43 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0L + "'", obj31, 0L);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash5.insere("", (java.lang.Object) (short) 100);
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        tabelaHash21.insere("", (java.lang.Object) 0L);
        tabelaHash21.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash21);
        java.lang.Object obj32 = tabelaHash16.pesquisa("hi!");
        java.lang.Object obj34 = tabelaHash16.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        java.lang.Object obj37 = tabelaHash16.pesquisa("");
        java.lang.Class<?> wildcardClass38 = tabelaHash16.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass5 = tabelaHash4.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) 1);
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) 0L);
        java.lang.Object obj42 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash33);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object obj8 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.imprime();
        tabelaHash6.imprime();
        java.lang.Object obj12 = tabelaHash6.pesquisa("hi!");
        java.lang.Class<?> wildcardClass13 = tabelaHash6.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash6);
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.imprime();
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        tabelaHash19.insere("", (java.lang.Object) wildcardClass25);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) 0L);
        tabelaHash28.imprime();
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        java.lang.Object obj47 = tabelaHash45.pesquisa("hi!");
        tabelaHash45.imprime();
        tabelaHash45.imprime();
        tabelaHash45.insere("", (java.lang.Object) 0L);
        tabelaHash38.insere("", (java.lang.Object) 0L);
        tabelaHash28.insere("", (java.lang.Object) 0L);
        tabelaHash28.imprime();
        tabelaHash19.insere("", (java.lang.Object) tabelaHash28);
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj47);
    }

    @Ignore
    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) 0L);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash27.insere("", (java.lang.Object) 0L);
        tabelaHash27.imprime();
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object obj39 = tabelaHash37.pesquisa("hi!");
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash37);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash37);
        tabelaHash11.imprime();
        java.lang.Object obj47 = tabelaHash11.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0L + "'", obj20, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = null;
        tabelaHash0.insere("hi!", obj4);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("");
        tabelaHash7.insere("", (java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass13 = tabelaHash7.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        java.lang.Object obj16 = tabelaHash7.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash5.insere("", (java.lang.Object) (short) 100);
        tabelaHash5.imprime();
        java.lang.Object obj20 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0L + "'", obj20, 0L);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash13.imprime();
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        tabelaHash0.insere("", obj22);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash0.retira("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        java.lang.Object obj19 = tabelaHash10.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash10.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) 0L);
        java.lang.Object obj27 = tabelaHash18.pesquisa("");
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        java.lang.Class<?> wildcardClass31 = tabelaHash18.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0L + "'", obj27, 0L);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Ignore
    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj12 = null;
        tabelaHash0.insere("", obj12);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass30 = tabelaHash29.getClass();
        tabelaHash15.insere("", (java.lang.Object) wildcardClass30);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        java.lang.Object obj17 = tabelaHash10.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 0L);
        tabelaHash25.insere("", (java.lang.Object) 0L);
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        java.lang.Object obj50 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.imprime();
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        tabelaHash48.insere("", (java.lang.Object) wildcardClass54);
        java.lang.Object obj57 = tabelaHash48.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash48);
        tabelaHash48.retira("");
        java.lang.Object obj62 = tabelaHash48.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "class java.lang.Object");
        org.junit.Assert.assertNull(obj62);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object obj8 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.imprime();
        tabelaHash6.imprime();
        java.lang.Object obj12 = tabelaHash6.pesquisa("hi!");
        java.lang.Class<?> wildcardClass13 = tabelaHash6.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash6);
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash13.imprime();
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        tabelaHash0.insere("", obj22);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash0.retira("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj33 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) 0 + "'", obj31, (short) 0);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) 0L);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Class<?> wildcardClass26 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0L + "'", obj20, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) 0L);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        tabelaHash34.insere("", (java.lang.Object) 0L);
        tabelaHash27.insere("", (java.lang.Object) 0L);
        tabelaHash11.insere("", (java.lang.Object) tabelaHash27);
        java.lang.Object obj45 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0L + "'", obj20, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash13.imprime();
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        tabelaHash0.insere("", obj22);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("");
        tabelaHash31.insere("", (java.lang.Object) 0.0d);
        tabelaHash31.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object obj43 = tabelaHash41.pesquisa("");
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash41);
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        java.lang.Object obj48 = tabelaHash46.pesquisa("hi!");
        tabelaHash46.imprime();
        tabelaHash46.imprime();
        tabelaHash46.insere("", (java.lang.Object) 0L);
        tabelaHash46.imprime();
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        java.lang.Object obj58 = tabelaHash56.pesquisa("hi!");
        tabelaHash56.imprime();
        tabelaHash56.imprime();
        tabelaHash56.imprime();
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        java.lang.Object obj65 = tabelaHash63.pesquisa("hi!");
        tabelaHash63.imprime();
        tabelaHash63.imprime();
        tabelaHash63.insere("", (java.lang.Object) 0L);
        tabelaHash56.insere("", (java.lang.Object) 0L);
        tabelaHash46.insere("", (java.lang.Object) 0L);
        tabelaHash46.retira("");
        tabelaHash31.insere("", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass76 = tabelaHash31.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass76);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.insere("", (java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass19 = tabelaHash10.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) 0L);
        java.lang.Object obj27 = tabelaHash18.pesquisa("hi!");
        java.lang.Object obj29 = tabelaHash18.pesquisa("");
        java.lang.Object obj31 = tabelaHash18.pesquisa("");
        tabelaHash10.insere("", obj31);
        java.lang.Object obj34 = tabelaHash10.pesquisa("hi!");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.imprime();
        tabelaHash36.imprime();
        tabelaHash36.insere("", (java.lang.Object) 0L);
        tabelaHash36.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        java.lang.Object obj48 = tabelaHash46.pesquisa("hi!");
        tabelaHash46.imprime();
        tabelaHash46.imprime();
        tabelaHash46.imprime();
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        java.lang.Object obj55 = tabelaHash53.pesquisa("hi!");
        tabelaHash53.imprime();
        tabelaHash53.imprime();
        tabelaHash53.insere("", (java.lang.Object) 0L);
        tabelaHash46.insere("", (java.lang.Object) 0L);
        tabelaHash36.insere("", (java.lang.Object) 0L);
        java.lang.Object obj64 = null;
        tabelaHash36.insere("hi!", obj64);
        java.lang.Object obj67 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.retira("");
        tabelaHash36.retira("hi!");
        ds.TabelaHash tabelaHash73 = new ds.TabelaHash();
        java.lang.Object obj75 = tabelaHash73.pesquisa("hi!");
        tabelaHash73.imprime();
        ds.TabelaHash tabelaHash78 = new ds.TabelaHash();
        java.lang.Object obj80 = tabelaHash78.pesquisa("hi!");
        tabelaHash78.imprime();
        tabelaHash78.imprime();
        tabelaHash78.insere("", (java.lang.Object) 0L);
        tabelaHash78.imprime();
        tabelaHash73.insere("hi!", (java.lang.Object) tabelaHash78);
        tabelaHash78.imprime();
        tabelaHash36.insere("hi!", (java.lang.Object) tabelaHash78);
        tabelaHash10.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash10.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0L + "'", obj31, 0L);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash18.imprime();
        java.lang.Object obj27 = tabelaHash18.pesquisa("");
        tabelaHash5.insere("", obj27);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 0L);
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        java.lang.Object obj43 = tabelaHash32.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass46 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 0L + "'", obj43, 0L);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object obj6 = tabelaHash4.pesquisa("hi!");
        tabelaHash4.imprime();
        java.lang.Object obj9 = tabelaHash4.pesquisa("hi!");
        tabelaHash4.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash4.imprime();
        java.lang.Object obj14 = tabelaHash4.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        tabelaHash13.insere("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        java.lang.Class<?> wildcardClass23 = tabelaHash13.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass23);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) 0L);
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object obj43 = tabelaHash41.pesquisa("hi!");
        tabelaHash41.imprime();
        tabelaHash41.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash41.imprime();
        java.lang.Object obj50 = tabelaHash41.pesquisa("");
        tabelaHash28.insere("", obj50);
        tabelaHash28.imprime();
        tabelaHash28.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash28.retira("");
        java.lang.Object obj59 = tabelaHash28.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj59);
        java.lang.Class<?> wildcardClass61 = obj59.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (short) 0 + "'", obj59, (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) 0L);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        tabelaHash34.insere("", (java.lang.Object) 0L);
        tabelaHash27.insere("", (java.lang.Object) 0L);
        tabelaHash11.insere("", (java.lang.Object) tabelaHash27);
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object obj49 = tabelaHash47.pesquisa("");
        tabelaHash47.insere("", (java.lang.Object) 0.0d);
        tabelaHash47.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
        java.lang.Object obj59 = tabelaHash57.pesquisa("hi!");
        tabelaHash57.imprime();
        java.lang.Object obj62 = tabelaHash57.pesquisa("hi!");
        tabelaHash47.insere("hi!", (java.lang.Object) tabelaHash57);
        java.lang.Object obj65 = tabelaHash57.pesquisa("");
        java.lang.Object obj67 = tabelaHash57.pesquisa("");
        java.lang.Object obj69 = tabelaHash57.pesquisa("hi!");
        tabelaHash11.insere("", obj69);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0L + "'", obj20, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = null;
        tabelaHash0.insere("hi!", obj28);
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object obj39 = tabelaHash37.pesquisa("hi!");
        tabelaHash37.imprime();
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object obj44 = tabelaHash42.pesquisa("hi!");
        tabelaHash42.imprime();
        tabelaHash42.imprime();
        tabelaHash42.insere("", (java.lang.Object) 0L);
        tabelaHash42.imprime();
        tabelaHash37.insere("hi!", (java.lang.Object) tabelaHash42);
        tabelaHash42.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash42);
        tabelaHash42.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj28 = null;
        tabelaHash0.insere("hi!", obj28);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash10.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        java.lang.Object obj33 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.imprime();
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = tabelaHash40.pesquisa("hi!");
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        tabelaHash40.insere("", (java.lang.Object) 0L);
        tabelaHash40.imprime();
        tabelaHash35.insere("hi!", (java.lang.Object) tabelaHash40);
        java.lang.Object obj51 = tabelaHash35.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass53 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0L + "'", obj31, 0L);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0L + "'", obj33, 0L);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) 0L);
        java.lang.Object obj27 = tabelaHash18.pesquisa("");
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 0L);
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash32);
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object obj46 = tabelaHash44.pesquisa("hi!");
        tabelaHash44.imprime();
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        java.lang.Object obj51 = tabelaHash49.pesquisa("hi!");
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        tabelaHash49.insere("", (java.lang.Object) 0L);
        tabelaHash49.imprime();
        tabelaHash44.insere("hi!", (java.lang.Object) tabelaHash49);
        tabelaHash49.imprime();
        java.lang.Object obj61 = tabelaHash49.pesquisa("");
        java.lang.Class<?> wildcardClass62 = tabelaHash49.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash49);
        tabelaHash0.retira("");
        java.lang.Object obj67 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0L + "'", obj27, 0L);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 0L + "'", obj61, 0L);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(obj67);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash9.imprime();
        java.lang.Object obj18 = tabelaHash9.pesquisa("");
        tabelaHash9.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        java.lang.Object obj23 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("", (java.lang.Object) 10.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) 0L);
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.insere("", (java.lang.Object) 0L);
        java.lang.Object obj34 = tabelaHash25.pesquisa("");
        tabelaHash25.retira("");
        java.lang.Object obj38 = tabelaHash25.pesquisa("hi!");
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash25);
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object obj43 = tabelaHash41.pesquisa("hi!");
        tabelaHash41.imprime();
        tabelaHash41.imprime();
        tabelaHash41.insere("", (java.lang.Object) 0L);
        tabelaHash41.imprime();
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        java.lang.Object obj53 = tabelaHash51.pesquisa("hi!");
        tabelaHash51.imprime();
        tabelaHash51.imprime();
        tabelaHash51.imprime();
        tabelaHash41.insere("hi!", (java.lang.Object) tabelaHash51);
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash51);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash51);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0L + "'", obj34, 0L);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash9.imprime();
        java.lang.Object obj18 = tabelaHash9.pesquisa("");
        tabelaHash9.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        tabelaHash23.insere("", (java.lang.Object) 0L);
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = tabelaHash40.pesquisa("hi!");
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        tabelaHash40.insere("", (java.lang.Object) 0L);
        tabelaHash33.insere("", (java.lang.Object) 0L);
        tabelaHash23.insere("", (java.lang.Object) 0L);
        tabelaHash23.retira("");
        tabelaHash23.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash23);
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        java.lang.Object obj57 = tabelaHash55.pesquisa("hi!");
        tabelaHash55.imprime();
        tabelaHash55.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash55.imprime();
        java.lang.Object obj64 = tabelaHash55.pesquisa("");
        tabelaHash55.insere("", (java.lang.Object) (-1.0d));
        tabelaHash55.retira("");
        java.lang.Object obj71 = tabelaHash55.pesquisa("hi!");
        tabelaHash55.imprime();
        tabelaHash55.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash55);
        java.lang.Object obj76 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 1.0f + "'", obj71, 1.0f);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + 0L + "'", obj76, 0L);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        java.lang.Object obj21 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        java.lang.Object obj25 = null;
        tabelaHash0.insere("hi!", obj25);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test479");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object obj8 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.imprime();
        tabelaHash6.imprime();
        java.lang.Object obj12 = tabelaHash6.pesquisa("hi!");
        java.lang.Class<?> wildcardClass13 = tabelaHash6.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash6);
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test480");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test481");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        java.lang.Object obj26 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash21);
        tabelaHash21.imprime();
        tabelaHash10.insere("", (java.lang.Object) tabelaHash21);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        java.lang.Object obj38 = tabelaHash32.pesquisa("hi!");
        java.lang.Class<?> wildcardClass39 = tabelaHash32.getClass();
        tabelaHash10.insere("", (java.lang.Object) tabelaHash32);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test482");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash9.imprime();
        java.lang.Object obj18 = tabelaHash9.pesquisa("");
        tabelaHash9.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass24 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test483");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash13.imprime();
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        tabelaHash0.insere("", obj22);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test484");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test485");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj20 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) false);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test486");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test487");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test488");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        java.lang.Object obj20 = tabelaHash10.pesquisa("");
        java.lang.Object obj22 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass30 = tabelaHash29.getClass();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash29);
        java.lang.Object obj33 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) (byte) 1);
        tabelaHash10.insere("", (java.lang.Object) tabelaHash25);
        java.lang.Object obj40 = null;
        tabelaHash10.insere("", obj40);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test489");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.insere("", (java.lang.Object) 1.0f);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) 0L);
        java.lang.Object obj27 = tabelaHash18.pesquisa("");
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        tabelaHash18.retira("");
        java.lang.Object obj34 = tabelaHash18.pesquisa("");
        tabelaHash18.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash18.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0L + "'", obj27, 0L);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test490");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 0L);
        java.lang.Object obj26 = tabelaHash17.pesquisa("hi!");
        java.lang.Object obj28 = tabelaHash17.pesquisa("");
        java.lang.Object obj30 = tabelaHash17.pesquisa("");
        tabelaHash0.insere("", obj30);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0L + "'", obj28, 0L);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0L + "'", obj30, 0L);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test491");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.insere("hi!", (java.lang.Object) 1.0f);
        java.lang.Object obj25 = tabelaHash17.pesquisa("hi!");
        tabelaHash10.insere("", (java.lang.Object) tabelaHash17);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1.0f + "'", obj25, 1.0f);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test492");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test493");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.insere("", (java.lang.Object) 1.0f);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) 0L);
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        java.lang.Object obj27 = tabelaHash16.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash29.insere("", (java.lang.Object) 0L);
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash29);
        tabelaHash29.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash29);
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object obj46 = tabelaHash44.pesquisa("hi!");
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash44.insere("", (java.lang.Object) 0L);
        java.lang.Object obj53 = tabelaHash44.pesquisa("hi!");
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        java.lang.Object obj57 = tabelaHash55.pesquisa("hi!");
        tabelaHash55.imprime();
        tabelaHash55.imprime();
        tabelaHash55.insere("", (java.lang.Object) 0L);
        java.lang.Object obj64 = tabelaHash55.pesquisa("");
        tabelaHash55.retira("");
        java.lang.Object obj68 = tabelaHash55.pesquisa("hi!");
        tabelaHash44.insere("hi!", (java.lang.Object) tabelaHash55);
        ds.TabelaHash tabelaHash71 = new ds.TabelaHash();
        java.lang.Object obj73 = tabelaHash71.pesquisa("hi!");
        tabelaHash71.imprime();
        tabelaHash71.imprime();
        tabelaHash71.imprime();
        ds.TabelaHash tabelaHash78 = new ds.TabelaHash();
        java.lang.Object obj80 = tabelaHash78.pesquisa("hi!");
        tabelaHash78.imprime();
        tabelaHash78.imprime();
        tabelaHash78.insere("", (java.lang.Object) 0L);
        tabelaHash71.insere("", (java.lang.Object) 0L);
        tabelaHash55.insere("", (java.lang.Object) tabelaHash71);
        tabelaHash55.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash55);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 0L + "'", obj64, 0L);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test494");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        tabelaHash16.insere("", (java.lang.Object) wildcardClass22);
        java.lang.Object obj25 = tabelaHash16.pesquisa("");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        tabelaHash27.insere("", (java.lang.Object) wildcardClass33);
        java.lang.Object obj36 = tabelaHash27.pesquisa("");
        tabelaHash16.insere("", obj36);
        java.lang.Class<?> wildcardClass38 = tabelaHash16.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass38);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0L + "'", obj9, 0L);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "class java.lang.Object");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test495");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.retira("");
        java.lang.Object obj26 = tabelaHash15.pesquisa("");
        java.lang.Class<?> wildcardClass27 = tabelaHash15.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0L + "'", obj9, 0L);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test496");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test497");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash13.insere("", (java.lang.Object) 0L);
        tabelaHash13.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        tabelaHash30.insere("", (java.lang.Object) 0L);
        tabelaHash30.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash30);
        java.lang.Object obj41 = tabelaHash30.pesquisa("");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        java.lang.Object obj45 = tabelaHash43.pesquisa("hi!");
        tabelaHash43.imprime();
        tabelaHash43.imprime();
        tabelaHash43.insere("", (java.lang.Object) 0L);
        tabelaHash43.imprime();
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        java.lang.Object obj55 = tabelaHash53.pesquisa("hi!");
        tabelaHash53.imprime();
        tabelaHash53.imprime();
        tabelaHash53.imprime();
        tabelaHash43.insere("hi!", (java.lang.Object) tabelaHash53);
        java.lang.Class<?> wildcardClass60 = tabelaHash43.getClass();
        tabelaHash30.insere("", (java.lang.Object) tabelaHash43);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash30.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0L + "'", obj41, 0L);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test498");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash5.insere("", (java.lang.Object) (short) 100);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.insere("", (java.lang.Object) 0L);
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash32.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash32.imprime();
        java.lang.Object obj41 = tabelaHash32.pesquisa("");
        tabelaHash19.insere("", obj41);
        tabelaHash19.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash5.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test499");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash13.imprime();
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        tabelaHash13.retira("hi!");
        tabelaHash13.imprime();
        java.lang.Object obj27 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        java.lang.Object obj32 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0L + "'", obj32, 0L);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test500");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        tabelaHash11.insere("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("", obj20);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = tabelaHash23.pesquisa("");
        tabelaHash23.insere("", (java.lang.Object) 0.0d);
        tabelaHash23.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("");
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash33);
        tabelaHash23.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash23.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class java.lang.Object");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj35);
    }
}
