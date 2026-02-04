package ds.seed7992;

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass1 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = obj11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
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
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
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
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass21 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = obj11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0d + "'", obj10, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash8.pesquisa("");
        tabelaHash0.insere("", obj12);
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Ignore
    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj20 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj25 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash10.imprime();
        tabelaHash10.insere("", (java.lang.Object) ' ');
        tabelaHash10.imprime();
        tabelaHash10.retira("");
        java.lang.Class<?> wildcardClass21 = tabelaHash10.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass21);
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass25 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass33 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass16 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) true);
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash10.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash10.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj33 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj41 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj46 = tabelaHash28.pesquisa("hi!");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash48.imprime();
        tabelaHash48.insere("", (java.lang.Object) ' ');
        tabelaHash48.imprime();
        tabelaHash48.retira("");
        tabelaHash48.imprime();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash48);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash28);
        tabelaHash11.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0d + "'", obj33, 100.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) -1 + "'", obj38, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj33 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj41 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj46 = tabelaHash28.pesquisa("hi!");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash48.imprime();
        tabelaHash48.insere("", (java.lang.Object) ' ');
        tabelaHash48.imprime();
        tabelaHash48.retira("");
        tabelaHash48.imprime();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash48);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Object obj63 = tabelaHash28.pesquisa("");
        java.lang.Class<?> wildcardClass64 = obj63.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0d + "'", obj33, 100.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) -1 + "'", obj38, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (byte) -1 + "'", obj63, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash16.imprime();
        tabelaHash16.retira("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj40 = tabelaHash30.pesquisa("");
        tabelaHash30.retira("hi!");
        tabelaHash30.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash30);
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj51 = tabelaHash46.pesquisa("hi!");
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash46);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) -1 + "'", obj40, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 100.0d + "'", obj51, 100.0d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) (-1.0f));
        tabelaHash9.retira("hi!");
        java.lang.Object obj20 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash9.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Class<?> wildcardClass26 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) ' ');
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj30 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj37 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj42 = tabelaHash32.pesquisa("");
        tabelaHash32.imprime();
        tabelaHash17.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        java.lang.Class<?> wildcardClass46 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0d + "'", obj30, 100.0d);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0d + "'", obj37, 100.0d);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) -1 + "'", obj42, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash16.insere("", (java.lang.Object) (-1.0d));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("hi!");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass39 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Ignore
    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Ignore
    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0d + "'", obj10, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj20 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj25 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass30 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        java.lang.Object obj20 = tabelaHash10.pesquisa("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj27 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj38 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash33.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj44 = tabelaHash33.pesquisa("");
        tabelaHash33.retira("hi!");
        tabelaHash33.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) tabelaHash33);
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj55 = tabelaHash50.pesquisa("hi!");
        tabelaHash50.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj60 = tabelaHash50.pesquisa("");
        tabelaHash50.imprime();
        java.lang.Object obj63 = tabelaHash50.pesquisa("hi!");
        tabelaHash50.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj68 = tabelaHash50.pesquisa("hi!");
        ds.TabelaHash tabelaHash70 = new ds.TabelaHash();
        tabelaHash70.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash70.imprime();
        tabelaHash70.insere("", (java.lang.Object) ' ');
        tabelaHash70.imprime();
        tabelaHash70.retira("");
        tabelaHash70.imprime();
        tabelaHash50.insere("", (java.lang.Object) tabelaHash70);
        tabelaHash33.insere("hi!", (java.lang.Object) tabelaHash50);
        tabelaHash10.insere("", (java.lang.Object) tabelaHash33);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0d + "'", obj27, 100.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0d + "'", obj38, 100.0d);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 100.0d + "'", obj55, 100.0d);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + (byte) -1 + "'", obj60, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 100.0d + "'", obj63, 100.0d);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 100.0d + "'", obj68, 100.0d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        java.lang.Class<?> wildcardClass19 = tabelaHash10.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        java.lang.Object obj35 = tabelaHash23.pesquisa("");
        java.lang.Class<?> wildcardClass36 = tabelaHash23.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("hi!");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("hi!");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 10L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
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
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj20 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj25 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass30 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash8.pesquisa("");
        tabelaHash0.insere("", obj12);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) (-1.0f));
        tabelaHash15.retira("hi!");
        java.lang.Object obj26 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj36 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj41 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash31);
        java.lang.Object obj45 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash15);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0d + "'", obj36, 100.0d);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) -1 + "'", obj41, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (-1.0f) + "'", obj45, (-1.0f));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass16 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash16.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash16.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash16.imprime();
        java.lang.Class<?> wildcardClass30 = tabelaHash16.getClass();
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 10L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
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
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash10.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1L));
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) 10);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass23 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj41 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj46 = tabelaHash36.pesquisa("");
        tabelaHash36.retira("hi!");
        tabelaHash36.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash36);
        java.lang.Class<?> wildcardClass51 = tabelaHash36.getClass();
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) -1 + "'", obj46, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj20 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj25 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj42 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("hi!");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash14.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        java.lang.Object obj20 = tabelaHash10.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash10.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) ' ');
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash20.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        java.lang.Object obj35 = tabelaHash0.pesquisa("");
        java.lang.Object obj37 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass38 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj23 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + ' ' + "'", obj27, ' ');
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) ' ');
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        java.lang.Object obj33 = tabelaHash26.pesquisa("hi!");
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        tabelaHash12.insere("hi!", obj33);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0d + "'", obj33, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 10L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj21 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj29 = tabelaHash11.pesquisa("hi!");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash31.imprime();
        tabelaHash31.insere("", (java.lang.Object) ' ');
        tabelaHash31.imprime();
        tabelaHash31.retira("");
        tabelaHash31.imprime();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash31);
        tabelaHash11.retira("");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash47);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash10.retira("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash22.imprime();
        tabelaHash22.insere("", (java.lang.Object) (-1.0f));
        tabelaHash22.retira("hi!");
        java.lang.Object obj33 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.insere("hi!", (java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass37 = tabelaHash22.getClass();
        tabelaHash10.insere("", (java.lang.Object) tabelaHash22);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) (-1.0f));
        tabelaHash28.retira("hi!");
        java.lang.Object obj39 = tabelaHash28.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash28);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj47 = tabelaHash42.pesquisa("hi!");
        tabelaHash42.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        tabelaHash52.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj57 = tabelaHash52.pesquisa("hi!");
        tabelaHash52.imprime();
        tabelaHash52.imprime();
        tabelaHash42.insere("", (java.lang.Object) tabelaHash52);
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        tabelaHash62.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash62.imprime();
        tabelaHash62.insere("", (java.lang.Object) (-1.0f));
        tabelaHash62.retira("hi!");
        java.lang.Object obj73 = tabelaHash62.pesquisa("hi!");
        tabelaHash62.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash78 = new ds.TabelaHash();
        tabelaHash78.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj83 = tabelaHash78.pesquisa("hi!");
        tabelaHash78.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj88 = tabelaHash78.pesquisa("");
        tabelaHash78.imprime();
        tabelaHash62.insere("hi!", (java.lang.Object) tabelaHash78);
        java.lang.Class<?> wildcardClass91 = tabelaHash62.getClass();
        tabelaHash52.insere("hi!", (java.lang.Object) wildcardClass91);
        tabelaHash28.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 100.0d + "'", obj47, 100.0d);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 100.0d + "'", obj57, 100.0d);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + 100.0d + "'", obj83, 100.0d);
        org.junit.Assert.assertEquals("'" + obj88 + "' != '" + (byte) -1 + "'", obj88, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj38 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj43 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        java.lang.Object obj46 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj51 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        java.lang.Object obj54 = tabelaHash33.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash33);
        ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
        tabelaHash57.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash57.imprime();
        tabelaHash57.insere("", (java.lang.Object) (-1.0f));
        tabelaHash57.retira("hi!");
        tabelaHash57.imprime();
        tabelaHash57.retira("");
        tabelaHash33.insere("hi!", (java.lang.Object) tabelaHash57);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0d + "'", obj38, 100.0d);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 100.0d + "'", obj51, 100.0d);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (byte) -1 + "'", obj54, (byte) -1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj38 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj43 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        java.lang.Object obj46 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj51 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        java.lang.Object obj54 = tabelaHash33.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash33);
        java.lang.Class<?> wildcardClass56 = tabelaHash33.getClass();
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0d + "'", obj38, 100.0d);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 100.0d + "'", obj51, 100.0d);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (byte) -1 + "'", obj54, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj12 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash7.imprime();
        tabelaHash7.retira("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj26 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj31 = tabelaHash21.pesquisa("");
        tabelaHash21.retira("hi!");
        tabelaHash21.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash21);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash21.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash16.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1L));
        java.lang.Object obj34 = tabelaHash16.pesquisa("");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) (-1.0f));
        tabelaHash17.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
