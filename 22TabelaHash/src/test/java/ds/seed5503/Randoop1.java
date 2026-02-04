package ds.seed5503;

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
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash12.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("hi!");
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        tabelaHash26.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj32 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.retira("hi!");
        java.lang.Object obj36 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        java.lang.Object obj41 = tabelaHash26.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj41);
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass45 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "hi!" + "'", obj32, "hi!");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj27 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.retira("hi!");
        java.lang.Object obj31 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        java.lang.Object obj36 = tabelaHash21.pesquisa("hi!");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("hi!", (java.lang.Object) '4');
        tabelaHash38.insere("hi!", (java.lang.Object) (-1.0f));
        tabelaHash38.imprime();
        java.lang.Object obj47 = tabelaHash38.pesquisa("hi!");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.imprime();
        tabelaHash49.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj55 = tabelaHash49.pesquisa("hi!");
        tabelaHash49.retira("hi!");
        tabelaHash38.insere("", (java.lang.Object) tabelaHash49);
        tabelaHash21.insere("", (java.lang.Object) tabelaHash38);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash21);
        java.lang.Object obj62 = tabelaHash21.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + '4' + "'", obj47, '4');
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + "hi!" + "'", obj55, "hi!");
        org.junit.Assert.assertNotNull(obj62);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 0);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) '4');
        tabelaHash17.insere("hi!", (java.lang.Object) (-1.0f));
        tabelaHash17.imprime();
        java.lang.Object obj26 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj34 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.retira("hi!");
        tabelaHash17.insere("", (java.lang.Object) tabelaHash28);
        java.lang.Object obj39 = tabelaHash28.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash28);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + '4' + "'", obj26, '4');
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "hi!" + "'", obj34, "hi!");
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj22 = tabelaHash16.pesquisa("");
        tabelaHash16.retira("hi!");
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        java.lang.Object obj28 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        java.lang.Object obj32 = tabelaHash16.pesquisa("");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        tabelaHash34.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj40 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.retira("hi!");
        java.lang.Object obj44 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        java.lang.Object obj48 = tabelaHash34.pesquisa("");
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj52 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "hi!" + "'", obj40, "hi!");
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash12.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        java.lang.Object obj20 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj31 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.retira("hi!");
        java.lang.Object obj35 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        java.lang.Object obj38 = tabelaHash25.pesquisa("hi!");
        java.lang.Object obj40 = tabelaHash25.pesquisa("");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.imprime();
        java.lang.Class<?> wildcardClass44 = tabelaHash42.getClass();
        tabelaHash25.insere("", (java.lang.Object) wildcardClass44);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash25);
        java.lang.Object obj48 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj52 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "hi!" + "'", obj31, "hi!");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj21 = tabelaHash15.pesquisa("");
        tabelaHash15.insere("", (java.lang.Object) (short) 10);
        tabelaHash15.retira("hi!");
        tabelaHash15.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.imprime();
        java.lang.Object obj38 = tabelaHash30.pesquisa("hi!");
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        tabelaHash0.insere("hi!", obj38);
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '4' + "'", obj35, '4');
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + '4' + "'", obj38, '4');
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 0);
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0 + "'", obj24, 0);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash12.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("hi!");
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("hi!", (java.lang.Object) '4');
        java.lang.Class<?> wildcardClass30 = tabelaHash26.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass30);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        tabelaHash34.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj40 = tabelaHash34.pesquisa("");
        tabelaHash34.insere("", (java.lang.Object) (short) 10);
        tabelaHash34.insere("hi!", (java.lang.Object) (short) 100);
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.imprime();
        tabelaHash48.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj54 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.retira("hi!");
        java.lang.Object obj58 = tabelaHash48.pesquisa("");
        java.lang.Object obj60 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.imprime();
        java.lang.Object obj63 = tabelaHash48.pesquisa("hi!");
        java.lang.Object obj65 = tabelaHash48.pesquisa("");
        tabelaHash34.insere("", obj65);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash34.retira("");
        java.lang.Object obj71 = tabelaHash34.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + "hi!" + "'", obj54, "hi!");
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj71);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 0);
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj27 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.retira("hi!");
        java.lang.Object obj31 = tabelaHash21.pesquisa("");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash33.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass38 = tabelaHash33.getClass();
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash33);
        java.lang.Object obj41 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.retira("hi!");
        tabelaHash21.insere("", (java.lang.Object) 10.0f);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash21.retira("");
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.imprime();
        tabelaHash51.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash51.imprime();
        tabelaHash51.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash51);
        java.lang.Object obj60 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNull(obj60);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + '4' + "'", obj5, '4');
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + '4' + "'", obj8, '4');
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash22.imprime();
        java.lang.Class<?> wildcardClass28 = tabelaHash22.getClass();
        tabelaHash16.insere("", (java.lang.Object) tabelaHash22);
        java.lang.Object obj31 = tabelaHash16.pesquisa("");
        java.lang.Object obj33 = tabelaHash16.pesquisa("");
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        tabelaHash0.insere("hi!", obj33);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0f));
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj17 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Object obj22 = tabelaHash11.pesquisa("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("hi!", (java.lang.Object) '4');
        tabelaHash24.insere("hi!", (java.lang.Object) (-1.0f));
        tabelaHash24.imprime();
        java.lang.Object obj33 = tabelaHash24.pesquisa("hi!");
        tabelaHash11.insere("hi!", obj33);
        tabelaHash11.imprime();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + '4' + "'", obj33, '4');
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 0);
        tabelaHash0.insere("", (java.lang.Object) (byte) 100);
        java.lang.Object obj20 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj27 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.imprime();
        tabelaHash37.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash37.imprime();
        java.lang.Class<?> wildcardClass43 = tabelaHash37.getClass();
        tabelaHash31.insere("", (java.lang.Object) tabelaHash37);
        tabelaHash31.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) tabelaHash31);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash22);
        java.lang.Object obj49 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj51 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 100 + "'", obj20, (byte) 100);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0 + "'", obj49, 0);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) 100 + "'", obj51, (byte) 100);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash12.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("hi!");
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("hi!", (java.lang.Object) '4');
        java.lang.Class<?> wildcardClass30 = tabelaHash26.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass30);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) '4');
        tabelaHash33.insere("hi!", (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass40 = tabelaHash33.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash33);
        java.lang.Class<?> wildcardClass42 = tabelaHash33.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash12.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("hi!");
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        tabelaHash26.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj32 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.retira("hi!");
        java.lang.Object obj36 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        java.lang.Object obj41 = tabelaHash26.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj41);
        java.lang.Object obj44 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        tabelaHash46.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj52 = tabelaHash46.pesquisa("hi!");
        tabelaHash46.retira("hi!");
        java.lang.Object obj56 = tabelaHash46.pesquisa("hi!");
        java.lang.Class<?> wildcardClass57 = tabelaHash46.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash46);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "hi!" + "'", obj32, "hi!");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + "hi!" + "'", obj52, "hi!");
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash12.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj26 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.retira("hi!");
        java.lang.Object obj30 = tabelaHash20.pesquisa("");
        java.lang.Object obj32 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash20);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        tabelaHash36.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj42 = tabelaHash36.pesquisa("");
        tabelaHash36.insere("", (java.lang.Object) (short) 10);
        tabelaHash36.retira("hi!");
        tabelaHash36.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash36);
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.imprime();
        java.lang.Object obj54 = tabelaHash51.pesquisa("hi!");
        tabelaHash36.insere("", (java.lang.Object) tabelaHash51);
        java.lang.Object obj57 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        java.lang.Object obj60 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.imprime();
        java.lang.Object obj63 = tabelaHash36.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass64 = obj63.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "hi!" + "'", obj26, "hi!");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (short) 10 + "'", obj57, (short) 10);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0f));
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj19 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.retira("hi!");
        java.lang.Object obj23 = tabelaHash13.pesquisa("");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass30 = tabelaHash25.getClass();
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash25);
        tabelaHash13.retira("hi!");
        java.lang.Class<?> wildcardClass34 = tabelaHash13.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "hi!" + "'", obj19, "hi!");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj20 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("hi!");
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        java.lang.Object obj26 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        java.lang.Object obj30 = tabelaHash14.pesquisa("");
        tabelaHash0.insere("", obj30);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash33.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj39 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.retira("hi!");
        java.lang.Object obj43 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        tabelaHash33.insere("hi!", (java.lang.Object) 0);
        tabelaHash33.insere("", (java.lang.Object) (byte) 100);
        tabelaHash33.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "hi!" + "'", obj39, "hi!");
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj17 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("hi!");
        java.lang.Object obj21 = tabelaHash11.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass28 = tabelaHash23.getClass();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash11.retira("hi!");
        java.lang.Object obj33 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj35 = tabelaHash11.pesquisa("hi!");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.insere("hi!", (java.lang.Object) '4');
        java.lang.Class<?> wildcardClass41 = tabelaHash37.getClass();
        tabelaHash11.insere("", (java.lang.Object) wildcardClass41);
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.imprime();
        tabelaHash45.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj51 = tabelaHash45.pesquisa("hi!");
        tabelaHash45.retira("hi!");
        java.lang.Object obj55 = tabelaHash45.pesquisa("");
        java.lang.Object obj57 = tabelaHash45.pesquisa("");
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        tabelaHash59.imprime();
        tabelaHash59.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj65 = tabelaHash59.pesquisa("");
        tabelaHash59.retira("hi!");
        java.lang.Object obj69 = tabelaHash59.pesquisa("");
        java.lang.Object obj71 = tabelaHash59.pesquisa("hi!");
        tabelaHash59.imprime();
        tabelaHash59.imprime();
        java.lang.Object obj75 = tabelaHash59.pesquisa("");
        tabelaHash59.insere("hi!", (java.lang.Object) (short) 10);
        tabelaHash59.retira("hi!");
        tabelaHash59.imprime();
        tabelaHash45.insere("hi!", (java.lang.Object) tabelaHash59);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash59);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + '4' + "'", obj5, '4');
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + "hi!" + "'", obj51, "hi!");
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj75);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash12.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("hi!");
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("hi!", (java.lang.Object) '4');
        java.lang.Class<?> wildcardClass30 = tabelaHash26.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass30);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) '4');
        tabelaHash33.insere("hi!", (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass40 = tabelaHash33.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash33);
        java.lang.Object obj43 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "class ds.TabelaHash");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash12.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("hi!");
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("hi!", (java.lang.Object) '4');
        java.lang.Class<?> wildcardClass30 = tabelaHash26.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass30);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        tabelaHash34.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj40 = tabelaHash34.pesquisa("");
        tabelaHash34.insere("", (java.lang.Object) (short) 10);
        tabelaHash34.insere("hi!", (java.lang.Object) (short) 100);
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.imprime();
        tabelaHash48.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj54 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.retira("hi!");
        java.lang.Object obj58 = tabelaHash48.pesquisa("");
        java.lang.Object obj60 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.imprime();
        java.lang.Object obj63 = tabelaHash48.pesquisa("hi!");
        java.lang.Object obj65 = tabelaHash48.pesquisa("");
        tabelaHash34.insere("", obj65);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash34.retira("");
        java.lang.Object obj71 = tabelaHash34.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + "hi!" + "'", obj54, "hi!");
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + "hi!" + "'", obj71, "hi!");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash12.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("hi!");
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.imprime();
        java.lang.Object obj27 = tabelaHash24.pesquisa("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj35 = tabelaHash29.pesquisa("");
        tabelaHash29.retira("hi!");
        java.lang.Object obj39 = tabelaHash29.pesquisa("");
        tabelaHash24.insere("hi!", obj39);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.imprime();
        tabelaHash42.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash24.insere("hi!", (java.lang.Object) tabelaHash42);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash42);
        tabelaHash42.retira("hi!");
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        tabelaHash52.imprime();
        tabelaHash52.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj58 = tabelaHash52.pesquisa("hi!");
        tabelaHash52.retira("hi!");
        java.lang.Object obj62 = tabelaHash52.pesquisa("");
        ds.TabelaHash tabelaHash64 = new ds.TabelaHash();
        tabelaHash64.imprime();
        tabelaHash64.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass69 = tabelaHash64.getClass();
        tabelaHash52.insere("hi!", (java.lang.Object) tabelaHash64);
        tabelaHash52.retira("hi!");
        java.lang.Object obj74 = tabelaHash52.pesquisa("hi!");
        java.lang.Object obj76 = tabelaHash52.pesquisa("hi!");
        ds.TabelaHash tabelaHash78 = new ds.TabelaHash();
        tabelaHash78.insere("hi!", (java.lang.Object) '4');
        java.lang.Class<?> wildcardClass82 = tabelaHash78.getClass();
        tabelaHash52.insere("", (java.lang.Object) wildcardClass82);
        tabelaHash52.imprime();
        tabelaHash52.retira("");
        tabelaHash42.insere("", (java.lang.Object) tabelaHash52);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + "hi!" + "'", obj58, "hi!");
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash12.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj26 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.retira("hi!");
        java.lang.Object obj30 = tabelaHash20.pesquisa("");
        java.lang.Object obj32 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash20.imprime();
        java.lang.Object obj37 = tabelaHash20.pesquisa("");
        java.lang.Object obj39 = tabelaHash20.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "hi!" + "'", obj26, "hi!");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash15.imprime();
        java.lang.Class<?> wildcardClass21 = tabelaHash15.getClass();
        tabelaHash9.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash9.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        tabelaHash9.retira("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        java.lang.Object obj31 = tabelaHash28.pesquisa("");
        java.lang.Object obj33 = tabelaHash28.pesquisa("hi!");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.imprime();
        tabelaHash35.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass40 = tabelaHash35.getClass();
        tabelaHash28.insere("", (java.lang.Object) wildcardClass40);
        tabelaHash9.insere("", (java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + '4' + "'", obj5, '4');
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 0);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj23 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.retira("hi!");
        java.lang.Object obj27 = tabelaHash17.pesquisa("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass34 = tabelaHash29.getClass();
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash29);
        tabelaHash17.retira("hi!");
        java.lang.Object obj39 = tabelaHash17.pesquisa("hi!");
        java.lang.Object obj41 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.insere("hi!", (java.lang.Object) '4');
        java.lang.Class<?> wildcardClass47 = tabelaHash43.getClass();
        tabelaHash17.insere("", (java.lang.Object) wildcardClass47);
        java.lang.Object obj50 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        tabelaHash52.imprime();
        tabelaHash52.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj58 = tabelaHash52.pesquisa("hi!");
        tabelaHash52.insere("hi!", (java.lang.Object) (byte) 100);
        tabelaHash52.imprime();
        tabelaHash17.insere("", (java.lang.Object) tabelaHash52);
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        tabelaHash65.imprime();
        tabelaHash65.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass70 = tabelaHash65.getClass();
        tabelaHash17.insere("hi!", (java.lang.Object) wildcardClass70);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "hi!" + "'", obj23, "hi!");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + "hi!" + "'", obj58, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 0);
        tabelaHash0.insere("", (java.lang.Object) (byte) 100);
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0f));
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj14 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        java.lang.Object obj18 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) 0);
        tabelaHash8.insere("", (java.lang.Object) (byte) 100);
        tabelaHash8.retira("hi!");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        java.lang.Class<?> wildcardClass32 = tabelaHash8.getClass();
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "hi!" + "'", obj14, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) '4');
        tabelaHash17.insere("hi!", (java.lang.Object) (-1.0f));
        tabelaHash17.imprime();
        java.lang.Object obj26 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj34 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.retira("hi!");
        tabelaHash17.insere("", (java.lang.Object) tabelaHash28);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        tabelaHash17.retira("");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + '4' + "'", obj26, '4');
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "hi!" + "'", obj34, "hi!");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash12.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("hi!");
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("hi!", (java.lang.Object) '4');
        java.lang.Class<?> wildcardClass30 = tabelaHash26.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass30);
        tabelaHash0.imprime();
        java.lang.Object obj34 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj37 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "class ds.TabelaHash");
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash12.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("hi!");
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("hi!", (java.lang.Object) '4');
        java.lang.Class<?> wildcardClass30 = tabelaHash26.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass30);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash33.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj39 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.retira("hi!");
        java.lang.Object obj43 = tabelaHash33.pesquisa("");
        java.lang.Object obj45 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.insere("hi!", (java.lang.Object) 100);
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.imprime();
        tabelaHash50.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj56 = tabelaHash50.pesquisa("hi!");
        tabelaHash50.retira("hi!");
        java.lang.Object obj60 = tabelaHash50.pesquisa("");
        java.lang.Object obj62 = tabelaHash50.pesquisa("hi!");
        tabelaHash33.insere("hi!", obj62);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "hi!" + "'", obj39, "hi!");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + "hi!" + "'", obj56, "hi!");
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj62);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) 100);
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj20 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.retira("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj29 = tabelaHash24.pesquisa("hi!");
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash14.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "hi!" + "'", obj20, "hi!");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + '4' + "'", obj29, '4');
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 0);
        tabelaHash0.insere("", (java.lang.Object) (byte) 100);
        java.lang.Object obj20 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj27 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.imprime();
        tabelaHash37.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash37.imprime();
        java.lang.Class<?> wildcardClass43 = tabelaHash37.getClass();
        tabelaHash31.insere("", (java.lang.Object) tabelaHash37);
        tabelaHash31.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) tabelaHash31);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash22);
        tabelaHash22.imprime();
        tabelaHash22.retira("hi!");
        tabelaHash22.imprime();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 100 + "'", obj20, (byte) 100);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) 100);
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "hi!" + "'", obj14, "hi!");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash12.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        java.lang.Object obj20 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj31 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.retira("hi!");
        java.lang.Object obj35 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        java.lang.Object obj38 = tabelaHash25.pesquisa("hi!");
        java.lang.Object obj40 = tabelaHash25.pesquisa("");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.imprime();
        java.lang.Class<?> wildcardClass44 = tabelaHash42.getClass();
        tabelaHash25.insere("", (java.lang.Object) wildcardClass44);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash25);
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.imprime();
        tabelaHash48.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj54 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.retira("hi!");
        java.lang.Object obj58 = tabelaHash48.pesquisa("");
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        tabelaHash60.imprime();
        tabelaHash60.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass65 = tabelaHash60.getClass();
        tabelaHash48.insere("hi!", (java.lang.Object) tabelaHash60);
        tabelaHash48.retira("hi!");
        java.lang.Object obj70 = tabelaHash48.pesquisa("hi!");
        java.lang.Object obj72 = tabelaHash48.pesquisa("hi!");
        ds.TabelaHash tabelaHash74 = new ds.TabelaHash();
        tabelaHash74.insere("hi!", (java.lang.Object) '4');
        java.lang.Class<?> wildcardClass78 = tabelaHash74.getClass();
        tabelaHash48.insere("", (java.lang.Object) wildcardClass78);
        java.lang.Object obj81 = tabelaHash48.pesquisa("hi!");
        java.lang.Object obj83 = tabelaHash48.pesquisa("");
        tabelaHash25.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "hi!" + "'", obj31, "hi!");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + "hi!" + "'", obj54, "hi!");
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertEquals(obj83.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj83), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj83), "class ds.TabelaHash");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 0);
        tabelaHash0.insere("", (java.lang.Object) (byte) 100);
        java.lang.Object obj20 = tabelaHash0.pesquisa("");
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 100 + "'", obj20, (byte) 100);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0 + "'", obj22, 0);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 100);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj23 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.retira("hi!");
        java.lang.Object obj27 = tabelaHash17.pesquisa("");
        java.lang.Object obj29 = tabelaHash17.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj29);
        java.lang.Object obj32 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.insere("hi!", (java.lang.Object) '4');
        tabelaHash34.insere("hi!", (java.lang.Object) (-1.0f));
        tabelaHash34.imprime();
        java.lang.Object obj43 = tabelaHash34.pesquisa("hi!");
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.imprime();
        tabelaHash45.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj51 = tabelaHash45.pesquisa("hi!");
        tabelaHash45.retira("hi!");
        tabelaHash34.insere("", (java.lang.Object) tabelaHash45);
        java.lang.Object obj56 = tabelaHash45.pesquisa("hi!");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.insere("hi!", (java.lang.Object) '4');
        tabelaHash58.insere("hi!", (java.lang.Object) (-1.0f));
        tabelaHash58.imprime();
        java.lang.Object obj67 = tabelaHash58.pesquisa("hi!");
        tabelaHash45.insere("hi!", obj67);
        java.lang.Object obj70 = tabelaHash45.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj70);
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "hi!" + "'", obj23, "hi!");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100 + "'", obj32, 100);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + '4' + "'", obj43, '4');
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + "hi!" + "'", obj51, "hi!");
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + '4' + "'", obj67, '4');
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + '4' + "'", obj70, '4');
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        java.lang.Object obj22 = tabelaHash14.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj31 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.retira("hi!");
        java.lang.Object obj35 = tabelaHash25.pesquisa("");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.imprime();
        tabelaHash37.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass42 = tabelaHash37.getClass();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash37);
        tabelaHash25.retira("hi!");
        java.lang.Object obj47 = tabelaHash25.pesquisa("hi!");
        java.lang.Object obj49 = tabelaHash25.pesquisa("hi!");
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.insere("hi!", (java.lang.Object) '4');
        java.lang.Class<?> wildcardClass55 = tabelaHash51.getClass();
        tabelaHash25.insere("", (java.lang.Object) wildcardClass55);
        tabelaHash25.imprime();
        java.lang.Object obj59 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        java.lang.Object obj62 = tabelaHash25.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + '4' + "'", obj19, '4');
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + '4' + "'", obj22, '4');
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "hi!" + "'", obj31, "hi!");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertEquals(obj59.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj59), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj59), "class ds.TabelaHash");
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals(obj62.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "class ds.TabelaHash");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj27 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.retira("hi!");
        java.lang.Object obj31 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        java.lang.Object obj36 = tabelaHash21.pesquisa("hi!");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("hi!", (java.lang.Object) '4');
        tabelaHash38.insere("hi!", (java.lang.Object) (-1.0f));
        tabelaHash38.imprime();
        java.lang.Object obj47 = tabelaHash38.pesquisa("hi!");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.imprime();
        tabelaHash49.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj55 = tabelaHash49.pesquisa("hi!");
        tabelaHash49.retira("hi!");
        tabelaHash38.insere("", (java.lang.Object) tabelaHash49);
        tabelaHash21.insere("", (java.lang.Object) tabelaHash38);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash21);
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        tabelaHash62.imprime();
        tabelaHash62.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj68 = tabelaHash62.pesquisa("hi!");
        tabelaHash62.retira("hi!");
        java.lang.Object obj72 = tabelaHash62.pesquisa("");
        java.lang.Object obj74 = tabelaHash62.pesquisa("hi!");
        tabelaHash62.imprime();
        tabelaHash62.imprime();
        ds.TabelaHash tabelaHash78 = new ds.TabelaHash();
        tabelaHash78.imprime();
        tabelaHash78.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash78.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash62.insere("hi!", (java.lang.Object) tabelaHash78);
        tabelaHash21.insere("", (java.lang.Object) tabelaHash78);
        java.lang.Class<?> wildcardClass88 = tabelaHash21.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + '4' + "'", obj47, '4');
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + "hi!" + "'", obj55, "hi!");
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + "hi!" + "'", obj68, "hi!");
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj24 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.retira("hi!");
        java.lang.Object obj28 = tabelaHash18.pesquisa("");
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) 0);
        java.lang.Object obj35 = tabelaHash18.pesquisa("");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.imprime();
        tabelaHash37.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj43 = tabelaHash37.pesquisa("hi!");
        tabelaHash37.retira("hi!");
        java.lang.Object obj47 = tabelaHash37.pesquisa("");
        java.lang.Object obj49 = tabelaHash37.pesquisa("");
        tabelaHash37.imprime();
        java.lang.Class<?> wildcardClass51 = tabelaHash37.getClass();
        tabelaHash18.insere("", (java.lang.Object) tabelaHash37);
        java.lang.Object obj54 = tabelaHash18.pesquisa("hi!");
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        tabelaHash56.imprime();
        tabelaHash56.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj62 = tabelaHash56.pesquisa("");
        tabelaHash56.retira("hi!");
        java.lang.Object obj66 = tabelaHash56.pesquisa("");
        java.lang.Object obj68 = tabelaHash56.pesquisa("hi!");
        tabelaHash56.imprime();
        java.lang.Class<?> wildcardClass70 = tabelaHash56.getClass();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash56);
        ds.TabelaHash tabelaHash73 = new ds.TabelaHash();
        tabelaHash73.imprime();
        tabelaHash56.insere("hi!", (java.lang.Object) tabelaHash73);
        java.lang.Object obj77 = tabelaHash73.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "hi!" + "'", obj24, "hi!");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "hi!" + "'", obj43, "hi!");
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 0 + "'", obj54, 0);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNull(obj77);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 0);
        tabelaHash0.insere("", (java.lang.Object) (byte) 100);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj24 = tabelaHash0.pesquisa("");
        java.lang.Object obj26 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) 100);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) '4');
        tabelaHash15.insere("hi!", (java.lang.Object) (-1.0f));
        tabelaHash15.imprime();
        java.lang.Object obj24 = tabelaHash15.pesquisa("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        tabelaHash26.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj32 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.retira("hi!");
        tabelaHash15.insere("", (java.lang.Object) tabelaHash26);
        java.lang.Object obj37 = tabelaHash26.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj37);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '4' + "'", obj24, '4');
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "hi!" + "'", obj32, "hi!");
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 0);
        tabelaHash0.insere("", (java.lang.Object) (byte) 100);
        java.lang.Object obj20 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj27 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.imprime();
        tabelaHash37.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash37.imprime();
        java.lang.Class<?> wildcardClass43 = tabelaHash37.getClass();
        tabelaHash31.insere("", (java.lang.Object) tabelaHash37);
        tabelaHash31.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) tabelaHash31);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash22);
        java.lang.Object obj49 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj52 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 100 + "'", obj20, (byte) 100);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0 + "'", obj49, 0);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 0 + "'", obj52, 0);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj11 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.retira("hi!");
        java.lang.Object obj15 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) 0);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        java.lang.Object obj25 = tabelaHash22.pesquisa("");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        java.lang.Object obj30 = tabelaHash27.pesquisa("hi!");
        tabelaHash22.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash5.insere("", (java.lang.Object) tabelaHash22);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash22);
        tabelaHash22.imprime();
        java.lang.Object obj36 = tabelaHash22.pesquisa("hi!");
        java.lang.Object obj38 = tabelaHash22.pesquisa("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "hi!" + "'", obj36, "hi!");
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash12.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj23 = null;
        tabelaHash0.insere("", obj23);
        java.lang.Object obj26 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj34 = tabelaHash28.pesquisa("");
        tabelaHash28.retira("hi!");
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        java.lang.Object obj40 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        java.lang.Object obj44 = tabelaHash28.pesquisa("");
        tabelaHash28.insere("hi!", (java.lang.Object) (short) 10);
        tabelaHash28.imprime();
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.imprime();
        java.lang.Object obj53 = tabelaHash50.pesquisa("hi!");
        tabelaHash50.insere("hi!", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj63 = tabelaHash58.pesquisa("hi!");
        java.lang.Object obj65 = tabelaHash58.pesquisa("hi!");
        tabelaHash58.imprime();
        tabelaHash58.imprime();
        java.lang.Class<?> wildcardClass68 = tabelaHash58.getClass();
        tabelaHash50.insere("", (java.lang.Object) wildcardClass68);
        java.lang.Object obj71 = tabelaHash50.pesquisa("");
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash50);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash28);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + '4' + "'", obj63, '4');
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + '4' + "'", obj65, '4');
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertEquals(obj71.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj71), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj71), "class ds.TabelaHash");
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 0);
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj25 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.retira("hi!");
        java.lang.Object obj29 = tabelaHash19.pesquisa("");
        java.lang.Object obj31 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        java.lang.Class<?> wildcardClass33 = tabelaHash19.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Object obj36 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.imprime();
        tabelaHash38.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj44 = tabelaHash38.pesquisa("");
        tabelaHash38.retira("hi!");
        java.lang.Object obj48 = tabelaHash38.pesquisa("");
        java.lang.Object obj50 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        java.lang.Class<?> wildcardClass52 = tabelaHash38.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash38);
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        tabelaHash55.imprime();
        tabelaHash38.insere("hi!", (java.lang.Object) tabelaHash55);
        java.lang.Object obj59 = tabelaHash55.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash55.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "hi!" + "'", obj25, "hi!");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0 + "'", obj36, 0);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj21 = tabelaHash15.pesquisa("");
        tabelaHash15.insere("", (java.lang.Object) (short) 10);
        tabelaHash15.retira("hi!");
        tabelaHash15.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash15.imprime();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj11 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.retira("hi!");
        java.lang.Object obj15 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) 0);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        java.lang.Object obj25 = tabelaHash22.pesquisa("");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        java.lang.Object obj30 = tabelaHash27.pesquisa("hi!");
        tabelaHash22.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash5.insere("", (java.lang.Object) tabelaHash22);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash22);
        tabelaHash22.imprime();
        tabelaHash22.retira("hi!");
        java.lang.Object obj38 = tabelaHash22.pesquisa("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash16.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj31 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        tabelaHash26.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash26);
        java.lang.Object obj38 = tabelaHash26.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + '4' + "'", obj31, '4');
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj22 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.retira("hi!");
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        java.lang.Object obj28 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        java.lang.Object obj33 = tabelaHash16.pesquisa("");
        java.lang.Class<?> wildcardClass34 = tabelaHash16.getClass();
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "hi!" + "'", obj22, "hi!");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj21 = tabelaHash15.pesquisa("");
        tabelaHash15.insere("", (java.lang.Object) (short) 10);
        tabelaHash15.retira("hi!");
        tabelaHash15.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.imprime();
        java.lang.Object obj38 = tabelaHash30.pesquisa("hi!");
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        tabelaHash0.insere("hi!", obj38);
        java.lang.Class<?> wildcardClass41 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '4' + "'", obj35, '4');
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + '4' + "'", obj38, '4');
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) '#');
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0f));
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj20 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("hi!");
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        java.lang.Object obj26 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        java.lang.Object obj30 = tabelaHash14.pesquisa("");
        tabelaHash0.insere("", obj30);
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 0);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash12.retira("hi!");
        tabelaHash12.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj25 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash12.retira("");
        tabelaHash12.imprime();
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj23 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.retira("hi!");
        java.lang.Object obj27 = tabelaHash17.pesquisa("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass34 = tabelaHash29.getClass();
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash29);
        tabelaHash17.retira("hi!");
        java.lang.Object obj39 = tabelaHash17.pesquisa("hi!");
        java.lang.Object obj41 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.insere("hi!", (java.lang.Object) '4');
        java.lang.Class<?> wildcardClass47 = tabelaHash43.getClass();
        tabelaHash17.insere("", (java.lang.Object) wildcardClass47);
        java.lang.Object obj50 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        tabelaHash52.imprime();
        tabelaHash52.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj58 = tabelaHash52.pesquisa("hi!");
        tabelaHash52.insere("hi!", (java.lang.Object) (byte) 100);
        tabelaHash52.imprime();
        tabelaHash17.insere("", (java.lang.Object) tabelaHash52);
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        tabelaHash65.imprime();
        tabelaHash65.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass70 = tabelaHash65.getClass();
        tabelaHash17.insere("hi!", (java.lang.Object) wildcardClass70);
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        tabelaHash17.retira("hi!");
        tabelaHash17.retira("");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "hi!" + "'", obj23, "hi!");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + "hi!" + "'", obj58, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash12.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("hi!");
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj26 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass28 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0f));
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '4' + "'", obj11, '4');
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash12.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj23 = null;
        tabelaHash0.insere("", obj23);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        java.lang.Class<?> wildcardClass28 = tabelaHash26.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass28);
        java.lang.Class<?> wildcardClass30 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0f));
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj24 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.retira("hi!");
        java.lang.Object obj28 = tabelaHash18.pesquisa("");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.imprime();
        tabelaHash30.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass35 = tabelaHash30.getClass();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash18.retira("hi!");
        java.lang.Object obj40 = tabelaHash18.pesquisa("hi!");
        java.lang.Object obj42 = tabelaHash18.pesquisa("hi!");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.insere("hi!", (java.lang.Object) '4');
        java.lang.Class<?> wildcardClass48 = tabelaHash44.getClass();
        tabelaHash18.insere("", (java.lang.Object) wildcardClass48);
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        tabelaHash52.imprime();
        tabelaHash52.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj58 = tabelaHash52.pesquisa("");
        tabelaHash52.insere("", (java.lang.Object) (short) 10);
        tabelaHash52.insere("hi!", (java.lang.Object) (short) 100);
        ds.TabelaHash tabelaHash66 = new ds.TabelaHash();
        tabelaHash66.imprime();
        tabelaHash66.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj72 = tabelaHash66.pesquisa("hi!");
        tabelaHash66.retira("hi!");
        java.lang.Object obj76 = tabelaHash66.pesquisa("");
        java.lang.Object obj78 = tabelaHash66.pesquisa("hi!");
        tabelaHash66.imprime();
        java.lang.Object obj81 = tabelaHash66.pesquisa("hi!");
        java.lang.Object obj83 = tabelaHash66.pesquisa("");
        tabelaHash52.insere("", obj83);
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash52);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash52);
        java.lang.Object obj88 = tabelaHash52.pesquisa("hi!");
        tabelaHash52.imprime();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "hi!" + "'", obj24, "hi!");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + "hi!" + "'", obj72, "hi!");
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertEquals("'" + obj88 + "' != '" + "hi!" + "'", obj88, "hi!");
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash16.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj26 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj34 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.retira("hi!");
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash28.insere("hi!", (java.lang.Object) 0);
        tabelaHash28.insere("", (java.lang.Object) (byte) 100);
        tabelaHash28.retira("hi!");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.imprime();
        tabelaHash50.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj56 = tabelaHash50.pesquisa("");
        tabelaHash50.retira("hi!");
        java.lang.Object obj60 = tabelaHash50.pesquisa("");
        java.lang.Object obj62 = tabelaHash50.pesquisa("hi!");
        tabelaHash50.imprime();
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        tabelaHash65.imprime();
        tabelaHash65.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj71 = tabelaHash65.pesquisa("hi!");
        tabelaHash65.retira("hi!");
        java.lang.Object obj75 = tabelaHash65.pesquisa("");
        tabelaHash65.imprime();
        tabelaHash65.imprime();
        tabelaHash65.imprime();
        tabelaHash50.insere("", (java.lang.Object) tabelaHash65);
        tabelaHash28.insere("", (java.lang.Object) tabelaHash50);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Object obj83 = tabelaHash28.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "hi!" + "'", obj34, "hi!");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + "hi!" + "'", obj71, "hi!");
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + (byte) 100 + "'", obj83, (byte) 100);
    }

    @Ignore
    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Class<?> wildcardClass19 = tabelaHash17.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass19);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.imprime();
        tabelaHash24.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj30 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.retira("hi!");
        java.lang.Object obj34 = tabelaHash24.pesquisa("");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        tabelaHash36.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass41 = tabelaHash36.getClass();
        tabelaHash24.insere("hi!", (java.lang.Object) tabelaHash36);
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.imprime();
        tabelaHash44.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj50 = tabelaHash44.pesquisa("hi!");
        tabelaHash44.retira("hi!");
        java.lang.Object obj54 = tabelaHash44.pesquisa("");
        java.lang.Object obj56 = tabelaHash44.pesquisa("");
        tabelaHash44.imprime();
        tabelaHash36.insere("hi!", (java.lang.Object) tabelaHash44);
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        tabelaHash60.imprime();
        tabelaHash60.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj66 = tabelaHash60.pesquisa("");
        tabelaHash60.insere("", (java.lang.Object) (short) 10);
        tabelaHash60.retira("hi!");
        tabelaHash60.imprime();
        tabelaHash36.insere("hi!", (java.lang.Object) tabelaHash60);
        ds.TabelaHash tabelaHash75 = new ds.TabelaHash();
        tabelaHash75.imprime();
        java.lang.Object obj78 = tabelaHash75.pesquisa("hi!");
        tabelaHash60.insere("", (java.lang.Object) tabelaHash75);
        java.lang.Object obj81 = tabelaHash75.pesquisa("hi!");
        java.lang.Class<?> wildcardClass82 = tabelaHash75.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass82);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "hi!" + "'", obj30, "hi!");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "hi!" + "'", obj50, "hi!");
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        java.lang.Object obj8 = tabelaHash5.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "hi!" + "'", obj14, "hi!");
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 0);
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = obj21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 100);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj23 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.retira("hi!");
        java.lang.Object obj27 = tabelaHash17.pesquisa("");
        java.lang.Object obj29 = tabelaHash17.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj29);
        java.lang.Object obj32 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj34 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        tabelaHash36.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj42 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.insere("hi!", (java.lang.Object) (byte) 100);
        tabelaHash36.imprime();
        java.lang.Object obj48 = tabelaHash36.pesquisa("hi!");
        java.lang.Object obj50 = tabelaHash36.pesquisa("");
        tabelaHash0.insere("hi!", obj50);
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        tabelaHash53.imprime();
        tabelaHash53.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj59 = tabelaHash53.pesquisa("");
        tabelaHash53.insere("", (java.lang.Object) (short) 10);
        tabelaHash53.insere("hi!", (java.lang.Object) (short) 100);
        ds.TabelaHash tabelaHash67 = new ds.TabelaHash();
        tabelaHash67.imprime();
        tabelaHash67.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj73 = tabelaHash67.pesquisa("hi!");
        tabelaHash67.retira("hi!");
        java.lang.Object obj77 = tabelaHash67.pesquisa("");
        java.lang.Object obj79 = tabelaHash67.pesquisa("hi!");
        tabelaHash67.imprime();
        java.lang.Object obj82 = tabelaHash67.pesquisa("hi!");
        java.lang.Object obj84 = tabelaHash67.pesquisa("");
        tabelaHash53.insere("", obj84);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash53);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "hi!" + "'", obj23, "hi!");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100 + "'", obj32, 100);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100 + "'", obj34, 100);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "hi!" + "'", obj42, "hi!");
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "hi!" + "'", obj48, "hi!");
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + "hi!" + "'", obj73, "hi!");
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj84);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0f));
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj17 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Object obj22 = tabelaHash11.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash11.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        java.lang.Object obj20 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass25 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = obj8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Ignore
    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
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
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + '4' + "'", obj5, '4');
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + '4' + "'", obj8, '4');
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
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
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash12.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("hi!");
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("hi!", (java.lang.Object) '4');
        java.lang.Class<?> wildcardClass30 = tabelaHash26.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass30);
        java.lang.Object obj33 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.imprime();
        tabelaHash35.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj41 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.insere("hi!", (java.lang.Object) (byte) 100);
        tabelaHash35.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash35);
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.imprime();
        tabelaHash48.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass53 = tabelaHash48.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass53);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "hi!" + "'", obj41, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 100);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj23 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.retira("hi!");
        java.lang.Object obj27 = tabelaHash17.pesquisa("");
        java.lang.Object obj29 = tabelaHash17.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj29);
        java.lang.Object obj32 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj34 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "hi!" + "'", obj23, "hi!");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100 + "'", obj32, 100);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100 + "'", obj34, 100);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + '4' + "'", obj5, '4');
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + '4' + "'", obj21, '4');
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '4' + "'", obj23, '4');
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        java.lang.Object obj8 = tabelaHash5.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj19 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.retira("hi!");
        java.lang.Object obj23 = tabelaHash13.pesquisa("");
        java.lang.Object obj25 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj35 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.retira("hi!");
        java.lang.Object obj39 = tabelaHash29.pesquisa("");
        java.lang.Object obj41 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.insere("hi!", (java.lang.Object) 100);
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        tabelaHash46.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj52 = tabelaHash46.pesquisa("hi!");
        tabelaHash46.retira("hi!");
        java.lang.Object obj56 = tabelaHash46.pesquisa("");
        java.lang.Object obj58 = tabelaHash46.pesquisa("hi!");
        tabelaHash29.insere("hi!", obj58);
        tabelaHash13.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash64 = new ds.TabelaHash();
        tabelaHash64.imprime();
        tabelaHash64.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj70 = tabelaHash64.pesquisa("");
        tabelaHash64.retira("hi!");
        java.lang.Object obj74 = tabelaHash64.pesquisa("");
        java.lang.Object obj76 = tabelaHash64.pesquisa("hi!");
        tabelaHash64.imprime();
        tabelaHash64.imprime();
        java.lang.Object obj80 = tabelaHash64.pesquisa("");
        java.lang.Object obj82 = tabelaHash64.pesquisa("");
        java.lang.Object obj84 = tabelaHash64.pesquisa("");
        tabelaHash64.imprime();
        java.lang.Class<?> wildcardClass86 = tabelaHash64.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass86);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "hi!" + "'", obj19, "hi!");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "hi!" + "'", obj35, "hi!");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + "hi!" + "'", obj52, "hi!");
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash16.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj33 = tabelaHash27.pesquisa("");
        tabelaHash27.retira("hi!");
        java.lang.Object obj37 = tabelaHash27.pesquisa("");
        java.lang.Object obj39 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash27);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        java.lang.Object obj20 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        java.lang.Object obj31 = tabelaHash22.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "hi!" + "'", obj31, "hi!");
    }
}

