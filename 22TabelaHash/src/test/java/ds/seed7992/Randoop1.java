package ds.seed7992;

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
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
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
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
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
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
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
        tabelaHash44.insere("", (java.lang.Object) (short) 10);
        tabelaHash44.imprime();
        java.lang.Class<?> wildcardClass54 = tabelaHash44.getClass();
        tabelaHash31.insere("hi!", (java.lang.Object) wildcardClass54);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100.0d + "'", obj49, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj22 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj28 = tabelaHash17.pesquisa("");
        java.lang.Object obj30 = tabelaHash17.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        java.lang.Class<?> wildcardClass32 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0d + "'", obj22, 100.0d);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
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
        java.lang.Object obj19 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj26 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj31 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        java.lang.Object obj34 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash21.retira("");
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash21);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0d + "'", obj34, 100.0d);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
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
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
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
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
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
        tabelaHash18.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
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
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
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
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj47 = tabelaHash42.pesquisa("hi!");
        tabelaHash42.imprime();
        tabelaHash42.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj53 = tabelaHash42.pesquisa("");
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        tabelaHash55.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash42.insere("", (java.lang.Object) tabelaHash55);
        tabelaHash55.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash55);
        java.lang.Object obj63 = tabelaHash55.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0d + "'", obj28, 100.0d);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 100.0d + "'", obj33, 100.0d);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (byte) -1 + "'", obj36, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 100.0d + "'", obj47, 100.0d);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
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
        tabelaHash16.retira("hi!");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0d + "'", obj38, 100.0d);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
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
        java.lang.Object obj31 = tabelaHash15.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
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
        ds.TabelaHash tabelaHash79 = new ds.TabelaHash();
        tabelaHash79.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash79.imprime();
        tabelaHash79.insere("", (java.lang.Object) (-1.0f));
        tabelaHash79.retira("hi!");
        java.lang.Object obj90 = tabelaHash79.pesquisa("hi!");
        tabelaHash79.insere("hi!", (java.lang.Object) (short) 1);
        tabelaHash79.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash79);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 100.0d + "'", obj61, 100.0d);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 100.0d + "'", obj68, 100.0d);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + (byte) -1 + "'", obj73, (byte) -1);
        org.junit.Assert.assertNull(obj90);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
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
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash34);
        java.lang.Object obj38 = tabelaHash27.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj38);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0d + "'", obj38, 100.0d);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash22);
        java.lang.Class<?> wildcardClass25 = tabelaHash15.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1.0f) + "'", obj13, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash13.imprime();
        tabelaHash13.insere("", (java.lang.Object) (-1.0f));
        tabelaHash13.retira("hi!");
        java.lang.Object obj24 = tabelaHash13.pesquisa("hi!");
        java.lang.Object obj26 = tabelaHash13.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
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
        tabelaHash47.imprime();
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        tabelaHash62.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash62.imprime();
        tabelaHash62.insere("", (java.lang.Object) ' ');
        tabelaHash62.imprime();
        tabelaHash62.imprime();
        tabelaHash62.imprime();
        tabelaHash47.insere("hi!", (java.lang.Object) tabelaHash62);
        java.lang.Class<?> wildcardClass74 = tabelaHash47.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass74);
        java.lang.Object obj77 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100.0d + "'", obj52, 100.0d);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (byte) -1 + "'", obj57, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 100.0d + "'", obj77, 100.0d);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
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
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash41.imprime();
        tabelaHash41.insere("", (java.lang.Object) ' ');
        tabelaHash41.imprime();
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash51.imprime();
        tabelaHash51.insere("", (java.lang.Object) ' ');
        tabelaHash51.imprime();
        tabelaHash51.retira("");
        java.lang.Class<?> wildcardClass62 = tabelaHash51.getClass();
        tabelaHash41.insere("hi!", (java.lang.Object) wildcardClass62);
        tabelaHash7.insere("", (java.lang.Object) tabelaHash41);
        ds.TabelaHash tabelaHash66 = new ds.TabelaHash();
        tabelaHash66.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj71 = tabelaHash66.pesquisa("hi!");
        tabelaHash66.imprime();
        tabelaHash66.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash66.imprime();
        ds.TabelaHash tabelaHash78 = new ds.TabelaHash();
        java.lang.Object obj80 = tabelaHash78.pesquisa("hi!");
        tabelaHash66.insere("", (java.lang.Object) tabelaHash78);
        java.lang.Object obj83 = tabelaHash78.pesquisa("");
        java.lang.Object obj85 = tabelaHash78.pesquisa("hi!");
        tabelaHash41.insere("hi!", obj85);
        java.lang.Class<?> wildcardClass87 = tabelaHash41.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0d + "'", obj36, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 100.0d + "'", obj71, 100.0d);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
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
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
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
        tabelaHash47.imprime();
        java.lang.Object obj86 = tabelaHash47.pesquisa("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) -1 + "'", obj40, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 100.0d + "'", obj53, 100.0d);
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + 100.0d + "'", obj79, 100.0d);
        org.junit.Assert.assertEquals("'" + obj86 + "' != '" + "" + "'", obj86, "");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
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
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0d + "'", obj37, 100.0d);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
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
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + ' ' + "'", obj30, ' ');
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
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
        java.lang.Class<?> wildcardClass27 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) (-1.0f));
        tabelaHash20.retira("hi!");
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj38 = tabelaHash33.pesquisa("hi!");
        tabelaHash20.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash20.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object obj43 = tabelaHash20.pesquisa("hi!");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0d + "'", obj38, 100.0d);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "hi!" + "'", obj43, "hi!");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
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
        java.lang.Object obj97 = tabelaHash85.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash85.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 100.0d + "'", obj59, 100.0d);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 100.0d + "'", obj73, 100.0d);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + (byte) -1 + "'", obj78, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj90 + "' != '" + 100.0d + "'", obj90, 100.0d);
        org.junit.Assert.assertNull(obj97);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
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
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
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
        tabelaHash55.imprime();
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
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
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
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash36.imprime();
        tabelaHash36.insere("", (java.lang.Object) ' ');
        tabelaHash36.imprime();
        tabelaHash36.retira("");
        tabelaHash36.imprime();
        tabelaHash16.insere("", (java.lang.Object) tabelaHash36);
        java.lang.Object obj50 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) 10.0d);
        java.lang.Object obj55 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0d + "'", obj34, 100.0d);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 100.0d + "'", obj50, 100.0d);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 100.0d + "'", obj55, 100.0d);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj26 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash21.imprime();
        tabelaHash21.retira("hi!");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj40 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj45 = tabelaHash35.pesquisa("");
        tabelaHash35.retira("hi!");
        tabelaHash35.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash35);
        tabelaHash14.insere("", (java.lang.Object) tabelaHash35);
        java.lang.Object obj52 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash14.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash14);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0d + "'", obj40, 100.0d);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) -1 + "'", obj45, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100.0d + "'", obj52, 100.0d);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
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
        tabelaHash16.imprime();
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (byte) -1 + "'", obj40, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 100.0d + "'", obj51, 100.0d);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
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
        java.lang.Object obj30 = tabelaHash14.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) -1 + "'", obj24, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) -1 + "'", obj30, (byte) -1);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
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
        java.lang.Object obj53 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + "" + "'", obj53, "");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
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
        tabelaHash31.retira("hi!");
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
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
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
        java.lang.Object obj19 = tabelaHash12.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash12.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1L));
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
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
        java.lang.Object obj34 = tabelaHash0.pesquisa("");
        java.lang.Object obj36 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
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
        java.lang.Class<?> wildcardClass28 = tabelaHash15.getClass();
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
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
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash13.imprime();
        tabelaHash13.insere("", (java.lang.Object) (-1.0f));
        tabelaHash13.retira("hi!");
        java.lang.Object obj24 = tabelaHash13.pesquisa("hi!");
        java.lang.Object obj26 = tabelaHash13.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash29.imprime();
        tabelaHash29.insere("", (java.lang.Object) ' ');
        tabelaHash29.imprime();
        tabelaHash29.retira("");
        tabelaHash29.imprime();
        java.lang.Class<?> wildcardClass41 = tabelaHash29.getClass();
        tabelaHash13.insere("", (java.lang.Object) wildcardClass41);
        tabelaHash13.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
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
        java.lang.Object obj59 = tabelaHash54.pesquisa("hi!");
        tabelaHash54.insere("", (java.lang.Object) (byte) -1);
        tabelaHash54.imprime();
        tabelaHash44.insere("hi!", (java.lang.Object) tabelaHash54);
        tabelaHash54.retira("hi!");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100.0d + "'", obj49, 100.0d);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 100.0d + "'", obj59, 100.0d);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
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
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash41.imprime();
        tabelaHash41.insere("", (java.lang.Object) ' ');
        tabelaHash41.imprime();
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash51.imprime();
        tabelaHash51.insere("", (java.lang.Object) ' ');
        tabelaHash51.imprime();
        tabelaHash51.retira("");
        java.lang.Class<?> wildcardClass62 = tabelaHash51.getClass();
        tabelaHash41.insere("hi!", (java.lang.Object) wildcardClass62);
        tabelaHash7.insere("", (java.lang.Object) tabelaHash41);
        java.lang.Class<?> wildcardClass65 = tabelaHash7.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0d + "'", obj36, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Ignore
    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj22 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj28 = tabelaHash17.pesquisa("");
        java.lang.Object obj30 = tabelaHash17.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash17.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0d + "'", obj22, 100.0d);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
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
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj37);
    }

    @Ignore
    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
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
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash15.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
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
        java.lang.Class<?> wildcardClass31 = tabelaHash9.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0d + "'", obj27, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash13.imprime();
        tabelaHash13.insere("", (java.lang.Object) ' ');
        tabelaHash13.retira("hi!");
        tabelaHash13.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash25.imprime();
        tabelaHash25.insere("", (java.lang.Object) ' ');
        tabelaHash25.imprime();
        tabelaHash25.retira("");
        tabelaHash25.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash25);
        tabelaHash13.insere("", (java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass41 = tabelaHash13.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj49 = tabelaHash44.pesquisa("hi!");
        tabelaHash44.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj54 = tabelaHash44.pesquisa("");
        tabelaHash44.imprime();
        java.lang.Object obj57 = tabelaHash44.pesquisa("hi!");
        tabelaHash44.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj62 = tabelaHash44.pesquisa("hi!");
        tabelaHash44.imprime();
        java.lang.Object obj65 = tabelaHash44.pesquisa("");
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash44);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100.0d + "'", obj49, 100.0d);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (byte) -1 + "'", obj54, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 100.0d + "'", obj57, 100.0d);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 100.0d + "'", obj62, 100.0d);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (byte) -1 + "'", obj65, (byte) -1);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
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
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj26 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj31 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        java.lang.Object obj34 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.insere("hi!", (java.lang.Object) 0.0f);
        java.lang.Object obj39 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.retira("");
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash21);
        java.lang.Object obj46 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1.0f) + "'", obj19, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0d + "'", obj34, 100.0d);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100.0d + "'", obj39, 100.0d);
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
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
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        java.lang.Object obj59 = tabelaHash33.pesquisa("hi!");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0d + "'", obj38, 100.0d);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 100.0d + "'", obj51, 100.0d);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (byte) -1 + "'", obj54, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 100.0d + "'", obj59, 100.0d);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
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
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (byte) -1 + "'", obj26, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
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
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (byte) 0);
        tabelaHash0.imprime();
        java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj24 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.insere("", (java.lang.Object) (short) 10);
        tabelaHash19.imprime();
        tabelaHash19.insere("hi!", (java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass32 = tabelaHash19.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass32);
        java.lang.Object obj35 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0d + "'", obj17, 100.0d);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
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
        java.lang.Object obj38 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash42.imprime();
        tabelaHash42.insere("", (java.lang.Object) ' ');
        tabelaHash42.retira("hi!");
        tabelaHash42.imprime();
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        tabelaHash54.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash54.imprime();
        tabelaHash54.imprime();
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        tabelaHash61.imprime();
        tabelaHash54.insere("hi!", (java.lang.Object) tabelaHash61);
        java.lang.Object obj65 = tabelaHash54.pesquisa("hi!");
        tabelaHash54.imprime();
        tabelaHash42.insere("", (java.lang.Object) tabelaHash54);
        java.lang.Class<?> wildcardClass68 = tabelaHash42.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass68);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) -1 + "'", obj31, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0d + "'", obj38, 100.0d);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 100.0d + "'", obj65, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (byte) -1 + "'", obj14, (byte) -1);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = obj18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
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
        java.lang.Object obj55 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0d + "'", obj40, 100.0d);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) -1 + "'", obj45, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (-1.0f) + "'", obj55, (-1.0f));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
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
        java.lang.Object obj53 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
        tabelaHash57.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj62 = tabelaHash57.pesquisa("hi!");
        ds.TabelaHash tabelaHash64 = new ds.TabelaHash();
        tabelaHash64.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj69 = tabelaHash64.pesquisa("hi!");
        tabelaHash64.imprime();
        tabelaHash64.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash64.imprime();
        tabelaHash64.retira("hi!");
        ds.TabelaHash tabelaHash78 = new ds.TabelaHash();
        tabelaHash78.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj83 = tabelaHash78.pesquisa("hi!");
        tabelaHash78.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj88 = tabelaHash78.pesquisa("");
        tabelaHash78.retira("hi!");
        tabelaHash78.imprime();
        tabelaHash64.insere("hi!", (java.lang.Object) tabelaHash78);
        tabelaHash57.insere("", (java.lang.Object) tabelaHash78);
        java.lang.Object obj95 = tabelaHash57.pesquisa("hi!");
        tabelaHash57.imprime();
        tabelaHash57.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash57);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + "" + "'", obj53, "");
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 100.0d + "'", obj62, 100.0d);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + 100.0d + "'", obj69, 100.0d);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + 100.0d + "'", obj83, 100.0d);
        org.junit.Assert.assertEquals("'" + obj88 + "' != '" + (byte) -1 + "'", obj88, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj95 + "' != '" + 100.0d + "'", obj95, 100.0d);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
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
        java.lang.Class<?> wildcardClass40 = tabelaHash25.getClass();
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0d + "'", obj30, 100.0d);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) -1 + "'", obj35, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
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
        tabelaHash0.retira("");
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
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
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
        java.lang.Object obj67 = tabelaHash33.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0d + "'", obj38, 100.0d);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (byte) -1 + "'", obj43, (byte) -1);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 100.0d + "'", obj67, 100.0d);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
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
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
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
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass19 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) -1 + "'", obj16, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = null;
        tabelaHash0.insere("hi!", obj11);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
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
        tabelaHash0.retira("hi!");
        java.lang.Object obj33 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
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
        java.lang.Object obj32 = tabelaHash22.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) -1 + "'", obj18, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0d + "'", obj27, 100.0d);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0d + "'", obj32, 100.0d);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
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
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + ' ' + "'", obj29, ' ');
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
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
        java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) -1 + "'", obj11, (byte) -1);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
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
        java.lang.Object obj60 = tabelaHash50.pesquisa("");
        tabelaHash50.imprime();
        java.lang.Object obj63 = tabelaHash50.pesquisa("hi!");
        tabelaHash50.insere("hi!", (java.lang.Object) 0.0f);
        tabelaHash50.imprime();
        ds.TabelaHash tabelaHash69 = new ds.TabelaHash();
        java.lang.Object obj71 = tabelaHash69.pesquisa("hi!");
        java.lang.Object obj73 = tabelaHash69.pesquisa("");
        tabelaHash69.imprime();
        tabelaHash69.imprime();
        ds.TabelaHash tabelaHash77 = new ds.TabelaHash();
        tabelaHash77.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj82 = tabelaHash77.pesquisa("hi!");
        tabelaHash77.imprime();
        tabelaHash77.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash77.imprime();
        tabelaHash77.retira("hi!");
        tabelaHash77.imprime();
        tabelaHash77.imprime();
        tabelaHash77.imprime();
        tabelaHash69.insere("", (java.lang.Object) tabelaHash77);
        tabelaHash50.insere("", (java.lang.Object) tabelaHash69);
        tabelaHash69.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash69);
        java.lang.Object obj98 = tabelaHash15.pesquisa("");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0d + "'", obj36, 100.0d);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) -1 + "'", obj41, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (-1.0f) + "'", obj45, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 100.0d + "'", obj55, 100.0d);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + (byte) -1 + "'", obj60, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 100.0d + "'", obj63, 100.0d);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + 100.0d + "'", obj82, 100.0d);
        org.junit.Assert.assertEquals("'" + obj98 + "' != '" + (-1.0f) + "'", obj98, (-1.0f));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
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
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash30.imprime();
        tabelaHash30.insere("", (java.lang.Object) (-1.0f));
        tabelaHash30.retira("hi!");
        tabelaHash30.imprime();
        tabelaHash30.retira("");
        java.lang.Object obj44 = tabelaHash30.pesquisa("");
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj51 = tabelaHash46.pesquisa("hi!");
        tabelaHash46.imprime();
        tabelaHash46.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash46.imprime();
        tabelaHash46.retira("hi!");
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        tabelaHash60.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj65 = tabelaHash60.pesquisa("hi!");
        tabelaHash60.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj70 = tabelaHash60.pesquisa("");
        tabelaHash60.retira("hi!");
        tabelaHash60.imprime();
        tabelaHash46.insere("hi!", (java.lang.Object) tabelaHash60);
        ds.TabelaHash tabelaHash76 = new ds.TabelaHash();
        tabelaHash76.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj81 = tabelaHash76.pesquisa("hi!");
        tabelaHash46.insere("hi!", (java.lang.Object) tabelaHash76);
        tabelaHash30.insere("", (java.lang.Object) tabelaHash46);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash46);
        tabelaHash46.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 100.0d + "'", obj51, 100.0d);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 100.0d + "'", obj65, 100.0d);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + (byte) -1 + "'", obj70, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj81 + "' != '" + 100.0d + "'", obj81, 100.0d);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) 10);
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1L));
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) 10);
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
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj11 = tabelaHash6.pesquisa("hi!");
        java.lang.Object obj13 = tabelaHash6.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj21 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash13.imprime();
        tabelaHash13.insere("", (java.lang.Object) (-1.0f));
        tabelaHash13.retira("hi!");
        java.lang.Object obj24 = tabelaHash13.pesquisa("hi!");
        java.lang.Object obj26 = tabelaHash13.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj34 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj39 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        tabelaHash29.insere("", (java.lang.Object) (byte) 0);
        tabelaHash29.imprime();
        java.lang.Object obj46 = tabelaHash29.pesquisa("hi!");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj53 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.insere("", (java.lang.Object) (short) 10);
        tabelaHash48.imprime();
        tabelaHash48.insere("hi!", (java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass61 = tabelaHash48.getClass();
        tabelaHash29.insere("hi!", (java.lang.Object) wildcardClass61);
        java.lang.Class<?> wildcardClass63 = tabelaHash29.getClass();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash29);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0d + "'", obj34, 100.0d);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (byte) -1 + "'", obj39, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 100.0d + "'", obj46, 100.0d);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 100.0d + "'", obj53, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj20 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj25 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        java.lang.Object obj28 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        java.lang.Object obj31 = tabelaHash15.pesquisa("hi!");
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass32);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) -1 + "'", obj25, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0d + "'", obj28, 100.0d);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0d + "'", obj31, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
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
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) -1 + "'", obj10, (byte) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0d + "'", obj22, 100.0d);
    }
}