// flaky:         tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass28 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        java.lang.Object obj17 = tabelaHash10.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash19.imprime();
        tabelaHash19.insere("", (java.lang.Object) (-1.0f));
        tabelaHash19.retira("hi!");
        java.lang.Object obj30 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash19.imprime();
        tabelaHash10.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Class<?> wildcardClass36 = tabelaHash19.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0d + "'", obj17, 100.0d);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) ' ');
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object obj34 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0d + "'", obj34, 100.0d);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = obj13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = obj12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj34 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (short) 1 + "'", obj34, (short) 1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) ' ');
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object obj34 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0d + "'", obj34, 100.0d);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj20 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj25 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass41 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.imprime();
        java.lang.Class<?> wildcardClass15 = tabelaHash13.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash13.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("hi!");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) ' ');
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        java.lang.Class<?> wildcardClass25 = tabelaHash12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) (-1.0f));
        tabelaHash9.retira("hi!");
        java.lang.Object obj20 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj30 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj35 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash25);
        tabelaHash25.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash25.imprime();
        java.lang.Class<?> wildcardClass41 = tabelaHash25.getClass();
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0d + "'", obj30, 100.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj37 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (short) 1 + "'", obj37, (short) 1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash25);
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) ' ');
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.retira("");
        tabelaHash33.imprime();
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) tabelaHash49);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass52 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj26 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj32 = tabelaHash21.pesquisa("");
        tabelaHash21.retira("hi!");
        tabelaHash21.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash21);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj43 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj48 = tabelaHash38.pesquisa("");
        tabelaHash38.imprime();
        java.lang.Object obj51 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj56 = tabelaHash38.pesquisa("hi!");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash58.imprime();
        tabelaHash58.insere("", (java.lang.Object) ' ');
        tabelaHash58.imprime();
        tabelaHash58.retira("");
        tabelaHash58.imprime();
        tabelaHash38.insere("", (java.lang.Object) tabelaHash58);
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash38);
        java.lang.Class<?> wildcardClass72 = tabelaHash21.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass72);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0d + "'", obj43, 100.0d);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) -1 + "'", obj48, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 100.0d + "'", obj51, 100.0d);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 100.0d + "'", obj56, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1L));
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) 10);
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("hi!");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash7.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("hi!");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash30);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
    }

    @Ignore
    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj14 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj25 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj31 = tabelaHash20.pesquisa("");
        tabelaHash20.retira("hi!");
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash9.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash9.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0d + "'", obj14, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0d + "'", obj25, 100.0d);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) true);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass30 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass35 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj36 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (-1.0f) + "'", obj36, (-1.0f));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) ' ');
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash0.insere("", (java.lang.Object) 100L);
        java.lang.Object obj29 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("hi!");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) "");
    }

    @Ignore
    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash16.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) tabelaHash28);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash28);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash28.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj18 = tabelaHash13.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
    }

    @Ignore
    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash25);
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash18.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj20 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj25 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Class<?> wildcardClass28 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
// flaky:         tabelaHash0.retira("");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) ' ');
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object obj34 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object obj43 = tabelaHash41.pesquisa("hi!");
        tabelaHash41.insere("hi!", (java.lang.Object) 10L);
        tabelaHash41.retira("hi!");
        java.lang.Object obj50 = tabelaHash41.pesquisa("hi!");
        tabelaHash41.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash41);
        java.lang.Class<?> wildcardClass53 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0d + "'", obj34, 100.0d);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) (-1.0f));
        tabelaHash28.retira("hi!");
        java.lang.Object obj39 = tabelaHash28.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash28);
        java.lang.Class<?> wildcardClass41 = tabelaHash28.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) ' ');
        tabelaHash18.imprime();
        tabelaHash18.retira("");
        java.lang.Object obj30 = tabelaHash18.pesquisa("");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash32.imprime();
        tabelaHash32.retira("hi!");
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash32);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash32);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass16 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash23.imprime();
        tabelaHash23.insere("", (java.lang.Object) ' ');
        tabelaHash23.imprime();
        tabelaHash23.retira("hi!");
        java.lang.Class<?> wildcardClass34 = tabelaHash23.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass34);
        java.lang.Object obj37 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0d + "'", obj37, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) ' ');
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object obj34 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass35 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0d + "'", obj34, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("hi!");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj46 = tabelaHash41.pesquisa("hi!");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj53 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.imprime();
        tabelaHash48.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash48.imprime();
        tabelaHash48.retira("hi!");
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        tabelaHash62.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj67 = tabelaHash62.pesquisa("hi!");
        tabelaHash62.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj72 = tabelaHash62.pesquisa("");
        tabelaHash62.retira("hi!");
        tabelaHash62.imprime();
        tabelaHash48.insere("hi!", (java.lang.Object) tabelaHash62);
        tabelaHash41.insere("", (java.lang.Object) tabelaHash62);
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 100.0d + "'", obj53, 100.0d);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 100.0d + "'", obj67, 100.0d);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + (byte) -1 + "'", obj72, (byte) -1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object obj11 = tabelaHash7.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash7.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 10 + "'", obj14, (short) 10);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (byte) 0);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass16 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash16.imprime();
        tabelaHash16.retira("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("hi!");
        java.lang.Object obj28 = tabelaHash24.pesquisa("");
        tabelaHash16.insere("", obj28);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash31.imprime();
        tabelaHash31.insere("", (java.lang.Object) (-1.0f));
        tabelaHash31.retira("hi!");
        java.lang.Object obj42 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj52 = tabelaHash47.pesquisa("hi!");
        tabelaHash47.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj57 = tabelaHash47.pesquisa("");
        tabelaHash47.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash47);
        java.lang.Object obj61 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash31);
        java.lang.Class<?> wildcardClass65 = tabelaHash16.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash16.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100.0d + "'", obj52, 100.0d);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (byte) -1 + "'", obj57, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (-1.0f) + "'", obj61, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        java.lang.Object obj23 = tabelaHash16.pesquisa("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash25.imprime();
        tabelaHash25.insere("", (java.lang.Object) (-1.0f));
        tabelaHash25.retira("hi!");
        java.lang.Object obj36 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash25.imprime();
        tabelaHash16.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object obj44 = tabelaHash0.pesquisa("");
        java.lang.Object obj46 = null;
        tabelaHash0.insere("", obj46);
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + "" + "'", obj44, "");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) ' ');
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj30 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj37 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj42 = tabelaHash32.pesquisa("");
        tabelaHash32.imprime();
        tabelaHash17.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        tabelaHash17.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0d + "'", obj30, 100.0d);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0d + "'", obj37, 100.0d);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) -1 + "'", obj42, (byte) -1);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash25);
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
    }

    @Ignore
    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash16.imprime();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash31.imprime();
        tabelaHash31.insere("", (java.lang.Object) ' ');
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash31);
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj49 = tabelaHash44.pesquisa("hi!");
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash44);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash44.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100.0d + "'", obj49, 100.0d);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object obj11 = null;
        tabelaHash7.insere("hi!", obj11);
        tabelaHash7.retira("hi!");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash25);
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj38 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj43 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) (byte) 0);
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash49.imprime();
        tabelaHash49.insere("", (java.lang.Object) (-1.0f));
        tabelaHash49.retira("hi!");
        java.lang.Object obj60 = tabelaHash49.pesquisa("hi!");
        tabelaHash49.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash33.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash33);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0d + "'", obj38, 100.0d);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertNull(obj60);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash23.imprime();
        tabelaHash23.insere("", (java.lang.Object) ' ');
        tabelaHash23.imprime();
        tabelaHash23.retira("hi!");
        java.lang.Class<?> wildcardClass34 = tabelaHash23.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass34);
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash16.imprime();
        tabelaHash16.retira("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj40 = tabelaHash30.pesquisa("");
        tabelaHash30.retira("hi!");
        tabelaHash30.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash30);
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj51 = tabelaHash46.pesquisa("hi!");
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash46);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) -1 + "'", obj40, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 100.0d + "'", obj51, 100.0d);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object obj11 = null;
        tabelaHash7.insere("hi!", obj11);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash7.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj18 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj29 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        tabelaHash24.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj35 = tabelaHash24.pesquisa("");
        tabelaHash24.retira("hi!");
        tabelaHash24.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash24);
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash41.imprime();
        tabelaHash41.insere("", (java.lang.Object) (-1.0f));
        tabelaHash41.retira("hi!");
        java.lang.Object obj52 = tabelaHash41.pesquisa("hi!");
        tabelaHash13.insere("", (java.lang.Object) tabelaHash41);
        java.lang.Class<?> wildcardClass54 = tabelaHash13.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass54);
        java.lang.Object obj57 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "class ds.TabelaHash");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + ' ' + "'", obj17, ' ');
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj12 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash7.imprime();
        tabelaHash7.retira("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj26 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj31 = tabelaHash21.pesquisa("");
        tabelaHash21.retira("hi!");
        tabelaHash21.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash21);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash21.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash16.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) tabelaHash28);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Object obj34 = tabelaHash28.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object obj28 = tabelaHash11.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj33 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj41 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj46 = tabelaHash28.pesquisa("hi!");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash48.imprime();
        tabelaHash48.insere("", (java.lang.Object) ' ');
        tabelaHash48.imprime();
        tabelaHash48.retira("");
        tabelaHash48.imprime();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash48);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash28);
        tabelaHash11.retira("hi!");
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        tabelaHash65.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash65.imprime();
        tabelaHash65.insere("", (java.lang.Object) (-1.0f));
        tabelaHash65.retira("hi!");
        tabelaHash65.imprime();
        tabelaHash65.retira("");
        tabelaHash11.insere("hi!", (java.lang.Object) "");
        tabelaHash11.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0d + "'", obj33, 100.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) -1 + "'", obj38, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass3 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
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
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj14 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        java.lang.Class<?> wildcardClass17 = tabelaHash9.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Class<?> wildcardClass19 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0d + "'", obj14, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash16.imprime();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash31.imprime();
        tabelaHash31.insere("", (java.lang.Object) ' ');
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash31);
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj49 = tabelaHash44.pesquisa("hi!");
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash44);
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        tabelaHash54.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash54.imprime();
        tabelaHash54.insere("", (java.lang.Object) (-1.0f));
        tabelaHash54.retira("hi!");
        java.lang.Object obj65 = tabelaHash54.pesquisa("hi!");
        tabelaHash54.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash70 = new ds.TabelaHash();
        tabelaHash70.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj75 = tabelaHash70.pesquisa("hi!");
        tabelaHash70.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj80 = tabelaHash70.pesquisa("");
        tabelaHash70.imprime();
        tabelaHash54.insere("hi!", (java.lang.Object) tabelaHash70);
        java.lang.Object obj84 = tabelaHash54.pesquisa("");
        java.lang.Class<?> wildcardClass85 = tabelaHash54.getClass();
        tabelaHash31.insere("", (java.lang.Object) wildcardClass85);
        tabelaHash31.imprime();
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100.0d + "'", obj49, 100.0d);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + 100.0d + "'", obj75, 100.0d);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + (byte) -1 + "'", obj80, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + (-1.0f) + "'", obj84, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Ignore
    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
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
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) ' ');
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        tabelaHash0.retira("");
        java.lang.Object obj36 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0d + "'", obj36, 100.0d);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash14.imprime();
        tabelaHash14.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        java.lang.Class<?> wildcardClass29 = tabelaHash23.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash23);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj27 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash22.imprime();
        tabelaHash22.retira("hi!");
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        java.lang.Object obj40 = tabelaHash22.pesquisa("hi!");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash42.imprime();
        tabelaHash42.insere("", (java.lang.Object) (-1.0f));
        tabelaHash42.retira("hi!");
        java.lang.Object obj53 = tabelaHash42.pesquisa("hi!");
        tabelaHash42.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj63 = tabelaHash58.pesquisa("hi!");
        tabelaHash58.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj68 = tabelaHash58.pesquisa("");
        tabelaHash58.imprime();
        tabelaHash42.insere("hi!", (java.lang.Object) tabelaHash58);
        tabelaHash58.imprime();
        java.lang.Object obj73 = tabelaHash58.pesquisa("hi!");
        java.lang.Class<?> wildcardClass74 = tabelaHash58.getClass();
        tabelaHash22.insere("", (java.lang.Object) wildcardClass74);
        ds.TabelaHash tabelaHash77 = new ds.TabelaHash();
        tabelaHash77.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj82 = tabelaHash77.pesquisa("hi!");
        tabelaHash77.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj87 = tabelaHash77.pesquisa("");
        tabelaHash77.imprime();
        java.lang.Object obj90 = tabelaHash77.pesquisa("hi!");
        tabelaHash77.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) tabelaHash77);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash77);
        java.lang.Object obj95 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0d + "'", obj27, 100.0d);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 100.0d + "'", obj63, 100.0d);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + (byte) -1 + "'", obj68, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 100.0d + "'", obj73, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + 100.0d + "'", obj82, 100.0d);
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + (byte) -1 + "'", obj87, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj90 + "' != '" + 100.0d + "'", obj90, 100.0d);
        org.junit.Assert.assertNull(obj95);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash10.imprime();
        tabelaHash10.insere("", (java.lang.Object) ' ');
        tabelaHash10.imprime();
        tabelaHash10.retira("");
        java.lang.Class<?> wildcardClass21 = tabelaHash10.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass21);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash16.imprime();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash31.imprime();
        tabelaHash31.insere("", (java.lang.Object) ' ');
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash31);
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj49 = tabelaHash44.pesquisa("hi!");
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash44);
        tabelaHash31.imprime();
        tabelaHash31.retira("");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100.0d + "'", obj49, 100.0d);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj17 = tabelaHash12.pesquisa("hi!");
        java.lang.Class<?> wildcardClass18 = tabelaHash12.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj33 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj41 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj46 = tabelaHash28.pesquisa("hi!");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash48.imprime();
        tabelaHash48.insere("", (java.lang.Object) ' ');
        tabelaHash48.imprime();
        tabelaHash48.retira("");
        tabelaHash48.imprime();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash48);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash28);
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        tabelaHash63.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash63.imprime();
        tabelaHash63.insere("", (java.lang.Object) ' ');
        tabelaHash63.retira("hi!");
        tabelaHash63.imprime();
        ds.TabelaHash tabelaHash75 = new ds.TabelaHash();
        tabelaHash75.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash75.imprime();
        tabelaHash75.imprime();
        ds.TabelaHash tabelaHash82 = new ds.TabelaHash();
        tabelaHash82.imprime();
        tabelaHash75.insere("hi!", (java.lang.Object) tabelaHash82);
        java.lang.Object obj86 = tabelaHash75.pesquisa("hi!");
        tabelaHash75.imprime();
        tabelaHash63.insere("", (java.lang.Object) tabelaHash75);
        java.lang.Object obj90 = tabelaHash63.pesquisa("hi!");
        tabelaHash63.retira("");
        tabelaHash28.insere("", (java.lang.Object) tabelaHash63);
        java.lang.Object obj95 = tabelaHash28.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0d + "'", obj33, 100.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) -1 + "'", obj38, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
        org.junit.Assert.assertEquals("'" + obj86 + "' != '" + 100.0d + "'", obj86, 100.0d);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertEquals("'" + obj95 + "' != '" + (byte) -1 + "'", obj95, (byte) -1);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass19 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj29 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj34 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        tabelaHash24.insere("", (java.lang.Object) (byte) 0);
        tabelaHash0.insere("", (java.lang.Object) (byte) 0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) ' ');
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        tabelaHash14.retira("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash30);
        tabelaHash30.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj37 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj44 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.imprime();
        tabelaHash39.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj50 = tabelaHash39.pesquisa("");
        tabelaHash39.retira("hi!");
        tabelaHash39.imprime();
        java.lang.Object obj55 = tabelaHash39.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 100.0d + "'", obj44, 100.0d);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 10);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) (-1.0f));
        tabelaHash18.retira("hi!");
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash18.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        java.lang.Class<?> wildcardClass36 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash10.retira("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash10.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) ' ');
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj30 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj37 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj42 = tabelaHash32.pesquisa("");
        tabelaHash32.imprime();
        tabelaHash17.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        java.lang.Class<?> wildcardClass46 = tabelaHash17.getClass();
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0d + "'", obj30, 100.0d);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0d + "'", obj37, 100.0d);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) -1 + "'", obj42, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) ' ');
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (short) 10);
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.retira("hi!");
        tabelaHash16.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj37 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0d + "'", obj37, 100.0d);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash25);
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) ' ');
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.retira("");
        tabelaHash33.imprime();
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) tabelaHash49);
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) (-1.0f));
        tabelaHash18.retira("hi!");
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash18.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 10L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj18 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj23 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj26 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj31 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.retira("");
        tabelaHash13.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash36.imprime();
        tabelaHash36.imprime();
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.imprime();
        tabelaHash36.insere("hi!", (java.lang.Object) tabelaHash43);
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash36);
        java.lang.Object obj48 = tabelaHash36.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash36);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0d + "'", obj31, 100.0d);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (short) 10);
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.retira("hi!");
        tabelaHash16.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj37 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash32);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash32.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0d + "'", obj37, 100.0d);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj33 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj41 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj46 = tabelaHash28.pesquisa("hi!");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash48.imprime();
        tabelaHash48.insere("", (java.lang.Object) ' ');
        tabelaHash48.imprime();
        tabelaHash48.retira("");
        tabelaHash48.imprime();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash48);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Class<?> wildcardClass62 = tabelaHash28.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0d + "'", obj33, 100.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) -1 + "'", obj38, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) true);
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash31.imprime();
        tabelaHash31.insere("", (java.lang.Object) ' ');
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.retira("");
        java.lang.Object obj46 = tabelaHash31.pesquisa("hi!");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash48.imprime();
        tabelaHash48.insere("", (java.lang.Object) ' ');
        tabelaHash48.imprime();
        tabelaHash48.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj61 = tabelaHash48.pesquisa("hi!");
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        tabelaHash63.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj68 = tabelaHash63.pesquisa("hi!");
        tabelaHash63.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj73 = tabelaHash63.pesquisa("");
        tabelaHash63.imprime();
        tabelaHash48.insere("", (java.lang.Object) tabelaHash63);
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash48);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash31);
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 100.0d + "'", obj61, 100.0d);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 100.0d + "'", obj68, 100.0d);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + (byte) -1 + "'", obj73, (byte) -1);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1L));
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) 10);
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 10 + "'", obj17, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj17 = null;
        tabelaHash0.insere("hi!", obj17);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash25.imprime();
        java.lang.Object obj31 = tabelaHash25.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj23 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash38.imprime();
        tabelaHash38.insere("", (java.lang.Object) (-1.0f));
        tabelaHash38.retira("hi!");
        java.lang.Object obj49 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        tabelaHash54.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj59 = tabelaHash54.pesquisa("hi!");
        tabelaHash54.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj64 = tabelaHash54.pesquisa("");
        tabelaHash54.imprime();
        tabelaHash38.insere("hi!", (java.lang.Object) tabelaHash54);
        java.lang.Object obj68 = tabelaHash38.pesquisa("");
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash38);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 100.0d + "'", obj59, 100.0d);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + (byte) -1 + "'", obj64, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + (-1.0f) + "'", obj68, (-1.0f));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        java.lang.Object obj35 = tabelaHash23.pesquisa("");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj42 = tabelaHash37.pesquisa("hi!");
        tabelaHash37.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj47 = tabelaHash37.pesquisa("");
        tabelaHash37.imprime();
        java.lang.Object obj50 = tabelaHash37.pesquisa("hi!");
        tabelaHash37.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj55 = tabelaHash37.pesquisa("hi!");
        ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
        tabelaHash57.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash57.imprime();
        tabelaHash57.insere("", (java.lang.Object) ' ');
        tabelaHash57.imprime();
        tabelaHash57.retira("");
        tabelaHash57.imprime();
        tabelaHash37.insere("", (java.lang.Object) tabelaHash57);
        tabelaHash37.retira("hi!");
        tabelaHash23.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0d + "'", obj42, 100.0d);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (byte) -1 + "'", obj47, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 100.0d + "'", obj50, 100.0d);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 100.0d + "'", obj55, 100.0d);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (short) 10);
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.retira("hi!");
        tabelaHash16.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj25 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj32 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash27.imprime();
        tabelaHash27.retira("hi!");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj46 = tabelaHash41.pesquisa("hi!");
        tabelaHash41.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj51 = tabelaHash41.pesquisa("");
        tabelaHash41.retira("hi!");
        tabelaHash41.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash41);
        tabelaHash20.insere("", (java.lang.Object) tabelaHash41);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        tabelaHash59.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj64 = tabelaHash59.pesquisa("hi!");
        tabelaHash59.imprime();
        tabelaHash59.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash59.imprime();
        tabelaHash59.retira("hi!");
        tabelaHash59.imprime();
        tabelaHash59.imprime();
        java.lang.Object obj75 = tabelaHash59.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash59);
        tabelaHash59.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0d + "'", obj25, 100.0d);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0d + "'", obj32, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) -1 + "'", obj51, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 100.0d + "'", obj64, 100.0d);
        org.junit.Assert.assertNull(obj75);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash25);
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj38 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj43 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        tabelaHash33.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass48 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0d + "'", obj38, 100.0d);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj23 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass29 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj23 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj27 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash22);
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0d + "'", obj27, 100.0d);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj34 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.insere("", (java.lang.Object) (byte) -1);
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        java.lang.Object obj46 = tabelaHash39.pesquisa("hi!");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash48.imprime();
        tabelaHash48.insere("", (java.lang.Object) (-1.0f));
        tabelaHash48.retira("hi!");
        java.lang.Object obj59 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash48.imprime();
        tabelaHash39.insere("", (java.lang.Object) tabelaHash48);
        java.lang.Class<?> wildcardClass65 = tabelaHash48.getClass();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash48);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash29);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0d + "'", obj34, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) (-1.0f));
        tabelaHash18.retira("hi!");
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash18.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        tabelaHash18.imprime();
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0d + "'", obj10, 100.0d);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object obj11 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash13.imprime();
        tabelaHash13.insere("", (java.lang.Object) ' ');
        tabelaHash13.imprime();
        tabelaHash13.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj26 = tabelaHash13.pesquisa("hi!");
        java.lang.Object obj28 = tabelaHash13.pesquisa("");
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash31.imprime();
        tabelaHash31.insere("", (java.lang.Object) ' ');
        tabelaHash31.imprime();
        tabelaHash31.retira("");
        tabelaHash31.imprime();
        java.lang.Class<?> wildcardClass43 = tabelaHash31.getClass();
        tabelaHash13.insere("", (java.lang.Object) wildcardClass43);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + ' ' + "'", obj28, ' ');
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash25.imprime();
        java.lang.Object obj31 = tabelaHash25.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0d + "'", obj10, 100.0d);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) true);
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash31.imprime();
        tabelaHash31.insere("", (java.lang.Object) ' ');
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.retira("");
        java.lang.Object obj46 = tabelaHash31.pesquisa("hi!");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash48.imprime();
        tabelaHash48.insere("", (java.lang.Object) ' ');
        tabelaHash48.imprime();
        tabelaHash48.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj61 = tabelaHash48.pesquisa("hi!");
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        tabelaHash63.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj68 = tabelaHash63.pesquisa("hi!");
        tabelaHash63.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj73 = tabelaHash63.pesquisa("");
        tabelaHash63.imprime();
        tabelaHash48.insere("", (java.lang.Object) tabelaHash63);
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash48);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash31);
        java.lang.Object obj79 = tabelaHash31.pesquisa("");
        java.lang.Class<?> wildcardClass80 = tabelaHash31.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 100.0d + "'", obj61, 100.0d);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 100.0d + "'", obj68, 100.0d);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + (byte) -1 + "'", obj73, (byte) -1);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) ' ');
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj35 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (-1.0f) + "'", obj35, (-1.0f));
    }

    @Ignore
    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj43 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        java.lang.Object obj46 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash38);
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash51.imprime();
        tabelaHash51.imprime();
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.imprime();
        tabelaHash51.insere("hi!", (java.lang.Object) tabelaHash58);
        tabelaHash51.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0d + "'", obj43, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj18 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj23 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj26 = tabelaHash13.pesquisa("hi!");
        java.lang.Class<?> wildcardClass27 = tabelaHash13.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        java.lang.Class<?> wildcardClass29 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) ' ');
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object obj34 = tabelaHash0.pesquisa("");
        java.lang.Object obj36 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj43 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj53 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.imprime();
        tabelaHash48.imprime();
        tabelaHash38.insere("", (java.lang.Object) tabelaHash48);
        tabelaHash48.retira("hi!");
        tabelaHash48.imprime();
        tabelaHash48.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash48);
        java.lang.Object obj63 = tabelaHash48.pesquisa("hi!");
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        tabelaHash65.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj70 = tabelaHash65.pesquisa("hi!");
        tabelaHash65.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj75 = tabelaHash65.pesquisa("");
        tabelaHash65.imprime();
        java.lang.Object obj78 = tabelaHash65.pesquisa("hi!");
        tabelaHash65.imprime();
        java.lang.Class<?> wildcardClass80 = tabelaHash65.getClass();
        tabelaHash48.insere("hi!", (java.lang.Object) wildcardClass80);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0d + "'", obj36, 100.0d);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0d + "'", obj43, 100.0d);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 100.0d + "'", obj53, 100.0d);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + 100.0d + "'", obj70, 100.0d);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + (byte) -1 + "'", obj75, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + 100.0d + "'", obj78, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj13 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash8.imprime();
        tabelaHash8.retira("hi!");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash8.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("hi!");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj36 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.imprime();
        tabelaHash31.retira("hi!");
        tabelaHash14.insere("", (java.lang.Object) tabelaHash31);
        java.lang.Class<?> wildcardClass41 = tabelaHash14.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0d + "'", obj36, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj12 = null;
        tabelaHash0.insere("", obj12);
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj26 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj32 = tabelaHash21.pesquisa("");
        tabelaHash21.retira("hi!");
        tabelaHash21.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash21);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj43 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj48 = tabelaHash38.pesquisa("");
        tabelaHash38.imprime();
        java.lang.Object obj51 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj56 = tabelaHash38.pesquisa("hi!");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash58.imprime();
        tabelaHash58.insere("", (java.lang.Object) ' ');
        tabelaHash58.imprime();
        tabelaHash58.retira("");
        tabelaHash58.imprime();
        tabelaHash38.insere("", (java.lang.Object) tabelaHash58);
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash38);
        java.lang.Class<?> wildcardClass72 = tabelaHash21.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass72);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash76 = new ds.TabelaHash();
        tabelaHash76.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash76.imprime();
        tabelaHash76.insere("", (java.lang.Object) ' ');
        tabelaHash76.imprime();
        tabelaHash76.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj89 = tabelaHash76.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0d + "'", obj43, 100.0d);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) -1 + "'", obj48, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 100.0d + "'", obj51, 100.0d);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 100.0d + "'", obj56, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertEquals("'" + obj89 + "' != '" + ' ' + "'", obj89, ' ');
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) ' ');
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass35 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) ' ');
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        tabelaHash20.imprime();
        java.lang.Object obj35 = tabelaHash20.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj23 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj33 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) (-1.0f));
        tabelaHash9.retira("hi!");
        java.lang.Object obj20 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj30 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj35 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash25);
        tabelaHash25.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash25.insere("hi!", (java.lang.Object) 0.0d);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0d + "'", obj30, 100.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) ' ');
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object obj34 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0d + "'", obj34, 100.0d);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj14 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        java.lang.Class<?> wildcardClass17 = tabelaHash9.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass21 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0d + "'", obj14, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) (-1.0f));
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) (-1.0f));
        tabelaHash14.retira("hi!");
        java.lang.Object obj25 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj40 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash30.imprime();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash30);
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash47.imprime();
        java.lang.Object obj53 = tabelaHash47.pesquisa("hi!");
        tabelaHash47.imprime();
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        tabelaHash56.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash56.imprime();
        tabelaHash56.insere("", (java.lang.Object) ' ');
        tabelaHash56.retira("hi!");
        tabelaHash56.imprime();
        ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
        tabelaHash68.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash68.imprime();
        tabelaHash68.imprime();
        ds.TabelaHash tabelaHash75 = new ds.TabelaHash();
        tabelaHash75.imprime();
        tabelaHash68.insere("hi!", (java.lang.Object) tabelaHash75);
        java.lang.Object obj79 = tabelaHash68.pesquisa("hi!");
        tabelaHash68.imprime();
        tabelaHash56.insere("", (java.lang.Object) tabelaHash68);
        tabelaHash47.insere("", (java.lang.Object) "");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash47);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass85 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) -1 + "'", obj40, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 100.0d + "'", obj53, 100.0d);
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + 100.0d + "'", obj79, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        java.lang.Object obj23 = tabelaHash16.pesquisa("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash25.imprime();
        tabelaHash25.insere("", (java.lang.Object) (-1.0f));
        tabelaHash25.retira("hi!");
        java.lang.Object obj36 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash25.imprime();
        tabelaHash16.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object obj44 = tabelaHash0.pesquisa("");
        java.lang.Object obj46 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + "" + "'", obj44, "");
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "" + "'", obj46, "");
    }

    @Ignore
    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1L));
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) 10);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj20 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass21 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) (-1.0f));
        tabelaHash9.retira("hi!");
        java.lang.Object obj20 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj30 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj35 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash25);
        tabelaHash25.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash25.imprime();
        java.lang.Object obj42 = tabelaHash25.pesquisa("hi!");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0d + "'", obj30, 100.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0d + "'", obj42, 100.0d);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        java.lang.Object obj20 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) ' ');
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object obj34 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        java.lang.Object obj39 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0d + "'", obj34, 100.0d);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) -1 + "'", obj39, (byte) -1);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("hi!");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj41 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj48 = tabelaHash43.pesquisa("hi!");
        tabelaHash43.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj53 = tabelaHash43.pesquisa("");
        tabelaHash43.imprime();
        java.lang.Object obj56 = tabelaHash43.pesquisa("hi!");
        tabelaHash43.imprime();
        java.lang.Object obj59 = tabelaHash43.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash43);
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        tabelaHash62.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash62.imprime();
        tabelaHash62.insere("", (java.lang.Object) ' ');
        tabelaHash62.imprime();
        tabelaHash62.imprime();
        tabelaHash62.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash62);
        java.lang.Class<?> wildcardClass74 = tabelaHash62.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100.0d + "'", obj48, 100.0d);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) -1 + "'", obj53, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 100.0d + "'", obj56, 100.0d);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 100.0d + "'", obj59, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 10L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj23 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + ' ' + "'", obj29, ' ');
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) ' ');
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        tabelaHash0.imprime();
        java.lang.Object obj35 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) -1 + "'", obj12, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
