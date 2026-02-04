package ds.seed5311;

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
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass1 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass3 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = obj5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
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
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
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

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
// flaky:         tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + ' ' + "'", obj8, ' ');
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        tabelaHash7.insere("hi!", (java.lang.Object) (short) 1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
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
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
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
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash8.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj20 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass21 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object obj8 = tabelaHash6.pesquisa("");
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        java.lang.Object obj16 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) ' ');
        tabelaHash20.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj29 = tabelaHash20.pesquisa("hi!");
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        tabelaHash11.insere("", obj29);
        java.lang.Object obj33 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + '4' + "'", obj29, '4');
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + '4' + "'", obj33, '4');
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass3 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1L);
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        java.lang.Object obj9 = tabelaHash4.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash4.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash4.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
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
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass4 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = obj18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1L);
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Class<?> wildcardClass26 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
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
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass20 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        tabelaHash5.insere("", obj23);
        java.lang.Object obj27 = tabelaHash5.pesquisa("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        java.lang.Object obj39 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash29.retira("hi!");
        tabelaHash5.insere("", (java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash5.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '4' + "'", obj23, '4');
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
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
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        java.lang.Object obj31 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash26);
        tabelaHash21.retira("hi!");
        java.lang.Object obj37 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj39 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        java.lang.Object obj42 = tabelaHash21.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        java.lang.Class<?> wildcardClass44 = tabelaHash21.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        java.lang.Object obj9 = tabelaHash4.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash4.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash4.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = obj16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        java.lang.Object obj14 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        java.lang.Class<?> wildcardClass17 = tabelaHash10.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = obj7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        java.lang.Object obj26 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass27 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = obj5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj20 = tabelaHash0.pesquisa("");
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
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = null;
        tabelaHash0.insere("hi!", obj18);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass16 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) ' ');
        tabelaHash15.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj24 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        java.lang.Object obj28 = tabelaHash15.pesquisa("hi!");
        tabelaHash0.insere("", obj28);
        java.lang.Class<?> wildcardClass30 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '4' + "'", obj24, '4');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '4' + "'", obj28, '4');
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash15);
        java.lang.Class<?> wildcardClass29 = tabelaHash15.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        tabelaHash5.insere("", obj23);
        java.lang.Object obj27 = tabelaHash5.pesquisa("");
        java.lang.Class<?> wildcardClass28 = tabelaHash5.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '4' + "'", obj23, '4');
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash8.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash8.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
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
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash5.retira("hi!");
        java.lang.Object obj21 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash5.pesquisa("");
        tabelaHash0.insere("", obj25);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash28);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) ' ');
        tabelaHash7.insere("hi!", (java.lang.Object) '4');
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        java.lang.Object obj18 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        java.lang.Object obj30 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash25);
        tabelaHash20.retira("hi!");
        java.lang.Object obj36 = tabelaHash20.pesquisa("");
        java.lang.Class<?> wildcardClass37 = tabelaHash20.getClass();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash20.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + ' ' + "'", obj18, ' ');
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
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
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        java.lang.Class<?> wildcardClass14 = tabelaHash8.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj20 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Class<?> wildcardClass27 = tabelaHash5.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1L);
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) 1L);
        tabelaHash27.retira("hi!");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("");
        tabelaHash35.imprime();
        tabelaHash35.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash35);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object obj44 = tabelaHash42.pesquisa("");
        tabelaHash42.imprime();
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object obj49 = tabelaHash47.pesquisa("");
        tabelaHash47.imprime();
        java.lang.Object obj52 = tabelaHash47.pesquisa("");
        tabelaHash47.imprime();
        tabelaHash42.insere("hi!", (java.lang.Object) tabelaHash47);
        tabelaHash35.insere("hi!", (java.lang.Object) tabelaHash42);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash42);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash42.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1L);
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash0.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        java.lang.Object obj14 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash10.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.insere("", (java.lang.Object) ' ');
        tabelaHash21.insere("hi!", (java.lang.Object) '4');
        tabelaHash21.insere("", (java.lang.Object) 0.0f);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        java.lang.Object obj38 = tabelaHash33.pesquisa("");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        tabelaHash33.insere("", (java.lang.Object) tabelaHash40);
        java.lang.Class<?> wildcardClass43 = tabelaHash40.getClass();
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash40);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash5.retira("hi!");
        java.lang.Object obj21 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash5.pesquisa("");
        tabelaHash0.insere("", obj25);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash28);
        java.lang.Class<?> wildcardClass33 = tabelaHash28.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash5.imprime();
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
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
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
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash15);
        java.lang.Class<?> wildcardClass29 = tabelaHash8.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj20 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass24 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("", (java.lang.Object) ' ');
        tabelaHash10.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj19 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj21 = null;
        tabelaHash10.insere("hi!", obj21);
        tabelaHash10.retira("");
        java.lang.Object obj26 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Class<?> wildcardClass28 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + '4' + "'", obj19, '4');
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + '4' + "'", obj26, '4');
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
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
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        tabelaHash5.imprime();
        java.lang.Class<?> wildcardClass12 = tabelaHash5.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        tabelaHash5.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash5.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("", (java.lang.Object) ' ');
        tabelaHash10.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj19 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj21 = null;
        tabelaHash10.insere("hi!", obj21);
        tabelaHash10.retira("");
        java.lang.Object obj26 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        tabelaHash29.insere("", (java.lang.Object) tabelaHash34);
        tabelaHash34.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash34);
        java.lang.Class<?> wildcardClass42 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + '4' + "'", obj19, '4');
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + '4' + "'", obj26, '4');
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
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
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        tabelaHash5.insere("", obj23);
        java.lang.Object obj27 = tabelaHash5.pesquisa("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        java.lang.Object obj39 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash29.retira("hi!");
        tabelaHash5.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        tabelaHash46.insere("hi!", (java.lang.Object) 1L);
        tabelaHash46.retira("hi!");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        java.lang.Object obj56 = tabelaHash54.pesquisa("");
        tabelaHash54.imprime();
        tabelaHash54.imprime();
        tabelaHash46.insere("hi!", (java.lang.Object) tabelaHash54);
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        java.lang.Object obj63 = tabelaHash61.pesquisa("");
        tabelaHash61.imprime();
        ds.TabelaHash tabelaHash66 = new ds.TabelaHash();
        java.lang.Object obj68 = tabelaHash66.pesquisa("");
        tabelaHash66.imprime();
        java.lang.Object obj71 = tabelaHash66.pesquisa("");
        tabelaHash66.imprime();
        tabelaHash61.insere("hi!", (java.lang.Object) tabelaHash66);
        tabelaHash54.insere("hi!", (java.lang.Object) tabelaHash61);
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash61);
        tabelaHash61.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash61.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '4' + "'", obj23, '4');
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj71);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = null;
        tabelaHash0.insere("hi!", obj11);
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        java.lang.Object obj20 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '4' + "'", obj16, '4');
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '4' + "'", obj20, '4');
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        java.lang.Object obj22 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash17);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        tabelaHash26.insere("", (java.lang.Object) ' ');
        tabelaHash26.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj35 = tabelaHash26.pesquisa("hi!");
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        tabelaHash17.insere("", obj35);
        java.lang.Class<?> wildcardClass38 = obj35.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass38);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.imprime();
        tabelaHash43.insere("hi!", (java.lang.Object) 1L);
        tabelaHash43.retira("hi!");
        java.lang.Object obj51 = tabelaHash43.pesquisa("");
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        tabelaHash53.imprime();
        tabelaHash53.insere("hi!", (java.lang.Object) 1L);
        tabelaHash53.imprime();
        java.lang.Object obj60 = tabelaHash53.pesquisa("");
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        java.lang.Object obj64 = tabelaHash62.pesquisa("");
        tabelaHash62.imprime();
        ds.TabelaHash tabelaHash67 = new ds.TabelaHash();
        java.lang.Object obj69 = tabelaHash67.pesquisa("");
        tabelaHash67.imprime();
        java.lang.Object obj72 = tabelaHash67.pesquisa("");
        tabelaHash67.imprime();
        tabelaHash62.insere("hi!", (java.lang.Object) tabelaHash67);
        tabelaHash67.imprime();
        tabelaHash53.insere("hi!", (java.lang.Object) tabelaHash67);
        ds.TabelaHash tabelaHash78 = new ds.TabelaHash();
        java.lang.Object obj80 = tabelaHash78.pesquisa("");
        tabelaHash78.imprime();
        ds.TabelaHash tabelaHash83 = new ds.TabelaHash();
        java.lang.Object obj85 = tabelaHash83.pesquisa("");
        tabelaHash83.imprime();
        java.lang.Object obj88 = tabelaHash83.pesquisa("");
        tabelaHash83.imprime();
        tabelaHash78.insere("hi!", (java.lang.Object) tabelaHash83);
        tabelaHash78.retira("hi!");
        java.lang.Object obj94 = tabelaHash78.pesquisa("hi!");
        tabelaHash78.imprime();
        tabelaHash67.insere("", (java.lang.Object) tabelaHash78);
        tabelaHash43.insere("", (java.lang.Object) "");
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '4' + "'", obj35, '4');
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash5.retira("hi!");
        java.lang.Object obj21 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash5.pesquisa("");
        tabelaHash0.insere("", obj25);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        java.lang.Object obj35 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        tabelaHash0.insere("", obj38);
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash5.retira("hi!");
        java.lang.Object obj21 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash5.pesquisa("");
        tabelaHash0.insere("", obj25);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        java.lang.Object obj35 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        tabelaHash0.insere("", obj38);
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object obj43 = tabelaHash41.pesquisa("");
        tabelaHash41.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        java.lang.Object obj48 = tabelaHash46.pesquisa("");
        tabelaHash46.imprime();
        java.lang.Object obj51 = tabelaHash46.pesquisa("");
        tabelaHash46.imprime();
        tabelaHash41.insere("hi!", (java.lang.Object) tabelaHash46);
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        java.lang.Object obj57 = tabelaHash55.pesquisa("");
        tabelaHash55.imprime();
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        tabelaHash60.imprime();
        tabelaHash60.imprime();
        tabelaHash60.imprime();
        tabelaHash60.imprime();
        tabelaHash55.insere("", (java.lang.Object) tabelaHash60);
        tabelaHash46.insere("", (java.lang.Object) tabelaHash60);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash46);
        java.lang.Class<?> wildcardClass68 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash7.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = obj3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass26 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash15.insere("", (java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass32 = tabelaHash15.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        java.lang.Object obj9 = tabelaHash4.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash4.imprime();
        java.lang.Object obj13 = tabelaHash4.pesquisa("");
        java.lang.Object obj15 = null;
        tabelaHash4.insere("hi!", obj15);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash4.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        java.lang.Object obj30 = tabelaHash25.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash8.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
        tabelaHash2.imprime();
        tabelaHash2.insere("hi!", (java.lang.Object) 1L);
        tabelaHash2.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash2.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object obj24 = tabelaHash22.pesquisa("");
        tabelaHash22.imprime();
        java.lang.Object obj27 = tabelaHash22.pesquisa("");
        tabelaHash22.imprime();
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash22);
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash17);
        tabelaHash17.insere("", (java.lang.Object) (short) 1);
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass35 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        java.lang.Object obj25 = tabelaHash8.pesquisa("hi!");
        java.lang.Class<?> wildcardClass26 = tabelaHash8.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        java.lang.Object obj13 = tabelaHash8.pesquisa("");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) ' ');
        tabelaHash15.insere("hi!", (java.lang.Object) '4');
        tabelaHash15.imprime();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Object obj26 = tabelaHash15.pesquisa("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        java.lang.Object obj38 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash33);
        tabelaHash28.retira("hi!");
        java.lang.Object obj44 = tabelaHash28.pesquisa("");
        java.lang.Class<?> wildcardClass45 = tabelaHash28.getClass();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash28);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Object obj49 = tabelaHash28.pesquisa("");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + ' ' + "'", obj26, ' ');
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash5.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash19.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) 1L);
        tabelaHash25.retira("hi!");
        java.lang.Object obj33 = tabelaHash25.pesquisa("");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.imprime();
        tabelaHash35.insere("hi!", (java.lang.Object) 1L);
        tabelaHash35.retira("hi!");
        tabelaHash25.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object obj46 = tabelaHash44.pesquisa("");
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash25.insere("", (java.lang.Object) tabelaHash44);
        tabelaHash25.retira("hi!");
        tabelaHash14.insere("", (java.lang.Object) tabelaHash25);
        java.lang.Class<?> wildcardClass54 = tabelaHash14.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        java.lang.Class<?> wildcardClass15 = tabelaHash5.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1L);
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        java.lang.Object obj22 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash17);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        tabelaHash26.insere("", (java.lang.Object) ' ');
        tabelaHash26.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj35 = tabelaHash26.pesquisa("hi!");
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        tabelaHash17.insere("", obj35);
        java.lang.Class<?> wildcardClass38 = obj35.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass38);
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass42 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '4' + "'", obj35, '4');
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash5.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        java.lang.Class<?> wildcardClass27 = tabelaHash19.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
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
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) ' ');
        tabelaHash7.insere("hi!", (java.lang.Object) '4');
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        java.lang.Object obj35 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash25.retira("hi!");
        java.lang.Object obj41 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash14.imprime();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash5.retira("hi!");
        java.lang.Object obj21 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash5.pesquisa("");
        tabelaHash0.insere("", obj25);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        java.lang.Object obj35 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        tabelaHash0.insere("", obj38);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        java.lang.Object obj45 = tabelaHash43.pesquisa("");
        tabelaHash43.imprime();
        tabelaHash43.imprime();
        tabelaHash43.imprime();
        java.lang.Object obj50 = tabelaHash43.pesquisa("");
        tabelaHash43.imprime();
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        java.lang.Object obj55 = tabelaHash53.pesquisa("");
        tabelaHash53.imprime();
        java.lang.Object obj58 = tabelaHash53.pesquisa("");
        tabelaHash53.imprime();
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        tabelaHash61.imprime();
        tabelaHash61.imprime();
        java.lang.Object obj65 = tabelaHash61.pesquisa("hi!");
        tabelaHash53.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash53.retira("hi!");
        tabelaHash43.insere("hi!", (java.lang.Object) tabelaHash53);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash43);
        java.lang.Class<?> wildcardClass71 = tabelaHash43.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        java.lang.Object obj29 = tabelaHash26.pesquisa("hi!");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        java.lang.Object obj41 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash36);
        tabelaHash31.retira("hi!");
        java.lang.Object obj47 = tabelaHash31.pesquisa("hi!");
        java.lang.Object obj49 = tabelaHash31.pesquisa("hi!");
        java.lang.Object obj51 = tabelaHash31.pesquisa("");
        tabelaHash26.insere("", obj51);
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        java.lang.Object obj56 = tabelaHash54.pesquisa("");
        tabelaHash54.imprime();
        tabelaHash26.insere("", (java.lang.Object) tabelaHash54);
        java.lang.Object obj60 = tabelaHash26.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) tabelaHash26);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object obj64 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(obj64);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash5.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1L);
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) ' ');
        tabelaHash28.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj37 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        java.lang.Object obj41 = tabelaHash28.pesquisa("hi!");
        tabelaHash19.insere("", obj41);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash19.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + '4' + "'", obj37, '4');
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + '4' + "'", obj41, '4');
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        java.lang.Object obj13 = tabelaHash10.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash15.retira("hi!");
        java.lang.Object obj31 = tabelaHash15.pesquisa("hi!");
        java.lang.Object obj33 = tabelaHash15.pesquisa("hi!");
        java.lang.Object obj35 = tabelaHash15.pesquisa("");
        tabelaHash10.insere("", obj35);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("");
        tabelaHash38.imprime();
        tabelaHash10.insere("", (java.lang.Object) tabelaHash38);
        java.lang.Object obj44 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) 1L);
        tabelaHash8.retira("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash28);
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash23);
// flaky:         tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        java.lang.Object obj20 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) 1L);
        tabelaHash23.retira("hi!");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash31);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("");
        tabelaHash38.imprime();
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        java.lang.Object obj45 = tabelaHash43.pesquisa("");
        tabelaHash43.imprime();
        java.lang.Object obj48 = tabelaHash43.pesquisa("");
        tabelaHash43.imprime();
        tabelaHash38.insere("hi!", (java.lang.Object) tabelaHash43);
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash38);
        tabelaHash15.insere("", (java.lang.Object) tabelaHash38);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash5.retira("hi!");
        java.lang.Object obj21 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash5.pesquisa("");
        tabelaHash0.insere("", obj25);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash28);
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object obj41 = tabelaHash39.pesquisa("");
        tabelaHash39.imprime();
        java.lang.Object obj44 = tabelaHash39.pesquisa("");
        tabelaHash39.imprime();
        tabelaHash34.insere("hi!", (java.lang.Object) tabelaHash39);
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        java.lang.Object obj50 = tabelaHash48.pesquisa("");
        tabelaHash48.imprime();
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        tabelaHash53.imprime();
        tabelaHash53.imprime();
        tabelaHash53.imprime();
        tabelaHash53.imprime();
        tabelaHash48.insere("", (java.lang.Object) tabelaHash53);
        tabelaHash53.imprime();
        tabelaHash39.insere("", (java.lang.Object) tabelaHash53);
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        java.lang.Object obj64 = tabelaHash62.pesquisa("");
        tabelaHash62.imprime();
        ds.TabelaHash tabelaHash67 = new ds.TabelaHash();
        tabelaHash67.imprime();
        tabelaHash67.imprime();
        tabelaHash67.imprime();
        tabelaHash67.imprime();
        tabelaHash62.insere("", (java.lang.Object) tabelaHash67);
        tabelaHash53.insere("hi!", (java.lang.Object) tabelaHash62);
        tabelaHash28.insere("hi!", (java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash28.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("", (java.lang.Object) ' ');
        tabelaHash10.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj19 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        java.lang.Object obj23 = tabelaHash10.pesquisa("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash25.insere("", (java.lang.Object) ' ');
        tabelaHash25.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj34 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        java.lang.Object obj38 = tabelaHash25.pesquisa("hi!");
        tabelaHash10.insere("", obj38);
        java.lang.Object obj41 = tabelaHash10.pesquisa("");
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass42);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + '4' + "'", obj19, '4');
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '4' + "'", obj23, '4');
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + '4' + "'", obj34, '4');
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + '4' + "'", obj38, '4');
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + ' ' + "'", obj41, ' ');
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        tabelaHash5.insere("", obj23);
        java.lang.Object obj27 = tabelaHash5.pesquisa("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        java.lang.Object obj39 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash29.retira("hi!");
        tabelaHash5.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        tabelaHash46.insere("hi!", (java.lang.Object) 1L);
        tabelaHash46.retira("hi!");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        java.lang.Object obj56 = tabelaHash54.pesquisa("");
        tabelaHash54.imprime();
        tabelaHash54.imprime();
        tabelaHash46.insere("hi!", (java.lang.Object) tabelaHash54);
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        java.lang.Object obj63 = tabelaHash61.pesquisa("");
        tabelaHash61.imprime();
        ds.TabelaHash tabelaHash66 = new ds.TabelaHash();
        java.lang.Object obj68 = tabelaHash66.pesquisa("");
        tabelaHash66.imprime();
        java.lang.Object obj71 = tabelaHash66.pesquisa("");
        tabelaHash66.imprime();
        tabelaHash61.insere("hi!", (java.lang.Object) tabelaHash66);
        tabelaHash54.insere("hi!", (java.lang.Object) tabelaHash61);
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash61);
        java.lang.Class<?> wildcardClass76 = tabelaHash5.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '4' + "'", obj23, '4');
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash5.retira("hi!");
        java.lang.Object obj21 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash5.pesquisa("");
        tabelaHash0.insere("", obj25);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash28);
        java.lang.Object obj34 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        java.lang.Object obj17 = tabelaHash12.pesquisa("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Class<?> wildcardClass22 = tabelaHash19.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass22);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass27 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash8.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash8.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        java.lang.Object obj13 = tabelaHash10.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash15.retira("hi!");
        java.lang.Object obj31 = tabelaHash15.pesquisa("hi!");
        java.lang.Object obj33 = tabelaHash15.pesquisa("hi!");
        java.lang.Object obj35 = tabelaHash15.pesquisa("");
        tabelaHash10.insere("", obj35);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("");
        tabelaHash38.imprime();
        tabelaHash10.insere("", (java.lang.Object) tabelaHash38);
        java.lang.Object obj44 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object obj49 = tabelaHash47.pesquisa("");
        tabelaHash47.imprime();
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        java.lang.Object obj54 = tabelaHash52.pesquisa("");
        tabelaHash52.imprime();
        java.lang.Object obj57 = tabelaHash52.pesquisa("");
        tabelaHash52.imprime();
        tabelaHash47.insere("hi!", (java.lang.Object) tabelaHash52);
        tabelaHash47.retira("hi!");
        java.lang.Object obj63 = tabelaHash47.pesquisa("hi!");
        java.lang.Object obj65 = tabelaHash47.pesquisa("hi!");
        tabelaHash47.imprime();
        java.lang.Object obj68 = tabelaHash47.pesquisa("");
        ds.TabelaHash tabelaHash70 = new ds.TabelaHash();
        tabelaHash70.imprime();
        tabelaHash70.insere("hi!", (java.lang.Object) 1L);
        tabelaHash70.retira("hi!");
        tabelaHash47.insere("", (java.lang.Object) "hi!");
        tabelaHash10.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        java.lang.Object obj31 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash26);
        tabelaHash21.retira("hi!");
        java.lang.Object obj37 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj39 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        java.lang.Object obj42 = tabelaHash21.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        java.lang.Class<?> wildcardClass44 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        java.lang.Object obj25 = tabelaHash14.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass26 = obj25.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        java.lang.Object obj35 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash25.retira("hi!");
        java.lang.Object obj41 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash25);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash25.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        java.lang.Object obj31 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash26);
        tabelaHash21.retira("hi!");
        java.lang.Object obj37 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj39 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        java.lang.Object obj42 = tabelaHash21.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        java.lang.Object obj45 = tabelaHash21.pesquisa("hi!");
        java.lang.Class<?> wildcardClass46 = tabelaHash21.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) ' ');
        tabelaHash15.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj24 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        java.lang.Object obj28 = tabelaHash15.pesquisa("hi!");
        tabelaHash0.insere("", obj28);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass31 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '4' + "'", obj24, '4');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '4' + "'", obj28, '4');
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Class<?> wildcardClass13 = tabelaHash5.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 100);
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        tabelaHash6.insere("hi!", (java.lang.Object) 1L);
        tabelaHash6.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        java.lang.Object obj9 = tabelaHash4.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        java.lang.Class<?> wildcardClass11 = tabelaHash4.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash5.retira("hi!");
        java.lang.Object obj21 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash5.pesquisa("");
        tabelaHash0.insere("", obj25);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        java.lang.Object obj35 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        tabelaHash0.insere("", obj38);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        java.lang.Object obj45 = tabelaHash43.pesquisa("");
        tabelaHash43.imprime();
        tabelaHash43.imprime();
        tabelaHash43.imprime();
        java.lang.Object obj50 = tabelaHash43.pesquisa("");
        tabelaHash43.imprime();
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        java.lang.Object obj55 = tabelaHash53.pesquisa("");
        tabelaHash53.imprime();
        java.lang.Object obj58 = tabelaHash53.pesquisa("");
        tabelaHash53.imprime();
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        tabelaHash61.imprime();
        tabelaHash61.imprime();
        java.lang.Object obj65 = tabelaHash61.pesquisa("hi!");
        tabelaHash53.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash53.retira("hi!");
        tabelaHash43.insere("hi!", (java.lang.Object) tabelaHash53);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash43);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = null;
        tabelaHash0.insere("hi!", obj11);
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '4' + "'", obj16, '4');
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = null;
        tabelaHash0.insere("hi!", obj11);
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass19 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '4' + "'", obj16, '4');
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1L);
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) ' ');
        tabelaHash28.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj37 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        java.lang.Object obj41 = tabelaHash28.pesquisa("hi!");
        tabelaHash19.insere("", obj41);
        tabelaHash19.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj47 = tabelaHash19.pesquisa("");
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + '4' + "'", obj37, '4');
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + '4' + "'", obj41, '4');
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + '4' + "'", obj47, '4');
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash15);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("");
        java.lang.Object obj34 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.imprime();
        java.lang.Object obj37 = tabelaHash30.pesquisa("hi!");
        java.lang.Class<?> wildcardClass38 = tabelaHash30.getClass();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash8.retira("hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        tabelaHash5.insere("", obj23);
        java.lang.Object obj27 = tabelaHash5.pesquisa("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        java.lang.Object obj39 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash29.retira("hi!");
        tabelaHash5.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        tabelaHash46.insere("hi!", (java.lang.Object) 1L);
        tabelaHash46.retira("hi!");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        java.lang.Object obj56 = tabelaHash54.pesquisa("");
        tabelaHash54.imprime();
        tabelaHash54.imprime();
        tabelaHash46.insere("hi!", (java.lang.Object) tabelaHash54);
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        java.lang.Object obj63 = tabelaHash61.pesquisa("");
        tabelaHash61.imprime();
        ds.TabelaHash tabelaHash66 = new ds.TabelaHash();
        java.lang.Object obj68 = tabelaHash66.pesquisa("");
        tabelaHash66.imprime();
        java.lang.Object obj71 = tabelaHash66.pesquisa("");
        tabelaHash66.imprime();
        tabelaHash61.insere("hi!", (java.lang.Object) tabelaHash66);
        tabelaHash54.insere("hi!", (java.lang.Object) tabelaHash61);
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash61);
        tabelaHash61.imprime();
        ds.TabelaHash tabelaHash78 = new ds.TabelaHash();
        java.lang.Object obj80 = tabelaHash78.pesquisa("");
        tabelaHash78.imprime();
        java.lang.Object obj83 = tabelaHash78.pesquisa("");
        java.lang.Class<?> wildcardClass84 = tabelaHash78.getClass();
        tabelaHash61.insere("hi!", (java.lang.Object) tabelaHash78);
        tabelaHash78.insere("hi!", (java.lang.Object) (short) 10);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '4' + "'", obj23, '4');
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) ' ');
        tabelaHash11.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj20 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        tabelaHash26.insere("", (java.lang.Object) ' ');
        tabelaHash26.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj35 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        java.lang.Object obj39 = tabelaHash26.pesquisa("hi!");
        tabelaHash11.insere("", obj39);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '4' + "'", obj20, '4');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '4' + "'", obj24, '4');
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '4' + "'", obj35, '4');
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + '4' + "'", obj39, '4');
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = obj9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj12 = null;
        tabelaHash0.insere("", obj12);
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + ' ' + "'", obj15, ' ');
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
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
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        tabelaHash5.imprime();
        java.lang.Object obj13 = tabelaHash5.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash19);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash28);
        tabelaHash28.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash5.retira("hi!");
        java.lang.Object obj21 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash5.pesquisa("");
        tabelaHash0.insere("", obj25);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        java.lang.Object obj35 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        tabelaHash0.insere("", obj38);
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object obj43 = tabelaHash41.pesquisa("");
        tabelaHash41.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        java.lang.Object obj48 = tabelaHash46.pesquisa("");
        tabelaHash46.imprime();
        java.lang.Object obj51 = tabelaHash46.pesquisa("");
        tabelaHash46.imprime();
        tabelaHash41.insere("hi!", (java.lang.Object) tabelaHash46);
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        java.lang.Object obj57 = tabelaHash55.pesquisa("");
        tabelaHash55.imprime();
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        tabelaHash60.imprime();
        tabelaHash60.imprime();
        tabelaHash60.imprime();
        tabelaHash60.imprime();
        tabelaHash55.insere("", (java.lang.Object) tabelaHash60);
        tabelaHash46.insere("", (java.lang.Object) tabelaHash60);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash46);
        tabelaHash46.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash46.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        java.lang.Object obj29 = tabelaHash26.pesquisa("hi!");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        java.lang.Object obj41 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash36);
        tabelaHash31.retira("hi!");
        java.lang.Object obj47 = tabelaHash31.pesquisa("hi!");
        java.lang.Object obj49 = tabelaHash31.pesquisa("hi!");
        java.lang.Object obj51 = tabelaHash31.pesquisa("");
        tabelaHash26.insere("", obj51);
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        java.lang.Object obj56 = tabelaHash54.pesquisa("");
        tabelaHash54.imprime();
        tabelaHash26.insere("", (java.lang.Object) tabelaHash54);
        java.lang.Object obj60 = tabelaHash26.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) tabelaHash26);
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass64 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
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
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = null;
        tabelaHash0.insere("", obj15);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + '4' + "'", obj18, '4');
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + ' ' + "'", obj23, ' ');
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + ' ' + "'", obj12, ' ');
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + ' ' + "'", obj14, ' ');
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = null;
        tabelaHash0.insere("hi!", obj11);
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) 1L);
        tabelaHash23.retira("hi!");
        java.lang.Object obj31 = tabelaHash23.pesquisa("");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash33.insere("hi!", (java.lang.Object) 1L);
        tabelaHash33.retira("hi!");
        tabelaHash23.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object obj44 = tabelaHash42.pesquisa("");
        tabelaHash42.imprime();
        tabelaHash42.imprime();
        tabelaHash42.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash42);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) ' ');
        tabelaHash11.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj20 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        tabelaHash26.insere("", (java.lang.Object) ' ');
        tabelaHash26.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj35 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        java.lang.Object obj39 = tabelaHash26.pesquisa("hi!");
        tabelaHash11.insere("", obj39);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object obj43 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '4' + "'", obj20, '4');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '4' + "'", obj24, '4');
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '4' + "'", obj35, '4');
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + '4' + "'", obj39, '4');
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + '4' + "'", obj43, '4');
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash9.retira("hi!");
        java.lang.Object obj25 = tabelaHash9.pesquisa("hi!");
        tabelaHash0.insere("", obj25);
        java.lang.Object obj28 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0L + "'", obj28, 0L);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = obj7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        java.lang.Object obj9 = tabelaHash4.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
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
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) ' ');
        tabelaHash7.insere("hi!", (java.lang.Object) '4');
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        java.lang.Object obj18 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        java.lang.Object obj30 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash25);
        tabelaHash20.retira("hi!");
        java.lang.Object obj36 = tabelaHash20.pesquisa("");
        java.lang.Class<?> wildcardClass37 = tabelaHash20.getClass();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash20);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash20.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + ' ' + "'", obj18, ' ');
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash15);
        java.lang.Object obj30 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) 1L);
        tabelaHash8.retira("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash28);
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash23);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj19 = tabelaHash12.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash9.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash9.imprime();
        java.lang.Object obj21 = tabelaHash9.pesquisa("");
        tabelaHash0.insere("", obj21);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object obj24 = tabelaHash22.pesquisa("");
        tabelaHash22.imprime();
        java.lang.Object obj27 = tabelaHash22.pesquisa("");
        tabelaHash22.imprime();
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash22);
        tabelaHash17.retira("hi!");
        java.lang.Object obj33 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        java.lang.Class<?> wildcardClass35 = tabelaHash17.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + '4' + "'", obj15, '4');
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) 1L);
        tabelaHash23.retira("hi!");
        java.lang.Object obj31 = tabelaHash23.pesquisa("");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash33.insere("hi!", (java.lang.Object) 1L);
        tabelaHash33.retira("hi!");
        tabelaHash23.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object obj44 = tabelaHash42.pesquisa("");
        tabelaHash42.imprime();
        tabelaHash42.imprime();
        tabelaHash42.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash42);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
