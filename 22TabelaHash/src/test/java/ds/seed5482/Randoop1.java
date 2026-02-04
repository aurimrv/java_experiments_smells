package ds.seed5482;

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
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) '#');
        tabelaHash0.insere("hi!", (java.lang.Object) 100);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 100.0f);
        tabelaHash13.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash20);
        tabelaHash20.imprime();
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("", (java.lang.Object) "hi!");
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("", (java.lang.Object) 100.0f);
        tabelaHash38.insere("hi!", (java.lang.Object) (-1.0f));
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        java.lang.Object obj48 = tabelaHash46.pesquisa("");
        tabelaHash46.insere("hi!", (java.lang.Object) '4');
        tabelaHash38.insere("", (java.lang.Object) tabelaHash46);
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash38);
        tabelaHash38.retira("");
        tabelaHash38.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash38);
        java.lang.Object obj59 = tabelaHash38.pesquisa("hi!");
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        tabelaHash61.insere("", (java.lang.Object) "hi!");
        tabelaHash61.imprime();
        tabelaHash61.imprime();
        tabelaHash61.insere("hi!", (java.lang.Object) 1);
        tabelaHash61.imprime();
        tabelaHash61.retira("");
        tabelaHash61.retira("hi!");
        java.lang.Object obj76 = tabelaHash61.pesquisa("hi!");
        tabelaHash61.imprime();
        tabelaHash38.insere("", (java.lang.Object) tabelaHash61);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (-1.0f) + "'", obj59, (-1.0f));
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) '#');
        tabelaHash0.retira("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1L);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("", (java.lang.Object) "hi!");
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj22 = tabelaHash14.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        java.lang.Object obj27 = tabelaHash14.pesquisa("");
        java.lang.Object obj29 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0d + "'", obj22, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "hi!" + "'", obj24, "hi!");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "hi!" + "'", obj29, "hi!");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) "hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 100.0f);
        tabelaHash19.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash11.insere("", (java.lang.Object) tabelaHash19);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("", (java.lang.Object) "hi!");
        tabelaHash31.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash31.insere("", (java.lang.Object) tabelaHash39);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash39);
        java.lang.Object obj43 = tabelaHash39.pesquisa("hi!");
        tabelaHash0.insere("", obj43);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass45 = obj43.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 100.0f);
        tabelaHash13.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object obj28 = tabelaHash13.pesquisa("");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash30.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        tabelaHash30.insere("hi!", (java.lang.Object) 100);
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.insere("", (java.lang.Object) 100.0f);
        tabelaHash30.insere("", (java.lang.Object) "");
        tabelaHash13.insere("", (java.lang.Object) "");
        tabelaHash13.imprime();
        java.lang.Class<?> wildcardClass50 = tabelaHash13.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0f + "'", obj28, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) 100);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) (-1));
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj27 = tabelaHash22.pesquisa("hi!");
        java.lang.Object obj29 = tabelaHash22.pesquisa("");
        java.lang.Object obj31 = tabelaHash22.pesquisa("");
        java.lang.Object obj33 = tabelaHash22.pesquisa("");
        java.lang.Object obj35 = tabelaHash22.pesquisa("hi!");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.insere("", (java.lang.Object) "hi!");
        tabelaHash37.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj45 = tabelaHash37.pesquisa("hi!");
        tabelaHash37.imprime();
        tabelaHash22.insere("", (java.lang.Object) tabelaHash37);
        java.lang.Object obj49 = tabelaHash37.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash37);
        java.lang.Object obj52 = tabelaHash0.pesquisa("");
        java.lang.Object obj54 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0f + "'", obj31, 100.0f);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0f + "'", obj33, 100.0f);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 100.0d + "'", obj45, 100.0d);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100.0d + "'", obj49, 100.0d);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100.0f + "'", obj52, 100.0f);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (-1) + "'", obj54, (-1));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("", (java.lang.Object) "hi!");
        tabelaHash5.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) "hi!");
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj20 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.retira("");
        tabelaHash5.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj25 = tabelaHash5.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "hi!" + "'", obj25, "hi!");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 100.0f);
        tabelaHash13.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash20);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash28.retira("hi!");
        java.lang.Class<?> wildcardClass34 = tabelaHash28.getClass();
        tabelaHash13.insere("", (java.lang.Object) wildcardClass34);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash10.retira("");
        java.lang.Class<?> wildcardClass21 = tabelaHash10.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass21);
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass26 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 100.0f);
        tabelaHash8.insere("", (java.lang.Object) tabelaHash13);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj25 = tabelaHash20.pesquisa("hi!");
        java.lang.Object obj27 = tabelaHash20.pesquisa("");
        java.lang.Object obj29 = tabelaHash20.pesquisa("");
        java.lang.Object obj31 = tabelaHash20.pesquisa("");
        java.lang.Object obj33 = tabelaHash20.pesquisa("hi!");
        java.lang.Object obj35 = tabelaHash20.pesquisa("");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("", (java.lang.Object) 100.0f);
        tabelaHash37.insere("", (java.lang.Object) tabelaHash42);
        tabelaHash42.retira("");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj55 = tabelaHash50.pesquisa("hi!");
        ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
        tabelaHash57.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        tabelaHash62.insere("", (java.lang.Object) 100.0f);
        tabelaHash57.insere("", (java.lang.Object) tabelaHash62);
        tabelaHash50.insere("", (java.lang.Object) tabelaHash57);
        tabelaHash50.retira("");
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        tabelaHash42.insere("", (java.lang.Object) tabelaHash50);
        java.lang.Class<?> wildcardClass73 = tabelaHash42.getClass();
        tabelaHash20.insere("", (java.lang.Object) tabelaHash42);
        tabelaHash20.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        java.lang.Object obj80 = tabelaHash20.pesquisa("hi!");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0f + "'", obj31, 100.0f);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0f + "'", obj35, 100.0f);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("", (java.lang.Object) "hi!");
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj24 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("");
        java.lang.Object obj28 = tabelaHash14.pesquisa("");
        java.lang.Object obj30 = tabelaHash14.pesquisa("");
        tabelaHash0.insere("", obj30);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "hi!" + "'", obj24, "hi!");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 100.0f);
        tabelaHash13.insere("hi!", (java.lang.Object) '#');
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("", (java.lang.Object) 100.0f);
        tabelaHash23.imprime();
        tabelaHash23.retira("");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj36 = tabelaHash31.pesquisa("hi!");
        java.lang.Object obj38 = tabelaHash31.pesquisa("");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.insere("", (java.lang.Object) 100.0f);
        tabelaHash40.insere("", (java.lang.Object) tabelaHash45);
        tabelaHash45.retira("");
        tabelaHash45.imprime();
        tabelaHash31.insere("", (java.lang.Object) tabelaHash45);
        tabelaHash23.insere("", (java.lang.Object) tabelaHash45);
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash45);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj58 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0f + "'", obj38, 100.0f);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0f + "'", obj58, 100.0f);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) 100.0f);
        tabelaHash16.imprime();
        tabelaHash16.retira("");
        tabelaHash16.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("", (java.lang.Object) 100.0f);
        tabelaHash25.insere("", (java.lang.Object) tabelaHash30);
        tabelaHash16.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        java.lang.Object obj38 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.insere("", (java.lang.Object) 100.0f);
        tabelaHash40.imprime();
        tabelaHash40.retira("");
        tabelaHash40.imprime();
        java.lang.Object obj49 = tabelaHash40.pesquisa("hi!");
        tabelaHash40.insere("", (java.lang.Object) 1L);
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        tabelaHash54.insere("", (java.lang.Object) "hi!");
        tabelaHash54.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj62 = tabelaHash54.pesquisa("hi!");
        java.lang.Object obj64 = tabelaHash54.pesquisa("");
        tabelaHash40.insere("hi!", (java.lang.Object) tabelaHash54);
        java.lang.Class<?> wildcardClass66 = tabelaHash54.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass66);
        java.lang.Class<?> wildcardClass68 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 100.0d + "'", obj62, 100.0d);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + "hi!" + "'", obj64, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1L);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash18.insere("hi!", (java.lang.Object) (short) 0);
        java.lang.Object obj26 = tabelaHash18.pesquisa("");
        tabelaHash18.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 100.0f);
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = obj22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) 100.0f);
        tabelaHash9.insere("hi!", (java.lang.Object) (-1.0f));
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("");
        tabelaHash17.insere("hi!", (java.lang.Object) '4');
        tabelaHash9.insere("", (java.lang.Object) tabelaHash17);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("", (java.lang.Object) "hi!");
        tabelaHash26.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash26.insere("", (java.lang.Object) tabelaHash34);
        tabelaHash34.imprime();
        java.lang.Object obj38 = tabelaHash34.pesquisa("hi!");
        java.lang.Class<?> wildcardClass39 = tabelaHash34.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass39);
        tabelaHash0.retira("hi!");
        java.lang.Object obj44 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + "hi!" + "'", obj44, "hi!");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1L);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1L + "'", obj19, 1L);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) true);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("", (java.lang.Object) 100.0f);
        tabelaHash15.insere("hi!", (java.lang.Object) '#');
        tabelaHash15.retira("");
        tabelaHash15.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass27 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("", (java.lang.Object) "hi!");
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj23 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Object obj27 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0d + "'", obj27, 100.0d);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        java.lang.Object obj13 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.insere("hi!", (java.lang.Object) (short) -1);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) 100.0f);
        tabelaHash19.insere("hi!", (java.lang.Object) '#');
        tabelaHash19.retira("");
        java.lang.Object obj29 = tabelaHash19.pesquisa("");
        tabelaHash19.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj34 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("", (java.lang.Object) 100.0f);
        tabelaHash36.insere("hi!", (java.lang.Object) '#');
        tabelaHash36.retira("");
        java.lang.Object obj46 = tabelaHash36.pesquisa("");
        tabelaHash36.retira("hi!");
        java.lang.Object obj50 = tabelaHash36.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash36);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "hi!" + "'", obj34, "hi!");
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj50);
    }

    @Ignore
    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) "hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("", (java.lang.Object) 100.0f);
        tabelaHash18.insere("", (java.lang.Object) tabelaHash23);
        tabelaHash10.insere("", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("", (java.lang.Object) "hi!");
        tabelaHash30.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash30.insere("", (java.lang.Object) tabelaHash38);
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash38);
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.insere("", (java.lang.Object) 100.0f);
        tabelaHash49.insere("hi!", (java.lang.Object) '#');
        tabelaHash49.retira("");
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        tabelaHash44.insere("", (java.lang.Object) tabelaHash49);
        tabelaHash44.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash44);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash44.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) 100.0f);
        tabelaHash16.imprime();
        tabelaHash16.retira("");
        tabelaHash16.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("", (java.lang.Object) 100.0f);
        tabelaHash25.insere("", (java.lang.Object) tabelaHash30);
        tabelaHash16.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        java.lang.Object obj38 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0f + "'", obj38, 100.0f);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("", (java.lang.Object) 100.0f);
        tabelaHash17.insere("", (java.lang.Object) tabelaHash22);
        tabelaHash22.retira("");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj35 = tabelaHash30.pesquisa("hi!");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("", (java.lang.Object) 100.0f);
        tabelaHash37.insere("", (java.lang.Object) tabelaHash42);
        tabelaHash30.insere("", (java.lang.Object) tabelaHash37);
        tabelaHash30.retira("");
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        tabelaHash22.insere("", (java.lang.Object) tabelaHash30);
        java.lang.Class<?> wildcardClass53 = tabelaHash22.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash22);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj58 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0f + "'", obj58, 100.0f);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj8 = new java.lang.Object();
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj20 = tabelaHash15.pesquisa("hi!");
        java.lang.Object obj22 = tabelaHash15.pesquisa("");
        java.lang.Object obj24 = tabelaHash15.pesquisa("");
        java.lang.Object obj26 = tabelaHash15.pesquisa("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) 100.0f);
        tabelaHash28.imprime();
        tabelaHash15.insere("", (java.lang.Object) tabelaHash28);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("hi!");
        java.lang.Object obj39 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.imprime();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash35);
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.insere("", (java.lang.Object) 100.0f);
        tabelaHash43.imprime();
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.insere("", (java.lang.Object) "hi!");
        tabelaHash49.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash43.insere("", (java.lang.Object) 100.0d);
        tabelaHash35.insere("", (java.lang.Object) "");
        java.lang.Object obj59 = tabelaHash35.pesquisa("hi!");
        tabelaHash0.insere("", obj59);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass61 = obj59.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0f + "'", obj24, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) 100);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj13 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash8.pesquisa("");
        java.lang.Object obj17 = tabelaHash8.pesquisa("");
        java.lang.Object obj19 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 100.0f);
        tabelaHash24.insere("hi!", (java.lang.Object) (-1.0f));
        tabelaHash24.imprime();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash24.imprime();
        tabelaHash24.retira("hi!");
        tabelaHash24.imprime();
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("", (java.lang.Object) "hi!");
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.insere("", (java.lang.Object) 100.0f);
        tabelaHash46.insere("", (java.lang.Object) tabelaHash51);
        tabelaHash38.insere("", (java.lang.Object) tabelaHash46);
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.insere("", (java.lang.Object) "hi!");
        tabelaHash58.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash66 = new ds.TabelaHash();
        tabelaHash58.insere("", (java.lang.Object) tabelaHash66);
        tabelaHash38.insere("hi!", (java.lang.Object) tabelaHash66);
        ds.TabelaHash tabelaHash70 = new ds.TabelaHash();
        tabelaHash70.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj75 = tabelaHash70.pesquisa("hi!");
        ds.TabelaHash tabelaHash77 = new ds.TabelaHash();
        tabelaHash77.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash82 = new ds.TabelaHash();
        tabelaHash82.insere("", (java.lang.Object) 100.0f);
        tabelaHash77.insere("", (java.lang.Object) tabelaHash82);
        tabelaHash70.insere("", (java.lang.Object) tabelaHash77);
        java.lang.Class<?> wildcardClass88 = tabelaHash77.getClass();
        tabelaHash66.insere("", (java.lang.Object) wildcardClass88);
        tabelaHash24.insere("hi!", (java.lang.Object) tabelaHash66);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash24);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        tabelaHash5.retira("");
        tabelaHash5.imprime();
        java.lang.Object obj14 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj16 = tabelaHash5.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash5.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 100.0f);
        tabelaHash7.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("", (java.lang.Object) 100.0f);
        tabelaHash21.insere("", (java.lang.Object) tabelaHash26);
        java.lang.Object obj32 = tabelaHash21.pesquisa("");
        tabelaHash21.retira("");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("", (java.lang.Object) 100.0f);
        tabelaHash36.insere("hi!", (java.lang.Object) '#');
        tabelaHash36.retira("");
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.insere("", (java.lang.Object) 100.0f);
        tabelaHash46.imprime();
        tabelaHash46.retira("");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        tabelaHash54.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj59 = tabelaHash54.pesquisa("hi!");
        java.lang.Object obj61 = tabelaHash54.pesquisa("");
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        tabelaHash63.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
        tabelaHash68.insere("", (java.lang.Object) 100.0f);
        tabelaHash63.insere("", (java.lang.Object) tabelaHash68);
        tabelaHash68.retira("");
        tabelaHash68.imprime();
        tabelaHash54.insere("", (java.lang.Object) tabelaHash68);
        tabelaHash46.insere("", (java.lang.Object) tabelaHash68);
        tabelaHash36.insere("hi!", (java.lang.Object) tabelaHash68);
        java.lang.Class<?> wildcardClass79 = tabelaHash68.getClass();
        tabelaHash21.insere("", (java.lang.Object) wildcardClass79);
        tabelaHash0.insere("", (java.lang.Object) wildcardClass79);
        java.lang.Object obj83 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 100.0f + "'", obj61, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertEquals(obj83.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj83), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj83), "class ds.TabelaHash");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) 100);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj13 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash8.pesquisa("");
        java.lang.Object obj17 = tabelaHash8.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash8.retira("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj27 = tabelaHash22.pesquisa("hi!");
        java.lang.Object obj29 = tabelaHash22.pesquisa("");
        java.lang.Object obj31 = tabelaHash22.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash22);
        tabelaHash22.imprime();
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0f + "'", obj31, 100.0f);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
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
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 100.0f);
        tabelaHash7.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj28 = tabelaHash23.pesquisa("hi!");
        java.lang.Object obj30 = tabelaHash23.pesquisa("");
        java.lang.Object obj32 = tabelaHash23.pesquisa("");
        java.lang.Object obj34 = tabelaHash23.pesquisa("");
        java.lang.Object obj36 = tabelaHash23.pesquisa("hi!");
        java.lang.Object obj38 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        tabelaHash23.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0f + "'", obj30, 100.0f);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0f + "'", obj34, 100.0f);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0f + "'", obj38, 100.0f);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) 100);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj13 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash8.pesquisa("");
        java.lang.Object obj17 = tabelaHash8.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash8.retira("");
        tabelaHash8.imprime();
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) '#');
        tabelaHash0.insere("hi!", (java.lang.Object) 100);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("", (java.lang.Object) 100.0f);
        tabelaHash22.imprime();
        tabelaHash22.retira("");
        tabelaHash22.imprime();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("", (java.lang.Object) 100.0f);
        tabelaHash31.insere("", (java.lang.Object) tabelaHash36);
        tabelaHash22.insere("", (java.lang.Object) tabelaHash31);
        tabelaHash11.insere("", (java.lang.Object) tabelaHash22);
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object obj46 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + '#' + "'", obj46, '#');
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) "hi!");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) 100.0f);
        tabelaHash19.imprime();
        tabelaHash19.retira("");
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) 100.0f);
        tabelaHash28.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash19.insere("", (java.lang.Object) tabelaHash28);
        java.lang.Object obj40 = tabelaHash19.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.insere("", (java.lang.Object) "hi!");
        tabelaHash43.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.insere("", (java.lang.Object) "hi!");
        tabelaHash51.imprime();
        tabelaHash51.imprime();
        tabelaHash51.insere("hi!", (java.lang.Object) 1);
        tabelaHash43.insere("", (java.lang.Object) 1);
        tabelaHash43.retira("");
        tabelaHash43.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash43);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash43.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) "hi!");
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("", (java.lang.Object) 100.0f);
        tabelaHash24.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash16.insere("", (java.lang.Object) tabelaHash24);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("", (java.lang.Object) "hi!");
        tabelaHash36.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash36.insere("", (java.lang.Object) tabelaHash44);
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash44);
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj53 = tabelaHash48.pesquisa("hi!");
        java.lang.Object obj55 = tabelaHash48.pesquisa("");
        tabelaHash48.imprime();
        tabelaHash48.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        tabelaHash61.insere("", (java.lang.Object) 100.0f);
        tabelaHash48.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash67 = new ds.TabelaHash();
        tabelaHash67.insere("", (java.lang.Object) 100.0f);
        tabelaHash67.imprime();
        tabelaHash67.retira("");
        tabelaHash67.imprime();
        ds.TabelaHash tabelaHash76 = new ds.TabelaHash();
        tabelaHash76.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash81 = new ds.TabelaHash();
        tabelaHash81.insere("", (java.lang.Object) 100.0f);
        tabelaHash76.insere("", (java.lang.Object) tabelaHash81);
        tabelaHash67.insere("", (java.lang.Object) tabelaHash76);
        tabelaHash48.insere("", (java.lang.Object) tabelaHash67);
        tabelaHash48.imprime();
        tabelaHash16.insere("", (java.lang.Object) tabelaHash48);
        tabelaHash8.insere("", (java.lang.Object) tabelaHash48);
        java.lang.Class<?> wildcardClass91 = tabelaHash8.getClass();
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 100.0f + "'", obj55, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) "hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 100.0f);
        tabelaHash19.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash11.insere("", (java.lang.Object) tabelaHash19);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("", (java.lang.Object) "hi!");
        tabelaHash31.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash31.insere("", (java.lang.Object) tabelaHash39);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash39);
        java.lang.Object obj43 = tabelaHash39.pesquisa("hi!");
        tabelaHash0.insere("", obj43);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0f));
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash0.retira("hi!");
        java.lang.Object obj18 = null;
        tabelaHash0.insere("", obj18);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) 100.0f);
        tabelaHash16.insere("hi!", (java.lang.Object) (-1.0f));
        tabelaHash16.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.retira("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0f + "'", obj26, 100.0f);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) "hi!");
        tabelaHash11.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash11.retira("");
        java.lang.Class<?> wildcardClass23 = tabelaHash11.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        tabelaHash5.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj18 = tabelaHash13.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) 100.0f);
        tabelaHash20.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash13.insere("", (java.lang.Object) tabelaHash20);
        tabelaHash13.retira("");
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash13);
        java.lang.Object obj37 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash16.insere("hi!", (java.lang.Object) 100);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 100.0f);
        tabelaHash24.imprime();
        tabelaHash24.retira("");
        java.lang.Object obj32 = new java.lang.Object();
        tabelaHash24.insere("", obj32);
        tabelaHash24.retira("");
        tabelaHash16.insere("", (java.lang.Object) tabelaHash24);
        java.lang.Object obj38 = tabelaHash16.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj38);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) 100 + "'", obj38, (short) 100);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1L);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) "hi!");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("", (java.lang.Object) 100.0f);
        tabelaHash27.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash19.insere("", (java.lang.Object) tabelaHash27);
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.insere("", (java.lang.Object) "hi!");
        tabelaHash39.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash39.insere("", (java.lang.Object) tabelaHash47);
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash47);
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj56 = tabelaHash51.pesquisa("hi!");
        java.lang.Object obj58 = tabelaHash51.pesquisa("");
        tabelaHash51.imprime();
        tabelaHash51.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash64 = new ds.TabelaHash();
        tabelaHash64.insere("", (java.lang.Object) 100.0f);
        tabelaHash51.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash70 = new ds.TabelaHash();
        tabelaHash70.insere("", (java.lang.Object) 100.0f);
        tabelaHash70.imprime();
        tabelaHash70.retira("");
        tabelaHash70.imprime();
        ds.TabelaHash tabelaHash79 = new ds.TabelaHash();
        tabelaHash79.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash84 = new ds.TabelaHash();
        tabelaHash84.insere("", (java.lang.Object) 100.0f);
        tabelaHash79.insere("", (java.lang.Object) tabelaHash84);
        tabelaHash70.insere("", (java.lang.Object) tabelaHash79);
        tabelaHash51.insere("", (java.lang.Object) tabelaHash70);
        tabelaHash51.imprime();
        tabelaHash19.insere("", (java.lang.Object) tabelaHash51);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash51);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0f + "'", obj58, 100.0f);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) "hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 100.0f);
        tabelaHash19.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash11.insere("", (java.lang.Object) tabelaHash19);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("", (java.lang.Object) "hi!");
        tabelaHash31.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash31.insere("", (java.lang.Object) tabelaHash39);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash39);
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash39.insere("", (java.lang.Object) (short) 100);
        tabelaHash39.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash39);
        tabelaHash39.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash39.retira("hi!");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) '#');
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("", (java.lang.Object) "hi!");
        tabelaHash7.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash15.imprime();
        java.lang.Object obj19 = null;
        tabelaHash15.insere("", obj19);
        java.lang.Object obj22 = tabelaHash15.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0f));
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("", (java.lang.Object) "hi!");
        tabelaHash20.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash20.insere("", (java.lang.Object) tabelaHash28);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        java.lang.Object obj32 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("");
        java.lang.Object obj13 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.insere("hi!", (java.lang.Object) (short) -1);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) 100.0f);
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) "hi!");
        tabelaHash25.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash19.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj39 = tabelaHash34.pesquisa("hi!");
        java.lang.Object obj41 = tabelaHash34.pesquisa("");
        java.lang.Object obj43 = tabelaHash34.pesquisa("");
        java.lang.Object obj45 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        tabelaHash19.insere("", (java.lang.Object) tabelaHash34);
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.insere("", (java.lang.Object) 100.0f);
        tabelaHash49.imprime();
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        tabelaHash55.insere("", (java.lang.Object) "hi!");
        tabelaHash55.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash49.insere("", (java.lang.Object) 100.0d);
        tabelaHash34.insere("hi!", (java.lang.Object) tabelaHash49);
        tabelaHash49.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash49);
        java.lang.Object obj67 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0f + "'", obj41, 100.0f);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0f + "'", obj43, 100.0f);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 100.0f + "'", obj45, 100.0f);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + "hi!" + "'", obj67, "hi!");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 100.0f);
        tabelaHash8.insere("", (java.lang.Object) tabelaHash13);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("", (java.lang.Object) "hi!");
        tabelaHash20.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash20.insere("", (java.lang.Object) tabelaHash28);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash28);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass34 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) '#');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("", (java.lang.Object) 100.0f);
        tabelaHash10.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash15.retira("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj28 = tabelaHash23.pesquisa("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.insere("", (java.lang.Object) 100.0f);
        tabelaHash30.insere("", (java.lang.Object) tabelaHash35);
        tabelaHash23.insere("", (java.lang.Object) tabelaHash30);
        tabelaHash23.retira("");
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        tabelaHash15.insere("", (java.lang.Object) tabelaHash23);
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash47.insere("hi!", (java.lang.Object) 100);
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        tabelaHash55.insere("", (java.lang.Object) 100.0f);
        tabelaHash55.imprime();
        tabelaHash55.retira("");
        java.lang.Object obj63 = new java.lang.Object();
        tabelaHash55.insere("", obj63);
        tabelaHash55.retira("");
        tabelaHash47.insere("", (java.lang.Object) tabelaHash55);
        java.lang.Object obj69 = tabelaHash47.pesquisa("hi!");
        tabelaHash23.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj73 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + (short) 100 + "'", obj69, (short) 100);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 100.0f + "'", obj73, 100.0f);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash11.pesquisa("");
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 100.0f);
        tabelaHash24.imprime();
        tabelaHash24.imprime();
        tabelaHash24.imprime();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash24);
        java.lang.Object obj33 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        java.lang.Object obj36 = tabelaHash11.pesquisa("");
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass37);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0f + "'", obj20, 100.0f);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0f + "'", obj36, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 100.0f);
        tabelaHash7.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 100.0f);
        tabelaHash13.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object obj28 = tabelaHash13.pesquisa("");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash30.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        tabelaHash30.insere("hi!", (java.lang.Object) 100);
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.insere("", (java.lang.Object) 100.0f);
        tabelaHash30.insere("", (java.lang.Object) "");
        tabelaHash13.insere("", (java.lang.Object) "");
        tabelaHash13.imprime();
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.insere("", (java.lang.Object) "hi!");
        tabelaHash51.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        tabelaHash51.insere("", (java.lang.Object) tabelaHash59);
        tabelaHash51.imprime();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash51);
        java.lang.Object obj64 = tabelaHash13.pesquisa("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0f + "'", obj28, 100.0f);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 100.0f + "'", obj64, 100.0f);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        tabelaHash5.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash13.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash13.retira("hi!");
        tabelaHash5.insere("", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass23 = tabelaHash5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) 100);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 100.0f);
        tabelaHash8.imprime();
        tabelaHash8.retira("");
        java.lang.Object obj16 = new java.lang.Object();
        tabelaHash8.insere("", obj16);
        tabelaHash8.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("", (java.lang.Object) "hi!");
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("", (java.lang.Object) 100.0f);
        tabelaHash37.insere("", (java.lang.Object) tabelaHash42);
        tabelaHash29.insere("", (java.lang.Object) tabelaHash37);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 100 + "'", obj22, (short) 100);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) 100 + "'", obj27, (short) 100);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 100.0f);
        tabelaHash8.insere("hi!", (java.lang.Object) '#');
        tabelaHash8.retira("");
        java.lang.Object obj18 = tabelaHash8.pesquisa("");
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash0.retira("");
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj32 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.retira("");
        tabelaHash27.imprime();
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.insere("", (java.lang.Object) "hi!");
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.insere("", (java.lang.Object) 100.0f);
        tabelaHash45.insere("", (java.lang.Object) tabelaHash50);
        tabelaHash37.insere("", (java.lang.Object) tabelaHash45);
        ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
        tabelaHash57.insere("", (java.lang.Object) "hi!");
        tabelaHash57.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        tabelaHash57.insere("", (java.lang.Object) tabelaHash65);
        tabelaHash37.insere("hi!", (java.lang.Object) tabelaHash65);
        tabelaHash37.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash37);
        java.lang.Class<?> wildcardClass70 = tabelaHash37.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass70);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) 100.0f);
        tabelaHash19.imprime();
        tabelaHash19.retira("");
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) 100.0f);
        tabelaHash28.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash19.insere("", (java.lang.Object) tabelaHash28);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) '#');
        tabelaHash0.insere("hi!", (java.lang.Object) 100);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("", (java.lang.Object) 100.0f);
        tabelaHash22.imprime();
        tabelaHash22.retira("");
        tabelaHash22.imprime();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("", (java.lang.Object) 100.0f);
        tabelaHash31.insere("", (java.lang.Object) tabelaHash36);
        tabelaHash22.insere("", (java.lang.Object) tabelaHash31);
        tabelaHash11.insere("", (java.lang.Object) tabelaHash22);
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("hi!", (java.lang.Object) (-1L));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 100.0f);
        tabelaHash7.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj22 = tabelaHash0.pesquisa("");
        java.lang.Object obj24 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("", (java.lang.Object) 100.0f);
        tabelaHash9.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("", (java.lang.Object) 100.0f);
        tabelaHash23.insere("hi!", (java.lang.Object) '#');
        tabelaHash23.insere("hi!", (java.lang.Object) 100);
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj39 = tabelaHash34.pesquisa("hi!");
        java.lang.Object obj41 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.insere("", (java.lang.Object) 100.0f);
        tabelaHash45.imprime();
        tabelaHash45.retira("");
        tabelaHash45.imprime();
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        tabelaHash54.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        tabelaHash59.insere("", (java.lang.Object) 100.0f);
        tabelaHash54.insere("", (java.lang.Object) tabelaHash59);
        tabelaHash45.insere("", (java.lang.Object) tabelaHash54);
        tabelaHash34.insere("", (java.lang.Object) tabelaHash45);
        tabelaHash34.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash23);
        java.lang.Object obj70 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0f + "'", obj41, 100.0f);
        org.junit.Assert.assertNull(obj70);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        java.lang.Object obj11 = tabelaHash5.pesquisa("");
        java.lang.Object obj13 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.retira("");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) "hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("", (java.lang.Object) 100.0f);
        tabelaHash18.insere("", (java.lang.Object) tabelaHash23);
        tabelaHash10.insere("", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("", (java.lang.Object) "hi!");
        tabelaHash30.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash30.insere("", (java.lang.Object) tabelaHash38);
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash38);
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.insere("", (java.lang.Object) 100.0f);
        tabelaHash49.insere("hi!", (java.lang.Object) '#');
        tabelaHash49.retira("");
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        tabelaHash44.insere("", (java.lang.Object) tabelaHash49);
        tabelaHash44.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash44);
        java.lang.Object obj64 = tabelaHash10.pesquisa("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj64);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1L);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) 100.0f);
        tabelaHash16.insere("hi!", (java.lang.Object) '#');
        tabelaHash16.retira("");
        java.lang.Object obj26 = tabelaHash16.pesquisa("");
        tabelaHash16.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1L + "'", obj31, 1L);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0f));
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        tabelaHash5.imprime();
        java.lang.Object obj12 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash5.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 100.0f);
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj29 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash24);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 100.0f);
        tabelaHash8.insere("hi!", (java.lang.Object) '#');
        tabelaHash8.retira("");
        java.lang.Object obj18 = tabelaHash8.pesquisa("");
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash0.retira("");
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj23 = tabelaHash18.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash18.pesquisa("");
        java.lang.Object obj27 = tabelaHash18.pesquisa("");
        java.lang.Object obj29 = tabelaHash18.pesquisa("");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("", (java.lang.Object) 100.0f);
        tabelaHash31.imprime();
        tabelaHash18.insere("", (java.lang.Object) tabelaHash31);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object obj40 = tabelaHash38.pesquisa("hi!");
        java.lang.Object obj42 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        tabelaHash31.insere("", (java.lang.Object) tabelaHash38);
        java.lang.Object obj46 = tabelaHash31.pesquisa("");
        java.lang.Class<?> wildcardClass47 = tabelaHash31.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash31);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0f + "'", obj25, 100.0f);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0f + "'", obj27, 100.0f);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0f + "'", obj46, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("", (java.lang.Object) 100.0f);
        tabelaHash5.insere("hi!", (java.lang.Object) '#');
        tabelaHash5.retira("");
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj27 = tabelaHash22.pesquisa("hi!");
        java.lang.Object obj29 = tabelaHash22.pesquisa("");
        tabelaHash22.imprime();
        tabelaHash22.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.insere("", (java.lang.Object) 100.0f);
        tabelaHash22.insere("", (java.lang.Object) 100.0f);
        tabelaHash22.retira("");
        java.lang.Class<?> wildcardClass42 = tabelaHash22.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash22);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0f + "'", obj18, 100.0f);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0f + "'", obj29, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) true);
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0f + "'", obj13, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("", (java.lang.Object) 100.0f);
        tabelaHash9.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("", (java.lang.Object) 100.0f);
        tabelaHash23.insere("hi!", (java.lang.Object) '#');
        tabelaHash23.insere("hi!", (java.lang.Object) 100);
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj39 = tabelaHash34.pesquisa("hi!");
        java.lang.Object obj41 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.insere("", (java.lang.Object) 100.0f);
        tabelaHash45.imprime();
        tabelaHash45.retira("");
        tabelaHash45.imprime();
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        tabelaHash54.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        tabelaHash59.insere("", (java.lang.Object) 100.0f);
        tabelaHash54.insere("", (java.lang.Object) tabelaHash59);
        tabelaHash45.insere("", (java.lang.Object) tabelaHash54);
        tabelaHash34.insere("", (java.lang.Object) tabelaHash45);
        tabelaHash34.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash23);
        tabelaHash23.retira("");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0f + "'", obj41, 100.0f);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("", (java.lang.Object) 100.0f);
        tabelaHash15.insere("hi!", (java.lang.Object) '#');
        tabelaHash15.retira("");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) 100.0f);
        tabelaHash25.imprime();
        tabelaHash25.retira("");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj38 = tabelaHash33.pesquisa("hi!");
        java.lang.Object obj40 = tabelaHash33.pesquisa("");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.insere("", (java.lang.Object) 100.0f);
        tabelaHash42.insere("", (java.lang.Object) tabelaHash47);
        tabelaHash47.retira("");
        tabelaHash47.imprime();
        tabelaHash33.insere("", (java.lang.Object) tabelaHash47);
        tabelaHash25.insere("", (java.lang.Object) tabelaHash47);
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash47);
        java.lang.Class<?> wildcardClass58 = tabelaHash47.getClass();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash47);
        tabelaHash47.imprime();
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0f + "'", obj40, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("", (java.lang.Object) 100.0f);
        tabelaHash9.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object obj21 = tabelaHash9.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0f + "'", obj21, 100.0f);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj15 = null;
        tabelaHash0.insere("", obj15);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash8.imprime();
        java.lang.Object obj12 = null;
        tabelaHash8.insere("", obj12);
        java.lang.Object obj15 = tabelaHash8.pesquisa("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("", (java.lang.Object) "hi!");
        tabelaHash17.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) "hi!");
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) 1);
        tabelaHash17.insere("", (java.lang.Object) 1);
        java.lang.Object obj36 = tabelaHash17.pesquisa("");
        tabelaHash17.retira("");
        tabelaHash8.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "hi!" + "'", obj36, "hi!");
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) 100.0f);
        tabelaHash9.insere("hi!", (java.lang.Object) (-1.0f));
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object obj19 = tabelaHash17.pesquisa("");
        tabelaHash17.insere("hi!", (java.lang.Object) '4');
        tabelaHash9.insere("", (java.lang.Object) tabelaHash17);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        tabelaHash9.retira("");
        tabelaHash9.retira("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("", (java.lang.Object) 100.0f);
        tabelaHash30.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("", (java.lang.Object) "hi!");
        tabelaHash36.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash30.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj50 = tabelaHash45.pesquisa("hi!");
        java.lang.Object obj52 = tabelaHash45.pesquisa("");
        java.lang.Object obj54 = tabelaHash45.pesquisa("");
        java.lang.Object obj56 = tabelaHash45.pesquisa("");
        tabelaHash45.imprime();
        tabelaHash30.insere("", (java.lang.Object) tabelaHash45);
        tabelaHash45.retira("");
        tabelaHash45.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash45);
        ds.TabelaHash tabelaHash64 = new ds.TabelaHash();
        tabelaHash64.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj69 = tabelaHash64.pesquisa("hi!");
        java.lang.Object obj71 = tabelaHash64.pesquisa("");
        java.lang.Object obj73 = tabelaHash64.pesquisa("");
        java.lang.Object obj75 = tabelaHash64.pesquisa("");
        ds.TabelaHash tabelaHash77 = new ds.TabelaHash();
        tabelaHash77.insere("", (java.lang.Object) 100.0f);
        tabelaHash77.imprime();
        tabelaHash64.insere("", (java.lang.Object) tabelaHash77);
        ds.TabelaHash tabelaHash84 = new ds.TabelaHash();
        java.lang.Object obj86 = tabelaHash84.pesquisa("hi!");
        java.lang.Object obj88 = tabelaHash84.pesquisa("hi!");
        tabelaHash84.imprime();
        tabelaHash77.insere("", (java.lang.Object) tabelaHash84);
        tabelaHash84.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash84);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash9.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100.0f + "'", obj52, 100.0f);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 100.0f + "'", obj54, 100.0f);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 100.0f + "'", obj56, 100.0f);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 100.0f + "'", obj71, 100.0f);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 100.0f + "'", obj73, 100.0f);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + 100.0f + "'", obj75, 100.0f);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 100.0f);
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) "hi!");
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.insere("", (java.lang.Object) 100.0f);
        tabelaHash34.insere("hi!", (java.lang.Object) (-1.0f));
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object obj44 = tabelaHash42.pesquisa("");
        tabelaHash42.insere("hi!", (java.lang.Object) '4');
        tabelaHash34.insere("", (java.lang.Object) tabelaHash42);
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 100.0f);
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash22.insere("hi!", (java.lang.Object) 100);
        java.lang.Object obj30 = tabelaHash22.pesquisa("");
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash22);
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.insere("", (java.lang.Object) "hi!");
        tabelaHash35.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash35.insere("", (java.lang.Object) tabelaHash43);
        tabelaHash35.imprime();
        java.lang.Object obj47 = tabelaHash35.pesquisa("");
        tabelaHash13.insere("", obj47);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + "hi!" + "'", obj47, "hi!");
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 100.0f);
        tabelaHash13.insere("hi!", (java.lang.Object) '#');
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("", (java.lang.Object) 100.0f);
        tabelaHash23.imprime();
        tabelaHash23.retira("");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj36 = tabelaHash31.pesquisa("hi!");
        java.lang.Object obj38 = tabelaHash31.pesquisa("");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.insere("", (java.lang.Object) 100.0f);
        tabelaHash40.insere("", (java.lang.Object) tabelaHash45);
        tabelaHash45.retira("");
        tabelaHash45.imprime();
        tabelaHash31.insere("", (java.lang.Object) tabelaHash45);
        tabelaHash23.insere("", (java.lang.Object) tabelaHash45);
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash45);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        java.lang.Object obj59 = null;
        tabelaHash0.insere("", obj59);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj65 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0f + "'", obj38, 100.0f);
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 100.0f);
        tabelaHash7.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj26 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj28 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash21);
        java.lang.Object obj32 = tabelaHash21.pesquisa("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0f + "'", obj28, 100.0f);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0f + "'", obj32, 100.0f);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) '#');
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj12 = null;
        tabelaHash0.insere("hi!", obj12);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj20 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.retira("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) "hi!");
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("", (java.lang.Object) 100.0f);
        tabelaHash33.insere("", (java.lang.Object) tabelaHash38);
        tabelaHash25.insere("", (java.lang.Object) tabelaHash33);
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.insere("", (java.lang.Object) "hi!");
        tabelaHash45.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        tabelaHash45.insere("", (java.lang.Object) tabelaHash53);
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash53);
        tabelaHash25.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash25);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) "hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 100.0f);
        tabelaHash19.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash11.insere("", (java.lang.Object) tabelaHash19);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("", (java.lang.Object) "hi!");
        tabelaHash31.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash31.insere("", (java.lang.Object) tabelaHash39);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash39);
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash39.insere("", (java.lang.Object) (short) 100);
        tabelaHash39.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash39);
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        tabelaHash56.insere("", (java.lang.Object) 100.0f);
        tabelaHash51.insere("", (java.lang.Object) tabelaHash56);
        java.lang.Object obj62 = tabelaHash56.pesquisa("");
        tabelaHash56.insere("", (java.lang.Object) 100);
        tabelaHash56.imprime();
        tabelaHash56.imprime();
        ds.TabelaHash tabelaHash69 = new ds.TabelaHash();
        tabelaHash69.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj74 = tabelaHash69.pesquisa("hi!");
        java.lang.Object obj76 = tabelaHash69.pesquisa("");
        java.lang.Object obj78 = tabelaHash69.pesquisa("");
        java.lang.Object obj80 = tabelaHash69.pesquisa("");
        ds.TabelaHash tabelaHash82 = new ds.TabelaHash();
        tabelaHash82.insere("", (java.lang.Object) 100.0f);
        tabelaHash82.imprime();
        tabelaHash69.insere("", (java.lang.Object) tabelaHash82);
        java.lang.Class<?> wildcardClass88 = tabelaHash69.getClass();
        tabelaHash56.insere("hi!", (java.lang.Object) wildcardClass88);
        tabelaHash39.insere("hi!", (java.lang.Object) wildcardClass88);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 100.0f + "'", obj62, 100.0f);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + 100.0f + "'", obj76, 100.0f);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + 100.0f + "'", obj78, 100.0f);
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + 100.0f + "'", obj80, 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) 100.0f);
        tabelaHash16.imprime();
        tabelaHash16.retira("");
        tabelaHash16.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("", (java.lang.Object) 100.0f);
        tabelaHash25.insere("", (java.lang.Object) tabelaHash30);
        tabelaHash16.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash16.retira("");
        java.lang.Class<?> wildcardClass39 = tabelaHash16.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("", (java.lang.Object) 100.0f);
        tabelaHash9.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
