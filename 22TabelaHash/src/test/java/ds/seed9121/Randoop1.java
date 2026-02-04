package ds.seed9121;

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
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) ' ');
        tabelaHash11.insere("hi!", (java.lang.Object) 0L);
        tabelaHash11.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("hi!", (java.lang.Object) ' ');
        tabelaHash23.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj31 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        tabelaHash23.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.insere("hi!", (java.lang.Object) ' ');
        tabelaHash37.insere("hi!", (java.lang.Object) 0L);
        tabelaHash37.insere("", (java.lang.Object) 100L);
        tabelaHash37.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash37.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash37);
        tabelaHash11.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj54 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        java.lang.Object obj57 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj59 = tabelaHash11.pesquisa("");
        java.lang.Class<?> wildcardClass60 = obj59.getClass();
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + ' ' + "'", obj54, ' ');
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + ' ' + "'", obj57, ' ');
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + "hi!" + "'", obj59, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj26 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) ' ');
        tabelaHash28.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj36 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("hi!", (java.lang.Object) ' ');
        tabelaHash42.insere("hi!", (java.lang.Object) 0L);
        tabelaHash42.insere("", (java.lang.Object) 100L);
        tabelaHash42.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash42.imprime();
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash42);
        tabelaHash28.insere("", (java.lang.Object) (short) -1);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        tabelaHash62.insere("hi!", (java.lang.Object) ' ');
        tabelaHash62.insere("hi!", (java.lang.Object) 0L);
        tabelaHash62.imprime();
        java.lang.Class<?> wildcardClass70 = tabelaHash62.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass70);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0d) + "'", obj23, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + ' ' + "'", obj26, ' ');
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 100L);
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0f);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) ' ');
        tabelaHash11.insere("hi!", (java.lang.Object) 0L);
        tabelaHash11.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.retira("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) ' ');
        tabelaHash28.insere("hi!", (java.lang.Object) 0L);
        tabelaHash28.insere("", (java.lang.Object) 100L);
        tabelaHash28.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash28.retira("hi!");
        java.lang.Object obj44 = tabelaHash28.pesquisa("hi!");
        tabelaHash25.insere("hi!", obj44);
        java.lang.Object obj47 = tabelaHash25.pesquisa("hi!");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.insere("hi!", (java.lang.Object) ' ');
        tabelaHash51.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj59 = tabelaHash51.pesquisa("");
        tabelaHash51.imprime();
        tabelaHash51.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        tabelaHash65.insere("hi!", (java.lang.Object) ' ');
        tabelaHash65.insere("hi!", (java.lang.Object) 0L);
        tabelaHash51.insere("", (java.lang.Object) 0L);
        java.lang.Object obj74 = tabelaHash51.pesquisa("");
        tabelaHash49.insere("", (java.lang.Object) tabelaHash51);
        java.lang.Class<?> wildcardClass76 = tabelaHash51.getClass();
        tabelaHash25.insere("hi!", (java.lang.Object) wildcardClass76);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash25);
        java.lang.Object obj80 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("hi!");
        java.lang.Class<?> wildcardClass83 = tabelaHash11.getClass();
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + (-1.0d) + "'", obj74, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 100L);
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("hi!", (java.lang.Object) ' ');
        tabelaHash23.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj31 = tabelaHash23.pesquisa("");
        java.lang.Object obj33 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("hi!", (java.lang.Object) ' ');
        tabelaHash36.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj44 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        tabelaHash36.insere("", (java.lang.Object) (-1.0d));
        tabelaHash36.imprime();
        java.lang.Object obj51 = tabelaHash36.pesquisa("hi!");
        tabelaHash23.insere("hi!", obj51);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        java.lang.Object obj55 = tabelaHash23.pesquisa("");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + ' ' + "'", obj51, ' ');
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + ' ' + "'", obj16, ' ');
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) ' ');
        tabelaHash11.insere("hi!", (java.lang.Object) 0L);
        tabelaHash11.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("hi!", (java.lang.Object) ' ');
        tabelaHash23.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj31 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        tabelaHash23.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.insere("hi!", (java.lang.Object) ' ');
        tabelaHash37.insere("hi!", (java.lang.Object) 0L);
        tabelaHash37.insere("", (java.lang.Object) 100L);
        tabelaHash37.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash37.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash37);
        tabelaHash11.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj54 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        java.lang.Object obj57 = tabelaHash11.pesquisa("");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + ' ' + "'", obj54, ' ');
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + "hi!" + "'", obj57, "hi!");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + ' ' + "'", obj15, ' ');
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1.0d) + "'", obj21, (-1.0d));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj22 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) ' ');
        tabelaHash28.insere("hi!", (java.lang.Object) 0L);
        tabelaHash28.insere("", (java.lang.Object) 100L);
        tabelaHash28.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash28.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash28);
        tabelaHash14.insere("", (java.lang.Object) (short) -1);
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.insere("hi!", (java.lang.Object) ' ');
        tabelaHash47.insere("hi!", (java.lang.Object) 0L);
        tabelaHash47.insere("", (java.lang.Object) 100L);
        tabelaHash47.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash47.retira("hi!");
        java.lang.Object obj63 = tabelaHash47.pesquisa("hi!");
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        tabelaHash65.insere("hi!", (java.lang.Object) ' ');
        tabelaHash65.insere("hi!", (java.lang.Object) 0L);
        tabelaHash65.insere("hi!", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash76 = new ds.TabelaHash();
        tabelaHash76.insere("hi!", (java.lang.Object) ' ');
        tabelaHash76.insere("hi!", (java.lang.Object) 0L);
        tabelaHash76.insere("hi!", (java.lang.Object) '4');
        tabelaHash65.insere("hi!", (java.lang.Object) tabelaHash76);
        tabelaHash76.retira("hi!");
        tabelaHash76.insere("hi!", (java.lang.Object) 10.0d);
        tabelaHash47.insere("hi!", (java.lang.Object) tabelaHash76);
        tabelaHash14.insere("", (java.lang.Object) tabelaHash76);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash76);
        java.lang.Object obj96 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj96);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1L));
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) ' ');
        tabelaHash20.insere("hi!", (java.lang.Object) 0L);
        tabelaHash20.insere("", (java.lang.Object) 100L);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) ' ');
        tabelaHash31.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj39 = tabelaHash31.pesquisa("");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("hi!", (java.lang.Object) ' ');
        tabelaHash41.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj49 = tabelaHash41.pesquisa("");
        tabelaHash41.imprime();
        tabelaHash41.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        tabelaHash55.insere("hi!", (java.lang.Object) ' ');
        tabelaHash55.insere("hi!", (java.lang.Object) 0L);
        tabelaHash41.insere("", (java.lang.Object) 0L);
        java.lang.Object obj64 = tabelaHash41.pesquisa("");
        tabelaHash41.imprime();
        tabelaHash31.insere("", (java.lang.Object) tabelaHash41);
        tabelaHash31.retira("hi!");
        tabelaHash31.retira("");
        tabelaHash20.insere("hi!", (java.lang.Object) "");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0d) + "'", obj18, (-1.0d));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + (-1.0d) + "'", obj64, (-1.0d));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj22 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) ' ');
        tabelaHash28.insere("hi!", (java.lang.Object) 0L);
        tabelaHash28.insere("", (java.lang.Object) 100L);
        tabelaHash28.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash28.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash28);
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.insere("hi!", (java.lang.Object) ' ');
        tabelaHash44.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj52 = tabelaHash44.pesquisa("");
        tabelaHash44.imprime();
        tabelaHash44.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.insere("hi!", (java.lang.Object) ' ');
        tabelaHash58.insere("hi!", (java.lang.Object) 0L);
        tabelaHash58.insere("", (java.lang.Object) 100L);
        tabelaHash58.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash58.imprime();
        tabelaHash44.insere("hi!", (java.lang.Object) tabelaHash58);
        tabelaHash44.insere("", (java.lang.Object) (short) -1);
        tabelaHash44.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash44);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        java.lang.Class<?> wildcardClass80 = tabelaHash14.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1L));
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) ' ');
        tabelaHash22.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj30 = tabelaHash22.pesquisa("");
        tabelaHash22.imprime();
        tabelaHash22.insere("", (java.lang.Object) (-1.0d));
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash22.insere("hi!", (java.lang.Object) (short) 1);
        java.lang.Object obj41 = tabelaHash22.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj41);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1.0d) + "'", obj18, (-1.0d));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + ' ' + "'", obj41, ' ');
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) ' ');
        tabelaHash11.insere("hi!", (java.lang.Object) 0L);
        tabelaHash11.insere("hi!", (java.lang.Object) '4');
        tabelaHash11.retira("hi!");
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash11.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0d) + "'", obj23, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + ' ' + "'", obj25, ' ');
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1.0d) + "'", obj27, (-1.0d));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) ' ');
        tabelaHash10.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash10.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("hi!", (java.lang.Object) ' ');
        tabelaHash24.insere("hi!", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        java.lang.Object obj33 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        java.lang.Object obj37 = tabelaHash0.pesquisa("");
        java.lang.Object obj39 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj42 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (-1.0d) + "'", obj33, (-1.0d));
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + ' ' + "'", obj39, ' ');
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + ' ' + "'", obj42, ' ');
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
        tabelaHash2.insere("hi!", (java.lang.Object) ' ');
        tabelaHash2.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj10 = tabelaHash2.pesquisa("");
        tabelaHash2.imprime();
        tabelaHash2.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) ' ');
        tabelaHash16.insere("hi!", (java.lang.Object) 0L);
        tabelaHash2.insere("", (java.lang.Object) 0L);
        java.lang.Object obj25 = tabelaHash2.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash2);
        tabelaHash2.insere("", (java.lang.Object) (byte) 1);
        java.lang.Object obj31 = tabelaHash2.pesquisa("");
        tabelaHash2.imprime();
        tabelaHash2.insere("hi!", (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass36 = tabelaHash2.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1.0d) + "'", obj25, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (-1.0d) + "'", obj31, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj26 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) ' ');
        tabelaHash28.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj36 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("hi!", (java.lang.Object) ' ');
        tabelaHash42.insere("hi!", (java.lang.Object) 0L);
        tabelaHash42.insere("", (java.lang.Object) 100L);
        tabelaHash42.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash42.imprime();
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash42);
        tabelaHash28.insere("", (java.lang.Object) (short) -1);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj62 = null;
        tabelaHash0.insere("hi!", obj62);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass65 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0d) + "'", obj23, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + ' ' + "'", obj26, ' ');
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.insere("hi!", (java.lang.Object) ' ');
        tabelaHash4.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj12 = tabelaHash4.pesquisa("");
        tabelaHash4.imprime();
        tabelaHash4.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) ' ');
        tabelaHash18.insere("hi!", (java.lang.Object) 0L);
        tabelaHash4.insere("", (java.lang.Object) 0L);
        java.lang.Object obj27 = tabelaHash4.pesquisa("");
        tabelaHash2.insere("", (java.lang.Object) tabelaHash4);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1.0d) + "'", obj27, (-1.0d));
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        java.lang.Object obj29 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass32 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0d) + "'", obj23, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + ' ' + "'", obj25, ' ');
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1.0d) + "'", obj27, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + ' ' + "'", obj29, ' ');
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) 0L);
        tabelaHash14.insere("", (java.lang.Object) 100L);
        tabelaHash14.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        java.lang.Object obj30 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass33 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + ' ' + "'", obj30, ' ');
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) ' ');
        tabelaHash25.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        java.lang.Object obj34 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass35 = obj34.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1L));
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + ' ' + "'", obj18, ' ');
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Ignore
    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) 0L);
        tabelaHash14.insere("", (java.lang.Object) 100L);
        tabelaHash14.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        java.lang.Object obj30 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj33 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash14.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100L + "'", obj30, 100L);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100L + "'", obj33, 100L);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 100L);
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + ' ' + "'", obj11, ' ');
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj26 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) ' ');
        tabelaHash31.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj39 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        tabelaHash31.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.insere("hi!", (java.lang.Object) ' ');
        tabelaHash45.insere("hi!", (java.lang.Object) 0L);
        tabelaHash31.insere("", (java.lang.Object) 0L);
        java.lang.Object obj54 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        java.lang.Object obj57 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        tabelaHash31.retira("hi!");
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        tabelaHash62.insere("hi!", (java.lang.Object) ' ');
        tabelaHash62.insere("hi!", (java.lang.Object) 0L);
        tabelaHash62.insere("", (java.lang.Object) 100L);
        tabelaHash62.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash62.retira("hi!");
        java.lang.Object obj78 = tabelaHash62.pesquisa("hi!");
        tabelaHash62.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash62.imprime();
        tabelaHash31.insere("", (java.lang.Object) tabelaHash62);
        java.lang.Object obj85 = tabelaHash62.pesquisa("hi!");
        java.lang.Object obj87 = tabelaHash62.pesquisa("hi!");
        tabelaHash62.imprime();
        tabelaHash62.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash62);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0d) + "'", obj23, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (-1.0d) + "'", obj26, (-1.0d));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (-1.0d) + "'", obj54, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (-1.0d) + "'", obj57, (-1.0d));
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + (short) 1 + "'", obj85, (short) 1);
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + (short) 1 + "'", obj87, (short) 1);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) ' ');
        tabelaHash10.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash10.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("hi!", (java.lang.Object) ' ');
        tabelaHash24.insere("hi!", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        java.lang.Object obj33 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash10.retira("");
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.insere("hi!", (java.lang.Object) ' ');
        tabelaHash39.insere("hi!", (java.lang.Object) 0L);
        tabelaHash39.insere("", (java.lang.Object) 100L);
        tabelaHash39.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash39.retira("hi!");
        java.lang.Object obj55 = tabelaHash39.pesquisa("hi!");
        java.lang.Object obj57 = null;
        tabelaHash39.insere("hi!", obj57);
        tabelaHash10.insere("", (java.lang.Object) tabelaHash39);
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        tabelaHash61.insere("hi!", (java.lang.Object) ' ');
        tabelaHash61.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj69 = tabelaHash61.pesquisa("");
        tabelaHash61.imprime();
        tabelaHash61.imprime();
        tabelaHash39.insere("hi!", (java.lang.Object) tabelaHash61);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (-1.0d) + "'", obj33, (-1.0d));
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) ' ');
        tabelaHash13.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj21 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash13.insere("", (java.lang.Object) (-1.0d));
        tabelaHash13.imprime();
        java.lang.Object obj28 = tabelaHash13.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj28);
        java.lang.Object obj31 = null;
        tabelaHash0.insere("hi!", obj31);
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.insere("hi!", (java.lang.Object) ' ');
        tabelaHash37.insere("hi!", (java.lang.Object) 0L);
        tabelaHash37.insere("", (java.lang.Object) 100L);
        tabelaHash37.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash37.retira("hi!");
        java.lang.Object obj53 = tabelaHash37.pesquisa("hi!");
        tabelaHash34.insere("hi!", obj53);
        tabelaHash34.retira("hi!");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.imprime();
        java.lang.Object obj61 = tabelaHash58.pesquisa("hi!");
        tabelaHash34.insere("", (java.lang.Object) tabelaHash58);
        tabelaHash34.retira("");
        ds.TabelaHash tabelaHash66 = new ds.TabelaHash();
        tabelaHash66.insere("hi!", (java.lang.Object) ' ');
        tabelaHash66.insere("hi!", (java.lang.Object) 0L);
        tabelaHash66.insere("", (java.lang.Object) 100L);
        java.lang.Object obj77 = tabelaHash66.pesquisa("hi!");
        java.lang.Object obj79 = tabelaHash66.pesquisa("");
        tabelaHash66.imprime();
        java.lang.Object obj82 = tabelaHash66.pesquisa("");
        java.lang.Class<?> wildcardClass83 = obj82.getClass();
        tabelaHash34.insere("hi!", (java.lang.Object) wildcardClass83);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + ' ' + "'", obj28, ' ');
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + ' ' + "'", obj77, ' ');
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + 100L + "'", obj79, 100L);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + 100L + "'", obj82, 100L);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) ' ');
        tabelaHash11.insere("hi!", (java.lang.Object) 0L);
        tabelaHash11.insere("", (java.lang.Object) 100L);
        tabelaHash11.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash11.retira("hi!");
        java.lang.Object obj27 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj29 = null;
        tabelaHash11.insere("hi!", obj29);
        java.lang.Class<?> wildcardClass31 = tabelaHash11.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.insere("hi!", (java.lang.Object) ' ');
        tabelaHash34.insere("hi!", (java.lang.Object) 0L);
        tabelaHash34.insere("", (java.lang.Object) 100L);
        tabelaHash34.retira("");
        java.lang.Object obj47 = tabelaHash34.pesquisa("hi!");
        java.lang.Object obj49 = tabelaHash34.pesquisa("");
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.insere("hi!", (java.lang.Object) ' ');
        tabelaHash51.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj59 = tabelaHash51.pesquisa("");
        tabelaHash51.imprime();
        tabelaHash51.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        tabelaHash65.insere("hi!", (java.lang.Object) ' ');
        tabelaHash65.insere("hi!", (java.lang.Object) 0L);
        tabelaHash65.insere("", (java.lang.Object) 100L);
        tabelaHash65.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash65.imprime();
        tabelaHash51.insere("hi!", (java.lang.Object) tabelaHash65);
        java.lang.Object obj81 = tabelaHash65.pesquisa("");
        tabelaHash65.imprime();
        tabelaHash34.insere("hi!", (java.lang.Object) tabelaHash65);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash65);
        tabelaHash65.retira("");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + ' ' + "'", obj47, ' ');
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertEquals("'" + obj81 + "' != '" + 100L + "'", obj81, 100L);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj26 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("hi!", (java.lang.Object) ' ');
        tabelaHash31.insere("hi!", (java.lang.Object) 0L);
        tabelaHash31.insere("", (java.lang.Object) 100L);
        tabelaHash31.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash31.retira("hi!");
        java.lang.Object obj47 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash31.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash31);
        java.lang.Object obj54 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0d) + "'", obj23, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (-1.0d) + "'", obj26, (-1.0d));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (short) 1 + "'", obj54, (short) 1);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) ' ');
        tabelaHash11.insere("hi!", (java.lang.Object) 0L);
        tabelaHash11.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.retira("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) ' ');
        tabelaHash28.insere("hi!", (java.lang.Object) 0L);
        tabelaHash28.insere("", (java.lang.Object) 100L);
        tabelaHash28.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash28.retira("hi!");
        java.lang.Object obj44 = tabelaHash28.pesquisa("hi!");
        tabelaHash25.insere("hi!", obj44);
        java.lang.Object obj47 = tabelaHash25.pesquisa("hi!");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.insere("hi!", (java.lang.Object) ' ');
        tabelaHash51.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj59 = tabelaHash51.pesquisa("");
        tabelaHash51.imprime();
        tabelaHash51.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        tabelaHash65.insere("hi!", (java.lang.Object) ' ');
        tabelaHash65.insere("hi!", (java.lang.Object) 0L);
        tabelaHash51.insere("", (java.lang.Object) 0L);
        java.lang.Object obj74 = tabelaHash51.pesquisa("");
        tabelaHash49.insere("", (java.lang.Object) tabelaHash51);
        java.lang.Class<?> wildcardClass76 = tabelaHash51.getClass();
        tabelaHash25.insere("hi!", (java.lang.Object) wildcardClass76);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash25);
        java.lang.Object obj80 = null;
        tabelaHash25.insere("hi!", obj80);
        tabelaHash25.retira("hi!");
        tabelaHash25.retira("hi!");
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + (-1.0d) + "'", obj74, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) ' ');
        tabelaHash10.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash10.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("hi!", (java.lang.Object) ' ');
        tabelaHash24.insere("hi!", (java.lang.Object) 0L);
        tabelaHash10.insere("", (java.lang.Object) 0L);
        java.lang.Object obj33 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (-1.0d) + "'", obj33, (-1.0d));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) ' ');
        tabelaHash11.insere("hi!", (java.lang.Object) 0L);
        tabelaHash11.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.retira("hi!");
        tabelaHash11.insere("hi!", (java.lang.Object) 10.0d);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) ' ');
        tabelaHash28.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj36 = tabelaHash28.pesquisa("");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("hi!", (java.lang.Object) ' ');
        tabelaHash38.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj46 = tabelaHash38.pesquisa("");
        tabelaHash38.imprime();
        tabelaHash38.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        tabelaHash52.insere("hi!", (java.lang.Object) ' ');
        tabelaHash52.insere("hi!", (java.lang.Object) 0L);
        tabelaHash38.insere("", (java.lang.Object) 0L);
        java.lang.Object obj61 = tabelaHash38.pesquisa("");
        tabelaHash38.imprime();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash38);
        tabelaHash11.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj66 = tabelaHash11.pesquisa("");
        ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
        tabelaHash68.insere("hi!", (java.lang.Object) ' ');
        tabelaHash68.retira("hi!");
        tabelaHash11.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj76 = tabelaHash11.pesquisa("");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (-1.0d) + "'", obj61, (-1.0d));
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + "hi!" + "'", obj76, "hi!");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = obj19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + ' ' + "'", obj15, ' ');
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) ' ');
        tabelaHash11.insere("hi!", (java.lang.Object) 0L);
        tabelaHash11.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.retira("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) ' ');
        tabelaHash25.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj33 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        tabelaHash25.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.insere("hi!", (java.lang.Object) ' ');
        tabelaHash39.insere("hi!", (java.lang.Object) 0L);
        tabelaHash25.insere("", (java.lang.Object) 0L);
        java.lang.Object obj48 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        java.lang.Object obj51 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        tabelaHash25.retira("hi!");
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        tabelaHash56.insere("hi!", (java.lang.Object) ' ');
        tabelaHash56.insere("hi!", (java.lang.Object) 0L);
        tabelaHash56.insere("", (java.lang.Object) 100L);
        tabelaHash56.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash56.retira("hi!");
        java.lang.Object obj72 = tabelaHash56.pesquisa("hi!");
        tabelaHash56.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash56.imprime();
        tabelaHash25.insere("", (java.lang.Object) tabelaHash56);
        java.lang.Object obj79 = tabelaHash56.pesquisa("hi!");
        tabelaHash11.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (-1.0d) + "'", obj48, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (-1.0d) + "'", obj51, (-1.0d));
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + (short) 1 + "'", obj79, (short) 1);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
        tabelaHash2.insere("hi!", (java.lang.Object) ' ');
        tabelaHash2.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj10 = tabelaHash2.pesquisa("");
        tabelaHash2.imprime();
        tabelaHash2.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) ' ');
        tabelaHash16.insere("hi!", (java.lang.Object) 0L);
        tabelaHash2.insere("", (java.lang.Object) 0L);
        java.lang.Object obj25 = tabelaHash2.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash2);
        tabelaHash2.insere("", (java.lang.Object) (byte) 1);
        java.lang.Object obj31 = tabelaHash2.pesquisa("");
        tabelaHash2.imprime();
        tabelaHash2.insere("hi!", (java.lang.Object) '#');
        java.lang.Object obj37 = tabelaHash2.pesquisa("");
        java.lang.Object obj39 = null;
        tabelaHash2.insere("hi!", obj39);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1.0d) + "'", obj25, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (-1.0d) + "'", obj31, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (-1.0d) + "'", obj37, (-1.0d));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        tabelaHash3.insere("hi!", (java.lang.Object) ' ');
        tabelaHash3.insere("hi!", (java.lang.Object) 0L);
        tabelaHash3.insere("", (java.lang.Object) 100L);
        tabelaHash3.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash3.retira("hi!");
        java.lang.Object obj19 = tabelaHash3.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj19);
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("hi!", (java.lang.Object) ' ');
        tabelaHash26.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj34 = tabelaHash26.pesquisa("");
        tabelaHash26.imprime();
        tabelaHash26.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.insere("hi!", (java.lang.Object) ' ');
        tabelaHash40.insere("hi!", (java.lang.Object) 0L);
        tabelaHash26.insere("", (java.lang.Object) 0L);
        java.lang.Object obj49 = tabelaHash26.pesquisa("");
        tabelaHash24.insere("", (java.lang.Object) tabelaHash26);
        java.lang.Class<?> wildcardClass51 = tabelaHash26.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass51);
        java.lang.Object obj54 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass55 = obj54.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (-1.0d) + "'", obj49, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        tabelaHash3.insere("hi!", (java.lang.Object) ' ');
        tabelaHash3.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj11 = tabelaHash3.pesquisa("");
        tabelaHash3.imprime();
        tabelaHash3.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) ' ');
        tabelaHash17.insere("hi!", (java.lang.Object) 0L);
        tabelaHash17.insere("", (java.lang.Object) 100L);
        tabelaHash17.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash17.imprime();
        tabelaHash3.insere("hi!", (java.lang.Object) tabelaHash17);
        java.lang.Object obj33 = tabelaHash17.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        java.lang.Object obj36 = tabelaHash17.pesquisa("hi!");
        java.lang.Object obj38 = tabelaHash17.pesquisa("");
        java.lang.Object obj40 = tabelaHash17.pesquisa("");
        java.lang.Object obj42 = tabelaHash17.pesquisa("");
        java.lang.Object obj44 = tabelaHash17.pesquisa("");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100L + "'", obj33, 100L);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + ' ' + "'", obj36, ' ');
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100L + "'", obj38, 100L);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100L + "'", obj40, 100L);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100L + "'", obj42, 100L);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 100L + "'", obj44, 100L);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 100L);
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) false);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) ' ');
        tabelaHash18.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj26 = tabelaHash18.pesquisa("");
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("hi!", (java.lang.Object) ' ');
        tabelaHash32.insere("hi!", (java.lang.Object) 0L);
        tabelaHash18.insere("", (java.lang.Object) 0L);
        tabelaHash18.imprime();
        java.lang.Object obj42 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + ' ' + "'", obj42, ' ');
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("hi!", (java.lang.Object) ' ');
        tabelaHash5.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj13 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("hi!", (java.lang.Object) ' ');
        tabelaHash19.insere("hi!", (java.lang.Object) 0L);
        tabelaHash5.insere("", (java.lang.Object) 0L);
        tabelaHash5.retira("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) ' ');
        tabelaHash30.retira("hi!");
        tabelaHash5.insere("", (java.lang.Object) "hi!");
        tabelaHash5.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) 0L);
        tabelaHash14.insere("", (java.lang.Object) 100L);
        tabelaHash14.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass33 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("hi!", (java.lang.Object) ' ');
        tabelaHash19.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj27 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        tabelaHash19.insere("", (java.lang.Object) (-1.0d));
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj44 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + ' ' + "'", obj15, ' ');
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) 0L);
        tabelaHash14.insere("", (java.lang.Object) 100L);
        tabelaHash14.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        java.lang.Object obj30 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + ' ' + "'", obj30, ' ');
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("hi!", (java.lang.Object) ' ');
        tabelaHash11.insere("hi!", (java.lang.Object) 0L);
        tabelaHash11.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.retira("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) ' ');
        tabelaHash28.insere("hi!", (java.lang.Object) 0L);
        tabelaHash28.insere("", (java.lang.Object) 100L);
        tabelaHash28.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash28.retira("hi!");
        java.lang.Object obj44 = tabelaHash28.pesquisa("hi!");
        tabelaHash25.insere("hi!", obj44);
        java.lang.Object obj47 = tabelaHash25.pesquisa("hi!");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.insere("hi!", (java.lang.Object) ' ');
        tabelaHash51.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj59 = tabelaHash51.pesquisa("");
        tabelaHash51.imprime();
        tabelaHash51.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        tabelaHash65.insere("hi!", (java.lang.Object) ' ');
        tabelaHash65.insere("hi!", (java.lang.Object) 0L);
        tabelaHash51.insere("", (java.lang.Object) 0L);
        java.lang.Object obj74 = tabelaHash51.pesquisa("");
        tabelaHash49.insere("", (java.lang.Object) tabelaHash51);
        java.lang.Class<?> wildcardClass76 = tabelaHash51.getClass();
        tabelaHash25.insere("hi!", (java.lang.Object) wildcardClass76);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash25);
        ds.TabelaHash tabelaHash80 = new ds.TabelaHash();
        tabelaHash80.insere("hi!", (java.lang.Object) ' ');
        tabelaHash80.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj88 = tabelaHash80.pesquisa("");
        tabelaHash80.imprime();
        tabelaHash80.insere("", (java.lang.Object) (-1.0d));
        tabelaHash80.imprime();
        tabelaHash80.imprime();
        tabelaHash80.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash80);
        tabelaHash11.imprime();
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + (-1.0d) + "'", obj74, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj26 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0d) + "'", obj23, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (-1.0d) + "'", obj26, (-1.0d));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) ' ');
        tabelaHash15.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj23 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) ' ');
        tabelaHash29.insere("hi!", (java.lang.Object) 0L);
        tabelaHash15.insere("", (java.lang.Object) 0L);
        tabelaHash15.retira("hi!");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.insere("hi!", (java.lang.Object) ' ');
        tabelaHash40.retira("hi!");
        tabelaHash15.insere("", (java.lang.Object) "hi!");
        tabelaHash15.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Object obj50 = tabelaHash15.pesquisa("hi!");
        java.lang.Object obj52 = tabelaHash15.pesquisa("hi!");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 100L);
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) ' ');
        tabelaHash18.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj26 = tabelaHash18.pesquisa("");
        tabelaHash18.imprime();
        tabelaHash18.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("hi!", (java.lang.Object) ' ');
        tabelaHash32.insere("hi!", (java.lang.Object) 0L);
        tabelaHash18.insere("", (java.lang.Object) 0L);
        java.lang.Object obj41 = tabelaHash18.pesquisa("");
        tabelaHash18.imprime();
        java.lang.Object obj44 = tabelaHash18.pesquisa("");
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.insere("hi!", (java.lang.Object) ' ');
        tabelaHash46.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj54 = tabelaHash46.pesquisa("");
        tabelaHash46.imprime();
        tabelaHash46.insere("", (java.lang.Object) (-1.0d));
        tabelaHash46.imprime();
        java.lang.Object obj61 = tabelaHash46.pesquisa("hi!");
        tabelaHash46.retira("hi!");
        java.lang.Object obj65 = new java.lang.Object();
        tabelaHash46.insere("hi!", obj65);
        tabelaHash18.insere("", (java.lang.Object) tabelaHash46);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100L + "'", obj16, 100L);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (-1.0d) + "'", obj41, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (-1.0d) + "'", obj44, (-1.0d));
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + ' ' + "'", obj61, ' ');
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) ' ');
        tabelaHash14.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.insere("", (java.lang.Object) 0L);
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj26 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) ' ');
        tabelaHash28.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj36 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) (-1.0d));
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("hi!", (java.lang.Object) ' ');
        tabelaHash42.insere("hi!", (java.lang.Object) 0L);
        tabelaHash42.insere("", (java.lang.Object) 100L);
        tabelaHash42.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash42.imprime();
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash42);
        tabelaHash28.insere("", (java.lang.Object) (short) -1);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        tabelaHash62.insere("hi!", (java.lang.Object) ' ');
        tabelaHash62.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj70 = tabelaHash62.pesquisa("");
        java.lang.Object obj72 = tabelaHash62.pesquisa("");
        tabelaHash62.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash62);
        java.lang.Object obj77 = tabelaHash62.pesquisa("hi!");
        java.lang.Object obj79 = tabelaHash62.pesquisa("hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0d) + "'", obj23, (-1.0d));
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + ' ' + "'", obj26, ' ');
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj79);
    }
}