// flaky:         tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash5.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        java.lang.Object obj29 = tabelaHash19.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash19.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass25 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("");
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        java.lang.Object obj17 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.insere("", (java.lang.Object) ' ');
        tabelaHash21.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj30 = tabelaHash21.pesquisa("hi!");
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        tabelaHash12.insere("", obj30);
        java.lang.Object obj34 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", obj34);
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.imprime();
        tabelaHash37.insere("hi!", (java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass42 = tabelaHash37.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass42);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '4' + "'", obj30, '4');
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + '4' + "'", obj34, '4');
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        tabelaHash5.insere("", obj23);
        java.lang.Object obj27 = tabelaHash5.pesquisa("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        java.lang.Object obj39 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash29.retira("hi!");
        tabelaHash5.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj46 = null;
        tabelaHash5.insere("hi!", obj46);
        java.lang.Object obj49 = tabelaHash5.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass50 = obj49.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '4' + "'", obj23, '4');
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash5.retira("hi!");
        java.lang.Object obj21 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash5.pesquisa("");
        tabelaHash0.insere("", obj25);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        java.lang.Object obj35 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        tabelaHash0.insere("", obj38);
        java.lang.Object obj41 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) 1L);
        tabelaHash25.retira("hi!");
        java.lang.Object obj33 = tabelaHash25.pesquisa("");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.imprime();
        tabelaHash35.insere("hi!", (java.lang.Object) 1L);
        tabelaHash35.retira("hi!");
        tabelaHash25.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object obj46 = tabelaHash44.pesquisa("");
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash25.insere("", (java.lang.Object) tabelaHash44);
        tabelaHash25.retira("hi!");
        tabelaHash14.insere("", (java.lang.Object) tabelaHash25);
        java.lang.Class<?> wildcardClass54 = tabelaHash25.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash5.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Class<?> wildcardClass26 = tabelaHash5.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash15.imprime();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass26 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        java.lang.Object obj35 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash25.retira("hi!");
        java.lang.Object obj41 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash25);
        java.lang.Object obj45 = tabelaHash14.pesquisa("hi!");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) 1L);
        tabelaHash8.retira("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash28);
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash23);
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.imprime();
        tabelaHash44.insere("hi!", (java.lang.Object) 1L);
        tabelaHash44.retira("hi!");
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        java.lang.Object obj54 = tabelaHash52.pesquisa("");
        tabelaHash52.imprime();
        tabelaHash52.imprime();
        tabelaHash44.insere("hi!", (java.lang.Object) tabelaHash52);
        java.lang.Object obj59 = tabelaHash44.pesquisa("hi!");
        tabelaHash39.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash39);
        java.lang.Object obj63 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass64 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) false);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Class<?> wildcardClass24 = tabelaHash15.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) 1L);
        tabelaHash8.retira("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash28);
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash23);
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.imprime();
        tabelaHash44.insere("hi!", (java.lang.Object) 1L);
        tabelaHash44.retira("hi!");
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        java.lang.Object obj54 = tabelaHash52.pesquisa("");
        tabelaHash52.imprime();
        tabelaHash52.imprime();
        tabelaHash44.insere("hi!", (java.lang.Object) tabelaHash52);
        java.lang.Object obj59 = tabelaHash44.pesquisa("hi!");
        tabelaHash39.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash39);
        tabelaHash39.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash39.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(obj59);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        java.lang.Object obj31 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash26);
        tabelaHash21.retira("hi!");
        java.lang.Object obj37 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj39 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        java.lang.Object obj42 = tabelaHash21.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash21.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        java.lang.Object obj35 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash25.retira("hi!");
        java.lang.Object obj41 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash25);
        java.lang.Object obj45 = tabelaHash14.pesquisa("");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object obj49 = tabelaHash47.pesquisa("");
        tabelaHash47.imprime();
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        java.lang.Object obj54 = tabelaHash52.pesquisa("");
        tabelaHash52.imprime();
        java.lang.Object obj57 = tabelaHash52.pesquisa("");
        tabelaHash52.imprime();
        tabelaHash47.insere("hi!", (java.lang.Object) tabelaHash52);
        tabelaHash47.retira("hi!");
        java.lang.Object obj63 = tabelaHash47.pesquisa("hi!");
        java.lang.Object obj65 = tabelaHash47.pesquisa("hi!");
        tabelaHash14.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) ' ');
        tabelaHash7.insere("hi!", (java.lang.Object) '4');
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        tabelaHash7.imprime();
        java.lang.Object obj19 = tabelaHash7.pesquisa("");
        tabelaHash7.retira("");
        java.lang.Object obj23 = tabelaHash7.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash7.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + ' ' + "'", obj19, ' ');
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) false);
// flaky:         tabelaHash0.retira("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object obj24 = tabelaHash22.pesquisa("");
        tabelaHash22.imprime();
        java.lang.Object obj27 = tabelaHash22.pesquisa("");
        tabelaHash22.imprime();
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash22);
        tabelaHash17.retira("hi!");
        java.lang.Object obj33 = tabelaHash17.pesquisa("hi!");
        java.lang.Object obj35 = tabelaHash17.pesquisa("hi!");
        java.lang.Object obj37 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash5.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        java.lang.Object obj35 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        java.lang.Object obj42 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash38);
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        tabelaHash46.insere("hi!", (java.lang.Object) 1L);
        tabelaHash46.retira("hi!");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        java.lang.Object obj56 = tabelaHash54.pesquisa("");
        tabelaHash54.imprime();
        tabelaHash54.imprime();
        tabelaHash46.insere("hi!", (java.lang.Object) tabelaHash54);
        tabelaHash46.imprime();
        tabelaHash46.imprime();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash46);
        tabelaHash5.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        java.lang.Object obj11 = tabelaHash7.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash7.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash5.retira("hi!");
        java.lang.Object obj21 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash5.pesquisa("");
        tabelaHash0.insere("", obj25);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        java.lang.Object obj35 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        tabelaHash0.insere("", obj38);
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1L);
        tabelaHash10.imprime();
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        java.lang.Object obj29 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash24.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash24);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("");
        tabelaHash35.imprime();
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = tabelaHash40.pesquisa("");
        tabelaHash40.imprime();
        java.lang.Object obj45 = tabelaHash40.pesquisa("");
        tabelaHash40.imprime();
        tabelaHash35.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash35.retira("hi!");
        java.lang.Object obj51 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.imprime();
        tabelaHash24.insere("", (java.lang.Object) tabelaHash35);
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        java.lang.Object obj58 = tabelaHash56.pesquisa("");
        tabelaHash56.imprime();
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        java.lang.Object obj63 = tabelaHash61.pesquisa("");
        tabelaHash61.imprime();
        java.lang.Object obj66 = tabelaHash61.pesquisa("");
        tabelaHash61.imprime();
        tabelaHash56.insere("hi!", (java.lang.Object) tabelaHash61);
        tabelaHash56.retira("hi!");
        java.lang.Object obj72 = tabelaHash56.pesquisa("hi!");
        java.lang.Object obj74 = tabelaHash56.pesquisa("hi!");
        tabelaHash56.imprime();
        java.lang.Object obj77 = tabelaHash56.pesquisa("");
        java.lang.Class<?> wildcardClass78 = tabelaHash56.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass78);
        java.lang.Object obj81 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass82 = obj81.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertEquals(obj81.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj81), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj81), "class ds.TabelaHash");
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) ' ');
        tabelaHash15.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj24 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        java.lang.Object obj28 = tabelaHash15.pesquisa("hi!");
        tabelaHash0.insere("", obj28);
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass33 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '4' + "'", obj24, '4');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '4' + "'", obj28, '4');
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + ' ' + "'", obj31, ' ');
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        java.lang.Object obj19 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj24 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) false);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        java.lang.Object obj35 = tabelaHash30.pesquisa("");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.imprime();
        tabelaHash30.insere("", (java.lang.Object) tabelaHash37);
        tabelaHash30.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash30.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0d) + "'", obj24, (-1.0d));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        java.lang.Object obj30 = tabelaHash25.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash33.insere("hi!", (java.lang.Object) 1L);
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.retira("hi!");
        tabelaHash33.imprime();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash33);
        java.lang.Object obj45 = tabelaHash8.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) ' ');
        tabelaHash15.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj24 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        java.lang.Object obj28 = tabelaHash15.pesquisa("hi!");
        tabelaHash0.insere("", obj28);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '4' + "'", obj24, '4');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '4' + "'", obj28, '4');
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        java.lang.Object obj31 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash26);
        tabelaHash21.retira("hi!");
        java.lang.Object obj37 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj39 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        java.lang.Object obj42 = tabelaHash21.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash5.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) ' ');
        tabelaHash11.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj20 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj22 = null;
        tabelaHash11.insere("hi!", obj22);
        tabelaHash11.retira("");
        java.lang.Object obj27 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj29 = tabelaHash11.pesquisa("");
        java.lang.Object obj31 = tabelaHash11.pesquisa("hi!");
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass32);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '4' + "'", obj20, '4');
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + '4' + "'", obj31, '4');
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) ' ');
        tabelaHash7.insere("hi!", (java.lang.Object) '4');
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        tabelaHash7.imprime();
        java.lang.Object obj19 = tabelaHash7.pesquisa("");
        java.lang.Object obj21 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash28);
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.imprime();
        tabelaHash37.insere("", (java.lang.Object) ' ');
        tabelaHash37.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj46 = tabelaHash37.pesquisa("hi!");
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        tabelaHash28.insere("", obj46);
        java.lang.Object obj50 = tabelaHash28.pesquisa("");
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        java.lang.Object obj54 = tabelaHash52.pesquisa("");
        tabelaHash52.imprime();
        ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
        java.lang.Object obj59 = tabelaHash57.pesquisa("");
        tabelaHash57.imprime();
        java.lang.Object obj62 = tabelaHash57.pesquisa("");
        tabelaHash57.imprime();
        tabelaHash52.insere("hi!", (java.lang.Object) tabelaHash57);
        tabelaHash52.retira("hi!");
        tabelaHash28.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash69 = new ds.TabelaHash();
        tabelaHash69.imprime();
        tabelaHash69.insere("hi!", (java.lang.Object) 1L);
        tabelaHash69.retira("hi!");
        ds.TabelaHash tabelaHash77 = new ds.TabelaHash();
        java.lang.Object obj79 = tabelaHash77.pesquisa("");
        tabelaHash77.imprime();
        tabelaHash77.imprime();
        tabelaHash69.insere("hi!", (java.lang.Object) tabelaHash77);
        ds.TabelaHash tabelaHash84 = new ds.TabelaHash();
        java.lang.Object obj86 = tabelaHash84.pesquisa("");
        tabelaHash84.imprime();
        ds.TabelaHash tabelaHash89 = new ds.TabelaHash();
        java.lang.Object obj91 = tabelaHash89.pesquisa("");
        tabelaHash89.imprime();
        java.lang.Object obj94 = tabelaHash89.pesquisa("");
        tabelaHash89.imprime();
        tabelaHash84.insere("hi!", (java.lang.Object) tabelaHash89);
        tabelaHash77.insere("hi!", (java.lang.Object) tabelaHash84);
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash84);
        tabelaHash7.insere("", (java.lang.Object) tabelaHash84);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + ' ' + "'", obj19, ' ');
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + ' ' + "'", obj21, ' ');
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + '4' + "'", obj46, '4');
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + '4' + "'", obj50, '4');
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
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
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("");
        java.lang.Object obj16 = tabelaHash12.pesquisa("");
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) 1L);
        tabelaHash12.insere("hi!", (java.lang.Object) 1L);
        java.lang.Object obj27 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.imprime();
        tabelaHash30.insere("", (java.lang.Object) ' ');
        tabelaHash30.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj39 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        tabelaHash30.retira("");
        tabelaHash12.insere("", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass45 = tabelaHash12.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + ' ' + "'", obj39, ' ');
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        java.lang.Object obj9 = tabelaHash4.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash4.imprime();
        java.lang.Class<?> wildcardClass12 = tabelaHash4.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        java.lang.Object obj9 = tabelaHash4.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
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
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object obj8 = tabelaHash6.pesquisa("");
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        java.lang.Object obj16 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash6.retira("hi!");
        java.lang.Object obj22 = tabelaHash6.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("");
        tabelaHash27.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("");
        tabelaHash32.imprime();
        java.lang.Object obj37 = tabelaHash32.pesquisa("");
        tabelaHash32.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash32);
        tabelaHash27.retira("hi!");
        java.lang.Object obj43 = tabelaHash27.pesquisa("hi!");
        java.lang.Object obj45 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        java.lang.Object obj48 = tabelaHash27.pesquisa("");
        tabelaHash6.insere("", (java.lang.Object) tabelaHash27);
        java.lang.Object obj51 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        java.lang.Object obj35 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash25.retira("hi!");
        java.lang.Object obj41 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash14.retira("");
        java.lang.Class<?> wildcardClass46 = tabelaHash14.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash5.retira("hi!");
        java.lang.Object obj21 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash5.pesquisa("");
        tabelaHash0.insere("", obj25);
        java.lang.Class<?> wildcardClass27 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        tabelaHash5.insere("", obj23);
        java.lang.Object obj27 = tabelaHash5.pesquisa("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        java.lang.Object obj39 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash29.retira("hi!");
        tabelaHash5.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj46 = null;
        tabelaHash5.insere("hi!", obj46);
        java.lang.Object obj49 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj51 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj53 = tabelaHash5.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '4' + "'", obj23, '4');
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj12 = null;
        tabelaHash0.insere("", obj12);
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) false);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) ' ');
        tabelaHash9.insere("hi!", (java.lang.Object) '4');
        tabelaHash9.insere("", (java.lang.Object) 0.0f);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        java.lang.Object obj26 = tabelaHash21.pesquisa("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash21.insere("", (java.lang.Object) tabelaHash28);
        java.lang.Class<?> wildcardClass31 = tabelaHash28.getClass();
        tabelaHash9.insere("hi!", (java.lang.Object) wildcardClass31);
        java.lang.Class<?> wildcardClass33 = tabelaHash9.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Class<?> wildcardClass35 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash5.retira("hi!");
        java.lang.Object obj21 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash5.pesquisa("");
        tabelaHash0.insere("", obj25);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash28);
        java.lang.Object obj34 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj36 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 100);
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        tabelaHash6.insere("hi!", (java.lang.Object) 1L);
        tabelaHash6.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
