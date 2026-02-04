package ds.seed5831;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test501");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = null;
        tabelaHash0.insere("", obj5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash8.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object obj5 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash3);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash10.insere("hi!", (java.lang.Object) 1);
        tabelaHash10.imprime();
        java.lang.Object obj18 = tabelaHash10.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.insere("hi!", (java.lang.Object) 1);
        tabelaHash20.retira("hi!");
        tabelaHash20.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1 + "'", obj18, 1);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash11.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object obj23 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash11.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("");
        tabelaHash11.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("");
        tabelaHash18.imprime();
        java.lang.Object obj23 = tabelaHash18.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash18.pesquisa("");
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash18);
        java.lang.Object obj28 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash11.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 10.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash14);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1 + "'", obj24, 1);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1));
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass20 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1) + "'", obj12, (-1));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1) + "'", obj19, (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 1);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj23 = tabelaHash16.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        java.lang.Object obj28 = tabelaHash16.pesquisa("");
        java.lang.Object obj30 = tabelaHash16.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 10 + "'", obj26, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (byte) 10 + "'", obj28, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) 10 + "'", obj30, (byte) 10);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj10 = null;
        tabelaHash0.insere("hi!", obj10);
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = null;
        tabelaHash0.insere("hi!", obj4);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash9.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash9.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash12.imprime();
        java.lang.Object obj19 = tabelaHash12.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object obj5 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash3);
        tabelaHash0.imprime();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj19 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.retira("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash26);
        tabelaHash23.retira("");
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.imprime();
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object obj43 = tabelaHash41.pesquisa("hi!");
        tabelaHash41.imprime();
        tabelaHash38.insere("", (java.lang.Object) tabelaHash41);
        java.lang.Object obj47 = tabelaHash38.pesquisa("");
        java.lang.Object obj49 = tabelaHash38.pesquisa("hi!");
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.imprime();
        tabelaHash51.imprime();
        tabelaHash51.imprime();
        java.lang.Object obj56 = tabelaHash51.pesquisa("hi!");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        java.lang.Object obj60 = tabelaHash58.pesquisa("");
        tabelaHash58.imprime();
        java.lang.Object obj63 = tabelaHash58.pesquisa("hi!");
        java.lang.Class<?> wildcardClass64 = tabelaHash58.getClass();
        tabelaHash51.insere("", (java.lang.Object) tabelaHash58);
        tabelaHash51.imprime();
        tabelaHash38.insere("", (java.lang.Object) tabelaHash51);
        java.lang.Object obj69 = tabelaHash38.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash38);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 100L);
        tabelaHash0.retira("hi!");
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
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("hi!", (java.lang.Object) true);
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.imprime();
        java.lang.Object obj16 = null;
        tabelaHash13.insere("", obj16);
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        java.lang.Object obj26 = null;
        tabelaHash21.insere("", obj26);
        java.lang.Class<?> wildcardClass28 = tabelaHash21.getClass();
        tabelaHash13.insere("", (java.lang.Object) wildcardClass28);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("");
        tabelaHash31.insere("hi!", (java.lang.Object) 1);
        tabelaHash31.imprime();
        tabelaHash31.insere("", (java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass41 = tabelaHash31.getClass();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash31);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        java.lang.Object obj47 = tabelaHash45.pesquisa("");
        tabelaHash45.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        java.lang.Object obj54 = tabelaHash52.pesquisa("hi!");
        tabelaHash45.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj57 = tabelaHash45.pesquisa("hi!");
        tabelaHash45.retira("hi!");
        tabelaHash45.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash45);
        tabelaHash45.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash45.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1 + "'", obj10, 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + "hi!" + "'", obj57, "hi!");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 1);
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
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
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        java.lang.Class<?> wildcardClass18 = tabelaHash10.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        java.lang.Object obj21 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 10 + "'", obj7, (byte) 10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("hi!", (java.lang.Object) true);
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.imprime();
        java.lang.Object obj16 = null;
        tabelaHash13.insere("", obj16);
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        java.lang.Object obj26 = null;
        tabelaHash21.insere("", obj26);
        java.lang.Class<?> wildcardClass28 = tabelaHash21.getClass();
        tabelaHash13.insere("", (java.lang.Object) wildcardClass28);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("");
        tabelaHash31.insere("hi!", (java.lang.Object) 1);
        tabelaHash31.imprime();
        tabelaHash31.insere("", (java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass41 = tabelaHash31.getClass();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash31);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        java.lang.Object obj47 = tabelaHash45.pesquisa("");
        tabelaHash45.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        java.lang.Object obj54 = tabelaHash52.pesquisa("hi!");
        tabelaHash45.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj57 = tabelaHash45.pesquisa("hi!");
        tabelaHash45.retira("hi!");
        tabelaHash45.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash45);
        java.lang.Object obj64 = tabelaHash45.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1 + "'", obj10, 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + "hi!" + "'", obj57, "hi!");
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = null;
        tabelaHash0.insere("", obj5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash8.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("");
        tabelaHash18.imprime();
        java.lang.Object obj23 = tabelaHash18.pesquisa("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("");
        tabelaHash25.insere("hi!", (java.lang.Object) 1);
        tabelaHash25.insere("hi!", (java.lang.Object) true);
        tabelaHash18.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash18.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        java.lang.Object obj38 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object obj5 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash3);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash11.imprime();
        java.lang.Object obj21 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("");
        tabelaHash24.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        java.lang.Object obj36 = tabelaHash31.pesquisa("hi!");
        java.lang.Object obj38 = tabelaHash31.pesquisa("");
        tabelaHash24.insere("hi!", (java.lang.Object) tabelaHash31);
        tabelaHash31.imprime();
        tabelaHash31.insere("", (java.lang.Object) false);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        java.lang.Object obj48 = tabelaHash46.pesquisa("");
        tabelaHash46.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj53 = tabelaHash46.pesquisa("hi!");
        tabelaHash46.insere("hi!", (java.lang.Object) (byte) -1);
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        java.lang.Object obj60 = tabelaHash58.pesquisa("hi!");
        tabelaHash58.imprime();
        java.lang.Object obj63 = null;
        tabelaHash58.insere("", obj63);
        ds.TabelaHash tabelaHash66 = new ds.TabelaHash();
        java.lang.Object obj68 = tabelaHash66.pesquisa("hi!");
        java.lang.Object obj70 = tabelaHash66.pesquisa("");
        tabelaHash58.insere("", (java.lang.Object) tabelaHash66);
        tabelaHash58.retira("");
        tabelaHash46.insere("hi!", (java.lang.Object) tabelaHash58);
        java.lang.Class<?> wildcardClass75 = tabelaHash46.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass75);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("", obj3);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        java.lang.Object obj13 = null;
        tabelaHash8.insere("", obj13);
        java.lang.Class<?> wildcardClass15 = tabelaHash8.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass15);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("");
        tabelaHash18.insere("hi!", (java.lang.Object) 1);
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass28 = tabelaHash18.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 1);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) -1);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        java.lang.Object obj22 = null;
        tabelaHash19.insere("", obj22);
        java.lang.Object obj25 = tabelaHash19.pesquisa("hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash27);
        java.lang.Class<?> wildcardClass29 = tabelaHash27.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash27);
        tabelaHash0.retira("");
        java.lang.Object obj34 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object obj5 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash3);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object obj24 = tabelaHash22.pesquisa("");
        tabelaHash22.insere("hi!", (java.lang.Object) 1);
        tabelaHash14.insere("", (java.lang.Object) "hi!");
        tabelaHash14.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass34 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 10.0d);
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
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 10.0d);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj21 = tabelaHash14.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash14.pesquisa("");
        java.lang.Object obj27 = tabelaHash14.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj27);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object obj5 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash3);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("hi!");
        java.lang.Class<?> wildcardClass26 = tabelaHash20.getClass();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash20);
        tabelaHash13.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 100);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        java.lang.Object obj12 = tabelaHash7.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) 1);
        tabelaHash7.insere("hi!", (java.lang.Object) "");
        tabelaHash7.insere("hi!", (java.lang.Object) (byte) -1);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        java.lang.Object obj29 = null;
        tabelaHash26.insere("", obj29);
        java.lang.Object obj32 = tabelaHash26.pesquisa("hi!");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash26.insere("hi!", (java.lang.Object) tabelaHash34);
        java.lang.Class<?> wildcardClass36 = tabelaHash34.getClass();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash34);
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object obj41 = tabelaHash39.pesquisa("");
        tabelaHash39.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj46 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.insere("hi!", (java.lang.Object) (byte) -1);
        java.lang.Object obj51 = tabelaHash39.pesquisa("");
        java.lang.Object obj53 = new java.lang.Object();
        tabelaHash39.insere("", obj53);
        tabelaHash39.retira("");
        tabelaHash7.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        java.lang.Object obj61 = tabelaHash59.pesquisa("");
        tabelaHash59.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash66 = new ds.TabelaHash();
        java.lang.Object obj68 = tabelaHash66.pesquisa("hi!");
        tabelaHash59.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj71 = tabelaHash59.pesquisa("hi!");
        tabelaHash59.retira("hi!");
        tabelaHash7.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 100.0f + "'", obj51, 100.0f);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + "hi!" + "'", obj71, "hi!");
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) (byte) 10);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash22.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj29 = tabelaHash22.pesquisa("");
        java.lang.Object obj31 = tabelaHash22.pesquisa("");
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash22);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash22);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.imprime();
        java.lang.Object obj38 = null;
        tabelaHash35.insere("", obj38);
        tabelaHash35.retira("");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        java.lang.Object obj45 = tabelaHash43.pesquisa("hi!");
        tabelaHash43.imprime();
        java.lang.Object obj48 = null;
        tabelaHash43.insere("", obj48);
        java.lang.Class<?> wildcardClass50 = tabelaHash43.getClass();
        tabelaHash35.insere("", (java.lang.Object) wildcardClass50);
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        java.lang.Object obj55 = tabelaHash53.pesquisa("");
        tabelaHash53.insere("hi!", (java.lang.Object) 1);
        tabelaHash53.imprime();
        tabelaHash53.insere("", (java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass63 = tabelaHash53.getClass();
        tabelaHash35.insere("", (java.lang.Object) tabelaHash53);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash35);
        tabelaHash35.retira("");
        java.lang.Object obj69 = tabelaHash35.pesquisa("hi!");
        ds.TabelaHash tabelaHash71 = new ds.TabelaHash();
        java.lang.Object obj73 = tabelaHash71.pesquisa("");
        tabelaHash71.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash78 = new ds.TabelaHash();
        java.lang.Object obj80 = tabelaHash78.pesquisa("hi!");
        tabelaHash71.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj83 = tabelaHash71.pesquisa("");
        tabelaHash35.insere("", (java.lang.Object) tabelaHash71);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 10 + "'", obj29, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) 10 + "'", obj31, (byte) 10);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + 100.0f + "'", obj83, 100.0f);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("hi!", (java.lang.Object) true);
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = tabelaHash23.pesquisa("");
        tabelaHash23.insere("hi!", (java.lang.Object) 1);
        tabelaHash15.insere("", (java.lang.Object) "hi!");
        tabelaHash15.retira("");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash15.insere("", (java.lang.Object) tabelaHash33);
        java.lang.Object obj39 = tabelaHash15.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.imprime();
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        java.lang.Object obj47 = tabelaHash45.pesquisa("hi!");
        tabelaHash45.imprime();
        tabelaHash42.insere("", (java.lang.Object) tabelaHash45);
        java.lang.Object obj51 = tabelaHash42.pesquisa("");
        java.lang.Object obj53 = tabelaHash42.pesquisa("hi!");
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        tabelaHash55.imprime();
        tabelaHash55.imprime();
        tabelaHash55.imprime();
        java.lang.Object obj60 = tabelaHash55.pesquisa("hi!");
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        java.lang.Object obj64 = tabelaHash62.pesquisa("");
        tabelaHash62.imprime();
        java.lang.Object obj67 = tabelaHash62.pesquisa("hi!");
        java.lang.Class<?> wildcardClass68 = tabelaHash62.getClass();
        tabelaHash55.insere("", (java.lang.Object) tabelaHash62);
        tabelaHash55.imprime();
        tabelaHash42.insere("", (java.lang.Object) tabelaHash55);
        java.lang.Object obj73 = tabelaHash42.pesquisa("");
        tabelaHash0.insere("hi!", obj73);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1 + "'", obj10, 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(obj73);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("", obj3);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        java.lang.Object obj13 = null;
        tabelaHash8.insere("", obj13);
        java.lang.Class<?> wildcardClass15 = tabelaHash8.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass15);
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1));
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("", obj12);
        java.lang.Object obj15 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash17);
        java.lang.Object obj20 = tabelaHash9.pesquisa("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        java.lang.Object obj27 = tabelaHash22.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        java.lang.Object obj34 = tabelaHash29.pesquisa("hi!");
        java.lang.Class<?> wildcardClass35 = tabelaHash29.getClass();
        tabelaHash22.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash22);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("hi!", (java.lang.Object) true);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Object obj21 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        java.lang.Object obj24 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("");
        tabelaHash27.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        java.lang.Object obj39 = tabelaHash34.pesquisa("hi!");
        java.lang.Object obj41 = tabelaHash34.pesquisa("");
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash27.retira("hi!");
        java.lang.Object obj46 = tabelaHash27.pesquisa("hi!");
        java.lang.Object obj48 = tabelaHash27.pesquisa("hi!");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.imprime();
        java.lang.Object obj53 = null;
        tabelaHash50.insere("", obj53);
        tabelaHash50.retira("");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        java.lang.Object obj60 = tabelaHash58.pesquisa("hi!");
        tabelaHash58.imprime();
        java.lang.Object obj63 = null;
        tabelaHash58.insere("", obj63);
        java.lang.Class<?> wildcardClass65 = tabelaHash58.getClass();
        tabelaHash50.insere("", (java.lang.Object) wildcardClass65);
        ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
        java.lang.Object obj70 = tabelaHash68.pesquisa("");
        tabelaHash68.insere("hi!", (java.lang.Object) 1);
        tabelaHash68.imprime();
        tabelaHash68.insere("", (java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass78 = tabelaHash68.getClass();
        tabelaHash50.insere("", (java.lang.Object) tabelaHash68);
        tabelaHash27.insere("", (java.lang.Object) "");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash27);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = null;
        tabelaHash0.insere("", obj5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash8.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        java.lang.Object obj18 = null;
        tabelaHash15.insere("", obj18);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object obj24 = tabelaHash22.pesquisa("");
        tabelaHash22.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj29 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.insere("hi!", (java.lang.Object) (byte) -1);
        java.lang.Object obj34 = tabelaHash22.pesquisa("hi!");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.imprime();
        java.lang.Object obj41 = null;
        tabelaHash36.insere("", obj41);
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.imprime();
        tabelaHash36.insere("", (java.lang.Object) tabelaHash44);
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash22.insere("", (java.lang.Object) tabelaHash44);
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash44);
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        tabelaHash53.imprime();
        tabelaHash53.imprime();
        tabelaHash53.imprime();
        tabelaHash53.imprime();
        java.lang.Object obj59 = tabelaHash53.pesquisa("");
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        tabelaHash61.imprime();
        ds.TabelaHash tabelaHash64 = new ds.TabelaHash();
        java.lang.Object obj66 = tabelaHash64.pesquisa("hi!");
        tabelaHash64.imprime();
        tabelaHash61.insere("", (java.lang.Object) tabelaHash64);
        tabelaHash61.imprime();
        java.lang.Object obj71 = tabelaHash61.pesquisa("");
        java.lang.Class<?> wildcardClass72 = tabelaHash61.getClass();
        tabelaHash53.insere("", (java.lang.Object) wildcardClass72);
        tabelaHash44.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash76 = new ds.TabelaHash();
        java.lang.Object obj78 = tabelaHash76.pesquisa("hi!");
        tabelaHash76.imprime();
        tabelaHash76.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash84 = new ds.TabelaHash();
        java.lang.Object obj86 = tabelaHash84.pesquisa("");
        tabelaHash84.insere("hi!", (java.lang.Object) 1);
        tabelaHash76.insere("", (java.lang.Object) "hi!");
        tabelaHash76.retira("");
        tabelaHash76.imprime();
        tabelaHash76.imprime();
        tabelaHash76.imprime();
        java.lang.Object obj97 = tabelaHash76.pesquisa("");
        tabelaHash44.insere("", (java.lang.Object) "");
        tabelaHash44.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNull(obj97);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) -1);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = new java.lang.Object();
        tabelaHash0.insere("", obj14);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        java.lang.Object obj23 = tabelaHash17.pesquisa("");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash25.insere("", (java.lang.Object) tabelaHash28);
        tabelaHash25.imprime();
        java.lang.Object obj35 = tabelaHash25.pesquisa("");
        java.lang.Class<?> wildcardClass36 = tabelaHash25.getClass();
        tabelaHash17.insere("", (java.lang.Object) wildcardClass36);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass39 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = null;
        tabelaHash0.insere("", obj5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash8.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("");
        tabelaHash18.imprime();
        java.lang.Object obj23 = tabelaHash18.pesquisa("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("");
        tabelaHash25.insere("hi!", (java.lang.Object) 1);
        tabelaHash25.insere("hi!", (java.lang.Object) true);
        tabelaHash18.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash18.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass41 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        tabelaHash14.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj21 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("hi!", (java.lang.Object) (byte) -1);
        java.lang.Object obj26 = tabelaHash14.pesquisa("hi!");
        tabelaHash0.insere("", obj26);
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = null;
        tabelaHash0.insere("", obj5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        java.lang.Object obj18 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj20 = tabelaHash8.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash8.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object obj5 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash3);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash11.imprime();
        java.lang.Object obj21 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass30 = obj29.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object obj5 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash3);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash11.imprime();
        java.lang.Object obj21 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object obj5 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash3);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("hi!");
        java.lang.Class<?> wildcardClass26 = tabelaHash20.getClass();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash20);
        tabelaHash13.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        tabelaHash13.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object obj5 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash3);
        tabelaHash0.imprime();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj19 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.retira("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash26);
        tabelaHash23.retira("");
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("");
        tabelaHash11.insere("hi!", (java.lang.Object) 1);
        tabelaHash11.imprime();
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        tabelaHash11.insere("hi!", (java.lang.Object) 100L);
        tabelaHash0.insere("hi!", (java.lang.Object) 100L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.imprime();
        tabelaHash27.insere("", (java.lang.Object) tabelaHash30);
        java.lang.Object obj36 = tabelaHash27.pesquisa("");
        java.lang.Object obj38 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash27);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1));
        tabelaHash0.retira("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash17.insere("", (java.lang.Object) tabelaHash20);
        tabelaHash17.imprime();
        java.lang.Object obj27 = tabelaHash17.pesquisa("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("");
        tabelaHash29.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj36 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.retira("");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        java.lang.Object obj45 = tabelaHash43.pesquisa("hi!");
        tabelaHash43.imprime();
        tabelaHash40.insere("", (java.lang.Object) tabelaHash43);
        tabelaHash40.retira("");
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash40);
        java.lang.Object obj53 = tabelaHash17.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass55 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("hi!");
        java.lang.Class<?> wildcardClass26 = tabelaHash20.getClass();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("");
        tabelaHash30.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object obj39 = tabelaHash37.pesquisa("hi!");
        tabelaHash30.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj42 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.retira("hi!");
        java.lang.Class<?> wildcardClass45 = tabelaHash30.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass45);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "hi!" + "'", obj42, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = tabelaHash21.pesquisa("");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.insere("hi!", (java.lang.Object) 1);
        tabelaHash26.imprime();
        tabelaHash26.insere("", (java.lang.Object) (-1));
        tabelaHash21.insere("", (java.lang.Object) (-1));
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.imprime();
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object obj43 = tabelaHash41.pesquisa("hi!");
        tabelaHash41.imprime();
        tabelaHash38.insere("", (java.lang.Object) tabelaHash41);
        java.lang.Object obj47 = tabelaHash38.pesquisa("");
        java.lang.Object obj49 = tabelaHash38.pesquisa("hi!");
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.imprime();
        tabelaHash51.imprime();
        tabelaHash51.imprime();
        java.lang.Object obj56 = tabelaHash51.pesquisa("hi!");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        java.lang.Object obj60 = tabelaHash58.pesquisa("");
        tabelaHash58.imprime();
        java.lang.Object obj63 = tabelaHash58.pesquisa("hi!");
        java.lang.Class<?> wildcardClass64 = tabelaHash58.getClass();
        tabelaHash51.insere("", (java.lang.Object) tabelaHash58);
        tabelaHash51.imprime();
        tabelaHash38.insere("", (java.lang.Object) tabelaHash51);
        tabelaHash21.insere("", (java.lang.Object) tabelaHash51);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash51);
        ds.TabelaHash tabelaHash71 = new ds.TabelaHash();
        java.lang.Object obj73 = tabelaHash71.pesquisa("");
        tabelaHash71.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash78 = new ds.TabelaHash();
        java.lang.Object obj80 = tabelaHash78.pesquisa("hi!");
        tabelaHash71.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj83 = tabelaHash71.pesquisa("hi!");
        tabelaHash71.imprime();
        tabelaHash51.insere("", (java.lang.Object) tabelaHash71);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + "hi!" + "'", obj83, "hi!");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10L);
        tabelaHash0.retira("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10L + "'", obj13, 10L);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash14);
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        java.lang.Object obj22 = tabelaHash11.pesquisa("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.imprime();
        tabelaHash24.imprime();
        tabelaHash24.imprime();
        java.lang.Object obj29 = tabelaHash24.pesquisa("hi!");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        java.lang.Object obj36 = tabelaHash31.pesquisa("hi!");
        java.lang.Class<?> wildcardClass37 = tabelaHash31.getClass();
        tabelaHash24.insere("", (java.lang.Object) tabelaHash31);
        tabelaHash24.imprime();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash24);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.imprime();
        tabelaHash24.insere("hi!", (java.lang.Object) tabelaHash42);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash42);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = null;
        tabelaHash0.insere("", obj5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash8.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        java.lang.Object obj18 = null;
        tabelaHash15.insere("", obj18);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Object obj22 = tabelaHash15.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash15.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) -1);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = new java.lang.Object();
        tabelaHash0.insere("", obj14);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        java.lang.Object obj23 = tabelaHash17.pesquisa("");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash25.insere("", (java.lang.Object) tabelaHash28);
        tabelaHash25.imprime();
        java.lang.Object obj35 = tabelaHash25.pesquisa("");
        java.lang.Class<?> wildcardClass36 = tabelaHash25.getClass();
        tabelaHash17.insere("", (java.lang.Object) wildcardClass36);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object obj40 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) -1 + "'", obj40, (byte) -1);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = null;
        tabelaHash0.insere("", obj5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash8.imprime();
        java.lang.Object obj13 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash8.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0f + "'", obj16, 100.0f);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object obj5 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash3);
        tabelaHash3.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash3.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("");
        tabelaHash12.insere("hi!", (java.lang.Object) 1);
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) 10.0d);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash26);
        java.lang.Object obj32 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash23);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object obj41 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.imprime();
        tabelaHash36.insere("", (java.lang.Object) tabelaHash39);
        tabelaHash36.retira("");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.imprime();
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        java.lang.Object obj52 = tabelaHash50.pesquisa("hi!");
        tabelaHash50.imprime();
        tabelaHash47.insere("", (java.lang.Object) tabelaHash50);
        tabelaHash47.imprime();
        java.lang.Object obj57 = tabelaHash47.pesquisa("");
        tabelaHash36.insere("hi!", (java.lang.Object) "");
        tabelaHash36.retira("hi!");
        tabelaHash36.imprime();
        tabelaHash36.imprime();
        java.lang.Class<?> wildcardClass63 = tabelaHash36.getClass();
        tabelaHash23.insere("hi!", (java.lang.Object) wildcardClass63);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash23);
        ds.TabelaHash tabelaHash67 = new ds.TabelaHash();
        tabelaHash67.imprime();
        ds.TabelaHash tabelaHash70 = new ds.TabelaHash();
        java.lang.Object obj72 = tabelaHash70.pesquisa("hi!");
        tabelaHash70.imprime();
        tabelaHash67.insere("", (java.lang.Object) tabelaHash70);
        tabelaHash67.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj79 = tabelaHash67.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(obj79);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = null;
        tabelaHash0.insere("", obj5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash8.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.insere("hi!", (java.lang.Object) 1);
        tabelaHash20.insere("hi!", (java.lang.Object) true);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        tabelaHash20.insere("", (java.lang.Object) tabelaHash30);
        java.lang.Class<?> wildcardClass36 = tabelaHash20.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass36);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = null;
        tabelaHash0.insere("", obj5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash8.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("");
        tabelaHash7.imprime();
        java.lang.Object obj12 = tabelaHash7.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash7.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) false);
        java.lang.Object obj21 = tabelaHash7.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 1);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) 1);
        java.lang.Object obj28 = tabelaHash20.pesquisa("hi!");
        java.lang.Object obj30 = tabelaHash20.pesquisa("");
        tabelaHash0.insere("hi!", obj30);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1 + "'", obj30, 1);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = null;
        tabelaHash0.insere("", obj5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash8.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj15 = null;
        tabelaHash8.insere("", obj15);
        tabelaHash8.retira("");
        java.lang.Class<?> wildcardClass19 = tabelaHash8.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) (byte) 100);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        java.lang.Object obj31 = null;
        tabelaHash26.insere("", obj31);
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("hi!");
        java.lang.Object obj38 = tabelaHash34.pesquisa("");
        tabelaHash26.insere("", (java.lang.Object) tabelaHash34);
        tabelaHash34.insere("", (java.lang.Object) 1);
        java.lang.Object obj44 = tabelaHash34.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash34);
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object obj49 = tabelaHash47.pesquisa("hi!");
        tabelaHash47.imprime();
        java.lang.Object obj52 = tabelaHash47.pesquisa("hi!");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        java.lang.Object obj56 = tabelaHash54.pesquisa("hi!");
        tabelaHash54.imprime();
        tabelaHash54.insere("", (java.lang.Object) 1);
        tabelaHash47.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        tabelaHash63.imprime();
        tabelaHash63.imprime();
        tabelaHash63.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj70 = tabelaHash63.pesquisa("hi!");
        tabelaHash47.insere("hi!", (java.lang.Object) tabelaHash63);
        java.lang.Class<?> wildcardClass72 = tabelaHash47.getClass();
        tabelaHash34.insere("hi!", (java.lang.Object) tabelaHash47);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 1 + "'", obj44, 1);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass19 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
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
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        java.lang.Class<?> wildcardClass14 = tabelaHash9.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass14);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash17.insere("", (java.lang.Object) tabelaHash20);
        tabelaHash17.retira("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.imprime();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash31);
        tabelaHash28.imprime();
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        tabelaHash17.insere("hi!", (java.lang.Object) "");
        tabelaHash17.retira("hi!");
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        java.lang.Object obj46 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "class ds.TabelaHash");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = null;
        tabelaHash0.insere("", obj5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash8.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.insere("hi!", (java.lang.Object) 1);
        tabelaHash20.insere("", (java.lang.Object) "hi!");
        tabelaHash20.retira("");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        tabelaHash20.insere("", (java.lang.Object) tabelaHash38);
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash44.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj51 = tabelaHash44.pesquisa("");
        tabelaHash38.insere("", obj51);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash38);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        tabelaHash56.imprime();
        tabelaHash56.imprime();
        tabelaHash56.insere("", (java.lang.Object) (byte) 10);
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        tabelaHash63.imprime();
        tabelaHash63.imprime();
        tabelaHash63.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj70 = tabelaHash63.pesquisa("");
        java.lang.Object obj72 = tabelaHash63.pesquisa("");
        tabelaHash56.insere("hi!", (java.lang.Object) tabelaHash63);
        tabelaHash56.imprime();
        java.lang.Object obj76 = tabelaHash56.pesquisa("hi!");
        java.lang.Object obj78 = tabelaHash56.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash56);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) 10 + "'", obj51, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + (byte) 10 + "'", obj70, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + (byte) 10 + "'", obj72, (byte) 10);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertNotNull(obj78);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object obj5 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash3);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("hi!");
        java.lang.Class<?> wildcardClass26 = tabelaHash20.getClass();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash20);
        tabelaHash13.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.imprime();
        tabelaHash31.insere("", (java.lang.Object) tabelaHash34);
        java.lang.Object obj40 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        java.lang.Object obj43 = tabelaHash31.pesquisa("");
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        java.lang.Object obj47 = tabelaHash45.pesquisa("hi!");
        tabelaHash45.imprime();
        tabelaHash45.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        java.lang.Object obj55 = tabelaHash53.pesquisa("");
        tabelaHash53.insere("hi!", (java.lang.Object) 1);
        tabelaHash45.insere("", (java.lang.Object) "hi!");
        tabelaHash45.retira("");
        tabelaHash31.insere("hi!", (java.lang.Object) "");
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object obj65 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass67 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 1);
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("");
        tabelaHash18.insere("hi!", (java.lang.Object) 1);
        tabelaHash18.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) 10.0d);
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash29.insere("", (java.lang.Object) tabelaHash32);
        java.lang.Object obj38 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash29);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.imprime();
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        java.lang.Object obj47 = tabelaHash45.pesquisa("hi!");
        tabelaHash45.imprime();
        tabelaHash42.insere("", (java.lang.Object) tabelaHash45);
        tabelaHash42.retira("");
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        tabelaHash53.imprime();
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        java.lang.Object obj58 = tabelaHash56.pesquisa("hi!");
        tabelaHash56.imprime();
        tabelaHash53.insere("", (java.lang.Object) tabelaHash56);
        tabelaHash53.imprime();
        java.lang.Object obj63 = tabelaHash53.pesquisa("");
        tabelaHash42.insere("hi!", (java.lang.Object) "");
        tabelaHash42.retira("hi!");
        tabelaHash42.imprime();
        tabelaHash42.imprime();
        java.lang.Class<?> wildcardClass69 = tabelaHash42.getClass();
        tabelaHash29.insere("hi!", (java.lang.Object) wildcardClass69);
        tabelaHash0.insere("", (java.lang.Object) wildcardClass69);
        java.lang.Object obj73 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10.0d + "'", obj16, 10.0d);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 1 + "'", obj73, 1);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object obj5 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash3);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash11.imprime();
        java.lang.Object obj21 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        java.lang.Class<?> wildcardClass31 = tabelaHash26.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass31);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("hi!");
        java.lang.Object obj39 = tabelaHash35.pesquisa("");
        tabelaHash35.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object obj46 = tabelaHash44.pesquisa("");
        tabelaHash44.insere("hi!", (java.lang.Object) 1);
        tabelaHash44.imprime();
        tabelaHash44.insere("hi!", (java.lang.Object) 10.0d);
        tabelaHash44.imprime();
        tabelaHash35.insere("", (java.lang.Object) tabelaHash44);
        tabelaHash35.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash35);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.insere("hi!", (java.lang.Object) 1);
        tabelaHash9.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) 10.0d);
        tabelaHash9.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = tabelaHash23.pesquisa("");
        tabelaHash23.insere("hi!", (java.lang.Object) 1);
        tabelaHash23.insere("hi!", (java.lang.Object) true);
        java.lang.Object obj33 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        java.lang.Object obj39 = null;
        tabelaHash36.insere("", obj39);
        tabelaHash36.retira("");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object obj46 = tabelaHash44.pesquisa("hi!");
        tabelaHash44.imprime();
        java.lang.Object obj49 = null;
        tabelaHash44.insere("", obj49);
        java.lang.Class<?> wildcardClass51 = tabelaHash44.getClass();
        tabelaHash36.insere("", (java.lang.Object) wildcardClass51);
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        java.lang.Object obj56 = tabelaHash54.pesquisa("");
        tabelaHash54.insere("hi!", (java.lang.Object) 1);
        tabelaHash54.imprime();
        tabelaHash54.insere("", (java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass64 = tabelaHash54.getClass();
        tabelaHash36.insere("", (java.lang.Object) tabelaHash54);
        tabelaHash23.insere("hi!", (java.lang.Object) "");
        tabelaHash23.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash23.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 1 + "'", obj33, 1);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash8.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash8.retira("");
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 100);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object obj5 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash3);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        java.lang.Object obj26 = tabelaHash21.pesquisa("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) 1);
        tabelaHash21.insere("hi!", (java.lang.Object) "");
        tabelaHash21.retira("hi!");
        java.lang.Class<?> wildcardClass38 = tabelaHash21.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        java.lang.Object obj41 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10.0d + "'", obj7, 10.0d);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash10.insere("hi!", (java.lang.Object) 1);
        tabelaHash10.retira("hi!");
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) -1);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = new java.lang.Object();
        tabelaHash0.insere("", obj14);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj25 = tabelaHash17.pesquisa("");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("");
        tabelaHash27.imprime();
        java.lang.Object obj32 = tabelaHash27.pesquisa("hi!");
        java.lang.Class<?> wildcardClass33 = tabelaHash27.getClass();
        tabelaHash17.insere("", (java.lang.Object) wildcardClass33);
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass33);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) 1 + "'", obj25, (short) 1);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("");
        tabelaHash11.insere("hi!", (java.lang.Object) 1);
        tabelaHash11.imprime();
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        tabelaHash11.insere("hi!", (java.lang.Object) 100L);
        tabelaHash0.insere("hi!", (java.lang.Object) 100L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = null;
        tabelaHash0.insere("", obj5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        java.lang.Object obj14 = tabelaHash8.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 1);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj23 = tabelaHash16.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        tabelaHash26.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        java.lang.Object obj43 = null;
        tabelaHash38.insere("", obj43);
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        java.lang.Object obj48 = tabelaHash46.pesquisa("hi!");
        java.lang.Object obj50 = tabelaHash46.pesquisa("");
        tabelaHash38.insere("", (java.lang.Object) tabelaHash46);
        java.lang.Object obj53 = null;
        tabelaHash46.insere("", obj53);
        tabelaHash26.insere("hi!", (java.lang.Object) "");
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash26);
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.imprime();
        tabelaHash58.imprime();
        tabelaHash16.insere("", (java.lang.Object) tabelaHash58);
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        tabelaHash63.imprime();
        tabelaHash63.imprime();
        tabelaHash63.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj70 = tabelaHash63.pesquisa("");
        ds.TabelaHash tabelaHash72 = new ds.TabelaHash();
        java.lang.Object obj74 = tabelaHash72.pesquisa("hi!");
        tabelaHash72.imprime();
        tabelaHash72.imprime();
        tabelaHash63.insere("hi!", (java.lang.Object) tabelaHash72);
        java.lang.Object obj79 = null;
        tabelaHash72.insere("", obj79);
        java.lang.Class<?> wildcardClass81 = tabelaHash72.getClass();
        tabelaHash58.insere("hi!", (java.lang.Object) wildcardClass81);
        tabelaHash58.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + (byte) 10 + "'", obj70, (byte) 10);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object obj5 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash3);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object obj5 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash3);
        tabelaHash0.imprime();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj19 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.retira("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash26);
        tabelaHash23.retira("");
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        java.lang.Object obj36 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("");
        tabelaHash38.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj45 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.insere("hi!", (java.lang.Object) (byte) -1);
        java.lang.Object obj50 = tabelaHash38.pesquisa("");
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        tabelaHash0.insere("", obj50);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 100.0f + "'", obj50, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Ignore
    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 10 + "'", obj7, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 10 + "'", obj9, (byte) 10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        tabelaHash5.insere("hi!", (java.lang.Object) 1);
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) (-1));
        tabelaHash0.insere("", (java.lang.Object) (-1));
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash17.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object obj26 = tabelaHash17.pesquisa("");
        java.lang.Object obj28 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object obj39 = tabelaHash37.pesquisa("");
        tabelaHash37.imprime();
        java.lang.Object obj42 = tabelaHash37.pesquisa("hi!");
        java.lang.Class<?> wildcardClass43 = tabelaHash37.getClass();
        tabelaHash30.insere("", (java.lang.Object) tabelaHash37);
        tabelaHash30.imprime();
        tabelaHash17.insere("", (java.lang.Object) tabelaHash30);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash30);
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        java.lang.Object obj51 = tabelaHash49.pesquisa("");
        tabelaHash49.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        java.lang.Object obj58 = tabelaHash56.pesquisa("");
        tabelaHash56.imprime();
        java.lang.Object obj61 = tabelaHash56.pesquisa("hi!");
        java.lang.Object obj63 = tabelaHash56.pesquisa("");
        tabelaHash49.insere("hi!", (java.lang.Object) tabelaHash56);
        java.lang.Object obj66 = tabelaHash49.pesquisa("");
        tabelaHash30.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash69 = new ds.TabelaHash();
        tabelaHash69.imprime();
        tabelaHash69.imprime();
        tabelaHash69.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj76 = tabelaHash69.pesquisa("");
        ds.TabelaHash tabelaHash78 = new ds.TabelaHash();
        java.lang.Object obj80 = tabelaHash78.pesquisa("hi!");
        tabelaHash78.imprime();
        tabelaHash78.imprime();
        tabelaHash69.insere("hi!", (java.lang.Object) tabelaHash78);
        java.lang.Object obj85 = null;
        tabelaHash78.insere("", obj85);
        java.lang.Class<?> wildcardClass87 = tabelaHash78.getClass();
        tabelaHash30.insere("hi!", (java.lang.Object) tabelaHash78);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + (byte) 10 + "'", obj76, (byte) 10);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 1);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) -1);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        java.lang.Object obj22 = null;
        tabelaHash19.insere("", obj22);
        java.lang.Object obj25 = tabelaHash19.pesquisa("hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash27);
        java.lang.Class<?> wildcardClass29 = tabelaHash27.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash27);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("");
        tabelaHash32.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj39 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.insere("hi!", (java.lang.Object) (byte) -1);
        java.lang.Object obj44 = tabelaHash32.pesquisa("");
        java.lang.Object obj46 = new java.lang.Object();
        tabelaHash32.insere("", obj46);
        tabelaHash32.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        java.lang.Object obj54 = tabelaHash52.pesquisa("");
        tabelaHash52.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        java.lang.Object obj61 = tabelaHash59.pesquisa("hi!");
        tabelaHash52.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj64 = tabelaHash52.pesquisa("hi!");
        tabelaHash52.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj69 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 100.0f + "'", obj44, 100.0f);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + "hi!" + "'", obj64, "hi!");
        org.junit.Assert.assertNotNull(obj69);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        java.lang.Object obj16 = null;
        tabelaHash9.insere("", obj16);
        java.lang.Object obj19 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = null;
        tabelaHash21.insere("", obj24);
        java.lang.Object obj27 = tabelaHash21.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash29);
        java.lang.Object obj32 = tabelaHash21.pesquisa("");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        java.lang.Object obj39 = tabelaHash34.pesquisa("hi!");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object obj43 = tabelaHash41.pesquisa("");
        tabelaHash41.imprime();
        java.lang.Object obj46 = tabelaHash41.pesquisa("hi!");
        java.lang.Class<?> wildcardClass47 = tabelaHash41.getClass();
        tabelaHash34.insere("", (java.lang.Object) tabelaHash41);
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash34);
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        java.lang.Object obj53 = tabelaHash51.pesquisa("");
        tabelaHash51.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        java.lang.Object obj60 = tabelaHash58.pesquisa("hi!");
        tabelaHash51.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj63 = tabelaHash51.pesquisa("hi!");
        tabelaHash51.retira("hi!");
        java.lang.Class<?> wildcardClass66 = tabelaHash51.getClass();
        tabelaHash21.insere("", (java.lang.Object) wildcardClass66);
        tabelaHash9.insere("", (java.lang.Object) wildcardClass66);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 10 + "'", obj7, (byte) 10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + "hi!" + "'", obj63, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj26 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("hi!", (java.lang.Object) true);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Object obj21 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        java.lang.Object obj24 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass28 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 1);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj23 = tabelaHash16.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash16.imprime();
        java.lang.Object obj27 = null;
        tabelaHash16.insere("hi!", obj27);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.imprime();
        tabelaHash30.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("");
        tabelaHash38.insere("hi!", (java.lang.Object) 1);
        tabelaHash30.insere("", (java.lang.Object) "hi!");
        tabelaHash30.retira("");
        tabelaHash30.imprime();
        java.lang.Object obj49 = tabelaHash30.pesquisa("");
        tabelaHash30.insere("", (java.lang.Object) (byte) 100);
        java.lang.Object obj54 = tabelaHash30.pesquisa("hi!");
        tabelaHash16.insere("", obj54);
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0f));
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        java.lang.Object obj62 = tabelaHash60.pesquisa("hi!");
        tabelaHash60.imprime();
        tabelaHash60.insere("", (java.lang.Object) 1);
        java.lang.Class<?> wildcardClass67 = tabelaHash60.getClass();
        tabelaHash16.insere("hi!", (java.lang.Object) wildcardClass67);
        java.lang.Object obj70 = tabelaHash16.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + (byte) 10 + "'", obj70, (byte) 10);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object obj5 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash3);
        tabelaHash3.imprime();
        java.lang.Object obj10 = tabelaHash3.pesquisa("hi!");
        java.lang.Class<?> wildcardClass11 = tabelaHash3.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.imprime();
        tabelaHash24.imprime();
        tabelaHash24.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj31 = tabelaHash24.pesquisa("");
        tabelaHash18.insere("", obj31);
        java.lang.Object obj34 = tabelaHash18.pesquisa("hi!");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = tabelaHash36.pesquisa("");
        tabelaHash36.insere("hi!", (java.lang.Object) 1);
        tabelaHash36.insere("hi!", (java.lang.Object) true);
        java.lang.Object obj46 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.imprime();
        tabelaHash36.retira("hi!");
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        java.lang.Object obj53 = tabelaHash51.pesquisa("hi!");
        tabelaHash51.imprime();
        java.lang.Object obj56 = null;
        tabelaHash51.insere("", obj56);
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        java.lang.Object obj61 = tabelaHash59.pesquisa("hi!");
        java.lang.Object obj63 = tabelaHash59.pesquisa("");
        tabelaHash51.insere("", (java.lang.Object) tabelaHash59);
        tabelaHash51.retira("");
        tabelaHash51.imprime();
        ds.TabelaHash tabelaHash69 = new ds.TabelaHash();
        java.lang.Object obj71 = tabelaHash69.pesquisa("");
        tabelaHash69.imprime();
        java.lang.Object obj74 = tabelaHash69.pesquisa("hi!");
        ds.TabelaHash tabelaHash76 = new ds.TabelaHash();
        java.lang.Object obj78 = tabelaHash76.pesquisa("");
        tabelaHash76.insere("hi!", (java.lang.Object) 1);
        tabelaHash76.insere("hi!", (java.lang.Object) true);
        tabelaHash69.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash69.imprime();
        tabelaHash51.insere("hi!", (java.lang.Object) tabelaHash69);
        tabelaHash51.retira("");
        tabelaHash51.retira("hi!");
        tabelaHash36.insere("hi!", (java.lang.Object) tabelaHash51);
        tabelaHash18.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) 10 + "'", obj31, (byte) 10);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 1 + "'", obj46, 1);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj78);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("hi!");
        java.lang.Class<?> wildcardClass26 = tabelaHash20.getClass();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash13.retira("");
        java.lang.Object obj32 = tabelaHash13.pesquisa("hi!");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.imprime();
        java.lang.Object obj39 = tabelaHash34.pesquisa("hi!");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object obj43 = tabelaHash41.pesquisa("hi!");
        tabelaHash41.imprime();
        tabelaHash41.insere("", (java.lang.Object) 1);
        tabelaHash34.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        tabelaHash50.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj57 = tabelaHash50.pesquisa("hi!");
        tabelaHash34.insere("hi!", (java.lang.Object) tabelaHash50);
        tabelaHash50.imprime();
        java.lang.Object obj61 = null;
        tabelaHash50.insere("hi!", obj61);
        tabelaHash13.insere("", obj61);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object obj5 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash3);
        tabelaHash0.imprime();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj19 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.retira("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash26);
        tabelaHash23.retira("");
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object obj41 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.imprime();
        tabelaHash36.insere("", (java.lang.Object) tabelaHash39);
        java.lang.Object obj45 = tabelaHash36.pesquisa("");
        java.lang.Object obj47 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.imprime();
        java.lang.Object obj50 = tabelaHash36.pesquisa("");
        tabelaHash0.insere("", obj50);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(obj50);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass20 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 10 + "'", obj7, (byte) 10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = null;
        tabelaHash0.insere("", obj5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        java.lang.Object obj15 = null;
        tabelaHash12.insere("", obj15);
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash20);
        java.lang.Object obj23 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        tabelaHash26.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj38 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "hi!" + "'", obj38, "hi!");
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1));
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) 1);
        java.lang.Object obj20 = tabelaHash12.pesquisa("hi!");
        tabelaHash0.insere("", obj20);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1));
        tabelaHash0.retira("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) (byte) 100);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        java.lang.Object obj31 = null;
        tabelaHash26.insere("", obj31);
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("hi!");
        java.lang.Object obj38 = tabelaHash34.pesquisa("");
        tabelaHash26.insere("", (java.lang.Object) tabelaHash34);
        tabelaHash34.insere("", (java.lang.Object) 1);
        java.lang.Object obj44 = tabelaHash34.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash34);
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object obj49 = tabelaHash47.pesquisa("hi!");
        tabelaHash47.imprime();
        java.lang.Object obj52 = tabelaHash47.pesquisa("hi!");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        java.lang.Object obj56 = tabelaHash54.pesquisa("hi!");
        tabelaHash54.imprime();
        tabelaHash54.insere("", (java.lang.Object) 1);
        tabelaHash47.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        tabelaHash63.imprime();
        tabelaHash63.imprime();
        tabelaHash63.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj70 = tabelaHash63.pesquisa("hi!");
        tabelaHash47.insere("hi!", (java.lang.Object) tabelaHash63);
        tabelaHash63.imprime();
        java.lang.Object obj74 = tabelaHash63.pesquisa("");
        tabelaHash63.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash63);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 1 + "'", obj44, 1);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + (byte) 10 + "'", obj74, (byte) 10);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = null;
        tabelaHash0.insere("", obj5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash8.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        java.lang.Object obj18 = null;
        tabelaHash15.insere("", obj18);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Object obj22 = tabelaHash15.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash15.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Object obj21 = tabelaHash12.pesquisa("");
        java.lang.Object obj23 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass27 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        java.lang.Object obj13 = null;
        tabelaHash8.insere("", obj13);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("hi!");
        java.lang.Object obj20 = tabelaHash16.pesquisa("");
        tabelaHash8.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash8.retira("");
        tabelaHash8.imprime();
        tabelaHash8.retira("");
        java.lang.Class<?> wildcardClass27 = tabelaHash8.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        java.lang.Class<?> wildcardClass29 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Ignore
    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("");
        tabelaHash11.insere("hi!", (java.lang.Object) 1);
        tabelaHash11.imprime();
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        tabelaHash11.insere("hi!", (java.lang.Object) 100L);
        tabelaHash0.insere("hi!", (java.lang.Object) 100L);
        tabelaHash0.retira("hi!");
        java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = null;
        tabelaHash0.insere("", obj5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        java.lang.Object obj15 = null;
        tabelaHash12.insere("", obj15);
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash20);
        java.lang.Object obj23 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        java.lang.Object obj29 = null;
        tabelaHash26.insere("", obj29);
        java.lang.Object obj32 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.insere("", (java.lang.Object) 10L);
        tabelaHash26.retira("");
        java.lang.Object obj39 = tabelaHash26.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object obj42 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 10L + "'", obj39, 10L);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "" + "'", obj42, "");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1));
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) (byte) 10);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj25 = tabelaHash18.pesquisa("");
        java.lang.Object obj27 = tabelaHash18.pesquisa("");
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash18);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        java.lang.Class<?> wildcardClass30 = tabelaHash18.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 10 + "'", obj25, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 10 + "'", obj27, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("", obj3);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        java.lang.Object obj13 = null;
        tabelaHash8.insere("", obj13);
        java.lang.Class<?> wildcardClass15 = tabelaHash8.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass15);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("");
        tabelaHash18.insere("hi!", (java.lang.Object) 1);
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass28 = tabelaHash18.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        tabelaHash0.imprime();
        java.lang.Object obj32 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object obj5 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash3);
        tabelaHash0.imprime();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj19 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.retira("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash26);
        tabelaHash23.retira("");
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash0.retira("");
        java.lang.Object obj38 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) 100);
        java.lang.Object obj21 = tabelaHash14.pesquisa("hi!");
        tabelaHash0.insere("", obj21);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) -1);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) 100);
        tabelaHash14.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0f + "'", obj12, 100.0f);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = null;
        tabelaHash0.insere("", obj5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash8.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        java.lang.Object obj18 = null;
        tabelaHash15.insere("", obj18);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object obj24 = tabelaHash22.pesquisa("");
        tabelaHash22.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj29 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.insere("hi!", (java.lang.Object) (byte) -1);
        java.lang.Object obj34 = tabelaHash22.pesquisa("hi!");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.imprime();
        java.lang.Object obj41 = null;
        tabelaHash36.insere("", obj41);
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.imprime();
        tabelaHash36.insere("", (java.lang.Object) tabelaHash44);
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash22.insere("", (java.lang.Object) tabelaHash44);
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash44);
        java.lang.Object obj53 = tabelaHash15.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) -1 + "'", obj34, (byte) -1);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = null;
        tabelaHash0.insere("", obj5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.insere("", (java.lang.Object) 10.0d);
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash15);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        java.lang.Object obj26 = tabelaHash21.pesquisa("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) 1);
        tabelaHash21.insere("hi!", (java.lang.Object) "");
        tabelaHash21.retira("hi!");
        java.lang.Class<?> wildcardClass38 = tabelaHash21.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = null;
        tabelaHash0.insere("", obj5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        java.lang.Object obj18 = tabelaHash8.pesquisa("hi!");
        java.lang.Class<?> wildcardClass19 = tabelaHash8.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 1);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) -1);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj26 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.insere("hi!", (java.lang.Object) (byte) -1);
        java.lang.Object obj31 = tabelaHash19.pesquisa("");
        java.lang.Object obj33 = new java.lang.Object();
        tabelaHash19.insere("", obj33);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        tabelaHash36.imprime();
        tabelaHash36.imprime();
        tabelaHash36.imprime();
        java.lang.Object obj42 = tabelaHash36.pesquisa("");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.imprime();
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object obj49 = tabelaHash47.pesquisa("hi!");
        tabelaHash47.imprime();
        tabelaHash44.insere("", (java.lang.Object) tabelaHash47);
        tabelaHash44.imprime();
        java.lang.Object obj54 = tabelaHash44.pesquisa("");
        java.lang.Class<?> wildcardClass55 = tabelaHash44.getClass();
        tabelaHash36.insere("", (java.lang.Object) wildcardClass55);
        tabelaHash19.insere("", (java.lang.Object) "");
        tabelaHash19.imprime();
        java.lang.Object obj60 = tabelaHash19.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0f + "'", obj31, 100.0f);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + (byte) -1 + "'", obj60, (byte) -1);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = null;
        tabelaHash0.insere("hi!", obj4);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        tabelaHash9.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj16 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.insere("hi!", (java.lang.Object) (byte) -1);
        java.lang.Object obj21 = tabelaHash9.pesquisa("");
        java.lang.Object obj23 = new java.lang.Object();
        tabelaHash9.insere("", obj23);
        tabelaHash9.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        java.lang.Object obj31 = tabelaHash28.pesquisa("");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("");
        tabelaHash33.insere("hi!", (java.lang.Object) 1);
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) (-1));
        tabelaHash28.insere("", (java.lang.Object) (-1));
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.imprime();
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        java.lang.Object obj50 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.imprime();
        tabelaHash45.insere("", (java.lang.Object) tabelaHash48);
        java.lang.Object obj54 = tabelaHash45.pesquisa("");
        java.lang.Object obj56 = tabelaHash45.pesquisa("hi!");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.imprime();
        tabelaHash58.imprime();
        tabelaHash58.imprime();
        java.lang.Object obj63 = tabelaHash58.pesquisa("hi!");
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        java.lang.Object obj67 = tabelaHash65.pesquisa("");
        tabelaHash65.imprime();
        java.lang.Object obj70 = tabelaHash65.pesquisa("hi!");
        java.lang.Class<?> wildcardClass71 = tabelaHash65.getClass();
        tabelaHash58.insere("", (java.lang.Object) tabelaHash65);
        tabelaHash58.imprime();
        tabelaHash45.insere("", (java.lang.Object) tabelaHash58);
        tabelaHash28.insere("", (java.lang.Object) tabelaHash58);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash58);
        java.lang.Class<?> wildcardClass77 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash26);
        tabelaHash23.retira("");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object obj39 = tabelaHash37.pesquisa("hi!");
        tabelaHash37.imprime();
        tabelaHash34.insere("", (java.lang.Object) tabelaHash37);
        tabelaHash34.imprime();
        java.lang.Object obj44 = tabelaHash34.pesquisa("");
        tabelaHash23.insere("hi!", (java.lang.Object) "");
        tabelaHash23.retira("hi!");
        tabelaHash23.imprime();
        java.lang.Object obj50 = tabelaHash23.pesquisa("hi!");
        java.lang.Object obj52 = tabelaHash23.pesquisa("");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        tabelaHash54.imprime();
        tabelaHash54.imprime();
        tabelaHash54.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj61 = tabelaHash54.pesquisa("hi!");
        java.lang.Object obj63 = tabelaHash54.pesquisa("");
        tabelaHash23.insere("", (java.lang.Object) tabelaHash54);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash23);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (byte) 10 + "'", obj63, (byte) 10);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) (byte) 100);
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        java.lang.Object obj31 = tabelaHash26.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash33.insere("", (java.lang.Object) 1);
        tabelaHash26.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.imprime();
        tabelaHash42.imprime();
        tabelaHash42.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj49 = tabelaHash42.pesquisa("hi!");
        tabelaHash26.insere("hi!", (java.lang.Object) tabelaHash42);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj55 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj57 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (byte) 100 + "'", obj57, (byte) 100);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("");
        tabelaHash7.imprime();
        java.lang.Object obj12 = tabelaHash7.pesquisa("hi!");
        java.lang.Class<?> wildcardClass13 = tabelaHash7.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("");
        tabelaHash25.insere("hi!", (java.lang.Object) 1);
        tabelaHash25.imprime();
        tabelaHash25.insere("", (java.lang.Object) (-1));
        tabelaHash25.retira("");
        java.lang.Object obj38 = tabelaHash25.pesquisa("");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = tabelaHash40.pesquisa("hi!");
        tabelaHash40.imprime();
        java.lang.Object obj45 = null;
        tabelaHash40.insere("", obj45);
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        java.lang.Object obj50 = tabelaHash48.pesquisa("hi!");
        java.lang.Object obj52 = tabelaHash48.pesquisa("");
        tabelaHash40.insere("", (java.lang.Object) tabelaHash48);
        java.lang.Object obj55 = tabelaHash40.pesquisa("");
        tabelaHash25.insere("hi!", (java.lang.Object) "");
        tabelaHash16.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object obj5 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash3);
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        java.lang.Class<?> wildcardClass16 = tabelaHash10.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) (byte) 100);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        java.lang.Object obj31 = null;
        tabelaHash26.insere("", obj31);
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        tabelaHash26.insere("", (java.lang.Object) tabelaHash34);
        tabelaHash34.imprime();
        java.lang.Object obj39 = tabelaHash34.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj42 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.imprime();
        java.lang.Object obj48 = null;
        tabelaHash45.insere("", obj48);
        java.lang.Object obj51 = tabelaHash45.pesquisa("hi!");
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        tabelaHash45.insere("hi!", (java.lang.Object) tabelaHash53);
        java.lang.Object obj56 = tabelaHash45.pesquisa("");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.imprime();
        tabelaHash58.imprime();
        tabelaHash58.imprime();
        java.lang.Object obj63 = tabelaHash58.pesquisa("hi!");
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        java.lang.Object obj67 = tabelaHash65.pesquisa("");
        tabelaHash65.imprime();
        java.lang.Object obj70 = tabelaHash65.pesquisa("hi!");
        java.lang.Class<?> wildcardClass71 = tabelaHash65.getClass();
        tabelaHash58.insere("", (java.lang.Object) tabelaHash65);
        tabelaHash45.insere("hi!", (java.lang.Object) tabelaHash58);
        tabelaHash58.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "hi!" + "'", obj42, "hi!");
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash8.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash8.retira("");
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) (byte) 100);
        java.lang.Object obj24 = tabelaHash0.pesquisa("");
        java.lang.Object obj26 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("");
        tabelaHash28.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("hi!");
        tabelaHash28.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash28.retira("");
        tabelaHash28.imprime();
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.imprime();
        tabelaHash43.imprime();
        tabelaHash43.insere("", (java.lang.Object) (byte) 10);
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        tabelaHash50.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj57 = tabelaHash50.pesquisa("");
        java.lang.Object obj59 = tabelaHash50.pesquisa("");
        tabelaHash43.insere("hi!", (java.lang.Object) tabelaHash50);
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash50);
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        tabelaHash63.imprime();
        java.lang.Object obj66 = null;
        tabelaHash63.insere("", obj66);
        tabelaHash63.retira("");
        ds.TabelaHash tabelaHash71 = new ds.TabelaHash();
        java.lang.Object obj73 = tabelaHash71.pesquisa("hi!");
        tabelaHash71.imprime();
        java.lang.Object obj76 = null;
        tabelaHash71.insere("", obj76);
        java.lang.Class<?> wildcardClass78 = tabelaHash71.getClass();
        tabelaHash63.insere("", (java.lang.Object) wildcardClass78);
        ds.TabelaHash tabelaHash81 = new ds.TabelaHash();
        java.lang.Object obj83 = tabelaHash81.pesquisa("");
        tabelaHash81.insere("hi!", (java.lang.Object) 1);
        tabelaHash81.imprime();
        tabelaHash81.insere("", (java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass91 = tabelaHash81.getClass();
        tabelaHash63.insere("", (java.lang.Object) tabelaHash81);
        tabelaHash28.insere("", (java.lang.Object) tabelaHash63);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash63);
        java.lang.Object obj96 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 100 + "'", obj24, (byte) 100);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) 100 + "'", obj26, (byte) 100);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (byte) 10 + "'", obj57, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (byte) 10 + "'", obj59, (byte) 10);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNotNull(obj96);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        java.lang.Class<?> wildcardClass23 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 100L);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        java.lang.Object obj16 = null;
        tabelaHash9.insere("", obj16);
        tabelaHash9.retira("");
        java.lang.Object obj21 = tabelaHash9.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 10 + "'", obj7, (byte) 10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 10);
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) 10 + "'", obj11, (short) 10);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) (byte) 100);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        java.lang.Object obj31 = null;
        tabelaHash26.insere("", obj31);
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("hi!");
        java.lang.Object obj38 = tabelaHash34.pesquisa("");
        tabelaHash26.insere("", (java.lang.Object) tabelaHash34);
        tabelaHash34.insere("", (java.lang.Object) 1);
        java.lang.Object obj44 = tabelaHash34.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash34);
        java.lang.Object obj47 = tabelaHash34.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 1 + "'", obj44, 1);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 1 + "'", obj47, 1);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = null;
        tabelaHash0.insere("", obj5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash8.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 1);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash4.insere("", (java.lang.Object) tabelaHash7);
        tabelaHash4.insere("hi!", (java.lang.Object) 10L);
        java.lang.Object obj16 = tabelaHash4.pesquisa("");
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 1);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("");
        tabelaHash16.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("");
        tabelaHash26.insere("hi!", (java.lang.Object) 1);
        tabelaHash26.imprime();
        tabelaHash26.insere("", (java.lang.Object) (-1));
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash26);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object obj5 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash3);
        tabelaHash0.insere("hi!", (java.lang.Object) 10L);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        java.lang.Object obj17 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.insere("hi!", (java.lang.Object) (short) 10);
        tabelaHash12.retira("hi!");
        java.lang.Class<?> wildcardClass23 = tabelaHash12.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        java.lang.Object obj32 = tabelaHash26.pesquisa("");
        java.lang.Object obj34 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        java.lang.Object obj37 = tabelaHash26.pesquisa("hi!");
        tabelaHash12.insere("hi!", obj37);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
    }
}