// flaky:         tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash13.insere("hi!", (java.lang.Object) 100);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("", (java.lang.Object) 100.0f);
        tabelaHash21.imprime();
        tabelaHash21.retira("");
        java.lang.Object obj29 = new java.lang.Object();
        tabelaHash21.insere("", obj29);
        tabelaHash21.retira("");
        tabelaHash13.insere("", (java.lang.Object) tabelaHash21);
        java.lang.Object obj35 = tabelaHash13.pesquisa("hi!");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash37.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash37.retira("hi!");
        tabelaHash37.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash37);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (short) 100 + "'", obj35, (short) 100);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 100.0f);
        tabelaHash7.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        java.lang.Object obj19 = tabelaHash7.pesquisa("");
        tabelaHash7.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0f + "'", obj19, 100.0f);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) "hi!");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("", (java.lang.Object) 100.0f);
        tabelaHash18.insere("", (java.lang.Object) tabelaHash23);
        tabelaHash10.insere("", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("", (java.lang.Object) "hi!");
        tabelaHash30.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash30.insere("", (java.lang.Object) tabelaHash38);
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash38);
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.insere("", (java.lang.Object) 100.0f);
        tabelaHash49.insere("hi!", (java.lang.Object) '#');
        tabelaHash49.retira("");
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        tabelaHash44.insere("", (java.lang.Object) tabelaHash49);
        tabelaHash44.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash44);
        tabelaHash10.imprime();
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) "hi!");
        tabelaHash8.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash16.imprime();
        java.lang.Object obj20 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) "hi!");
        tabelaHash24.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("", (java.lang.Object) "hi!");
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash32.insere("hi!", (java.lang.Object) 1);
        tabelaHash24.insere("", (java.lang.Object) 1);
        java.lang.Object obj43 = tabelaHash24.pesquisa("");
        tabelaHash16.insere("hi!", (java.lang.Object) "");
        tabelaHash16.imprime();
        tabelaHash16.retira("hi!");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.insere("", (java.lang.Object) "hi!");
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.insere("", (java.lang.Object) 100.0f);
        tabelaHash58.insere("hi!", (java.lang.Object) (-1.0f));
        ds.TabelaHash tabelaHash66 = new ds.TabelaHash();
        java.lang.Object obj68 = tabelaHash66.pesquisa("");
        tabelaHash66.insere("hi!", (java.lang.Object) '4');
        tabelaHash58.insere("", (java.lang.Object) tabelaHash66);
        tabelaHash49.insere("hi!", (java.lang.Object) tabelaHash58);
        ds.TabelaHash tabelaHash75 = new ds.TabelaHash();
        tabelaHash75.insere("", (java.lang.Object) "hi!");
        tabelaHash75.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash83 = new ds.TabelaHash();
        tabelaHash75.insere("", (java.lang.Object) tabelaHash83);
        tabelaHash83.imprime();
        java.lang.Object obj87 = tabelaHash83.pesquisa("hi!");
        java.lang.Class<?> wildcardClass88 = tabelaHash83.getClass();
        tabelaHash49.insere("", (java.lang.Object) wildcardClass88);
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash49);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "hi!" + "'", obj43, "hi!");
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) "hi!");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.insere("", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) 100.0f);
        tabelaHash19.imprime();
        tabelaHash19.retira("");
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) 100.0f);
        tabelaHash28.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash19.insere("", (java.lang.Object) tabelaHash28);
        java.lang.Object obj40 = tabelaHash19.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.insere("", (java.lang.Object) "hi!");
        tabelaHash43.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.insere("", (java.lang.Object) "hi!");
        tabelaHash51.imprime();
        tabelaHash51.imprime();
        tabelaHash51.insere("hi!", (java.lang.Object) 1);
        tabelaHash43.insere("", (java.lang.Object) 1);
        tabelaHash43.retira("");
        tabelaHash43.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash43);
        ds.TabelaHash tabelaHash66 = new ds.TabelaHash();
        java.lang.Object obj68 = tabelaHash66.pesquisa("hi!");
        java.lang.Object obj70 = tabelaHash66.pesquisa("hi!");
        tabelaHash66.imprime();
        java.lang.Object obj73 = tabelaHash66.pesquisa("");
        tabelaHash43.insere("hi!", (java.lang.Object) tabelaHash66);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 100.0f);
        tabelaHash19.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash24.retira("");
        tabelaHash24.imprime();
        tabelaHash10.insere("", (java.lang.Object) tabelaHash24);
        java.lang.Object obj34 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash24);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash24.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0f + "'", obj17, 100.0f);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0f + "'", obj8, 100.0f);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash13.insere("hi!", (java.lang.Object) 100);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("", (java.lang.Object) 100.0f);
        tabelaHash21.imprime();
        tabelaHash21.retira("");
        java.lang.Object obj29 = new java.lang.Object();
        tabelaHash21.insere("", obj29);
        tabelaHash21.retira("");
        tabelaHash13.insere("", (java.lang.Object) tabelaHash21);
        java.lang.Object obj35 = tabelaHash13.pesquisa("hi!");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash37.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash37.retira("hi!");
        tabelaHash37.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash37);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        tabelaHash13.retira("");
        tabelaHash13.retira("hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (short) 100 + "'", obj35, (short) 100);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj12 = tabelaHash7.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("", (java.lang.Object) 100.0f);
        tabelaHash16.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash21.retira("");
        tabelaHash21.imprime();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash21);
        java.lang.Object obj31 = tabelaHash21.pesquisa("");
        java.lang.Class<?> wildcardClass32 = tabelaHash21.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj40 = tabelaHash35.pesquisa("hi!");
        java.lang.Object obj42 = tabelaHash35.pesquisa("");
        java.lang.Object obj44 = tabelaHash35.pesquisa("");
        java.lang.Object obj46 = tabelaHash35.pesquisa("");
        tabelaHash35.imprime();
        tabelaHash35.imprime();
        tabelaHash35.imprime();
        java.lang.Object obj51 = tabelaHash35.pesquisa("hi!");
        tabelaHash0.insere("", obj51);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0f + "'", obj14, 100.0f);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0f + "'", obj42, 100.0f);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 100.0f + "'", obj44, 100.0f);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0f + "'", obj46, 100.0f);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("", (java.lang.Object) 100.0f);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 100.0f);
        tabelaHash7.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj26 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj28 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash21);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.insere("", (java.lang.Object) "hi!");
        tabelaHash35.imprime();
        tabelaHash35.imprime();
        tabelaHash35.imprime();
        tabelaHash35.imprime();
        java.lang.Object obj44 = tabelaHash35.pesquisa("");
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        tabelaHash0.insere("", obj44);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0f + "'", obj28, 100.0f);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + "hi!" + "'", obj44, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("", (java.lang.Object) "hi!");
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj26 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.imprime();
        tabelaHash18.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        java.lang.Object obj32 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.retira("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0f + "'", obj7, 100.0f);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0f + "'", obj9, 100.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0f + "'", obj11, 100.0f);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0f + "'", obj15, 100.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0d + "'", obj32, 100.0d);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash8.imprime();
        java.lang.Object obj12 = null;
        tabelaHash8.insere("", obj12);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj20 = tabelaHash15.pesquisa("hi!");
        java.lang.Object obj22 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) true);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) 100.0f);
        tabelaHash15.insere("", (java.lang.Object) 100.0f);
        tabelaHash15.insere("hi!", (java.lang.Object) (-1));
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.insere("", (java.lang.Object) 100.0f);
        java.lang.Object obj42 = tabelaHash37.pesquisa("hi!");
        java.lang.Object obj44 = tabelaHash37.pesquisa("");
        java.lang.Object obj46 = tabelaHash37.pesquisa("");
        java.lang.Object obj48 = tabelaHash37.pesquisa("");
        java.lang.Object obj50 = tabelaHash37.pesquisa("hi!");
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        tabelaHash52.insere("", (java.lang.Object) "hi!");
        tabelaHash52.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj60 = tabelaHash52.pesquisa("hi!");
        tabelaHash52.imprime();
        tabelaHash37.insere("", (java.lang.Object) tabelaHash52);
        java.lang.Object obj64 = tabelaHash52.pesquisa("hi!");
        tabelaHash15.insere("", (java.lang.Object) tabelaHash52);
        java.lang.Object obj67 = tabelaHash15.pesquisa("");
        tabelaHash8.insere("", obj67);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0f + "'", obj22, 100.0f);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 100.0f + "'", obj44, 100.0f);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0f + "'", obj46, 100.0f);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 100.0f + "'", obj48, 100.0f);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 100.0d + "'", obj60, 100.0d);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 100.0d + "'", obj64, 100.0d);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 100.0f + "'", obj67, 100.0f);
    }
}