// flaky:         tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash25);
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        java.lang.Object obj33 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) ' ');
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object obj34 = tabelaHash0.pesquisa("");
        java.lang.Object obj36 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj43 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj53 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.imprime();
        tabelaHash48.imprime();
        tabelaHash38.insere("", (java.lang.Object) tabelaHash48);
        tabelaHash48.retira("hi!");
        tabelaHash48.imprime();
        tabelaHash48.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash48);
        java.lang.Class<?> wildcardClass62 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0d + "'", obj36, 100.0d);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0d + "'", obj43, 100.0d);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 100.0d + "'", obj53, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj18 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj23 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj26 = tabelaHash13.pesquisa("hi!");
        java.lang.Class<?> wildcardClass27 = tabelaHash13.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        java.lang.Object obj30 = tabelaHash13.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0d + "'", obj30, 100.0d);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) (-1.0f));
        tabelaHash18.retira("hi!");
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash18.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        java.lang.Object obj37 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + ' ' + "'", obj37, ' ');
    }

    @Ignore
    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash25);
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj38 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj43 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        tabelaHash33.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj54 = tabelaHash49.pesquisa("hi!");
        tabelaHash49.insere("", (java.lang.Object) (short) 10);
        tabelaHash49.imprime();
        tabelaHash49.insere("hi!", (java.lang.Object) (-1L));
        tabelaHash49.insere("hi!", (java.lang.Object) (byte) 10);
        tabelaHash49.retira("hi!");
        ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
        java.lang.Object obj70 = tabelaHash68.pesquisa("hi!");
        tabelaHash49.insere("", (java.lang.Object) "hi!");
        tabelaHash49.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash49);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0d + "'", obj38, 100.0d);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 100.0d + "'", obj54, 100.0d);
        org.junit.Assert.assertNull(obj70);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) ' ');
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object obj34 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass40 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0d + "'", obj34, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) (-1.0f));
        tabelaHash16.retira("hi!");
        java.lang.Object obj27 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj37 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj42 = tabelaHash32.pesquisa("");
        tabelaHash32.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash32);
        tabelaHash32.imprime();
        tabelaHash32.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass49 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0d + "'", obj37, 100.0d);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) -1 + "'", obj42, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("hi!");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj20 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj25 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        java.lang.Object obj28 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj33 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        java.lang.Object obj36 = tabelaHash15.pesquisa("");
        tabelaHash15.retira("");
        tabelaHash15.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash15);
        java.lang.Class<?> wildcardClass41 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0d + "'", obj28, 100.0d);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0d + "'", obj33, 100.0d);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 10L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