// flaky:         tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 100 + "'", obj22, (short) 100);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        java.lang.Object obj35 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash25.retira("hi!");
        java.lang.Object obj41 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash25);
        java.lang.Object obj45 = null;
        tabelaHash14.insere("hi!", obj45);
        java.lang.Class<?> wildcardClass47 = tabelaHash14.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.retira("hi!");
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
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        java.lang.Object obj15 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object obj24 = tabelaHash22.pesquisa("");
        tabelaHash22.imprime();
        java.lang.Object obj27 = tabelaHash22.pesquisa("");
        tabelaHash22.imprime();
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash22);
        tabelaHash17.retira("hi!");
        java.lang.Object obj33 = tabelaHash17.pesquisa("hi!");
        java.lang.Object obj35 = tabelaHash17.pesquisa("hi!");
        java.lang.Object obj37 = tabelaHash17.pesquisa("");
        tabelaHash12.insere("", obj37);
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = tabelaHash40.pesquisa("");
        tabelaHash40.imprime();
        java.lang.Object obj45 = tabelaHash40.pesquisa("");
        java.lang.Object obj47 = tabelaHash40.pesquisa("");
        tabelaHash40.imprime();
        java.lang.Object obj50 = tabelaHash40.pesquisa("");
        tabelaHash12.insere("", obj50);
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        tabelaHash54.imprime();
        tabelaHash54.imprime();
        tabelaHash54.imprime();
        java.lang.Object obj59 = tabelaHash54.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj59);
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) ' ');
        tabelaHash12.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj21 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        tabelaHash26.insere("hi!", (java.lang.Object) 1L);
        tabelaHash26.imprime();
        java.lang.Class<?> wildcardClass32 = tabelaHash26.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash26);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '4' + "'", obj21, '4');
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 100);
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        tabelaHash6.insere("hi!", (java.lang.Object) 1L);
        tabelaHash6.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass23 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 100 + "'", obj22, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash11.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = null;
        tabelaHash0.insere("hi!", obj11);
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        java.lang.Object obj20 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass21 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '4' + "'", obj16, '4');
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '4' + "'", obj20, '4');
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = obj12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
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
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        java.lang.Object obj14 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash10.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash11.retira("hi!");
        java.lang.Object obj27 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj29 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        java.lang.Object obj32 = tabelaHash11.pesquisa("");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        tabelaHash34.insere("hi!", (java.lang.Object) 1L);
        tabelaHash34.retira("hi!");
        java.lang.Object obj42 = tabelaHash34.pesquisa("");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.imprime();
        tabelaHash44.insere("hi!", (java.lang.Object) 1L);
        tabelaHash44.retira("hi!");
        tabelaHash34.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        java.lang.Object obj55 = tabelaHash53.pesquisa("");
        tabelaHash53.imprime();
        tabelaHash53.imprime();
        tabelaHash53.imprime();
        tabelaHash34.insere("", (java.lang.Object) tabelaHash53);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        tabelaHash63.imprime();
        tabelaHash63.insere("hi!", (java.lang.Object) 1L);
        tabelaHash63.retira("hi!");
        ds.TabelaHash tabelaHash71 = new ds.TabelaHash();
        java.lang.Object obj73 = tabelaHash71.pesquisa("");
        tabelaHash71.imprime();
        tabelaHash71.imprime();
        tabelaHash63.insere("hi!", (java.lang.Object) tabelaHash71);
        tabelaHash11.insere("", (java.lang.Object) tabelaHash63);
// flaky:         tabelaHash63.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj20 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass27 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) ' ');
        tabelaHash12.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj21 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + ' ' + "'", obj21, ' ');
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("");
        java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj20 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) false);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        java.lang.Object obj31 = tabelaHash26.pesquisa("");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash26.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash26.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash26);
        java.lang.Object obj39 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1.0d) + "'", obj20, (-1.0d));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1.0d) + "'", obj39, (-1.0d));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = obj7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        java.lang.Object obj14 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        java.lang.Class<?> wildcardClass18 = tabelaHash10.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Class<?> wildcardClass18 = tabelaHash12.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1L);
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        java.lang.Class<?> wildcardClass27 = tabelaHash19.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        java.lang.Object obj25 = tabelaHash8.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass26 = obj25.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.retira("");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        java.lang.Object obj35 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash25.retira("hi!");
        java.lang.Object obj41 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash25);
        java.lang.Object obj45 = tabelaHash14.pesquisa("");
        java.lang.Class<?> wildcardClass46 = tabelaHash14.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        java.lang.Object obj35 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash25.retira("hi!");
        java.lang.Object obj41 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash14.retira("");
        tabelaHash14.imprime();
        java.lang.Object obj48 = tabelaHash14.pesquisa("");
        java.lang.Object obj50 = tabelaHash14.pesquisa("");
        java.lang.Class<?> wildcardClass51 = tabelaHash14.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        java.lang.Class<?> wildcardClass24 = tabelaHash8.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        java.lang.Object obj11 = tabelaHash7.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = obj11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        tabelaHash5.insere("", obj23);
        java.lang.Object obj27 = tabelaHash5.pesquisa("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        java.lang.Object obj39 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash29.retira("hi!");
        tabelaHash5.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        tabelaHash46.insere("hi!", (java.lang.Object) 1L);
        tabelaHash46.retira("hi!");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        java.lang.Object obj56 = tabelaHash54.pesquisa("");
        tabelaHash54.imprime();
        tabelaHash54.imprime();
        tabelaHash46.insere("hi!", (java.lang.Object) tabelaHash54);
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        java.lang.Object obj63 = tabelaHash61.pesquisa("");
        tabelaHash61.imprime();
        ds.TabelaHash tabelaHash66 = new ds.TabelaHash();
        java.lang.Object obj68 = tabelaHash66.pesquisa("");
        tabelaHash66.imprime();
        java.lang.Object obj71 = tabelaHash66.pesquisa("");
        tabelaHash66.imprime();
        tabelaHash61.insere("hi!", (java.lang.Object) tabelaHash66);
        tabelaHash54.insere("hi!", (java.lang.Object) tabelaHash61);
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash61);
        tabelaHash61.imprime();
        tabelaHash61.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '4' + "'", obj23, '4');
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj71);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
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
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        java.lang.Object obj17 = tabelaHash12.pesquisa("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Class<?> wildcardClass22 = tabelaHash19.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass22);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("");
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash27);
        tabelaHash27.imprime();
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        java.lang.Object obj34 = tabelaHash29.pesquisa("");
        java.lang.Object obj36 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        java.lang.Object obj43 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.imprime();
        tabelaHash29.insere("", (java.lang.Object) tabelaHash39);
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.imprime();
        tabelaHash47.insere("hi!", (java.lang.Object) 1L);
        tabelaHash47.retira("hi!");
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        java.lang.Object obj57 = tabelaHash55.pesquisa("");
        tabelaHash55.imprime();
        tabelaHash55.imprime();
        tabelaHash47.insere("hi!", (java.lang.Object) tabelaHash55);
        tabelaHash47.imprime();
        tabelaHash47.imprime();
        tabelaHash29.insere("", (java.lang.Object) tabelaHash47);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash47);
