package ds.seed9006;

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
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj17 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj19 = tabelaHash12.pesquisa("");
        tabelaHash12.retira("hi!");
        java.lang.Object obj23 = null;
        tabelaHash12.insere("hi!", obj23);
        java.lang.Object obj26 = tabelaHash12.pesquisa("");
        tabelaHash12.retira("hi!");
        tabelaHash9.insere("", (java.lang.Object) tabelaHash12);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0d) + "'", obj17, (-1.0d));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash9.retira("hi!");
        java.lang.Object obj16 = tabelaHash9.pesquisa("");
        java.lang.Object obj18 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) (byte) 1);
        tabelaHash9.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash27.retira("hi!");
        java.lang.Object obj34 = tabelaHash27.pesquisa("");
        java.lang.Object obj36 = tabelaHash27.pesquisa("");
        tabelaHash27.imprime();
        java.lang.Object obj39 = tabelaHash27.pesquisa("");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj46 = tabelaHash41.pesquisa("hi!");
        java.lang.Object obj48 = tabelaHash41.pesquisa("");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash41.insere("", (java.lang.Object) tabelaHash50);
        java.lang.Object obj53 = null;
        tabelaHash41.insere("hi!", obj53);
        tabelaHash27.insere("hi!", obj53);
        tabelaHash9.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (-1.0d) + "'", obj46, (-1.0d));
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) 0);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj24 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.retira("hi!");
        tabelaHash19.insere("", (java.lang.Object) 10);
        java.lang.Object obj31 = tabelaHash19.pesquisa("");
        java.lang.Object obj33 = tabelaHash19.pesquisa("hi!");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash19.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash19.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Object obj44 = tabelaHash19.pesquisa("");
        java.lang.Object obj46 = tabelaHash19.pesquisa("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0d) + "'", obj24, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 10 + "'", obj31, 10);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0);
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj17 = null;
        tabelaHash0.insere("", obj17);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj25 = tabelaHash20.pesquisa("hi!");
        java.lang.Object obj27 = tabelaHash20.pesquisa("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash29.retira("hi!");
        java.lang.Object obj36 = tabelaHash29.pesquisa("");
        java.lang.Object obj38 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) (byte) 1);
        tabelaHash29.retira("hi!");
        tabelaHash20.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1.0d) + "'", obj25, (-1.0d));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash9.retira("hi!");
        java.lang.Object obj16 = tabelaHash9.pesquisa("");
        java.lang.Object obj18 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) (byte) 1);
        tabelaHash9.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object obj27 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj34 = tabelaHash29.pesquisa("hi!");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash36.retira("hi!");
        tabelaHash36.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash36);
        tabelaHash36.imprime();
        java.lang.Object obj46 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.imprime();
        java.lang.Class<?> wildcardClass48 = tabelaHash36.getClass();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash36);
        tabelaHash36.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (-1.0d) + "'", obj34, (-1.0d));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj20 = tabelaHash15.pesquisa("");
        java.lang.Object obj22 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        tabelaHash15.retira("hi!");
        java.lang.Object obj27 = tabelaHash15.pesquisa("hi!");
        java.lang.Object obj29 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.insere("", (java.lang.Object) (byte) 0);
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj39 = tabelaHash34.pesquisa("hi!");
        java.lang.Object obj41 = tabelaHash34.pesquisa("");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash34.insere("", (java.lang.Object) tabelaHash43);
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj51 = tabelaHash46.pesquisa("hi!");
        tabelaHash46.retira("hi!");
        tabelaHash46.insere("", (java.lang.Object) 10);
        tabelaHash46.insere("", (java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass60 = tabelaHash46.getClass();
        tabelaHash34.insere("", (java.lang.Object) tabelaHash46);
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash34);
        java.lang.Object obj64 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.insere("hi!", (java.lang.Object) (byte) 0);
        java.lang.Object obj69 = tabelaHash34.pesquisa("");
        java.lang.Object obj71 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash34);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1.0d) + "'", obj39, (-1.0d));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (-1.0d) + "'", obj51, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + (-1.0d) + "'", obj64, (-1.0d));
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + (-1.0d) + "'", obj71, (-1.0d));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0);
        tabelaHash0.retira("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) '4');
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj14);
    }

    @Ignore
    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) 0);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj24 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.retira("hi!");
        tabelaHash19.insere("", (java.lang.Object) 10);
        java.lang.Object obj31 = tabelaHash19.pesquisa("");
        java.lang.Object obj33 = tabelaHash19.pesquisa("hi!");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash19.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash19.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0d) + "'", obj24, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 10 + "'", obj31, 10);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("hi!");
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj33 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.retira("hi!");
        tabelaHash28.insere("", (java.lang.Object) 10);
        java.lang.Object obj40 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        tabelaHash28.retira("");
        tabelaHash28.imprime();
        java.lang.Object obj46 = tabelaHash28.pesquisa("");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj53 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.retira("hi!");
        tabelaHash48.imprime();
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj63 = tabelaHash58.pesquisa("hi!");
        tabelaHash58.retira("hi!");
        tabelaHash58.insere("", (java.lang.Object) 10);
        java.lang.Object obj70 = tabelaHash58.pesquisa("");
        tabelaHash58.imprime();
        tabelaHash48.insere("hi!", (java.lang.Object) tabelaHash58);
        java.lang.Class<?> wildcardClass73 = tabelaHash48.getClass();
        tabelaHash28.insere("hi!", (java.lang.Object) wildcardClass73);
        tabelaHash0.insere("", (java.lang.Object) wildcardClass73);
        java.lang.Object obj77 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash79 = new ds.TabelaHash();
        tabelaHash79.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj84 = tabelaHash79.pesquisa("");
        tabelaHash79.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash79);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10 + "'", obj12, 10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (-1.0d) + "'", obj33, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 10 + "'", obj40, 10);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (-1.0d) + "'", obj53, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (-1.0d) + "'", obj63, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + 10 + "'", obj70, 10);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertEquals(obj77.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj77), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj77), "class ds.TabelaHash");
        org.junit.Assert.assertNull(obj84);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
        tabelaHash2.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash2.imprime();
        tabelaHash2.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash2.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash2);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        java.lang.Object obj21 = tabelaHash14.pesquisa("");
        java.lang.Object obj23 = tabelaHash14.pesquisa("");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj30 = tabelaHash25.pesquisa("hi!");
        java.lang.Object obj32 = tabelaHash25.pesquisa("");
        tabelaHash25.insere("", (java.lang.Object) 0);
        tabelaHash25.retira("");
        java.lang.Object obj39 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash25);
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj48 = tabelaHash43.pesquisa("hi!");
        java.lang.Object obj50 = tabelaHash43.pesquisa("");
        tabelaHash43.insere("", (java.lang.Object) 0);
        tabelaHash43.retira("");
        java.lang.Object obj57 = tabelaHash43.pesquisa("");
        tabelaHash43.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash43);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj62 = null;
        tabelaHash0.insere("", obj62);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0d) + "'", obj30, (-1.0d));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (-1.0d) + "'", obj48, (-1.0d));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) 0);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash15.retira("hi!");
        tabelaHash15.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj32 = tabelaHash27.pesquisa("hi!");
        java.lang.Object obj34 = tabelaHash27.pesquisa("");
        tabelaHash27.insere("", (java.lang.Object) 0);
        tabelaHash27.retira("hi!");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj46 = tabelaHash41.pesquisa("");
        java.lang.Object obj48 = tabelaHash41.pesquisa("");
        tabelaHash41.imprime();
        tabelaHash41.retira("hi!");
        java.lang.Object obj53 = tabelaHash41.pesquisa("hi!");
        tabelaHash27.insere("", (java.lang.Object) tabelaHash41);
        tabelaHash27.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash27);
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj63 = tabelaHash58.pesquisa("");
        java.lang.Object obj65 = tabelaHash58.pesquisa("");
        tabelaHash58.imprime();
        tabelaHash58.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash58);
        java.lang.Object obj70 = tabelaHash58.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (-1.0d) + "'", obj32, (-1.0d));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj70);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash7.imprime();
        java.lang.Object obj17 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj25 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash27.retira("hi!");
        tabelaHash27.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash27);
        tabelaHash27.imprime();
        java.lang.Object obj37 = tabelaHash27.pesquisa("hi!");
        java.lang.Object obj39 = tabelaHash27.pesquisa("hi!");
        tabelaHash7.insere("", (java.lang.Object) tabelaHash27);
        java.lang.Object obj42 = tabelaHash27.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash27.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1.0d) + "'", obj25, (-1.0d));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj13 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash8.pesquisa("");
        tabelaHash8.retira("hi!");
        java.lang.Object obj19 = null;
        tabelaHash8.insere("hi!", obj19);
        tabelaHash0.insere("hi!", obj19);
        java.lang.Class<?> wildcardClass22 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0d) + "'", obj13, (-1.0d));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj17 = null;
        tabelaHash0.insere("", obj17);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj25 = tabelaHash20.pesquisa("hi!");
        java.lang.Object obj27 = tabelaHash20.pesquisa("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash29.retira("hi!");
        java.lang.Object obj36 = tabelaHash29.pesquisa("");
        java.lang.Object obj38 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) (byte) 1);
        tabelaHash29.retira("hi!");
        tabelaHash20.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Class<?> wildcardClass49 = tabelaHash20.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1.0d) + "'", obj25, (-1.0d));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj23 = tabelaHash18.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash18.pesquisa("");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash18.insere("", (java.lang.Object) tabelaHash27);
        java.lang.Class<?> wildcardClass29 = tabelaHash18.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj37 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.retira("hi!");
        java.lang.Object obj41 = null;
        tabelaHash32.insere("", obj41);
        tabelaHash32.retira("");
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj51 = tabelaHash46.pesquisa("");
        java.lang.Object obj53 = tabelaHash46.pesquisa("");
        tabelaHash46.imprime();
        tabelaHash46.retira("hi!");
        java.lang.Object obj58 = tabelaHash46.pesquisa("");
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        tabelaHash60.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj65 = tabelaHash60.pesquisa("");
        java.lang.Object obj67 = tabelaHash60.pesquisa("");
        tabelaHash60.imprime();
        tabelaHash60.retira("hi!");
        java.lang.Object obj72 = tabelaHash60.pesquisa("hi!");
        java.lang.Object obj74 = tabelaHash60.pesquisa("hi!");
        tabelaHash60.insere("", (java.lang.Object) (byte) 0);
        tabelaHash60.retira("");
        tabelaHash46.insere("hi!", (java.lang.Object) tabelaHash60);
        tabelaHash32.insere("hi!", (java.lang.Object) tabelaHash60);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10 + "'", obj12, 10);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0d) + "'", obj23, (-1.0d));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (-1.0d) + "'", obj37, (-1.0d));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj74);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj29 = tabelaHash24.pesquisa("hi!");
        java.lang.Object obj31 = tabelaHash24.pesquisa("");
        tabelaHash24.insere("", (java.lang.Object) 0);
        tabelaHash24.retira("hi!");
        tabelaHash24.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash24);
        java.lang.Object obj40 = tabelaHash24.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10 + "'", obj12, 10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1.0d) + "'", obj29, (-1.0d));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 0 + "'", obj40, 0);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        java.lang.Object obj21 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash14.retira("hi!");
        java.lang.Object obj26 = tabelaHash14.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash14);
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj33 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0 + "'", obj29, 0);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0 + "'", obj33, 0);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj29 = tabelaHash24.pesquisa("hi!");
        java.lang.Object obj31 = tabelaHash24.pesquisa("");
        tabelaHash24.insere("", (java.lang.Object) 0);
        tabelaHash24.retira("hi!");
        tabelaHash24.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash0.insere("", (java.lang.Object) false);
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj48 = tabelaHash43.pesquisa("hi!");
        java.lang.Object obj50 = tabelaHash43.pesquisa("");
        java.lang.Object obj52 = tabelaHash43.pesquisa("hi!");
        java.lang.Class<?> wildcardClass53 = tabelaHash43.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass53);
        tabelaHash0.imprime();
        java.lang.Object obj57 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        tabelaHash59.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash59.imprime();
        tabelaHash59.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10 + "'", obj12, 10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1.0d) + "'", obj29, (-1.0d));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (-1.0d) + "'", obj48, (-1.0d));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (-1.0d) + "'", obj52, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "class ds.TabelaHash");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = null;
        tabelaHash0.insere("", obj9);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        java.lang.Object obj21 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash14.retira("hi!");
        java.lang.Object obj26 = tabelaHash14.pesquisa("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        java.lang.Object obj35 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        tabelaHash28.retira("hi!");
        java.lang.Object obj40 = tabelaHash28.pesquisa("hi!");
        java.lang.Object obj42 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.insere("", (java.lang.Object) (byte) 0);
        tabelaHash28.retira("");
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash28);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Class<?> wildcardClass50 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("hi!");
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj31 = tabelaHash26.pesquisa("");
        java.lang.Object obj33 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash26.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash26);
        java.lang.Object obj39 = tabelaHash26.pesquisa("hi!");
        java.lang.Object obj41 = tabelaHash26.pesquisa("");
        java.lang.Object obj43 = null;
        tabelaHash26.insere("", obj43);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash26.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10 + "'", obj12, 10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10 + "'", obj12, 10);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash16.imprime();
        tabelaHash16.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash0.retira("hi!");
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj34 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.retira("hi!");
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj44 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.retira("hi!");
        tabelaHash39.insere("", (java.lang.Object) 10);
        java.lang.Object obj51 = tabelaHash39.pesquisa("");
        tabelaHash39.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash39);
        java.lang.Class<?> wildcardClass54 = tabelaHash29.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass54);
        java.lang.Class<?> wildcardClass56 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (-1.0d) + "'", obj34, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (-1.0d) + "'", obj44, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 10 + "'", obj51, 10);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash13.retira("hi!");
        java.lang.Object obj20 = tabelaHash13.pesquisa("");
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) (byte) 1);
        tabelaHash13.retira("hi!");
        java.lang.Object obj30 = tabelaHash13.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        tabelaHash13.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj39 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.retira("hi!");
        tabelaHash34.insere("", (java.lang.Object) 10);
        java.lang.Object obj46 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        java.lang.Object obj49 = tabelaHash34.pesquisa("");
        java.lang.Object obj51 = tabelaHash34.pesquisa("");
        tabelaHash13.insere("", (java.lang.Object) tabelaHash34);
        tabelaHash34.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1.0d) + "'", obj39, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 10 + "'", obj46, 10);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 10 + "'", obj49, 10);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 10 + "'", obj51, 10);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.insere("", (java.lang.Object) 0);
        tabelaHash16.retira("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj35 = tabelaHash30.pesquisa("");
        java.lang.Object obj37 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        tabelaHash30.retira("hi!");
        java.lang.Object obj42 = tabelaHash30.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) tabelaHash30);
        tabelaHash16.imprime();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj52 = tabelaHash47.pesquisa("");
        java.lang.Object obj54 = tabelaHash47.pesquisa("");
        java.lang.Object obj56 = tabelaHash47.pesquisa("");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj63 = tabelaHash58.pesquisa("hi!");
        java.lang.Object obj65 = tabelaHash58.pesquisa("");
        tabelaHash58.insere("", (java.lang.Object) 0);
        tabelaHash58.retira("");
        java.lang.Object obj72 = tabelaHash58.pesquisa("");
        tabelaHash58.imprime();
        tabelaHash47.insere("", (java.lang.Object) tabelaHash58);
        tabelaHash47.imprime();
        java.lang.Class<?> wildcardClass76 = tabelaHash47.getClass();
        tabelaHash16.insere("", (java.lang.Object) tabelaHash47);
        tabelaHash47.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (-1.0d) + "'", obj63, (-1.0d));
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass24 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10 + "'", obj12, 10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1.0d) + "'", obj22, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
    }

    @Ignore
    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash13.retira("hi!");
        java.lang.Object obj20 = tabelaHash13.pesquisa("");
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) (byte) 1);
        tabelaHash13.retira("hi!");
        java.lang.Object obj30 = tabelaHash13.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        tabelaHash13.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj39 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.retira("hi!");
        tabelaHash34.insere("", (java.lang.Object) 10);
        java.lang.Object obj46 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        java.lang.Object obj49 = tabelaHash34.pesquisa("");
        java.lang.Object obj51 = tabelaHash34.pesquisa("");
        tabelaHash13.insere("", (java.lang.Object) tabelaHash34);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash13.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1.0d) + "'", obj11, (-1.0d));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1.0d) + "'", obj39, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 10 + "'", obj46, 10);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 10 + "'", obj49, 10);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 10 + "'", obj51, 10);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0 + "'", obj21, 0);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.insere("", (java.lang.Object) 0);
        tabelaHash16.retira("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj35 = tabelaHash30.pesquisa("");
        java.lang.Object obj37 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        tabelaHash30.retira("hi!");
        java.lang.Object obj42 = tabelaHash30.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) tabelaHash30);
        tabelaHash16.imprime();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj52 = tabelaHash47.pesquisa("");
        java.lang.Object obj54 = tabelaHash47.pesquisa("");
        java.lang.Object obj56 = tabelaHash47.pesquisa("");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj63 = tabelaHash58.pesquisa("hi!");
        java.lang.Object obj65 = tabelaHash58.pesquisa("");
        tabelaHash58.insere("", (java.lang.Object) 0);
        tabelaHash58.retira("");
        java.lang.Object obj72 = tabelaHash58.pesquisa("");
        tabelaHash58.imprime();
        tabelaHash47.insere("", (java.lang.Object) tabelaHash58);
        tabelaHash47.imprime();
        java.lang.Class<?> wildcardClass76 = tabelaHash47.getClass();
        tabelaHash16.insere("", (java.lang.Object) tabelaHash47);
        java.lang.Object obj79 = tabelaHash16.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (-1.0d) + "'", obj63, (-1.0d));
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNull(obj79);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash9.retira("hi!");
        java.lang.Object obj16 = tabelaHash9.pesquisa("");
        java.lang.Object obj18 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) (byte) 1);
        tabelaHash9.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass28 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj17 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj19 = tabelaHash12.pesquisa("");
        java.lang.Object obj21 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash25.retira("hi!");
        java.lang.Object obj32 = tabelaHash25.pesquisa("");
        java.lang.Object obj34 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) (byte) 1);
        tabelaHash25.retira("hi!");
        java.lang.Object obj42 = tabelaHash25.pesquisa("hi!");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash25);
        java.lang.Object obj45 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0d) + "'", obj17, (-1.0d));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0d) + "'", obj23, (-1.0d));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(obj45);
    }

    @Ignore
    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0);
        tabelaHash0.retira("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("hi!");
        java.lang.Object obj20 = tabelaHash16.pesquisa("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash22.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash22.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash22);
        java.lang.Class<?> wildcardClass32 = tabelaHash16.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
        tabelaHash2.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash2.imprime();
        tabelaHash2.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash2.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash2);
        tabelaHash2.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        java.lang.Object obj21 = tabelaHash14.pesquisa("");
        tabelaHash14.insere("", (java.lang.Object) 0);
        tabelaHash14.retira("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        java.lang.Object obj35 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        tabelaHash28.retira("hi!");
        java.lang.Object obj40 = tabelaHash28.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) tabelaHash28);
        tabelaHash2.insere("", (java.lang.Object) "");
        tabelaHash2.retira("hi!");
        java.lang.Object obj46 = tabelaHash2.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0d) + "'", obj19, (-1.0d));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "" + "'", obj46, "");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj17 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj19 = tabelaHash12.pesquisa("");
        java.lang.Object obj21 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash25.retira("hi!");
        java.lang.Object obj32 = tabelaHash25.pesquisa("");
        java.lang.Object obj34 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) (byte) 1);
        tabelaHash25.retira("hi!");
        java.lang.Object obj42 = tabelaHash25.pesquisa("hi!");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash25);
        java.lang.Object obj45 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash12.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0d) + "'", obj17, (-1.0d));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0d) + "'", obj23, (-1.0d));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) 0);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj24 = tabelaHash19.pesquisa("hi!");
        java.lang.Object obj26 = tabelaHash19.pesquisa("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) tabelaHash28);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj36 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.retira("hi!");
        tabelaHash31.insere("", (java.lang.Object) 10);
        tabelaHash31.insere("", (java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass45 = tabelaHash31.getClass();
        tabelaHash19.insere("", (java.lang.Object) tabelaHash31);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj49 = tabelaHash19.pesquisa("hi!");
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj56 = tabelaHash51.pesquisa("");
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash51);
        java.lang.Object obj59 = tabelaHash19.pesquisa("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0d) + "'", obj24, (-1.0d));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (-1.0d) + "'", obj36, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (-1.0d) + "'", obj49, (-1.0d));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (-1.0d) + "'", obj59, (-1.0d));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0);
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0d) + "'", obj12, (-1.0d));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash11.pesquisa("");
        tabelaHash11.insere("", (java.lang.Object) 0);
        tabelaHash11.retira("");
        java.lang.Object obj25 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash11.imprime();
        java.lang.Object obj30 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        java.lang.Class<?> wildcardClass33 = tabelaHash11.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0d) + "'", obj16, (-1.0d));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash7.retira("hi!");
        java.lang.Object obj14 = tabelaHash7.pesquisa("");
        java.lang.Object obj16 = tabelaHash7.pesquisa("");
        java.lang.Object obj18 = tabelaHash7.pesquisa("");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj29 = tabelaHash24.pesquisa("hi!");
        java.lang.Object obj31 = tabelaHash24.pesquisa("");
        tabelaHash24.insere("", (java.lang.Object) 0);
        tabelaHash24.retira("hi!");
        tabelaHash24.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash0.insere("", (java.lang.Object) false);
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj48 = tabelaHash43.pesquisa("hi!");
        java.lang.Object obj50 = tabelaHash43.pesquisa("");
        java.lang.Object obj52 = tabelaHash43.pesquisa("hi!");
        java.lang.Class<?> wildcardClass53 = tabelaHash43.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass53);
        java.lang.Object obj56 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10 + "'", obj12, 10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1.0d) + "'", obj29, (-1.0d));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (-1.0d) + "'", obj48, (-1.0d));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (-1.0d) + "'", obj52, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 10 + "'", obj56, 10);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object obj16 = tabelaHash9.pesquisa("");
        java.lang.Object obj18 = tabelaHash9.pesquisa("");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj25 = tabelaHash20.pesquisa("hi!");
        java.lang.Object obj27 = tabelaHash20.pesquisa("");
        tabelaHash20.insere("", (java.lang.Object) 0);
        tabelaHash20.retira("");
        java.lang.Object obj34 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        tabelaHash9.insere("", (java.lang.Object) tabelaHash20);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj43 = tabelaHash38.pesquisa("hi!");
        java.lang.Object obj45 = tabelaHash38.pesquisa("");
        tabelaHash38.insere("", (java.lang.Object) 0);
        tabelaHash38.retira("");
        java.lang.Object obj52 = tabelaHash38.pesquisa("");
        tabelaHash38.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash38);
        java.lang.Object obj56 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.insere("hi!", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        tabelaHash63.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash63.retira("hi!");
        tabelaHash63.imprime();
        tabelaHash58.insere("hi!", (java.lang.Object) tabelaHash63);
        tabelaHash58.retira("hi!");
        tabelaHash58.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash58);
        ds.TabelaHash tabelaHash76 = new ds.TabelaHash();
        java.lang.Object obj78 = tabelaHash76.pesquisa("hi!");
        java.lang.Object obj80 = tabelaHash76.pesquisa("hi!");
        java.lang.Object obj82 = tabelaHash76.pesquisa("");
        tabelaHash76.imprime();
        tabelaHash58.insere("hi!", (java.lang.Object) tabelaHash76);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1.0d) + "'", obj25, (-1.0d));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1.0d) + "'", obj43, (-1.0d));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (-1.0d) + "'", obj56, (-1.0d));
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj82);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.retira("hi!");
        tabelaHash14.insere("", (java.lang.Object) 10);
        java.lang.Object obj26 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash14.retira("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj37 = tabelaHash32.pesquisa("hi!");
        java.lang.Object obj39 = tabelaHash32.pesquisa("");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash32.insere("", (java.lang.Object) tabelaHash41);
        java.lang.Class<?> wildcardClass43 = tabelaHash32.getClass();
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash32);
        java.lang.Object obj46 = tabelaHash32.pesquisa("");
        tabelaHash0.insere("", obj46);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0d) + "'", obj19, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 10 + "'", obj26, 10);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (-1.0d) + "'", obj37, (-1.0d));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) 0);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash15.retira("hi!");
        tabelaHash15.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj32 = tabelaHash27.pesquisa("hi!");
        java.lang.Object obj34 = tabelaHash27.pesquisa("");
        tabelaHash27.insere("", (java.lang.Object) 0);
        tabelaHash27.retira("hi!");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj46 = tabelaHash41.pesquisa("");
        java.lang.Object obj48 = tabelaHash41.pesquisa("");
        tabelaHash41.imprime();
        tabelaHash41.retira("hi!");
        java.lang.Object obj53 = tabelaHash41.pesquisa("hi!");
        tabelaHash27.insere("", (java.lang.Object) tabelaHash41);
        tabelaHash27.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash27);
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (-1.0d) + "'", obj32, (-1.0d));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        java.lang.Object obj12 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash5.retira("hi!");
        java.lang.Object obj17 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj19 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj21 = null;
        tabelaHash5.insere("", obj21);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj29 = tabelaHash24.pesquisa("hi!");
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash24);
        java.lang.Object obj32 = tabelaHash24.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash0.retira("");
        java.lang.Object obj37 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass38 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1.0d) + "'", obj29, (-1.0d));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (-1.0d) + "'", obj37, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) (byte) 0);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("hi!", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash31.retira("hi!");
        tabelaHash31.imprime();
        tabelaHash26.insere("hi!", (java.lang.Object) tabelaHash31);
        tabelaHash26.retira("hi!");
        tabelaHash16.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash11.pesquisa("");
        tabelaHash11.insere("", (java.lang.Object) 0);
        tabelaHash11.retira("");
        java.lang.Object obj25 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj34 = tabelaHash29.pesquisa("hi!");
        java.lang.Object obj36 = tabelaHash29.pesquisa("");
        tabelaHash29.insere("", (java.lang.Object) 0);
        tabelaHash29.retira("");
        java.lang.Object obj43 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash29);
        java.lang.Object obj47 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        java.lang.Class<?> wildcardClass49 = tabelaHash11.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0d) + "'", obj16, (-1.0d));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (-1.0d) + "'", obj34, (-1.0d));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1.0d) + "'", obj47, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj26 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj28 = tabelaHash21.pesquisa("");
        tabelaHash21.retira("hi!");
        java.lang.Object obj32 = tabelaHash21.pesquisa("hi!");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash21.insere("", (java.lang.Object) (-1.0d));
        tabelaHash17.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash17.imprime();
        java.lang.Object obj42 = tabelaHash17.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (-1.0d) + "'", obj26, (-1.0d));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) 0);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj24 = tabelaHash19.pesquisa("hi!");
        java.lang.Object obj26 = tabelaHash19.pesquisa("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) tabelaHash28);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj36 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.retira("hi!");
        tabelaHash31.insere("", (java.lang.Object) 10);
        tabelaHash31.insere("", (java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass45 = tabelaHash31.getClass();
        tabelaHash19.insere("", (java.lang.Object) tabelaHash31);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj49 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.insere("hi!", (java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass53 = tabelaHash19.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0d) + "'", obj24, (-1.0d));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (-1.0d) + "'", obj36, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (-1.0d) + "'", obj49, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Ignore
    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0);
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
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
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash9.retira("hi!");
        java.lang.Object obj16 = tabelaHash9.pesquisa("");
        java.lang.Object obj18 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) (byte) 1);
        tabelaHash9.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj33 = tabelaHash28.pesquisa("hi!");
        java.lang.Object obj35 = tabelaHash28.pesquisa("");
        tabelaHash28.retira("hi!");
        java.lang.Object obj39 = tabelaHash28.pesquisa("hi!");
        tabelaHash9.insere("", obj39);
        java.lang.Object obj42 = tabelaHash9.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (-1.0d) + "'", obj33, (-1.0d));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj13 = null;
        tabelaHash0.insere("hi!", obj13);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj26 = tabelaHash21.pesquisa("");
        java.lang.Object obj28 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        tabelaHash21.retira("hi!");
        java.lang.Object obj33 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj35 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj37 = null;
        tabelaHash21.insere("", obj37);
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj45 = tabelaHash40.pesquisa("hi!");
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash40);
        java.lang.Object obj48 = tabelaHash40.pesquisa("");
        tabelaHash16.insere("", (java.lang.Object) tabelaHash40);
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj56 = tabelaHash51.pesquisa("");
        java.lang.Object obj58 = tabelaHash51.pesquisa("");
        tabelaHash51.imprime();
        tabelaHash51.retira("hi!");
        java.lang.Object obj63 = tabelaHash51.pesquisa("hi!");
        java.lang.Object obj65 = tabelaHash51.pesquisa("hi!");
        tabelaHash51.imprime();
        java.lang.Object obj68 = tabelaHash51.pesquisa("hi!");
        tabelaHash40.insere("", obj68);
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (-1.0d) + "'", obj45, (-1.0d));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        java.lang.Object obj21 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash14.retira("hi!");
        java.lang.Object obj26 = tabelaHash14.pesquisa("hi!");
        java.lang.Object obj28 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) (byte) 0);
        tabelaHash14.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("hi!", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash41.retira("hi!");
        tabelaHash41.imprime();
        tabelaHash36.insere("hi!", (java.lang.Object) tabelaHash41);
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.insere("hi!", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        tabelaHash55.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash55.retira("hi!");
        tabelaHash55.imprime();
        tabelaHash50.insere("hi!", (java.lang.Object) tabelaHash55);
        tabelaHash41.insere("", (java.lang.Object) tabelaHash50);
        java.lang.Class<?> wildcardClass64 = tabelaHash41.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass64);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = null;
        tabelaHash0.insere("", obj16);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj24 = tabelaHash19.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj32 = tabelaHash27.pesquisa("hi!");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash34.retira("hi!");
        tabelaHash34.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash34.imprime();
        java.lang.Object obj44 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0d) + "'", obj24, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (-1.0d) + "'", obj32, (-1.0d));
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("hi!");
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj33 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.retira("hi!");
        tabelaHash28.insere("", (java.lang.Object) 10);
        java.lang.Object obj40 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        tabelaHash28.retira("");
        tabelaHash28.imprime();
        java.lang.Object obj46 = tabelaHash28.pesquisa("");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj53 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.retira("hi!");
        tabelaHash48.imprime();
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj63 = tabelaHash58.pesquisa("hi!");
        tabelaHash58.retira("hi!");
        tabelaHash58.insere("", (java.lang.Object) 10);
        java.lang.Object obj70 = tabelaHash58.pesquisa("");
        tabelaHash58.imprime();
        tabelaHash48.insere("hi!", (java.lang.Object) tabelaHash58);
        java.lang.Class<?> wildcardClass73 = tabelaHash48.getClass();
        tabelaHash28.insere("hi!", (java.lang.Object) wildcardClass73);
        tabelaHash0.insere("", (java.lang.Object) wildcardClass73);
        java.lang.Object obj77 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10 + "'", obj12, 10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (-1.0d) + "'", obj33, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 10 + "'", obj40, 10);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (-1.0d) + "'", obj53, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (-1.0d) + "'", obj63, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + 10 + "'", obj70, 10);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertEquals(obj77.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj77), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj77), "class ds.TabelaHash");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash17.imprime();
        tabelaHash17.insere("hi!", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj31 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.retira("hi!");
        tabelaHash26.insere("", (java.lang.Object) 10);
        java.lang.Object obj38 = tabelaHash26.pesquisa("");
        java.lang.Object obj40 = tabelaHash26.pesquisa("hi!");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash26.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash26.retira("hi!");
        java.lang.Object obj50 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.retira("");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        tabelaHash54.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj59 = tabelaHash54.pesquisa("hi!");
        tabelaHash54.retira("hi!");
        tabelaHash54.insere("", (java.lang.Object) 10);
        java.lang.Object obj66 = tabelaHash54.pesquisa("");
        tabelaHash54.imprime();
        tabelaHash26.insere("hi!", (java.lang.Object) tabelaHash54);
        tabelaHash26.imprime();
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash26);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash26);
        ds.TabelaHash tabelaHash73 = new ds.TabelaHash();
        tabelaHash73.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj78 = tabelaHash73.pesquisa("hi!");
        java.lang.Object obj80 = tabelaHash73.pesquisa("");
        ds.TabelaHash tabelaHash82 = new ds.TabelaHash();
        tabelaHash73.insere("", (java.lang.Object) tabelaHash82);
        tabelaHash73.imprime();
        tabelaHash26.insere("hi!", (java.lang.Object) tabelaHash73);
        tabelaHash73.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10 + "'", obj12, 10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (-1.0d) + "'", obj31, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 10 + "'", obj38, 10);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (-1.0d) + "'", obj59, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + 10 + "'", obj66, 10);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + (-1.0d) + "'", obj78, (-1.0d));
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.insere("", (java.lang.Object) 0);
        tabelaHash16.retira("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash16.imprime();
        tabelaHash16.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash16.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object obj16 = tabelaHash7.pesquisa("hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash7.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Ignore
    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj9 = tabelaHash4.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash4.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash4.insere("", (java.lang.Object) tabelaHash13);
        tabelaHash4.retira("hi!");
        java.lang.Object obj18 = tabelaHash4.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Ignore
    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash11.pesquisa("");
        tabelaHash11.insere("", (java.lang.Object) 0);
        tabelaHash11.retira("");
        java.lang.Object obj25 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash11.imprime();
        java.lang.Object obj30 = tabelaHash11.pesquisa("");
        java.lang.Object obj32 = tabelaHash11.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash11.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0d) + "'", obj16, (-1.0d));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj24 = tabelaHash19.pesquisa("hi!");
        java.lang.Object obj26 = tabelaHash19.pesquisa("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) tabelaHash28);
        java.lang.Object obj31 = tabelaHash19.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj34 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj41 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.retira("hi!");
        tabelaHash36.insere("", (java.lang.Object) 10);
        java.lang.Object obj48 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        tabelaHash36.retira("");
        tabelaHash36.imprime();
        java.lang.Object obj54 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash36);
        java.lang.Class<?> wildcardClass57 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0d) + "'", obj24, (-1.0d));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "" + "'", obj34, "");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (-1.0d) + "'", obj41, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 10 + "'", obj48, 10);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj22 = tabelaHash17.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash17.pesquisa("");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash17.insere("", (java.lang.Object) tabelaHash26);
        tabelaHash17.retira("hi!");
        java.lang.Object obj31 = tabelaHash17.pesquisa("");
        java.lang.Object obj33 = tabelaHash17.pesquisa("");
        tabelaHash0.insere("", obj33);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10 + "'", obj12, 10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1.0d) + "'", obj22, (-1.0d));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash7.imprime();
        java.lang.Object obj17 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj25 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash27.retira("hi!");
        tabelaHash27.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash27);
        tabelaHash27.imprime();
        java.lang.Object obj37 = tabelaHash27.pesquisa("hi!");
        java.lang.Object obj39 = tabelaHash27.pesquisa("hi!");
        tabelaHash7.insere("", (java.lang.Object) tabelaHash27);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj47 = tabelaHash42.pesquisa("hi!");
        java.lang.Object obj49 = tabelaHash42.pesquisa("");
        tabelaHash42.insere("", (java.lang.Object) 0);
        tabelaHash42.insere("", (java.lang.Object) 10.0d);
        tabelaHash7.insere("hi!", (java.lang.Object) 10.0d);
        tabelaHash7.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1.0d) + "'", obj25, (-1.0d));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1.0d) + "'", obj47, (-1.0d));
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) 0);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash15.retira("hi!");
        tabelaHash15.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj37 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.retira("hi!");
        tabelaHash32.insere("", (java.lang.Object) 10);
        java.lang.Object obj44 = tabelaHash32.pesquisa("");
        java.lang.Object obj46 = tabelaHash32.pesquisa("");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj53 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.retira("hi!");
        tabelaHash48.insere("", (java.lang.Object) 10);
        java.lang.Object obj60 = tabelaHash48.pesquisa("");
        java.lang.Object obj62 = tabelaHash48.pesquisa("hi!");
        ds.TabelaHash tabelaHash64 = new ds.TabelaHash();
        tabelaHash64.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash48.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash48.retira("hi!");
        java.lang.Object obj72 = tabelaHash48.pesquisa("hi!");
        tabelaHash32.insere("hi!", (java.lang.Object) tabelaHash48);
        java.lang.Object obj75 = tabelaHash32.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (-1.0d) + "'", obj37, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 10 + "'", obj44, 10);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 10 + "'", obj46, 10);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (-1.0d) + "'", obj53, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 10 + "'", obj60, 10);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + 10 + "'", obj75, 10);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj23 = tabelaHash18.pesquisa("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash25.retira("hi!");
        tabelaHash25.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash25);
        tabelaHash25.imprime();
        java.lang.Object obj35 = tabelaHash25.pesquisa("hi!");
        java.lang.Object obj37 = tabelaHash25.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj37);
        java.lang.Object obj40 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0d) + "'", obj23, (-1.0d));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj40);
    }

    @Ignore
    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("hi!");
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj33 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.retira("hi!");
        tabelaHash28.insere("", (java.lang.Object) 10);
        java.lang.Object obj40 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        tabelaHash28.retira("");
        tabelaHash28.imprime();
        java.lang.Object obj46 = tabelaHash28.pesquisa("");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj53 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.retira("hi!");
        tabelaHash48.imprime();
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj63 = tabelaHash58.pesquisa("hi!");
        tabelaHash58.retira("hi!");
        tabelaHash58.insere("", (java.lang.Object) 10);
        java.lang.Object obj70 = tabelaHash58.pesquisa("");
        tabelaHash58.imprime();
        tabelaHash48.insere("hi!", (java.lang.Object) tabelaHash58);
        java.lang.Class<?> wildcardClass73 = tabelaHash48.getClass();
        tabelaHash28.insere("hi!", (java.lang.Object) wildcardClass73);
        tabelaHash0.insere("", (java.lang.Object) wildcardClass73);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10 + "'", obj12, 10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (-1.0d) + "'", obj33, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 10 + "'", obj40, 10);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (-1.0d) + "'", obj53, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (-1.0d) + "'", obj63, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + 10 + "'", obj70, 10);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash5.retira("hi!");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.insere("", (java.lang.Object) 0);
        tabelaHash16.retira("hi!");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        java.lang.Object obj33 = tabelaHash16.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        java.lang.Object obj36 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) 0);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash23.retira("hi!");
        java.lang.Object obj30 = tabelaHash23.pesquisa("");
        java.lang.Object obj32 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        java.lang.Object obj35 = tabelaHash23.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj44 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.retira("hi!");
        tabelaHash39.imprime();
        java.lang.Class<?> wildcardClass48 = tabelaHash39.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass48);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0d) + "'", obj15, (-1.0d));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (-1.0d) + "'", obj44, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0);
        tabelaHash0.retira("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj22 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.retira("hi!");
        tabelaHash17.insere("", (java.lang.Object) 10);
        java.lang.Object obj29 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        tabelaHash17.retira("");
        tabelaHash17.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj41 = tabelaHash36.pesquisa("");
        java.lang.Object obj43 = tabelaHash36.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj46 = null;
        tabelaHash0.insere("hi!", obj46);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1.0d) + "'", obj22, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 10 + "'", obj29, 10);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = null;
        tabelaHash0.insere("hi!", obj11);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash14.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash20.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash20.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash20.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        java.lang.Object obj20 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash13.retira("hi!");
        java.lang.Object obj25 = tabelaHash13.pesquisa("");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj32 = tabelaHash27.pesquisa("");
        java.lang.Object obj34 = tabelaHash27.pesquisa("");
        tabelaHash27.imprime();
        tabelaHash27.retira("hi!");
        java.lang.Object obj39 = tabelaHash27.pesquisa("hi!");
        java.lang.Object obj41 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.insere("", (java.lang.Object) (byte) 0);
        tabelaHash27.retira("");
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash27);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj9 = tabelaHash4.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash4.pesquisa("");
        tabelaHash4.retira("hi!");
        java.lang.Object obj15 = tabelaHash4.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash4.insere("", (java.lang.Object) (-1.0d));
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        java.lang.Object obj24 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.insere("", (java.lang.Object) 0);
        tabelaHash16.retira("");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj32 = tabelaHash16.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (-1.0d) + "'", obj32, (-1.0d));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass20 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0 + "'", obj17, 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash11.pesquisa("");
        tabelaHash11.insere("", (java.lang.Object) 0);
        tabelaHash11.retira("");
        java.lang.Object obj25 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        java.lang.Object obj30 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj32 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj39 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.retira("hi!");
        tabelaHash34.insere("", (java.lang.Object) 10);
        java.lang.Object obj46 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        tabelaHash34.retira("");
        tabelaHash34.imprime();
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        tabelaHash52.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj57 = tabelaHash52.pesquisa("hi!");
        tabelaHash52.insere("", (java.lang.Object) (byte) 0);
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        tabelaHash62.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj67 = tabelaHash62.pesquisa("hi!");
        java.lang.Object obj69 = tabelaHash62.pesquisa("");
        ds.TabelaHash tabelaHash71 = new ds.TabelaHash();
        tabelaHash62.insere("", (java.lang.Object) tabelaHash71);
        tabelaHash52.insere("hi!", (java.lang.Object) "");
        tabelaHash34.insere("", (java.lang.Object) "");
        java.lang.Object obj76 = tabelaHash34.pesquisa("hi!");
        ds.TabelaHash tabelaHash78 = new ds.TabelaHash();
        tabelaHash78.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj83 = tabelaHash78.pesquisa("hi!");
        java.lang.Object obj85 = tabelaHash78.pesquisa("");
        tabelaHash78.insere("", (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass89 = tabelaHash78.getClass();
        tabelaHash34.insere("", (java.lang.Object) wildcardClass89);
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0d) + "'", obj16, (-1.0d));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0d) + "'", obj30, (-1.0d));
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1.0d) + "'", obj39, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 10 + "'", obj46, 10);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (-1.0d) + "'", obj57, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + (-1.0d) + "'", obj67, (-1.0d));
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + (-1.0d) + "'", obj83, (-1.0d));
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) 0);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj24 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.retira("hi!");
        tabelaHash19.insere("", (java.lang.Object) 10);
        java.lang.Object obj31 = tabelaHash19.pesquisa("");
        java.lang.Object obj33 = tabelaHash19.pesquisa("hi!");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash19.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash19.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj49 = tabelaHash44.pesquisa("hi!");
        java.lang.Object obj51 = tabelaHash44.pesquisa("");
        tabelaHash44.insere("", (java.lang.Object) 0);
        tabelaHash44.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash44);
        tabelaHash44.imprime();
        java.lang.Class<?> wildcardClass59 = tabelaHash44.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0d) + "'", obj24, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 10 + "'", obj31, 10);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (-1.0d) + "'", obj49, (-1.0d));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash0.retira("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj32 = tabelaHash27.pesquisa("");
        java.lang.Object obj34 = tabelaHash27.pesquisa("");
        tabelaHash27.imprime();
        tabelaHash27.retira("hi!");
        tabelaHash27.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash27);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash27.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10 + "'", obj12, 10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("hi!");
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj31 = tabelaHash26.pesquisa("");
        java.lang.Object obj33 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash26.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash26);
        tabelaHash0.retira("");
        java.lang.Object obj41 = null;
        tabelaHash0.insere("", obj41);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10 + "'", obj12, 10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj14 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj16 = tabelaHash9.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) tabelaHash18);
        tabelaHash9.retira("hi!");
        java.lang.Object obj23 = tabelaHash9.pesquisa("");
        java.lang.Object obj25 = tabelaHash9.pesquisa("");
        tabelaHash0.insere("", obj25);
        java.lang.Object obj28 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj17 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj19 = tabelaHash12.pesquisa("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash21.retira("hi!");
        java.lang.Object obj28 = tabelaHash21.pesquisa("");
        java.lang.Object obj30 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) (byte) 1);
        tabelaHash21.retira("hi!");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash21);
        java.lang.Object obj39 = tabelaHash21.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj47 = tabelaHash42.pesquisa("hi!");
        tabelaHash42.retira("hi!");
        tabelaHash42.insere("", (java.lang.Object) 10);
        java.lang.Object obj54 = tabelaHash42.pesquisa("");
        java.lang.Object obj56 = tabelaHash42.pesquisa("");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj63 = tabelaHash58.pesquisa("hi!");
        tabelaHash58.retira("hi!");
        tabelaHash58.insere("", (java.lang.Object) 10);
        java.lang.Object obj70 = tabelaHash58.pesquisa("");
        java.lang.Object obj72 = tabelaHash58.pesquisa("hi!");
        ds.TabelaHash tabelaHash74 = new ds.TabelaHash();
        tabelaHash74.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash58.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash58.retira("hi!");
        java.lang.Object obj82 = tabelaHash58.pesquisa("hi!");
        tabelaHash42.insere("hi!", (java.lang.Object) tabelaHash58);
        tabelaHash21.insere("", (java.lang.Object) tabelaHash58);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0d) + "'", obj17, (-1.0d));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1.0d) + "'", obj47, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 10 + "'", obj54, 10);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 10 + "'", obj56, 10);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (-1.0d) + "'", obj63, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + 10 + "'", obj70, 10);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj82);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) 0);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj24 = tabelaHash19.pesquisa("hi!");
        java.lang.Object obj26 = tabelaHash19.pesquisa("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) tabelaHash28);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj36 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.retira("hi!");
        tabelaHash31.insere("", (java.lang.Object) 10);
        tabelaHash31.insere("", (java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass45 = tabelaHash31.getClass();
        tabelaHash19.insere("", (java.lang.Object) tabelaHash31);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass49 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0d) + "'", obj24, (-1.0d));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (-1.0d) + "'", obj36, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) 0);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash15.retira("hi!");
        tabelaHash15.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash35.retira("hi!");
        tabelaHash35.imprime();
        tabelaHash30.insere("hi!", (java.lang.Object) tabelaHash35);
        tabelaHash30.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj47 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash49.imprime();
        tabelaHash49.retira("hi!");
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash49);
        java.lang.Class<?> wildcardClass59 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (byte) 0 + "'", obj47, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash12.retira("hi!");
        java.lang.Object obj19 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj29 = tabelaHash24.pesquisa("hi!");
        java.lang.Object obj31 = tabelaHash24.pesquisa("");
        tabelaHash24.insere("", (java.lang.Object) 0);
        tabelaHash24.retira("hi!");
        tabelaHash24.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash24);
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj45 = tabelaHash40.pesquisa("");
        java.lang.Object obj47 = tabelaHash40.pesquisa("");
        tabelaHash40.imprime();
        tabelaHash40.retira("hi!");
        java.lang.Object obj52 = tabelaHash40.pesquisa("hi!");
        java.lang.Object obj54 = tabelaHash40.pesquisa("hi!");
        java.lang.Object obj56 = null;
        tabelaHash40.insere("", obj56);
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        java.lang.Object obj61 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10 + "'", obj12, 10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1.0d) + "'", obj29, (-1.0d));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 10 + "'", obj61, 10);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.insere("", (java.lang.Object) 0);
        tabelaHash16.retira("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj35 = tabelaHash30.pesquisa("");
        java.lang.Object obj37 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        tabelaHash30.retira("hi!");
        java.lang.Object obj42 = tabelaHash30.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) tabelaHash30);
        tabelaHash16.imprime();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash7.imprime();
        java.lang.Class<?> wildcardClass47 = tabelaHash7.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash9.retira("hi!");
        java.lang.Object obj16 = tabelaHash9.pesquisa("");
        java.lang.Object obj18 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        java.lang.Class<?> wildcardClass21 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.retira("hi!");
        tabelaHash10.insere("", (java.lang.Object) 10);
        java.lang.Object obj22 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj26 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0d) + "'", obj15, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10 + "'", obj22, 10);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash7.imprime();
        java.lang.Object obj17 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        java.lang.Class<?> wildcardClass20 = tabelaHash7.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash5.retira("hi!");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        java.lang.Object obj21 = tabelaHash14.pesquisa("");
        tabelaHash14.insere("", (java.lang.Object) 0);
        tabelaHash14.retira("hi!");
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.insere("", (java.lang.Object) (byte) 0);
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.insere("hi!", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash45.retira("hi!");
        tabelaHash45.imprime();
        tabelaHash40.insere("hi!", (java.lang.Object) tabelaHash45);
        tabelaHash40.retira("hi!");
        tabelaHash30.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash14.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash14.retira("");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0d) + "'", obj19, (-1.0d));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (-1.0d) + "'", obj35, (-1.0d));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj22 = tabelaHash17.pesquisa("");
        java.lang.Object obj24 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        tabelaHash17.retira("hi!");
        java.lang.Object obj29 = tabelaHash17.pesquisa("hi!");
        java.lang.Object obj31 = tabelaHash17.pesquisa("hi!");
        java.lang.Object obj33 = null;
        tabelaHash17.insere("", obj33);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj41 = tabelaHash36.pesquisa("hi!");
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash36);
        java.lang.Object obj44 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        java.lang.Object obj47 = tabelaHash36.pesquisa("hi!");
        java.lang.Class<?> wildcardClass48 = tabelaHash36.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash36);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (-1.0d) + "'", obj41, (-1.0d));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1.0d) + "'", obj47, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) 0);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj24 = tabelaHash19.pesquisa("hi!");
        java.lang.Object obj26 = tabelaHash19.pesquisa("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) tabelaHash28);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj36 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.retira("hi!");
        tabelaHash31.insere("", (java.lang.Object) 10);
        tabelaHash31.insere("", (java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass45 = tabelaHash31.getClass();
        tabelaHash19.insere("", (java.lang.Object) tabelaHash31);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj49 = tabelaHash19.pesquisa("hi!");
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj56 = tabelaHash51.pesquisa("");
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash51);
        tabelaHash51.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0d) + "'", obj24, (-1.0d));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (-1.0d) + "'", obj36, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (-1.0d) + "'", obj49, (-1.0d));
        org.junit.Assert.assertNull(obj56);
    }

    @Ignore
    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj18 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.retira("hi!");
        tabelaHash13.insere("", (java.lang.Object) 10);
        java.lang.Object obj25 = tabelaHash13.pesquisa("");
        java.lang.Object obj27 = tabelaHash13.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash13.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash13.retira("hi!");
        java.lang.Object obj37 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj46 = tabelaHash41.pesquisa("hi!");
        tabelaHash41.retira("hi!");
        tabelaHash41.insere("", (java.lang.Object) 10);
        java.lang.Object obj53 = tabelaHash41.pesquisa("");
        tabelaHash41.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash41);
        tabelaHash41.imprime();
        java.lang.Class<?> wildcardClass57 = tabelaHash41.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash41);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash41.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0d) + "'", obj18, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 10 + "'", obj25, 10);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (-1.0d) + "'", obj46, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 10 + "'", obj53, 10);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj23 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.insere("", (java.lang.Object) (byte) 0);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj33 = tabelaHash28.pesquisa("hi!");
        java.lang.Object obj35 = tabelaHash28.pesquisa("");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash37);
        tabelaHash18.insere("hi!", (java.lang.Object) "");
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object obj42 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj49 = tabelaHash44.pesquisa("hi!");
        java.lang.Object obj51 = tabelaHash44.pesquisa("");
        tabelaHash44.insere("", (java.lang.Object) 0);
        java.lang.Class<?> wildcardClass55 = tabelaHash44.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass55);
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10 + "'", obj12, 10);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0d) + "'", obj23, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (-1.0d) + "'", obj33, (-1.0d));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (-1.0d) + "'", obj49, (-1.0d));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("hi!");
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj33 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.retira("hi!");
        tabelaHash28.insere("", (java.lang.Object) 10);
        java.lang.Object obj40 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash28);
        tabelaHash28.imprime();
        java.lang.Object obj45 = tabelaHash28.pesquisa("hi!");
        java.lang.Object obj47 = null;
        tabelaHash28.insere("hi!", obj47);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10 + "'", obj12, 10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (-1.0d) + "'", obj33, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 10 + "'", obj40, 10);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash5.retira("hi!");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.insere("", (java.lang.Object) 0);
        tabelaHash16.retira("hi!");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        java.lang.Object obj33 = tabelaHash16.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj41 = tabelaHash36.pesquisa("");
        java.lang.Object obj43 = tabelaHash36.pesquisa("");
        java.lang.Object obj45 = tabelaHash36.pesquisa("hi!");
        java.lang.Class<?> wildcardClass46 = tabelaHash36.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass46);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (-1.0d) + "'", obj45, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        java.lang.Object obj12 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash5.retira("hi!");
        java.lang.Object obj17 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj19 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj21 = null;
        tabelaHash5.insere("", obj21);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj29 = tabelaHash24.pesquisa("hi!");
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash24);
        java.lang.Object obj32 = tabelaHash24.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash24.retira("hi!");
        tabelaHash24.imprime();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1.0d) + "'", obj29, (-1.0d));
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash7.imprime();
        java.lang.Object obj17 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash21);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj14 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash16.retira("hi!");
        tabelaHash16.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash25.imprime();
        tabelaHash25.retira("hi!");
        tabelaHash9.insere("", (java.lang.Object) tabelaHash25);
        java.lang.Object obj34 = tabelaHash9.pesquisa("");
        java.lang.Object obj36 = tabelaHash9.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object obj41 = tabelaHash39.pesquisa("");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj48 = tabelaHash43.pesquisa("hi!");
        java.lang.Object obj50 = tabelaHash43.pesquisa("");
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        tabelaHash43.insere("", (java.lang.Object) tabelaHash52);
        tabelaHash43.retira("hi!");
        java.lang.Object obj57 = tabelaHash43.pesquisa("");
        tabelaHash39.insere("hi!", (java.lang.Object) "");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash39);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (-1.0d) + "'", obj48, (-1.0d));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(obj57);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash11.pesquisa("");
        tabelaHash11.insere("", (java.lang.Object) 0);
        tabelaHash11.retira("");
        java.lang.Object obj25 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        java.lang.Object obj30 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj32 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0d) + "'", obj16, (-1.0d));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0d) + "'", obj30, (-1.0d));
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = null;
        tabelaHash0.insere("", obj16);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj24 = tabelaHash19.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj34 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.retira("hi!");
        tabelaHash29.insere("", (java.lang.Object) 10);
        java.lang.Object obj41 = tabelaHash29.pesquisa("");
        java.lang.Object obj43 = tabelaHash29.pesquisa("hi!");
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash29.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash29.retira("hi!");
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        tabelaHash53.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj58 = tabelaHash53.pesquisa("hi!");
        java.lang.Object obj60 = tabelaHash53.pesquisa("");
        tabelaHash53.insere("", (java.lang.Object) 0);
        tabelaHash53.retira("hi!");
        tabelaHash53.imprime();
        tabelaHash29.insere("", (java.lang.Object) tabelaHash53);
        ds.TabelaHash tabelaHash69 = new ds.TabelaHash();
        tabelaHash69.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj74 = tabelaHash69.pesquisa("");
        java.lang.Object obj76 = tabelaHash69.pesquisa("");
        tabelaHash69.imprime();
        tabelaHash69.retira("hi!");
        java.lang.Object obj81 = tabelaHash69.pesquisa("hi!");
        java.lang.Object obj83 = tabelaHash69.pesquisa("hi!");
        java.lang.Object obj85 = null;
        tabelaHash69.insere("", obj85);
        tabelaHash29.insere("", (java.lang.Object) "");
        java.lang.Object obj89 = tabelaHash29.pesquisa("");
        java.lang.Class<?> wildcardClass90 = tabelaHash29.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash29);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0d) + "'", obj24, (-1.0d));
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (-1.0d) + "'", obj34, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 10 + "'", obj41, 10);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (-1.0d) + "'", obj58, (-1.0d));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertEquals("'" + obj89 + "' != '" + 10 + "'", obj89, 10);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10);
        tabelaHash0.insere("", (java.lang.Object) (-1));
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10 + "'", obj16, 10);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash11.pesquisa("");
        tabelaHash11.insere("", (java.lang.Object) 0);
        tabelaHash11.retira("");
        java.lang.Object obj25 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj34 = tabelaHash29.pesquisa("hi!");
        java.lang.Object obj36 = tabelaHash29.pesquisa("");
        tabelaHash29.insere("", (java.lang.Object) 0);
        tabelaHash29.retira("");
        java.lang.Object obj43 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash29);
        java.lang.Object obj47 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj55 = tabelaHash50.pesquisa("");
        java.lang.Object obj57 = tabelaHash50.pesquisa("");
        java.lang.Object obj59 = tabelaHash50.pesquisa("hi!");
        java.lang.Object obj61 = tabelaHash50.pesquisa("");
        tabelaHash50.imprime();
        tabelaHash50.insere("", (java.lang.Object) "");
        tabelaHash11.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0d) + "'", obj16, (-1.0d));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (-1.0d) + "'", obj34, (-1.0d));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1.0d) + "'", obj47, (-1.0d));
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (-1.0d) + "'", obj59, (-1.0d));
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash5.retira("hi!");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.insere("", (java.lang.Object) 0);
        tabelaHash16.retira("hi!");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        java.lang.Object obj33 = tabelaHash16.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj43 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.retira("hi!");
        tabelaHash38.insere("", (java.lang.Object) 10);
        tabelaHash38.insere("", (java.lang.Object) (-1));
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        tabelaHash53.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj58 = tabelaHash53.pesquisa("hi!");
        java.lang.Object obj60 = tabelaHash53.pesquisa("");
        tabelaHash53.insere("", (java.lang.Object) 0);
        tabelaHash53.retira("hi!");
        tabelaHash53.imprime();
        tabelaHash53.retira("");
        tabelaHash38.insere("hi!", (java.lang.Object) tabelaHash53);
        tabelaHash53.imprime();
        tabelaHash53.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash53);
        java.lang.Class<?> wildcardClass73 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1.0d) + "'", obj43, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (-1.0d) + "'", obj58, (-1.0d));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash11.pesquisa("");
        tabelaHash11.insere("", (java.lang.Object) 0);
        tabelaHash11.retira("");
        java.lang.Object obj25 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash11.imprime();
        java.lang.Object obj30 = tabelaHash11.pesquisa("");
        java.lang.Object obj32 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1.0d) + "'", obj16, (-1.0d));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj22 = tabelaHash17.pesquisa("");
        java.lang.Object obj24 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        tabelaHash17.retira("hi!");
        java.lang.Object obj29 = tabelaHash17.pesquisa("hi!");
        java.lang.Object obj31 = tabelaHash17.pesquisa("hi!");
        java.lang.Object obj33 = null;
        tabelaHash17.insere("", obj33);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj41 = tabelaHash36.pesquisa("hi!");
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash36);
        java.lang.Object obj44 = tabelaHash36.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash36);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash12.retira("");
        java.lang.Class<?> wildcardClass49 = tabelaHash12.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (-1.0d) + "'", obj41, (-1.0d));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        java.lang.Object obj21 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash14.retira("hi!");
        java.lang.Object obj26 = tabelaHash14.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash14);
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj36 = tabelaHash31.pesquisa("");
        java.lang.Object obj38 = tabelaHash31.pesquisa("");
        java.lang.Object obj40 = tabelaHash31.pesquisa("");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj47 = tabelaHash42.pesquisa("hi!");
        java.lang.Object obj49 = tabelaHash42.pesquisa("");
        tabelaHash42.insere("", (java.lang.Object) 0);
        tabelaHash42.retira("");
        java.lang.Object obj56 = tabelaHash42.pesquisa("");
        tabelaHash42.imprime();
        tabelaHash31.insere("", (java.lang.Object) tabelaHash42);
        tabelaHash42.imprime();
        java.lang.Object obj61 = tabelaHash42.pesquisa("hi!");
        java.lang.Class<?> wildcardClass62 = obj61.getClass();
        tabelaHash0.insere("", obj61);
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0 + "'", obj29, 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1.0d) + "'", obj47, (-1.0d));
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (-1.0d) + "'", obj61, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj28 = tabelaHash23.pesquisa("hi!");
        java.lang.Object obj30 = tabelaHash23.pesquisa("");
        java.lang.Class<?> wildcardClass31 = tabelaHash23.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass31);
        java.lang.Class<?> wildcardClass33 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10 + "'", obj12, 10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1.0d) + "'", obj28, (-1.0d));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 0);
        tabelaHash0.retira("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj22 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.retira("hi!");
        tabelaHash17.insere("", (java.lang.Object) 10);
        java.lang.Object obj29 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        tabelaHash17.retira("");
        tabelaHash17.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        java.lang.Object obj36 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1.0d) + "'", obj22, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 10 + "'", obj29, 10);
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) 0);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash15.retira("hi!");
        tabelaHash15.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj32 = tabelaHash27.pesquisa("hi!");
        java.lang.Object obj34 = tabelaHash27.pesquisa("");
        tabelaHash27.insere("", (java.lang.Object) 0);
        tabelaHash27.retira("hi!");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj46 = tabelaHash41.pesquisa("");
        java.lang.Object obj48 = tabelaHash41.pesquisa("");
        tabelaHash41.imprime();
        tabelaHash41.retira("hi!");
        java.lang.Object obj53 = tabelaHash41.pesquisa("hi!");
        tabelaHash27.insere("", (java.lang.Object) tabelaHash41);
        tabelaHash27.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash27);
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj63 = tabelaHash58.pesquisa("");
        java.lang.Object obj65 = tabelaHash58.pesquisa("");
        tabelaHash58.imprime();
        tabelaHash58.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash58);
        java.lang.Object obj70 = tabelaHash58.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (-1.0d) + "'", obj32, (-1.0d));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + (-1.0d) + "'", obj70, (-1.0d));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash5.retira("hi!");
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.insere("", (java.lang.Object) 0);
        tabelaHash16.retira("hi!");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        java.lang.Object obj33 = tabelaHash16.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        java.lang.Object obj36 = tabelaHash16.pesquisa("hi!");
        java.lang.Class<?> wildcardClass37 = tabelaHash16.getClass();
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1.0d) + "'", obj14, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) 0);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash23.retira("hi!");
        java.lang.Object obj30 = tabelaHash23.pesquisa("");
        java.lang.Object obj32 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        java.lang.Object obj35 = tabelaHash23.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash38);
        java.lang.Object obj41 = tabelaHash38.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0d) + "'", obj15, (-1.0d));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj23 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.insere("", (java.lang.Object) (byte) 0);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj33 = tabelaHash28.pesquisa("hi!");
        java.lang.Object obj35 = tabelaHash28.pesquisa("");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash37);
        tabelaHash18.insere("hi!", (java.lang.Object) "");
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object obj42 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj46 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass47 = obj46.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10 + "'", obj12, 10);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0d) + "'", obj23, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (-1.0d) + "'", obj33, (-1.0d));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "" + "'", obj42, "");
        org.junit.Assert.assertNull(obj46);
    }

    @Ignore
    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash9.retira("hi!");
        java.lang.Object obj16 = tabelaHash9.pesquisa("");
        java.lang.Object obj18 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) (byte) 1);
        tabelaHash9.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash27.retira("hi!");
        java.lang.Object obj34 = tabelaHash27.pesquisa("");
        java.lang.Object obj36 = tabelaHash27.pesquisa("");
        tabelaHash27.imprime();
        java.lang.Object obj39 = tabelaHash27.pesquisa("");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj46 = tabelaHash41.pesquisa("hi!");
        java.lang.Object obj48 = tabelaHash41.pesquisa("");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash41.insere("", (java.lang.Object) tabelaHash50);
        java.lang.Object obj53 = null;
        tabelaHash41.insere("hi!", obj53);
        tabelaHash27.insere("hi!", obj53);
        tabelaHash9.insere("hi!", (java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash9.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (-1.0d) + "'", obj46, (-1.0d));
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1L));
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1.0d) + "'", obj5, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10 + "'", obj12, 10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) 0);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj24 = tabelaHash19.pesquisa("hi!");
        java.lang.Object obj26 = tabelaHash19.pesquisa("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) tabelaHash28);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj36 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.retira("hi!");
        tabelaHash31.insere("", (java.lang.Object) 10);
        tabelaHash31.insere("", (java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass45 = tabelaHash31.getClass();
        tabelaHash19.insere("", (java.lang.Object) tabelaHash31);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj49 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.insere("hi!", (java.lang.Object) (byte) 0);
        java.lang.Object obj54 = tabelaHash19.pesquisa("");
        tabelaHash19.retira("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0d) + "'", obj24, (-1.0d));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (-1.0d) + "'", obj36, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (-1.0d) + "'", obj49, (-1.0d));
        org.junit.Assert.assertNotNull(obj54);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj17 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj19 = tabelaHash12.pesquisa("");
        java.lang.Object obj21 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash25.retira("hi!");
        java.lang.Object obj32 = tabelaHash25.pesquisa("");
        java.lang.Object obj34 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) (byte) 1);
        tabelaHash25.retira("hi!");
        java.lang.Object obj42 = tabelaHash25.pesquisa("hi!");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash25);
        java.lang.Object obj45 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj48 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0d) + "'", obj17, (-1.0d));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0d) + "'", obj23, (-1.0d));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(obj48);
    }
}

