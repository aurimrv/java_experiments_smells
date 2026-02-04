package ds.seed1448;

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
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        tabelaHash24.imprime();
        tabelaHash24.insere("", (java.lang.Object) 0L);
        tabelaHash24.imprime();
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash24);
        java.lang.Object obj35 = tabelaHash19.pesquisa("hi!");
        java.lang.Object obj37 = tabelaHash19.pesquisa("");
        tabelaHash10.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
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
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
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
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
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
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
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
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object obj41 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        tabelaHash39.insere("", (java.lang.Object) 0L);
        java.lang.Object obj48 = tabelaHash39.pesquisa("hi!");
        java.lang.Object obj50 = tabelaHash39.pesquisa("");
        java.lang.Object obj52 = tabelaHash39.pesquisa("");
        java.lang.Class<?> wildcardClass53 = tabelaHash39.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash39);
        java.lang.Class<?> wildcardClass55 = tabelaHash39.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0L + "'", obj50, 0L);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 0L + "'", obj52, 0L);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class java.lang.Object");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
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
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1.0f + "'", obj17, 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
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
        java.lang.Class<?> wildcardClass63 = tabelaHash34.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 0L + "'", obj28, 0L);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj7);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0L + "'", obj9, 0L);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
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
        java.lang.Class<?> wildcardClass16 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
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
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) 0L);
        tabelaHash20.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object obj39 = tabelaHash37.pesquisa("hi!");
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash37.insere("", (java.lang.Object) 0L);
        tabelaHash30.insere("", (java.lang.Object) 0L);
        tabelaHash20.insere("", (java.lang.Object) 0L);
        java.lang.Object obj48 = tabelaHash20.pesquisa("");
        tabelaHash20.retira("");
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash20.imprime();
        java.lang.Class<?> wildcardClass53 = tabelaHash20.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 0L + "'", obj48, 0L);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
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
        tabelaHash16.imprime();
        java.lang.Object obj45 = tabelaHash16.pesquisa("");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object obj49 = tabelaHash47.pesquisa("hi!");
        tabelaHash47.imprime();
        java.lang.Class<?> wildcardClass51 = tabelaHash47.getClass();
        tabelaHash16.insere("", (java.lang.Object) tabelaHash47);
        java.lang.Class<?> wildcardClass53 = tabelaHash47.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass53);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0L + "'", obj45, 0L);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
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
// flaky:         tabelaHash0.retira("");
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
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
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
        tabelaHash24.retira("");
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
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
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
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("");
        tabelaHash38.insere("", (java.lang.Object) 0.0d);
        tabelaHash38.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        java.lang.Object obj50 = tabelaHash48.pesquisa("");
        tabelaHash38.insere("hi!", (java.lang.Object) tabelaHash48);
        java.lang.Object obj53 = tabelaHash48.pesquisa("");
        tabelaHash48.imprime();
        java.lang.Object obj56 = tabelaHash48.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Object obj61 = tabelaHash0.pesquisa("");
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
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) -1);
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0f + "'", obj11, 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
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
        java.lang.Class<?> wildcardClass64 = tabelaHash11.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0L + "'", obj20, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
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
        tabelaHash0.insere("hi!", (java.lang.Object) true);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
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
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
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
        java.lang.Object obj48 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 0.0d + "'", obj48, 0.0d);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass5 = tabelaHash4.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
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
        ds.TabelaHash tabelaHash83 = new ds.TabelaHash();
        java.lang.Object obj85 = tabelaHash83.pesquisa("hi!");
        tabelaHash83.imprime();
        tabelaHash83.imprime();
        tabelaHash83.insere("", (java.lang.Object) 0L);
        java.lang.Object obj92 = tabelaHash83.pesquisa("");
        tabelaHash51.insere("", (java.lang.Object) tabelaHash83);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash51.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
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
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertEquals("'" + obj92 + "' != '" + 0L + "'", obj92, 0L);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
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
        tabelaHash55.imprime();
        tabelaHash55.insere("", (java.lang.Object) 0L);
        tabelaHash55.retira("");
        tabelaHash55.imprime();
        java.lang.Object obj67 = tabelaHash55.pesquisa("");
        tabelaHash23.insere("", (java.lang.Object) tabelaHash55);
        java.lang.Object obj70 = tabelaHash23.pesquisa("hi!");
        java.lang.Class<?> wildcardClass71 = tabelaHash23.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
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
        java.lang.Object obj48 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        tabelaHash0.retira("");
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
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
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
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
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
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
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
        java.lang.Object obj26 = tabelaHash0.pesquisa("hi!");
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
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "class ds.TabelaHash");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
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
        java.lang.Object obj19 = tabelaHash5.pesquisa("");
        tabelaHash5.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0L + "'", obj19, 0L);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
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
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        tabelaHash23.insere("", (java.lang.Object) wildcardClass29);
        java.lang.Object obj32 = tabelaHash23.pesquisa("");
        tabelaHash10.insere("hi!", obj32);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "class java.lang.Object");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
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
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        java.lang.Object obj50 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.imprime();
        tabelaHash48.imprime();
        tabelaHash48.insere("", (java.lang.Object) 0L);
        tabelaHash48.imprime();
        tabelaHash48.imprime();
        java.lang.Object obj59 = tabelaHash48.pesquisa("");
        tabelaHash0.insere("hi!", obj59);
        tabelaHash0.retira("");
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
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 0L + "'", obj59, 0L);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
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
        tabelaHash0.imprime();
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
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
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
        tabelaHash11.retira("");
        java.lang.Class<?> wildcardClass61 = tabelaHash11.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0L + "'", obj20, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
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
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        tabelaHash18.insere("", (java.lang.Object) wildcardClass24);
        java.lang.Object obj27 = tabelaHash18.pesquisa("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.imprime();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        tabelaHash29.insere("", (java.lang.Object) wildcardClass35);
        java.lang.Object obj38 = tabelaHash29.pesquisa("");
        tabelaHash18.insere("", obj38);
        tabelaHash18.retira("");
        java.lang.Object obj43 = tabelaHash18.pesquisa("");
        tabelaHash0.insere("", obj43);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "class java.lang.Object");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "class java.lang.Object");
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
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
        java.lang.Object obj37 = tabelaHash0.pesquisa("");
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
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
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
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        tabelaHash38.insere("", (java.lang.Object) 0L);
        tabelaHash38.retira("");
        java.lang.Object obj49 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        tabelaHash52.imprime();
        tabelaHash52.imprime();
        tabelaHash38.insere("", (java.lang.Object) tabelaHash52);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash52);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
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
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        tabelaHash23.insere("", (java.lang.Object) 0L);
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        java.lang.Class<?> wildcardClass34 = tabelaHash23.getClass();
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash23);
        java.lang.Object obj37 = tabelaHash23.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0L + "'", obj37, 0L);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = null;
        tabelaHash0.insere("", obj10);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
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
        tabelaHash32.retira("");
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
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
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

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
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
        java.lang.Object obj60 = tabelaHash0.pesquisa("");
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
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 0.0d + "'", obj60, 0.0d);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
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
        java.lang.Object obj91 = tabelaHash0.pesquisa("");
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
        org.junit.Assert.assertEquals("'" + obj91 + "' != '" + 1.0f + "'", obj91, 1.0f);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
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
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.insere("", (java.lang.Object) 0.0d);
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.imprime();
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash30);
        java.lang.Object obj38 = tabelaHash30.pesquisa("");
        tabelaHash30.insere("hi!", (java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass42 = tabelaHash30.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass42);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Ignore
    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
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
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash25.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
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
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
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
        tabelaHash31.retira("");
        java.lang.Object obj81 = tabelaHash31.pesquisa("hi!");
        java.lang.Object obj83 = tabelaHash31.pesquisa("hi!");
        tabelaHash0.insere("", obj83);
        java.lang.Object obj86 = tabelaHash0.pesquisa("");
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
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(obj86);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
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
        java.lang.Class<?> wildcardClass21 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
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
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
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
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
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
        tabelaHash51.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash51);
        tabelaHash51.imprime();
        java.lang.Object obj85 = tabelaHash51.pesquisa("");
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
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + 1.0f + "'", obj85, 1.0f);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
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
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
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
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
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
        java.lang.Class<?> wildcardClass30 = tabelaHash10.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
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
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) 0L);
        java.lang.Object obj27 = tabelaHash18.pesquisa("");
        tabelaHash18.retira("");
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        tabelaHash18.insere("", obj31);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.imprime();
        tabelaHash35.imprime();
        tabelaHash35.imprime();
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object obj44 = tabelaHash42.pesquisa("hi!");
        tabelaHash42.imprime();
        tabelaHash42.imprime();
        tabelaHash42.insere("", (java.lang.Object) 0L);
        tabelaHash35.insere("", (java.lang.Object) 0L);
        tabelaHash35.imprime();
        tabelaHash35.retira("");
        tabelaHash35.imprime();
        tabelaHash18.insere("", (java.lang.Object) tabelaHash35);
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0L + "'", obj9, 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0L + "'", obj27, 0L);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
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
        java.lang.Object obj22 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
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
        java.lang.Object obj44 = null;
        tabelaHash16.insere("hi!", obj44);
        java.lang.Object obj47 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.retira("");
        tabelaHash16.retira("hi!");
        tabelaHash16.imprime();
        java.lang.Object obj54 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0L + "'", obj13, 0L);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
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
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
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
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
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
        tabelaHash0.imprime();
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
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("", (java.lang.Object) 10.0f);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        tabelaHash12.insere("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj21 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        java.lang.Object obj24 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj26 = new java.lang.Object();
        tabelaHash12.insere("", obj26);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "class java.lang.Object");
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
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
        java.lang.Object obj61 = null;
        tabelaHash11.insere("hi!", obj61);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash11.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
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
        java.lang.Object obj44 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0L + "'", obj27, 0L);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(obj44);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        java.lang.Object obj12 = tabelaHash7.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj12);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) 0L);
        java.lang.Object obj24 = tabelaHash15.pesquisa("");
        tabelaHash15.retira("");
        java.lang.Class<?> wildcardClass27 = tabelaHash15.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass27);
        java.lang.Class<?> wildcardClass29 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0L + "'", obj24, 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
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
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
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
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.imprime();
        tabelaHash35.imprime();
        tabelaHash35.imprime();
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object obj44 = tabelaHash42.pesquisa("hi!");
        tabelaHash42.imprime();
        tabelaHash42.imprime();
        tabelaHash42.insere("", (java.lang.Object) 0L);
        tabelaHash35.insere("", (java.lang.Object) 0L);
        tabelaHash25.insere("", (java.lang.Object) 0L);
        java.lang.Object obj53 = tabelaHash25.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj56 = tabelaHash0.pesquisa("hi!");
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
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 0L + "'", obj53, 0L);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + "" + "'", obj56, "");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
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
        tabelaHash5.insere("hi!", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.insere("", (java.lang.Object) 0.0d);
        tabelaHash20.insere("", (java.lang.Object) 10.0f);
        tabelaHash20.imprime();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.insere("", (java.lang.Object) 0L);
        tabelaHash31.retira("");
        java.lang.Object obj42 = tabelaHash31.pesquisa("");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object obj46 = tabelaHash44.pesquisa("hi!");
        tabelaHash44.imprime();
        java.lang.Object obj49 = new java.lang.Object();
        java.lang.Class<?> wildcardClass50 = obj49.getClass();
        tabelaHash44.insere("", (java.lang.Object) wildcardClass50);
        java.lang.Object obj53 = tabelaHash44.pesquisa("");
        java.lang.Class<?> wildcardClass54 = tabelaHash44.getClass();
        tabelaHash31.insere("hi!", (java.lang.Object) wildcardClass54);
        tabelaHash31.retira("hi!");
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        java.lang.Object obj61 = tabelaHash59.pesquisa("hi!");
        tabelaHash59.imprime();
        tabelaHash59.imprime();
        tabelaHash59.insere("", (java.lang.Object) 0L);
        tabelaHash59.imprime();
        tabelaHash59.imprime();
        tabelaHash59.imprime();
        tabelaHash59.imprime();
        ds.TabelaHash tabelaHash72 = new ds.TabelaHash();
        java.lang.Object obj74 = tabelaHash72.pesquisa("hi!");
        tabelaHash72.imprime();
        tabelaHash72.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash72.imprime();
        java.lang.Object obj81 = tabelaHash72.pesquisa("");
        tabelaHash59.insere("", obj81);
        tabelaHash59.imprime();
        tabelaHash59.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash59.retira("");
        java.lang.Object obj90 = tabelaHash59.pesquisa("hi!");
        tabelaHash31.insere("hi!", obj90);
        tabelaHash20.insere("hi!", obj90);
        tabelaHash5.insere("", (java.lang.Object) tabelaHash20);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertEquals("'" + obj90 + "' != '" + (short) 0 + "'", obj90, (short) 0);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) 0L);
        tabelaHash12.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash12);
        java.lang.Object obj23 = tabelaHash12.pesquisa("");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.insere("", (java.lang.Object) 0L);
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.imprime();
        tabelaHash35.imprime();
        tabelaHash35.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash35);
        java.lang.Class<?> wildcardClass42 = tabelaHash25.getClass();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash25);
        java.lang.Object obj45 = tabelaHash25.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj45);
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        java.lang.Object obj50 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.imprime();
        tabelaHash48.imprime();
        tabelaHash48.insere("", (java.lang.Object) 0L);
        tabelaHash48.imprime();
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
        tabelaHash48.insere("", (java.lang.Object) 0L);
        java.lang.Object obj76 = null;
        tabelaHash48.insere("hi!", obj76);
        java.lang.Object obj79 = tabelaHash48.pesquisa("hi!");
        java.lang.Object obj81 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.retira("hi!");
        tabelaHash48.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0L + "'", obj23, 0L);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
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
        tabelaHash0.imprime();
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
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
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
        java.lang.Class<?> wildcardClass82 = tabelaHash51.getClass();
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
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
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
        java.lang.Object obj22 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0L + "'", obj22, 0L);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
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
        tabelaHash0.imprime();
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
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
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
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash27.insere("", (java.lang.Object) 0L);
        tabelaHash20.insere("", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        tabelaHash10.imprime();
        java.lang.Object obj39 = tabelaHash10.pesquisa("");
        java.lang.Object obj41 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0L + "'", obj39, 0L);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0L + "'", obj41, 0L);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
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
        tabelaHash5.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0L + "'", obj16, 0L);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
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
        tabelaHash0.retira("");
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj32 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0L + "'", obj11, 0L);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "" + "'", obj32, "");
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
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
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0L + "'", obj25, 0L);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
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
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
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
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass54 = tabelaHash53.getClass();
        tabelaHash49.insere("hi!", (java.lang.Object) tabelaHash53);
        java.lang.Object obj57 = tabelaHash49.pesquisa("");
        java.lang.Object obj59 = tabelaHash49.pesquisa("");
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        java.lang.Object obj63 = tabelaHash61.pesquisa("");
        tabelaHash61.insere("", (java.lang.Object) 0.0d);
        tabelaHash61.insere("", (java.lang.Object) 10.0f);
        ds.TabelaHash tabelaHash71 = new ds.TabelaHash();
        java.lang.Object obj73 = tabelaHash71.pesquisa("hi!");
        tabelaHash61.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj76 = tabelaHash61.pesquisa("hi!");
        tabelaHash61.imprime();
        java.lang.Class<?> wildcardClass78 = tabelaHash61.getClass();
        tabelaHash49.insere("", (java.lang.Object) tabelaHash61);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash49);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0L + "'", obj29, 0L);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Ignore
    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
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
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash30.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
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
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = null;
        tabelaHash0.insere("hi!", obj4);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
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
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
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
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
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
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object obj39 = tabelaHash37.pesquisa("");
        tabelaHash37.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash37);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
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
        java.lang.Object obj21 = tabelaHash5.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0L + "'", obj16, 0L);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0L + "'", obj21, 0L);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
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
        java.lang.Object obj41 = tabelaHash23.pesquisa("");
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
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0.0d + "'", obj41, 0.0d);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object obj6 = tabelaHash4.pesquisa("hi!");
        tabelaHash4.imprime();
        java.lang.Object obj9 = tabelaHash4.pesquisa("hi!");
        tabelaHash4.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash4.imprime();
        java.lang.Object obj14 = tabelaHash4.pesquisa("");
        java.lang.Object obj16 = tabelaHash4.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
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
        tabelaHash5.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0L + "'", obj17, 0L);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (short) 0 + "'", obj53, (short) 0);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
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
        java.lang.Class<?> wildcardClass60 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0L + "'", obj34, 0L);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }
}