// flaky:         tabelaHash23.retira("");
        tabelaHash23.insere("", (java.lang.Object) 1.0d);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) (-1.0f));
        tabelaHash16.retira("hi!");
        java.lang.Object obj27 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj37 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj42 = tabelaHash32.pesquisa("");
        tabelaHash32.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash32);
        tabelaHash32.imprime();
        tabelaHash32.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0d + "'", obj37, 100.0d);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) -1 + "'", obj42, (byte) -1);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 10);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj17 = tabelaHash12.pesquisa("");
        java.lang.Object obj19 = tabelaHash12.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash16.imprime();
        tabelaHash16.retira("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("hi!");
        java.lang.Object obj28 = tabelaHash24.pesquisa("");
        tabelaHash16.insere("", obj28);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash31.imprime();
        tabelaHash31.insere("", (java.lang.Object) (-1.0f));
        tabelaHash31.retira("hi!");
        java.lang.Object obj42 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj52 = tabelaHash47.pesquisa("hi!");
        tabelaHash47.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj57 = tabelaHash47.pesquisa("");
        tabelaHash47.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash47);
        java.lang.Object obj61 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash31);
        java.lang.Class<?> wildcardClass65 = tabelaHash16.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj68 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100.0d + "'", obj52, 100.0d);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (byte) -1 + "'", obj57, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (-1.0f) + "'", obj61, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(obj68);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj27 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash22);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash22.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0d + "'", obj27, 100.0d);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj41 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj46 = tabelaHash36.pesquisa("");
        tabelaHash36.retira("hi!");
        tabelaHash36.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash36);
        tabelaHash36.retira("");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) -1 + "'", obj46, (byte) -1);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash12.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) (-1.0f));
        tabelaHash9.retira("hi!");
        java.lang.Object obj20 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash9.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object obj27 = tabelaHash9.pesquisa("");
        tabelaHash9.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash9.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1.0f) + "'", obj27, (-1.0f));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash8.pesquisa("");
        tabelaHash0.insere("", obj12);
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass16 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("hi!");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object obj28 = null;
        tabelaHash11.insere("hi!", obj28);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) ' ');
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj31 = tabelaHash18.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj38 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj43 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        tabelaHash18.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash18.imprime();
        tabelaHash18.retira("hi!");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj55 = tabelaHash50.pesquisa("hi!");
        tabelaHash50.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj60 = tabelaHash50.pesquisa("");
        tabelaHash50.imprime();
        java.lang.Object obj63 = tabelaHash50.pesquisa("hi!");
        tabelaHash50.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        java.lang.Class<?> wildcardClass69 = tabelaHash50.getClass();
        tabelaHash18.insere("hi!", (java.lang.Object) wildcardClass69);
        tabelaHash0.insere("", (java.lang.Object) wildcardClass69);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0f) + "'", obj13, (-1.0f));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0d + "'", obj31, 100.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0d + "'", obj38, 100.0d);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 100.0d + "'", obj55, 100.0d);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + (byte) -1 + "'", obj60, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 100.0d + "'", obj63, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) ' ');
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash36);
        java.lang.Object obj39 = tabelaHash36.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash25);
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) ' ');
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.retira("");
        tabelaHash33.imprime();
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) tabelaHash49);
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        tabelaHash54.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj59 = tabelaHash54.pesquisa("hi!");
        tabelaHash54.imprime();
        tabelaHash54.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash54.imprime();
        tabelaHash54.retira("hi!");
        ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
        tabelaHash68.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj73 = tabelaHash68.pesquisa("hi!");
        tabelaHash68.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj78 = tabelaHash68.pesquisa("");
        tabelaHash68.retira("hi!");
        tabelaHash68.imprime();
        tabelaHash54.insere("hi!", (java.lang.Object) tabelaHash68);
        tabelaHash68.imprime();
        ds.TabelaHash tabelaHash85 = new ds.TabelaHash();
        tabelaHash85.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj90 = tabelaHash85.pesquisa("hi!");
        tabelaHash85.imprime();
        tabelaHash85.retira("hi!");
        tabelaHash68.insere("", (java.lang.Object) tabelaHash85);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash85);
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 100.0d + "'", obj59, 100.0d);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 100.0d + "'", obj73, 100.0d);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + (byte) -1 + "'", obj78, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj90 + "' != '" + 100.0d + "'", obj90, 100.0d);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj12 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj18 = tabelaHash7.pesquisa("");
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        java.lang.Object obj23 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash32);
        java.lang.Object obj36 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash25);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object obj41 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0d + "'", obj36, 100.0d);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash7.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1L));
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) 10);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj29 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj34 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        java.lang.Object obj37 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj42 = tabelaHash24.pesquisa("hi!");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash44.imprime();
        tabelaHash44.insere("", (java.lang.Object) ' ');
        tabelaHash44.imprime();
        tabelaHash44.retira("");
        tabelaHash44.imprime();
        tabelaHash24.insere("", (java.lang.Object) tabelaHash44);
        java.lang.Object obj58 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.insere("", (java.lang.Object) 10.0d);
        tabelaHash24.retira("hi!");
        tabelaHash24.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0d + "'", obj37, 100.0d);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0d + "'", obj42, 100.0d);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0d + "'", obj58, 100.0d);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) true);
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        java.lang.Object obj20 = tabelaHash10.pesquisa("");
        java.lang.Class<?> wildcardClass21 = tabelaHash10.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash10.retira("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj27 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj33 = tabelaHash22.pesquisa("");
        tabelaHash10.insere("hi!", obj33);
        java.lang.Object obj36 = tabelaHash10.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0d + "'", obj27, 100.0d);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash13.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass16 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj17 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj27 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash22);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) (-1.0f));
        tabelaHash32.retira("hi!");
        java.lang.Object obj43 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj53 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj58 = tabelaHash48.pesquisa("");
        tabelaHash48.imprime();
        tabelaHash32.insere("hi!", (java.lang.Object) tabelaHash48);
        java.lang.Class<?> wildcardClass61 = tabelaHash32.getClass();
        tabelaHash22.insere("hi!", (java.lang.Object) wildcardClass61);
        tabelaHash0.insere("", (java.lang.Object) wildcardClass61);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0d + "'", obj17, 100.0d);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0d + "'", obj27, 100.0d);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 100.0d + "'", obj53, 100.0d);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (byte) -1 + "'", obj58, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash10.imprime();
        tabelaHash10.insere("", (java.lang.Object) ' ');
        tabelaHash10.imprime();
        tabelaHash10.retira("");
        java.lang.Class<?> wildcardClass21 = tabelaHash10.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass21);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj31 = tabelaHash26.pesquisa("");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj38 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash33.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj44 = tabelaHash33.pesquisa("");
        tabelaHash33.retira("hi!");
        tabelaHash33.imprime();
        java.lang.Object obj49 = tabelaHash33.pesquisa("");
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash51.imprime();
        tabelaHash51.imprime();
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.imprime();
        tabelaHash51.insere("hi!", (java.lang.Object) tabelaHash58);
        java.lang.Object obj62 = tabelaHash51.pesquisa("hi!");
        tabelaHash51.imprime();
        tabelaHash33.insere("hi!", (java.lang.Object) tabelaHash51);
        tabelaHash26.insere("hi!", (java.lang.Object) tabelaHash33);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash33);
        java.lang.Object obj68 = tabelaHash33.pesquisa("hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0d + "'", obj38, 100.0d);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 100.0d + "'", obj62, 100.0d);
        org.junit.Assert.assertNotNull(obj68);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj33 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj41 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj46 = tabelaHash28.pesquisa("hi!");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash48.imprime();
        tabelaHash48.insere("", (java.lang.Object) ' ');
        tabelaHash48.imprime();
        tabelaHash48.retira("");
        tabelaHash48.imprime();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash48);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Object obj63 = tabelaHash28.pesquisa("");
        tabelaHash28.retira("");
        java.lang.Class<?> wildcardClass66 = tabelaHash28.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0d + "'", obj33, 100.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) -1 + "'", obj38, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (byte) -1 + "'", obj63, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj12 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash7.imprime();
        tabelaHash7.retira("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj26 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj31 = tabelaHash21.pesquisa("");
        tabelaHash21.retira("hi!");
        tabelaHash21.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash21);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        java.lang.Class<?> wildcardClass37 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj24 = tabelaHash19.pesquisa("hi!");
        java.lang.Object obj26 = tabelaHash19.pesquisa("hi!");
        java.lang.Object obj28 = tabelaHash19.pesquisa("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.imprime();
        tabelaHash30.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj41 = tabelaHash30.pesquisa("");
        tabelaHash30.retira("hi!");
        tabelaHash30.imprime();
        tabelaHash30.insere("", (java.lang.Object) true);
        tabelaHash19.insere("", (java.lang.Object) "");
        tabelaHash13.insere("hi!", (java.lang.Object) "");
        tabelaHash13.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0d + "'", obj28, 100.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) (-1.0f));
        tabelaHash9.retira("hi!");
        java.lang.Object obj20 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash9.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object obj27 = tabelaHash9.pesquisa("");
        java.lang.Object obj29 = tabelaHash9.pesquisa("");
        java.lang.Class<?> wildcardClass30 = tabelaHash9.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1.0f) + "'", obj27, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1.0f) + "'", obj29, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash25);
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        java.lang.Object obj33 = tabelaHash18.pesquisa("hi!");
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0d + "'", obj33, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass23 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) ' ');
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object obj34 = tabelaHash0.pesquisa("");
        java.lang.Object obj36 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0d + "'", obj36, 100.0d);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("hi!");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj41 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj48 = tabelaHash43.pesquisa("hi!");
        tabelaHash43.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj53 = tabelaHash43.pesquisa("");
        tabelaHash43.imprime();
        java.lang.Object obj56 = tabelaHash43.pesquisa("hi!");
        tabelaHash43.imprime();
        java.lang.Object obj59 = tabelaHash43.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash43);
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        tabelaHash62.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash62.imprime();
        tabelaHash62.insere("", (java.lang.Object) ' ');
        tabelaHash62.imprime();
        tabelaHash62.imprime();
        tabelaHash62.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash62);
        tabelaHash62.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100.0d + "'", obj48, 100.0d);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) -1 + "'", obj53, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 100.0d + "'", obj56, 100.0d);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 100.0d + "'", obj59, 100.0d);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj20 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj25 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        java.lang.Object obj28 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj33 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        java.lang.Object obj36 = tabelaHash15.pesquisa("");
        tabelaHash15.retira("");
        tabelaHash15.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash15);
        java.lang.Class<?> wildcardClass41 = tabelaHash15.getClass();
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0d + "'", obj28, 100.0d);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0d + "'", obj33, 100.0d);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 10L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj18 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj23 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash13.insere("", (java.lang.Object) (byte) 0);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass29 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash25);
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        tabelaHash18.imprime();
        java.lang.Class<?> wildcardClass33 = tabelaHash18.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1L));
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) 10);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass20 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj23 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj25 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash20.retira("hi!");
        java.lang.Object obj30 = tabelaHash20.pesquisa("hi!");
        java.lang.Object obj32 = tabelaHash20.pesquisa("");
        tabelaHash0.insere("", obj32);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0d + "'", obj25, 100.0d);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj32 = null;
        tabelaHash0.insere("", obj32);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj40 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj45 = tabelaHash35.pesquisa("");
        tabelaHash35.imprime();
        java.lang.Object obj48 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash35.retira("hi!");
        tabelaHash35.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash35);
        java.lang.Object obj57 = tabelaHash35.pesquisa("hi!");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0d + "'", obj40, 100.0d);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) -1 + "'", obj45, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100.0d + "'", obj48, 100.0d);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj23 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash33.imprime();
        tabelaHash33.retira("hi!");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object obj43 = tabelaHash41.pesquisa("hi!");
        java.lang.Object obj45 = tabelaHash41.pesquisa("");
        tabelaHash33.insere("", obj45);
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash49.imprime();
        tabelaHash49.insere("", (java.lang.Object) (-1.0f));
        tabelaHash49.retira("hi!");
        java.lang.Object obj60 = tabelaHash49.pesquisa("hi!");
        tabelaHash49.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        tabelaHash65.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj70 = tabelaHash65.pesquisa("hi!");
        tabelaHash65.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj75 = tabelaHash65.pesquisa("");
        tabelaHash65.imprime();
        tabelaHash49.insere("hi!", (java.lang.Object) tabelaHash65);
        tabelaHash65.imprime();
        tabelaHash65.insere("hi!", (java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass82 = tabelaHash65.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass82);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + 100.0d + "'", obj70, 100.0d);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + (byte) -1 + "'", obj75, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj23 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash30.imprime();
        tabelaHash30.insere("", (java.lang.Object) ' ');
        tabelaHash30.imprime();
        tabelaHash30.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash25);
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj38 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj43 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        tabelaHash33.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj54 = tabelaHash49.pesquisa("hi!");
        tabelaHash49.insere("", (java.lang.Object) (short) 10);
        tabelaHash49.imprime();
        tabelaHash49.insere("hi!", (java.lang.Object) (-1L));
        tabelaHash49.insere("hi!", (java.lang.Object) (byte) 10);
        tabelaHash49.retira("hi!");
        ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
        java.lang.Object obj70 = tabelaHash68.pesquisa("hi!");
        tabelaHash49.insere("", (java.lang.Object) "hi!");
        tabelaHash49.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash49);
        java.lang.Object obj75 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0d + "'", obj38, 100.0d);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 100.0d + "'", obj54, 100.0d);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(obj75);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) ' ');
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj30 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj37 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj42 = tabelaHash32.pesquisa("");
        tabelaHash32.imprime();
        tabelaHash17.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        tabelaHash17.imprime();
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0d + "'", obj30, 100.0d);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0d + "'", obj37, 100.0d);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) -1 + "'", obj42, (byte) -1);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) ' ');
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass35 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj23 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        java.lang.Object obj29 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + ' ' + "'", obj27, ' ');
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) (-1.0f));
        tabelaHash18.retira("hi!");
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash18.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj43 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj48 = tabelaHash38.pesquisa("");
        tabelaHash38.imprime();
        java.lang.Object obj51 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj56 = tabelaHash38.pesquisa("hi!");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash58.imprime();
        tabelaHash58.insere("", (java.lang.Object) ' ');
        tabelaHash58.imprime();
        tabelaHash58.retira("");
        tabelaHash58.imprime();
        tabelaHash38.insere("", (java.lang.Object) tabelaHash58);
        java.lang.Object obj72 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.insere("", (java.lang.Object) 10.0d);
        java.lang.Object obj77 = tabelaHash38.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0d + "'", obj43, 100.0d);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) -1 + "'", obj48, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 100.0d + "'", obj51, 100.0d);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 100.0d + "'", obj56, 100.0d);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 100.0d + "'", obj72, 100.0d);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + (byte) -1 + "'", obj77, (byte) -1);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 10);
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10 + "'", obj8, 10);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj12 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj22 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash17);
        tabelaHash17.retira("hi!");
        tabelaHash17.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0d + "'", obj22, 100.0d);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj24 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.imprime();
        tabelaHash19.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.imprime();
        tabelaHash30.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj41 = tabelaHash30.pesquisa("");
        tabelaHash30.retira("hi!");
        tabelaHash30.imprime();
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash19.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj25 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj32 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash27.imprime();
        tabelaHash27.retira("hi!");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj46 = tabelaHash41.pesquisa("hi!");
        tabelaHash41.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj51 = tabelaHash41.pesquisa("");
        tabelaHash41.retira("hi!");
        tabelaHash41.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash41);
        tabelaHash20.insere("", (java.lang.Object) tabelaHash41);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0d + "'", obj25, 100.0d);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0d + "'", obj32, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) -1 + "'", obj51, (byte) -1);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj40 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        java.lang.Object obj43 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj48 = tabelaHash30.pesquisa("hi!");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash50.imprime();
        tabelaHash50.insere("", (java.lang.Object) ' ');
        tabelaHash50.imprime();
        tabelaHash50.retira("");
        tabelaHash50.imprime();
        tabelaHash30.insere("", (java.lang.Object) tabelaHash50);
        java.lang.Object obj64 = tabelaHash30.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) -1 + "'", obj40, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0d + "'", obj43, 100.0d);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100.0d + "'", obj48, 100.0d);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 100.0d + "'", obj64, 100.0d);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash8.pesquisa("");
        tabelaHash0.insere("", obj12);
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("hi!");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash30.imprime();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj44 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj49 = tabelaHash39.pesquisa("");
        tabelaHash39.imprime();
        java.lang.Object obj52 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj57 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.imprime();
        tabelaHash30.insere("hi!", (java.lang.Object) tabelaHash39);
        java.lang.Object obj61 = null;
        tabelaHash39.insere("", obj61);
        java.lang.Object obj64 = tabelaHash39.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 100.0d + "'", obj44, 100.0d);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) -1 + "'", obj49, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100.0d + "'", obj52, 100.0d);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 100.0d + "'", obj57, 100.0d);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + (byte) -1 + "'", obj64, (byte) -1);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj25 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj32 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash27.imprime();
        tabelaHash27.retira("hi!");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj46 = tabelaHash41.pesquisa("hi!");
        tabelaHash41.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj51 = tabelaHash41.pesquisa("");
        tabelaHash41.retira("hi!");
        tabelaHash41.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash41);
        tabelaHash20.insere("", (java.lang.Object) tabelaHash41);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        tabelaHash59.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj64 = tabelaHash59.pesquisa("hi!");
        tabelaHash59.imprime();
        tabelaHash59.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash59.imprime();
        tabelaHash59.retira("hi!");
        tabelaHash59.imprime();
        tabelaHash59.imprime();
        java.lang.Object obj75 = tabelaHash59.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash59);
        tabelaHash0.retira("hi!");
        java.lang.Object obj80 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0d + "'", obj25, 100.0d);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0d + "'", obj32, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) -1 + "'", obj51, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 100.0d + "'", obj64, 100.0d);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + (short) 10 + "'", obj80, (short) 10);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) ' ');
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        tabelaHash0.retira("");
        java.lang.Object obj36 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass37 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0d + "'", obj36, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) ' ');
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass27 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) true);
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash31.imprime();
        tabelaHash31.insere("", (java.lang.Object) ' ');
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.retira("");
        java.lang.Object obj46 = tabelaHash31.pesquisa("hi!");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash48.imprime();
        tabelaHash48.insere("", (java.lang.Object) ' ');
        tabelaHash48.imprime();
        tabelaHash48.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj61 = tabelaHash48.pesquisa("hi!");
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        tabelaHash63.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj68 = tabelaHash63.pesquisa("hi!");
        tabelaHash63.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj73 = tabelaHash63.pesquisa("");
        tabelaHash63.imprime();
        tabelaHash48.insere("", (java.lang.Object) tabelaHash63);
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash48);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash31);
        java.lang.Class<?> wildcardClass78 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 100.0d + "'", obj61, 100.0d);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 100.0d + "'", obj68, 100.0d);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + (byte) -1 + "'", obj73, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash14.imprime();
        tabelaHash14.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        java.lang.Class<?> wildcardClass23 = tabelaHash14.getClass();
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj25 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash20.retira("hi!");
        java.lang.Object obj30 = tabelaHash20.pesquisa("hi!");
        java.lang.Object obj32 = tabelaHash20.pesquisa("");
        tabelaHash0.insere("", obj32);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj40 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj45 = tabelaHash35.pesquisa("");
        tabelaHash35.imprime();
        java.lang.Object obj48 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash35.imprime();
        java.lang.Class<?> wildcardClass53 = tabelaHash35.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass53);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0d + "'", obj25, 100.0d);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0d + "'", obj40, 100.0d);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) -1 + "'", obj45, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100.0d + "'", obj48, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash10.imprime();
        tabelaHash10.insere("", (java.lang.Object) ' ');
        tabelaHash10.imprime();
        tabelaHash10.retira("");
        java.lang.Class<?> wildcardClass21 = tabelaHash10.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass21);
        java.lang.Class<?> wildcardClass23 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj24 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.imprime();
        tabelaHash19.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.imprime();
        tabelaHash30.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj41 = tabelaHash30.pesquisa("");
        tabelaHash30.retira("hi!");
        tabelaHash30.imprime();
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash19.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Class<?> wildcardClass48 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj12 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj18 = tabelaHash7.pesquisa("");
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        java.lang.Object obj23 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash32);
        java.lang.Object obj36 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash25);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Class<?> wildcardClass40 = tabelaHash7.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0d + "'", obj36, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) ' ');
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        tabelaHash14.retira("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash30);
        tabelaHash30.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj37 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass38 = obj37.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj20 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj25 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj37 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj42 = tabelaHash32.pesquisa("");
        tabelaHash32.imprime();
        java.lang.Object obj45 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        java.lang.Class<?> wildcardClass51 = tabelaHash32.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass51);
        java.lang.Object obj54 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0d + "'", obj37, 100.0d);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) -1 + "'", obj42, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 100.0d + "'", obj45, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + ' ' + "'", obj54, ' ');
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash25);
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj38 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj43 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        tabelaHash33.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass49 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0d + "'", obj38, 100.0d);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj20 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj25 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash15.retira("");
        tabelaHash15.imprime();
        java.lang.Class<?> wildcardClass31 = tabelaHash15.getClass();
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("hi!");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash30.imprime();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj44 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj49 = tabelaHash39.pesquisa("");
        tabelaHash39.imprime();
        java.lang.Object obj52 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj57 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.imprime();
        tabelaHash30.insere("hi!", (java.lang.Object) tabelaHash39);
        java.lang.Object obj61 = null;
        tabelaHash39.insere("", obj61);
        ds.TabelaHash tabelaHash64 = new ds.TabelaHash();
        tabelaHash64.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj69 = tabelaHash64.pesquisa("hi!");
        tabelaHash64.imprime();
        java.lang.Object obj72 = tabelaHash64.pesquisa("hi!");
        tabelaHash64.retira("hi!");
        tabelaHash64.imprime();
        tabelaHash64.imprime();
        tabelaHash39.insere("hi!", (java.lang.Object) tabelaHash64);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 100.0d + "'", obj44, 100.0d);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) -1 + "'", obj49, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100.0d + "'", obj52, 100.0d);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 100.0d + "'", obj57, 100.0d);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 100.0d + "'", obj69, 100.0d);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 100.0d + "'", obj72, 100.0d);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash13.imprime();
        tabelaHash13.insere("", (java.lang.Object) (-1.0f));
        tabelaHash13.retira("hi!");
        java.lang.Object obj24 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash13.imprime();
        tabelaHash13.retira("hi!");
        java.lang.Object obj32 = tabelaHash13.pesquisa("");
        java.lang.Object obj34 = tabelaHash13.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (-1.0f) + "'", obj32, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (-1.0f) + "'", obj34, (-1.0f));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj18 = tabelaHash13.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) ' ');
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object obj34 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.imprime();
        tabelaHash37.insere("hi!", (java.lang.Object) tabelaHash44);
        tabelaHash37.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash37);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) ' ');
        tabelaHash18.imprime();
        tabelaHash18.retira("");
        java.lang.Object obj30 = tabelaHash18.pesquisa("");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash32.imprime();
        tabelaHash32.retira("hi!");
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash32);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash32);
        java.lang.Class<?> wildcardClass41 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj25 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj32 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash27.imprime();
        tabelaHash27.retira("hi!");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj46 = tabelaHash41.pesquisa("hi!");
        tabelaHash41.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj51 = tabelaHash41.pesquisa("");
        tabelaHash41.retira("hi!");
        tabelaHash41.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash41);
        tabelaHash20.insere("", (java.lang.Object) tabelaHash41);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        tabelaHash59.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj64 = tabelaHash59.pesquisa("hi!");
        tabelaHash59.imprime();
        tabelaHash59.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash59.imprime();
        tabelaHash59.retira("hi!");
        tabelaHash59.imprime();
        tabelaHash59.imprime();
        java.lang.Object obj75 = tabelaHash59.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash59);
        java.lang.Object obj78 = tabelaHash59.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0d + "'", obj25, 100.0d);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0d + "'", obj32, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) -1 + "'", obj51, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 100.0d + "'", obj64, 100.0d);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj78);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash10.retira("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        java.lang.Object obj25 = tabelaHash10.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) ' ');
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object obj34 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object obj43 = tabelaHash41.pesquisa("hi!");
        tabelaHash41.insere("hi!", (java.lang.Object) 10L);
        tabelaHash41.retira("hi!");
        java.lang.Object obj50 = tabelaHash41.pesquisa("hi!");
        tabelaHash41.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash41);
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0d + "'", obj34, 100.0d);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj43 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        java.lang.Object obj46 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash38);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0d + "'", obj43, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash25);
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj38 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj43 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        tabelaHash33.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj54 = tabelaHash49.pesquisa("hi!");
        tabelaHash49.insere("", (java.lang.Object) (short) 10);
        tabelaHash49.imprime();
        tabelaHash49.insere("hi!", (java.lang.Object) (-1L));
        tabelaHash49.insere("hi!", (java.lang.Object) (byte) 10);
        tabelaHash49.retira("hi!");
        ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
        java.lang.Object obj70 = tabelaHash68.pesquisa("hi!");
        tabelaHash49.insere("", (java.lang.Object) "hi!");
        tabelaHash49.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash49);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash49.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0d + "'", obj38, 100.0d);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 100.0d + "'", obj54, 100.0d);
        org.junit.Assert.assertNull(obj70);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash31.imprime();
        tabelaHash31.insere("", (java.lang.Object) ' ');
        tabelaHash31.imprime();
        tabelaHash31.retira("hi!");
        tabelaHash31.imprime();
        tabelaHash31.retira("");
        java.lang.Object obj46 = tabelaHash31.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash31);
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) ' ');
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash0.insere("", (java.lang.Object) 100L);
        java.lang.Object obj29 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash16.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash22.imprime();
        tabelaHash22.insere("", (java.lang.Object) ' ');
        tabelaHash22.retira("hi!");
        tabelaHash22.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash34.imprime();
        tabelaHash34.insere("", (java.lang.Object) ' ');
        tabelaHash34.imprime();
        tabelaHash34.retira("");
        tabelaHash34.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash22.insere("", (java.lang.Object) 100L);
        java.lang.Object obj51 = tabelaHash22.pesquisa("hi!");
        java.lang.Object obj53 = tabelaHash22.pesquisa("");
        tabelaHash16.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + ' ' + "'", obj53, ' ');
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass19 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
// flaky:         tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) ' ');
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.retira("");
        tabelaHash16.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash16.retira("");
        java.lang.Class<?> wildcardClass36 = tabelaHash16.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) (-1.0f));
        tabelaHash20.retira("hi!");
        java.lang.Object obj31 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj41 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj46 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash36);
        tabelaHash36.imprime();
        java.lang.Object obj51 = tabelaHash36.pesquisa("hi!");
        java.lang.Class<?> wildcardClass52 = tabelaHash36.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass52);
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        tabelaHash55.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj60 = tabelaHash55.pesquisa("hi!");
        tabelaHash55.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj65 = tabelaHash55.pesquisa("");
        tabelaHash55.imprime();
        java.lang.Object obj68 = tabelaHash55.pesquisa("hi!");
        tabelaHash55.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash55);
        tabelaHash55.retira("");
        tabelaHash55.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) -1 + "'", obj46, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 100.0d + "'", obj51, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 100.0d + "'", obj60, 100.0d);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (byte) -1 + "'", obj65, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 100.0d + "'", obj68, 100.0d);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj32 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash27.imprime();
        tabelaHash27.retira("hi!");
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash19.insere("", (java.lang.Object) tabelaHash27);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0d + "'", obj32, 100.0d);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) (-1.0f));
        tabelaHash9.retira("hi!");
        java.lang.Object obj20 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash9.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object obj27 = tabelaHash9.pesquisa("");
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1.0f) + "'", obj27, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj23 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash33.imprime();
        tabelaHash33.retira("hi!");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object obj43 = tabelaHash41.pesquisa("hi!");
        java.lang.Object obj45 = tabelaHash41.pesquisa("");
        tabelaHash33.insere("", obj45);
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj54 = tabelaHash49.pesquisa("hi!");
        tabelaHash49.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj59 = tabelaHash49.pesquisa("");
        tabelaHash49.imprime();
        java.lang.Object obj62 = tabelaHash49.pesquisa("hi!");
        tabelaHash49.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj67 = tabelaHash49.pesquisa("hi!");
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash49);
        java.lang.Object obj72 = tabelaHash49.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 100.0d + "'", obj54, 100.0d);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (byte) -1 + "'", obj59, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 100.0d + "'", obj62, 100.0d);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 100.0d + "'", obj67, 100.0d);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + (byte) -1 + "'", obj72, (byte) -1);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("hi!");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash0.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash19.imprime();
        tabelaHash19.insere("", (java.lang.Object) (-1.0f));
        tabelaHash19.retira("hi!");
        java.lang.Object obj30 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj40 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj45 = tabelaHash35.pesquisa("");
        tabelaHash35.imprime();
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash35);
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        java.lang.Object obj51 = null;
        tabelaHash19.insere("", obj51);
        tabelaHash0.insere("", obj51);
        java.lang.Class<?> wildcardClass54 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0d + "'", obj40, 100.0d);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) -1 + "'", obj45, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) (-1.0f));
        tabelaHash9.retira("hi!");
        java.lang.Object obj20 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash9.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash9.retira("");
        java.lang.Object obj29 = tabelaHash9.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) 1 + "'", obj29, (short) 1);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj23 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash12.imprime();
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash25);
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj38 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj43 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        tabelaHash33.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj54 = tabelaHash49.pesquisa("hi!");
        tabelaHash49.insere("", (java.lang.Object) (short) 10);
        tabelaHash49.imprime();
        tabelaHash49.insere("hi!", (java.lang.Object) (-1L));
        tabelaHash49.insere("hi!", (java.lang.Object) (byte) 10);
        tabelaHash49.retira("hi!");
        ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
        java.lang.Object obj70 = tabelaHash68.pesquisa("hi!");
        tabelaHash49.insere("", (java.lang.Object) "hi!");
        tabelaHash49.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash49);
        tabelaHash49.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0d + "'", obj38, 100.0d);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 100.0d + "'", obj54, 100.0d);
        org.junit.Assert.assertNull(obj70);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash16.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1L));
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash34.imprime();
        tabelaHash34.insere("", (java.lang.Object) ' ');
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        java.lang.Class<?> wildcardClass44 = tabelaHash34.getClass();
        tabelaHash16.insere("", (java.lang.Object) wildcardClass44);
        java.lang.Object obj47 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 100.0d + "'", obj47, 100.0d);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj22 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) -1 + "'", obj22, (byte) -1);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash13.imprime();
        tabelaHash13.insere("", (java.lang.Object) (-1.0f));
        tabelaHash13.retira("hi!");
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        java.lang.Class<?> wildcardClass25 = tabelaHash13.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass25);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.insere("hi!", (java.lang.Object) 10L);
        tabelaHash28.retira("hi!");
        java.lang.Object obj37 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        java.lang.Class<?> wildcardClass39 = tabelaHash28.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass39);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        tabelaHash13.imprime();
        java.lang.Class<?> wildcardClass19 = tabelaHash13.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.imprime();
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash21.imprime();
        tabelaHash21.insere("", (java.lang.Object) ' ');
        tabelaHash21.retira("hi!");
        tabelaHash21.imprime();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        tabelaHash33.insere("hi!", (java.lang.Object) tabelaHash40);
        java.lang.Object obj44 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash21.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash12.insere("", (java.lang.Object) "");
        tabelaHash12.retira("");
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj56 = tabelaHash51.pesquisa("hi!");
        tabelaHash51.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj61 = tabelaHash51.pesquisa("");
        tabelaHash51.imprime();
        java.lang.Object obj64 = tabelaHash51.pesquisa("hi!");
        tabelaHash51.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj69 = tabelaHash51.pesquisa("hi!");
        ds.TabelaHash tabelaHash71 = new ds.TabelaHash();
        tabelaHash71.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash71.imprime();
        tabelaHash71.insere("", (java.lang.Object) ' ');
        tabelaHash71.imprime();
        tabelaHash71.retira("");
        tabelaHash71.imprime();
        tabelaHash51.insere("", (java.lang.Object) tabelaHash71);
        tabelaHash51.retira("");
        ds.TabelaHash tabelaHash87 = new ds.TabelaHash();
        tabelaHash51.insere("hi!", (java.lang.Object) tabelaHash87);
        java.lang.Class<?> wildcardClass89 = tabelaHash51.getClass();
        tabelaHash12.insere("", (java.lang.Object) wildcardClass89);
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass89);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 100.0d + "'", obj44, 100.0d);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 100.0d + "'", obj56, 100.0d);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (byte) -1 + "'", obj61, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 100.0d + "'", obj64, 100.0d);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 100.0d + "'", obj69, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) (-1.0f));
        tabelaHash28.retira("hi!");
        java.lang.Object obj39 = tabelaHash28.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash28);
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj33 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj41 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj46 = tabelaHash28.pesquisa("hi!");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash48.imprime();
        tabelaHash48.insere("", (java.lang.Object) ' ');
        tabelaHash48.imprime();
        tabelaHash48.retira("");
        tabelaHash48.imprime();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash48);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash28);
        tabelaHash11.retira("hi!");
        java.lang.Class<?> wildcardClass64 = tabelaHash11.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0d + "'", obj33, 100.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) -1 + "'", obj38, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1L));
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) ' ');
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        java.lang.Object obj26 = tabelaHash12.pesquisa("hi!");
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = obj16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj18 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj29 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        tabelaHash24.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj35 = tabelaHash24.pesquisa("");
        tabelaHash24.retira("hi!");
        tabelaHash24.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash24);
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash41.imprime();
        tabelaHash41.insere("", (java.lang.Object) (-1.0f));
        tabelaHash41.retira("hi!");
        java.lang.Object obj52 = tabelaHash41.pesquisa("hi!");
        tabelaHash13.insere("", (java.lang.Object) tabelaHash41);
        java.lang.Class<?> wildcardClass54 = tabelaHash13.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass54);
        java.lang.Object obj57 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) -1 + "'", obj19, (byte) -1);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash0.retira("");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 1 + "'", obj18, (short) 1);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash10.retira("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj27 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj33 = tabelaHash22.pesquisa("");
        tabelaHash10.insere("hi!", obj33);
        tabelaHash10.retira("hi!");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass42 = tabelaHash38.getClass();
        tabelaHash10.insere("", (java.lang.Object) wildcardClass42);
        tabelaHash10.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0d + "'", obj27, 100.0d);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1L));
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) 10);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) ' ');
        tabelaHash17.imprime();
        tabelaHash17.retira("hi!");
        tabelaHash17.imprime();
        java.lang.Class<?> wildcardClass29 = tabelaHash17.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass29);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj12 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj18 = tabelaHash7.pesquisa("");
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        java.lang.Object obj23 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash32);
        java.lang.Object obj36 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash25);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash7.retira("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0d + "'", obj36, 100.0d);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash19.imprime();
        tabelaHash19.insere("", (java.lang.Object) ' ');
        tabelaHash19.imprime();
        tabelaHash19.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj32 = tabelaHash19.pesquisa("hi!");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj39 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj44 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        tabelaHash19.insere("", (java.lang.Object) tabelaHash34);
        tabelaHash19.imprime();
        tabelaHash19.retira("hi!");
        tabelaHash19.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0d + "'", obj32, 100.0d);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100.0d + "'", obj39, 100.0d);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) -1 + "'", obj44, (byte) -1);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        java.lang.Object obj23 = tabelaHash16.pesquisa("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash25.imprime();
        tabelaHash25.insere("", (java.lang.Object) (-1.0f));
        tabelaHash25.retira("hi!");
        java.lang.Object obj36 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash25.imprime();
        tabelaHash16.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) (-1.0f));
        tabelaHash9.retira("hi!");
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj27 = tabelaHash22.pesquisa("hi!");
        tabelaHash9.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash9.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash0.imprime();
        java.lang.Object obj33 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0d + "'", obj27, 100.0d);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj12 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash7.imprime();
        tabelaHash7.retira("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj26 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj31 = tabelaHash21.pesquisa("");
        tabelaHash21.retira("hi!");
        tabelaHash21.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash21);
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj42 = tabelaHash37.pesquisa("hi!");
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash37);
        tabelaHash37.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj51 = tabelaHash46.pesquisa("hi!");
        tabelaHash46.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj56 = tabelaHash46.pesquisa("");
        tabelaHash46.imprime();
        java.lang.Object obj59 = tabelaHash46.pesquisa("hi!");
        tabelaHash46.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj64 = tabelaHash46.pesquisa("hi!");
        tabelaHash46.imprime();
        tabelaHash37.insere("hi!", (java.lang.Object) tabelaHash46);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash37);
        java.lang.Class<?> wildcardClass68 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0d + "'", obj42, 100.0d);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 100.0d + "'", obj51, 100.0d);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (byte) -1 + "'", obj56, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 100.0d + "'", obj59, 100.0d);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 100.0d + "'", obj64, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) ' ');
        tabelaHash18.imprime();
        tabelaHash18.retira("");
        java.lang.Object obj30 = tabelaHash18.pesquisa("");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash32.imprime();
        tabelaHash32.retira("hi!");
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash32);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash32);
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass43 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj43 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        java.lang.Object obj46 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash38);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0d + "'", obj43, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 10L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj18 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj23 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash13.insere("", (java.lang.Object) (byte) 0);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object obj30 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) (-1.0f));
        tabelaHash17.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        tabelaHash17.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) (-1.0f));
        tabelaHash18.retira("hi!");
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash18.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        java.lang.Object obj37 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj32 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj37 = tabelaHash27.pesquisa("");
        tabelaHash27.imprime();
        java.lang.Object obj40 = tabelaHash27.pesquisa("hi!");
        java.lang.Class<?> wildcardClass41 = tabelaHash27.getClass();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash27);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0d + "'", obj32, 100.0d);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) -1 + "'", obj37, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0d + "'", obj40, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        java.lang.Object obj29 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj34 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        java.lang.Object obj37 = tabelaHash16.pesquisa("");
        java.lang.Object obj39 = tabelaHash16.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0d + "'", obj34, 100.0d);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) -1 + "'", obj37, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100.0d + "'", obj39, 100.0d);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 10L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj18 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj23 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj26 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj31 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.retira("");
        tabelaHash13.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash36.imprime();
        tabelaHash36.imprime();
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.imprime();
        tabelaHash36.insere("hi!", (java.lang.Object) tabelaHash43);
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash36);
        java.lang.Object obj48 = tabelaHash36.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash36);
        tabelaHash0.imprime();
        java.lang.Object obj52 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0d + "'", obj31, 100.0d);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(obj52);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj18 = tabelaHash13.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj27 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj32 = tabelaHash22.pesquisa("");
        tabelaHash22.imprime();
        java.lang.Object obj35 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj40 = tabelaHash22.pesquisa("hi!");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash42.imprime();
        tabelaHash42.insere("", (java.lang.Object) ' ');
        tabelaHash42.imprime();
        tabelaHash42.retira("");
        tabelaHash42.imprime();
        tabelaHash22.insere("", (java.lang.Object) tabelaHash42);
        java.lang.Object obj56 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.insere("", (java.lang.Object) 10.0d);
        tabelaHash22.retira("hi!");
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        java.lang.Object obj65 = tabelaHash63.pesquisa("hi!");
        tabelaHash63.insere("hi!", (java.lang.Object) 10L);
        tabelaHash63.retira("hi!");
        java.lang.Object obj72 = tabelaHash63.pesquisa("hi!");
        tabelaHash63.imprime();
        tabelaHash22.insere("", (java.lang.Object) tabelaHash63);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0d + "'", obj27, 100.0d);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) -1 + "'", obj32, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0d + "'", obj40, 100.0d);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 100.0d + "'", obj56, 100.0d);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj72);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj27 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash22.imprime();
        tabelaHash22.retira("hi!");
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        java.lang.Object obj40 = tabelaHash22.pesquisa("hi!");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash42.imprime();
        tabelaHash42.insere("", (java.lang.Object) (-1.0f));
        tabelaHash42.retira("hi!");
        java.lang.Object obj53 = tabelaHash42.pesquisa("hi!");
        tabelaHash42.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj63 = tabelaHash58.pesquisa("hi!");
        tabelaHash58.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj68 = tabelaHash58.pesquisa("");
        tabelaHash58.imprime();
        tabelaHash42.insere("hi!", (java.lang.Object) tabelaHash58);
        tabelaHash58.imprime();
        java.lang.Object obj73 = tabelaHash58.pesquisa("hi!");
        java.lang.Class<?> wildcardClass74 = tabelaHash58.getClass();
        tabelaHash22.insere("", (java.lang.Object) wildcardClass74);
        ds.TabelaHash tabelaHash77 = new ds.TabelaHash();
        tabelaHash77.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj82 = tabelaHash77.pesquisa("hi!");
        tabelaHash77.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj87 = tabelaHash77.pesquisa("");
        tabelaHash77.imprime();
        java.lang.Object obj90 = tabelaHash77.pesquisa("hi!");
        tabelaHash77.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) tabelaHash77);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash77);
        tabelaHash77.retira("");
        tabelaHash77.imprime();
        java.lang.Class<?> wildcardClass97 = tabelaHash77.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0d + "'", obj27, 100.0d);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 100.0d + "'", obj63, 100.0d);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + (byte) -1 + "'", obj68, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 100.0d + "'", obj73, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + 100.0d + "'", obj82, 100.0d);
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + (byte) -1 + "'", obj87, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj90 + "' != '" + 100.0d + "'", obj90, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj20 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj25 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash15.retira("");
        tabelaHash15.imprime();
        java.lang.Object obj32 = tabelaHash15.pesquisa("");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash34.imprime();
        tabelaHash34.insere("", (java.lang.Object) (-1.0f));
        tabelaHash34.retira("hi!");
        java.lang.Object obj45 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj55 = tabelaHash50.pesquisa("hi!");
        tabelaHash50.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj60 = tabelaHash50.pesquisa("");
        tabelaHash50.imprime();
        tabelaHash34.insere("hi!", (java.lang.Object) tabelaHash50);
        tabelaHash50.imprime();
        tabelaHash50.retira("");
        java.lang.Class<?> wildcardClass66 = tabelaHash50.getClass();
        tabelaHash15.insere("", (java.lang.Object) tabelaHash50);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 100.0d + "'", obj55, 100.0d);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + (byte) -1 + "'", obj60, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj23 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj34 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj40 = tabelaHash29.pesquisa("");
        tabelaHash29.retira("hi!");
        tabelaHash29.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash29);
        tabelaHash18.retira("hi!");
        java.lang.Class<?> wildcardClass47 = tabelaHash18.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass47);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0d + "'", obj34, 100.0d);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1L));
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) 10);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
// flaky:         tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) 10 + "'", obj25, (short) 10);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0d + "'", obj10, 100.0d);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("hi!");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash30.imprime();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj44 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj49 = tabelaHash39.pesquisa("");
        tabelaHash39.imprime();
        java.lang.Object obj52 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj57 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.imprime();
        tabelaHash30.insere("hi!", (java.lang.Object) tabelaHash39);
        java.lang.Object obj61 = null;
        tabelaHash39.insere("", obj61);
        java.lang.Class<?> wildcardClass63 = tabelaHash39.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 100.0d + "'", obj44, 100.0d);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) -1 + "'", obj49, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100.0d + "'", obj52, 100.0d);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 100.0d + "'", obj57, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj32 = null;
        tabelaHash0.insere("", obj32);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj20 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) -1 + "'", obj20, (byte) -1);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj38 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj43 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        java.lang.Object obj46 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj51 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        java.lang.Object obj54 = tabelaHash33.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash33);
        java.lang.Object obj57 = tabelaHash0.pesquisa("");
        java.lang.Object obj59 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0d + "'", obj38, 100.0d);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 100.0d + "'", obj51, 100.0d);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (byte) -1 + "'", obj54, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (-1.0f) + "'", obj57, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (short) 1 + "'", obj59, (short) 1);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 10);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash8.imprime();
        tabelaHash8.insere("", (java.lang.Object) ' ');
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash8.retira("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash24);
        java.lang.Object obj27 = tabelaHash8.pesquisa("hi!");
        tabelaHash0.insere("", obj27);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0d + "'", obj27, 100.0d);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash31.imprime();
        tabelaHash31.insere("", (java.lang.Object) ' ');
        tabelaHash31.imprime();
        tabelaHash31.retira("hi!");
        tabelaHash31.imprime();
        tabelaHash31.retira("");
        java.lang.Object obj46 = tabelaHash31.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash31);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash31.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) (-1.0f));
        tabelaHash20.retira("hi!");
        java.lang.Object obj31 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj41 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj46 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash36);
        tabelaHash36.imprime();
        java.lang.Object obj51 = tabelaHash36.pesquisa("hi!");
        java.lang.Class<?> wildcardClass52 = tabelaHash36.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass52);
        java.lang.Object obj55 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) -1 + "'", obj46, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 100.0d + "'", obj51, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) ' ');
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj30 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj37 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj42 = tabelaHash32.pesquisa("");
        tabelaHash32.imprime();
        tabelaHash17.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj52 = tabelaHash47.pesquisa("hi!");
        tabelaHash47.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
        tabelaHash57.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj62 = tabelaHash57.pesquisa("hi!");
        tabelaHash57.imprime();
        tabelaHash57.imprime();
        tabelaHash47.insere("", (java.lang.Object) tabelaHash57);
        tabelaHash47.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0d + "'", obj30, 100.0d);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0d + "'", obj37, 100.0d);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) -1 + "'", obj42, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100.0d + "'", obj52, 100.0d);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 100.0d + "'", obj62, 100.0d);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash7.imprime();
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj23 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) (-1.0f));
        tabelaHash15.retira("hi!");
        java.lang.Object obj26 = tabelaHash15.pesquisa("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) (-1.0f));
        tabelaHash28.retira("hi!");
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        java.lang.Class<?> wildcardClass40 = tabelaHash28.getClass();
        tabelaHash15.insere("hi!", (java.lang.Object) wildcardClass40);
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        java.lang.Object obj45 = tabelaHash43.pesquisa("hi!");
        tabelaHash43.insere("hi!", (java.lang.Object) 10L);
        tabelaHash43.retira("hi!");
        java.lang.Object obj52 = tabelaHash43.pesquisa("hi!");
        tabelaHash43.imprime();
        java.lang.Class<?> wildcardClass54 = tabelaHash43.getClass();
        tabelaHash15.insere("hi!", (java.lang.Object) wildcardClass54);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        java.lang.Object obj35 = tabelaHash23.pesquisa("");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj42 = tabelaHash37.pesquisa("hi!");
        tabelaHash37.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj47 = tabelaHash37.pesquisa("");
        tabelaHash37.imprime();
        java.lang.Object obj50 = tabelaHash37.pesquisa("hi!");
        tabelaHash37.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj55 = tabelaHash37.pesquisa("hi!");
        ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
        tabelaHash57.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash57.imprime();
        tabelaHash57.insere("", (java.lang.Object) ' ');
        tabelaHash57.imprime();
        tabelaHash57.retira("");
        tabelaHash57.imprime();
        tabelaHash37.insere("", (java.lang.Object) tabelaHash57);
        tabelaHash37.retira("");
        java.lang.Object obj73 = tabelaHash37.pesquisa("hi!");
        tabelaHash23.insere("hi!", obj73);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0d + "'", obj42, 100.0d);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (byte) -1 + "'", obj47, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 100.0d + "'", obj50, 100.0d);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 100.0d + "'", obj55, 100.0d);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 100.0d + "'", obj73, 100.0d);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj33 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj41 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj46 = tabelaHash28.pesquisa("hi!");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash48.imprime();
        tabelaHash48.insere("", (java.lang.Object) ' ');
        tabelaHash48.imprime();
        tabelaHash48.retira("");
        tabelaHash48.imprime();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash48);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Object obj63 = tabelaHash28.pesquisa("");
        tabelaHash28.retira("");
        tabelaHash28.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0d + "'", obj33, 100.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) -1 + "'", obj38, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (byte) -1 + "'", obj63, (byte) -1);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash16.imprime();
        tabelaHash16.retira("");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj38 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj43 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        java.lang.Object obj46 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash16.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj52 = tabelaHash16.pesquisa("");
        java.lang.Object obj54 = tabelaHash16.pesquisa("hi!");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0d + "'", obj38, 100.0d);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 100.0d + "'", obj54, 100.0d);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj13 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj18 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        java.lang.Object obj21 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj26 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) ' ');
        tabelaHash28.imprime();
        tabelaHash28.retira("");
        tabelaHash28.imprime();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash28);
        java.lang.Object obj42 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash45.imprime();
        tabelaHash45.insere("", (java.lang.Object) ' ');
        tabelaHash45.imprime();
        tabelaHash45.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj58 = tabelaHash45.pesquisa("hi!");
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        tabelaHash60.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj65 = tabelaHash60.pesquisa("hi!");
        tabelaHash60.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj70 = tabelaHash60.pesquisa("");
        tabelaHash60.imprime();
        tabelaHash45.insere("", (java.lang.Object) tabelaHash60);
        tabelaHash45.imprime();
        tabelaHash45.retira("hi!");
        ds.TabelaHash tabelaHash77 = new ds.TabelaHash();
        tabelaHash77.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj82 = tabelaHash77.pesquisa("hi!");
        tabelaHash77.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj87 = tabelaHash77.pesquisa("");
        tabelaHash77.imprime();
        java.lang.Object obj90 = tabelaHash77.pesquisa("hi!");
        tabelaHash77.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash77.imprime();
        tabelaHash77.imprime();
        java.lang.Class<?> wildcardClass96 = tabelaHash77.getClass();
        tabelaHash45.insere("hi!", (java.lang.Object) wildcardClass96);
        tabelaHash8.insere("", (java.lang.Object) wildcardClass96);
        tabelaHash0.insere("", (java.lang.Object) wildcardClass96);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) -1 + "'", obj42, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0d + "'", obj58, 100.0d);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 100.0d + "'", obj65, 100.0d);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + (byte) -1 + "'", obj70, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + 100.0d + "'", obj82, 100.0d);
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + (byte) -1 + "'", obj87, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj90 + "' != '" + 100.0d + "'", obj90, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash0.retira("hi!");
        java.lang.Object obj37 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1L));
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) 10);
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) 10 + "'", obj17, (short) 10);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) ' ');
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object obj34 = tabelaHash0.pesquisa("");
        java.lang.Object obj36 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj40 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0d + "'", obj36, 100.0d);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) (-1.0f));
        tabelaHash9.retira("hi!");
        java.lang.Object obj20 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj30 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj35 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash25);
        tabelaHash25.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash25.imprime();
        tabelaHash25.retira("");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash44.imprime();
        tabelaHash44.insere("", (java.lang.Object) ' ');
        tabelaHash44.imprime();
        tabelaHash44.retira("hi!");
        tabelaHash44.imprime();
        tabelaHash44.retira("");
        tabelaHash44.imprime();
        java.lang.Object obj60 = tabelaHash44.pesquisa("hi!");
        tabelaHash44.imprime();
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        tabelaHash63.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj68 = tabelaHash63.pesquisa("hi!");
        tabelaHash63.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj73 = tabelaHash63.pesquisa("");
        tabelaHash63.retira("hi!");
        tabelaHash63.imprime();
        java.lang.Object obj78 = tabelaHash63.pesquisa("hi!");
        java.lang.Class<?> wildcardClass79 = tabelaHash63.getClass();
        tabelaHash44.insere("hi!", (java.lang.Object) wildcardClass79);
        tabelaHash25.insere("", (java.lang.Object) tabelaHash44);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0d + "'", obj30, 100.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 100.0d + "'", obj68, 100.0d);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + (byte) -1 + "'", obj73, (byte) -1);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj14 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj25 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj31 = tabelaHash20.pesquisa("");
        tabelaHash20.retira("hi!");
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash9.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0d + "'", obj14, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0d + "'", obj25, 100.0d);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj14 = null;
        tabelaHash0.insere("", obj14);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj20 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj25 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
