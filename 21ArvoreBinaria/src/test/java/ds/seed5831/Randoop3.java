package ds.seed5831;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1501");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.insere(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1502");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1503");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        arvoreBinaria0.testa();
        ds.Item item16 = null;
        ds.Item item17 = arvoreBinaria0.pesquisa(item16);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1504");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.insere(item5);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1505");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        java.lang.Class<?> wildcardClass15 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1506");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1507");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        arvoreBinaria0.insere(item16);
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1508");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        arvoreBinaria0.retira(item2);
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1509");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        ds.Item item17 = arvoreBinaria0.pesquisa(item16);
        arvoreBinaria0.testa();
        ds.Item item19 = null;
        arvoreBinaria0.retira(item19);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1510");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        arvoreBinaria0.testa();
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.insere(item12);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1511");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1512");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        java.lang.Class<?> wildcardClass16 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1513");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1514");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        ds.Item item17 = null;
        ds.Item item18 = arvoreBinaria0.pesquisa(item17);
        ds.Item item19 = null;
        ds.Item item20 = arvoreBinaria0.pesquisa(item19);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1515");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        arvoreBinaria0.retira(item2);
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        arvoreBinaria0.testa();
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1516");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        arvoreBinaria0.retira(item2);
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        ds.Item item17 = arvoreBinaria0.pesquisa(item16);
        ds.Item item18 = null;
        arvoreBinaria0.insere(item18);
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1517");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        arvoreBinaria0.retira(item2);
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.insere(item12);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1518");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        ds.Item item17 = null;
        arvoreBinaria0.retira(item17);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1519");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        arvoreBinaria0.testa();
        ds.Item item17 = null;
        ds.Item item18 = arvoreBinaria0.pesquisa(item17);
        ds.Item item19 = null;
        arvoreBinaria0.retira(item19);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1520");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.insere(item10);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1521");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.insere(item12);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1522");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        arvoreBinaria0.retira(item2);
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.insere(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1523");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        arvoreBinaria0.retira(item2);
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        arvoreBinaria0.testa();
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        java.lang.Class<?> wildcardClass17 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1524");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass13 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1525");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        ds.Item item16 = null;
        ds.Item item17 = arvoreBinaria0.pesquisa(item16);
        ds.Item item18 = null;
        ds.Item item19 = arvoreBinaria0.pesquisa(item18);
        ds.Item item20 = null;
        ds.Item item21 = arvoreBinaria0.pesquisa(item20);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1526");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        arvoreBinaria0.insere(item14);
        arvoreBinaria0.testa();
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1527");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1528");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        arvoreBinaria0.retira(item2);
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        ds.Item item17 = null;
        ds.Item item18 = arvoreBinaria0.pesquisa(item17);
        arvoreBinaria0.testa();
        ds.Item item20 = null;
        arvoreBinaria0.insere(item20);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1529");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1530");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        ds.Item item16 = null;
        ds.Item item17 = arvoreBinaria0.pesquisa(item16);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1531");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        arvoreBinaria0.retira(item2);
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        ds.Item item16 = null;
        ds.Item item17 = arvoreBinaria0.pesquisa(item16);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1532");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        arvoreBinaria0.retira(item2);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1533");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1534");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        arvoreBinaria0.insere(item16);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1535");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        arvoreBinaria0.insere(item15);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1536");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        arvoreBinaria0.testa();
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass15 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1537");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        arvoreBinaria0.retira(item2);
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        arvoreBinaria0.testa();
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1538");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        arvoreBinaria0.testa();
        ds.Item item17 = null;
        ds.Item item18 = arvoreBinaria0.pesquisa(item17);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1539");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        arvoreBinaria0.retira(item2);
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = arvoreBinaria0.pesquisa(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1540");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        ds.Item item17 = null;
        arvoreBinaria0.insere(item17);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1541");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1542");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item14);
    }
}

