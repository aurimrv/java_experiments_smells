package ds.seed5311;

import org.junit.FixMethodOrder;
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
        java.lang.Object obj51 = tabelaHash0.pesquisa("hi!");
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
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
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
        tabelaHash15.retira("");
        java.lang.Object obj30 = tabelaHash15.pesquisa("");
        java.lang.Object obj32 = tabelaHash15.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash15.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
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
        tabelaHash15.retira("");
        java.lang.Object obj30 = tabelaHash15.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash15.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
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
        tabelaHash5.retira("");
        java.lang.Class<?> wildcardClass44 = tabelaHash5.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
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
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + '4' + "'", obj34, '4');
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
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
        java.lang.Object obj79 = tabelaHash7.pesquisa("");
        java.lang.Class<?> wildcardClass80 = tabelaHash7.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + ' ' + "'", obj77, ' ');
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + ' ' + "'", obj79, ' ');
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
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
        java.lang.Object obj32 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
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
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass34 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '4' + "'", obj24, '4');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '4' + "'", obj28, '4');
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '4' + "'", obj32, '4');
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
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
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = null;
        tabelaHash0.insere("hi!", obj11);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass16 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        tabelaHash25.insere("", (java.lang.Object) tabelaHash30);
        tabelaHash30.imprime();
        tabelaHash16.insere("", (java.lang.Object) tabelaHash30);
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object obj41 = tabelaHash39.pesquisa("");
        tabelaHash39.imprime();
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash39.insere("", (java.lang.Object) tabelaHash44);
        tabelaHash30.insere("hi!", (java.lang.Object) tabelaHash39);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash30);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
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
        tabelaHash12.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + ' ' + "'", obj39, ' ');
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
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
        java.lang.Class<?> wildcardClass17 = tabelaHash4.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + ' ' + "'", obj11, ' ');
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
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
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass73 = tabelaHash0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
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
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
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
        java.lang.Class<?> wildcardClass35 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
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
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = tabelaHash36.pesquisa("");
        java.lang.Object obj40 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj45 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.imprime();
        java.lang.Class<?> wildcardClass47 = tabelaHash36.getClass();
        tabelaHash27.insere("hi!", (java.lang.Object) wildcardClass47);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (-1.0d) + "'", obj45, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
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
        tabelaHash17.imprime();
        java.lang.Object obj38 = tabelaHash17.pesquisa("");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        tabelaHash40.insere("hi!", (java.lang.Object) 1L);
        tabelaHash40.retira("hi!");
        tabelaHash17.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        tabelaHash17.insere("", (java.lang.Object) tabelaHash49);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash49);
        java.lang.Object obj55 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(obj55);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
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
        tabelaHash28.retira("");
        tabelaHash28.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash28);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + '4' + "'", obj37, '4');
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + '4' + "'", obj63, '4');
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
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
        java.lang.Object obj30 = tabelaHash25.pesquisa("");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.imprime();
        tabelaHash25.insere("", (java.lang.Object) tabelaHash32);
        java.lang.Object obj36 = tabelaHash32.pesquisa("");
        tabelaHash32.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash32);
        java.lang.Object obj40 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass41 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + '4' + "'", obj11, '4');
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
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
        java.lang.Object obj67 = tabelaHash7.pesquisa("");
        java.lang.Object obj69 = tabelaHash7.pesquisa("hi!");
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
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + ' ' + "'", obj67, ' ');
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + '4' + "'", obj69, '4');
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
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
        tabelaHash25.imprime();
        java.lang.Class<?> wildcardClass45 = tabelaHash25.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
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
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + '4' + "'", obj34, '4');
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 1L + "'", obj47, 1L);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
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
        tabelaHash7.imprime();
        java.lang.Object obj24 = tabelaHash7.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + ' ' + "'", obj19, ' ');
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + ' ' + "'", obj21, ' ');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + ' ' + "'", obj24, ' ');
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
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
        tabelaHash0.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("hi!");
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
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
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
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        java.lang.Object obj41 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash36);
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.imprime();
        tabelaHash45.insere("", (java.lang.Object) ' ');
        tabelaHash45.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj54 = tabelaHash45.pesquisa("hi!");
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        tabelaHash36.insere("", obj54);
        java.lang.Object obj58 = tabelaHash36.pesquisa("");
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        java.lang.Object obj62 = tabelaHash60.pesquisa("");
        tabelaHash60.imprime();
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        java.lang.Object obj67 = tabelaHash65.pesquisa("");
        tabelaHash65.imprime();
        java.lang.Object obj70 = tabelaHash65.pesquisa("");
        tabelaHash65.imprime();
        tabelaHash60.insere("hi!", (java.lang.Object) tabelaHash65);
        tabelaHash60.retira("hi!");
        tabelaHash36.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass77 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '4' + "'", obj24, '4');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '4' + "'", obj28, '4');
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + '4' + "'", obj54, '4');
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + '4' + "'", obj58, '4');
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
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
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash12.imprime();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
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
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        java.lang.Object obj23 = tabelaHash19.pesquisa("");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash25.insere("", (java.lang.Object) ' ');
        tabelaHash25.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj34 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        java.lang.Object obj38 = tabelaHash25.pesquisa("hi!");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        tabelaHash40.insere("", (java.lang.Object) ' ');
        tabelaHash40.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj49 = tabelaHash40.pesquisa("hi!");
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        java.lang.Object obj53 = tabelaHash40.pesquisa("hi!");
        tabelaHash25.insere("", obj53);
        tabelaHash25.imprime();
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash25);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + '4' + "'", obj34, '4');
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + '4' + "'", obj38, '4');
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + '4' + "'", obj49, '4');
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + '4' + "'", obj53, '4');
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
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
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + '4' + "'", obj18, '4');
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
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
        tabelaHash15.retira("hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
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
        java.lang.Object obj27 = tabelaHash8.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
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
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        tabelaHash22.insere("", (java.lang.Object) ' ');
        tabelaHash22.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj31 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        java.lang.Object obj35 = tabelaHash22.pesquisa("hi!");
        java.lang.Object obj37 = tabelaHash22.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash22);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + '4' + "'", obj31, '4');
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + '4' + "'", obj35, '4');
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + '4' + "'", obj37, '4');
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
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
        tabelaHash0.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
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
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
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
        java.lang.Object obj45 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object obj49 = tabelaHash47.pesquisa("");
        tabelaHash47.imprime();
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        java.lang.Object obj54 = tabelaHash52.pesquisa("");
        tabelaHash52.imprime();
        java.lang.Object obj57 = tabelaHash52.pesquisa("");
        tabelaHash52.imprime();
        tabelaHash47.insere("hi!", (java.lang.Object) tabelaHash52);
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        java.lang.Object obj63 = tabelaHash61.pesquisa("");
        tabelaHash61.imprime();
        ds.TabelaHash tabelaHash66 = new ds.TabelaHash();
        tabelaHash66.imprime();
        tabelaHash66.imprime();
        tabelaHash66.imprime();
        tabelaHash66.imprime();
        tabelaHash61.insere("", (java.lang.Object) tabelaHash66);
        tabelaHash52.insere("", (java.lang.Object) tabelaHash66);
        tabelaHash66.imprime();
        tabelaHash66.imprime();
        java.lang.Object obj76 = tabelaHash66.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash66);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash66.retira("hi!");
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
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
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
        java.lang.Object obj33 = tabelaHash15.pesquisa("hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
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
        java.lang.Object obj26 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10.0f + "'", obj22, 10.0f);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
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
        java.lang.Object obj51 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
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
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        java.lang.Object obj41 = tabelaHash36.pesquisa("");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.imprime();
        tabelaHash43.insere("", (java.lang.Object) ' ');
        tabelaHash43.insere("hi!", (java.lang.Object) '4');
        tabelaHash43.imprime();
        tabelaHash36.insere("", (java.lang.Object) tabelaHash43);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash36);
        java.lang.Class<?> wildcardClass54 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        java.lang.Object obj15 = tabelaHash8.pesquisa("");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
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
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
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
        java.lang.Object obj52 = tabelaHash14.pesquisa("");
        java.lang.Object obj54 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash14.retira("hi!");
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
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
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
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + '4' + "'", obj25, '4');
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
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
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) 1L);
        tabelaHash20.imprime();
        java.lang.Object obj27 = tabelaHash20.pesquisa("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object obj31 = tabelaHash29.pesquisa("");
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        java.lang.Object obj39 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash34.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash34);
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
        tabelaHash34.insere("", (java.lang.Object) tabelaHash45);
        tabelaHash45.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash45);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash45.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj66);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
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
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        java.lang.Object obj41 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash36);
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        java.lang.Object obj47 = tabelaHash45.pesquisa("");
        tabelaHash45.imprime();
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        tabelaHash45.insere("", (java.lang.Object) tabelaHash50);
        tabelaHash36.insere("", (java.lang.Object) tabelaHash50);
        java.lang.Object obj58 = tabelaHash36.pesquisa("hi!");
        tabelaHash5.insere("", (java.lang.Object) tabelaHash36);
        tabelaHash5.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
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
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
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
        java.lang.Object obj36 = tabelaHash0.pesquisa("hi!");
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
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 10);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
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
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
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
        java.lang.Object obj58 = tabelaHash40.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + ' ' + "'", obj18, ' ');
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(obj58);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
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
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass81 = tabelaHash0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
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
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash25.insere("", (java.lang.Object) ' ');
        tabelaHash25.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj34 = tabelaHash25.pesquisa("");
        java.lang.Class<?> wildcardClass35 = tabelaHash25.getClass();
        tabelaHash7.insere("", (java.lang.Object) wildcardClass35);
        tabelaHash7.retira("");
        tabelaHash7.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + ' ' + "'", obj19, ' ');
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + ' ' + "'", obj34, ' ');
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
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
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash27);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '4' + "'", obj23, '4');
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.retira("");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
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
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        java.lang.Object obj9 = tabelaHash4.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
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
        java.lang.Object obj45 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj47 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass48 = tabelaHash0.getClass();
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
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
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
        java.lang.Object obj20 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
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
        java.lang.Object obj30 = tabelaHash19.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = obj30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
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
        java.lang.Class<?> wildcardClass24 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
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
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        tabelaHash36.insere("", (java.lang.Object) ' ');
        tabelaHash36.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj45 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.imprime();
        tabelaHash36.imprime();
        java.lang.Object obj49 = tabelaHash36.pesquisa("hi!");
        java.lang.Object obj51 = null;
        tabelaHash36.insere("", obj51);
        java.lang.Object obj54 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.imprime();
        tabelaHash36.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
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
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + '4' + "'", obj45, '4');
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + '4' + "'", obj49, '4');
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + '4' + "'", obj54, '4');
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
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
        tabelaHash0.retira("");
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
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
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
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        java.lang.Object obj24 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        java.lang.Object obj31 = tabelaHash27.pesquisa("hi!");
        tabelaHash19.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash19.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.imprime();
        tabelaHash42.insere("hi!", (java.lang.Object) 1L);
        tabelaHash42.retira("hi!");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        java.lang.Object obj52 = tabelaHash50.pesquisa("");
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        tabelaHash42.insere("hi!", (java.lang.Object) tabelaHash50);
        java.lang.Object obj57 = tabelaHash42.pesquisa("hi!");
        tabelaHash37.insere("", (java.lang.Object) "hi!");
        tabelaHash19.insere("", (java.lang.Object) "hi!");
        tabelaHash19.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(obj57);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
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
        java.lang.Object obj48 = tabelaHash43.pesquisa("");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.imprime();
        tabelaHash50.insere("", (java.lang.Object) ' ');
        tabelaHash50.insere("hi!", (java.lang.Object) '4');
        tabelaHash50.imprime();
        tabelaHash43.insere("", (java.lang.Object) tabelaHash50);
        java.lang.Object obj61 = null;
        tabelaHash50.insere("", obj61);
        tabelaHash50.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
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
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
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
        java.lang.Object obj69 = tabelaHash46.pesquisa("");
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
        org.junit.Assert.assertNotNull(obj69);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
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
        java.lang.Class<?> wildcardClass64 = tabelaHash39.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
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
        java.lang.Class<?> wildcardClass64 = tabelaHash35.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
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
        java.lang.Class<?> wildcardClass40 = tabelaHash19.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
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
        java.lang.Object obj58 = tabelaHash42.pesquisa("hi!");
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        java.lang.Object obj62 = tabelaHash60.pesquisa("");
        tabelaHash60.imprime();
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        java.lang.Object obj67 = tabelaHash65.pesquisa("");
        tabelaHash65.imprime();
        java.lang.Object obj70 = tabelaHash65.pesquisa("");
        tabelaHash65.imprime();
        tabelaHash60.insere("hi!", (java.lang.Object) tabelaHash65);
        tabelaHash60.retira("hi!");
        tabelaHash42.insere("hi!", (java.lang.Object) tabelaHash60);
        tabelaHash42.retira("hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj70);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
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
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        tabelaHash65.imprime();
        tabelaHash65.insere("hi!", (java.lang.Object) 1L);
        tabelaHash65.retira("hi!");
        java.lang.Object obj73 = tabelaHash65.pesquisa("hi!");
        tabelaHash39.insere("", obj73);
// flaky:         tabelaHash39.retira("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
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
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) 1L);
        tabelaHash25.imprime();
        java.lang.Object obj32 = tabelaHash25.pesquisa("");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object obj36 = tabelaHash34.pesquisa("");
        tabelaHash34.imprime();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object obj41 = tabelaHash39.pesquisa("");
        tabelaHash39.imprime();
        java.lang.Object obj44 = tabelaHash39.pesquisa("");
        tabelaHash39.imprime();
        tabelaHash34.insere("hi!", (java.lang.Object) tabelaHash39);
        tabelaHash39.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash39);
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        java.lang.Object obj52 = tabelaHash50.pesquisa("");
        tabelaHash50.imprime();
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        java.lang.Object obj57 = tabelaHash55.pesquisa("");
        tabelaHash55.imprime();
        java.lang.Object obj60 = tabelaHash55.pesquisa("");
        tabelaHash55.imprime();
        tabelaHash50.insere("hi!", (java.lang.Object) tabelaHash55);
        tabelaHash50.retira("hi!");
        java.lang.Object obj66 = tabelaHash50.pesquisa("hi!");
        tabelaHash50.imprime();
        tabelaHash39.insere("", (java.lang.Object) tabelaHash50);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash50);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj66);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
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
        tabelaHash10.imprime();
        java.lang.Object obj30 = tabelaHash10.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + '4' + "'", obj19, '4');
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + '4' + "'", obj26, '4');
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
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
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
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
        java.lang.Object obj57 = tabelaHash46.pesquisa("hi!");
        tabelaHash46.imprime();
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
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
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
        tabelaHash19.retira("");
        tabelaHash19.imprime();
        java.lang.Object obj47 = tabelaHash19.pesquisa("");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + '4' + "'", obj37, '4');
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + '4' + "'", obj41, '4');
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
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
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        tabelaHash65.imprime();
        tabelaHash65.insere("hi!", (java.lang.Object) 1L);
        tabelaHash65.retira("hi!");
        java.lang.Object obj73 = tabelaHash65.pesquisa("hi!");
        tabelaHash39.insere("", obj73);
        tabelaHash39.retira("");
        java.lang.Object obj78 = tabelaHash39.pesquisa("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj78);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
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
        java.lang.Class<?> wildcardClass34 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
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
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) 1L);
        tabelaHash29.retira("hi!");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object obj39 = tabelaHash37.pesquisa("");
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash37);
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object obj46 = tabelaHash44.pesquisa("");
        tabelaHash44.imprime();
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        java.lang.Object obj51 = tabelaHash49.pesquisa("");
        tabelaHash49.imprime();
        java.lang.Object obj54 = tabelaHash49.pesquisa("");
        tabelaHash49.imprime();
        tabelaHash44.insere("hi!", (java.lang.Object) tabelaHash49);
        tabelaHash37.insere("hi!", (java.lang.Object) tabelaHash44);
        java.lang.Object obj59 = tabelaHash44.pesquisa("hi!");
        tabelaHash44.imprime();
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        java.lang.Object obj64 = tabelaHash62.pesquisa("");
        tabelaHash62.imprime();
        ds.TabelaHash tabelaHash67 = new ds.TabelaHash();
        java.lang.Object obj69 = tabelaHash67.pesquisa("");
        tabelaHash67.imprime();
        java.lang.Object obj72 = tabelaHash67.pesquisa("");
        tabelaHash67.imprime();
        tabelaHash62.insere("hi!", (java.lang.Object) tabelaHash67);
        tabelaHash62.retira("hi!");
        java.lang.Object obj78 = tabelaHash62.pesquisa("hi!");
        java.lang.Object obj80 = tabelaHash62.pesquisa("hi!");
        tabelaHash62.imprime();
        java.lang.Object obj83 = tabelaHash62.pesquisa("");
        ds.TabelaHash tabelaHash85 = new ds.TabelaHash();
        tabelaHash85.imprime();
        tabelaHash85.insere("hi!", (java.lang.Object) 1L);
        tabelaHash85.retira("hi!");
        tabelaHash62.insere("", (java.lang.Object) "hi!");
        tabelaHash44.insere("", (java.lang.Object) "");
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash44);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj83);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
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
        java.lang.Object obj54 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + '4' + "'", obj48, '4');
        org.junit.Assert.assertNotNull(obj54);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
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
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
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
        tabelaHash7.retira("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash7.retira("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: Lista vazia ou chave invalida");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
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
        java.lang.Object obj67 = tabelaHash7.pesquisa("");
        java.lang.Object obj69 = tabelaHash7.pesquisa("");
        tabelaHash7.retira("hi!");
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
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + ' ' + "'", obj67, ' ');
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + ' ' + "'", obj69, ' ');
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
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
        java.lang.Class<?> wildcardClass20 = tabelaHash7.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + ' ' + "'", obj19, ' ');
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
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
        java.lang.Object obj82 = tabelaHash5.pesquisa("");
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
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + '4' + "'", obj82, '4');
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        java.lang.Object obj17 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        java.lang.Object obj30 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash25);
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        tabelaHash34.insere("", (java.lang.Object) ' ');
        tabelaHash34.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj43 = tabelaHash34.pesquisa("hi!");
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        tabelaHash25.insere("", obj43);
        java.lang.Object obj47 = tabelaHash25.pesquisa("");
        tabelaHash13.insere("", obj47);
        tabelaHash13.imprime();
        java.lang.Object obj51 = tabelaHash13.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        java.lang.Object obj54 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + ' ' + "'", obj9, ' ');
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + '4' + "'", obj43, '4');
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + '4' + "'", obj47, '4');
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + '4' + "'", obj54, '4');
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("", (java.lang.Object) ' ');
        tabelaHash10.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj19 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj21 = null;
        tabelaHash10.insere("hi!", obj21);
        tabelaHash10.retira("");
        java.lang.Object obj26 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj28 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("hi!");
        java.lang.Class<?> wildcardClass31 = tabelaHash10.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass31);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + '4' + "'", obj19, '4');
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + '4' + "'", obj26, '4');
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        java.lang.Object obj19 = tabelaHash15.pesquisa("");
        java.lang.Object obj21 = tabelaHash15.pesquisa("hi!");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) 1L);
        tabelaHash15.insere("hi!", (java.lang.Object) 1L);
        java.lang.Object obj30 = tabelaHash15.pesquisa("");
        tabelaHash0.insere("hi!", obj30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass32 = obj30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        java.lang.Object obj12 = null;
        tabelaHash0.insere("", obj12);
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
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
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        java.lang.Object obj53 = tabelaHash51.pesquisa("");
        tabelaHash51.imprime();
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        java.lang.Object obj58 = tabelaHash56.pesquisa("");
        tabelaHash56.imprime();
        java.lang.Object obj61 = tabelaHash56.pesquisa("");
        tabelaHash56.imprime();
        tabelaHash51.insere("hi!", (java.lang.Object) tabelaHash56);
        tabelaHash51.retira("hi!");
        java.lang.Object obj67 = tabelaHash51.pesquisa("hi!");
        java.lang.Object obj69 = tabelaHash51.pesquisa("hi!");
        java.lang.Object obj71 = tabelaHash51.pesquisa("");
        java.lang.Object obj73 = tabelaHash51.pesquisa("hi!");
        tabelaHash5.insere("hi!", obj73);
        ds.TabelaHash tabelaHash76 = new ds.TabelaHash();
        tabelaHash76.imprime();
        tabelaHash76.insere("", (java.lang.Object) ' ');
        tabelaHash76.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj85 = tabelaHash76.pesquisa("hi!");
        java.lang.Object obj87 = null;
        tabelaHash76.insere("hi!", obj87);
        tabelaHash76.retira("");
        java.lang.Object obj92 = tabelaHash76.pesquisa("");
        java.lang.Object obj94 = tabelaHash76.pesquisa("hi!");
        java.lang.Class<?> wildcardClass95 = tabelaHash76.getClass();
        tabelaHash5.insere("hi!", (java.lang.Object) wildcardClass95);
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
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + '4' + "'", obj85, '4');
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertEquals("'" + obj94 + "' != '" + '4' + "'", obj94, '4');
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
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
        java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
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
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
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
        tabelaHash0.imprime();
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
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
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
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '4' + "'", obj24, '4');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '4' + "'", obj28, '4');
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
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
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) 100 + "'", obj22, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
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
        java.lang.Object obj19 = null;
        tabelaHash0.insere("hi!", obj19);
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "hi!" + "'", obj22, "hi!");
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
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
        java.lang.Object obj31 = tabelaHash19.pesquisa("hi!");
        java.lang.Object obj33 = tabelaHash19.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
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
        java.lang.Object obj79 = tabelaHash63.pesquisa("hi!");
        java.lang.Object obj81 = tabelaHash63.pesquisa("hi!");
        tabelaHash63.imprime();
        java.lang.Object obj84 = tabelaHash63.pesquisa("");
        java.lang.Object obj86 = tabelaHash63.pesquisa("hi!");
        java.lang.Object obj88 = tabelaHash63.pesquisa("hi!");
        tabelaHash39.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash39.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
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
        java.lang.Object obj79 = tabelaHash7.pesquisa("");
        java.lang.Object obj81 = tabelaHash7.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + ' ' + "'", obj77, ' ');
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + ' ' + "'", obj79, ' ');
        org.junit.Assert.assertEquals("'" + obj81 + "' != '" + ' ' + "'", obj81, ' ');
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = null;
        tabelaHash0.insere("hi!", obj11);
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + '4' + "'", obj18, '4');
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
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
        tabelaHash65.insere("", (java.lang.Object) ' ');
        tabelaHash65.insere("hi!", (java.lang.Object) '4');
        tabelaHash65.imprime();
        tabelaHash58.insere("", (java.lang.Object) tabelaHash65);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash58);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) ' ');
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + ' ' + "'", obj12, ' ');
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
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
        java.lang.Object obj29 = tabelaHash10.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + '4' + "'", obj19, '4');
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + '4' + "'", obj26, '4');
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + '4' + "'", obj29, '4');
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
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
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass19 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
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
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
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
        java.lang.Object obj45 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj47 = tabelaHash0.pesquisa("hi!");
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
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
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
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        java.lang.Object obj26 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj28 = tabelaHash21.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash21);
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass49 = obj48.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
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
        java.lang.Object obj36 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.imprime();
        tabelaHash38.insere("hi!", (java.lang.Object) 1L);
        tabelaHash38.retira("hi!");
        java.lang.Object obj46 = tabelaHash38.pesquisa("");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.imprime();
        tabelaHash48.insere("hi!", (java.lang.Object) 1L);
        tabelaHash48.retira("hi!");
        tabelaHash38.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
        java.lang.Object obj59 = tabelaHash57.pesquisa("");
        tabelaHash57.imprime();
        tabelaHash57.imprime();
        tabelaHash57.imprime();
        tabelaHash38.insere("", (java.lang.Object) tabelaHash57);
        java.lang.Object obj65 = null;
        tabelaHash57.insere("", obj65);
        java.lang.Object obj68 = tabelaHash57.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
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
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
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
        java.lang.Object obj36 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + ' ' + "'", obj36, ' ');
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
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
        java.lang.Object obj63 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(obj63);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
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
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + '4' + "'", obj19, '4');
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + '4' + "'", obj26, '4');
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) false);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
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
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        java.lang.Object obj41 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash36);
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        java.lang.Object obj47 = tabelaHash45.pesquisa("");
        tabelaHash45.imprime();
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        tabelaHash45.insere("", (java.lang.Object) tabelaHash50);
        tabelaHash36.insere("", (java.lang.Object) tabelaHash50);
        java.lang.Object obj58 = tabelaHash36.pesquisa("hi!");
        tabelaHash5.insere("", (java.lang.Object) tabelaHash36);
        java.lang.Object obj61 = tabelaHash36.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(obj61);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
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
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1.0d) + "'", obj9, (-1.0d));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0d) + "'", obj30, (-1.0d));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
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
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
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
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash44);
        java.lang.Object obj55 = tabelaHash44.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
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
// flaky:         tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + '4' + "'", obj30, '4');
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + '4' + "'", obj34, '4');
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
        java.lang.Object obj4 = tabelaHash2.pesquisa("");
        tabelaHash2.imprime();
        java.lang.Object obj7 = tabelaHash2.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) ' ');
        tabelaHash9.insere("hi!", (java.lang.Object) '4');
        tabelaHash9.imprime();
        tabelaHash2.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash9.imprime();
        java.lang.Object obj21 = tabelaHash9.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) 1L);
        tabelaHash23.imprime();
        java.lang.Object obj30 = tabelaHash23.pesquisa("");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("");
        tabelaHash32.imprime();
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object obj39 = tabelaHash37.pesquisa("");
        tabelaHash37.imprime();
        java.lang.Object obj42 = tabelaHash37.pesquisa("");
        tabelaHash37.imprime();
        tabelaHash32.insere("hi!", (java.lang.Object) tabelaHash37);
        tabelaHash37.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash37);
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        java.lang.Object obj50 = tabelaHash48.pesquisa("");
        tabelaHash48.imprime();
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        java.lang.Object obj55 = tabelaHash53.pesquisa("");
        tabelaHash53.imprime();
        java.lang.Object obj58 = tabelaHash53.pesquisa("");
        tabelaHash53.imprime();
        tabelaHash48.insere("hi!", (java.lang.Object) tabelaHash53);
        tabelaHash48.retira("hi!");
        java.lang.Object obj64 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.imprime();
        tabelaHash37.insere("", (java.lang.Object) tabelaHash48);
        tabelaHash9.insere("", (java.lang.Object) tabelaHash37);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash37);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + ' ' + "'", obj21, ' ');
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
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
        tabelaHash0.insere("hi!", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass33 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + '4' + "'", obj9, '4');
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '4' + "'", obj13, '4');
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + '4' + "'", obj24, '4');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + '4' + "'", obj28, '4');
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
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
            java.lang.Class<?> wildcardClass35 = obj34.getClass();
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
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
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
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        java.lang.Object obj25 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        java.lang.Object obj28 = tabelaHash21.pesquisa("hi!");
        java.lang.Class<?> wildcardClass29 = tabelaHash21.getClass();
        tabelaHash7.insere("hi!", (java.lang.Object) wildcardClass29);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        java.lang.Object obj36 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        java.lang.Object obj39 = tabelaHash32.pesquisa("");
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash32);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
    }
}