// flaky:         tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash23.imprime();
        tabelaHash23.insere("", (java.lang.Object) ' ');
        tabelaHash23.imprime();
        tabelaHash23.retira("hi!");
        java.lang.Class<?> wildcardClass34 = tabelaHash23.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass34);
        java.lang.Object obj37 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass38 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0d + "'", obj37, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (short) 10);
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.retira("hi!");
        tabelaHash16.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj37 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash32);
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash41.imprime();
        tabelaHash41.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass49 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0d + "'", obj37, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash8.pesquisa("");
        tabelaHash0.insere("", obj12);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) (-1.0f));
        tabelaHash15.retira("hi!");
        java.lang.Object obj26 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj36 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj41 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash31);
        java.lang.Object obj45 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash15);
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj55 = tabelaHash50.pesquisa("hi!");
        tabelaHash50.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj60 = tabelaHash50.pesquisa("hi!");
        tabelaHash15.insere("", obj60);
        java.lang.Object obj63 = tabelaHash15.pesquisa("hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0d + "'", obj36, 100.0d);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) -1 + "'", obj41, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (-1.0f) + "'", obj45, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 100.0d + "'", obj55, 100.0d);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 100.0d + "'", obj60, 100.0d);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (short) 1 + "'", obj63, (short) 1);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) (-1.0f));
        tabelaHash9.retira("hi!");
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj27 = tabelaHash22.pesquisa("hi!");
        tabelaHash9.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash9.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0d + "'", obj27, 100.0d);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj18 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj29 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        tabelaHash24.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj35 = tabelaHash24.pesquisa("");
        tabelaHash24.retira("hi!");
        tabelaHash24.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash24);
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash41.imprime();
        tabelaHash41.insere("", (java.lang.Object) (-1.0f));
        tabelaHash41.retira("hi!");
        java.lang.Object obj52 = tabelaHash41.pesquisa("hi!");
        tabelaHash13.insere("", (java.lang.Object) tabelaHash41);
        java.lang.Class<?> wildcardClass54 = tabelaHash13.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass54);
        java.lang.Class<?> wildcardClass56 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash8.pesquisa("");
        tabelaHash0.insere("", obj12);
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        java.lang.Object obj17 = null;
        tabelaHash0.insere("hi!", obj17);
        java.lang.Object obj20 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test479");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 10L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj18 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj23 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash13.insere("", (java.lang.Object) (byte) 0);
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test480");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj23 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test481");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) (-1.0f));
        tabelaHash16.retira("hi!");
        java.lang.Object obj27 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj37 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj42 = tabelaHash32.pesquisa("");
        tabelaHash32.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash32);
        java.lang.Object obj46 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        java.lang.Class<?> wildcardClass48 = tabelaHash16.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0d + "'", obj37, 100.0d);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) -1 + "'", obj42, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (-1.0f) + "'", obj46, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test482");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) (-1.0f));
        tabelaHash15.retira("hi!");
        java.lang.Object obj26 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash15.imprime();
        tabelaHash15.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Class<?> wildcardClass34 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test483");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.imprime();
        java.lang.Class<?> wildcardClass15 = tabelaHash13.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        java.lang.Object obj18 = tabelaHash13.pesquisa("hi!");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test484");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash25);
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj38 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj43 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) (byte) 0);
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash49.imprime();
        tabelaHash49.insere("", (java.lang.Object) (-1.0f));
        tabelaHash49.retira("hi!");
        java.lang.Object obj60 = tabelaHash49.pesquisa("hi!");
        tabelaHash49.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash33.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash33);
        tabelaHash33.imprime();
        java.lang.Object obj68 = tabelaHash33.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0d + "'", obj38, 100.0d);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + (byte) -1 + "'", obj68, (byte) -1);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test485");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash10.retira("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj27 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj33 = tabelaHash22.pesquisa("");
        tabelaHash10.insere("hi!", obj33);
        tabelaHash10.retira("hi!");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass42 = tabelaHash38.getClass();
        tabelaHash10.insere("", (java.lang.Object) wildcardClass42);
        java.lang.Object obj45 = tabelaHash10.pesquisa("");
        java.lang.Object obj47 = tabelaHash10.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0d + "'", obj27, 100.0d);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "class ds.TabelaHash");
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test486");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("hi!");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        java.lang.Class<?> wildcardClass30 = tabelaHash14.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test487");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj24 = tabelaHash19.pesquisa("hi!");
        java.lang.Object obj26 = tabelaHash19.pesquisa("hi!");
        java.lang.Object obj28 = tabelaHash19.pesquisa("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.imprime();
        tabelaHash30.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj41 = tabelaHash30.pesquisa("");
        tabelaHash30.retira("hi!");
        tabelaHash30.imprime();
        tabelaHash30.insere("", (java.lang.Object) true);
        tabelaHash19.insere("", (java.lang.Object) "");
        tabelaHash13.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj51 = null;
        tabelaHash13.insere("hi!", obj51);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0d + "'", obj28, 100.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test488");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test489");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        java.lang.Object obj29 = tabelaHash16.pesquisa("hi!");
        java.lang.Object obj31 = tabelaHash16.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj31);
        java.lang.Object obj34 = null;
        tabelaHash0.insere("hi!", obj34);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0d + "'", obj14, 100.0d);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0d + "'", obj31, 100.0d);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test490");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 10 + "'", obj14, (short) 10);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) 10 + "'", obj16, (short) 10);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test491");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash25.imprime();
        java.lang.Object obj31 = tabelaHash25.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertNull(obj31);
    }

    @Ignore
    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test492");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test493");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
