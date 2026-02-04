package ds.seed5838;

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
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash10.insere("hi!", (java.lang.Object) 1);
        java.lang.Class<?> wildcardClass19 = tabelaHash10.getClass();
        tabelaHash8.insere("", (java.lang.Object) wildcardClass19);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass29 = tabelaHash25.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass29);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1L);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1L + "'", obj12, 1L);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1L + "'", obj14, 1L);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1L + "'", obj18, 1L);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (byte) 0);
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = null;
        tabelaHash10.insere("hi!", obj12);
        tabelaHash10.retira("hi!");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        java.lang.Object obj19 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.insere("", (java.lang.Object) (-1.0f));
        tabelaHash10.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = null;
        tabelaHash27.insere("hi!", obj29);
        tabelaHash27.retira("hi!");
        java.lang.Object obj34 = tabelaHash27.pesquisa("");
        java.lang.Object obj36 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.insere("", (java.lang.Object) 10.0d);
        tabelaHash27.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash27);
        java.lang.Object obj44 = tabelaHash27.pesquisa("");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) (byte) 0);
        tabelaHash13.imprime();
        java.lang.Object obj19 = tabelaHash13.pesquisa("hi!");
        java.lang.Class<?> wildcardClass20 = tabelaHash13.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        java.lang.Object obj23 = tabelaHash13.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1L);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = null;
        tabelaHash10.insere("hi!", obj12);
        tabelaHash10.retira("hi!");
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.imprime();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (byte) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash22);
        tabelaHash18.insere("hi!", (java.lang.Object) 1);
        tabelaHash18.imprime();
        java.lang.Object obj29 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.retira("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) (byte) 0);
        tabelaHash33.insere("", (java.lang.Object) (short) 10);
        tabelaHash33.imprime();
        tabelaHash33.retira("");
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash33);
        java.lang.Object obj45 = tabelaHash18.pesquisa("");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object obj49 = null;
        tabelaHash47.insere("hi!", obj49);
        tabelaHash47.retira("hi!");
        tabelaHash47.insere("", (java.lang.Object) 1L);
        java.lang.Object obj57 = tabelaHash47.pesquisa("");
        tabelaHash47.imprime();
        tabelaHash47.imprime();
        tabelaHash47.imprime();
        tabelaHash47.imprime();
        tabelaHash47.imprime();
        tabelaHash47.imprime();
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        java.lang.Object obj67 = tabelaHash65.pesquisa("hi!");
        ds.TabelaHash tabelaHash69 = new ds.TabelaHash();
        tabelaHash65.insere("hi!", (java.lang.Object) tabelaHash69);
        tabelaHash65.insere("hi!", (java.lang.Object) 1);
        tabelaHash65.imprime();
        java.lang.Object obj76 = tabelaHash65.pesquisa("hi!");
        tabelaHash65.retira("hi!");
        ds.TabelaHash tabelaHash80 = new ds.TabelaHash();
        tabelaHash80.insere("", (java.lang.Object) (byte) 0);
        tabelaHash80.insere("", (java.lang.Object) (short) 10);
        tabelaHash80.imprime();
        tabelaHash80.retira("");
        tabelaHash65.insere("hi!", (java.lang.Object) tabelaHash80);
        tabelaHash47.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash18.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 1L + "'", obj57, 1L);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(obj76);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash17);
        tabelaHash13.insere("hi!", (java.lang.Object) 1);
        tabelaHash13.imprime();
        java.lang.Object obj24 = tabelaHash13.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) -1);
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object obj8 = null;
        tabelaHash6.insere("hi!", obj8);
        tabelaHash6.retira("hi!");
        java.lang.Object obj13 = tabelaHash6.pesquisa("");
        tabelaHash0.insere("", obj13);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = null;
        tabelaHash16.insere("hi!", obj18);
        tabelaHash16.retira("hi!");
        tabelaHash16.insere("", (java.lang.Object) 1L);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = null;
        tabelaHash27.insere("hi!", obj29);
        tabelaHash27.retira("hi!");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = null;
        tabelaHash34.insere("hi!", obj36);
        tabelaHash34.retira("hi!");
        tabelaHash34.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash34);
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        java.lang.Object obj45 = null;
        tabelaHash43.insere("hi!", obj45);
        tabelaHash43.retira("hi!");
        tabelaHash43.insere("", (java.lang.Object) 1L);
        java.lang.Object obj53 = tabelaHash43.pesquisa("");
        tabelaHash43.imprime();
        java.lang.Class<?> wildcardClass55 = tabelaHash43.getClass();
        tabelaHash34.insere("hi!", (java.lang.Object) tabelaHash43);
        tabelaHash34.insere("", (java.lang.Object) (short) 100);
        java.lang.Object obj61 = tabelaHash34.pesquisa("");
        tabelaHash34.retira("");
        java.lang.Object obj65 = tabelaHash34.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 1L + "'", obj53, 1L);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (short) 100 + "'", obj61, (short) 100);
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 10 + "'", obj14, (short) 10);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object obj5 = null;
        tabelaHash3.insere("hi!", obj5);
        tabelaHash3.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = null;
        tabelaHash10.insere("hi!", obj12);
        tabelaHash10.retira("hi!");
        tabelaHash10.imprime();
        tabelaHash3.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash3.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash3);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash25);
        tabelaHash21.insere("hi!", (java.lang.Object) 1);
        tabelaHash21.imprime();
        java.lang.Object obj32 = tabelaHash21.pesquisa("");
        java.lang.Object obj34 = tabelaHash21.pesquisa("");
        java.lang.Object obj36 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj41 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash10.insere("hi!", (java.lang.Object) 1);
        java.lang.Class<?> wildcardClass19 = tabelaHash10.getClass();
        tabelaHash8.insere("", (java.lang.Object) wildcardClass19);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = null;
        tabelaHash24.insere("hi!", obj26);
        tabelaHash24.retira("hi!");
        tabelaHash24.insere("", (java.lang.Object) 1L);
        java.lang.Object obj34 = tabelaHash24.pesquisa("");
        java.lang.Object obj36 = tabelaHash24.pesquisa("");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = null;
        tabelaHash38.insere("hi!", obj40);
        tabelaHash38.retira("hi!");
        java.lang.Object obj45 = tabelaHash38.pesquisa("");
        tabelaHash38.imprime();
        tabelaHash24.insere("hi!", (java.lang.Object) tabelaHash38);
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        java.lang.Object obj55 = null;
        tabelaHash53.insere("hi!", obj55);
        tabelaHash53.retira("hi!");
        tabelaHash53.insere("", (java.lang.Object) 1L);
        java.lang.Object obj63 = tabelaHash53.pesquisa("");
        tabelaHash53.imprime();
        tabelaHash53.imprime();
        tabelaHash53.imprime();
        tabelaHash49.insere("hi!", (java.lang.Object) tabelaHash53);
        tabelaHash49.insere("hi!", (java.lang.Object) (-1.0f));
        tabelaHash49.insere("", (java.lang.Object) 100);
        tabelaHash49.retira("");
        tabelaHash38.insere("", (java.lang.Object) "");
        java.lang.Object obj78 = tabelaHash38.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj78);
        java.lang.Class<?> wildcardClass80 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 1L + "'", obj34, 1L);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 1L + "'", obj36, 1L);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 1L + "'", obj63, 1L);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = null;
        tabelaHash7.insere("hi!", obj9);
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash20.insere("hi!", (java.lang.Object) 1);
        tabelaHash20.imprime();
        java.lang.Object obj31 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        java.lang.Object obj34 = tabelaHash20.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1L);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = null;
        tabelaHash14.insere("hi!", obj16);
        tabelaHash14.retira("hi!");
        java.lang.Object obj21 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = null;
        tabelaHash29.insere("hi!", obj31);
        tabelaHash29.retira("hi!");
        java.lang.Object obj36 = tabelaHash29.pesquisa("");
        java.lang.Object obj38 = tabelaHash29.pesquisa("hi!");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = null;
        tabelaHash40.insere("hi!", obj42);
        tabelaHash40.retira("hi!");
        tabelaHash40.insere("", (java.lang.Object) 1L);
        java.lang.Object obj50 = tabelaHash40.pesquisa("");
        java.lang.Object obj52 = tabelaHash40.pesquisa("");
        tabelaHash29.insere("hi!", (java.lang.Object) "");
        tabelaHash25.insere("", (java.lang.Object) "");
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash25);
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        java.lang.Object obj61 = null;
        tabelaHash59.insere("hi!", obj61);
        tabelaHash59.retira("hi!");
        java.lang.Object obj66 = tabelaHash59.pesquisa("");
        java.lang.Object obj68 = tabelaHash59.pesquisa("hi!");
        tabelaHash59.insere("", (java.lang.Object) 10.0d);
        tabelaHash25.insere("", (java.lang.Object) 10.0d);
        ds.TabelaHash tabelaHash74 = new ds.TabelaHash();
        java.lang.Object obj76 = null;
        tabelaHash74.insere("hi!", obj76);
        tabelaHash74.retira("hi!");
        java.lang.Object obj81 = tabelaHash74.pesquisa("");
        tabelaHash25.insere("hi!", obj81);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1L + "'", obj12, 1L);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 1L + "'", obj50, 1L);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 1L + "'", obj52, 1L);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = null;
        tabelaHash11.insere("hi!", obj13);
        tabelaHash11.retira("hi!");
        java.lang.Object obj18 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass22 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = null;
        tabelaHash11.insere("hi!", obj13);
        tabelaHash11.retira("hi!");
        tabelaHash11.insere("", (java.lang.Object) 1L);
        java.lang.Object obj21 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = null;
        tabelaHash31.insere("hi!", obj33);
        tabelaHash31.retira("hi!");
        tabelaHash31.insere("", (java.lang.Object) 1L);
        java.lang.Object obj41 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash31);
        tabelaHash7.insere("", (java.lang.Object) tabelaHash27);
        java.lang.Object obj48 = tabelaHash7.pesquisa("hi!");
        tabelaHash4.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash4.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1L + "'", obj21, 1L);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 1L + "'", obj41, 1L);
        org.junit.Assert.assertNotNull(obj48);
    }

    @Ignore
    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = null;
        tabelaHash11.insere("hi!", obj13);
        tabelaHash11.retira("hi!");
        java.lang.Object obj18 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object obj24 = null;
        tabelaHash22.insere("hi!", obj24);
        tabelaHash22.retira("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = null;
        tabelaHash29.insere("hi!", obj31);
        tabelaHash29.retira("hi!");
        tabelaHash29.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) tabelaHash29);
        java.lang.Class<?> wildcardClass37 = tabelaHash29.getClass();
        tabelaHash11.insere("", (java.lang.Object) wildcardClass37);
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = null;
        tabelaHash40.insere("hi!", obj42);
        tabelaHash40.retira("hi!");
        tabelaHash40.insere("", (java.lang.Object) 1L);
        java.lang.Object obj50 = tabelaHash40.pesquisa("");
        java.lang.Object obj52 = tabelaHash40.pesquisa("");
        tabelaHash40.imprime();
        java.lang.Object obj55 = tabelaHash40.pesquisa("");
        java.lang.Class<?> wildcardClass56 = tabelaHash40.getClass();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash40);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash40.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 1L + "'", obj50, 1L);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 1L + "'", obj52, 1L);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 1L + "'", obj55, 1L);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1L);
        tabelaHash0.retira("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash18);
        tabelaHash14.insere("hi!", (java.lang.Object) 1);
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = null;
        tabelaHash25.insere("hi!", obj27);
        tabelaHash25.retira("hi!");
        java.lang.Object obj32 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash25);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = null;
        tabelaHash36.insere("hi!", obj38);
        tabelaHash36.retira("hi!");
        java.lang.Object obj43 = tabelaHash36.pesquisa("");
        java.lang.Object obj45 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.insere("", (java.lang.Object) 10.0d);
        tabelaHash36.retira("");
        java.lang.Class<?> wildcardClass51 = tabelaHash36.getClass();
        tabelaHash25.insere("", (java.lang.Object) tabelaHash36);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash25);
        java.lang.Object obj55 = tabelaHash25.pesquisa("hi!");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100 + "'", obj12, 100);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (byte) 0);
        java.lang.Object obj5 = null;
        tabelaHash0.insere("", obj5);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) 0 + "'", obj8, (byte) 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = obj13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object obj6 = null;
        tabelaHash4.insere("hi!", obj6);
        tabelaHash4.retira("hi!");
        tabelaHash4.insere("", (java.lang.Object) 1L);
        java.lang.Object obj14 = tabelaHash4.pesquisa("");
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = null;
        tabelaHash24.insere("hi!", obj26);
        tabelaHash24.retira("hi!");
        tabelaHash24.insere("", (java.lang.Object) 1L);
        java.lang.Object obj34 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        tabelaHash24.imprime();
        tabelaHash24.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object obj43 = tabelaHash41.pesquisa("hi!");
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash41.insere("hi!", (java.lang.Object) tabelaHash45);
        tabelaHash41.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        java.lang.Object obj53 = null;
        tabelaHash51.insere("hi!", obj53);
        tabelaHash51.retira("hi!");
        java.lang.Object obj58 = tabelaHash51.pesquisa("");
        tabelaHash41.insere("hi!", (java.lang.Object) "");
        tabelaHash41.retira("hi!");
        tabelaHash41.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash41);
        tabelaHash20.imprime();
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1L + "'", obj14, 1L);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 1L + "'", obj34, 1L);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1L);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = null;
        tabelaHash23.insere("hi!", obj25);
        tabelaHash23.retira("hi!");
        tabelaHash23.insere("", (java.lang.Object) 1L);
        java.lang.Object obj33 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash19.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj42 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1L + "'", obj12, 1L);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1L + "'", obj14, 1L);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1L + "'", obj17, 1L);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 1L + "'", obj33, 1L);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1L + "'", obj42, 1L);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object obj6 = null;
        tabelaHash4.insere("hi!", obj6);
        tabelaHash4.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = null;
        tabelaHash11.insere("hi!", obj13);
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash4.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        java.lang.Class<?> wildcardClass22 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = null;
        tabelaHash7.insere("hi!", obj9);
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = null;
        tabelaHash16.insere("hi!", obj18);
        tabelaHash16.retira("hi!");
        tabelaHash16.insere("", (java.lang.Object) 1L);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        java.lang.Class<?> wildcardClass28 = tabelaHash16.getClass();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj31 = tabelaHash7.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1L + "'", obj26, 1L);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = null;
        tabelaHash11.insere("hi!", obj13);
        tabelaHash11.retira("hi!");
        java.lang.Object obj18 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object obj25 = null;
        tabelaHash23.insere("hi!", obj25);
        tabelaHash23.retira("hi!");
        java.lang.Object obj30 = tabelaHash23.pesquisa("");
        java.lang.Object obj32 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.insere("", (java.lang.Object) (-1.0f));
        tabelaHash23.retira("");
        java.lang.Object obj39 = tabelaHash23.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash23);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) true);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash21);
        tabelaHash17.insere("hi!", (java.lang.Object) 1);
        tabelaHash17.imprime();
        java.lang.Class<?> wildcardClass27 = tabelaHash17.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = null;
        tabelaHash30.insere("hi!", obj32);
        tabelaHash30.retira("hi!");
        tabelaHash30.insere("", (java.lang.Object) 1L);
        java.lang.Object obj40 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        tabelaHash30.retira("");
        tabelaHash30.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1L + "'", obj40, 1L);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = null;
        tabelaHash11.insere("hi!", obj13);
        tabelaHash11.retira("hi!");
        tabelaHash11.insere("", (java.lang.Object) 1L);
        java.lang.Object obj21 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = null;
        tabelaHash31.insere("hi!", obj33);
        tabelaHash31.retira("hi!");
        tabelaHash31.insere("", (java.lang.Object) 1L);
        java.lang.Object obj41 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash31);
        tabelaHash7.insere("", (java.lang.Object) tabelaHash27);
        java.lang.Object obj48 = tabelaHash7.pesquisa("hi!");
        tabelaHash4.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object obj51 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.retira("hi!");
        java.lang.Object obj55 = tabelaHash7.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1L + "'", obj21, 1L);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 1L + "'", obj41, 1L);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(obj55);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) -1);
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object obj8 = null;
        tabelaHash6.insere("hi!", obj8);
        tabelaHash6.retira("hi!");
        java.lang.Object obj13 = tabelaHash6.pesquisa("");
        tabelaHash0.insere("", obj13);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = null;
        tabelaHash16.insere("hi!", obj18);
        tabelaHash16.retira("hi!");
        tabelaHash16.insere("", (java.lang.Object) 1L);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash16.retira("");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = null;
        tabelaHash34.insere("hi!", obj36);
        tabelaHash34.retira("hi!");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object obj43 = null;
        tabelaHash41.insere("hi!", obj43);
        tabelaHash41.retira("hi!");
        tabelaHash41.imprime();
        tabelaHash34.insere("hi!", (java.lang.Object) tabelaHash41);
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        java.lang.Object obj52 = null;
        tabelaHash50.insere("hi!", obj52);
        tabelaHash50.retira("hi!");
        tabelaHash50.insere("", (java.lang.Object) 1L);
        java.lang.Object obj60 = tabelaHash50.pesquisa("");
        tabelaHash50.imprime();
        java.lang.Class<?> wildcardClass62 = tabelaHash50.getClass();
        tabelaHash41.insere("hi!", (java.lang.Object) tabelaHash50);
        tabelaHash41.insere("", (java.lang.Object) (short) 100);
        java.lang.Object obj68 = tabelaHash41.pesquisa("");
        tabelaHash41.imprime();
        java.lang.Object obj71 = tabelaHash41.pesquisa("hi!");
        tabelaHash16.insere("", obj71);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1L + "'", obj26, 1L);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 1L + "'", obj60, 1L);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + (short) 100 + "'", obj68, (short) 100);
        org.junit.Assert.assertNotNull(obj71);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object obj6 = null;
        tabelaHash4.insere("hi!", obj6);
        tabelaHash4.retira("hi!");
        tabelaHash4.insere("", (java.lang.Object) 1L);
        java.lang.Object obj14 = tabelaHash4.pesquisa("");
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = null;
        tabelaHash20.insere("hi!", obj22);
        tabelaHash20.retira("hi!");
        java.lang.Object obj27 = tabelaHash20.pesquisa("");
        tabelaHash20.insere("", (java.lang.Object) 100);
        java.lang.Object obj32 = tabelaHash20.pesquisa("");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("hi!");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash34.insere("hi!", (java.lang.Object) tabelaHash38);
        tabelaHash34.insere("hi!", (java.lang.Object) 1);
        tabelaHash34.imprime();
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        java.lang.Object obj47 = null;
        tabelaHash45.insere("hi!", obj47);
        tabelaHash45.retira("hi!");
        java.lang.Object obj52 = tabelaHash45.pesquisa("");
        tabelaHash45.imprime();
        tabelaHash34.insere("hi!", (java.lang.Object) tabelaHash45);
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        java.lang.Object obj58 = null;
        tabelaHash56.insere("hi!", obj58);
        tabelaHash56.retira("hi!");
        java.lang.Object obj63 = tabelaHash56.pesquisa("");
        java.lang.Object obj65 = tabelaHash56.pesquisa("hi!");
        tabelaHash56.insere("", (java.lang.Object) 10.0d);
        tabelaHash56.retira("");
        java.lang.Class<?> wildcardClass71 = tabelaHash56.getClass();
        tabelaHash45.insere("", (java.lang.Object) tabelaHash56);
        tabelaHash20.insere("", (java.lang.Object) tabelaHash45);
        tabelaHash20.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass77 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1L + "'", obj14, 1L);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100 + "'", obj32, 100);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) -1);
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object obj8 = null;
        tabelaHash6.insere("hi!", obj8);
        tabelaHash6.retira("hi!");
        java.lang.Object obj13 = tabelaHash6.pesquisa("");
        tabelaHash0.insere("", obj13);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = null;
        tabelaHash16.insere("hi!", obj18);
        tabelaHash16.retira("hi!");
        tabelaHash16.insere("", (java.lang.Object) 1L);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = null;
        tabelaHash32.insere("hi!", obj34);
        tabelaHash32.retira("hi!");
        java.lang.Object obj39 = tabelaHash32.pesquisa("");
        tabelaHash32.insere("", (java.lang.Object) 100);
        java.lang.Object obj44 = tabelaHash32.pesquisa("");
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass45);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1L + "'", obj26, 1L);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 100 + "'", obj44, 100);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        java.lang.Object obj6 = null;
        tabelaHash0.insere("", obj6);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 0);
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 0 + "'", obj15, (short) 0);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = null;
        tabelaHash10.insere("hi!", obj12);
        tabelaHash10.retira("hi!");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass24 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = null;
        tabelaHash11.insere("hi!", obj13);
        tabelaHash11.retira("hi!");
        tabelaHash11.insere("", (java.lang.Object) 1L);
        java.lang.Object obj21 = tabelaHash11.pesquisa("");
        java.lang.Object obj23 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        java.lang.Object obj26 = tabelaHash11.pesquisa("");
        java.lang.Object obj28 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("hi!", obj28);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object obj43 = tabelaHash41.pesquisa("hi!");
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash41.insere("hi!", (java.lang.Object) tabelaHash45);
        tabelaHash41.insere("hi!", (java.lang.Object) 1);
        tabelaHash41.imprime();
        java.lang.Object obj52 = tabelaHash41.pesquisa("");
        tabelaHash41.imprime();
        java.lang.Object obj55 = tabelaHash41.pesquisa("hi!");
        tabelaHash41.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash41);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1L + "'", obj21, 1L);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1L + "'", obj23, 1L);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1L + "'", obj26, 1L);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1L + "'", obj28, 1L);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(obj55);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = null;
        tabelaHash14.insere("hi!", obj16);
        tabelaHash14.retira("hi!");
        java.lang.Object obj21 = tabelaHash14.pesquisa("");
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.insere("hi!", (java.lang.Object) (short) -1);
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = null;
        tabelaHash34.insere("hi!", obj36);
        tabelaHash34.retira("hi!");
        java.lang.Object obj41 = tabelaHash34.pesquisa("");
        tabelaHash28.insere("", obj41);
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object obj46 = tabelaHash44.pesquisa("hi!");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash44.insere("hi!", (java.lang.Object) tabelaHash48);
        tabelaHash44.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        java.lang.Object obj56 = null;
        tabelaHash54.insere("hi!", obj56);
        tabelaHash54.retira("hi!");
        java.lang.Object obj61 = tabelaHash54.pesquisa("");
        tabelaHash44.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj64 = tabelaHash44.pesquisa("hi!");
        ds.TabelaHash tabelaHash66 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
        java.lang.Object obj70 = tabelaHash68.pesquisa("hi!");
        ds.TabelaHash tabelaHash72 = new ds.TabelaHash();
        tabelaHash68.insere("hi!", (java.lang.Object) tabelaHash72);
        tabelaHash68.insere("hi!", (java.lang.Object) 1);
        java.lang.Class<?> wildcardClass77 = tabelaHash68.getClass();
        tabelaHash66.insere("", (java.lang.Object) wildcardClass77);
        tabelaHash44.insere("hi!", (java.lang.Object) "");
        tabelaHash44.imprime();
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash44);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100 + "'", obj12, 100);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object obj6 = null;
        tabelaHash4.insere("hi!", obj6);
        tabelaHash4.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = null;
        tabelaHash11.insere("hi!", obj13);
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash4.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        tabelaHash4.retira("hi!");
        java.lang.Class<?> wildcardClass24 = tabelaHash4.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) -1);
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object obj8 = null;
        tabelaHash6.insere("hi!", obj8);
        tabelaHash6.retira("hi!");
        java.lang.Object obj13 = tabelaHash6.pesquisa("");
        tabelaHash0.insere("", obj13);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = null;
        tabelaHash16.insere("hi!", obj18);
        tabelaHash16.retira("hi!");
        tabelaHash16.insere("", (java.lang.Object) 1L);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash16.imprime();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash33.insere("hi!", (java.lang.Object) (short) -1);
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object obj41 = null;
        tabelaHash39.insere("hi!", obj41);
        tabelaHash39.retira("hi!");
        java.lang.Object obj46 = tabelaHash39.pesquisa("");
        tabelaHash33.insere("", obj46);
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        java.lang.Object obj51 = null;
        tabelaHash49.insere("hi!", obj51);
        tabelaHash49.retira("hi!");
        tabelaHash49.insere("", (java.lang.Object) 1L);
        java.lang.Object obj59 = tabelaHash49.pesquisa("");
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        tabelaHash33.insere("", (java.lang.Object) tabelaHash49);
        tabelaHash33.retira("");
        tabelaHash16.insere("hi!", (java.lang.Object) "");
        tabelaHash16.imprime();
        tabelaHash16.retira("");
        tabelaHash16.imprime();
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1L + "'", obj26, 1L);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 1L + "'", obj59, 1L);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1L);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash21);
        tabelaHash17.insere("hi!", (java.lang.Object) 1);
        tabelaHash17.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = null;
        tabelaHash28.insere("hi!", obj30);
        tabelaHash28.retira("hi!");
        java.lang.Object obj35 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash28);
        tabelaHash28.insere("", (java.lang.Object) '4');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj43 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1L + "'", obj12, 1L);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1L + "'", obj15, 1L);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + '4' + "'", obj43, '4');
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash17);
        tabelaHash13.insere("hi!", (java.lang.Object) 1);
        tabelaHash13.imprime();
        java.lang.Object obj24 = tabelaHash13.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = null;
        tabelaHash28.insere("hi!", obj30);
        tabelaHash28.retira("hi!");
        tabelaHash28.insere("", (java.lang.Object) 1L);
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        java.lang.Object obj40 = tabelaHash28.pesquisa("");
        java.lang.Object obj42 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj45 = tabelaHash28.pesquisa("");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object obj49 = null;
        tabelaHash47.insere("hi!", obj49);
        tabelaHash47.retira("hi!");
        tabelaHash47.imprime();
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
        java.lang.Object obj59 = tabelaHash57.pesquisa("hi!");
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        tabelaHash57.insere("hi!", (java.lang.Object) tabelaHash61);
        tabelaHash57.insere("hi!", (java.lang.Object) 1);
        java.lang.Class<?> wildcardClass66 = tabelaHash57.getClass();
        tabelaHash55.insere("", (java.lang.Object) wildcardClass66);
        tabelaHash47.insere("hi!", (java.lang.Object) tabelaHash55);
        java.lang.Object obj70 = tabelaHash47.pesquisa("hi!");
        tabelaHash47.retira("hi!");
        ds.TabelaHash tabelaHash74 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass75 = tabelaHash74.getClass();
        tabelaHash47.insere("", (java.lang.Object) wildcardClass75);
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash47);
        ds.TabelaHash tabelaHash79 = new ds.TabelaHash();
        java.lang.Object obj81 = null;
        tabelaHash79.insere("hi!", obj81);
        tabelaHash79.retira("hi!");
        tabelaHash79.insere("", (java.lang.Object) 1L);
        java.lang.Object obj89 = tabelaHash79.pesquisa("");
        tabelaHash79.insere("", (java.lang.Object) (short) 100);
        tabelaHash79.retira("");
        tabelaHash47.insere("hi!", (java.lang.Object) tabelaHash79);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 1L + "'", obj38, 1L);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1L + "'", obj40, 1L);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1L + "'", obj42, 1L);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 1L + "'", obj45, 1L);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertEquals("'" + obj89 + "' != '" + 1L + "'", obj89, 1L);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1L);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash17);
        tabelaHash13.insere("hi!", (java.lang.Object) 1);
        tabelaHash13.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = null;
        tabelaHash24.insere("hi!", obj26);
        tabelaHash24.retira("hi!");
        java.lang.Object obj31 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash13.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object obj39 = tabelaHash37.pesquisa("hi!");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash37.insere("hi!", (java.lang.Object) tabelaHash41);
        tabelaHash37.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object obj49 = null;
        tabelaHash47.insere("hi!", obj49);
        tabelaHash47.retira("hi!");
        java.lang.Object obj54 = tabelaHash47.pesquisa("");
        tabelaHash37.insere("hi!", (java.lang.Object) "");
        tabelaHash37.retira("hi!");
        java.lang.Object obj59 = tabelaHash37.pesquisa("");
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash37);
        tabelaHash37.imprime();
        java.lang.Object obj63 = tabelaHash37.pesquisa("hi!");
        java.lang.Object obj65 = tabelaHash37.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash10.insere("hi!", (java.lang.Object) 1);
        java.lang.Class<?> wildcardClass19 = tabelaHash10.getClass();
        tabelaHash8.insere("", (java.lang.Object) wildcardClass19);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass28 = tabelaHash27.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass28);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj11 = null;
        tabelaHash0.insere("hi!", obj11);
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = null;
        tabelaHash10.insere("hi!", obj12);
        tabelaHash10.retira("hi!");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj20 = tabelaHash0.pesquisa("");
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj25 = null;
        tabelaHash0.insere("hi!", obj25);
        java.lang.Class<?> wildcardClass27 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) (short) 10);
        tabelaHash9.imprime();
        java.lang.Object obj21 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        java.lang.Class<?> wildcardClass24 = tabelaHash9.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
        java.lang.Object obj4 = tabelaHash2.pesquisa("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash2.insere("hi!", (java.lang.Object) tabelaHash6);
        tabelaHash2.insere("hi!", (java.lang.Object) 1);
        java.lang.Class<?> wildcardClass11 = tabelaHash2.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass11);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        java.lang.Object obj6 = null;
        tabelaHash0.insere("", obj6);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = null;
        tabelaHash9.insere("hi!", obj11);
        tabelaHash9.retira("hi!");
        java.lang.Object obj16 = tabelaHash9.pesquisa("");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.insere("", (java.lang.Object) 10.0d);
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash29);
        tabelaHash25.insere("hi!", (java.lang.Object) 1);
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = null;
        tabelaHash36.insere("hi!", obj38);
        tabelaHash36.retira("hi!");
        java.lang.Object obj43 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash36);
        java.lang.Object obj47 = tabelaHash36.pesquisa("hi!");
        tabelaHash9.insere("hi!", obj47);
        tabelaHash9.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object obj6 = null;
        tabelaHash4.insere("hi!", obj6);
        tabelaHash4.retira("hi!");
        tabelaHash4.insere("", (java.lang.Object) 1L);
        java.lang.Object obj14 = tabelaHash4.pesquisa("");
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash0.retira("hi!");
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1L + "'", obj14, 1L);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) -1);
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object obj8 = tabelaHash6.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash6.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = null;
        tabelaHash16.insere("hi!", obj18);
        tabelaHash16.retira("hi!");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash6.insere("hi!", (java.lang.Object) "");
        tabelaHash6.retira("hi!");
        java.lang.Object obj28 = tabelaHash6.pesquisa("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object obj32 = null;
        tabelaHash30.insere("hi!", obj32);
        tabelaHash30.retira("hi!");
        tabelaHash30.insere("", (java.lang.Object) 1L);
        java.lang.Object obj40 = tabelaHash30.pesquisa("");
        tabelaHash30.imprime();
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        java.lang.Object obj45 = tabelaHash43.pesquisa("hi!");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash43.insere("hi!", (java.lang.Object) tabelaHash47);
        tabelaHash43.insere("hi!", (java.lang.Object) 1);
        tabelaHash43.imprime();
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        java.lang.Object obj56 = null;
        tabelaHash54.insere("hi!", obj56);
        tabelaHash54.retira("hi!");
        java.lang.Object obj61 = tabelaHash54.pesquisa("");
        tabelaHash54.imprime();
        tabelaHash43.insere("hi!", (java.lang.Object) tabelaHash54);
        tabelaHash43.imprime();
        tabelaHash30.insere("", (java.lang.Object) tabelaHash43);
        tabelaHash6.insere("", (java.lang.Object) tabelaHash30);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash6);
        tabelaHash6.imprime();
        tabelaHash6.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash6.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1L + "'", obj40, 1L);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj18 = new java.lang.Object();
        tabelaHash0.insere("hi!", obj18);
        java.lang.Class<?> wildcardClass20 = obj18.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
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
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = null;
        tabelaHash11.insere("hi!", obj13);
        tabelaHash11.retira("hi!");
        java.lang.Object obj18 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.insere("", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = null;
        tabelaHash29.insere("hi!", obj31);
        tabelaHash29.retira("hi!");
        tabelaHash29.insere("", (java.lang.Object) 1L);
        java.lang.Object obj39 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash29);
        tabelaHash25.retira("hi!");
        java.lang.Object obj47 = tabelaHash25.pesquisa("hi!");
        java.lang.Object obj49 = tabelaHash25.pesquisa("");
        tabelaHash11.insere("", obj49);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1L + "'", obj39, 1L);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = null;
        tabelaHash8.insere("hi!", obj10);
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 1L);
        java.lang.Object obj18 = tabelaHash8.pesquisa("");
        java.lang.Object obj20 = tabelaHash8.pesquisa("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object obj24 = null;
        tabelaHash22.insere("hi!", obj24);
        tabelaHash22.retira("hi!");
        java.lang.Object obj29 = tabelaHash22.pesquisa("");
        tabelaHash22.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash22);
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 1L + "'", obj18, 1L);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1L + "'", obj20, 1L);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash10.insere("hi!", (java.lang.Object) 1);
        java.lang.Class<?> wildcardClass19 = tabelaHash10.getClass();
        tabelaHash8.insere("", (java.lang.Object) wildcardClass19);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass28 = tabelaHash27.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass28);
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass32 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) -1);
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object obj8 = null;
        tabelaHash6.insere("hi!", obj8);
        tabelaHash6.retira("hi!");
        java.lang.Object obj13 = tabelaHash6.pesquisa("");
        tabelaHash0.insere("", obj13);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = null;
        tabelaHash16.insere("hi!", obj18);
        tabelaHash16.retira("hi!");
        tabelaHash16.insere("", (java.lang.Object) 1L);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = null;
        tabelaHash35.insere("hi!", obj37);
        tabelaHash35.retira("hi!");
        java.lang.Object obj42 = tabelaHash35.pesquisa("");
        java.lang.Object obj44 = tabelaHash35.pesquisa("hi!");
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        tabelaHash46.imprime();
        tabelaHash35.insere("", (java.lang.Object) tabelaHash46);
        tabelaHash35.imprime();
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        java.lang.Object obj54 = tabelaHash52.pesquisa("hi!");
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        java.lang.Object obj58 = null;
        tabelaHash56.insere("hi!", obj58);
        tabelaHash56.retira("hi!");
        java.lang.Object obj63 = tabelaHash56.pesquisa("");
        java.lang.Object obj65 = tabelaHash56.pesquisa("hi!");
        ds.TabelaHash tabelaHash67 = new ds.TabelaHash();
        java.lang.Object obj69 = null;
        tabelaHash67.insere("hi!", obj69);
        tabelaHash67.retira("hi!");
        tabelaHash67.insere("", (java.lang.Object) 1L);
        java.lang.Object obj77 = tabelaHash67.pesquisa("");
        java.lang.Object obj79 = tabelaHash67.pesquisa("");
        tabelaHash56.insere("hi!", (java.lang.Object) "");
        tabelaHash52.insere("", (java.lang.Object) "");
        tabelaHash52.imprime();
        tabelaHash35.insere("hi!", (java.lang.Object) tabelaHash52);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash35);
        tabelaHash35.imprime();
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1L + "'", obj26, 1L);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 1L + "'", obj77, 1L);
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + 1L + "'", obj79, 1L);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 10.0d + "'", obj16, 10.0d);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = null;
        tabelaHash11.insere("hi!", obj13);
        tabelaHash11.retira("hi!");
        tabelaHash11.insere("", (java.lang.Object) 1L);
        java.lang.Object obj21 = tabelaHash11.pesquisa("");
        java.lang.Object obj23 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        java.lang.Object obj26 = tabelaHash11.pesquisa("");
        java.lang.Object obj28 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("hi!", obj28);
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        java.lang.Object obj33 = tabelaHash0.pesquisa("");
        java.lang.Object obj35 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj38 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1L + "'", obj21, 1L);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1L + "'", obj23, 1L);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1L + "'", obj26, 1L);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1L + "'", obj28, 1L);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) 10 + "'", obj31, (short) 10);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) 10 + "'", obj33, (short) 10);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (short) 10 + "'", obj35, (short) 10);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 1L + "'", obj38, 1L);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1L);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = null;
        tabelaHash14.insere("hi!", obj16);
        tabelaHash14.retira("hi!");
        java.lang.Object obj21 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = null;
        tabelaHash29.insere("hi!", obj31);
        tabelaHash29.retira("hi!");
        java.lang.Object obj36 = tabelaHash29.pesquisa("");
        java.lang.Object obj38 = tabelaHash29.pesquisa("hi!");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = null;
        tabelaHash40.insere("hi!", obj42);
        tabelaHash40.retira("hi!");
        tabelaHash40.insere("", (java.lang.Object) 1L);
        java.lang.Object obj50 = tabelaHash40.pesquisa("");
        java.lang.Object obj52 = tabelaHash40.pesquisa("");
        tabelaHash29.insere("hi!", (java.lang.Object) "");
        tabelaHash25.insere("", (java.lang.Object) "");
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash25);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash25.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1L + "'", obj12, 1L);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 1L + "'", obj50, 1L);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 1L + "'", obj52, 1L);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object obj6 = null;
        tabelaHash4.insere("hi!", obj6);
        tabelaHash4.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = null;
        tabelaHash11.insere("hi!", obj13);
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash4.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        tabelaHash4.insere("", (java.lang.Object) 10.0f);
        tabelaHash4.retira("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = null;
        tabelaHash32.insere("hi!", obj34);
        tabelaHash32.retira("hi!");
        tabelaHash32.insere("", (java.lang.Object) 1L);
        java.lang.Object obj42 = tabelaHash32.pesquisa("");
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash32);
        tabelaHash28.insere("hi!", (java.lang.Object) (-1.0f));
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        java.lang.Object obj53 = tabelaHash51.pesquisa("hi!");
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        tabelaHash51.insere("hi!", (java.lang.Object) tabelaHash55);
        tabelaHash51.insere("hi!", (java.lang.Object) 1);
        tabelaHash51.imprime();
        java.lang.Object obj62 = tabelaHash51.pesquisa("hi!");
        tabelaHash28.insere("", (java.lang.Object) tabelaHash51);
        tabelaHash28.imprime();
        ds.TabelaHash tabelaHash66 = new ds.TabelaHash();
        java.lang.Object obj68 = null;
        tabelaHash66.insere("hi!", obj68);
        tabelaHash66.retira("hi!");
        ds.TabelaHash tabelaHash73 = new ds.TabelaHash();
        java.lang.Object obj75 = null;
        tabelaHash73.insere("hi!", obj75);
        tabelaHash73.retira("hi!");
        tabelaHash73.imprime();
        tabelaHash66.insere("hi!", (java.lang.Object) tabelaHash73);
        tabelaHash66.imprime();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash66);
        tabelaHash4.insere("", (java.lang.Object) tabelaHash28);
        java.lang.Class<?> wildcardClass84 = tabelaHash4.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1L + "'", obj42, 1L);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object obj6 = null;
        tabelaHash4.insere("hi!", obj6);
        tabelaHash4.retira("hi!");
        tabelaHash4.insere("", (java.lang.Object) 1L);
        java.lang.Object obj14 = tabelaHash4.pesquisa("");
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0f));
        tabelaHash0.insere("", (java.lang.Object) 100);
        tabelaHash0.imprime();
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1L + "'", obj14, 1L);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100 + "'", obj27, 100);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = null;
        tabelaHash11.insere("hi!", obj13);
        tabelaHash11.retira("hi!");
        tabelaHash11.insere("", (java.lang.Object) 1L);
        java.lang.Object obj21 = tabelaHash11.pesquisa("");
        java.lang.Object obj23 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj26 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("hi!");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash35);
        tabelaHash31.insere("hi!", (java.lang.Object) 1);
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash31);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1L + "'", obj21, 1L);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1L + "'", obj23, 1L);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "" + "'", obj26, "");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) -1);
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object obj8 = null;
        tabelaHash6.insere("hi!", obj8);
        tabelaHash6.retira("hi!");
        java.lang.Object obj13 = tabelaHash6.pesquisa("");
        tabelaHash0.insere("", obj13);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = null;
        tabelaHash16.insere("hi!", obj18);
        tabelaHash16.retira("hi!");
        tabelaHash16.insere("", (java.lang.Object) 1L);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = null;
        tabelaHash35.insere("hi!", obj37);
        tabelaHash35.retira("hi!");
        java.lang.Object obj42 = tabelaHash35.pesquisa("");
        java.lang.Object obj44 = tabelaHash35.pesquisa("hi!");
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        tabelaHash46.imprime();
        tabelaHash35.insere("", (java.lang.Object) tabelaHash46);
        tabelaHash35.imprime();
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        java.lang.Object obj54 = tabelaHash52.pesquisa("hi!");
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        java.lang.Object obj58 = null;
        tabelaHash56.insere("hi!", obj58);
        tabelaHash56.retira("hi!");
        java.lang.Object obj63 = tabelaHash56.pesquisa("");
        java.lang.Object obj65 = tabelaHash56.pesquisa("hi!");
        ds.TabelaHash tabelaHash67 = new ds.TabelaHash();
        java.lang.Object obj69 = null;
        tabelaHash67.insere("hi!", obj69);
        tabelaHash67.retira("hi!");
        tabelaHash67.insere("", (java.lang.Object) 1L);
        java.lang.Object obj77 = tabelaHash67.pesquisa("");
        java.lang.Object obj79 = tabelaHash67.pesquisa("");
        tabelaHash56.insere("hi!", (java.lang.Object) "");
        tabelaHash52.insere("", (java.lang.Object) "");
        tabelaHash52.imprime();
        tabelaHash35.insere("hi!", (java.lang.Object) tabelaHash52);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash35);
        java.lang.Object obj86 = tabelaHash0.pesquisa("");
        java.lang.Object obj88 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1L + "'", obj26, 1L);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 1L + "'", obj77, 1L);
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + 1L + "'", obj79, 1L);
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertNotNull(obj88);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) -1);
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object obj8 = null;
        tabelaHash6.insere("hi!", obj8);
        tabelaHash6.retira("hi!");
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash16.insere("hi!", (java.lang.Object) 1);
        java.lang.Class<?> wildcardClass25 = tabelaHash16.getClass();
        tabelaHash14.insere("", (java.lang.Object) wildcardClass25);
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash14);
        java.lang.Object obj29 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.retira("hi!");
        tabelaHash6.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = null;
        tabelaHash35.insere("hi!", obj37);
        tabelaHash35.retira("hi!");
        tabelaHash35.insere("", (java.lang.Object) 1L);
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        java.lang.Object obj47 = null;
        tabelaHash45.insere("hi!", obj47);
        tabelaHash45.retira("hi!");
        tabelaHash45.imprime();
        tabelaHash35.insere("hi!", (java.lang.Object) tabelaHash45);
        java.lang.Object obj54 = tabelaHash35.pesquisa("hi!");
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash35);
        java.lang.Object obj57 = tabelaHash35.pesquisa("");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 1L + "'", obj57, 1L);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = null;
        tabelaHash7.insere("hi!", obj9);
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object obj5 = null;
        tabelaHash3.insere("hi!", obj5);
        tabelaHash3.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = null;
        tabelaHash10.insere("hi!", obj12);
        tabelaHash10.retira("hi!");
        tabelaHash10.imprime();
        tabelaHash3.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash3.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash3);
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash26.insere("hi!", (java.lang.Object) tabelaHash30);
        java.lang.Object obj33 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash26.insere("", (java.lang.Object) (byte) 1);
        tabelaHash26.imprime();
        java.lang.Class<?> wildcardClass39 = tabelaHash26.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass39);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object obj6 = null;
        tabelaHash4.insere("hi!", obj6);
        tabelaHash4.retira("hi!");
        tabelaHash4.insere("", (java.lang.Object) 1L);
        java.lang.Object obj14 = tabelaHash4.pesquisa("");
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0f));
        tabelaHash0.insere("", (java.lang.Object) 100);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass26 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1L + "'", obj14, 1L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = null;
        tabelaHash14.insere("hi!", obj16);
        tabelaHash14.retira("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = null;
        tabelaHash21.insere("hi!", obj23);
        tabelaHash21.retira("hi!");
        tabelaHash21.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash21);
        tabelaHash21.imprime();
        java.lang.Object obj31 = tabelaHash21.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object obj39 = null;
        tabelaHash37.insere("hi!", obj39);
        tabelaHash37.retira("hi!");
        tabelaHash37.insere("", (java.lang.Object) 1L);
        java.lang.Object obj47 = tabelaHash37.pesquisa("");
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash33.insere("hi!", (java.lang.Object) tabelaHash37);
        tabelaHash37.imprime();
        java.lang.Class<?> wildcardClass53 = tabelaHash37.getClass();
        tabelaHash21.insere("hi!", (java.lang.Object) wildcardClass53);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        java.lang.Object obj57 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 1L + "'", obj47, 1L);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (short) 10 + "'", obj57, (short) 10);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) -1);
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object obj8 = null;
        tabelaHash6.insere("hi!", obj8);
        tabelaHash6.retira("hi!");
        java.lang.Object obj13 = tabelaHash6.pesquisa("");
        tabelaHash0.insere("", obj13);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = null;
        tabelaHash16.insere("hi!", obj18);
        tabelaHash16.retira("hi!");
        tabelaHash16.insere("", (java.lang.Object) 1L);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = null;
        tabelaHash32.insere("hi!", obj34);
        tabelaHash32.retira("hi!");
        tabelaHash32.imprime();
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object obj44 = tabelaHash42.pesquisa("hi!");
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash42.insere("hi!", (java.lang.Object) tabelaHash46);
        tabelaHash42.insere("hi!", (java.lang.Object) 1);
        java.lang.Class<?> wildcardClass51 = tabelaHash42.getClass();
        tabelaHash40.insere("", (java.lang.Object) wildcardClass51);
        tabelaHash32.insere("hi!", (java.lang.Object) tabelaHash40);
        java.lang.Object obj55 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.retira("hi!");
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass60 = tabelaHash59.getClass();
        tabelaHash32.insere("", (java.lang.Object) wildcardClass60);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash32);
        java.lang.Class<?> wildcardClass63 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1L + "'", obj26, 1L);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = null;
        tabelaHash10.insere("hi!", obj12);
        tabelaHash10.retira("hi!");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = null;
        tabelaHash20.insere("hi!", obj22);
        tabelaHash20.retira("hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = null;
        tabelaHash27.insere("hi!", obj29);
        tabelaHash27.retira("hi!");
        tabelaHash27.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash27);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = null;
        tabelaHash36.insere("hi!", obj38);
        tabelaHash36.retira("hi!");
        tabelaHash36.insere("", (java.lang.Object) 1L);
        java.lang.Object obj46 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        java.lang.Class<?> wildcardClass48 = tabelaHash36.getClass();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash36);
        tabelaHash27.insere("", (java.lang.Object) (short) 100);
        java.lang.Object obj54 = tabelaHash27.pesquisa("");
        tabelaHash27.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass58 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 1L + "'", obj46, 1L);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (short) 100 + "'", obj54, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 10L);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = null;
        tabelaHash15.insere("hi!", obj17);
        tabelaHash15.retira("hi!");
        java.lang.Object obj22 = tabelaHash15.pesquisa("");
        java.lang.Object obj24 = tabelaHash15.pesquisa("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        tabelaHash15.insere("", (java.lang.Object) tabelaHash26);
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = null;
        tabelaHash36.insere("hi!", obj38);
        tabelaHash36.retira("hi!");
        java.lang.Object obj43 = tabelaHash36.pesquisa("");
        java.lang.Object obj45 = tabelaHash36.pesquisa("hi!");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object obj49 = null;
        tabelaHash47.insere("hi!", obj49);
        tabelaHash47.retira("hi!");
        tabelaHash47.insere("", (java.lang.Object) 1L);
        java.lang.Object obj57 = tabelaHash47.pesquisa("");
        java.lang.Object obj59 = tabelaHash47.pesquisa("");
        tabelaHash36.insere("hi!", (java.lang.Object) "");
        tabelaHash32.insere("", (java.lang.Object) "");
        tabelaHash32.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash32);
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        tabelaHash65.imprime();
        tabelaHash65.imprime();
        ds.TabelaHash tabelaHash69 = new ds.TabelaHash();
        java.lang.Object obj71 = null;
        tabelaHash69.insere("hi!", obj71);
        tabelaHash69.retira("hi!");
        tabelaHash69.insere("", (java.lang.Object) 1L);
        java.lang.Object obj79 = tabelaHash69.pesquisa("");
        tabelaHash69.imprime();
        tabelaHash69.imprime();
        tabelaHash69.imprime();
        tabelaHash65.insere("hi!", (java.lang.Object) tabelaHash69);
        tabelaHash65.insere("hi!", (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass87 = tabelaHash65.getClass();
        tabelaHash32.insere("hi!", (java.lang.Object) wildcardClass87);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 1L + "'", obj57, 1L);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 1L + "'", obj59, 1L);
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + 1L + "'", obj79, 1L);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1L);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) true);
        java.lang.Object obj24 = tabelaHash19.pesquisa("");
        tabelaHash19.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1L + "'", obj17, 1L);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1L);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = null;
        tabelaHash14.insere("hi!", obj16);
        tabelaHash14.retira("hi!");
        java.lang.Object obj21 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash0.retira("hi!");
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        java.lang.Object obj29 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) tabelaHash37);
        tabelaHash33.insere("hi!", (java.lang.Object) 1);
        java.lang.Class<?> wildcardClass42 = tabelaHash33.getClass();
        tabelaHash31.insere("", (java.lang.Object) wildcardClass42);
        java.lang.Object obj45 = tabelaHash31.pesquisa("");
        java.lang.Object obj47 = null;
        tabelaHash31.insere("hi!", obj47);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1L + "'", obj12, 1L);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1L + "'", obj27, 1L);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "class ds.TabelaHash");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1L);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = null;
        tabelaHash14.insere("hi!", obj16);
        tabelaHash14.retira("hi!");
        java.lang.Object obj21 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = null;
        tabelaHash27.insere("hi!", obj29);
        tabelaHash27.retira("hi!");
        tabelaHash27.insere("", (java.lang.Object) 1L);
        java.lang.Object obj37 = tabelaHash27.pesquisa("");
        java.lang.Object obj39 = tabelaHash27.pesquisa("");
        java.lang.Object obj41 = tabelaHash27.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1L + "'", obj12, 1L);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 1L + "'", obj37, 1L);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1L + "'", obj39, 1L);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 1L + "'", obj41, 1L);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash10.insere("hi!", (java.lang.Object) 1);
        java.lang.Class<?> wildcardClass19 = tabelaHash10.getClass();
        tabelaHash8.insere("", (java.lang.Object) wildcardClass19);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash32);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj36 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("", (java.lang.Object) (byte) 0);
        tabelaHash38.imprime();
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.insere("", (java.lang.Object) (byte) 0);
        tabelaHash44.imprime();
        java.lang.Object obj50 = tabelaHash44.pesquisa("hi!");
        java.lang.Class<?> wildcardClass51 = tabelaHash44.getClass();
        tabelaHash38.insere("", (java.lang.Object) wildcardClass51);
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass51);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "hi!" + "'", obj36, "hi!");
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) -1);
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object obj8 = null;
        tabelaHash6.insere("hi!", obj8);
        tabelaHash6.retira("hi!");
        java.lang.Object obj13 = tabelaHash6.pesquisa("");
        tabelaHash0.insere("", obj13);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash16.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = null;
        tabelaHash26.insere("hi!", obj28);
        tabelaHash26.retira("hi!");
        java.lang.Object obj33 = tabelaHash26.pesquisa("");
        tabelaHash16.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj36 = tabelaHash16.pesquisa("hi!");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object obj42 = tabelaHash40.pesquisa("hi!");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash40.insere("hi!", (java.lang.Object) tabelaHash44);
        tabelaHash40.insere("hi!", (java.lang.Object) 1);
        java.lang.Class<?> wildcardClass49 = tabelaHash40.getClass();
        tabelaHash38.insere("", (java.lang.Object) wildcardClass49);
        tabelaHash16.insere("hi!", (java.lang.Object) "");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Class<?> wildcardClass54 = tabelaHash16.getClass();
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = null;
        tabelaHash0.insere("hi!", obj2);
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = null;
        tabelaHash14.insere("hi!", obj16);
        tabelaHash14.retira("hi!");
        java.lang.Object obj21 = tabelaHash14.pesquisa("");
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) 10.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = null;
        tabelaHash36.insere("hi!", obj38);
        tabelaHash36.retira("hi!");
        java.lang.Object obj43 = tabelaHash36.pesquisa("");
        java.lang.Object obj45 = tabelaHash36.pesquisa("hi!");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object obj49 = null;
        tabelaHash47.insere("hi!", obj49);
        tabelaHash47.retira("hi!");
        tabelaHash47.insere("", (java.lang.Object) 1L);
        java.lang.Object obj57 = tabelaHash47.pesquisa("");
        java.lang.Object obj59 = tabelaHash47.pesquisa("");
        tabelaHash36.insere("hi!", (java.lang.Object) "");
        tabelaHash32.insere("", (java.lang.Object) "");
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash32);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 1L + "'", obj57, 1L);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 1L + "'", obj59, 1L);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) -1);
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object obj8 = null;
        tabelaHash6.insere("hi!", obj8);
        tabelaHash6.retira("hi!");
        java.lang.Object obj13 = tabelaHash6.pesquisa("");
        tabelaHash0.insere("", obj13);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = null;
        tabelaHash16.insere("hi!", obj18);
        tabelaHash16.retira("hi!");
        tabelaHash16.insere("", (java.lang.Object) 1L);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = null;
        tabelaHash32.insere("hi!", obj34);
        tabelaHash32.retira("hi!");
        java.lang.Object obj39 = tabelaHash32.pesquisa("");
        tabelaHash32.insere("", (java.lang.Object) 100);
        java.lang.Object obj44 = tabelaHash32.pesquisa("");
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass45);
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        java.lang.Object obj52 = tabelaHash50.pesquisa("hi!");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        tabelaHash50.insere("hi!", (java.lang.Object) tabelaHash54);
        tabelaHash50.insere("hi!", (java.lang.Object) 1);
        java.lang.Class<?> wildcardClass59 = tabelaHash50.getClass();
        tabelaHash48.insere("", (java.lang.Object) wildcardClass59);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash48);
        tabelaHash48.imprime();
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1L + "'", obj26, 1L);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 100 + "'", obj44, 100);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }
}