// flaky:         tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        tabelaHash5.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash5.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        java.lang.Object obj24 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj26 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        java.lang.Object obj39 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash29.retira("hi!");
        java.lang.Object obj45 = tabelaHash29.pesquisa("hi!");
        java.lang.Object obj47 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.imprime();
        java.lang.Object obj50 = tabelaHash29.pesquisa("");
        tabelaHash8.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash29.imprime();
        java.lang.Class<?> wildcardClass53 = tabelaHash29.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass53);
        java.lang.Object obj56 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = null;
        tabelaHash0.insere("", obj15);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass22 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + '4' + "'", obj18, '4');
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        tabelaHash5.insere("", obj23);
        java.lang.Object obj27 = tabelaHash5.pesquisa("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        java.lang.Object obj39 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash29.retira("hi!");
        tabelaHash5.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj46 = null;
        tabelaHash5.insere("hi!", obj46);
        java.lang.Object obj49 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj51 = tabelaHash5.pesquisa("hi!");
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        tabelaHash53.imprime();
        tabelaHash53.insere("", (java.lang.Object) ' ');
        tabelaHash53.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj62 = tabelaHash53.pesquisa("hi!");
        tabelaHash5.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '4' + "'", obj23, '4');
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + '4' + "'", obj62, '4');
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash19);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash19.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1L);
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) ' ');
        tabelaHash28.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj37 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        java.lang.Object obj41 = tabelaHash28.pesquisa("hi!");
        tabelaHash19.insere("", obj41);
        tabelaHash19.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + '4' + "'", obj37, '4');
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + '4' + "'", obj41, '4');
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        java.lang.Object obj17 = tabelaHash12.pesquisa("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Class<?> wildcardClass22 = tabelaHash19.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        java.lang.Object obj31 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash26);
        tabelaHash21.retira("hi!");
        java.lang.Object obj37 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj39 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        java.lang.Object obj42 = tabelaHash21.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash21.imprime();
        java.lang.Object obj46 = tabelaHash21.pesquisa("hi!");
        java.lang.Class<?> wildcardClass47 = tabelaHash21.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        java.lang.Object obj13 = tabelaHash10.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash15.retira("hi!");
        java.lang.Object obj31 = tabelaHash15.pesquisa("hi!");
        java.lang.Object obj33 = tabelaHash15.pesquisa("hi!");
        java.lang.Object obj35 = tabelaHash15.pesquisa("");
        tabelaHash10.insere("", obj35);
        java.lang.Object obj38 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        java.lang.Object obj25 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("");
        tabelaHash27.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("");
        tabelaHash32.imprime();
        java.lang.Object obj37 = tabelaHash32.pesquisa("");
        tabelaHash32.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash32);
        tabelaHash27.retira("hi!");
        java.lang.Object obj43 = tabelaHash27.pesquisa("hi!");
        java.lang.Object obj45 = tabelaHash27.pesquisa("hi!");
        java.lang.Object obj47 = tabelaHash27.pesquisa("");
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash27);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        java.lang.Object obj22 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash17);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        tabelaHash26.insere("", (java.lang.Object) ' ');
        tabelaHash26.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj35 = tabelaHash26.pesquisa("hi!");
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        tabelaHash17.insere("", obj35);
        java.lang.Class<?> wildcardClass38 = obj35.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass38);
        java.lang.Object obj41 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        java.lang.Object obj45 = tabelaHash43.pesquisa("");
        tabelaHash43.imprime();
        tabelaHash43.imprime();
        tabelaHash43.imprime();
        java.lang.Object obj50 = tabelaHash43.pesquisa("");
        tabelaHash43.imprime();
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        java.lang.Object obj55 = tabelaHash53.pesquisa("");
        tabelaHash53.imprime();
        java.lang.Object obj58 = tabelaHash53.pesquisa("");
        tabelaHash53.imprime();
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        tabelaHash61.imprime();
        tabelaHash61.imprime();
        java.lang.Object obj65 = tabelaHash61.pesquisa("hi!");
        tabelaHash53.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash53.retira("hi!");
        tabelaHash43.insere("hi!", (java.lang.Object) tabelaHash53);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash53);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '4' + "'", obj35, '4');
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + ' ' + "'", obj41, ' ');
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1L);
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        tabelaHash29.insere("", (java.lang.Object) ' ');
        tabelaHash29.insere("hi!", (java.lang.Object) '4');
        tabelaHash29.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash29);
        tabelaHash0.imprime();
        java.lang.Object obj41 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        java.lang.Object obj13 = tabelaHash10.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash15.retira("hi!");
        java.lang.Object obj31 = tabelaHash15.pesquisa("hi!");
        java.lang.Object obj33 = tabelaHash15.pesquisa("hi!");
        java.lang.Object obj35 = tabelaHash15.pesquisa("");
        tabelaHash10.insere("", obj35);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("");
        tabelaHash38.imprime();
        tabelaHash10.insere("", (java.lang.Object) tabelaHash38);
        java.lang.Object obj44 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        java.lang.Object obj47 = tabelaHash0.pesquisa("");
        java.lang.Object obj49 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj49);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash15.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) ' ');
        tabelaHash33.insere("hi!", (java.lang.Object) '4');
        tabelaHash33.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj45 = tabelaHash33.pesquisa("");
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        tabelaHash15.insere("hi!", obj45);
        tabelaHash15.retira("hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + ' ' + "'", obj45, ' ');
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) ' ');
        tabelaHash7.insere("hi!", (java.lang.Object) '4');
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) 1L);
        tabelaHash18.retira("hi!");
        java.lang.Object obj26 = tabelaHash18.pesquisa("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.insere("hi!", (java.lang.Object) 1L);
        tabelaHash28.retira("hi!");
        tabelaHash18.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object obj39 = tabelaHash37.pesquisa("");
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash18.insere("", (java.lang.Object) tabelaHash37);
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.imprime();
        tabelaHash45.insere("hi!", (java.lang.Object) 1L);
        tabelaHash45.retira("hi!");
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        java.lang.Object obj55 = tabelaHash53.pesquisa("");
        tabelaHash53.imprime();
        tabelaHash53.imprime();
        tabelaHash45.insere("hi!", (java.lang.Object) tabelaHash53);
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        java.lang.Object obj62 = tabelaHash60.pesquisa("");
        tabelaHash60.imprime();
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        java.lang.Object obj67 = tabelaHash65.pesquisa("");
        tabelaHash65.imprime();
        java.lang.Object obj70 = tabelaHash65.pesquisa("");
        tabelaHash65.imprime();
        tabelaHash60.insere("hi!", (java.lang.Object) tabelaHash65);
        tabelaHash53.insere("hi!", (java.lang.Object) tabelaHash60);
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash60);
        tabelaHash7.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj77 = tabelaHash7.pesquisa("");
        tabelaHash7.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + ' ' + "'", obj77, ' ');
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash5.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Object obj27 = null;
        tabelaHash5.insere("", obj27);
        tabelaHash5.imprime();
        java.lang.Class<?> wildcardClass30 = tabelaHash5.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1L + "'", obj6, 1L);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        java.lang.Object obj25 = tabelaHash14.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash14.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + '4' + "'", obj15, '4');
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass4 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0L + "'", obj13, 0L);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) 1L);
        tabelaHash5.retira("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash13);
        java.lang.Object obj20 = tabelaHash5.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "hi!" + "'", obj23, "hi!");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) ' ');
        tabelaHash7.insere("hi!", (java.lang.Object) '4');
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        java.lang.Object obj18 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) ' ');
        tabelaHash20.insere("hi!", (java.lang.Object) '4');
        tabelaHash20.insere("", (java.lang.Object) 0.0f);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("");
        tabelaHash32.imprime();
        java.lang.Object obj37 = tabelaHash32.pesquisa("");
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.imprime();
        tabelaHash32.insere("", (java.lang.Object) tabelaHash39);
        java.lang.Class<?> wildcardClass42 = tabelaHash39.getClass();
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash39);
        java.lang.Object obj45 = tabelaHash20.pesquisa("hi!");
        java.lang.Object obj47 = tabelaHash20.pesquisa("hi!");
        tabelaHash7.insere("", obj47);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + ' ' + "'", obj18, ' ');
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + '4' + "'", obj45, '4');
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + '4' + "'", obj47, '4');
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        java.lang.Object obj25 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj28 = tabelaHash14.pesquisa("");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
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
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        java.lang.Object obj14 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash5.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Object obj27 = tabelaHash5.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass28 = obj27.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass28 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) 1L);
        tabelaHash25.retira("hi!");
        java.lang.Object obj33 = tabelaHash25.pesquisa("");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.imprime();
        tabelaHash35.insere("hi!", (java.lang.Object) 1L);
        tabelaHash35.retira("hi!");
        tabelaHash25.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object obj46 = tabelaHash44.pesquisa("");
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash25.insere("", (java.lang.Object) tabelaHash44);
        tabelaHash25.retira("hi!");
        tabelaHash14.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash25.retira("");
        java.lang.Class<?> wildcardClass56 = tabelaHash25.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        java.lang.Object obj30 = tabelaHash25.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) ' ');
        tabelaHash33.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj42 = tabelaHash33.pesquisa("hi!");
        java.lang.Object obj44 = null;
        tabelaHash33.insere("hi!", obj44);
        tabelaHash33.retira("");
        java.lang.Object obj49 = tabelaHash33.pesquisa("hi!");
        java.lang.Object obj51 = tabelaHash33.pesquisa("");
        java.lang.Object obj53 = tabelaHash33.pesquisa("hi!");
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        tabelaHash8.insere("", (java.lang.Object) wildcardClass54);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + '4' + "'", obj42, '4');
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + '4' + "'", obj49, '4');
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + '4' + "'", obj53, '4');
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
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
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = obj18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("", (java.lang.Object) ' ');
        tabelaHash8.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj19 = null;
        tabelaHash8.insere("hi!", obj19);
        tabelaHash8.retira("");
        java.lang.Object obj24 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        java.lang.Object obj30 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj35 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        tabelaHash26.insere("hi!", (java.lang.Object) false);
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object obj43 = tabelaHash41.pesquisa("");
        tabelaHash41.imprime();
        java.lang.Object obj46 = tabelaHash41.pesquisa("");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.imprime();
        tabelaHash41.insere("", (java.lang.Object) tabelaHash48);
        tabelaHash41.imprime();
        tabelaHash26.insere("hi!", (java.lang.Object) tabelaHash41);
        java.lang.Object obj54 = tabelaHash26.pesquisa("hi!");
        tabelaHash8.insere("hi!", obj54);
        tabelaHash0.insere("", obj54);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + '4' + "'", obj17, '4');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '4' + "'", obj24, '4');
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (-1.0d) + "'", obj35, (-1.0d));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (-1.0d) + "'", obj54, (-1.0d));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Class<?> wildcardClass27 = tabelaHash19.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
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
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        java.lang.Object obj35 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash25.retira("hi!");
        java.lang.Object obj41 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash25);
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.imprime();
        tabelaHash45.insere("hi!", (java.lang.Object) 1L);
        tabelaHash45.retira("hi!");
        java.lang.Object obj53 = tabelaHash45.pesquisa("");
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        tabelaHash55.imprime();
        tabelaHash55.insere("hi!", (java.lang.Object) 1L);
        tabelaHash55.retira("hi!");
        tabelaHash45.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash64 = new ds.TabelaHash();
        java.lang.Object obj66 = tabelaHash64.pesquisa("");
        tabelaHash64.imprime();
        tabelaHash64.imprime();
        tabelaHash64.imprime();
        tabelaHash45.insere("", (java.lang.Object) tabelaHash64);
        tabelaHash45.retira("hi!");
        tabelaHash14.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj66);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1L);
        tabelaHash10.imprime();
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        java.lang.Object obj29 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash24.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash24);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("");
        tabelaHash35.imprime();
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = tabelaHash40.pesquisa("");
        tabelaHash40.imprime();
        java.lang.Object obj45 = tabelaHash40.pesquisa("");
        tabelaHash40.imprime();
        tabelaHash35.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash35.retira("hi!");
        java.lang.Object obj51 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.imprime();
        tabelaHash24.insere("", (java.lang.Object) tabelaHash35);
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        java.lang.Object obj58 = tabelaHash56.pesquisa("");
        tabelaHash56.imprime();
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        java.lang.Object obj63 = tabelaHash61.pesquisa("");
        tabelaHash61.imprime();
        java.lang.Object obj66 = tabelaHash61.pesquisa("");
        tabelaHash61.imprime();
        tabelaHash56.insere("hi!", (java.lang.Object) tabelaHash61);
        tabelaHash56.retira("hi!");
        java.lang.Object obj72 = tabelaHash56.pesquisa("hi!");
        java.lang.Object obj74 = tabelaHash56.pesquisa("hi!");
        tabelaHash56.imprime();
        java.lang.Object obj77 = tabelaHash56.pesquisa("");
        java.lang.Class<?> wildcardClass78 = tabelaHash56.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass78);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.imprime();
        tabelaHash0.retira("");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        java.lang.Object obj9 = tabelaHash4.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        java.lang.Object obj22 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash17);
        tabelaHash12.retira("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash33);
        java.lang.Class<?> wildcardClass39 = tabelaHash33.getClass();
        tabelaHash12.insere("", (java.lang.Object) wildcardClass39);
        tabelaHash4.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) 1L);
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.imprime();
        tabelaHash41.insere("", (java.lang.Object) ' ');
        tabelaHash41.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj50 = tabelaHash41.pesquisa("hi!");
        tabelaHash41.imprime();
        tabelaHash41.imprime();
        java.lang.Object obj54 = tabelaHash41.pesquisa("hi!");
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        tabelaHash56.imprime();
        tabelaHash56.insere("", (java.lang.Object) ' ');
        tabelaHash56.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj65 = tabelaHash56.pesquisa("hi!");
        tabelaHash56.imprime();
        tabelaHash56.imprime();
        java.lang.Object obj69 = tabelaHash56.pesquisa("hi!");
        tabelaHash41.insere("", obj69);
        java.lang.Object obj72 = tabelaHash41.pesquisa("");
        java.lang.Class<?> wildcardClass73 = obj72.getClass();
        tabelaHash31.insere("", (java.lang.Object) wildcardClass73);
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + '4' + "'", obj50, '4');
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + '4' + "'", obj54, '4');
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + '4' + "'", obj65, '4');
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + '4' + "'", obj69, '4');
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + ' ' + "'", obj72, ' ');
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash14.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("", (java.lang.Object) ' ');
        tabelaHash10.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj19 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj21 = null;
        tabelaHash10.insere("hi!", obj21);
        tabelaHash10.retira("");
        java.lang.Object obj26 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        tabelaHash29.insere("", (java.lang.Object) tabelaHash34);
        tabelaHash34.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash34);
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.imprime();
        tabelaHash43.insere("", (java.lang.Object) ' ');
        tabelaHash43.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj52 = tabelaHash43.pesquisa("hi!");
        java.lang.Object obj54 = null;
        tabelaHash43.insere("hi!", obj54);
        tabelaHash43.retira("");
        tabelaHash43.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash43);
        tabelaHash43.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + '4' + "'", obj19, '4');
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + '4' + "'", obj26, '4');
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + '4' + "'", obj52, '4');
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash15.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) ' ');
        tabelaHash33.insere("hi!", (java.lang.Object) '4');
        tabelaHash33.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj45 = tabelaHash33.pesquisa("");
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        tabelaHash15.insere("hi!", obj45);
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        java.lang.Object obj52 = tabelaHash50.pesquisa("");
        tabelaHash50.imprime();
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        java.lang.Object obj57 = tabelaHash55.pesquisa("");
        tabelaHash55.imprime();
        java.lang.Object obj60 = tabelaHash55.pesquisa("");
        tabelaHash55.imprime();
        tabelaHash50.insere("hi!", (java.lang.Object) tabelaHash55);
        ds.TabelaHash tabelaHash64 = new ds.TabelaHash();
        java.lang.Object obj66 = tabelaHash64.pesquisa("");
        tabelaHash64.imprime();
        ds.TabelaHash tabelaHash69 = new ds.TabelaHash();
        tabelaHash69.imprime();
        tabelaHash69.imprime();
        tabelaHash69.imprime();
        tabelaHash69.imprime();
        tabelaHash64.insere("", (java.lang.Object) tabelaHash69);
        tabelaHash69.imprime();
        tabelaHash55.insere("", (java.lang.Object) tabelaHash69);
        ds.TabelaHash tabelaHash78 = new ds.TabelaHash();
        java.lang.Object obj80 = tabelaHash78.pesquisa("");
        tabelaHash78.imprime();
        ds.TabelaHash tabelaHash83 = new ds.TabelaHash();
        tabelaHash83.imprime();
        tabelaHash83.imprime();
        tabelaHash83.imprime();
        tabelaHash83.imprime();
        tabelaHash78.insere("", (java.lang.Object) tabelaHash83);
        tabelaHash69.insere("hi!", (java.lang.Object) tabelaHash78);
        tabelaHash15.insere("", (java.lang.Object) tabelaHash78);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + ' ' + "'", obj45, ' ');
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash5.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Object obj27 = null;
        tabelaHash5.insere("", obj27);
        tabelaHash5.retira("");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("");
        tabelaHash32.imprime();
        java.lang.Object obj37 = tabelaHash32.pesquisa("");
        java.lang.Object obj39 = tabelaHash32.pesquisa("");
        tabelaHash32.imprime();
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.imprime();
        tabelaHash42.insere("", (java.lang.Object) ' ');
        tabelaHash42.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj51 = tabelaHash42.pesquisa("hi!");
        java.lang.Object obj53 = null;
        tabelaHash42.insere("hi!", obj53);
        tabelaHash42.retira("");
        java.lang.Object obj58 = tabelaHash42.pesquisa("hi!");
        tabelaHash32.insere("hi!", (java.lang.Object) tabelaHash42);
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        java.lang.Object obj63 = tabelaHash61.pesquisa("");
        tabelaHash61.imprime();
        ds.TabelaHash tabelaHash66 = new ds.TabelaHash();
        tabelaHash66.imprime();
        tabelaHash66.imprime();
        tabelaHash66.imprime();
        tabelaHash66.imprime();
        tabelaHash61.insere("", (java.lang.Object) tabelaHash66);
        tabelaHash66.imprime();
        tabelaHash32.insere("", (java.lang.Object) tabelaHash66);
        ds.TabelaHash tabelaHash75 = new ds.TabelaHash();
        tabelaHash75.imprime();
        tabelaHash75.insere("", (java.lang.Object) ' ');
        tabelaHash75.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj84 = tabelaHash75.pesquisa("hi!");
        java.lang.Object obj86 = null;
        tabelaHash75.insere("hi!", obj86);
        tabelaHash75.retira("");
        tabelaHash75.imprime();
        tabelaHash32.insere("", (java.lang.Object) tabelaHash75);
        tabelaHash75.retira("hi!");
        tabelaHash5.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + '4' + "'", obj51, '4');
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + '4' + "'", obj58, '4');
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + '4' + "'", obj84, '4');
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) (short) 100);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) 1L);
        tabelaHash18.retira("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash26);
        tabelaHash12.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) ' ');
        tabelaHash15.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj24 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        java.lang.Object obj28 = tabelaHash15.pesquisa("hi!");
        tabelaHash0.insere("", obj28);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '4' + "'", obj24, '4');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '4' + "'", obj28, '4');
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1L + "'", obj9, 1L);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass30 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) 1L);
        tabelaHash23.retira("hi!");
        java.lang.Object obj31 = tabelaHash23.pesquisa("");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash33.insere("hi!", (java.lang.Object) 1L);
        tabelaHash33.retira("hi!");
        tabelaHash23.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object obj44 = tabelaHash42.pesquisa("");
        tabelaHash42.imprime();
        tabelaHash42.imprime();
        tabelaHash42.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash42);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash23.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) 1L);
        tabelaHash14.retira("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object obj24 = tabelaHash22.pesquisa("");
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash22);
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        java.lang.Object obj34 = tabelaHash29.pesquisa("");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        tabelaHash29.insere("", (java.lang.Object) tabelaHash36);
        tabelaHash29.imprime();
        tabelaHash22.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash22);
        tabelaHash22.imprime();
        java.lang.Class<?> wildcardClass43 = tabelaHash22.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash15);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("");
        java.lang.Object obj34 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.imprime();
        java.lang.Object obj37 = tabelaHash30.pesquisa("hi!");
        java.lang.Class<?> wildcardClass38 = tabelaHash30.getClass();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash30);
        java.lang.Object obj41 = tabelaHash8.pesquisa("");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        java.lang.Object obj34 = tabelaHash29.pesquisa("");
        java.lang.Object obj36 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        java.lang.Object obj43 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.imprime();
        tabelaHash29.insere("", (java.lang.Object) tabelaHash39);
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.imprime();
        tabelaHash47.insere("hi!", (java.lang.Object) 1L);
        tabelaHash47.retira("hi!");
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        java.lang.Object obj57 = tabelaHash55.pesquisa("");
        tabelaHash55.imprime();
        tabelaHash55.imprime();
        tabelaHash47.insere("hi!", (java.lang.Object) tabelaHash55);
        tabelaHash47.imprime();
        tabelaHash47.imprime();
        tabelaHash29.insere("", (java.lang.Object) tabelaHash47);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash47);
        ds.TabelaHash tabelaHash66 = new ds.TabelaHash();
        tabelaHash66.imprime();
        tabelaHash66.imprime();
        tabelaHash66.imprime();
        ds.TabelaHash tabelaHash71 = new ds.TabelaHash();
        tabelaHash71.imprime();
        tabelaHash71.insere("hi!", (java.lang.Object) 1L);
        tabelaHash71.retira("hi!");
        ds.TabelaHash tabelaHash79 = new ds.TabelaHash();
        java.lang.Object obj81 = tabelaHash79.pesquisa("");
        tabelaHash79.imprime();
        tabelaHash79.imprime();
        tabelaHash71.insere("hi!", (java.lang.Object) tabelaHash79);
        java.lang.Object obj86 = tabelaHash71.pesquisa("hi!");
        tabelaHash66.insere("", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass88 = tabelaHash66.getClass();
        tabelaHash47.insere("", (java.lang.Object) wildcardClass88);
        java.lang.Object obj91 = tabelaHash47.pesquisa("hi!");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertNotNull(obj91);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) ' ');
        tabelaHash9.insere("hi!", (java.lang.Object) '4');
        tabelaHash9.insere("", (java.lang.Object) 0.0f);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.insere("", (java.lang.Object) ' ');
        tabelaHash21.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj30 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash21);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '4' + "'", obj30, '4');
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1L);
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) ' ');
        tabelaHash28.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj37 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        java.lang.Object obj41 = tabelaHash28.pesquisa("hi!");
        tabelaHash19.insere("", obj41);
        tabelaHash19.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash19.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + '4' + "'", obj37, '4');
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + '4' + "'", obj41, '4');
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash5.retira("hi!");
        java.lang.Object obj21 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash5.pesquisa("");
        tabelaHash0.insere("", obj25);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash28);
        tabelaHash28.imprime();
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("");
        tabelaHash35.imprime();
        java.lang.Object obj40 = tabelaHash35.pesquisa("");
        tabelaHash35.imprime();
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        java.lang.Object obj45 = tabelaHash43.pesquisa("");
        tabelaHash43.imprime();
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        java.lang.Object obj50 = tabelaHash48.pesquisa("");
        tabelaHash48.imprime();
        java.lang.Object obj53 = tabelaHash48.pesquisa("");
        tabelaHash48.imprime();
        tabelaHash43.insere("hi!", (java.lang.Object) tabelaHash48);
        tabelaHash43.retira("hi!");
        tabelaHash35.insere("hi!", (java.lang.Object) tabelaHash43);
        tabelaHash35.imprime();
        tabelaHash35.imprime();
        tabelaHash35.retira("hi!");
        tabelaHash28.insere("", (java.lang.Object) tabelaHash35);
        java.lang.Object obj65 = tabelaHash28.pesquisa("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(obj65);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        java.lang.Object obj24 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash19);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) ' ');
        tabelaHash28.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj37 = tabelaHash28.pesquisa("hi!");
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        tabelaHash19.insere("", obj37);
        java.lang.Object obj41 = tabelaHash19.pesquisa("");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        java.lang.Object obj45 = tabelaHash43.pesquisa("");
        tabelaHash43.imprime();
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        java.lang.Object obj50 = tabelaHash48.pesquisa("");
        tabelaHash48.imprime();
        java.lang.Object obj53 = tabelaHash48.pesquisa("");
        tabelaHash48.imprime();
        tabelaHash43.insere("hi!", (java.lang.Object) tabelaHash48);
        tabelaHash43.retira("hi!");
        tabelaHash19.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        tabelaHash60.imprime();
        tabelaHash60.insere("hi!", (java.lang.Object) 1L);
        tabelaHash60.retira("hi!");
        ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
        java.lang.Object obj70 = tabelaHash68.pesquisa("");
        tabelaHash68.imprime();
        tabelaHash68.imprime();
        tabelaHash60.insere("hi!", (java.lang.Object) tabelaHash68);
        ds.TabelaHash tabelaHash75 = new ds.TabelaHash();
        java.lang.Object obj77 = tabelaHash75.pesquisa("");
        tabelaHash75.imprime();
        ds.TabelaHash tabelaHash80 = new ds.TabelaHash();
        java.lang.Object obj82 = tabelaHash80.pesquisa("");
        tabelaHash80.imprime();
        java.lang.Object obj85 = tabelaHash80.pesquisa("");
        tabelaHash80.imprime();
        tabelaHash75.insere("hi!", (java.lang.Object) tabelaHash80);
        tabelaHash68.insere("hi!", (java.lang.Object) tabelaHash75);
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash75);
        java.lang.Object obj91 = tabelaHash19.pesquisa("");
        java.lang.Object obj93 = tabelaHash19.pesquisa("");
        java.lang.Class<?> wildcardClass94 = obj93.getClass();
        tabelaHash0.insere("hi!", obj93);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + '4' + "'", obj37, '4');
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + '4' + "'", obj41, '4');
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertEquals("'" + obj91 + "' != '" + '4' + "'", obj91, '4');
        org.junit.Assert.assertEquals("'" + obj93 + "' != '" + '4' + "'", obj93, '4');
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) ' ');
        tabelaHash12.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj21 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '4' + "'", obj21, '4');
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("", (java.lang.Object) ' ');
        tabelaHash10.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj19 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj21 = null;
        tabelaHash10.insere("hi!", obj21);
        tabelaHash10.retira("");
        java.lang.Object obj26 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass29 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + '4' + "'", obj19, '4');
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + '4' + "'", obj26, '4');
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash15);
        java.lang.Object obj30 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        java.lang.Class<?> wildcardClass32 = tabelaHash15.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        java.lang.Object obj24 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj26 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        java.lang.Object obj39 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash29.retira("hi!");
        java.lang.Object obj45 = tabelaHash29.pesquisa("hi!");
        java.lang.Object obj47 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.imprime();
        java.lang.Object obj50 = tabelaHash29.pesquisa("");
        tabelaHash8.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash29.imprime();
        java.lang.Class<?> wildcardClass53 = tabelaHash29.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass53);
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        java.lang.Object obj58 = tabelaHash56.pesquisa("");
        tabelaHash56.imprime();
        java.lang.Object obj61 = tabelaHash56.pesquisa("");
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        tabelaHash63.imprime();
        tabelaHash56.insere("", (java.lang.Object) tabelaHash63);
        tabelaHash56.imprime();
        java.lang.Object obj68 = tabelaHash56.pesquisa("");
        tabelaHash0.insere("", obj68);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(obj68);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("");
        java.lang.Object obj16 = tabelaHash12.pesquisa("");
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) 1L);
        tabelaHash12.insere("hi!", (java.lang.Object) 1L);
        java.lang.Object obj27 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj30 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass31 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0d) + "'", obj30, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        java.lang.Object obj22 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash17);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        tabelaHash26.insere("", (java.lang.Object) ' ');
        tabelaHash26.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj35 = tabelaHash26.pesquisa("hi!");
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        tabelaHash17.insere("", obj35);
        java.lang.Class<?> wildcardClass38 = obj35.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass38);
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '4' + "'", obj35, '4');
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        java.lang.Object obj35 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash25.retira("hi!");
        java.lang.Object obj41 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash25);
        java.lang.Object obj45 = null;
        tabelaHash14.insere("hi!", obj45);
        tabelaHash14.retira("");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1L);
        tabelaHash10.imprime();
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        java.lang.Object obj29 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash24.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash24);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("");
        tabelaHash35.imprime();
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = tabelaHash40.pesquisa("");
        tabelaHash40.imprime();
        java.lang.Object obj45 = tabelaHash40.pesquisa("");
        tabelaHash40.imprime();
        tabelaHash35.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash35.retira("hi!");
        java.lang.Object obj51 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.imprime();
        tabelaHash24.insere("", (java.lang.Object) tabelaHash35);
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        java.lang.Object obj58 = tabelaHash56.pesquisa("");
        tabelaHash56.imprime();
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        java.lang.Object obj63 = tabelaHash61.pesquisa("");
        tabelaHash61.imprime();
        java.lang.Object obj66 = tabelaHash61.pesquisa("");
        tabelaHash61.imprime();
        tabelaHash56.insere("hi!", (java.lang.Object) tabelaHash61);
        tabelaHash56.retira("hi!");
        java.lang.Object obj72 = tabelaHash56.pesquisa("hi!");
        java.lang.Object obj74 = tabelaHash56.pesquisa("hi!");
        tabelaHash56.imprime();
        java.lang.Object obj77 = tabelaHash56.pesquisa("");
        java.lang.Class<?> wildcardClass78 = tabelaHash56.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass78);
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass82 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash12.imprime();
        java.lang.Class<?> wildcardClass19 = tabelaHash12.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1L);
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) ' ');
        tabelaHash28.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj37 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        java.lang.Object obj41 = tabelaHash28.pesquisa("hi!");
        tabelaHash19.insere("", obj41);
        java.lang.Object obj44 = tabelaHash19.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass45 = obj44.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + '4' + "'", obj37, '4');
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + '4' + "'", obj41, '4');
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) (short) 100);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) 1L);
        tabelaHash18.retira("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash26);
        tabelaHash12.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash12.imprime();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash19);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash28);
        tabelaHash19.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = obj21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
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
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) ' ');
        tabelaHash7.insere("hi!", (java.lang.Object) '4');
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass19 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        java.lang.Object obj22 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
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
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        java.lang.Object obj22 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Object obj27 = tabelaHash19.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        java.lang.Object obj13 = tabelaHash10.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash15.retira("hi!");
        java.lang.Object obj31 = tabelaHash15.pesquisa("hi!");
        java.lang.Object obj33 = tabelaHash15.pesquisa("hi!");
        java.lang.Object obj35 = tabelaHash15.pesquisa("");
        tabelaHash10.insere("", obj35);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("");
        tabelaHash38.imprime();
        tabelaHash10.insere("", (java.lang.Object) tabelaHash38);
        java.lang.Object obj44 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        java.lang.Object obj47 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1L);
        tabelaHash10.imprime();
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        java.lang.Object obj29 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash24.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash24);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("");
        tabelaHash35.imprime();
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = tabelaHash40.pesquisa("");
        tabelaHash40.imprime();
        java.lang.Object obj45 = tabelaHash40.pesquisa("");
        tabelaHash40.imprime();
        tabelaHash35.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash35.retira("hi!");
        java.lang.Object obj51 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.imprime();
        tabelaHash24.insere("", (java.lang.Object) tabelaHash35);
        tabelaHash0.insere("", (java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash19.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) ' ');
        tabelaHash15.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj24 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        java.lang.Object obj28 = tabelaHash15.pesquisa("hi!");
        tabelaHash0.insere("", obj28);
        tabelaHash0.imprime();
        java.lang.Object obj32 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        tabelaHash34.insere("", (java.lang.Object) ' ');
        tabelaHash34.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj43 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash34);
        java.lang.Object obj48 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '4' + "'", obj24, '4');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '4' + "'", obj28, '4');
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '4' + "'", obj32, '4');
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + '4' + "'", obj43, '4');
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + ' ' + "'", obj48, ' ');
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) (short) 100);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1L);
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) 1L);
        tabelaHash27.retira("hi!");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("");
        tabelaHash35.imprime();
        tabelaHash35.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash35);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object obj44 = tabelaHash42.pesquisa("");
        tabelaHash42.imprime();
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object obj49 = tabelaHash47.pesquisa("");
        tabelaHash47.imprime();
        java.lang.Object obj52 = tabelaHash47.pesquisa("");
        tabelaHash47.imprime();
        tabelaHash42.insere("hi!", (java.lang.Object) tabelaHash47);
        tabelaHash35.insere("hi!", (java.lang.Object) tabelaHash42);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash42);
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        java.lang.Object obj60 = tabelaHash58.pesquisa("");
        tabelaHash58.imprime();
        java.lang.Object obj63 = tabelaHash58.pesquisa("");
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        tabelaHash65.imprime();
        tabelaHash58.insere("", (java.lang.Object) tabelaHash65);
        tabelaHash58.imprime();
        ds.TabelaHash tabelaHash70 = new ds.TabelaHash();
        tabelaHash70.imprime();
        tabelaHash70.insere("hi!", (java.lang.Object) 1L);
        tabelaHash70.imprime();
        java.lang.Object obj77 = tabelaHash70.pesquisa("");
        ds.TabelaHash tabelaHash79 = new ds.TabelaHash();
        java.lang.Object obj81 = tabelaHash79.pesquisa("");
        tabelaHash79.imprime();
        ds.TabelaHash tabelaHash84 = new ds.TabelaHash();
        java.lang.Object obj86 = tabelaHash84.pesquisa("");
        tabelaHash84.imprime();
        java.lang.Object obj89 = tabelaHash84.pesquisa("");
        tabelaHash84.imprime();
        tabelaHash79.insere("hi!", (java.lang.Object) tabelaHash84);
        tabelaHash84.imprime();
        tabelaHash70.insere("hi!", (java.lang.Object) tabelaHash84);
        tabelaHash58.insere("", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass95 = tabelaHash58.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass95);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) false);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        java.lang.Object obj20 = tabelaHash15.pesquisa("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        tabelaHash15.insere("", (java.lang.Object) tabelaHash22);
        tabelaHash15.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash15);
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
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash8.imprime();
        java.lang.Class<?> wildcardClass15 = tabelaHash8.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
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
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        java.lang.Object obj31 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash26);
        tabelaHash21.retira("hi!");
        java.lang.Object obj37 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj39 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        java.lang.Object obj42 = tabelaHash21.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        tabelaHash46.imprime();
        tabelaHash46.imprime();
        java.lang.Object obj51 = tabelaHash46.pesquisa("hi!");
        tabelaHash46.imprime();
        tabelaHash46.imprime();
        tabelaHash46.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash46);
        java.lang.Object obj57 = tabelaHash46.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        java.lang.Object obj26 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash21);
        tabelaHash16.retira("hi!");
        java.lang.Object obj32 = tabelaHash16.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj32);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        java.lang.Object obj32 = tabelaHash27.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj35 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash5.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Object obj27 = tabelaHash19.pesquisa("hi!");
        java.lang.Object obj29 = tabelaHash19.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash15.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) ' ');
        tabelaHash33.insere("hi!", (java.lang.Object) '4');
        tabelaHash33.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj45 = tabelaHash33.pesquisa("");
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        tabelaHash15.insere("hi!", obj45);
        tabelaHash15.retira("");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + ' ' + "'", obj45, ' ');
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        java.lang.Object obj22 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) 1L);
        tabelaHash27.retira("hi!");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("");
        tabelaHash35.imprime();
        tabelaHash35.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash35);
        tabelaHash19.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) ' ');
        tabelaHash11.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj20 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        tabelaHash26.insere("", (java.lang.Object) ' ');
        tabelaHash26.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj35 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        java.lang.Object obj39 = tabelaHash26.pesquisa("hi!");
        tabelaHash11.insere("", obj39);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object obj43 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '4' + "'", obj20, '4');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '4' + "'", obj24, '4');
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '4' + "'", obj35, '4');
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + '4' + "'", obj39, '4');
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + ' ' + "'", obj43, ' ');
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) ' ');
        tabelaHash11.insere("hi!", (java.lang.Object) '4');
        tabelaHash11.retira("");
        tabelaHash11.imprime();
        java.lang.Class<?> wildcardClass22 = tabelaHash11.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        java.lang.Object obj28 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        java.lang.Object obj41 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash36);
        tabelaHash31.retira("hi!");
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash31);
        tabelaHash23.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) 100.0f);
        tabelaHash23.imprime();
        tabelaHash16.insere("", (java.lang.Object) tabelaHash23);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash16.imprime();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1L + "'", obj9, 1L);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) ' ');
        tabelaHash7.insere("hi!", (java.lang.Object) '4');
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        tabelaHash7.imprime();
        java.lang.Object obj19 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        java.lang.Object obj26 = tabelaHash21.pesquisa("");
        java.lang.Object obj28 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.imprime();
        tabelaHash31.insere("", (java.lang.Object) ' ');
        tabelaHash31.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj40 = tabelaHash31.pesquisa("hi!");
        java.lang.Object obj42 = null;
        tabelaHash31.insere("hi!", obj42);
        tabelaHash31.retira("");
        java.lang.Object obj47 = tabelaHash31.pesquisa("hi!");
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash31);
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        java.lang.Object obj52 = tabelaHash50.pesquisa("");
        tabelaHash50.imprime();
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        tabelaHash55.imprime();
        tabelaHash55.imprime();
        tabelaHash55.imprime();
        tabelaHash55.imprime();
        tabelaHash50.insere("", (java.lang.Object) tabelaHash55);
        tabelaHash55.imprime();
        tabelaHash21.insere("", (java.lang.Object) tabelaHash55);
        ds.TabelaHash tabelaHash64 = new ds.TabelaHash();
        tabelaHash64.imprime();
        tabelaHash64.insere("", (java.lang.Object) ' ');
        tabelaHash64.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj73 = tabelaHash64.pesquisa("hi!");
        java.lang.Object obj75 = null;
        tabelaHash64.insere("hi!", obj75);
        tabelaHash64.retira("");
        tabelaHash64.imprime();
        tabelaHash21.insere("", (java.lang.Object) tabelaHash64);
        tabelaHash7.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + ' ' + "'", obj19, ' ');
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + '4' + "'", obj40, '4');
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + '4' + "'", obj47, '4');
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + '4' + "'", obj73, '4');
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) (short) 100);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) 1L);
        tabelaHash18.retira("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash26);
        tabelaHash12.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        tabelaHash26.insere("", (java.lang.Object) ' ');
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("");
        tabelaHash32.imprime();
        java.lang.Object obj37 = tabelaHash32.pesquisa("");
        java.lang.Object obj39 = tabelaHash32.pesquisa("");
        tabelaHash32.imprime();
        java.lang.Class<?> wildcardClass41 = tabelaHash32.getClass();
        tabelaHash26.insere("", (java.lang.Object) wildcardClass41);
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass41);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1L);
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) 1L);
        tabelaHash27.retira("hi!");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("");
        tabelaHash35.imprime();
        tabelaHash35.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash35);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object obj44 = tabelaHash42.pesquisa("");
        tabelaHash42.imprime();
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object obj49 = tabelaHash47.pesquisa("");
        tabelaHash47.imprime();
        java.lang.Object obj52 = tabelaHash47.pesquisa("");
        tabelaHash47.imprime();
        tabelaHash42.insere("hi!", (java.lang.Object) tabelaHash47);
        tabelaHash35.insere("hi!", (java.lang.Object) tabelaHash42);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash42);
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        java.lang.Object obj60 = tabelaHash58.pesquisa("");
        tabelaHash58.imprime();
        java.lang.Object obj63 = tabelaHash58.pesquisa("");
        java.lang.Object obj65 = tabelaHash58.pesquisa("");
        tabelaHash58.imprime();
        ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
        tabelaHash68.imprime();
        tabelaHash68.insere("", (java.lang.Object) ' ');
        tabelaHash68.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj77 = tabelaHash68.pesquisa("hi!");
        java.lang.Object obj79 = null;
        tabelaHash68.insere("hi!", obj79);
        tabelaHash68.retira("");
        java.lang.Object obj84 = tabelaHash68.pesquisa("hi!");
        tabelaHash58.insere("hi!", (java.lang.Object) tabelaHash68);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash68);
        tabelaHash0.retira("hi!");
        java.lang.Object obj90 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + '4' + "'", obj77, '4');
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + '4' + "'", obj84, '4');
        org.junit.Assert.assertNull(obj90);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        java.lang.Object obj14 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) 1L);
        tabelaHash18.retira("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash26);
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        tabelaHash5.insere("", obj23);
        java.lang.Object obj27 = tabelaHash5.pesquisa("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        java.lang.Object obj39 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash29.retira("hi!");
        tabelaHash5.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj46 = null;
        tabelaHash5.insere("hi!", obj46);
        java.lang.Object obj49 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj51 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj53 = tabelaHash5.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '4' + "'", obj23, '4');
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + '4' + "'", obj53, '4');
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
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
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass26 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1L);
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) 1L);
        tabelaHash27.retira("hi!");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("");
        tabelaHash35.imprime();
        tabelaHash35.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash35);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object obj44 = tabelaHash42.pesquisa("");
        tabelaHash42.imprime();
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object obj49 = tabelaHash47.pesquisa("");
        tabelaHash47.imprime();
        java.lang.Object obj52 = tabelaHash47.pesquisa("");
        tabelaHash47.imprime();
        tabelaHash42.insere("hi!", (java.lang.Object) tabelaHash47);
        tabelaHash35.insere("hi!", (java.lang.Object) tabelaHash42);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash42);
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        java.lang.Object obj60 = tabelaHash58.pesquisa("");
        tabelaHash58.imprime();
        java.lang.Object obj63 = tabelaHash58.pesquisa("");
        java.lang.Object obj65 = tabelaHash58.pesquisa("");
        tabelaHash58.imprime();
        ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
        tabelaHash68.imprime();
        tabelaHash68.insere("", (java.lang.Object) ' ');
        tabelaHash68.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj77 = tabelaHash68.pesquisa("hi!");
        java.lang.Object obj79 = null;
        tabelaHash68.insere("hi!", obj79);
        tabelaHash68.retira("");
        java.lang.Object obj84 = tabelaHash68.pesquisa("hi!");
        tabelaHash58.insere("hi!", (java.lang.Object) tabelaHash68);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash68);
        java.lang.Class<?> wildcardClass87 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + '4' + "'", obj77, '4');
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + '4' + "'", obj84, '4');
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) ' ');
        tabelaHash7.insere("hi!", (java.lang.Object) '4');
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        java.lang.Object obj18 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        java.lang.Object obj30 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash25);
        tabelaHash20.retira("hi!");
        java.lang.Object obj36 = tabelaHash20.pesquisa("");
        java.lang.Class<?> wildcardClass37 = tabelaHash20.getClass();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash20);
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        tabelaHash40.insere("hi!", (java.lang.Object) 1L);
        tabelaHash40.retira("hi!");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        java.lang.Object obj50 = tabelaHash48.pesquisa("");
        tabelaHash48.imprime();
        tabelaHash48.imprime();
        tabelaHash40.insere("hi!", (java.lang.Object) tabelaHash48);
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash40);
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        java.lang.Object obj60 = tabelaHash58.pesquisa("");
        tabelaHash58.imprime();
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        java.lang.Object obj65 = tabelaHash63.pesquisa("");
        tabelaHash63.imprime();
        java.lang.Object obj68 = tabelaHash63.pesquisa("");
        tabelaHash63.imprime();
        tabelaHash58.insere("hi!", (java.lang.Object) tabelaHash63);
        tabelaHash63.imprime();
        java.lang.Class<?> wildcardClass72 = tabelaHash63.getClass();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash63);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + ' ' + "'", obj18, ' ');
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) (short) 100);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) 1L);
        tabelaHash22.retira("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash16.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass37 = tabelaHash16.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash5.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Object obj27 = null;
        tabelaHash5.insere("", obj27);
        tabelaHash5.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash5.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("", (java.lang.Object) ' ');
        tabelaHash10.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj19 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj21 = null;
        tabelaHash10.insere("hi!", obj21);
        tabelaHash10.retira("");
        java.lang.Object obj26 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        tabelaHash29.insere("", (java.lang.Object) tabelaHash34);
        tabelaHash34.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash34);
        java.lang.Class<?> wildcardClass42 = tabelaHash34.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + '4' + "'", obj19, '4');
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + '4' + "'", obj26, '4');
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) ' ');
        tabelaHash7.insere("hi!", (java.lang.Object) '4');
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        java.lang.Object obj18 = null;
        tabelaHash7.insere("", obj18);
        tabelaHash7.retira("");
        java.lang.Object obj23 = tabelaHash7.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        java.lang.Object obj31 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash26);
        tabelaHash21.retira("hi!");
        java.lang.Object obj37 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj39 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        java.lang.Object obj42 = tabelaHash21.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash21.imprime();
        java.lang.Object obj46 = tabelaHash21.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass47 = obj46.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = null;
        tabelaHash0.insere("", obj15);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + '4' + "'", obj18, '4');
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        tabelaHash5.insere("", obj23);
        java.lang.Object obj27 = tabelaHash5.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash5.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '4' + "'", obj23, '4');
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        java.lang.Object obj22 = tabelaHash18.pesquisa("hi!");
        tabelaHash10.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) ' ');
        tabelaHash28.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj37 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = tabelaHash40.pesquisa("");
        tabelaHash40.imprime();
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        java.lang.Object obj47 = tabelaHash45.pesquisa("");
        tabelaHash45.imprime();
        java.lang.Object obj50 = tabelaHash45.pesquisa("");
        tabelaHash45.imprime();
        tabelaHash40.insere("hi!", (java.lang.Object) tabelaHash45);
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        tabelaHash54.imprime();
        tabelaHash54.insere("", (java.lang.Object) ' ');
        tabelaHash54.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj63 = tabelaHash54.pesquisa("hi!");
        java.lang.Class<?> wildcardClass64 = obj63.getClass();
        tabelaHash45.insere("", obj63);
        java.lang.Class<?> wildcardClass66 = obj63.getClass();
        tabelaHash28.insere("", (java.lang.Object) wildcardClass66);
        tabelaHash28.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass71 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + '4' + "'", obj37, '4');
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + '4' + "'", obj63, '4');
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash5.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Object obj27 = null;
        tabelaHash5.insere("", obj27);
        tabelaHash5.imprime();
        java.lang.Object obj31 = tabelaHash5.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        java.lang.Object obj20 = tabelaHash15.pesquisa("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        tabelaHash15.insere("", (java.lang.Object) tabelaHash22);
        tabelaHash15.imprime();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash8.retira("");
        java.lang.Class<?> wildcardClass29 = tabelaHash8.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass16 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1L);
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Object obj27 = null;
        tabelaHash19.insere("", obj27);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash19.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        java.lang.Object obj14 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) 1L);
        tabelaHash18.retira("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash26);
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        tabelaHash0.imprime();
        java.lang.Object obj37 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.imprime();
        tabelaHash39.insere("", (java.lang.Object) ' ');
        tabelaHash39.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj48 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.retira("");
        tabelaHash39.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash39);
        java.lang.Class<?> wildcardClass53 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + '4' + "'", obj48, '4');
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash15.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) ' ');
        tabelaHash33.insere("hi!", (java.lang.Object) '4');
        tabelaHash33.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj45 = tabelaHash33.pesquisa("");
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        tabelaHash15.insere("hi!", obj45);
        java.lang.Object obj49 = tabelaHash15.pesquisa("hi!");
        java.lang.Object obj51 = null;
        tabelaHash15.insere("", obj51);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + ' ' + "'", obj45, ' ');
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(obj49);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        java.lang.Object obj17 = tabelaHash12.pesquisa("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Class<?> wildcardClass22 = tabelaHash19.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass22);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass25 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash11.retira("hi!");
        java.lang.Object obj27 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj29 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        java.lang.Object obj32 = tabelaHash11.pesquisa("");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        tabelaHash34.insere("hi!", (java.lang.Object) 1L);
        tabelaHash34.retira("hi!");
        java.lang.Object obj42 = tabelaHash34.pesquisa("");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.imprime();
        tabelaHash44.insere("hi!", (java.lang.Object) 1L);
        tabelaHash44.retira("hi!");
        tabelaHash34.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        java.lang.Object obj55 = tabelaHash53.pesquisa("");
        tabelaHash53.imprime();
        tabelaHash53.imprime();
        tabelaHash53.imprime();
        tabelaHash34.insere("", (java.lang.Object) tabelaHash53);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        tabelaHash63.imprime();
        tabelaHash63.insere("hi!", (java.lang.Object) 1L);
        tabelaHash63.retira("hi!");
        ds.TabelaHash tabelaHash71 = new ds.TabelaHash();
        java.lang.Object obj73 = tabelaHash71.pesquisa("");
        tabelaHash71.imprime();
        tabelaHash71.imprime();
        tabelaHash63.insere("hi!", (java.lang.Object) tabelaHash71);
        tabelaHash11.insere("", (java.lang.Object) tabelaHash63);
        java.lang.Class<?> wildcardClass78 = tabelaHash63.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("");
        java.lang.Object obj21 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj20 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass24 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        java.lang.Object obj35 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash25.retira("hi!");
        java.lang.Object obj41 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash14.retira("");
        tabelaHash14.imprime();
        java.lang.Object obj48 = tabelaHash14.pesquisa("hi!");
        java.lang.Class<?> wildcardClass49 = tabelaHash14.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash15.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) ' ');
        tabelaHash33.insere("hi!", (java.lang.Object) '4');
        tabelaHash33.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj45 = tabelaHash33.pesquisa("");
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        tabelaHash15.insere("hi!", obj45);
        java.lang.Object obj49 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.retira("");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + ' ' + "'", obj45, ' ');
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(obj49);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        java.lang.Object obj31 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash26);
        tabelaHash21.retira("hi!");
        java.lang.Object obj37 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj39 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        java.lang.Object obj42 = tabelaHash21.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash0.imprime();
        java.lang.Object obj46 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        java.lang.Object obj31 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash26);
        tabelaHash21.retira("hi!");
        java.lang.Object obj37 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj39 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        java.lang.Object obj42 = tabelaHash21.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        java.lang.Object obj45 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj47 = tabelaHash21.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        tabelaHash5.insere("", obj23);
        java.lang.Object obj27 = tabelaHash5.pesquisa("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        java.lang.Object obj39 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash29.retira("hi!");
        tabelaHash5.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        tabelaHash46.insere("hi!", (java.lang.Object) 1L);
        tabelaHash46.retira("hi!");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        java.lang.Object obj56 = tabelaHash54.pesquisa("");
        tabelaHash54.imprime();
        tabelaHash54.imprime();
        tabelaHash46.insere("hi!", (java.lang.Object) tabelaHash54);
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        java.lang.Object obj63 = tabelaHash61.pesquisa("");
        tabelaHash61.imprime();
        ds.TabelaHash tabelaHash66 = new ds.TabelaHash();
        java.lang.Object obj68 = tabelaHash66.pesquisa("");
        tabelaHash66.imprime();
        java.lang.Object obj71 = tabelaHash66.pesquisa("");
        tabelaHash66.imprime();
        tabelaHash61.insere("hi!", (java.lang.Object) tabelaHash66);
        tabelaHash54.insere("hi!", (java.lang.Object) tabelaHash61);
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash61);
        java.lang.Object obj77 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash5.retira("hi!");
        tabelaHash5.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '4' + "'", obj23, '4');
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + '4' + "'", obj77, '4');
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj20 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 10.0f);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        java.lang.Class<?> wildcardClass30 = tabelaHash25.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash25.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash12.imprime();
        java.lang.Object obj20 = tabelaHash12.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        java.lang.Object obj13 = tabelaHash10.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash15.retira("hi!");
        java.lang.Object obj31 = tabelaHash15.pesquisa("hi!");
        java.lang.Object obj33 = tabelaHash15.pesquisa("hi!");
        java.lang.Object obj35 = tabelaHash15.pesquisa("");
        tabelaHash10.insere("", obj35);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("");
        tabelaHash38.imprime();
        tabelaHash10.insere("", (java.lang.Object) tabelaHash38);
        java.lang.Object obj44 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        java.lang.Object obj47 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(obj47);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash5.retira("hi!");
        java.lang.Object obj21 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash5.pesquisa("");
        tabelaHash0.insere("", obj25);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        java.lang.Object obj35 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        tabelaHash0.insere("", obj38);
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object obj43 = tabelaHash41.pesquisa("");
        tabelaHash41.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        java.lang.Object obj48 = tabelaHash46.pesquisa("");
        tabelaHash46.imprime();
        java.lang.Object obj51 = tabelaHash46.pesquisa("");
        tabelaHash46.imprime();
        tabelaHash41.insere("hi!", (java.lang.Object) tabelaHash46);
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        java.lang.Object obj57 = tabelaHash55.pesquisa("");
        tabelaHash55.imprime();
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        tabelaHash60.imprime();
        tabelaHash60.imprime();
        tabelaHash60.imprime();
        tabelaHash60.imprime();
        tabelaHash55.insere("", (java.lang.Object) tabelaHash60);
        tabelaHash46.insere("", (java.lang.Object) tabelaHash60);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash46);
        ds.TabelaHash tabelaHash69 = new ds.TabelaHash();
        tabelaHash69.imprime();
        tabelaHash69.insere("", (java.lang.Object) ' ');
        tabelaHash69.insere("hi!", (java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass77 = tabelaHash69.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash69);
        java.lang.Object obj80 = tabelaHash69.pesquisa("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + 0L + "'", obj80, 0L);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        java.lang.Object obj29 = tabelaHash26.pesquisa("hi!");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        java.lang.Object obj41 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash36);
        tabelaHash31.retira("hi!");
        java.lang.Object obj47 = tabelaHash31.pesquisa("hi!");
        java.lang.Object obj49 = tabelaHash31.pesquisa("hi!");
        java.lang.Object obj51 = tabelaHash31.pesquisa("");
        tabelaHash26.insere("", obj51);
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        java.lang.Object obj56 = tabelaHash54.pesquisa("");
        tabelaHash54.imprime();
        tabelaHash26.insere("", (java.lang.Object) tabelaHash54);
        java.lang.Object obj60 = tabelaHash26.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) tabelaHash26);
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash64 = new ds.TabelaHash();
        tabelaHash64.imprime();
        java.lang.Object obj67 = tabelaHash64.pesquisa("hi!");
        ds.TabelaHash tabelaHash69 = new ds.TabelaHash();
        java.lang.Object obj71 = tabelaHash69.pesquisa("");
        tabelaHash69.imprime();
        ds.TabelaHash tabelaHash74 = new ds.TabelaHash();
        java.lang.Object obj76 = tabelaHash74.pesquisa("");
        tabelaHash74.imprime();
        java.lang.Object obj79 = tabelaHash74.pesquisa("");
        tabelaHash74.imprime();
        tabelaHash69.insere("hi!", (java.lang.Object) tabelaHash74);
        tabelaHash69.retira("hi!");
        java.lang.Object obj85 = tabelaHash69.pesquisa("hi!");
        java.lang.Object obj87 = tabelaHash69.pesquisa("hi!");
        java.lang.Object obj89 = tabelaHash69.pesquisa("");
        tabelaHash64.insere("", obj89);
        ds.TabelaHash tabelaHash92 = new ds.TabelaHash();
        java.lang.Object obj94 = tabelaHash92.pesquisa("");
        tabelaHash92.imprime();
        tabelaHash64.insere("", (java.lang.Object) tabelaHash92);
        tabelaHash92.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash92);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        java.lang.Object obj41 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash36);
        tabelaHash31.retira("hi!");
        java.lang.Object obj47 = tabelaHash31.pesquisa("");
        java.lang.Class<?> wildcardClass48 = tabelaHash31.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass48);
        java.lang.Object obj51 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "class ds.TabelaHash");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) false);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) ' ');
        tabelaHash7.insere("hi!", (java.lang.Object) '4');
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) 1L);
        tabelaHash18.retira("hi!");
        java.lang.Object obj26 = tabelaHash18.pesquisa("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.insere("hi!", (java.lang.Object) 1L);
        tabelaHash28.retira("hi!");
        tabelaHash18.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object obj39 = tabelaHash37.pesquisa("");
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash18.insere("", (java.lang.Object) tabelaHash37);
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.imprime();
        tabelaHash45.insere("hi!", (java.lang.Object) 1L);
        tabelaHash45.retira("hi!");
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        java.lang.Object obj55 = tabelaHash53.pesquisa("");
        tabelaHash53.imprime();
        tabelaHash53.imprime();
        tabelaHash45.insere("hi!", (java.lang.Object) tabelaHash53);
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        java.lang.Object obj62 = tabelaHash60.pesquisa("");
        tabelaHash60.imprime();
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        java.lang.Object obj67 = tabelaHash65.pesquisa("");
        tabelaHash65.imprime();
        java.lang.Object obj70 = tabelaHash65.pesquisa("");
        tabelaHash65.imprime();
        tabelaHash60.insere("hi!", (java.lang.Object) tabelaHash65);
        tabelaHash53.insere("hi!", (java.lang.Object) tabelaHash60);
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash60);
        tabelaHash7.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj77 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash79 = new ds.TabelaHash();
        tabelaHash79.imprime();
        tabelaHash79.imprime();
        java.lang.Object obj83 = tabelaHash79.pesquisa("hi!");
        tabelaHash79.imprime();
        tabelaHash79.imprime();
        ds.TabelaHash tabelaHash87 = new ds.TabelaHash();
        java.lang.Object obj89 = tabelaHash87.pesquisa("");
        tabelaHash87.imprime();
        tabelaHash87.imprime();
        tabelaHash87.imprime();
        java.lang.Object obj94 = tabelaHash87.pesquisa("");
        tabelaHash87.imprime();
        tabelaHash87.imprime();
        tabelaHash79.insere("", (java.lang.Object) tabelaHash87);
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash87);
        tabelaHash87.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + ' ' + "'", obj77, ' ');
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        java.lang.Object obj29 = tabelaHash26.pesquisa("hi!");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        java.lang.Object obj41 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash36);
        tabelaHash31.retira("hi!");
        java.lang.Object obj47 = tabelaHash31.pesquisa("hi!");
        java.lang.Object obj49 = tabelaHash31.pesquisa("hi!");
        java.lang.Object obj51 = tabelaHash31.pesquisa("");
        tabelaHash26.insere("", obj51);
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        java.lang.Object obj56 = tabelaHash54.pesquisa("");
        tabelaHash54.imprime();
        tabelaHash26.insere("", (java.lang.Object) tabelaHash54);
        java.lang.Object obj60 = tabelaHash26.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) tabelaHash26);
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash66 = new ds.TabelaHash();
        java.lang.Object obj68 = tabelaHash66.pesquisa("");
        tabelaHash66.imprime();
        java.lang.Object obj71 = tabelaHash66.pesquisa("");
        java.lang.Class<?> wildcardClass72 = tabelaHash66.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass72);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) ' ');
        tabelaHash7.insere("hi!", (java.lang.Object) '4');
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        tabelaHash7.imprime();
        java.lang.Object obj19 = tabelaHash7.pesquisa("");
        tabelaHash7.retira("");
        java.lang.Object obj23 = tabelaHash7.pesquisa("");
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        java.lang.Object obj31 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        java.lang.Object obj38 = tabelaHash34.pesquisa("hi!");
        tabelaHash26.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + ' ' + "'", obj19, ' ');
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash15.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) ' ');
        tabelaHash33.insere("hi!", (java.lang.Object) '4');
        tabelaHash33.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj45 = tabelaHash33.pesquisa("");
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        tabelaHash15.insere("hi!", obj45);
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + ' ' + "'", obj45, ' ');
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj8 = null;
        tabelaHash0.insere("hi!", obj8);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) 1L);
        tabelaHash25.retira("hi!");
        java.lang.Object obj33 = tabelaHash25.pesquisa("");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.imprime();
        tabelaHash35.insere("hi!", (java.lang.Object) 1L);
        tabelaHash35.retira("hi!");
        tabelaHash25.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object obj46 = tabelaHash44.pesquisa("");
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash25.insere("", (java.lang.Object) tabelaHash44);
        tabelaHash25.retira("hi!");
        tabelaHash14.insere("", (java.lang.Object) tabelaHash25);
        java.lang.Object obj55 = tabelaHash14.pesquisa("hi!");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) ' ');
        tabelaHash7.insere("hi!", (java.lang.Object) '4');
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        tabelaHash7.imprime();
        java.lang.Object obj19 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) 1L);
        tabelaHash21.imprime();
        java.lang.Object obj28 = tabelaHash21.pesquisa("");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("");
        tabelaHash35.imprime();
        java.lang.Object obj40 = tabelaHash35.pesquisa("");
        tabelaHash35.imprime();
        tabelaHash30.insere("hi!", (java.lang.Object) tabelaHash35);
        tabelaHash35.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash35);
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        java.lang.Object obj48 = tabelaHash46.pesquisa("");
        tabelaHash46.imprime();
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        java.lang.Object obj53 = tabelaHash51.pesquisa("");
        tabelaHash51.imprime();
        java.lang.Object obj56 = tabelaHash51.pesquisa("");
        tabelaHash51.imprime();
        tabelaHash46.insere("hi!", (java.lang.Object) tabelaHash51);
        tabelaHash46.retira("hi!");
        java.lang.Object obj62 = tabelaHash46.pesquisa("hi!");
        tabelaHash46.imprime();
        tabelaHash35.insere("", (java.lang.Object) tabelaHash46);
        tabelaHash7.insere("", (java.lang.Object) tabelaHash35);
        java.lang.Class<?> wildcardClass66 = tabelaHash7.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + ' ' + "'", obj19, ' ');
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) (short) 100);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) 1L);
        tabelaHash22.retira("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash16.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass37 = tabelaHash16.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) 1L);
        tabelaHash23.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash32);
        java.lang.Class<?> wildcardClass36 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
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
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        tabelaHash6.imprime();
        tabelaHash6.imprime();
        java.lang.Object obj11 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) 1L);
        tabelaHash14.retira("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object obj24 = tabelaHash22.pesquisa("");
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash22);
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        java.lang.Object obj39 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash22.insere("hi!", (java.lang.Object) tabelaHash29);
        tabelaHash6.insere("", (java.lang.Object) tabelaHash29);
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.imprime();
        tabelaHash45.imprime();
        tabelaHash45.imprime();
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.imprime();
        tabelaHash50.insere("hi!", (java.lang.Object) 1L);
        tabelaHash50.retira("hi!");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        java.lang.Object obj60 = tabelaHash58.pesquisa("");
        tabelaHash58.imprime();
        tabelaHash58.imprime();
        tabelaHash50.insere("hi!", (java.lang.Object) tabelaHash58);
        java.lang.Object obj65 = tabelaHash50.pesquisa("hi!");
        tabelaHash45.insere("", (java.lang.Object) "hi!");
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash45);
        java.lang.Object obj69 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNotNull(obj69);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        java.lang.Object obj26 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) 1L);
        tabelaHash25.retira("hi!");
        java.lang.Object obj33 = tabelaHash25.pesquisa("");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.imprime();
        tabelaHash35.insere("hi!", (java.lang.Object) 1L);
        tabelaHash35.retira("hi!");
        tabelaHash25.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object obj46 = tabelaHash44.pesquisa("");
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash25.insere("", (java.lang.Object) tabelaHash44);
        tabelaHash25.retira("hi!");
        tabelaHash14.insere("", (java.lang.Object) tabelaHash25);
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        tabelaHash55.imprime();
        tabelaHash55.insere("hi!", (java.lang.Object) 1L);
        tabelaHash55.imprime();
        java.lang.Object obj62 = tabelaHash55.pesquisa("");
        java.lang.Class<?> wildcardClass63 = tabelaHash55.getClass();
        tabelaHash25.insere("", (java.lang.Object) tabelaHash55);
        java.lang.Class<?> wildcardClass65 = tabelaHash25.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) (short) 100);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) 1L);
        tabelaHash22.retira("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash16.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass37 = tabelaHash16.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj40 = tabelaHash16.pesquisa("hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (short) 100 + "'", obj40, (short) 100);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        java.lang.Object obj20 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash15);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.imprime();
        tabelaHash24.insere("", (java.lang.Object) ' ');
        tabelaHash24.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj33 = tabelaHash24.pesquisa("hi!");
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        tabelaHash15.insere("", obj33);
        java.lang.Object obj37 = tabelaHash15.pesquisa("");
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object obj41 = tabelaHash39.pesquisa("");
        tabelaHash39.imprime();
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object obj46 = tabelaHash44.pesquisa("");
        tabelaHash44.imprime();
        java.lang.Object obj49 = tabelaHash44.pesquisa("");
        tabelaHash44.imprime();
        tabelaHash39.insere("hi!", (java.lang.Object) tabelaHash44);
        tabelaHash39.retira("hi!");
        tabelaHash15.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        tabelaHash56.imprime();
        tabelaHash56.insere("hi!", (java.lang.Object) 1L);
        tabelaHash56.retira("hi!");
        ds.TabelaHash tabelaHash64 = new ds.TabelaHash();
        java.lang.Object obj66 = tabelaHash64.pesquisa("");
        tabelaHash64.imprime();
        tabelaHash64.imprime();
        tabelaHash56.insere("hi!", (java.lang.Object) tabelaHash64);
        ds.TabelaHash tabelaHash71 = new ds.TabelaHash();
        java.lang.Object obj73 = tabelaHash71.pesquisa("");
        tabelaHash71.imprime();
        ds.TabelaHash tabelaHash76 = new ds.TabelaHash();
        java.lang.Object obj78 = tabelaHash76.pesquisa("");
        tabelaHash76.imprime();
        java.lang.Object obj81 = tabelaHash76.pesquisa("");
        tabelaHash76.imprime();
        tabelaHash71.insere("hi!", (java.lang.Object) tabelaHash76);
        tabelaHash64.insere("hi!", (java.lang.Object) tabelaHash71);
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash71);
        tabelaHash71.imprime();
        ds.TabelaHash tabelaHash88 = new ds.TabelaHash();
        java.lang.Object obj90 = tabelaHash88.pesquisa("");
        tabelaHash88.imprime();
        java.lang.Object obj93 = tabelaHash88.pesquisa("");
        java.lang.Class<?> wildcardClass94 = tabelaHash88.getClass();
        tabelaHash71.insere("hi!", (java.lang.Object) tabelaHash88);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + '4' + "'", obj33, '4');
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + '4' + "'", obj37, '4');
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = null;
        tabelaHash0.insere("", obj15);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) ' ');
        tabelaHash18.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj27 = tabelaHash18.pesquisa("");
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.imprime();
        java.lang.Object obj33 = tabelaHash30.pesquisa("hi!");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("");
        tabelaHash35.imprime();
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = tabelaHash40.pesquisa("");
        tabelaHash40.imprime();
        java.lang.Object obj45 = tabelaHash40.pesquisa("");
        tabelaHash40.imprime();
        tabelaHash35.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash35.retira("hi!");
        java.lang.Object obj51 = tabelaHash35.pesquisa("hi!");
        java.lang.Object obj53 = tabelaHash35.pesquisa("hi!");
        java.lang.Object obj55 = tabelaHash35.pesquisa("");
        tabelaHash30.insere("", obj55);
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        java.lang.Object obj60 = tabelaHash58.pesquisa("");
        tabelaHash58.imprime();
        java.lang.Object obj63 = tabelaHash58.pesquisa("");
        java.lang.Object obj65 = tabelaHash58.pesquisa("");
        tabelaHash58.imprime();
        java.lang.Object obj68 = tabelaHash58.pesquisa("");
        tabelaHash30.insere("", obj68);
        tabelaHash18.insere("", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass71 = tabelaHash18.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        tabelaHash0.retira("hi!");
        java.lang.Object obj76 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + ' ' + "'", obj27, ' ');
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1L);
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) 1L);
        tabelaHash27.retira("hi!");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("");
        tabelaHash35.imprime();
        tabelaHash35.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash35);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object obj44 = tabelaHash42.pesquisa("");
        tabelaHash42.imprime();
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object obj49 = tabelaHash47.pesquisa("");
        tabelaHash47.imprime();
        java.lang.Object obj52 = tabelaHash47.pesquisa("");
        tabelaHash47.imprime();
        tabelaHash42.insere("hi!", (java.lang.Object) tabelaHash47);
        tabelaHash35.insere("hi!", (java.lang.Object) tabelaHash42);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash42);
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        java.lang.Object obj60 = tabelaHash58.pesquisa("");
        tabelaHash58.imprime();
        java.lang.Object obj63 = tabelaHash58.pesquisa("");
        java.lang.Object obj65 = tabelaHash58.pesquisa("");
        tabelaHash58.imprime();
        ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
        tabelaHash68.imprime();
        tabelaHash68.insere("", (java.lang.Object) ' ');
        tabelaHash68.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj77 = tabelaHash68.pesquisa("hi!");
        java.lang.Object obj79 = null;
        tabelaHash68.insere("hi!", obj79);
        tabelaHash68.retira("");
        java.lang.Object obj84 = tabelaHash68.pesquisa("hi!");
        tabelaHash58.insere("hi!", (java.lang.Object) tabelaHash68);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash68);
        tabelaHash0.imprime();
        java.lang.Object obj89 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass90 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + '4' + "'", obj77, '4');
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + '4' + "'", obj84, '4');
        org.junit.Assert.assertEquals("'" + obj89 + "' != '" + "hi!" + "'", obj89, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash15.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) ' ');
        tabelaHash33.insere("hi!", (java.lang.Object) '4');
        tabelaHash33.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj45 = tabelaHash33.pesquisa("");
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        tabelaHash15.insere("hi!", obj45);
        java.lang.Object obj49 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        java.lang.Class<?> wildcardClass51 = tabelaHash15.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + ' ' + "'", obj45, ' ');
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1L);
        tabelaHash10.imprime();
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        java.lang.Object obj29 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash24.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash24);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("");
        tabelaHash35.imprime();
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = tabelaHash40.pesquisa("");
        tabelaHash40.imprime();
        java.lang.Object obj45 = tabelaHash40.pesquisa("");
        tabelaHash40.imprime();
        tabelaHash35.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash35.retira("hi!");
        java.lang.Object obj51 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.imprime();
        tabelaHash24.insere("", (java.lang.Object) tabelaHash35);
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        java.lang.Object obj58 = tabelaHash56.pesquisa("");
        tabelaHash56.imprime();
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        java.lang.Object obj63 = tabelaHash61.pesquisa("");
        tabelaHash61.imprime();
        java.lang.Object obj66 = tabelaHash61.pesquisa("");
        tabelaHash61.imprime();
        tabelaHash56.insere("hi!", (java.lang.Object) tabelaHash61);
        tabelaHash56.retira("hi!");
        java.lang.Object obj72 = tabelaHash56.pesquisa("hi!");
        java.lang.Object obj74 = tabelaHash56.pesquisa("hi!");
        tabelaHash56.imprime();
        java.lang.Object obj77 = tabelaHash56.pesquisa("");
        java.lang.Class<?> wildcardClass78 = tabelaHash56.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass78);
        java.lang.Class<?> wildcardClass80 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash33.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        java.lang.Object obj31 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash26);
        tabelaHash21.retira("hi!");
        java.lang.Object obj37 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj39 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        java.lang.Object obj42 = tabelaHash21.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        tabelaHash46.imprime();
        tabelaHash46.imprime();
        java.lang.Object obj51 = tabelaHash46.pesquisa("hi!");
        tabelaHash46.imprime();
        tabelaHash46.imprime();
        tabelaHash46.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash46);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash46.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) ' ');
        tabelaHash9.insere("hi!", (java.lang.Object) '4');
        tabelaHash9.insere("", (java.lang.Object) 0.0f);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        java.lang.Object obj26 = tabelaHash21.pesquisa("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash21.insere("", (java.lang.Object) tabelaHash28);
        java.lang.Class<?> wildcardClass31 = tabelaHash28.getClass();
        tabelaHash9.insere("hi!", (java.lang.Object) wildcardClass31);
        java.lang.Class<?> wildcardClass33 = tabelaHash9.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        tabelaHash36.insere("hi!", (java.lang.Object) 1L);
        tabelaHash36.retira("hi!");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object obj46 = tabelaHash44.pesquisa("");
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash36.insere("hi!", (java.lang.Object) tabelaHash44);
        java.lang.Object obj51 = tabelaHash36.pesquisa("hi!");
        tabelaHash9.insere("", obj51);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(obj51);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        java.lang.Object obj17 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        java.lang.Object obj30 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash25);
        tabelaHash20.retira("hi!");
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0f);
        tabelaHash12.imprime();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Class<?> wildcardClass42 = tabelaHash12.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash5.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Object obj27 = tabelaHash19.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        java.lang.Object obj34 = tabelaHash29.pesquisa("");
        java.lang.Object obj36 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        java.lang.Object obj43 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.imprime();
        tabelaHash29.insere("", (java.lang.Object) tabelaHash39);
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.imprime();
        tabelaHash47.insere("hi!", (java.lang.Object) 1L);
        tabelaHash47.retira("hi!");
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        java.lang.Object obj57 = tabelaHash55.pesquisa("");
        tabelaHash55.imprime();
        tabelaHash55.imprime();
        tabelaHash47.insere("hi!", (java.lang.Object) tabelaHash55);
        tabelaHash47.imprime();
        tabelaHash47.imprime();
        tabelaHash29.insere("", (java.lang.Object) tabelaHash47);
        tabelaHash19.insere("", (java.lang.Object) tabelaHash29);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1L);
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        tabelaHash29.insere("", (java.lang.Object) ' ');
        tabelaHash29.insere("hi!", (java.lang.Object) '4');
        tabelaHash29.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash29);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object obj43 = tabelaHash41.pesquisa("");
        java.lang.Object obj45 = tabelaHash41.pesquisa("hi!");
        tabelaHash41.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj50 = tabelaHash41.pesquisa("hi!");
        tabelaHash41.imprime();
        tabelaHash41.insere("hi!", (java.lang.Object) false);
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        java.lang.Object obj58 = tabelaHash56.pesquisa("");
        tabelaHash56.imprime();
        java.lang.Object obj61 = tabelaHash56.pesquisa("");
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        tabelaHash63.imprime();
        tabelaHash56.insere("", (java.lang.Object) tabelaHash63);
        tabelaHash56.imprime();
        tabelaHash41.insere("hi!", (java.lang.Object) tabelaHash56);
        tabelaHash56.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass71 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (-1.0d) + "'", obj50, (-1.0d));
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = null;
        tabelaHash0.insere("hi!", obj11);
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        java.lang.Object obj20 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj22 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '4' + "'", obj16, '4');
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '4' + "'", obj20, '4');
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) ' ');
        tabelaHash15.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj24 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        java.lang.Object obj28 = tabelaHash15.pesquisa("hi!");
        tabelaHash0.insere("", obj28);
        tabelaHash0.imprime();
        java.lang.Object obj32 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        tabelaHash34.insere("", (java.lang.Object) ' ');
        tabelaHash34.insere("hi!", (java.lang.Object) '4');
        tabelaHash34.retira("");
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        java.lang.Object obj47 = tabelaHash45.pesquisa("");
        tabelaHash45.imprime();
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        java.lang.Object obj52 = tabelaHash50.pesquisa("");
        tabelaHash50.imprime();
        java.lang.Object obj55 = tabelaHash50.pesquisa("");
        tabelaHash50.imprime();
        tabelaHash45.insere("hi!", (java.lang.Object) tabelaHash50);
        tabelaHash34.insere("hi!", (java.lang.Object) tabelaHash45);
        tabelaHash34.imprime();
        java.lang.Object obj61 = tabelaHash34.pesquisa("");
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        java.lang.Object obj65 = tabelaHash63.pesquisa("");
        tabelaHash63.imprime();
        java.lang.Object obj68 = tabelaHash63.pesquisa("");
        java.lang.Object obj70 = tabelaHash63.pesquisa("");
        tabelaHash63.imprime();
        ds.TabelaHash tabelaHash73 = new ds.TabelaHash();
        tabelaHash73.imprime();
        tabelaHash73.imprime();
        java.lang.Object obj77 = tabelaHash73.pesquisa("hi!");
        tabelaHash73.imprime();
        tabelaHash63.insere("", (java.lang.Object) tabelaHash73);
        ds.TabelaHash tabelaHash81 = new ds.TabelaHash();
        tabelaHash81.imprime();
        tabelaHash81.insere("hi!", (java.lang.Object) 1L);
        tabelaHash81.retira("hi!");
        ds.TabelaHash tabelaHash89 = new ds.TabelaHash();
        java.lang.Object obj91 = tabelaHash89.pesquisa("");
        tabelaHash89.imprime();
        tabelaHash89.imprime();
        tabelaHash81.insere("hi!", (java.lang.Object) tabelaHash89);
        tabelaHash81.imprime();
        tabelaHash81.imprime();
        tabelaHash63.insere("", (java.lang.Object) tabelaHash81);
        tabelaHash34.insere("hi!", (java.lang.Object) tabelaHash81);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash34);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '4' + "'", obj24, '4');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '4' + "'", obj28, '4');
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '4' + "'", obj32, '4');
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj91);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) ' ');
        tabelaHash12.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj21 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash12.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '4' + "'", obj21, '4');
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = tabelaHash16.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        java.lang.Object obj31 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash26);
        tabelaHash21.retira("hi!");
        java.lang.Object obj37 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj39 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj41 = tabelaHash21.pesquisa("");
        tabelaHash16.insere("", obj41);
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object obj46 = tabelaHash44.pesquisa("");
        tabelaHash44.imprime();
        java.lang.Object obj49 = tabelaHash44.pesquisa("");
        java.lang.Object obj51 = tabelaHash44.pesquisa("");
        tabelaHash44.imprime();
        java.lang.Object obj54 = tabelaHash44.pesquisa("");
        tabelaHash16.insere("", obj54);
        ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
        java.lang.Object obj59 = tabelaHash57.pesquisa("");
        tabelaHash57.imprime();
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        java.lang.Object obj64 = tabelaHash62.pesquisa("");
        tabelaHash62.imprime();
        java.lang.Object obj67 = tabelaHash62.pesquisa("");
        tabelaHash62.imprime();
        tabelaHash57.insere("hi!", (java.lang.Object) tabelaHash62);
        ds.TabelaHash tabelaHash71 = new ds.TabelaHash();
        java.lang.Object obj73 = tabelaHash71.pesquisa("");
        tabelaHash71.imprime();
        ds.TabelaHash tabelaHash76 = new ds.TabelaHash();
        tabelaHash76.imprime();
        tabelaHash76.imprime();
        tabelaHash76.imprime();
        tabelaHash76.imprime();
        tabelaHash71.insere("", (java.lang.Object) tabelaHash76);
        tabelaHash62.insere("", (java.lang.Object) tabelaHash76);
        tabelaHash16.insere("", (java.lang.Object) tabelaHash62);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj86 = tabelaHash16.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj86);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        java.lang.Object obj29 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash19.retira("hi!");
        java.lang.Object obj35 = tabelaHash19.pesquisa("hi!");
        java.lang.Object obj37 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = tabelaHash40.pesquisa("");
        tabelaHash40.imprime();
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        java.lang.Object obj47 = tabelaHash45.pesquisa("");
        tabelaHash45.imprime();
        java.lang.Object obj50 = tabelaHash45.pesquisa("");
        tabelaHash45.imprime();
        tabelaHash40.insere("hi!", (java.lang.Object) tabelaHash45);
        tabelaHash40.retira("hi!");
        java.lang.Object obj56 = tabelaHash40.pesquisa("hi!");
        java.lang.Object obj58 = tabelaHash40.pesquisa("hi!");
        tabelaHash40.imprime();
        java.lang.Object obj61 = tabelaHash40.pesquisa("");
        tabelaHash19.insere("", (java.lang.Object) tabelaHash40);
        ds.TabelaHash tabelaHash64 = new ds.TabelaHash();
        java.lang.Object obj66 = tabelaHash64.pesquisa("");
        tabelaHash64.imprime();
        java.lang.Object obj69 = tabelaHash64.pesquisa("");
        tabelaHash64.imprime();
        ds.TabelaHash tabelaHash72 = new ds.TabelaHash();
        java.lang.Object obj74 = tabelaHash72.pesquisa("");
        tabelaHash72.imprime();
        ds.TabelaHash tabelaHash77 = new ds.TabelaHash();
        java.lang.Object obj79 = tabelaHash77.pesquisa("");
        tabelaHash77.imprime();
        java.lang.Object obj82 = tabelaHash77.pesquisa("");
        tabelaHash77.imprime();
        tabelaHash72.insere("hi!", (java.lang.Object) tabelaHash77);
        tabelaHash72.retira("hi!");
        tabelaHash64.insere("hi!", (java.lang.Object) tabelaHash72);
        tabelaHash64.imprime();
        java.lang.Object obj90 = tabelaHash64.pesquisa("");
        tabelaHash40.insere("", obj90);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash40);
        java.lang.Object obj94 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) false);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        java.lang.Object obj20 = tabelaHash15.pesquisa("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        tabelaHash15.insere("", (java.lang.Object) tabelaHash22);
        tabelaHash15.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash15);
        java.lang.Object obj28 = tabelaHash15.pesquisa("");
        java.lang.Object obj30 = tabelaHash15.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash15.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        java.lang.Object obj31 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash26);
        tabelaHash21.retira("hi!");
        java.lang.Object obj37 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj39 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        java.lang.Object obj42 = tabelaHash21.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        java.lang.Object obj13 = tabelaHash8.pesquisa("");
        java.lang.Object obj15 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) ' ');
        tabelaHash18.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj27 = tabelaHash18.pesquisa("hi!");
        java.lang.Object obj29 = null;
        tabelaHash18.insere("hi!", obj29);
        tabelaHash18.retira("");
        java.lang.Object obj34 = tabelaHash18.pesquisa("hi!");
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash18);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.imprime();
        tabelaHash38.insere("hi!", (java.lang.Object) 1L);
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        java.lang.Object obj47 = tabelaHash38.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass49 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + '4' + "'", obj34, '4');
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 1L + "'", obj47, 1L);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash5.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Object obj27 = null;
        tabelaHash5.insere("", obj27);
        tabelaHash5.retira("");
        java.lang.Class<?> wildcardClass31 = tabelaHash5.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        java.lang.Object obj22 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash17);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        tabelaHash26.insere("", (java.lang.Object) ' ');
        tabelaHash26.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj35 = tabelaHash26.pesquisa("hi!");
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        tabelaHash17.insere("", obj35);
        java.lang.Class<?> wildcardClass38 = obj35.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass38);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '4' + "'", obj35, '4');
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test479");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        java.lang.Object obj22 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash17);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        tabelaHash26.insere("", (java.lang.Object) ' ');
        tabelaHash26.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj35 = tabelaHash26.pesquisa("hi!");
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        tabelaHash17.insere("", obj35);
        java.lang.Class<?> wildcardClass38 = obj35.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass38);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.imprime();
        tabelaHash43.insere("", (java.lang.Object) ' ');
        tabelaHash43.insere("hi!", (java.lang.Object) '4');
        tabelaHash43.retira("");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        java.lang.Object obj56 = tabelaHash54.pesquisa("");
        tabelaHash54.imprime();
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        java.lang.Object obj61 = tabelaHash59.pesquisa("");
        tabelaHash59.imprime();
        java.lang.Object obj64 = tabelaHash59.pesquisa("");
        tabelaHash59.imprime();
        tabelaHash54.insere("hi!", (java.lang.Object) tabelaHash59);
        tabelaHash43.insere("hi!", (java.lang.Object) tabelaHash54);
        tabelaHash43.imprime();
        ds.TabelaHash tabelaHash70 = new ds.TabelaHash();
        tabelaHash70.imprime();
        tabelaHash70.imprime();
        tabelaHash70.imprime();
        java.lang.Object obj75 = tabelaHash70.pesquisa("hi!");
        tabelaHash43.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '4' + "'", obj35, '4');
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj75);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test480");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("", (java.lang.Object) ' ');
        tabelaHash10.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj19 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj21 = null;
        tabelaHash10.insere("hi!", obj21);
        tabelaHash10.retira("");
        java.lang.Object obj26 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        java.lang.Class<?> wildcardClass31 = tabelaHash29.getClass();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash29);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + '4' + "'", obj19, '4');
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + '4' + "'", obj26, '4');
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test481");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = null;
        tabelaHash0.insere("hi!", obj11);
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        java.lang.Object obj20 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + '4' + "'", obj16, '4');
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + '4' + "'", obj20, '4');
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test482");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test483");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        java.lang.Object obj25 = tabelaHash14.pesquisa("");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("");
        tabelaHash27.imprime();
        java.lang.Object obj32 = tabelaHash27.pesquisa("");
        tabelaHash27.imprime();
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("");
        tabelaHash35.imprime();
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = tabelaHash40.pesquisa("");
        tabelaHash40.imprime();
        java.lang.Object obj45 = tabelaHash40.pesquisa("");
        tabelaHash40.imprime();
        tabelaHash35.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash35.retira("hi!");
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash35);
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        tabelaHash52.imprime();
        tabelaHash52.imprime();
        tabelaHash52.imprime();
        java.lang.Object obj57 = tabelaHash52.pesquisa("");
        tabelaHash35.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        tabelaHash60.imprime();
        tabelaHash60.insere("hi!", (java.lang.Object) 1L);
        tabelaHash60.imprime();
        tabelaHash60.imprime();
        tabelaHash60.retira("hi!");
        tabelaHash60.imprime();
        tabelaHash35.insere("", (java.lang.Object) tabelaHash60);
        tabelaHash14.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test484");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        java.lang.Object obj35 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash25.retira("hi!");
        java.lang.Object obj41 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash14.retira("");
        tabelaHash14.imprime();
        java.lang.Object obj48 = tabelaHash14.pesquisa("");
        java.lang.Class<?> wildcardClass49 = tabelaHash14.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test485");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) 1L);
        tabelaHash5.retira("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash13);
        java.lang.Object obj20 = tabelaHash5.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        java.lang.Object obj24 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "hi!" + "'", obj24, "hi!");
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test486");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) ' ');
        tabelaHash17.insere("hi!", (java.lang.Object) '4');
        tabelaHash17.imprime();
        tabelaHash10.insere("", (java.lang.Object) tabelaHash17);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test487");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test488");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        java.lang.Object obj28 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        java.lang.Object obj41 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash36);
        tabelaHash31.retira("hi!");
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash31);
        tabelaHash23.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) 100.0f);
        tabelaHash23.imprime();
        tabelaHash16.insere("", (java.lang.Object) tabelaHash23);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        java.lang.Object obj57 = tabelaHash55.pesquisa("");
        tabelaHash55.imprime();
        java.lang.Object obj60 = tabelaHash55.pesquisa("");
        tabelaHash55.imprime();
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        java.lang.Object obj65 = tabelaHash63.pesquisa("");
        tabelaHash63.imprime();
        ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
        java.lang.Object obj70 = tabelaHash68.pesquisa("");
        tabelaHash68.imprime();
        java.lang.Object obj73 = tabelaHash68.pesquisa("");
        tabelaHash68.imprime();
        tabelaHash63.insere("hi!", (java.lang.Object) tabelaHash68);
        tabelaHash63.retira("hi!");
        tabelaHash55.insere("hi!", (java.lang.Object) tabelaHash63);
        tabelaHash55.retira("hi!");
        tabelaHash55.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash55);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1L + "'", obj9, 1L);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test489");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        java.lang.Object obj29 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test490");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) ' ');
        tabelaHash7.insere("hi!", (java.lang.Object) '4');
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        java.lang.Object obj18 = tabelaHash7.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + '4' + "'", obj18, '4');
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test491");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash5.retira("hi!");
        java.lang.Object obj21 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash5.pesquisa("");
        tabelaHash0.insere("", obj25);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        java.lang.Object obj35 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        tabelaHash0.insere("", obj38);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.imprime();
        tabelaHash43.insere("", (java.lang.Object) ' ');
        tabelaHash43.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj52 = tabelaHash43.pesquisa("");
        tabelaHash43.imprime();
        tabelaHash43.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash43);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + ' ' + "'", obj52, ' ');
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test492");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash5.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        java.lang.Object obj29 = tabelaHash19.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash19.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test493");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        java.lang.Object obj14 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        java.lang.Object obj29 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash19.retira("hi!");
        java.lang.Object obj35 = tabelaHash19.pesquisa("hi!");
        java.lang.Object obj37 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.imprime();
        java.lang.Object obj40 = tabelaHash19.pesquisa("");
        java.lang.Object obj42 = tabelaHash19.pesquisa("hi!");
        java.lang.Object obj44 = tabelaHash19.pesquisa("");
        tabelaHash0.insere("", obj44);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test494");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        java.lang.Object obj22 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash17);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        tabelaHash26.insere("", (java.lang.Object) ' ');
        tabelaHash26.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj35 = tabelaHash26.pesquisa("hi!");
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        tabelaHash17.insere("", obj35);
        java.lang.Class<?> wildcardClass38 = obj35.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass38);
        java.lang.Object obj41 = null;
        tabelaHash0.insere("", obj41);
        java.lang.Object obj44 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '4' + "'", obj35, '4');
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + ' ' + "'", obj44, ' ');
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test495");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) ' ');
        tabelaHash9.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj20 = null;
        tabelaHash9.insere("hi!", obj20);
        java.lang.Class<?> wildcardClass22 = tabelaHash9.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass24 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + '4' + "'", obj18, '4');
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test496");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) ' ');
        tabelaHash7.insere("hi!", (java.lang.Object) '4');
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 10.0f);
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10.0f + "'", obj22, 10.0f);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test497");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test498");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) false);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test499");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        java.lang.Object obj20 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash28);
        tabelaHash23.retira("hi!");
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash23);
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        java.lang.Object obj45 = tabelaHash40.pesquisa("");
        tabelaHash23.insere("hi!", (java.lang.Object) "");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test500");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        java.lang.Object obj17 = tabelaHash12.pesquisa("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Class<?> wildcardClass22 = tabelaHash19.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass22);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass26 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }
}