// flaky:         tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test494");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj33 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj41 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj46 = tabelaHash28.pesquisa("hi!");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash48.imprime();
        tabelaHash48.insere("", (java.lang.Object) ' ');
        tabelaHash48.imprime();
        tabelaHash48.retira("");
        tabelaHash48.imprime();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash48);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash28);
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        java.lang.Object obj66 = tabelaHash11.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0d + "'", obj33, 100.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) -1 + "'", obj38, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
        org.junit.Assert.assertNull(obj66);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test495");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) (-1.0f));
        tabelaHash20.retira("hi!");
        java.lang.Object obj31 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj41 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj46 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash36);
        tabelaHash36.imprime();
        java.lang.Object obj51 = tabelaHash36.pesquisa("hi!");
        java.lang.Class<?> wildcardClass52 = tabelaHash36.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass52);
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        tabelaHash55.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj60 = tabelaHash55.pesquisa("hi!");
        tabelaHash55.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj65 = tabelaHash55.pesquisa("");
        tabelaHash55.imprime();
        java.lang.Object obj68 = tabelaHash55.pesquisa("hi!");
        tabelaHash55.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash55);
        java.lang.Object obj72 = tabelaHash55.pesquisa("");
        tabelaHash55.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (byte) -1 + "'", obj46, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 100.0d + "'", obj51, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 100.0d + "'", obj60, 100.0d);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (byte) -1 + "'", obj65, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 100.0d + "'", obj68, 100.0d);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + (byte) -1 + "'", obj72, (byte) -1);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test496");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) (-1.0f));
        tabelaHash9.retira("hi!");
        java.lang.Object obj20 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj30 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj35 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash25);
        tabelaHash25.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash25.imprime();
        tabelaHash25.retira("");
        tabelaHash25.imprime();
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0d + "'", obj30, 100.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test497");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash25.imprime();
        java.lang.Object obj31 = tabelaHash25.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj34 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) -1 + "'", obj21, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0d + "'", obj34, 100.0d);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test498");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj24 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test499");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) (-1.0f));
        tabelaHash9.retira("hi!");
        java.lang.Object obj20 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.insere("hi!", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj30 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj35 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash25);
        tabelaHash25.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash25.retira("");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0d + "'", obj30, 100.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test500");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("hi!");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash30.imprime();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj44 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj49 = tabelaHash39.pesquisa("");
        tabelaHash39.imprime();
        java.lang.Object obj52 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj57 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.imprime();
        tabelaHash30.insere("hi!", (java.lang.Object) tabelaHash39);
        java.lang.Object obj61 = null;
        tabelaHash39.insere("", obj61);
        ds.TabelaHash tabelaHash64 = new ds.TabelaHash();
        tabelaHash64.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash64.imprime();
        tabelaHash64.insere("", (java.lang.Object) (-1.0f));
        tabelaHash64.retira("hi!");
        java.lang.Object obj75 = tabelaHash64.pesquisa("hi!");
        tabelaHash64.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash64.imprime();
        java.lang.Class<?> wildcardClass80 = tabelaHash64.getClass();
        tabelaHash39.insere("hi!", (java.lang.Object) tabelaHash64);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 100.0d + "'", obj44, 100.0d);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (byte) -1 + "'", obj49, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100.0d + "'", obj52, 100.0d);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 100.0d + "'", obj57, 100.0d);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }
}
