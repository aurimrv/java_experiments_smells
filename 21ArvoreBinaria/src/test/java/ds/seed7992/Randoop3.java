package ds.seed7992;

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
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1502");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass15 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1503");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
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
        arvoreBinaria0.retira(item18);
        ds.Item item20 = null;
        arvoreBinaria0.retira(item20);
        ds.Item item22 = null;
        arvoreBinaria0.retira(item22);
        ds.Item item24 = null;
        ds.Item item25 = arvoreBinaria0.pesquisa(item24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass26 = item25.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1504");
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
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1505");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        arvoreBinaria0.testa();
        ds.Item item18 = null;
        arvoreBinaria0.retira(item18);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item22 = null;
        arvoreBinaria0.retira(item22);
        ds.Item item24 = null;
        ds.Item item25 = arvoreBinaria0.pesquisa(item24);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass27 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1506");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1507");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1508");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        ds.Item item15 = null;
        arvoreBinaria0.insere(item15);
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1509");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.insere(item12);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = arvoreBinaria0.pesquisa(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1510");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        arvoreBinaria0.testa();
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.insere(item11);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1511");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        ds.Item item17 = null;
        arvoreBinaria0.retira(item17);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1512");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item18 = null;
        ds.Item item19 = arvoreBinaria0.pesquisa(item18);
        java.lang.Class<?> wildcardClass20 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1513");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1514");
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
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        arvoreBinaria0.insere(item16);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1515");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1516");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        arvoreBinaria0.testa();
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
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
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1517");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = item12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1518");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1519");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        ds.Item item17 = arvoreBinaria0.pesquisa(item16);
        ds.Item item18 = null;
        arvoreBinaria0.retira(item18);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1520");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        ds.Item item15 = null;
        arvoreBinaria0.insere(item15);
        org.junit.Assert.assertNull(item5);
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
        arvoreBinaria0.retira(item4);
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1522");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item3 = null;
        arvoreBinaria0.insere(item3);
        java.lang.Class<?> wildcardClass5 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1523");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1524");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        arvoreBinaria0.testa();
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        ds.Item item15 = null;
        arvoreBinaria0.insere(item15);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1525");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1526");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        org.junit.Assert.assertNull(item6);
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
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass17 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(wildcardClass17);
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
        arvoreBinaria0.insere(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = arvoreBinaria0.pesquisa(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1529");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        ds.Item item17 = null;
        arvoreBinaria0.insere(item17);
        java.lang.Class<?> wildcardClass19 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(wildcardClass19);
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
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        arvoreBinaria0.insere(item14);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1531");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        arvoreBinaria0.retira(item16);
        ds.Item item18 = null;
        ds.Item item19 = arvoreBinaria0.pesquisa(item18);
        ds.Item item20 = null;
        arvoreBinaria0.retira(item20);
        arvoreBinaria0.testa();
        ds.Item item23 = null;
        ds.Item item24 = arvoreBinaria0.pesquisa(item23);
        ds.Item item25 = null;
        arvoreBinaria0.retira(item25);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item24);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1532");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item18 = null;
        ds.Item item19 = arvoreBinaria0.pesquisa(item18);
        ds.Item item20 = null;
        ds.Item item21 = arvoreBinaria0.pesquisa(item20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = item21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1533");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1534");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        arvoreBinaria0.retira(item16);
        ds.Item item18 = null;
        arvoreBinaria0.insere(item18);
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = arvoreBinaria0.pesquisa(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1535");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.insere(item11);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass14 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1536");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1537");
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
        arvoreBinaria0.insere(item15);
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1538");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1539");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        ds.Item item16 = null;
        arvoreBinaria0.insere(item16);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1540");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        ds.Item item16 = null;
        ds.Item item17 = arvoreBinaria0.pesquisa(item16);
        ds.Item item18 = null;
        arvoreBinaria0.retira(item18);
        ds.Item item20 = null;
        arvoreBinaria0.retira(item20);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item24 = null;
        ds.Item item25 = arvoreBinaria0.pesquisa(item24);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1541");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        ds.Item item8 = null;
        arvoreBinaria0.insere(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = arvoreBinaria0.pesquisa(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1542");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        arvoreBinaria0.testa();
        ds.Item item17 = null;
        ds.Item item18 = arvoreBinaria0.pesquisa(item17);
        ds.Item item19 = null;
        ds.Item item20 = arvoreBinaria0.pesquisa(item19);
        ds.Item item21 = null;
        ds.Item item22 = arvoreBinaria0.pesquisa(item21);
        ds.Item item23 = null;
        ds.Item item24 = arvoreBinaria0.pesquisa(item23);
        java.lang.Class<?> wildcardClass25 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1543");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
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
        arvoreBinaria0.retira(item18);
        ds.Item item20 = null;
        arvoreBinaria0.retira(item20);
        ds.Item item22 = null;
        arvoreBinaria0.retira(item22);
        ds.Item item24 = null;
        ds.Item item25 = arvoreBinaria0.pesquisa(item24);
        ds.Item item26 = null;
        ds.Item item27 = arvoreBinaria0.pesquisa(item26);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1544");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        ds.Item item15 = null;
        arvoreBinaria0.insere(item15);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1545");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        arvoreBinaria0.retira(item2);
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1546");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        ds.Item item17 = arvoreBinaria0.pesquisa(item16);
        ds.Item item18 = null;
        arvoreBinaria0.retira(item18);
        ds.Item item20 = null;
        arvoreBinaria0.insere(item20);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass23 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1547");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        arvoreBinaria0.testa();
        ds.Item item17 = null;
        ds.Item item18 = arvoreBinaria0.pesquisa(item17);
        ds.Item item19 = null;
        ds.Item item20 = arvoreBinaria0.pesquisa(item19);
        ds.Item item21 = null;
        ds.Item item22 = arvoreBinaria0.pesquisa(item21);
        ds.Item item23 = null;
        arvoreBinaria0.insere(item23);
        arvoreBinaria0.testa();
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item22);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1548");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.insere(item14);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1549");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1550");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
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
        java.lang.Class<?> wildcardClass18 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1551");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        arvoreBinaria0.insere(item14);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1552");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        ds.Item item17 = null;
        arvoreBinaria0.retira(item17);
        ds.Item item19 = null;
        ds.Item item20 = arvoreBinaria0.pesquisa(item19);
        java.lang.Class<?> wildcardClass21 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1553");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        arvoreBinaria0.retira(item2);
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        java.lang.Class<?> wildcardClass12 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1554");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1555");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1556");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        ds.Item item17 = null;
        arvoreBinaria0.insere(item17);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1557");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        arvoreBinaria0.testa();
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1558");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
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
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1559");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        arvoreBinaria0.insere(item8);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1560");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass14 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1561");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        ds.Item item17 = null;
        arvoreBinaria0.insere(item17);
        java.lang.Class<?> wildcardClass19 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1562");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        arvoreBinaria0.testa();
        ds.Item item17 = null;
        arvoreBinaria0.retira(item17);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1563");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        ds.Item item17 = null;
        ds.Item item18 = arvoreBinaria0.pesquisa(item17);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1564");
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
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1565");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        ds.Item item16 = null;
        ds.Item item17 = arvoreBinaria0.pesquisa(item16);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1566");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1567");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1568");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        arvoreBinaria0.testa();
        ds.Item item18 = null;
        ds.Item item19 = arvoreBinaria0.pesquisa(item18);
        ds.Item item20 = null;
        arvoreBinaria0.retira(item20);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1569");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        java.lang.Class<?> wildcardClass15 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1570");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        arvoreBinaria0.insere(item14);
        java.lang.Class<?> wildcardClass16 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1571");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        ds.Item item17 = null;
        ds.Item item18 = arvoreBinaria0.pesquisa(item17);
        ds.Item item19 = null;
        ds.Item item20 = arvoreBinaria0.pesquisa(item19);
        arvoreBinaria0.testa();
        ds.Item item22 = null;
        arvoreBinaria0.retira(item22);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1572");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        ds.Item item17 = null;
        arvoreBinaria0.insere(item17);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1573");
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
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        arvoreBinaria0.testa();
        ds.Item item18 = null;
        ds.Item item19 = arvoreBinaria0.pesquisa(item18);
        ds.Item item20 = null;
        arvoreBinaria0.retira(item20);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1574");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1575");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        arvoreBinaria0.insere(item12);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = arvoreBinaria0.pesquisa(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1576");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item19 = null;
        ds.Item item20 = arvoreBinaria0.pesquisa(item19);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1577");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        arvoreBinaria0.testa();
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        java.lang.Class<?> wildcardClass14 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1578");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        ds.Item item17 = arvoreBinaria0.pesquisa(item16);
        arvoreBinaria0.testa();
        ds.Item item19 = null;
        arvoreBinaria0.insere(item19);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1579");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        arvoreBinaria0.testa();
        ds.Item item17 = null;
        ds.Item item18 = arvoreBinaria0.pesquisa(item17);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass20 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1580");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1581");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        java.lang.Class<?> wildcardClass14 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1582");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        arvoreBinaria0.testa();
        ds.Item item17 = null;
        arvoreBinaria0.retira(item17);
        arvoreBinaria0.testa();
        ds.Item item20 = null;
        ds.Item item21 = arvoreBinaria0.pesquisa(item20);
        ds.Item item22 = null;
        ds.Item item23 = arvoreBinaria0.pesquisa(item22);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1583");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        arvoreBinaria0.testa();
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1584");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        arvoreBinaria0.insere(item14);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = arvoreBinaria0.pesquisa(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1585");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        arvoreBinaria0.testa();
        ds.Item item18 = null;
        arvoreBinaria0.retira(item18);
        ds.Item item20 = null;
        ds.Item item21 = arvoreBinaria0.pesquisa(item20);
        ds.Item item22 = null;
        arvoreBinaria0.retira(item22);
        ds.Item item24 = null;
        arvoreBinaria0.insere(item24);
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1586");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        java.lang.Class<?> wildcardClass11 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1587");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        ds.Item item16 = null;
        ds.Item item17 = arvoreBinaria0.pesquisa(item16);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1588");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        arvoreBinaria0.retira(item2);
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        arvoreBinaria0.insere(item12);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1589");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1590");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        arvoreBinaria0.testa();
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1591");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        ds.Item item17 = null;
        arvoreBinaria0.insere(item17);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1592");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        java.lang.Class<?> wildcardClass16 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1593");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        arvoreBinaria0.testa();
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1594");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1595");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        ds.Item item17 = null;
        arvoreBinaria0.retira(item17);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1596");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
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
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1597");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        arvoreBinaria0.testa();
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass9 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1598");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        arvoreBinaria0.retira(item2);
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1599");
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
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        arvoreBinaria0.insere(item14);
        arvoreBinaria0.testa();
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1600");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1601");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        arvoreBinaria0.testa();
        ds.Item item17 = null;
        arvoreBinaria0.insere(item17);
        arvoreBinaria0.testa();
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = arvoreBinaria0.pesquisa(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1602");
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
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        arvoreBinaria0.insere(item15);
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = arvoreBinaria0.pesquisa(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1603");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        ds.Item item15 = arvoreBinaria0.pesquisa(item14);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1604");
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
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        ds.Item item17 = null;
        arvoreBinaria0.retira(item17);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1605");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.insere(item11);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1606");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = item16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1607");
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
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        java.lang.Class<?> wildcardClass13 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1608");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        arvoreBinaria0.testa();
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1609");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        java.lang.Class<?> wildcardClass14 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1610");
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
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass16 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1611");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        arvoreBinaria0.retira(item2);
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        arvoreBinaria0.insere(item8);
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.retira(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1612");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        arvoreBinaria0.testa();
        ds.Item item18 = null;
        ds.Item item19 = arvoreBinaria0.pesquisa(item18);
        ds.Item item20 = null;
        arvoreBinaria0.retira(item20);
        arvoreBinaria0.testa();
        ds.Item item23 = null;
        ds.Item item24 = arvoreBinaria0.pesquisa(item23);
        ds.Item item25 = null;
        arvoreBinaria0.retira(item25);
        ds.Item item27 = null;
        ds.Item item28 = arvoreBinaria0.pesquisa(item27);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item28);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1613");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        arvoreBinaria0.insere(item8);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1614");
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
        arvoreBinaria0.retira(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item17 = null;
        arvoreBinaria0.retira(item17);
        ds.Item item19 = null;
        ds.Item item20 = arvoreBinaria0.pesquisa(item19);
        ds.Item item21 = null;
        ds.Item item22 = arvoreBinaria0.pesquisa(item21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = item22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item22);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1615");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        ds.Item item17 = null;
        arvoreBinaria0.retira(item17);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1616");
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
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        arvoreBinaria0.insere(item14);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass17 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1617");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        arvoreBinaria0.retira(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1618");
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
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1619");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        arvoreBinaria0.testa();
        ds.Item item17 = null;
        ds.Item item18 = arvoreBinaria0.pesquisa(item17);
        ds.Item item19 = null;
        ds.Item item20 = arvoreBinaria0.pesquisa(item19);
        ds.Item item21 = null;
        ds.Item item22 = arvoreBinaria0.pesquisa(item21);
        ds.Item item23 = null;
        arvoreBinaria0.retira(item23);
        ds.Item item25 = null;
        arvoreBinaria0.insere(item25);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item29 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item30 = arvoreBinaria0.pesquisa(item29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item22);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1620");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        arvoreBinaria0.insere(item8);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1621");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        arvoreBinaria0.testa();
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        ds.Item item17 = null;
        arvoreBinaria0.retira(item17);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1622");
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
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        java.lang.Class<?> wildcardClass17 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1623");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        java.lang.Class<?> wildcardClass13 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1624");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        ds.Item item17 = arvoreBinaria0.pesquisa(item16);
        ds.Item item18 = null;
        ds.Item item19 = arvoreBinaria0.pesquisa(item18);
        ds.Item item20 = null;
        arvoreBinaria0.insere(item20);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1625");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        arvoreBinaria0.testa();
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.insere(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1626");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        java.lang.Class<?> wildcardClass14 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1627");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        ds.Item item17 = null;
        ds.Item item18 = arvoreBinaria0.pesquisa(item17);
        ds.Item item19 = null;
        ds.Item item20 = arvoreBinaria0.pesquisa(item19);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1628");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1629");
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
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        ds.Item item17 = null;
        ds.Item item18 = arvoreBinaria0.pesquisa(item17);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1630");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        arvoreBinaria0.testa();
        ds.Item item17 = null;
        ds.Item item18 = arvoreBinaria0.pesquisa(item17);
        ds.Item item19 = null;
        ds.Item item20 = arvoreBinaria0.pesquisa(item19);
        ds.Item item21 = null;
        ds.Item item22 = arvoreBinaria0.pesquisa(item21);
        ds.Item item23 = null;
        arvoreBinaria0.retira(item23);
        arvoreBinaria0.testa();
        ds.Item item26 = null;
        arvoreBinaria0.insere(item26);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item22);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1631");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
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
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1632");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        arvoreBinaria0.insere(item16);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1633");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        ds.Item item4 = null;
        arvoreBinaria0.retira(item4);
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = item16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1634");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        arvoreBinaria0.retira(item1);
        arvoreBinaria0.testa();
        ds.Item item4 = null;
        ds.Item item5 = arvoreBinaria0.pesquisa(item4);
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1635");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        ds.Item item17 = null;
        ds.Item item18 = arvoreBinaria0.pesquisa(item17);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1636");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        arvoreBinaria0.testa();
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        arvoreBinaria0.retira(item13);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1637");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1638");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        arvoreBinaria0.insere(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = arvoreBinaria0.pesquisa(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1639");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        ds.Item item15 = null;
        ds.Item item16 = arvoreBinaria0.pesquisa(item15);
        ds.Item item17 = null;
        ds.Item item18 = arvoreBinaria0.pesquisa(item17);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1640");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1641");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1642");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        arvoreBinaria0.retira(item2);
        arvoreBinaria0.testa();
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        ds.Item item7 = null;
        arvoreBinaria0.insere(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1643");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        arvoreBinaria0.retira(item16);
        ds.Item item18 = null;
        ds.Item item19 = arvoreBinaria0.pesquisa(item18);
        ds.Item item20 = null;
        arvoreBinaria0.retira(item20);
        ds.Item item22 = null;
        arvoreBinaria0.insere(item22);
        arvoreBinaria0.testa();
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            arvoreBinaria0.insere(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1644");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        ds.Item item11 = null;
        arvoreBinaria0.retira(item11);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1645");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
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
        arvoreBinaria0.retira(item18);
        ds.Item item20 = null;
        arvoreBinaria0.retira(item20);
        ds.Item item22 = null;
        arvoreBinaria0.retira(item22);
        ds.Item item24 = null;
        arvoreBinaria0.retira(item24);
        ds.Item item26 = null;
        arvoreBinaria0.insere(item26);
        ds.Item item28 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item29 = arvoreBinaria0.pesquisa(item28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1646");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        ds.Item item6 = arvoreBinaria0.pesquisa(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        ds.Item item9 = null;
        arvoreBinaria0.retira(item9);
        arvoreBinaria0.testa();
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1647");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        arvoreBinaria0.testa();
        ds.Item item5 = null;
        arvoreBinaria0.insere(item5);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1648");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        arvoreBinaria0.testa();
        ds.Item item16 = null;
        arvoreBinaria0.retira(item16);
        ds.Item item18 = null;
        arvoreBinaria0.retira(item18);
        arvoreBinaria0.testa();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1649");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        ds.Item item8 = arvoreBinaria0.pesquisa(item7);
        ds.Item item9 = null;
        ds.Item item10 = arvoreBinaria0.pesquisa(item9);
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        ds.Item item13 = null;
        ds.Item item14 = arvoreBinaria0.pesquisa(item13);
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        arvoreBinaria0.testa();
        ds.Item item18 = null;
        ds.Item item19 = arvoreBinaria0.pesquisa(item18);
        arvoreBinaria0.testa();
        ds.Item item21 = null;
        arvoreBinaria0.retira(item21);
        ds.Item item23 = null;
        arvoreBinaria0.retira(item23);
        java.lang.Class<?> wildcardClass25 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1650");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        ds.Item item12 = null;
        ds.Item item13 = arvoreBinaria0.pesquisa(item12);
        arvoreBinaria0.testa();
        ds.Item item15 = null;
        arvoreBinaria0.retira(item15);
        ds.Item item17 = null;
        arvoreBinaria0.insere(item17);
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item20 = arvoreBinaria0.pesquisa(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1651");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        arvoreBinaria0.testa();
        ds.Item item2 = null;
        ds.Item item3 = arvoreBinaria0.pesquisa(item2);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1652");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        ds.Item item4 = arvoreBinaria0.pesquisa(item3);
        arvoreBinaria0.testa();
        ds.Item item6 = null;
        ds.Item item7 = arvoreBinaria0.pesquisa(item6);
        ds.Item item8 = null;
        arvoreBinaria0.retira(item8);
        ds.Item item10 = null;
        arvoreBinaria0.retira(item10);
        arvoreBinaria0.testa();
        ds.Item item13 = null;
        arvoreBinaria0.insere(item13);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1653");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        arvoreBinaria0.testa();
        ds.Item item8 = null;
        ds.Item item9 = arvoreBinaria0.pesquisa(item8);
        ds.Item item10 = null;
        ds.Item item11 = arvoreBinaria0.pesquisa(item10);
        ds.Item item12 = null;
        arvoreBinaria0.retira(item12);
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        arvoreBinaria0.testa();
        java.lang.Class<?> wildcardClass17 = arvoreBinaria0.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1654");
        ds.ArvoreBinaria arvoreBinaria0 = new ds.ArvoreBinaria();
        ds.Item item1 = null;
        ds.Item item2 = arvoreBinaria0.pesquisa(item1);
        ds.Item item3 = null;
        arvoreBinaria0.retira(item3);
        ds.Item item5 = null;
        arvoreBinaria0.retira(item5);
        ds.Item item7 = null;
        arvoreBinaria0.retira(item7);
        arvoreBinaria0.testa();
        arvoreBinaria0.testa();
        ds.Item item11 = null;
        ds.Item item12 = arvoreBinaria0.pesquisa(item11);
        arvoreBinaria0.testa();
        ds.Item item14 = null;
        arvoreBinaria0.retira(item14);
        ds.Item item16 = null;
        arvoreBinaria0.retira(item16);
        arvoreBinaria0.testa();
        ds.Item item19 = null;
        ds.Item item20 = arvoreBinaria0.pesquisa(item19);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item20);
    }
}

