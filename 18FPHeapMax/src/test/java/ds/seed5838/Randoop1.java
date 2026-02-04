package ds.seed5838;

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
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) ' ', (int) ' ');
        ds.Item item7 = fPHeapMax1.max();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = fPHeapMax4.max();
        ds.Item item6 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray11);
        fPHeapMax4.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item15 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = item15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(0, (-1));
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = fPHeapMax11.max();
        ds.Item item13 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax15.imprime();
        fPHeapMax15.constroi();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray18);
        fPHeapMax11.copia(itemArray18);
        fPHeapMax9.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) '#');
        fPHeapMax24.imprime();
        fPHeapMax24.imprime();
        ds.Item item27 = fPHeapMax24.max();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item34 = fPHeapMax33.max();
        ds.Item item35 = fPHeapMax33.max();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax37.imprime();
        fPHeapMax37.constroi();
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax37.copia(itemArray40);
        fPHeapMax33.copia(itemArray40);
        fPHeapMax31.copia(itemArray40);
        fPHeapMax29.copia(itemArray40);
        fPHeapMax24.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) '#');
        fPHeapMax50.imprime();
        fPHeapMax50.imprime();
        ds.Item item53 = fPHeapMax50.max();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item56 = fPHeapMax55.max();
        ds.Item item57 = fPHeapMax55.max();
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax59.imprime();
        fPHeapMax59.constroi();
        ds.Item[] itemArray62 = new ds.Item[] {};
        fPHeapMax59.copia(itemArray62);
        fPHeapMax55.copia(itemArray62);
        fPHeapMax50.copia(itemArray62);
        fPHeapMax48.copia(itemArray62);
        fPHeapMax1.copia(itemArray62);
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax69.refaz((int) (short) 10, (int) (short) 10);
        ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item77 = fPHeapMax76.max();
        ds.Item item78 = fPHeapMax76.max();
        ds.FPHeapMax fPHeapMax80 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax80.imprime();
        fPHeapMax80.constroi();
        ds.Item[] itemArray83 = new ds.Item[] {};
        fPHeapMax80.copia(itemArray83);
        fPHeapMax76.copia(itemArray83);
        fPHeapMax74.copia(itemArray83);
        fPHeapMax69.copia(itemArray83);
        fPHeapMax1.copia(itemArray83);
        ds.Item item89 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNull(item56);
        org.junit.Assert.assertNull(item57);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNull(item77);
        org.junit.Assert.assertNull(item78);
        org.junit.Assert.assertNotNull(itemArray83);
        org.junit.Assert.assertNull(item89);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        fPHeapMax3.imprime();
        ds.Item item6 = fPHeapMax3.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = fPHeapMax8.max();
        ds.Item item10 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray15);
        fPHeapMax8.copia(itemArray15);
        fPHeapMax3.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item22 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.imprime();
        fPHeapMax4.refaz(100, (int) (short) 0);
        fPHeapMax4.constroi();
        ds.Item item10 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) '#');
        fPHeapMax12.imprime();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax24.imprime();
        fPHeapMax24.constroi();
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray27);
        fPHeapMax16.copia(itemArray27);
        fPHeapMax12.copia(itemArray27);
        fPHeapMax4.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        fPHeapMax3.imprime();
        ds.Item item6 = fPHeapMax3.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = fPHeapMax8.max();
        ds.Item item10 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray15);
        fPHeapMax8.copia(itemArray15);
        fPHeapMax3.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        fPHeapMax5.imprime();
        fPHeapMax5.imprime();
        ds.Item item8 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = fPHeapMax10.max();
        ds.Item item12 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.imprime();
        fPHeapMax14.constroi();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax10.copia(itemArray17);
        fPHeapMax5.copia(itemArray17);
        fPHeapMax3.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        java.lang.Class<?> wildcardClass23 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = fPHeapMax15.max();
        ds.Item item17 = fPHeapMax15.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray22);
        fPHeapMax15.copia(itemArray22);
        fPHeapMax13.copia(itemArray22);
        fPHeapMax11.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        java.lang.Class<?> wildcardClass28 = itemArray22.getClass();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray16);
        fPHeapMax5.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.imprime();
        ds.Item item21 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item22 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        fPHeapMax5.imprime();
        fPHeapMax5.imprime();
        ds.Item item8 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = fPHeapMax16.max();
        ds.Item item18 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax20.imprime();
        fPHeapMax20.constroi();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray23);
        fPHeapMax16.copia(itemArray23);
        fPHeapMax14.copia(itemArray23);
        fPHeapMax12.copia(itemArray23);
        fPHeapMax10.copia(itemArray23);
        fPHeapMax5.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray16);
        fPHeapMax5.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.imprime();
        ds.Item item21 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax24.imprime();
        fPHeapMax24.constroi();
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray27);
        fPHeapMax24.constroi();
        fPHeapMax24.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax32.imprime();
        fPHeapMax32.constroi();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray35);
        fPHeapMax32.constroi();
        fPHeapMax32.imprime();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = fPHeapMax44.max();
        ds.Item item46 = fPHeapMax44.max();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax48.imprime();
        fPHeapMax48.constroi();
        ds.Item[] itemArray51 = new ds.Item[] {};
        fPHeapMax48.copia(itemArray51);
        fPHeapMax44.copia(itemArray51);
        fPHeapMax42.copia(itemArray51);
        fPHeapMax40.copia(itemArray51);
        fPHeapMax32.copia(itemArray51);
        fPHeapMax24.copia(itemArray51);
        fPHeapMax24.constroi();
        fPHeapMax24.imprime();
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        fPHeapMax61.copia(itemArray63);
        fPHeapMax61.refaz((int) (byte) 1, 1);
        fPHeapMax61.imprime();
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        fPHeapMax70.copia(itemArray72);
        fPHeapMax70.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax78 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax80 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item81 = fPHeapMax80.max();
        ds.Item item82 = fPHeapMax80.max();
        ds.FPHeapMax fPHeapMax84 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax84.imprime();
        fPHeapMax84.constroi();
        ds.Item[] itemArray87 = new ds.Item[] {};
        fPHeapMax84.copia(itemArray87);
        fPHeapMax80.copia(itemArray87);
        fPHeapMax78.copia(itemArray87);
        fPHeapMax70.copia(itemArray87);
        fPHeapMax61.copia(itemArray87);
        fPHeapMax24.copia(itemArray87);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) itemArray87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNull(item81);
        org.junit.Assert.assertNull(item82);
        org.junit.Assert.assertNotNull(itemArray87);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray12);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = fPHeapMax21.max();
        ds.Item item23 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray28);
        fPHeapMax21.copia(itemArray28);
        fPHeapMax19.copia(itemArray28);
        fPHeapMax17.copia(itemArray28);
        fPHeapMax9.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax38.imprime();
        fPHeapMax38.constroi();
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMax38.copia(itemArray41);
        fPHeapMax1.copia(itemArray41);
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item50 = fPHeapMax49.max();
        ds.Item item51 = fPHeapMax49.max();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax53.imprime();
        fPHeapMax53.constroi();
        ds.Item[] itemArray56 = new ds.Item[] {};
        fPHeapMax53.copia(itemArray56);
        fPHeapMax49.copia(itemArray56);
        fPHeapMax47.copia(itemArray56);
        fPHeapMax45.copia(itemArray56);
        fPHeapMax1.copia(itemArray56);
        java.lang.Class<?> wildcardClass62 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        fPHeapMax8.imprime();
        ds.Item item11 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = fPHeapMax13.max();
        ds.Item item15 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax17.imprime();
        fPHeapMax17.constroi();
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray20);
        fPHeapMax13.copia(itemArray20);
        fPHeapMax8.copia(itemArray20);
        fPHeapMax6.copia(itemArray20);
        fPHeapMax4.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) ' ', (int) ' ');
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax8.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.Item item18 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item20 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = fPHeapMax12.max();
        ds.Item item14 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray19);
        fPHeapMax12.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax8.copia(itemArray19);
        fPHeapMax6.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray12);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = fPHeapMax21.max();
        ds.Item item23 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray28);
        fPHeapMax21.copia(itemArray28);
        fPHeapMax19.copia(itemArray28);
        fPHeapMax17.copia(itemArray28);
        fPHeapMax9.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax38.imprime();
        fPHeapMax38.constroi();
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMax38.copia(itemArray41);
        fPHeapMax1.copia(itemArray41);
        ds.Item item44 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        fPHeapMax15.imprime();
        fPHeapMax15.imprime();
        ds.Item item18 = fPHeapMax15.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = fPHeapMax24.max();
        ds.Item item26 = fPHeapMax24.max();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax28.imprime();
        fPHeapMax28.constroi();
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMax28.copia(itemArray31);
        fPHeapMax24.copia(itemArray31);
        fPHeapMax22.copia(itemArray31);
        fPHeapMax20.copia(itemArray31);
        fPHeapMax15.copia(itemArray31);
        fPHeapMax13.copia(itemArray31);
        fPHeapMax9.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item40 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (short) 1, (-1));
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray8);
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray16);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = fPHeapMax25.max();
        ds.Item item27 = fPHeapMax25.max();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax29.imprime();
        fPHeapMax29.constroi();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax29.copia(itemArray32);
        fPHeapMax25.copia(itemArray32);
        fPHeapMax23.copia(itemArray32);
        fPHeapMax21.copia(itemArray32);
        fPHeapMax13.copia(itemArray32);
        fPHeapMax5.copia(itemArray32);
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax42.refaz((int) (byte) 1, 1);
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        fPHeapMax51.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item62 = fPHeapMax61.max();
        ds.Item item63 = fPHeapMax61.max();
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax65.imprime();
        fPHeapMax65.constroi();
        ds.Item[] itemArray68 = new ds.Item[] {};
        fPHeapMax65.copia(itemArray68);
        fPHeapMax61.copia(itemArray68);
        fPHeapMax59.copia(itemArray68);
        fPHeapMax51.copia(itemArray68);
        fPHeapMax42.copia(itemArray68);
        fPHeapMax5.copia(itemArray68);
        fPHeapMax1.copia(itemArray68);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNull(item62);
        org.junit.Assert.assertNull(item63);
        org.junit.Assert.assertNotNull(itemArray68);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.refaz(100, (int) (short) 0);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax19.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = fPHeapMax28.max();
        fPHeapMax28.constroi();
        ds.Item item31 = fPHeapMax28.max();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax33.imprime();
        ds.Item item35 = fPHeapMax33.max();
        fPHeapMax33.refaz((int) ' ', (int) ' ');
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item41 = fPHeapMax40.max();
        fPHeapMax40.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax40.copia(itemArray46);
        fPHeapMax33.copia(itemArray46);
        fPHeapMax28.copia(itemArray46);
        fPHeapMax19.copia(itemArray46);
        fPHeapMax1.copia(itemArray46);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax56.refaz((int) (short) 10, (int) (short) 10);
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item64 = fPHeapMax63.max();
        ds.Item item65 = fPHeapMax63.max();
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax67.imprime();
        fPHeapMax67.constroi();
        ds.Item[] itemArray70 = new ds.Item[] {};
        fPHeapMax67.copia(itemArray70);
        fPHeapMax63.copia(itemArray70);
        fPHeapMax61.copia(itemArray70);
        fPHeapMax56.copia(itemArray70);
        java.lang.Class<?> wildcardClass75 = itemArray70.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) wildcardClass75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNull(item64);
        org.junit.Assert.assertNull(item65);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        fPHeapMax5.imprime();
        fPHeapMax5.imprime();
        ds.Item item8 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = fPHeapMax10.max();
        ds.Item item12 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.imprime();
        fPHeapMax14.constroi();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax10.copia(itemArray17);
        fPHeapMax5.copia(itemArray17);
        fPHeapMax3.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.Item item23 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item24 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = fPHeapMax5.max();
        ds.Item item7 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray12);
        fPHeapMax5.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, (int) (short) 0);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, (int) '#');
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) ' ', (int) ' ');
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '#');
        fPHeapMax11.imprime();
        fPHeapMax11.imprime();
        ds.Item item14 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = fPHeapMax16.max();
        ds.Item item18 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax20.imprime();
        fPHeapMax20.constroi();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray23);
        fPHeapMax16.copia(itemArray23);
        fPHeapMax11.copia(itemArray23);
        fPHeapMax9.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        java.lang.Class<?> wildcardClass29 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) '#', 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 10);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = fPHeapMax8.max();
        ds.Item item10 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray15);
        fPHeapMax8.copia(itemArray15);
        fPHeapMax6.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax21.imprime();
        ds.Item item23 = fPHeapMax21.max();
        fPHeapMax21.refaz((int) ' ', (int) ' ');
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = fPHeapMax28.max();
        fPHeapMax28.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax28.copia(itemArray34);
        fPHeapMax21.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        fPHeapMax1.refaz(1, (int) (short) 1);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item8 = fPHeapMax1.max();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass5 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item4 = fPHeapMax3.max();
        ds.Item item5 = fPHeapMax3.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.imprime();
        fPHeapMax7.constroi();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray10);
        fPHeapMax3.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass9 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray16);
        fPHeapMax5.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.refaz(10, (int) (short) -1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax24.imprime();
        fPHeapMax24.refaz(100, (int) (short) 0);
        fPHeapMax24.constroi();
        fPHeapMax24.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax32.imprime();
        fPHeapMax32.constroi();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray35);
        fPHeapMax32.constroi();
        fPHeapMax32.imprime();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = fPHeapMax44.max();
        ds.Item item46 = fPHeapMax44.max();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax48.imprime();
        fPHeapMax48.constroi();
        ds.Item[] itemArray51 = new ds.Item[] {};
        fPHeapMax48.copia(itemArray51);
        fPHeapMax44.copia(itemArray51);
        fPHeapMax42.copia(itemArray51);
        fPHeapMax40.copia(itemArray51);
        fPHeapMax32.copia(itemArray51);
        fPHeapMax24.copia(itemArray51);
        fPHeapMax1.copia(itemArray51);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item61 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        fPHeapMax5.imprime();
        fPHeapMax5.imprime();
        ds.Item item8 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = fPHeapMax10.max();
        ds.Item item12 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.imprime();
        fPHeapMax14.constroi();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax10.copia(itemArray17);
        fPHeapMax5.copia(itemArray17);
        fPHeapMax3.copia(itemArray17);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '#');
        fPHeapMax23.imprime();
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax27.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax35.imprime();
        fPHeapMax35.constroi();
        ds.Item[] itemArray38 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray38);
        fPHeapMax27.copia(itemArray38);
        fPHeapMax23.copia(itemArray38);
        fPHeapMax3.copia(itemArray38);
        fPHeapMax1.copia(itemArray38);
        ds.Item item44 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.imprime();
        fPHeapMax4.refaz(100, (int) (short) 0);
        fPHeapMax4.constroi();
        ds.Item item10 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) '#');
        fPHeapMax12.imprime();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax24.imprime();
        fPHeapMax24.constroi();
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray27);
        fPHeapMax16.copia(itemArray27);
        fPHeapMax12.copia(itemArray27);
        fPHeapMax4.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax34.imprime();
        fPHeapMax34.constroi();
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax34.copia(itemArray37);
        fPHeapMax34.constroi();
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = fPHeapMax42.max();
        ds.Item item44 = fPHeapMax42.max();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax46.imprime();
        fPHeapMax46.constroi();
        ds.Item[] itemArray49 = new ds.Item[] {};
        fPHeapMax46.copia(itemArray49);
        fPHeapMax42.copia(itemArray49);
        fPHeapMax34.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.constroi();
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax6.imprime();
        ds.Item item8 = fPHeapMax6.max();
        fPHeapMax6.refaz((int) ' ', (int) ' ');
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax13.copia(itemArray19);
        fPHeapMax6.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = fPHeapMax13.max();
        ds.Item item15 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax17.imprime();
        fPHeapMax17.constroi();
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray20);
        fPHeapMax13.copia(itemArray20);
        fPHeapMax11.copia(itemArray20);
        fPHeapMax9.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) '#');
        fPHeapMax32.imprime();
        fPHeapMax32.imprime();
        ds.Item item35 = fPHeapMax32.max();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item38 = fPHeapMax37.max();
        ds.Item item39 = fPHeapMax37.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax41.imprime();
        fPHeapMax41.constroi();
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray44);
        fPHeapMax37.copia(itemArray44);
        fPHeapMax32.copia(itemArray44);
        fPHeapMax30.copia(itemArray44);
        fPHeapMax28.copia(itemArray44);
        fPHeapMax1.copia(itemArray44);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item51 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) '#');
        fPHeapMax13.imprime();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray28);
        fPHeapMax17.copia(itemArray28);
        fPHeapMax13.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        fPHeapMax3.imprime();
        ds.Item item6 = fPHeapMax3.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = fPHeapMax8.max();
        ds.Item item10 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray15);
        fPHeapMax8.copia(itemArray15);
        fPHeapMax3.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.imprime();
        fPHeapMax9.refaz(100, (int) (short) 0);
        fPHeapMax9.imprime();
        java.lang.Class<?> wildcardClass15 = fPHeapMax9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray16);
        fPHeapMax5.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.refaz(10, (int) (short) -1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax24.imprime();
        fPHeapMax24.refaz(100, (int) (short) 0);
        fPHeapMax24.constroi();
        fPHeapMax24.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax32.imprime();
        fPHeapMax32.constroi();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray35);
        fPHeapMax32.constroi();
        fPHeapMax32.imprime();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = fPHeapMax44.max();
        ds.Item item46 = fPHeapMax44.max();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax48.imprime();
        fPHeapMax48.constroi();
        ds.Item[] itemArray51 = new ds.Item[] {};
        fPHeapMax48.copia(itemArray51);
        fPHeapMax44.copia(itemArray51);
        fPHeapMax42.copia(itemArray51);
        fPHeapMax40.copia(itemArray51);
        fPHeapMax32.copia(itemArray51);
        fPHeapMax24.copia(itemArray51);
        fPHeapMax1.copia(itemArray51);
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax60.imprime();
        fPHeapMax60.constroi();
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item65 = fPHeapMax64.max();
        fPHeapMax64.imprime();
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item69 = null;
        ds.Item[] itemArray70 = new ds.Item[] { item69 };
        fPHeapMax68.copia(itemArray70);
        fPHeapMax64.copia(itemArray70);
        fPHeapMax60.copia(itemArray70);
        fPHeapMax1.copia(itemArray70);
        java.lang.Class<?> wildcardClass75 = itemArray70.getClass();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNull(item65);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax7.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax15.imprime();
        fPHeapMax15.constroi();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray18);
        fPHeapMax7.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        ds.Item[] itemArray22 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 10);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = fPHeapMax8.max();
        ds.Item item10 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray15);
        fPHeapMax8.copia(itemArray15);
        fPHeapMax6.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax21.imprime();
        ds.Item item23 = fPHeapMax21.max();
        fPHeapMax21.refaz((int) ' ', (int) ' ');
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = fPHeapMax28.max();
        fPHeapMax28.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax28.copia(itemArray34);
        fPHeapMax21.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        fPHeapMax1.refaz(1, (int) (short) 1);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = fPHeapMax6.max();
        ds.Item item8 = fPHeapMax6.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray13);
        fPHeapMax6.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = fPHeapMax5.max();
        ds.Item item7 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray12);
        fPHeapMax5.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.imprime();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.refaz((int) (byte) 1, 1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = fPHeapMax20.max();
        ds.Item item22 = fPHeapMax20.max();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax24.imprime();
        fPHeapMax24.constroi();
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray27);
        fPHeapMax20.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax10.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        java.lang.Class<?> wildcardClass33 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item4 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass11 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = fPHeapMax4.max();
        ds.Item item6 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray11);
        fPHeapMax4.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        ds.Item item14 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax24.imprime();
        fPHeapMax24.constroi();
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray27);
        fPHeapMax16.copia(itemArray27);
        fPHeapMax10.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.imprime();
        fPHeapMax8.refaz(100, (int) (short) 0);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray19);
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = fPHeapMax28.max();
        ds.Item item30 = fPHeapMax28.max();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax32.imprime();
        fPHeapMax32.constroi();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray35);
        fPHeapMax28.copia(itemArray35);
        fPHeapMax26.copia(itemArray35);
        fPHeapMax24.copia(itemArray35);
        fPHeapMax16.copia(itemArray35);
        fPHeapMax8.copia(itemArray35);
        fPHeapMax5.copia(itemArray35);
        fPHeapMax1.copia(itemArray35);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax6.imprime();
        ds.Item item8 = fPHeapMax6.max();
        fPHeapMax6.refaz((int) ' ', (int) ' ');
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax13.copia(itemArray19);
        fPHeapMax6.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) -1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(1);
        fPHeapMax29.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) '#');
        fPHeapMax36.imprime();
        fPHeapMax36.imprime();
        ds.Item item39 = fPHeapMax36.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = fPHeapMax41.max();
        ds.Item item43 = fPHeapMax41.max();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax45.imprime();
        fPHeapMax45.constroi();
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMax45.copia(itemArray48);
        fPHeapMax41.copia(itemArray48);
        fPHeapMax36.copia(itemArray48);
        fPHeapMax34.copia(itemArray48);
        fPHeapMax32.copia(itemArray48);
        fPHeapMax29.copia(itemArray48);
        fPHeapMax1.copia(itemArray48);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) ' ');
        ds.Item item58 = fPHeapMax57.max();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item61 = fPHeapMax60.max();
        ds.Item item62 = fPHeapMax60.max();
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax64.imprime();
        fPHeapMax64.constroi();
        ds.Item[] itemArray67 = new ds.Item[] {};
        fPHeapMax64.copia(itemArray67);
        fPHeapMax60.copia(itemArray67);
        fPHeapMax57.copia(itemArray67);
        fPHeapMax57.imprime();
        fPHeapMax57.constroi();
        fPHeapMax57.imprime();
        ds.FPHeapMax fPHeapMax75 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item76 = fPHeapMax75.max();
        ds.Item item77 = fPHeapMax75.max();
        ds.FPHeapMax fPHeapMax79 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax79.imprime();
        fPHeapMax79.constroi();
        ds.Item[] itemArray82 = new ds.Item[] {};
        fPHeapMax79.copia(itemArray82);
        fPHeapMax75.copia(itemArray82);
        fPHeapMax57.copia(itemArray82);
        fPHeapMax1.copia(itemArray82);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item42);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNull(item58);
        org.junit.Assert.assertNull(item61);
        org.junit.Assert.assertNull(item62);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNull(item76);
        org.junit.Assert.assertNull(item77);
        org.junit.Assert.assertNotNull(itemArray82);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray12);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = fPHeapMax21.max();
        ds.Item item23 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray28);
        fPHeapMax21.copia(itemArray28);
        fPHeapMax19.copia(itemArray28);
        fPHeapMax17.copia(itemArray28);
        fPHeapMax9.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item38 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.imprime();
        fPHeapMax5.refaz(100, (int) (short) 0);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = fPHeapMax14.max();
        ds.Item item16 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax18.imprime();
        fPHeapMax18.constroi();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray21);
        fPHeapMax14.copia(itemArray21);
        fPHeapMax12.copia(itemArray21);
        fPHeapMax5.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item8 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray22);
        fPHeapMax11.copia(itemArray22);
        fPHeapMax11.refaz(100, (int) (short) 0);
        ds.Item item28 = fPHeapMax11.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) item28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item28);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        fPHeapMax7.imprime();
        ds.Item item10 = fPHeapMax7.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = fPHeapMax16.max();
        ds.Item item18 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax20.imprime();
        fPHeapMax20.constroi();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray23);
        fPHeapMax16.copia(itemArray23);
        fPHeapMax14.copia(itemArray23);
        fPHeapMax12.copia(itemArray23);
        fPHeapMax7.copia(itemArray23);
        fPHeapMax5.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        java.lang.Class<?> wildcardClass31 = itemArray23.getClass();
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.imprime();
        fPHeapMax7.constroi();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray10);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        fPHeapMax7.imprime();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = fPHeapMax21.max();
        ds.Item item23 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray28);
        fPHeapMax21.copia(itemArray28);
        fPHeapMax19.copia(itemArray28);
        fPHeapMax17.copia(itemArray28);
        fPHeapMax7.copia(itemArray28);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax7.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = fPHeapMax17.max();
        ds.Item item19 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax21.imprime();
        fPHeapMax21.constroi();
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax21.copia(itemArray24);
        fPHeapMax17.copia(itemArray24);
        fPHeapMax15.copia(itemArray24);
        fPHeapMax7.copia(itemArray24);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) '#');
        fPHeapMax30.imprime();
        fPHeapMax30.imprime();
        ds.Item item33 = fPHeapMax30.max();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item40 = fPHeapMax39.max();
        ds.Item item41 = fPHeapMax39.max();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax43.imprime();
        fPHeapMax43.constroi();
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray46);
        fPHeapMax39.copia(itemArray46);
        fPHeapMax37.copia(itemArray46);
        fPHeapMax35.copia(itemArray46);
        fPHeapMax30.copia(itemArray46);
        fPHeapMax7.copia(itemArray46);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) '#');
        fPHeapMax56.imprime();
        fPHeapMax56.imprime();
        ds.Item item59 = fPHeapMax56.max();
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item62 = fPHeapMax61.max();
        ds.Item item63 = fPHeapMax61.max();
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax65.imprime();
        fPHeapMax65.constroi();
        ds.Item[] itemArray68 = new ds.Item[] {};
        fPHeapMax65.copia(itemArray68);
        fPHeapMax61.copia(itemArray68);
        fPHeapMax56.copia(itemArray68);
        fPHeapMax54.copia(itemArray68);
        fPHeapMax7.copia(itemArray68);
        ds.FPHeapMax fPHeapMax75 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax75.imprime();
        fPHeapMax75.refaz(100, (int) (short) 0);
        fPHeapMax75.constroi();
        ds.FPHeapMax fPHeapMax82 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax84 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item85 = fPHeapMax84.max();
        ds.Item item86 = fPHeapMax84.max();
        ds.FPHeapMax fPHeapMax88 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax88.imprime();
        fPHeapMax88.constroi();
        ds.Item[] itemArray91 = new ds.Item[] {};
        fPHeapMax88.copia(itemArray91);
        fPHeapMax84.copia(itemArray91);
        fPHeapMax82.copia(itemArray91);
        fPHeapMax75.copia(itemArray91);
        fPHeapMax7.copia(itemArray91);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) itemArray91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNull(item62);
        org.junit.Assert.assertNull(item63);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNull(item85);
        org.junit.Assert.assertNull(item86);
        org.junit.Assert.assertNotNull(itemArray91);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) 'a', (int) (short) -1);
        fPHeapMax1.imprime();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax18.imprime();
        fPHeapMax18.refaz(100, (int) (short) 0);
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax26.imprime();
        fPHeapMax26.constroi();
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray29);
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = fPHeapMax38.max();
        ds.Item item40 = fPHeapMax38.max();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax42.imprime();
        fPHeapMax42.constroi();
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMax42.copia(itemArray45);
        fPHeapMax38.copia(itemArray45);
        fPHeapMax36.copia(itemArray45);
        fPHeapMax34.copia(itemArray45);
        fPHeapMax26.copia(itemArray45);
        fPHeapMax18.copia(itemArray45);
        fPHeapMax15.copia(itemArray45);
        fPHeapMax1.copia(itemArray45);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        ds.Item item59 = fPHeapMax55.max();
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        fPHeapMax61.copia(itemArray63);
        fPHeapMax61.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax69.imprime();
        fPHeapMax69.constroi();
        ds.Item[] itemArray72 = new ds.Item[] {};
        fPHeapMax69.copia(itemArray72);
        fPHeapMax61.copia(itemArray72);
        fPHeapMax55.copia(itemArray72);
        fPHeapMax1.copia(itemArray72);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray72);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = fPHeapMax7.max();
        ds.Item item9 = fPHeapMax7.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax11.imprime();
        fPHeapMax11.constroi();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray14);
        fPHeapMax7.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        fPHeapMax3.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax21.refaz((int) (byte) 1, 1);
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax30.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item41 = fPHeapMax40.max();
        ds.Item item42 = fPHeapMax40.max();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax44.imprime();
        fPHeapMax44.constroi();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray47);
        fPHeapMax40.copia(itemArray47);
        fPHeapMax38.copia(itemArray47);
        fPHeapMax30.copia(itemArray47);
        fPHeapMax21.copia(itemArray47);
        fPHeapMax1.copia(itemArray47);
        java.lang.Class<?> wildcardClass54 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNull(item42);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.imprime();
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray9);
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray16);
        fPHeapMax6.copia(itemArray16);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax20.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax23.imprime();
        fPHeapMax23.refaz(100, (int) (short) 0);
        fPHeapMax23.constroi();
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax31.imprime();
        fPHeapMax31.constroi();
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax31.copia(itemArray34);
        fPHeapMax31.constroi();
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item44 = fPHeapMax43.max();
        ds.Item item45 = fPHeapMax43.max();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax47.imprime();
        fPHeapMax47.constroi();
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMax47.copia(itemArray50);
        fPHeapMax43.copia(itemArray50);
        fPHeapMax41.copia(itemArray50);
        fPHeapMax39.copia(itemArray50);
        fPHeapMax31.copia(itemArray50);
        fPHeapMax23.copia(itemArray50);
        fPHeapMax20.copia(itemArray50);
        fPHeapMax6.copia(itemArray50);
        fPHeapMax1.copia(itemArray50);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray6);
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = fPHeapMax15.max();
        ds.Item item17 = fPHeapMax15.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray22);
        fPHeapMax15.copia(itemArray22);
        fPHeapMax13.copia(itemArray22);
        fPHeapMax11.copia(itemArray22);
        fPHeapMax3.copia(itemArray22);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) '#');
        fPHeapMax34.imprime();
        fPHeapMax34.imprime();
        ds.Item item37 = fPHeapMax34.max();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item40 = fPHeapMax39.max();
        ds.Item item41 = fPHeapMax39.max();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax43.imprime();
        fPHeapMax43.constroi();
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray46);
        fPHeapMax39.copia(itemArray46);
        fPHeapMax34.copia(itemArray46);
        fPHeapMax32.copia(itemArray46);
        fPHeapMax30.copia(itemArray46);
        fPHeapMax3.copia(itemArray46);
        fPHeapMax1.copia(itemArray46);
        ds.Item item54 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item58 = fPHeapMax57.max();
        fPHeapMax57.constroi();
        ds.Item item60 = fPHeapMax57.max();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax62.imprime();
        ds.Item item64 = fPHeapMax62.max();
        fPHeapMax62.refaz((int) ' ', (int) ' ');
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item70 = fPHeapMax69.max();
        fPHeapMax69.imprime();
        ds.FPHeapMax fPHeapMax73 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item74 = null;
        ds.Item[] itemArray75 = new ds.Item[] { item74 };
        fPHeapMax73.copia(itemArray75);
        fPHeapMax69.copia(itemArray75);
        fPHeapMax62.copia(itemArray75);
        fPHeapMax57.copia(itemArray75);
        fPHeapMax57.refaz((int) (byte) 1, (int) (byte) -1);
        fPHeapMax57.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) fPHeapMax57);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNull(item58);
        org.junit.Assert.assertNull(item60);
        org.junit.Assert.assertNull(item64);
        org.junit.Assert.assertNull(item70);
        org.junit.Assert.assertNotNull(itemArray75);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, (int) (short) 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = fPHeapMax10.max();
        ds.Item item12 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.imprime();
        fPHeapMax14.constroi();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax10.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = fPHeapMax4.max();
        ds.Item item6 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray11);
        fPHeapMax4.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax18.imprime();
        fPHeapMax18.refaz(100, (int) (short) 0);
        fPHeapMax18.constroi();
        ds.Item item24 = fPHeapMax18.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) '#');
        fPHeapMax26.imprime();
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax30.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax38.imprime();
        fPHeapMax38.constroi();
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMax38.copia(itemArray41);
        fPHeapMax30.copia(itemArray41);
        fPHeapMax26.copia(itemArray41);
        fPHeapMax18.copia(itemArray41);
        fPHeapMax1.copia(itemArray41);
        ds.Item item47 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        ds.Item item19 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.imprime();
        fPHeapMax4.refaz(100, (int) (short) 0);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray15);
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = fPHeapMax24.max();
        ds.Item item26 = fPHeapMax24.max();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax28.imprime();
        fPHeapMax28.constroi();
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMax28.copia(itemArray31);
        fPHeapMax24.copia(itemArray31);
        fPHeapMax22.copia(itemArray31);
        fPHeapMax20.copia(itemArray31);
        fPHeapMax12.copia(itemArray31);
        fPHeapMax4.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) '#');
        fPHeapMax41.imprime();
        fPHeapMax41.imprime();
        ds.Item item44 = fPHeapMax41.max();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item53 = fPHeapMax52.max();
        ds.Item item54 = fPHeapMax52.max();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax56.imprime();
        fPHeapMax56.constroi();
        ds.Item[] itemArray59 = new ds.Item[] {};
        fPHeapMax56.copia(itemArray59);
        fPHeapMax52.copia(itemArray59);
        fPHeapMax50.copia(itemArray59);
        fPHeapMax48.copia(itemArray59);
        fPHeapMax46.copia(itemArray59);
        fPHeapMax41.copia(itemArray59);
        fPHeapMax1.copia(itemArray59);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item68 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNotNull(itemArray59);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        fPHeapMax5.imprime();
        fPHeapMax5.imprime();
        ds.Item item8 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = fPHeapMax10.max();
        ds.Item item12 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.imprime();
        fPHeapMax14.constroi();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax10.copia(itemArray17);
        fPHeapMax5.copia(itemArray17);
        fPHeapMax3.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = fPHeapMax6.max();
        ds.Item item8 = fPHeapMax6.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray13);
        fPHeapMax6.copia(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) fPHeapMax6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.imprime();
        fPHeapMax8.refaz(100, (int) (short) 0);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray19);
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = fPHeapMax28.max();
        ds.Item item30 = fPHeapMax28.max();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax32.imprime();
        fPHeapMax32.constroi();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray35);
        fPHeapMax28.copia(itemArray35);
        fPHeapMax26.copia(itemArray35);
        fPHeapMax24.copia(itemArray35);
        fPHeapMax16.copia(itemArray35);
        fPHeapMax8.copia(itemArray35);
        fPHeapMax5.copia(itemArray35);
        fPHeapMax1.copia(itemArray35);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item44 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray12);
        fPHeapMax6.copia(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) itemArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (byte) 0);
        ds.Item item11 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 10);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = fPHeapMax8.max();
        ds.Item item10 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray15);
        fPHeapMax8.copia(itemArray15);
        fPHeapMax6.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax21.imprime();
        ds.Item item23 = fPHeapMax21.max();
        fPHeapMax21.refaz((int) ' ', (int) ' ');
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = fPHeapMax28.max();
        fPHeapMax28.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax28.copia(itemArray34);
        fPHeapMax21.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        fPHeapMax1.refaz((int) 'a', (int) (short) 1);
        fPHeapMax1.refaz(10, (int) (byte) 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax48.imprime();
        ds.Item item50 = fPHeapMax48.max();
        fPHeapMax48.refaz((int) ' ', (int) ' ');
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item56 = fPHeapMax55.max();
        fPHeapMax55.imprime();
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMax59.copia(itemArray61);
        fPHeapMax55.copia(itemArray61);
        fPHeapMax48.copia(itemArray61);
        ds.Item item65 = fPHeapMax48.max();
        fPHeapMax48.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) fPHeapMax48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNull(item56);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNull(item65);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 10);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax7.refaz((int) (byte) 1, 1);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = fPHeapMax26.max();
        ds.Item item28 = fPHeapMax26.max();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax30.imprime();
        fPHeapMax30.constroi();
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray33);
        fPHeapMax26.copia(itemArray33);
        fPHeapMax24.copia(itemArray33);
        fPHeapMax16.copia(itemArray33);
        fPHeapMax7.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        java.lang.Class<?> wildcardClass40 = itemArray33.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.Item item2 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.refaz((int) (byte) 1, 1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = fPHeapMax20.max();
        ds.Item item22 = fPHeapMax20.max();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax24.imprime();
        fPHeapMax24.constroi();
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray27);
        fPHeapMax20.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax10.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        ds.Item item39 = fPHeapMax35.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax49.imprime();
        fPHeapMax49.constroi();
        ds.Item[] itemArray52 = new ds.Item[] {};
        fPHeapMax49.copia(itemArray52);
        fPHeapMax41.copia(itemArray52);
        fPHeapMax35.copia(itemArray52);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax57.constroi();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMax60.copia(itemArray62);
        fPHeapMax57.copia(itemArray62);
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax66.refaz((int) (short) 10, (int) (short) 10);
        ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax73 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item74 = fPHeapMax73.max();
        ds.Item item75 = fPHeapMax73.max();
        ds.FPHeapMax fPHeapMax77 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax77.imprime();
        fPHeapMax77.constroi();
        ds.Item[] itemArray80 = new ds.Item[] {};
        fPHeapMax77.copia(itemArray80);
        fPHeapMax73.copia(itemArray80);
        fPHeapMax71.copia(itemArray80);
        fPHeapMax66.copia(itemArray80);
        fPHeapMax57.copia(itemArray80);
        fPHeapMax35.copia(itemArray80);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) itemArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNull(item74);
        org.junit.Assert.assertNull(item75);
        org.junit.Assert.assertNotNull(itemArray80);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) '#', 1);
        java.lang.Class<?> wildcardClass9 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray16);
        fPHeapMax5.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.imprime();
        ds.Item item21 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) fPHeapMax24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item10 = fPHeapMax9.max();
        ds.Item item11 = fPHeapMax9.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray16);
        fPHeapMax9.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax21.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = fPHeapMax31.max();
        ds.Item item33 = fPHeapMax31.max();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax35.imprime();
        fPHeapMax35.constroi();
        ds.Item[] itemArray38 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray38);
        fPHeapMax31.copia(itemArray38);
        fPHeapMax29.copia(itemArray38);
        fPHeapMax21.copia(itemArray38);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) '#');
        fPHeapMax44.imprime();
        fPHeapMax44.imprime();
        ds.Item item47 = fPHeapMax44.max();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item54 = fPHeapMax53.max();
        ds.Item item55 = fPHeapMax53.max();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax57.imprime();
        fPHeapMax57.constroi();
        ds.Item[] itemArray60 = new ds.Item[] {};
        fPHeapMax57.copia(itemArray60);
        fPHeapMax53.copia(itemArray60);
        fPHeapMax51.copia(itemArray60);
        fPHeapMax49.copia(itemArray60);
        fPHeapMax44.copia(itemArray60);
        fPHeapMax21.copia(itemArray60);
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) '#');
        fPHeapMax70.imprime();
        fPHeapMax70.imprime();
        ds.Item item73 = fPHeapMax70.max();
        ds.FPHeapMax fPHeapMax75 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item76 = fPHeapMax75.max();
        ds.Item item77 = fPHeapMax75.max();
        ds.FPHeapMax fPHeapMax79 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax79.imprime();
        fPHeapMax79.constroi();
        ds.Item[] itemArray82 = new ds.Item[] {};
        fPHeapMax79.copia(itemArray82);
        fPHeapMax75.copia(itemArray82);
        fPHeapMax70.copia(itemArray82);
        fPHeapMax68.copia(itemArray82);
        fPHeapMax21.copia(itemArray82);
        fPHeapMax1.copia(itemArray82);
        java.lang.Class<?> wildcardClass89 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNull(item73);
        org.junit.Assert.assertNull(item76);
        org.junit.Assert.assertNull(item77);
        org.junit.Assert.assertNotNull(itemArray82);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (short) 10, 10);
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray22);
        fPHeapMax11.copia(itemArray22);
        fPHeapMax11.refaz(100, (int) (short) 0);
        java.lang.Class<?> wildcardClass28 = fPHeapMax11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) wildcardClass28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax5.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) '#');
        fPHeapMax17.imprime();
        fPHeapMax17.imprime();
        ds.Item item20 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = fPHeapMax26.max();
        ds.Item item28 = fPHeapMax26.max();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax30.imprime();
        fPHeapMax30.constroi();
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray33);
        fPHeapMax26.copia(itemArray33);
        fPHeapMax24.copia(itemArray33);
        fPHeapMax22.copia(itemArray33);
        fPHeapMax17.copia(itemArray33);
        fPHeapMax17.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        fPHeapMax3.imprime();
        ds.Item item6 = fPHeapMax3.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = fPHeapMax8.max();
        ds.Item item10 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray15);
        fPHeapMax8.copia(itemArray15);
        fPHeapMax3.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) '#');
        fPHeapMax24.imprime();
        fPHeapMax24.imprime();
        fPHeapMax24.imprime();
        fPHeapMax24.imprime();
        fPHeapMax24.imprime();
        fPHeapMax24.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) fPHeapMax24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, (int) (short) 0);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray12);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = fPHeapMax21.max();
        ds.Item item23 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray28);
        fPHeapMax21.copia(itemArray28);
        fPHeapMax19.copia(itemArray28);
        fPHeapMax17.copia(itemArray28);
        fPHeapMax9.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax36.imprime();
        fPHeapMax36.refaz(100, (int) (short) 0);
        fPHeapMax36.constroi();
        fPHeapMax36.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax44.imprime();
        fPHeapMax44.constroi();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray47);
        fPHeapMax44.constroi();
        fPHeapMax44.imprime();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = fPHeapMax56.max();
        ds.Item item58 = fPHeapMax56.max();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax60.imprime();
        fPHeapMax60.constroi();
        ds.Item[] itemArray63 = new ds.Item[] {};
        fPHeapMax60.copia(itemArray63);
        fPHeapMax56.copia(itemArray63);
        fPHeapMax54.copia(itemArray63);
        fPHeapMax52.copia(itemArray63);
        fPHeapMax44.copia(itemArray63);
        fPHeapMax36.copia(itemArray63);
        fPHeapMax1.copia(itemArray63);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item72 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNull(item57);
        org.junit.Assert.assertNull(item58);
        org.junit.Assert.assertNotNull(itemArray63);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = fPHeapMax15.max();
        ds.Item item17 = fPHeapMax15.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray22);
        fPHeapMax15.copia(itemArray22);
        fPHeapMax13.copia(itemArray22);
        fPHeapMax11.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item28 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = fPHeapMax4.max();
        ds.Item item6 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray11);
        fPHeapMax4.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item15 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax20.refaz((int) (short) 10, (int) (short) 10);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item28 = fPHeapMax27.max();
        ds.Item item29 = fPHeapMax27.max();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax31.imprime();
        fPHeapMax31.constroi();
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax31.copia(itemArray34);
        fPHeapMax27.copia(itemArray34);
        fPHeapMax25.copia(itemArray34);
        fPHeapMax20.copia(itemArray34);
        fPHeapMax17.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = item2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray12);
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray19);
        fPHeapMax9.copia(itemArray19);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.imprime();
        fPHeapMax26.refaz(100, (int) (short) 0);
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax34.imprime();
        fPHeapMax34.constroi();
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax34.copia(itemArray37);
        fPHeapMax34.constroi();
        fPHeapMax34.imprime();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item47 = fPHeapMax46.max();
        ds.Item item48 = fPHeapMax46.max();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax50.imprime();
        fPHeapMax50.constroi();
        ds.Item[] itemArray53 = new ds.Item[] {};
        fPHeapMax50.copia(itemArray53);
        fPHeapMax46.copia(itemArray53);
        fPHeapMax44.copia(itemArray53);
        fPHeapMax42.copia(itemArray53);
        fPHeapMax34.copia(itemArray53);
        fPHeapMax26.copia(itemArray53);
        fPHeapMax23.copia(itemArray53);
        fPHeapMax9.copia(itemArray53);
        fPHeapMax4.copia(itemArray53);
        fPHeapMax1.copia(itemArray53);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNotNull(itemArray53);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item4 = fPHeapMax3.max();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '#');
        fPHeapMax14.imprime();
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax26.imprime();
        fPHeapMax26.constroi();
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray29);
        fPHeapMax18.copia(itemArray29);
        fPHeapMax14.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass35 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray16);
        fPHeapMax5.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.refaz(10, (int) (short) -1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax24.imprime();
        fPHeapMax24.refaz(100, (int) (short) 0);
        fPHeapMax24.constroi();
        fPHeapMax24.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax32.imprime();
        fPHeapMax32.constroi();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray35);
        fPHeapMax32.constroi();
        fPHeapMax32.imprime();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = fPHeapMax44.max();
        ds.Item item46 = fPHeapMax44.max();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax48.imprime();
        fPHeapMax48.constroi();
        ds.Item[] itemArray51 = new ds.Item[] {};
        fPHeapMax48.copia(itemArray51);
        fPHeapMax44.copia(itemArray51);
        fPHeapMax42.copia(itemArray51);
        fPHeapMax40.copia(itemArray51);
        fPHeapMax32.copia(itemArray51);
        fPHeapMax24.copia(itemArray51);
        fPHeapMax1.copia(itemArray51);
        fPHeapMax1.constroi();
        ds.Item item60 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) ' ', (int) ' ');
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        fPHeapMax5.imprime();
        fPHeapMax5.imprime();
        ds.Item item8 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = fPHeapMax10.max();
        ds.Item item12 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.imprime();
        fPHeapMax14.constroi();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax10.copia(itemArray17);
        fPHeapMax5.copia(itemArray17);
        fPHeapMax3.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax29.imprime();
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item34 = fPHeapMax33.max();
        fPHeapMax33.imprime();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax33.copia(itemArray39);
        fPHeapMax29.copia(itemArray39);
        fPHeapMax25.copia(itemArray39);
        fPHeapMax1.copia(itemArray39);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.refaz(1, (-1));
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = item2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = fPHeapMax7.max();
        ds.Item item9 = fPHeapMax7.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax11.imprime();
        fPHeapMax11.constroi();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray14);
        fPHeapMax7.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        fPHeapMax3.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax21.refaz((int) (byte) 1, 1);
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax30.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item41 = fPHeapMax40.max();
        ds.Item item42 = fPHeapMax40.max();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax44.imprime();
        fPHeapMax44.constroi();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray47);
        fPHeapMax40.copia(itemArray47);
        fPHeapMax38.copia(itemArray47);
        fPHeapMax30.copia(itemArray47);
        fPHeapMax21.copia(itemArray47);
        fPHeapMax1.copia(itemArray47);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item54 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNull(item42);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.refaz((int) (byte) 1, 1);
        fPHeapMax1.refaz((int) ' ', (-1));
        fPHeapMax1.imprime();
        ds.Item item12 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = fPHeapMax11.max();
        ds.Item item13 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax15.imprime();
        fPHeapMax15.constroi();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray18);
        fPHeapMax11.copia(itemArray18);
        fPHeapMax9.copia(itemArray18);
        fPHeapMax7.copia(itemArray18);
        fPHeapMax7.imprime();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax7.copia(itemArray25);
        fPHeapMax1.copia(itemArray25);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, (int) (short) 0);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item9 = fPHeapMax1.max();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) ' ', (int) ' ');
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '#');
        fPHeapMax11.imprime();
        fPHeapMax11.imprime();
        ds.Item item14 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = fPHeapMax16.max();
        ds.Item item18 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax20.imprime();
        fPHeapMax20.constroi();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray23);
        fPHeapMax16.copia(itemArray23);
        fPHeapMax11.copia(itemArray23);
        fPHeapMax9.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        ds.Item item29 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item30 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray9);
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray16);
        fPHeapMax6.copia(itemArray16);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax20.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax23.imprime();
        fPHeapMax23.refaz(100, (int) (short) 0);
        fPHeapMax23.constroi();
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax31.imprime();
        fPHeapMax31.constroi();
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax31.copia(itemArray34);
        fPHeapMax31.constroi();
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item44 = fPHeapMax43.max();
        ds.Item item45 = fPHeapMax43.max();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax47.imprime();
        fPHeapMax47.constroi();
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMax47.copia(itemArray50);
        fPHeapMax43.copia(itemArray50);
        fPHeapMax41.copia(itemArray50);
        fPHeapMax39.copia(itemArray50);
        fPHeapMax31.copia(itemArray50);
        fPHeapMax23.copia(itemArray50);
        fPHeapMax20.copia(itemArray50);
        fPHeapMax6.copia(itemArray50);
        fPHeapMax1.copia(itemArray50);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item60 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item4 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        fPHeapMax16.imprime();
        ds.Item item19 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = fPHeapMax21.max();
        ds.Item item23 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray28);
        fPHeapMax21.copia(itemArray28);
        fPHeapMax16.copia(itemArray28);
        fPHeapMax14.copia(itemArray28);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) '#');
        fPHeapMax34.imprime();
        fPHeapMax34.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax38.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax46.imprime();
        fPHeapMax46.constroi();
        ds.Item[] itemArray49 = new ds.Item[] {};
        fPHeapMax46.copia(itemArray49);
        fPHeapMax38.copia(itemArray49);
        fPHeapMax34.copia(itemArray49);
        fPHeapMax14.copia(itemArray49);
        fPHeapMax12.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray13);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax17.imprime();
        fPHeapMax17.constroi();
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax24.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax27.imprime();
        fPHeapMax27.refaz(100, (int) (short) 0);
        fPHeapMax27.constroi();
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax35.imprime();
        fPHeapMax35.constroi();
        ds.Item[] itemArray38 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray38);
        fPHeapMax35.constroi();
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = fPHeapMax47.max();
        ds.Item item49 = fPHeapMax47.max();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax51.imprime();
        fPHeapMax51.constroi();
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMax51.copia(itemArray54);
        fPHeapMax47.copia(itemArray54);
        fPHeapMax45.copia(itemArray54);
        fPHeapMax43.copia(itemArray54);
        fPHeapMax35.copia(itemArray54);
        fPHeapMax27.copia(itemArray54);
        fPHeapMax24.copia(itemArray54);
        fPHeapMax10.copia(itemArray54);
        fPHeapMax1.copia(itemArray54);
        fPHeapMax1.refaz((int) (short) 10, 0);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNull(item49);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.imprime();
        ds.Item item6 = fPHeapMax4.max();
        fPHeapMax4.refaz((int) ' ', (int) ' ');
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax11.copia(itemArray17);
        fPHeapMax4.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        java.lang.Class<?> wildcardClass22 = itemArray17.getClass();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax6.imprime();
        ds.Item item8 = fPHeapMax6.max();
        fPHeapMax6.refaz((int) ' ', (int) ' ');
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax13.copia(itemArray19);
        fPHeapMax6.copia(itemArray19);
        ds.Item item23 = fPHeapMax6.max();
        ds.Item item24 = fPHeapMax6.max();
        ds.Item item25 = fPHeapMax6.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) item25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        fPHeapMax3.imprime();
        ds.Item item6 = fPHeapMax3.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = fPHeapMax8.max();
        ds.Item item10 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray15);
        fPHeapMax8.copia(itemArray15);
        fPHeapMax3.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 10);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = fPHeapMax8.max();
        ds.Item item10 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray15);
        fPHeapMax8.copia(itemArray15);
        fPHeapMax6.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax21.imprime();
        ds.Item item23 = fPHeapMax21.max();
        fPHeapMax21.refaz((int) ' ', (int) ' ');
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = fPHeapMax28.max();
        fPHeapMax28.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax28.copia(itemArray34);
        fPHeapMax21.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        fPHeapMax1.refaz(1, (int) (short) 1);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        ds.Item item47 = fPHeapMax43.max();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax49.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax57.imprime();
        fPHeapMax57.constroi();
        ds.Item[] itemArray60 = new ds.Item[] {};
        fPHeapMax57.copia(itemArray60);
        fPHeapMax49.copia(itemArray60);
        fPHeapMax43.copia(itemArray60);
        fPHeapMax1.copia(itemArray60);
        ds.Item item65 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass66 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNull(item65);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, (int) (short) 0);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax11.copia(itemArray16);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax20.refaz((int) (short) 10, (int) (short) 10);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item28 = fPHeapMax27.max();
        ds.Item item29 = fPHeapMax27.max();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax31.imprime();
        fPHeapMax31.constroi();
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax31.copia(itemArray34);
        fPHeapMax27.copia(itemArray34);
        fPHeapMax25.copia(itemArray34);
        fPHeapMax20.copia(itemArray34);
        fPHeapMax11.copia(itemArray34);
        fPHeapMax9.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) ' ', 10);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, (int) (short) 0);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray12);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = fPHeapMax21.max();
        ds.Item item23 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray28);
        fPHeapMax21.copia(itemArray28);
        fPHeapMax19.copia(itemArray28);
        fPHeapMax17.copia(itemArray28);
        fPHeapMax9.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax36.imprime();
        fPHeapMax36.refaz(100, (int) (short) 0);
        fPHeapMax36.constroi();
        fPHeapMax36.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax44.imprime();
        fPHeapMax44.constroi();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray47);
        fPHeapMax44.constroi();
        fPHeapMax44.imprime();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = fPHeapMax56.max();
        ds.Item item58 = fPHeapMax56.max();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax60.imprime();
        fPHeapMax60.constroi();
        ds.Item[] itemArray63 = new ds.Item[] {};
        fPHeapMax60.copia(itemArray63);
        fPHeapMax56.copia(itemArray63);
        fPHeapMax54.copia(itemArray63);
        fPHeapMax52.copia(itemArray63);
        fPHeapMax44.copia(itemArray63);
        fPHeapMax36.copia(itemArray63);
        fPHeapMax1.copia(itemArray63);
        java.lang.Class<?> wildcardClass71 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNull(item57);
        org.junit.Assert.assertNull(item58);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }
}

