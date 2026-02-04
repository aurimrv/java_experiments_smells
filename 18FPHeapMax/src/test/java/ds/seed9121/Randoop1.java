package ds.seed9121;

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
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax6.constroi();
        ds.Item item8 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        ds.Item item10 = fPHeapMax6.max();
        fPHeapMax6.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(100);
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item[] itemArray23 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(100);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.constroi();
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) '#');
        fPHeapMax12.refaz((int) (short) 0, (-1));
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) '#');
        fPHeapMax18.imprime();
        ds.Item item20 = fPHeapMax18.max();
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax18.copia(itemArray22);
        ds.Item item24 = fPHeapMax18.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(100);
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMax29.copia(itemArray30);
        fPHeapMax26.copia(itemArray30);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax(100);
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax34.copia(itemArray35);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax38.constroi();
        ds.Item item40 = fPHeapMax38.max();
        fPHeapMax38.constroi();
        ds.Item item42 = fPHeapMax38.max();
        fPHeapMax38.imprime();
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMax38.copia(itemArray44);
        fPHeapMax38.constroi();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax(100);
        ds.Item[] itemArray49 = new ds.Item[] {};
        fPHeapMax48.copia(itemArray49);
        fPHeapMax38.copia(itemArray49);
        fPHeapMax34.copia(itemArray49);
        fPHeapMax26.copia(itemArray49);
        fPHeapMax18.copia(itemArray49);
        fPHeapMax12.copia(itemArray49);
        fPHeapMax10.copia(itemArray49);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item42);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax4.constroi();
        ds.Item item6 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.Item item13 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(100);
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray10);
        fPHeapMax6.copia(itemArray10);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(100);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray15);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        ds.Item item22 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray24);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax(100);
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax28.copia(itemArray29);
        fPHeapMax18.copia(itemArray29);
        fPHeapMax14.copia(itemArray29);
        fPHeapMax6.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        ds.Item item35 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.Item item9 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        ds.Item item11 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        fPHeapMax7.constroi();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax16.constroi();
        ds.Item item18 = fPHeapMax16.max();
        fPHeapMax16.imprime();
        fPHeapMax16.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(100);
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray25);
        fPHeapMax16.copia(itemArray25);
        fPHeapMax7.copia(itemArray25);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(100);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax33.copia(itemArray34);
        fPHeapMax30.copia(itemArray34);
        fPHeapMax7.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax41.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax(100);
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray45);
        fPHeapMax41.copia(itemArray45);
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax(100);
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMax49.copia(itemArray50);
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax53.constroi();
        ds.Item item55 = fPHeapMax53.max();
        fPHeapMax53.constroi();
        ds.Item item57 = fPHeapMax53.max();
        fPHeapMax53.imprime();
        ds.Item[] itemArray59 = new ds.Item[] {};
        fPHeapMax53.copia(itemArray59);
        fPHeapMax53.constroi();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax(100);
        ds.Item[] itemArray64 = new ds.Item[] {};
        fPHeapMax63.copia(itemArray64);
        fPHeapMax53.copia(itemArray64);
        fPHeapMax49.copia(itemArray64);
        fPHeapMax41.copia(itemArray64);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax70.imprime();
        ds.FPHeapMax fPHeapMax73 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax75 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax75.constroi();
        ds.Item item77 = fPHeapMax75.max();
        fPHeapMax75.constroi();
        ds.Item item79 = fPHeapMax75.max();
        fPHeapMax75.imprime();
        ds.Item[] itemArray81 = new ds.Item[] {};
        fPHeapMax75.copia(itemArray81);
        fPHeapMax73.copia(itemArray81);
        fPHeapMax70.copia(itemArray81);
        ds.FPHeapMax fPHeapMax86 = new ds.FPHeapMax(100);
        ds.Item[] itemArray87 = new ds.Item[] {};
        fPHeapMax86.copia(itemArray87);
        fPHeapMax70.copia(itemArray87);
        fPHeapMax41.copia(itemArray87);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) itemArray87);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNull(item57);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNull(item77);
        org.junit.Assert.assertNull(item79);
        org.junit.Assert.assertNotNull(itemArray81);
        org.junit.Assert.assertNotNull(itemArray87);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax6.refaz((int) (short) 1, 0);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax14.constroi();
        ds.Item item16 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        ds.Item item18 = fPHeapMax14.max();
        fPHeapMax14.imprime();
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray20);
        fPHeapMax14.constroi();
        ds.Item item23 = fPHeapMax14.max();
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray24);
        fPHeapMax12.copia(itemArray24);
        fPHeapMax6.copia(itemArray24);
        fPHeapMax3.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        ds.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.Item item9 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        fPHeapMax7.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(100);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item20 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 1, 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '#');
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        fPHeapMax13.constroi();
        ds.Item item18 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '#');
        fPHeapMax20.imprime();
        fPHeapMax20.constroi();
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) '#');
        fPHeapMax25.imprime();
        ds.Item item27 = fPHeapMax25.max();
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax25.copia(itemArray29);
        fPHeapMax20.copia(itemArray29);
        fPHeapMax13.copia(itemArray29);
        fPHeapMax10.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        fPHeapMax1.constroi();
        ds.Item item36 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        ds.Item item18 = fPHeapMax16.max();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax16.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.Item item24 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) '#');
        fPHeapMax26.imprime();
        fPHeapMax26.constroi();
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        fPHeapMax26.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax35.constroi();
        ds.Item item37 = fPHeapMax35.max();
        fPHeapMax35.constroi();
        ds.Item item39 = fPHeapMax35.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) '#');
        fPHeapMax41.imprime();
        ds.Item item43 = fPHeapMax41.max();
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax41.copia(itemArray45);
        fPHeapMax35.copia(itemArray45);
        fPHeapMax26.copia(itemArray45);
        fPHeapMax1.copia(itemArray45);
        fPHeapMax1.imprime();
        ds.Item item51 = fPHeapMax1.max();
        ds.Item item52 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNull(item51);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.refaz((int) (short) 0, (-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax1.copia(itemArray5);
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.refaz(10, (-1));
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item15 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 100, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax22.constroi();
        ds.Item item24 = fPHeapMax22.max();
        fPHeapMax22.constroi();
        ds.Item item26 = fPHeapMax22.max();
        fPHeapMax22.imprime();
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) '#');
        fPHeapMax30.imprime();
        ds.Item item32 = fPHeapMax30.max();
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax30.copia(itemArray34);
        fPHeapMax22.copia(itemArray34);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax38.constroi();
        ds.Item item40 = fPHeapMax38.max();
        fPHeapMax38.constroi();
        ds.Item item42 = fPHeapMax38.max();
        fPHeapMax38.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) '#');
        fPHeapMax45.imprime();
        ds.Item item47 = fPHeapMax45.max();
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax45.copia(itemArray49);
        fPHeapMax38.copia(itemArray49);
        fPHeapMax22.copia(itemArray49);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) fPHeapMax22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item42);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax6.constroi();
        ds.Item item8 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        ds.Item item10 = fPHeapMax6.max();
        fPHeapMax6.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item15 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 100, (int) (byte) 1);
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax7.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) '#');
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        fPHeapMax25.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax34.constroi();
        ds.Item item36 = fPHeapMax34.max();
        fPHeapMax34.constroi();
        ds.Item item38 = fPHeapMax34.max();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) '#');
        fPHeapMax40.imprime();
        ds.Item item42 = fPHeapMax40.max();
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax40.copia(itemArray44);
        fPHeapMax34.copia(itemArray44);
        fPHeapMax25.copia(itemArray44);
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax49.constroi();
        ds.Item item51 = fPHeapMax49.max();
        fPHeapMax49.constroi();
        ds.Item item53 = fPHeapMax49.max();
        fPHeapMax49.imprime();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) '#');
        fPHeapMax56.imprime();
        ds.Item item58 = fPHeapMax56.max();
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMax56.copia(itemArray60);
        fPHeapMax49.copia(itemArray60);
        fPHeapMax25.copia(itemArray60);
        fPHeapMax1.copia(itemArray60);
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item68 = fPHeapMax67.max();
        ds.Item item69 = fPHeapMax67.max();
        fPHeapMax67.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax67);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNull(item42);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNull(item58);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNull(item68);
        org.junit.Assert.assertNull(item69);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax1.copia(itemArray5);
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(100);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax20.constroi();
        ds.Item item22 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        ds.Item item24 = fPHeapMax20.max();
        fPHeapMax20.imprime();
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax15.copia(itemArray26);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(100);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax31.copia(itemArray32);
        fPHeapMax15.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 0);
        ds.Item item40 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        ds.Item item8 = fPHeapMax1.max();
        ds.Item item9 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        fPHeapMax9.imprime();
        ds.Item item11 = fPHeapMax9.max();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.refaz((int) (byte) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.Item item9 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        ds.Item item11 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        fPHeapMax7.constroi();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax16.constroi();
        ds.Item item18 = fPHeapMax16.max();
        fPHeapMax16.imprime();
        fPHeapMax16.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(100);
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray25);
        fPHeapMax16.copia(itemArray25);
        fPHeapMax7.copia(itemArray25);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(100);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax33.copia(itemArray34);
        fPHeapMax30.copia(itemArray34);
        fPHeapMax7.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax41.constroi();
        ds.Item item43 = fPHeapMax41.max();
        fPHeapMax41.constroi();
        ds.Item item45 = fPHeapMax41.max();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) '#');
        fPHeapMax47.imprime();
        ds.Item item49 = fPHeapMax47.max();
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax47.copia(itemArray51);
        fPHeapMax41.copia(itemArray51);
        ds.Item item54 = fPHeapMax41.max();
        fPHeapMax41.constroi();
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) '#');
        fPHeapMax58.imprime();
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax61.refaz((int) (short) 1, 0);
        fPHeapMax61.constroi();
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax69.constroi();
        ds.Item item71 = fPHeapMax69.max();
        fPHeapMax69.constroi();
        ds.Item item73 = fPHeapMax69.max();
        fPHeapMax69.imprime();
        ds.Item[] itemArray75 = new ds.Item[] {};
        fPHeapMax69.copia(itemArray75);
        fPHeapMax69.constroi();
        ds.Item item78 = fPHeapMax69.max();
        ds.Item[] itemArray79 = new ds.Item[] {};
        fPHeapMax69.copia(itemArray79);
        fPHeapMax67.copia(itemArray79);
        fPHeapMax61.copia(itemArray79);
        fPHeapMax58.copia(itemArray79);
        fPHeapMax41.copia(itemArray79);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) itemArray79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNull(item49);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNull(item71);
        org.junit.Assert.assertNull(item73);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertNull(item78);
        org.junit.Assert.assertNotNull(itemArray79);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        fPHeapMax9.imprime();
        ds.Item item11 = fPHeapMax9.max();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax9.copia(itemArray13);
        ds.Item item15 = fPHeapMax9.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(100);
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray21);
        fPHeapMax17.copia(itemArray21);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(100);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray26);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax29.constroi();
        ds.Item item31 = fPHeapMax29.max();
        fPHeapMax29.constroi();
        ds.Item item33 = fPHeapMax29.max();
        fPHeapMax29.imprime();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax29.copia(itemArray35);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax(100);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray40);
        fPHeapMax29.copia(itemArray40);
        fPHeapMax25.copia(itemArray40);
        fPHeapMax17.copia(itemArray40);
        fPHeapMax9.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax49.constroi();
        ds.Item item51 = fPHeapMax49.max();
        fPHeapMax49.constroi();
        ds.Item item53 = fPHeapMax49.max();
        fPHeapMax49.imprime();
        fPHeapMax49.constroi();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) '#');
        fPHeapMax57.imprime();
        ds.Item item59 = fPHeapMax57.max();
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMax57.copia(itemArray61);
        fPHeapMax49.copia(itemArray61);
        java.lang.Class<?> wildcardClass64 = itemArray61.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) itemArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '#');
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        fPHeapMax15.imprime();
        ds.Item item17 = fPHeapMax15.max();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax15.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax4.constroi();
        ds.Item item6 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item14 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '#');
        fPHeapMax11.imprime();
        fPHeapMax11.constroi();
        fPHeapMax11.constroi();
        fPHeapMax11.imprime();
        fPHeapMax11.constroi();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax19.constroi();
        ds.Item item21 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        ds.Item item23 = fPHeapMax19.max();
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax28.constroi();
        ds.Item item30 = fPHeapMax28.max();
        fPHeapMax28.imprime();
        fPHeapMax28.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(100);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray37);
        fPHeapMax28.copia(itemArray37);
        fPHeapMax19.copia(itemArray37);
        fPHeapMax11.copia(itemArray37);
        fPHeapMax11.imprime();
        fPHeapMax11.imprime();
        ds.Item item44 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax46.imprime();
        fPHeapMax46.imprime();
        ds.Item item49 = fPHeapMax46.max();
        fPHeapMax46.constroi();
        ds.Item item51 = fPHeapMax46.max();
        fPHeapMax46.imprime();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) '#');
        fPHeapMax54.imprime();
        ds.Item item56 = fPHeapMax54.max();
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax54.copia(itemArray58);
        ds.Item item60 = fPHeapMax54.max();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax62.imprime();
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax(100);
        ds.Item[] itemArray66 = new ds.Item[] {};
        fPHeapMax65.copia(itemArray66);
        fPHeapMax62.copia(itemArray66);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax(100);
        ds.Item[] itemArray71 = new ds.Item[] {};
        fPHeapMax70.copia(itemArray71);
        ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax74.constroi();
        ds.Item item76 = fPHeapMax74.max();
        fPHeapMax74.constroi();
        ds.Item item78 = fPHeapMax74.max();
        fPHeapMax74.imprime();
        ds.Item[] itemArray80 = new ds.Item[] {};
        fPHeapMax74.copia(itemArray80);
        fPHeapMax74.constroi();
        ds.FPHeapMax fPHeapMax84 = new ds.FPHeapMax(100);
        ds.Item[] itemArray85 = new ds.Item[] {};
        fPHeapMax84.copia(itemArray85);
        fPHeapMax74.copia(itemArray85);
        fPHeapMax70.copia(itemArray85);
        fPHeapMax62.copia(itemArray85);
        fPHeapMax54.copia(itemArray85);
        fPHeapMax46.copia(itemArray85);
        fPHeapMax11.copia(itemArray85);
        fPHeapMax1.copia(itemArray85);
        ds.Item item94 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNull(item49);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNull(item56);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNull(item60);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNull(item76);
        org.junit.Assert.assertNull(item78);
        org.junit.Assert.assertNotNull(itemArray80);
        org.junit.Assert.assertNotNull(itemArray85);
        org.junit.Assert.assertNull(item94);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.refaz((int) (short) 0, (-1));
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax8.constroi();
        ds.Item item10 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        ds.Item item12 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        fPHeapMax15.imprime();
        ds.Item item17 = fPHeapMax15.max();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax15.copia(itemArray19);
        fPHeapMax8.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(100);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray16);
        fPHeapMax5.copia(itemArray16);
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax21.constroi();
        ds.Item item23 = fPHeapMax21.max();
        fPHeapMax21.constroi();
        ds.Item item25 = fPHeapMax21.max();
        fPHeapMax21.imprime();
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax21.copia(itemArray27);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(100);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax31.copia(itemArray32);
        fPHeapMax21.copia(itemArray32);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax36.imprime();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax(100);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray40);
        fPHeapMax36.copia(itemArray40);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax(100);
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray45);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax48.constroi();
        ds.Item item50 = fPHeapMax48.max();
        fPHeapMax48.constroi();
        ds.Item item52 = fPHeapMax48.max();
        fPHeapMax48.imprime();
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMax48.copia(itemArray54);
        fPHeapMax48.constroi();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax(100);
        ds.Item[] itemArray59 = new ds.Item[] {};
        fPHeapMax58.copia(itemArray59);
        fPHeapMax48.copia(itemArray59);
        fPHeapMax44.copia(itemArray59);
        fPHeapMax36.copia(itemArray59);
        fPHeapMax21.copia(itemArray59);
        fPHeapMax5.copia(itemArray59);
        fPHeapMax1.copia(itemArray59);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray59);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 1, 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '#');
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        fPHeapMax13.constroi();
        ds.Item item18 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '#');
        fPHeapMax20.imprime();
        fPHeapMax20.constroi();
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) '#');
        fPHeapMax25.imprime();
        ds.Item item27 = fPHeapMax25.max();
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax25.copia(itemArray29);
        fPHeapMax20.copia(itemArray29);
        fPHeapMax13.copia(itemArray29);
        fPHeapMax10.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax38.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) fPHeapMax38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray8);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax21.copia(itemArray22);
        fPHeapMax11.copia(itemArray22);
        fPHeapMax7.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax28.constroi();
        ds.Item item30 = fPHeapMax28.max();
        fPHeapMax28.constroi();
        ds.Item item32 = fPHeapMax28.max();
        fPHeapMax28.imprime();
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) '#');
        fPHeapMax36.imprime();
        ds.Item item38 = fPHeapMax36.max();
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax36.copia(itemArray40);
        fPHeapMax28.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item44 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        ds.Item item10 = fPHeapMax8.max();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax8.copia(itemArray12);
        fPHeapMax6.copia(itemArray12);
        fPHeapMax6.constroi();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        ds.Item item22 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) '#');
        fPHeapMax25.imprime();
        ds.Item item27 = fPHeapMax25.max();
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax25.copia(itemArray29);
        fPHeapMax18.copia(itemArray29);
        fPHeapMax6.copia(itemArray29);
        fPHeapMax4.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        ds.Item item35 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax4.constroi();
        ds.Item item6 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.refaz((int) (byte) 10, 0);
        ds.Item item16 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) '#');
        fPHeapMax18.imprime();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax26.constroi();
        ds.Item item28 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        ds.Item item30 = fPHeapMax26.max();
        fPHeapMax26.imprime();
        fPHeapMax26.constroi();
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax35.constroi();
        ds.Item item37 = fPHeapMax35.max();
        fPHeapMax35.imprime();
        fPHeapMax35.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax(100);
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray44);
        fPHeapMax35.copia(itemArray44);
        fPHeapMax26.copia(itemArray44);
        fPHeapMax18.copia(itemArray44);
        fPHeapMax1.copia(itemArray44);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax4.imprime();
        fPHeapMax4.imprime();
        ds.Item item7 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item9 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(100);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray15);
        fPHeapMax11.copia(itemArray15);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(100);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray20);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax23.constroi();
        ds.Item item25 = fPHeapMax23.max();
        fPHeapMax23.constroi();
        ds.Item item27 = fPHeapMax23.max();
        fPHeapMax23.imprime();
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray29);
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(100);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax33.copia(itemArray34);
        fPHeapMax23.copia(itemArray34);
        fPHeapMax19.copia(itemArray34);
        fPHeapMax11.copia(itemArray34);
        fPHeapMax4.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        ds.Item item41 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax6.constroi();
        ds.Item item8 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        ds.Item item10 = fPHeapMax6.max();
        fPHeapMax6.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(100);
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        fPHeapMax1.imprime();
        ds.Item item22 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item22);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax4.constroi();
        ds.Item item6 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item8 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '#');
        fPHeapMax10.imprime();
        ds.Item item12 = fPHeapMax10.max();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax10.copia(itemArray14);
        fPHeapMax4.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax23.constroi();
        ds.Item item25 = fPHeapMax23.max();
        fPHeapMax23.constroi();
        ds.Item item27 = fPHeapMax23.max();
        fPHeapMax23.imprime();
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        fPHeapMax18.copia(itemArray29);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax(100);
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax34.copia(itemArray35);
        fPHeapMax18.copia(itemArray35);
        fPHeapMax4.copia(itemArray35);
        fPHeapMax4.imprime();
        fPHeapMax4.refaz((int) (short) 10, (int) (short) 0);
        fPHeapMax4.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.refaz((int) (short) 0, (-1));
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        fPHeapMax9.imprime();
        ds.Item item11 = fPHeapMax9.max();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax9.copia(itemArray13);
        ds.Item item15 = fPHeapMax9.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(100);
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray21);
        fPHeapMax17.copia(itemArray21);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(100);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray26);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax29.constroi();
        ds.Item item31 = fPHeapMax29.max();
        fPHeapMax29.constroi();
        ds.Item item33 = fPHeapMax29.max();
        fPHeapMax29.imprime();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax29.copia(itemArray35);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax(100);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray40);
        fPHeapMax29.copia(itemArray40);
        fPHeapMax25.copia(itemArray40);
        fPHeapMax17.copia(itemArray40);
        fPHeapMax9.copia(itemArray40);
        fPHeapMax3.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        fPHeapMax1.refaz((int) '4', (int) 'a');
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax12.constroi();
        ds.Item item14 = fPHeapMax12.max();
        fPHeapMax12.constroi();
        ds.Item item16 = fPHeapMax12.max();
        fPHeapMax12.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        fPHeapMax8.copia(itemArray18);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '#');
        fPHeapMax23.imprime();
        fPHeapMax23.constroi();
        fPHeapMax23.constroi();
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax33.constroi();
        ds.Item item35 = fPHeapMax33.max();
        fPHeapMax33.constroi();
        ds.Item item37 = fPHeapMax33.max();
        fPHeapMax33.imprime();
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax33.copia(itemArray39);
        fPHeapMax31.copia(itemArray39);
        fPHeapMax29.copia(itemArray39);
        fPHeapMax23.copia(itemArray39);
        fPHeapMax8.copia(itemArray39);
        fPHeapMax1.copia(itemArray39);
        ds.Item item46 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item48 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNull(item46);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.Item item9 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        fPHeapMax7.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(100);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item20 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        fPHeapMax1.imprime();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax1.copia(itemArray5);
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(100);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        ds.Item item15 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax6.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.refaz((int) (short) 0, (-1));
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 10, (-1));
        fPHeapMax1.imprime();
        ds.Item item13 = fPHeapMax1.max();
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.refaz((int) '4', (int) '#');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax6.constroi();
        ds.Item item8 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        ds.Item item10 = fPHeapMax6.max();
        fPHeapMax6.imprime();
        ds.Item item12 = fPHeapMax6.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        ds.Item item18 = fPHeapMax16.max();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax16.copia(itemArray20);
        ds.Item item22 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax24.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax(100);
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray28);
        fPHeapMax24.copia(itemArray28);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(100);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray33);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax36.constroi();
        ds.Item item38 = fPHeapMax36.max();
        fPHeapMax36.constroi();
        ds.Item item40 = fPHeapMax36.max();
        fPHeapMax36.imprime();
        ds.Item[] itemArray42 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray42);
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax(100);
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax46.copia(itemArray47);
        fPHeapMax36.copia(itemArray47);
        fPHeapMax32.copia(itemArray47);
        fPHeapMax24.copia(itemArray47);
        fPHeapMax16.copia(itemArray47);
        fPHeapMax14.copia(itemArray47);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax55.constroi();
        ds.Item item57 = fPHeapMax55.max();
        fPHeapMax55.constroi();
        ds.Item item59 = fPHeapMax55.max();
        fPHeapMax55.imprime();
        fPHeapMax55.constroi();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) '#');
        fPHeapMax63.imprime();
        ds.Item item65 = fPHeapMax63.max();
        ds.Item item66 = null;
        ds.Item[] itemArray67 = new ds.Item[] { item66 };
        fPHeapMax63.copia(itemArray67);
        fPHeapMax55.copia(itemArray67);
        fPHeapMax14.copia(itemArray67);
        fPHeapMax6.copia(itemArray67);
        fPHeapMax1.copia(itemArray67);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNull(item57);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNull(item65);
        org.junit.Assert.assertNotNull(itemArray67);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        fPHeapMax18.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(100);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax9.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item34 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax36.imprime();
        fPHeapMax36.imprime();
        ds.Item item39 = fPHeapMax36.max();
        fPHeapMax36.constroi();
        ds.Item item41 = fPHeapMax36.max();
        fPHeapMax36.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) '#');
        fPHeapMax44.imprime();
        ds.Item item46 = fPHeapMax44.max();
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMax44.copia(itemArray48);
        ds.Item item50 = fPHeapMax44.max();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax52.imprime();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax(100);
        ds.Item[] itemArray56 = new ds.Item[] {};
        fPHeapMax55.copia(itemArray56);
        fPHeapMax52.copia(itemArray56);
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax(100);
        ds.Item[] itemArray61 = new ds.Item[] {};
        fPHeapMax60.copia(itemArray61);
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax64.constroi();
        ds.Item item66 = fPHeapMax64.max();
        fPHeapMax64.constroi();
        ds.Item item68 = fPHeapMax64.max();
        fPHeapMax64.imprime();
        ds.Item[] itemArray70 = new ds.Item[] {};
        fPHeapMax64.copia(itemArray70);
        fPHeapMax64.constroi();
        ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax(100);
        ds.Item[] itemArray75 = new ds.Item[] {};
        fPHeapMax74.copia(itemArray75);
        fPHeapMax64.copia(itemArray75);
        fPHeapMax60.copia(itemArray75);
        fPHeapMax52.copia(itemArray75);
        fPHeapMax44.copia(itemArray75);
        fPHeapMax36.copia(itemArray75);
        fPHeapMax1.copia(itemArray75);
        ds.Item item83 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNull(item66);
        org.junit.Assert.assertNull(item68);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(itemArray75);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        fPHeapMax18.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(100);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax9.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item34 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax38.constroi();
        ds.Item item40 = fPHeapMax38.max();
        fPHeapMax38.constroi();
        ds.Item item42 = fPHeapMax38.max();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) '#');
        fPHeapMax44.imprime();
        ds.Item item46 = fPHeapMax44.max();
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMax44.copia(itemArray48);
        fPHeapMax38.copia(itemArray48);
        ds.Item item51 = fPHeapMax38.max();
        fPHeapMax38.constroi();
        fPHeapMax38.constroi();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) '#');
        fPHeapMax55.imprime();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax58.refaz((int) (short) 1, 0);
        fPHeapMax58.constroi();
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax66.constroi();
        ds.Item item68 = fPHeapMax66.max();
        fPHeapMax66.constroi();
        ds.Item item70 = fPHeapMax66.max();
        fPHeapMax66.imprime();
        ds.Item[] itemArray72 = new ds.Item[] {};
        fPHeapMax66.copia(itemArray72);
        fPHeapMax66.constroi();
        ds.Item item75 = fPHeapMax66.max();
        ds.Item[] itemArray76 = new ds.Item[] {};
        fPHeapMax66.copia(itemArray76);
        fPHeapMax64.copia(itemArray76);
        fPHeapMax58.copia(itemArray76);
        fPHeapMax55.copia(itemArray76);
        fPHeapMax38.copia(itemArray76);
        fPHeapMax1.copia(itemArray76);
        ds.Item item83 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item42);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNull(item68);
        org.junit.Assert.assertNull(item70);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNull(item75);
        org.junit.Assert.assertNotNull(itemArray76);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        fPHeapMax1.imprime();
        ds.Item item15 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax19.constroi();
        ds.Item item21 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        ds.Item item23 = fPHeapMax19.max();
        fPHeapMax19.imprime();
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray25);
        fPHeapMax19.constroi();
        fPHeapMax19.constroi();
        ds.Item item29 = fPHeapMax19.max();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) '#');
        fPHeapMax33.imprime();
        ds.Item item35 = fPHeapMax33.max();
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax33.copia(itemArray37);
        ds.Item item39 = fPHeapMax33.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax41.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax(100);
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray45);
        fPHeapMax41.copia(itemArray45);
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax(100);
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMax49.copia(itemArray50);
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax53.constroi();
        ds.Item item55 = fPHeapMax53.max();
        fPHeapMax53.constroi();
        ds.Item item57 = fPHeapMax53.max();
        fPHeapMax53.imprime();
        ds.Item[] itemArray59 = new ds.Item[] {};
        fPHeapMax53.copia(itemArray59);
        fPHeapMax53.constroi();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax(100);
        ds.Item[] itemArray64 = new ds.Item[] {};
        fPHeapMax63.copia(itemArray64);
        fPHeapMax53.copia(itemArray64);
        fPHeapMax49.copia(itemArray64);
        fPHeapMax41.copia(itemArray64);
        fPHeapMax33.copia(itemArray64);
        fPHeapMax31.copia(itemArray64);
        ds.FPHeapMax fPHeapMax72 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax72.constroi();
        ds.Item item74 = fPHeapMax72.max();
        fPHeapMax72.constroi();
        ds.Item item76 = fPHeapMax72.max();
        fPHeapMax72.imprime();
        fPHeapMax72.constroi();
        ds.FPHeapMax fPHeapMax80 = new ds.FPHeapMax((int) '#');
        fPHeapMax80.imprime();
        ds.Item item82 = fPHeapMax80.max();
        ds.Item item83 = null;
        ds.Item[] itemArray84 = new ds.Item[] { item83 };
        fPHeapMax80.copia(itemArray84);
        fPHeapMax72.copia(itemArray84);
        fPHeapMax31.copia(itemArray84);
        fPHeapMax19.copia(itemArray84);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNull(item57);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNull(item74);
        org.junit.Assert.assertNull(item76);
        org.junit.Assert.assertNull(item82);
        org.junit.Assert.assertNotNull(itemArray84);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax7.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax23.constroi();
        ds.Item item25 = fPHeapMax23.max();
        fPHeapMax23.constroi();
        ds.Item item27 = fPHeapMax23.max();
        fPHeapMax23.imprime();
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray29);
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(100);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax33.copia(itemArray34);
        fPHeapMax23.copia(itemArray34);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax38.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(100);
        ds.Item[] itemArray42 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray42);
        fPHeapMax38.copia(itemArray42);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax(100);
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax46.copia(itemArray47);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax50.constroi();
        ds.Item item52 = fPHeapMax50.max();
        fPHeapMax50.constroi();
        ds.Item item54 = fPHeapMax50.max();
        fPHeapMax50.imprime();
        ds.Item[] itemArray56 = new ds.Item[] {};
        fPHeapMax50.copia(itemArray56);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax(100);
        ds.Item[] itemArray61 = new ds.Item[] {};
        fPHeapMax60.copia(itemArray61);
        fPHeapMax50.copia(itemArray61);
        fPHeapMax46.copia(itemArray61);
        fPHeapMax38.copia(itemArray61);
        fPHeapMax23.copia(itemArray61);
        fPHeapMax1.copia(itemArray61);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item68 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray61);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        fPHeapMax18.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(100);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax9.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item36 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.refaz((int) (short) 0, (-1));
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax8.constroi();
        ds.Item item10 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        ds.Item item12 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        fPHeapMax15.imprime();
        ds.Item item17 = fPHeapMax15.max();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax15.copia(itemArray19);
        fPHeapMax8.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax26.constroi();
        ds.Item item28 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        ds.Item item30 = fPHeapMax26.max();
        fPHeapMax26.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray32);
        fPHeapMax24.copia(itemArray32);
        fPHeapMax22.copia(itemArray32);
        fPHeapMax16.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.Item item38 = fPHeapMax1.max();
        ds.Item item39 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass40 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        fPHeapMax18.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(100);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax9.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item34 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax36.imprime();
        fPHeapMax36.imprime();
        ds.Item item39 = fPHeapMax36.max();
        fPHeapMax36.constroi();
        ds.Item item41 = fPHeapMax36.max();
        fPHeapMax36.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) '#');
        fPHeapMax44.imprime();
        ds.Item item46 = fPHeapMax44.max();
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMax44.copia(itemArray48);
        ds.Item item50 = fPHeapMax44.max();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax52.imprime();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax(100);
        ds.Item[] itemArray56 = new ds.Item[] {};
        fPHeapMax55.copia(itemArray56);
        fPHeapMax52.copia(itemArray56);
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax(100);
        ds.Item[] itemArray61 = new ds.Item[] {};
        fPHeapMax60.copia(itemArray61);
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax64.constroi();
        ds.Item item66 = fPHeapMax64.max();
        fPHeapMax64.constroi();
        ds.Item item68 = fPHeapMax64.max();
        fPHeapMax64.imprime();
        ds.Item[] itemArray70 = new ds.Item[] {};
        fPHeapMax64.copia(itemArray70);
        fPHeapMax64.constroi();
        ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax(100);
        ds.Item[] itemArray75 = new ds.Item[] {};
        fPHeapMax74.copia(itemArray75);
        fPHeapMax64.copia(itemArray75);
        fPHeapMax60.copia(itemArray75);
        fPHeapMax52.copia(itemArray75);
        fPHeapMax44.copia(itemArray75);
        fPHeapMax36.copia(itemArray75);
        fPHeapMax1.copia(itemArray75);
        ds.Item item83 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNull(item66);
        org.junit.Assert.assertNull(item68);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertNull(item83);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass17 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '#');
        fPHeapMax11.imprime();
        ds.Item item13 = fPHeapMax11.max();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax11.copia(itemArray15);
        fPHeapMax9.copia(itemArray15);
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax21.constroi();
        ds.Item item23 = fPHeapMax21.max();
        fPHeapMax21.constroi();
        ds.Item item25 = fPHeapMax21.max();
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) '#');
        fPHeapMax28.imprime();
        ds.Item item30 = fPHeapMax28.max();
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax28.copia(itemArray32);
        fPHeapMax21.copia(itemArray32);
        fPHeapMax9.copia(itemArray32);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) '#');
        fPHeapMax18.imprime();
        ds.Item item20 = fPHeapMax18.max();
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax18.copia(itemArray22);
        fPHeapMax10.copia(itemArray22);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax26.constroi();
        ds.Item item28 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        ds.Item item30 = fPHeapMax26.max();
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) '#');
        fPHeapMax33.imprime();
        ds.Item item35 = fPHeapMax33.max();
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax33.copia(itemArray37);
        fPHeapMax26.copia(itemArray37);
        fPHeapMax10.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        java.lang.Class<?> wildcardClass42 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.refaz((int) (short) 0, (-1));
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.constroi();
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax5.imprime();
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(100);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax15.constroi();
        ds.Item item17 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        ds.Item item19 = fPHeapMax15.max();
        fPHeapMax15.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray21);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(100);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray26);
        fPHeapMax15.copia(itemArray26);
        fPHeapMax11.copia(itemArray26);
        fPHeapMax5.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax34.imprime();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax(100);
        ds.Item[] itemArray38 = new ds.Item[] {};
        fPHeapMax37.copia(itemArray38);
        fPHeapMax34.copia(itemArray38);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax42.constroi();
        ds.Item item44 = fPHeapMax42.max();
        fPHeapMax42.constroi();
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) '#');
        fPHeapMax48.imprime();
        ds.Item item50 = fPHeapMax48.max();
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax48.copia(itemArray52);
        fPHeapMax42.copia(itemArray52);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax56.constroi();
        ds.Item item58 = fPHeapMax56.max();
        fPHeapMax56.constroi();
        fPHeapMax56.imprime();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) '#');
        fPHeapMax62.imprime();
        ds.Item item64 = fPHeapMax62.max();
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        fPHeapMax62.copia(itemArray66);
        fPHeapMax56.copia(itemArray66);
        fPHeapMax42.copia(itemArray66);
        fPHeapMax34.copia(itemArray66);
        ds.Item item71 = fPHeapMax34.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNull(item58);
        org.junit.Assert.assertNull(item64);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNull(item71);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax7.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax23.constroi();
        ds.Item item25 = fPHeapMax23.max();
        fPHeapMax23.constroi();
        ds.Item item27 = fPHeapMax23.max();
        fPHeapMax23.imprime();
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray29);
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(100);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax33.copia(itemArray34);
        fPHeapMax23.copia(itemArray34);
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax39.constroi();
        ds.Item item41 = fPHeapMax39.max();
        fPHeapMax39.constroi();
        ds.Item item43 = fPHeapMax39.max();
        fPHeapMax39.imprime();
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray45);
        fPHeapMax39.constroi();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax(100);
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMax49.copia(itemArray50);
        fPHeapMax39.copia(itemArray50);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax54.imprime();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax(100);
        ds.Item[] itemArray58 = new ds.Item[] {};
        fPHeapMax57.copia(itemArray58);
        fPHeapMax54.copia(itemArray58);
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax(100);
        ds.Item[] itemArray63 = new ds.Item[] {};
        fPHeapMax62.copia(itemArray63);
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax66.constroi();
        ds.Item item68 = fPHeapMax66.max();
        fPHeapMax66.constroi();
        ds.Item item70 = fPHeapMax66.max();
        fPHeapMax66.imprime();
        ds.Item[] itemArray72 = new ds.Item[] {};
        fPHeapMax66.copia(itemArray72);
        fPHeapMax66.constroi();
        ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax(100);
        ds.Item[] itemArray77 = new ds.Item[] {};
        fPHeapMax76.copia(itemArray77);
        fPHeapMax66.copia(itemArray77);
        fPHeapMax62.copia(itemArray77);
        fPHeapMax54.copia(itemArray77);
        fPHeapMax39.copia(itemArray77);
        fPHeapMax23.copia(itemArray77);
        fPHeapMax1.copia(itemArray77);
        java.lang.Class<?> wildcardClass85 = itemArray77.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNull(item68);
        org.junit.Assert.assertNull(item70);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(itemArray77);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        ds.Item item18 = fPHeapMax16.max();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax16.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 0);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax30.constroi();
        ds.Item item32 = fPHeapMax30.max();
        fPHeapMax30.constroi();
        ds.Item item34 = fPHeapMax30.max();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax39.constroi();
        ds.Item item41 = fPHeapMax39.max();
        fPHeapMax39.constroi();
        ds.Item item43 = fPHeapMax39.max();
        fPHeapMax39.imprime();
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray45);
        fPHeapMax36.copia(itemArray45);
        fPHeapMax30.copia(itemArray45);
        fPHeapMax30.constroi();
        fPHeapMax30.constroi();
        java.lang.Class<?> wildcardClass51 = fPHeapMax30.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax6.constroi();
        ds.Item item8 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        ds.Item item10 = fPHeapMax6.max();
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax15.constroi();
        ds.Item item17 = fPHeapMax15.max();
        fPHeapMax15.imprime();
        fPHeapMax15.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(100);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray24);
        fPHeapMax15.copia(itemArray24);
        fPHeapMax6.copia(itemArray24);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax29.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(100);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray33);
        fPHeapMax29.copia(itemArray33);
        fPHeapMax6.copia(itemArray33);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) itemArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        ds.Item item10 = fPHeapMax8.max();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax8.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(100);
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass7 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(100);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray16);
        fPHeapMax5.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '#');
        fPHeapMax11.imprime();
        fPHeapMax11.constroi();
        fPHeapMax11.constroi();
        fPHeapMax11.imprime();
        fPHeapMax11.constroi();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax19.constroi();
        ds.Item item21 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        ds.Item item23 = fPHeapMax19.max();
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax28.constroi();
        ds.Item item30 = fPHeapMax28.max();
        fPHeapMax28.imprime();
        fPHeapMax28.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(100);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray37);
        fPHeapMax28.copia(itemArray37);
        fPHeapMax19.copia(itemArray37);
        fPHeapMax11.copia(itemArray37);
        fPHeapMax11.imprime();
        fPHeapMax11.imprime();
        ds.Item item44 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax46.imprime();
        fPHeapMax46.imprime();
        ds.Item item49 = fPHeapMax46.max();
        fPHeapMax46.constroi();
        ds.Item item51 = fPHeapMax46.max();
        fPHeapMax46.imprime();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) '#');
        fPHeapMax54.imprime();
        ds.Item item56 = fPHeapMax54.max();
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax54.copia(itemArray58);
        ds.Item item60 = fPHeapMax54.max();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax62.imprime();
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax(100);
        ds.Item[] itemArray66 = new ds.Item[] {};
        fPHeapMax65.copia(itemArray66);
        fPHeapMax62.copia(itemArray66);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax(100);
        ds.Item[] itemArray71 = new ds.Item[] {};
        fPHeapMax70.copia(itemArray71);
        ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax74.constroi();
        ds.Item item76 = fPHeapMax74.max();
        fPHeapMax74.constroi();
        ds.Item item78 = fPHeapMax74.max();
        fPHeapMax74.imprime();
        ds.Item[] itemArray80 = new ds.Item[] {};
        fPHeapMax74.copia(itemArray80);
        fPHeapMax74.constroi();
        ds.FPHeapMax fPHeapMax84 = new ds.FPHeapMax(100);
        ds.Item[] itemArray85 = new ds.Item[] {};
        fPHeapMax84.copia(itemArray85);
        fPHeapMax74.copia(itemArray85);
        fPHeapMax70.copia(itemArray85);
        fPHeapMax62.copia(itemArray85);
        fPHeapMax54.copia(itemArray85);
        fPHeapMax46.copia(itemArray85);
        fPHeapMax11.copia(itemArray85);
        fPHeapMax1.copia(itemArray85);
        ds.Item item94 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item96 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNull(item49);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNull(item56);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNull(item60);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNull(item76);
        org.junit.Assert.assertNull(item78);
        org.junit.Assert.assertNotNull(itemArray80);
        org.junit.Assert.assertNotNull(itemArray85);
        org.junit.Assert.assertNull(item94);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) -1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        ds.Item item9 = fPHeapMax1.max();
        ds.Item item10 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 1);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax16.constroi();
        ds.Item item18 = fPHeapMax16.max();
        fPHeapMax16.constroi();
        ds.Item item20 = fPHeapMax16.max();
        fPHeapMax16.imprime();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray22);
        fPHeapMax14.copia(itemArray22);
        fPHeapMax12.copia(itemArray22);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) '#');
        fPHeapMax27.imprime();
        fPHeapMax27.constroi();
        fPHeapMax27.constroi();
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax37.constroi();
        ds.Item item39 = fPHeapMax37.max();
        fPHeapMax37.constroi();
        ds.Item item41 = fPHeapMax37.max();
        fPHeapMax37.imprime();
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMax37.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax33.copia(itemArray43);
        fPHeapMax27.copia(itemArray43);
        fPHeapMax12.copia(itemArray43);
        ds.Item item49 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax(100);
        ds.Item[] itemArray52 = new ds.Item[] {};
        fPHeapMax51.copia(itemArray52);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax55.constroi();
        ds.Item item57 = fPHeapMax55.max();
        fPHeapMax55.constroi();
        ds.Item item59 = fPHeapMax55.max();
        fPHeapMax55.imprime();
        ds.Item[] itemArray61 = new ds.Item[] {};
        fPHeapMax55.copia(itemArray61);
        fPHeapMax55.constroi();
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax(100);
        ds.Item[] itemArray66 = new ds.Item[] {};
        fPHeapMax65.copia(itemArray66);
        fPHeapMax55.copia(itemArray66);
        fPHeapMax51.copia(itemArray66);
        fPHeapMax12.copia(itemArray66);
        fPHeapMax1.copia(itemArray66);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item49);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNull(item57);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray66);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax7.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 1, (-1));
        ds.Item item27 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '#');
        fPHeapMax11.imprime();
        ds.Item item13 = fPHeapMax11.max();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax11.copia(itemArray15);
        ds.Item item17 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(100);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax(100);
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray28);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax31.constroi();
        ds.Item item33 = fPHeapMax31.max();
        fPHeapMax31.constroi();
        ds.Item item35 = fPHeapMax31.max();
        fPHeapMax31.imprime();
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax31.copia(itemArray37);
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(100);
        ds.Item[] itemArray42 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray42);
        fPHeapMax31.copia(itemArray42);
        fPHeapMax27.copia(itemArray42);
        fPHeapMax19.copia(itemArray42);
        fPHeapMax11.copia(itemArray42);
        fPHeapMax9.copia(itemArray42);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax50.constroi();
        ds.Item item52 = fPHeapMax50.max();
        fPHeapMax50.constroi();
        ds.Item item54 = fPHeapMax50.max();
        fPHeapMax50.imprime();
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) '#');
        fPHeapMax58.imprime();
        ds.Item item60 = fPHeapMax58.max();
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMax58.copia(itemArray62);
        fPHeapMax50.copia(itemArray62);
        fPHeapMax9.copia(itemArray62);
        fPHeapMax1.copia(itemArray62);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item67 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNull(item60);
        org.junit.Assert.assertNotNull(itemArray62);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item11 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        fPHeapMax15.imprime();
        ds.Item item17 = fPHeapMax15.max();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax15.copia(itemArray19);
        ds.Item item21 = fPHeapMax15.max();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(100);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax23.copia(itemArray27);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(100);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax31.copia(itemArray32);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax35.constroi();
        ds.Item item37 = fPHeapMax35.max();
        fPHeapMax35.constroi();
        ds.Item item39 = fPHeapMax35.max();
        fPHeapMax35.imprime();
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray41);
        fPHeapMax35.constroi();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(100);
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMax45.copia(itemArray46);
        fPHeapMax35.copia(itemArray46);
        fPHeapMax31.copia(itemArray46);
        fPHeapMax23.copia(itemArray46);
        fPHeapMax15.copia(itemArray46);
        fPHeapMax13.copia(itemArray46);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax54.constroi();
        ds.Item item56 = fPHeapMax54.max();
        fPHeapMax54.constroi();
        ds.Item item58 = fPHeapMax54.max();
        fPHeapMax54.imprime();
        fPHeapMax54.constroi();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) '#');
        fPHeapMax62.imprime();
        ds.Item item64 = fPHeapMax62.max();
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        fPHeapMax62.copia(itemArray66);
        fPHeapMax54.copia(itemArray66);
        fPHeapMax13.copia(itemArray66);
        fPHeapMax1.copia(itemArray66);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNull(item56);
        org.junit.Assert.assertNull(item58);
        org.junit.Assert.assertNull(item64);
        org.junit.Assert.assertNotNull(itemArray66);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item20 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(100);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray23);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax26.constroi();
        ds.Item item28 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        ds.Item item30 = fPHeapMax26.max();
        fPHeapMax26.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray32);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(100);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray37);
        fPHeapMax26.copia(itemArray37);
        fPHeapMax22.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax7.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item24 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) '#');
        fPHeapMax26.refaz((int) (short) 0, (-1));
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) '#');
        fPHeapMax32.imprime();
        ds.Item item34 = fPHeapMax32.max();
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax32.copia(itemArray36);
        ds.Item item38 = fPHeapMax32.max();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax40.imprime();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax(100);
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray44);
        fPHeapMax40.copia(itemArray44);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax(100);
        ds.Item[] itemArray49 = new ds.Item[] {};
        fPHeapMax48.copia(itemArray49);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax52.constroi();
        ds.Item item54 = fPHeapMax52.max();
        fPHeapMax52.constroi();
        ds.Item item56 = fPHeapMax52.max();
        fPHeapMax52.imprime();
        ds.Item[] itemArray58 = new ds.Item[] {};
        fPHeapMax52.copia(itemArray58);
        fPHeapMax52.constroi();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax(100);
        ds.Item[] itemArray63 = new ds.Item[] {};
        fPHeapMax62.copia(itemArray63);
        fPHeapMax52.copia(itemArray63);
        fPHeapMax48.copia(itemArray63);
        fPHeapMax40.copia(itemArray63);
        fPHeapMax32.copia(itemArray63);
        fPHeapMax26.copia(itemArray63);
        fPHeapMax1.copia(itemArray63);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNull(item56);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray63);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        fPHeapMax9.imprime();
        ds.Item item11 = fPHeapMax9.max();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax9.copia(itemArray13);
        fPHeapMax7.copia(itemArray13);
        fPHeapMax7.constroi();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax19.constroi();
        ds.Item item21 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        ds.Item item23 = fPHeapMax19.max();
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) '#');
        fPHeapMax26.imprime();
        ds.Item item28 = fPHeapMax26.max();
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax26.copia(itemArray30);
        fPHeapMax19.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax5.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        ds.Item item36 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax38.constroi();
        ds.Item item40 = fPHeapMax38.max();
        fPHeapMax38.constroi();
        fPHeapMax38.constroi();
        fPHeapMax38.refaz((int) (short) 1, 1);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) '#');
        fPHeapMax47.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax50.constroi();
        ds.Item item52 = fPHeapMax50.max();
        fPHeapMax50.constroi();
        fPHeapMax50.constroi();
        ds.Item item55 = fPHeapMax50.max();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) '#');
        fPHeapMax57.imprime();
        fPHeapMax57.constroi();
        fPHeapMax57.constroi();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) '#');
        fPHeapMax62.imprime();
        ds.Item item64 = fPHeapMax62.max();
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        fPHeapMax62.copia(itemArray66);
        fPHeapMax57.copia(itemArray66);
        fPHeapMax50.copia(itemArray66);
        fPHeapMax47.copia(itemArray66);
        fPHeapMax38.copia(itemArray66);
        fPHeapMax1.copia(itemArray66);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNull(item64);
        org.junit.Assert.assertNotNull(itemArray66);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        fPHeapMax9.imprime();
        ds.Item item11 = fPHeapMax9.max();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.refaz((int) (byte) 10, (int) (short) 1);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        ds.Item item10 = fPHeapMax8.max();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax8.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        ds.Item item9 = fPHeapMax3.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(100);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray15);
        fPHeapMax11.copia(itemArray15);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(100);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray20);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax23.constroi();
        ds.Item item25 = fPHeapMax23.max();
        fPHeapMax23.constroi();
        ds.Item item27 = fPHeapMax23.max();
        fPHeapMax23.imprime();
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray29);
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(100);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax33.copia(itemArray34);
        fPHeapMax23.copia(itemArray34);
        fPHeapMax19.copia(itemArray34);
        fPHeapMax11.copia(itemArray34);
        fPHeapMax3.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax42.constroi();
        ds.Item item44 = fPHeapMax42.max();
        fPHeapMax42.constroi();
        ds.Item item46 = fPHeapMax42.max();
        fPHeapMax42.imprime();
        fPHeapMax42.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) '#');
        fPHeapMax50.imprime();
        ds.Item item52 = fPHeapMax50.max();
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        fPHeapMax50.copia(itemArray54);
        fPHeapMax42.copia(itemArray54);
        fPHeapMax1.copia(itemArray54);
        ds.Item item58 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        fPHeapMax9.imprime();
        ds.Item item11 = fPHeapMax9.max();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax9.copia(itemArray13);
        ds.Item item15 = fPHeapMax9.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(100);
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray21);
        fPHeapMax17.copia(itemArray21);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(100);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray26);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax29.constroi();
        ds.Item item31 = fPHeapMax29.max();
        fPHeapMax29.constroi();
        ds.Item item33 = fPHeapMax29.max();
        fPHeapMax29.imprime();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax29.copia(itemArray35);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax(100);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray40);
        fPHeapMax29.copia(itemArray40);
        fPHeapMax25.copia(itemArray40);
        fPHeapMax17.copia(itemArray40);
        fPHeapMax9.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        ds.Item item47 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '#');
        fPHeapMax10.imprime();
        ds.Item item12 = fPHeapMax10.max();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax10.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax4.refaz((int) (short) 1, 0);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax12.constroi();
        ds.Item item14 = fPHeapMax12.max();
        fPHeapMax12.constroi();
        ds.Item item16 = fPHeapMax12.max();
        fPHeapMax12.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray18);
        fPHeapMax12.constroi();
        ds.Item item21 = fPHeapMax12.max();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray22);
        fPHeapMax10.copia(itemArray22);
        fPHeapMax4.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(100);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax17.constroi();
        ds.Item item19 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        ds.Item item21 = fPHeapMax17.max();
        fPHeapMax17.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray23);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax(100);
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray28);
        fPHeapMax17.copia(itemArray28);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax32.imprime();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax(100);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray36);
        fPHeapMax32.copia(itemArray36);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax(100);
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMax40.copia(itemArray41);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax44.constroi();
        ds.Item item46 = fPHeapMax44.max();
        fPHeapMax44.constroi();
        ds.Item item48 = fPHeapMax44.max();
        fPHeapMax44.imprime();
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray50);
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax(100);
        ds.Item[] itemArray55 = new ds.Item[] {};
        fPHeapMax54.copia(itemArray55);
        fPHeapMax44.copia(itemArray55);
        fPHeapMax40.copia(itemArray55);
        fPHeapMax32.copia(itemArray55);
        fPHeapMax17.copia(itemArray55);
        fPHeapMax1.copia(itemArray55);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax(100);
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) '#');
        fPHeapMax67.imprime();
        fPHeapMax67.constroi();
        fPHeapMax67.constroi();
        ds.FPHeapMax fPHeapMax72 = new ds.FPHeapMax((int) '#');
        fPHeapMax72.imprime();
        ds.Item item74 = fPHeapMax72.max();
        ds.Item item75 = null;
        ds.Item[] itemArray76 = new ds.Item[] { item75 };
        fPHeapMax72.copia(itemArray76);
        fPHeapMax67.copia(itemArray76);
        fPHeapMax65.copia(itemArray76);
        ds.FPHeapMax fPHeapMax81 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax83 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax85 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax85.constroi();
        ds.Item item87 = fPHeapMax85.max();
        fPHeapMax85.constroi();
        ds.Item item89 = fPHeapMax85.max();
        fPHeapMax85.imprime();
        ds.Item[] itemArray91 = new ds.Item[] {};
        fPHeapMax85.copia(itemArray91);
        fPHeapMax83.copia(itemArray91);
        fPHeapMax81.copia(itemArray91);
        fPHeapMax65.copia(itemArray91);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) itemArray91);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNull(item74);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNull(item87);
        org.junit.Assert.assertNull(item89);
        org.junit.Assert.assertNotNull(itemArray91);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        fPHeapMax8.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) '#');
        fPHeapMax17.imprime();
        fPHeapMax17.constroi();
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) '#');
        fPHeapMax22.imprime();
        ds.Item item24 = fPHeapMax22.max();
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax22.copia(itemArray26);
        fPHeapMax17.copia(itemArray26);
        fPHeapMax8.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(100);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(100);
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray10);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.Item item17 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(100);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray24);
        fPHeapMax13.copia(itemArray24);
        fPHeapMax9.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        ds.Item item29 = fPHeapMax1.max();
        ds.Item item30 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item30);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        ds.Item item7 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '#');
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        fPHeapMax15.imprime();
        ds.Item item17 = fPHeapMax15.max();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax15.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.Item item23 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass24 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax5.copia(itemArray11);
        fPHeapMax5.constroi();
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax17.constroi();
        ds.Item item19 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        ds.Item item21 = fPHeapMax17.max();
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) '#');
        fPHeapMax24.imprime();
        ds.Item item26 = fPHeapMax24.max();
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax24.copia(itemArray28);
        fPHeapMax17.copia(itemArray28);
        fPHeapMax5.copia(itemArray28);
        fPHeapMax3.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(100);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        fPHeapMax1.constroi();
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 1, obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '#');
        fPHeapMax11.imprime();
        ds.Item item13 = fPHeapMax11.max();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax11.copia(itemArray15);
        fPHeapMax5.copia(itemArray15);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax24.constroi();
        ds.Item item26 = fPHeapMax24.max();
        fPHeapMax24.constroi();
        ds.Item item28 = fPHeapMax24.max();
        fPHeapMax24.imprime();
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax19.copia(itemArray30);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax(100);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray36);
        fPHeapMax19.copia(itemArray36);
        fPHeapMax5.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) '#');
        fPHeapMax43.refaz((int) (short) 0, (-1));
        fPHeapMax43.imprime();
        fPHeapMax43.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax50.constroi();
        ds.Item item52 = fPHeapMax50.max();
        fPHeapMax50.constroi();
        ds.Item item54 = fPHeapMax50.max();
        fPHeapMax50.imprime();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) '#');
        fPHeapMax57.imprime();
        ds.Item item59 = fPHeapMax57.max();
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMax57.copia(itemArray61);
        fPHeapMax50.copia(itemArray61);
        fPHeapMax43.copia(itemArray61);
        fPHeapMax43.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNotNull(itemArray61);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) '#');
        fPHeapMax13.imprime();
        ds.Item item15 = fPHeapMax13.max();
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax13.copia(itemArray17);
        fPHeapMax11.copia(itemArray17);
        fPHeapMax11.constroi();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax23.constroi();
        ds.Item item25 = fPHeapMax23.max();
        fPHeapMax23.constroi();
        ds.Item item27 = fPHeapMax23.max();
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) '#');
        fPHeapMax30.imprime();
        ds.Item item32 = fPHeapMax30.max();
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax30.copia(itemArray34);
        fPHeapMax23.copia(itemArray34);
        fPHeapMax11.copia(itemArray34);
        fPHeapMax9.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        ds.Item item40 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item40);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        ds.Item item10 = fPHeapMax8.max();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax8.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, 0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.refaz((int) (short) 0, (-1));
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax8.constroi();
        ds.Item item10 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        ds.Item item12 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        fPHeapMax15.imprime();
        ds.Item item17 = fPHeapMax15.max();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax15.copia(itemArray19);
        fPHeapMax8.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) '#');
        fPHeapMax26.imprime();
        ds.Item item28 = fPHeapMax26.max();
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax26.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        fPHeapMax1.imprime();
        ds.Item item34 = fPHeapMax1.max();
        ds.Item item35 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item34);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass5 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        ds.Item item18 = fPHeapMax16.max();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax16.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.Item item24 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) '#');
        fPHeapMax26.imprime();
        fPHeapMax26.constroi();
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        fPHeapMax26.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax35.constroi();
        ds.Item item37 = fPHeapMax35.max();
        fPHeapMax35.constroi();
        ds.Item item39 = fPHeapMax35.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) '#');
        fPHeapMax41.imprime();
        ds.Item item43 = fPHeapMax41.max();
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax41.copia(itemArray45);
        fPHeapMax35.copia(itemArray45);
        fPHeapMax26.copia(itemArray45);
        fPHeapMax1.copia(itemArray45);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item20 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item22 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item22);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass9 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax26.constroi();
        ds.Item item28 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        ds.Item item30 = fPHeapMax26.max();
        fPHeapMax26.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray32);
        fPHeapMax24.copia(itemArray32);
        fPHeapMax22.copia(itemArray32);
        fPHeapMax16.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.Item item38 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax(100);
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMax40.copia(itemArray41);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax44.constroi();
        ds.Item item46 = fPHeapMax44.max();
        fPHeapMax44.constroi();
        ds.Item item48 = fPHeapMax44.max();
        fPHeapMax44.imprime();
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray50);
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax(100);
        ds.Item[] itemArray55 = new ds.Item[] {};
        fPHeapMax54.copia(itemArray55);
        fPHeapMax44.copia(itemArray55);
        fPHeapMax40.copia(itemArray55);
        fPHeapMax1.copia(itemArray55);
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax62.constroi();
        ds.Item item64 = fPHeapMax62.max();
        fPHeapMax62.imprime();
        fPHeapMax62.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) fPHeapMax62);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNull(item64);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        fPHeapMax5.imprime();
        ds.Item item7 = fPHeapMax5.max();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax5.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax15.constroi();
        ds.Item item17 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        ds.Item item19 = fPHeapMax15.max();
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) '#');
        fPHeapMax22.imprime();
        ds.Item item24 = fPHeapMax22.max();
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax22.copia(itemArray26);
        fPHeapMax15.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        java.lang.Class<?> wildcardClass31 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        fPHeapMax9.imprime();
        ds.Item item11 = fPHeapMax9.max();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax17.constroi();
        ds.Item item19 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        ds.Item item21 = fPHeapMax17.max();
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) '#');
        fPHeapMax24.imprime();
        ds.Item item26 = fPHeapMax24.max();
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax24.copia(itemArray28);
        fPHeapMax17.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax33.constroi();
        ds.Item item35 = fPHeapMax33.max();
        fPHeapMax33.constroi();
        ds.Item item37 = fPHeapMax33.max();
        fPHeapMax33.imprime();
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax33.copia(itemArray39);
        fPHeapMax33.constroi();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax(100);
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray44);
        fPHeapMax33.copia(itemArray44);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax48.imprime();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax(100);
        ds.Item[] itemArray52 = new ds.Item[] {};
        fPHeapMax51.copia(itemArray52);
        fPHeapMax48.copia(itemArray52);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax(100);
        ds.Item[] itemArray57 = new ds.Item[] {};
        fPHeapMax56.copia(itemArray57);
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax60.constroi();
        ds.Item item62 = fPHeapMax60.max();
        fPHeapMax60.constroi();
        ds.Item item64 = fPHeapMax60.max();
        fPHeapMax60.imprime();
        ds.Item[] itemArray66 = new ds.Item[] {};
        fPHeapMax60.copia(itemArray66);
        fPHeapMax60.constroi();
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax(100);
        ds.Item[] itemArray71 = new ds.Item[] {};
        fPHeapMax70.copia(itemArray71);
        fPHeapMax60.copia(itemArray71);
        fPHeapMax56.copia(itemArray71);
        fPHeapMax48.copia(itemArray71);
        fPHeapMax33.copia(itemArray71);
        fPHeapMax1.copia(itemArray71);
        fPHeapMax1.constroi();
        ds.Item item79 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNull(item62);
        org.junit.Assert.assertNull(item64);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray71);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax7.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax24.imprime();
        fPHeapMax24.imprime();
        ds.Item item27 = fPHeapMax24.max();
        fPHeapMax24.constroi();
        ds.Item item29 = fPHeapMax24.max();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax(100);
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax34.copia(itemArray35);
        fPHeapMax31.copia(itemArray35);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax(100);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray40);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax43.constroi();
        ds.Item item45 = fPHeapMax43.max();
        fPHeapMax43.constroi();
        ds.Item item47 = fPHeapMax43.max();
        fPHeapMax43.imprime();
        ds.Item[] itemArray49 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray49);
        fPHeapMax43.constroi();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax(100);
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMax53.copia(itemArray54);
        fPHeapMax43.copia(itemArray54);
        fPHeapMax39.copia(itemArray54);
        fPHeapMax31.copia(itemArray54);
        fPHeapMax24.copia(itemArray54);
        fPHeapMax1.copia(itemArray54);
        ds.Item item61 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax7.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.constroi();
        ds.Item item23 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '#');
        fPHeapMax6.imprime();
        ds.Item item8 = fPHeapMax6.max();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax6.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass23 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        fPHeapMax9.imprime();
        ds.Item item11 = fPHeapMax9.max();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax17.constroi();
        ds.Item item19 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        ds.Item item21 = fPHeapMax17.max();
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) '#');
        fPHeapMax24.imprime();
        ds.Item item26 = fPHeapMax24.max();
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax24.copia(itemArray28);
        fPHeapMax17.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(100);
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        java.lang.Class<?> wildcardClass13 = itemArray10.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        ds.Item item10 = fPHeapMax8.max();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax8.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item18 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item14 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(100);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(100);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray20);
        fPHeapMax16.copia(itemArray20);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(100);
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray25);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax28.constroi();
        ds.Item item30 = fPHeapMax28.max();
        fPHeapMax28.constroi();
        ds.Item item32 = fPHeapMax28.max();
        fPHeapMax28.imprime();
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax28.copia(itemArray34);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax(100);
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax38.copia(itemArray39);
        fPHeapMax28.copia(itemArray39);
        fPHeapMax24.copia(itemArray39);
        fPHeapMax16.copia(itemArray39);
        fPHeapMax1.copia(itemArray39);
        ds.Item item45 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNull(item45);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        ds.Item item10 = fPHeapMax8.max();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax8.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(100);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) '#');
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) '#');
        fPHeapMax24.imprime();
        ds.Item item26 = fPHeapMax24.max();
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax24.copia(itemArray28);
        fPHeapMax19.copia(itemArray28);
        fPHeapMax17.copia(itemArray28);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax37.constroi();
        ds.Item item39 = fPHeapMax37.max();
        fPHeapMax37.constroi();
        ds.Item item41 = fPHeapMax37.max();
        fPHeapMax37.imprime();
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMax37.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax33.copia(itemArray43);
        fPHeapMax17.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.refaz((int) (short) 0, (-1));
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax8.constroi();
        ds.Item item10 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        ds.Item item12 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        fPHeapMax15.imprime();
        ds.Item item17 = fPHeapMax15.max();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax15.copia(itemArray19);
        fPHeapMax8.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) '#');
        fPHeapMax26.imprime();
        ds.Item item28 = fPHeapMax26.max();
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax26.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item33 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.refaz((int) (short) 1, 0);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        ds.Item item22 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray24);
        fPHeapMax18.constroi();
        ds.Item item27 = fPHeapMax18.max();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray28);
        fPHeapMax16.copia(itemArray28);
        fPHeapMax10.copia(itemArray28);
        fPHeapMax7.copia(itemArray28);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) '#');
        fPHeapMax34.imprime();
        fPHeapMax34.constroi();
        fPHeapMax34.constroi();
        fPHeapMax34.imprime();
        fPHeapMax34.constroi();
        fPHeapMax34.constroi();
        ds.Item item41 = fPHeapMax34.max();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax43.imprime();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax(100);
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax46.copia(itemArray47);
        fPHeapMax43.copia(itemArray47);
        fPHeapMax34.copia(itemArray47);
        fPHeapMax7.copia(itemArray47);
        fPHeapMax1.copia(itemArray47);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax55.constroi();
        ds.Item item57 = fPHeapMax55.max();
        fPHeapMax55.constroi();
        ds.Item item59 = fPHeapMax55.max();
        fPHeapMax55.imprime();
        ds.Item[] itemArray61 = new ds.Item[] {};
        fPHeapMax55.copia(itemArray61);
        fPHeapMax55.constroi();
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax(100);
        ds.Item[] itemArray66 = new ds.Item[] {};
        fPHeapMax65.copia(itemArray66);
        fPHeapMax55.copia(itemArray66);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax70.imprime();
        ds.FPHeapMax fPHeapMax73 = new ds.FPHeapMax(100);
        ds.Item[] itemArray74 = new ds.Item[] {};
        fPHeapMax73.copia(itemArray74);
        fPHeapMax70.copia(itemArray74);
        ds.FPHeapMax fPHeapMax78 = new ds.FPHeapMax(100);
        ds.Item[] itemArray79 = new ds.Item[] {};
        fPHeapMax78.copia(itemArray79);
        ds.FPHeapMax fPHeapMax82 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax82.constroi();
        ds.Item item84 = fPHeapMax82.max();
        fPHeapMax82.constroi();
        ds.Item item86 = fPHeapMax82.max();
        fPHeapMax82.imprime();
        ds.Item[] itemArray88 = new ds.Item[] {};
        fPHeapMax82.copia(itemArray88);
        fPHeapMax82.constroi();
        ds.FPHeapMax fPHeapMax92 = new ds.FPHeapMax(100);
        ds.Item[] itemArray93 = new ds.Item[] {};
        fPHeapMax92.copia(itemArray93);
        fPHeapMax82.copia(itemArray93);
        fPHeapMax78.copia(itemArray93);
        fPHeapMax70.copia(itemArray93);
        fPHeapMax55.copia(itemArray93);
        fPHeapMax1.copia(itemArray93);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNull(item57);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertNull(item84);
        org.junit.Assert.assertNull(item86);
        org.junit.Assert.assertNotNull(itemArray88);
        org.junit.Assert.assertNotNull(itemArray93);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(100);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray16);
        fPHeapMax5.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) '#');
        fPHeapMax21.constroi();
        ds.Item item23 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) '#');
        fPHeapMax29.imprime();
        ds.Item item31 = fPHeapMax29.max();
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax29.copia(itemArray33);
        fPHeapMax27.copia(itemArray33);
        fPHeapMax27.constroi();
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax39.constroi();
        ds.Item item41 = fPHeapMax39.max();
        fPHeapMax39.constroi();
        ds.Item item43 = fPHeapMax39.max();
        fPHeapMax39.imprime();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) '#');
        fPHeapMax46.imprime();
        ds.Item item48 = fPHeapMax46.max();
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax46.copia(itemArray50);
        fPHeapMax39.copia(itemArray50);
        fPHeapMax27.copia(itemArray50);
        fPHeapMax25.copia(itemArray50);
        fPHeapMax21.copia(itemArray50);
        fPHeapMax1.copia(itemArray50);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        ds.Item item10 = fPHeapMax8.max();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax8.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(100);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(100);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray20);
        fPHeapMax16.copia(itemArray20);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(100);
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray25);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax28.constroi();
        ds.Item item30 = fPHeapMax28.max();
        fPHeapMax28.constroi();
        ds.Item item32 = fPHeapMax28.max();
        fPHeapMax28.imprime();
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax28.copia(itemArray34);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax(100);
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax38.copia(itemArray39);
        fPHeapMax28.copia(itemArray39);
        fPHeapMax24.copia(itemArray39);
        fPHeapMax16.copia(itemArray39);
        fPHeapMax1.copia(itemArray39);
        fPHeapMax1.refaz((int) (short) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(100);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(100);
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray10);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.Item item17 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(100);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray24);
        fPHeapMax13.copia(itemArray24);
        fPHeapMax9.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '#');
        fPHeapMax11.imprime();
        ds.Item item13 = fPHeapMax11.max();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax11.copia(itemArray15);
        fPHeapMax5.copia(itemArray15);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax19.constroi();
        ds.Item item21 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) '#');
        fPHeapMax25.imprime();
        ds.Item item27 = fPHeapMax25.max();
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax25.copia(itemArray29);
        fPHeapMax19.copia(itemArray29);
        fPHeapMax5.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        fPHeapMax1.refaz((int) '#', (int) (byte) 1);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax43.constroi();
        ds.Item item45 = fPHeapMax43.max();
        fPHeapMax43.constroi();
        ds.Item item47 = fPHeapMax43.max();
        fPHeapMax43.imprime();
        ds.Item[] itemArray49 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray49);
        fPHeapMax41.copia(itemArray49);
        fPHeapMax39.copia(itemArray49);
        ds.Item item53 = fPHeapMax39.max();
        fPHeapMax39.imprime();
        fPHeapMax39.refaz((int) (short) 100, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax59.constroi();
        ds.Item item61 = fPHeapMax59.max();
        fPHeapMax59.imprime();
        fPHeapMax59.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax(100);
        ds.Item[] itemArray68 = new ds.Item[] {};
        fPHeapMax67.copia(itemArray68);
        fPHeapMax59.copia(itemArray68);
        fPHeapMax39.copia(itemArray68);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) itemArray68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNull(item61);
        org.junit.Assert.assertNotNull(itemArray68);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item15 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item18 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item20 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item22 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '#');
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        fPHeapMax15.imprime();
        ds.Item item17 = fPHeapMax15.max();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax15.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, (int) '#');
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.Item item14 = fPHeapMax9.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax16.constroi();
        ds.Item item18 = fPHeapMax16.max();
        fPHeapMax16.constroi();
        fPHeapMax16.constroi();
        ds.Item item21 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '#');
        fPHeapMax23.imprime();
        fPHeapMax23.constroi();
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) '#');
        fPHeapMax28.imprime();
        ds.Item item30 = fPHeapMax28.max();
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax28.copia(itemArray32);
        fPHeapMax23.copia(itemArray32);
        fPHeapMax16.copia(itemArray32);
        fPHeapMax9.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '#');
        fPHeapMax6.imprime();
        ds.Item item8 = fPHeapMax6.max();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax6.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '#');
        fPHeapMax11.imprime();
        fPHeapMax11.constroi();
        fPHeapMax11.constroi();
        fPHeapMax11.imprime();
        fPHeapMax11.constroi();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax19.constroi();
        ds.Item item21 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        ds.Item item23 = fPHeapMax19.max();
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax28.constroi();
        ds.Item item30 = fPHeapMax28.max();
        fPHeapMax28.imprime();
        fPHeapMax28.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(100);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray37);
        fPHeapMax28.copia(itemArray37);
        fPHeapMax19.copia(itemArray37);
        fPHeapMax11.copia(itemArray37);
        fPHeapMax11.imprime();
        fPHeapMax11.imprime();
        ds.Item item44 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax46.imprime();
        fPHeapMax46.imprime();
        ds.Item item49 = fPHeapMax46.max();
        fPHeapMax46.constroi();
        ds.Item item51 = fPHeapMax46.max();
        fPHeapMax46.imprime();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) '#');
        fPHeapMax54.imprime();
        ds.Item item56 = fPHeapMax54.max();
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax54.copia(itemArray58);
        ds.Item item60 = fPHeapMax54.max();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax62.imprime();
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax(100);
        ds.Item[] itemArray66 = new ds.Item[] {};
        fPHeapMax65.copia(itemArray66);
        fPHeapMax62.copia(itemArray66);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax(100);
        ds.Item[] itemArray71 = new ds.Item[] {};
        fPHeapMax70.copia(itemArray71);
        ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax74.constroi();
        ds.Item item76 = fPHeapMax74.max();
        fPHeapMax74.constroi();
        ds.Item item78 = fPHeapMax74.max();
        fPHeapMax74.imprime();
        ds.Item[] itemArray80 = new ds.Item[] {};
        fPHeapMax74.copia(itemArray80);
        fPHeapMax74.constroi();
        ds.FPHeapMax fPHeapMax84 = new ds.FPHeapMax(100);
        ds.Item[] itemArray85 = new ds.Item[] {};
        fPHeapMax84.copia(itemArray85);
        fPHeapMax74.copia(itemArray85);
        fPHeapMax70.copia(itemArray85);
        fPHeapMax62.copia(itemArray85);
        fPHeapMax54.copia(itemArray85);
        fPHeapMax46.copia(itemArray85);
        fPHeapMax11.copia(itemArray85);
        fPHeapMax1.copia(itemArray85);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNull(item49);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNull(item56);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNull(item60);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNull(item76);
        org.junit.Assert.assertNull(item78);
        org.junit.Assert.assertNotNull(itemArray80);
        org.junit.Assert.assertNotNull(itemArray85);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '#');
        fPHeapMax11.imprime();
        ds.Item item13 = fPHeapMax11.max();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax11.copia(itemArray15);
        ds.Item item17 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(100);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax(100);
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray28);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax31.constroi();
        ds.Item item33 = fPHeapMax31.max();
        fPHeapMax31.constroi();
        ds.Item item35 = fPHeapMax31.max();
        fPHeapMax31.imprime();
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax31.copia(itemArray37);
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(100);
        ds.Item[] itemArray42 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray42);
        fPHeapMax31.copia(itemArray42);
        fPHeapMax27.copia(itemArray42);
        fPHeapMax19.copia(itemArray42);
        fPHeapMax11.copia(itemArray42);
        fPHeapMax9.copia(itemArray42);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax50.constroi();
        ds.Item item52 = fPHeapMax50.max();
        fPHeapMax50.constroi();
        ds.Item item54 = fPHeapMax50.max();
        fPHeapMax50.imprime();
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) '#');
        fPHeapMax58.imprime();
        ds.Item item60 = fPHeapMax58.max();
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMax58.copia(itemArray62);
        fPHeapMax50.copia(itemArray62);
        fPHeapMax9.copia(itemArray62);
        fPHeapMax1.copia(itemArray62);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNull(item60);
        org.junit.Assert.assertNotNull(itemArray62);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.refaz((int) (short) 0, (-1));
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax8.constroi();
        ds.Item item10 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        ds.Item item12 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        fPHeapMax15.imprime();
        ds.Item item17 = fPHeapMax15.max();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax15.copia(itemArray19);
        fPHeapMax8.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax25.constroi();
        ds.Item item27 = fPHeapMax25.max();
        fPHeapMax25.constroi();
        ds.Item item29 = fPHeapMax25.max();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax34.constroi();
        ds.Item item36 = fPHeapMax34.max();
        fPHeapMax34.constroi();
        ds.Item item38 = fPHeapMax34.max();
        fPHeapMax34.imprime();
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax34.copia(itemArray40);
        fPHeapMax31.copia(itemArray40);
        fPHeapMax25.copia(itemArray40);
        ds.Item item44 = fPHeapMax25.max();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax(100);
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax46.copia(itemArray47);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax50.constroi();
        ds.Item item52 = fPHeapMax50.max();
        fPHeapMax50.constroi();
        ds.Item item54 = fPHeapMax50.max();
        fPHeapMax50.imprime();
        ds.Item[] itemArray56 = new ds.Item[] {};
        fPHeapMax50.copia(itemArray56);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax(100);
        ds.Item[] itemArray61 = new ds.Item[] {};
        fPHeapMax60.copia(itemArray61);
        fPHeapMax50.copia(itemArray61);
        fPHeapMax46.copia(itemArray61);
        fPHeapMax25.copia(itemArray61);
        fPHeapMax1.copia(itemArray61);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray61);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass5 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        fPHeapMax1.imprime();
        ds.Item item15 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        fPHeapMax9.imprime();
        ds.Item item11 = fPHeapMax9.max();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax9.copia(itemArray13);
        fPHeapMax7.copia(itemArray13);
        fPHeapMax7.constroi();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax19.constroi();
        ds.Item item21 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        ds.Item item23 = fPHeapMax19.max();
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) '#');
        fPHeapMax26.imprime();
        ds.Item item28 = fPHeapMax26.max();
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax26.copia(itemArray30);
        fPHeapMax19.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax5.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        ds.Item item36 = fPHeapMax1.max();
        ds.Item item37 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item36);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item20 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) '#');
        fPHeapMax25.imprime();
        ds.Item item27 = fPHeapMax25.max();
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax25.copia(itemArray29);
        ds.Item item31 = fPHeapMax25.max();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax33.imprime();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(100);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray37);
        fPHeapMax33.copia(itemArray37);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(100);
        ds.Item[] itemArray42 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray42);
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax45.constroi();
        ds.Item item47 = fPHeapMax45.max();
        fPHeapMax45.constroi();
        ds.Item item49 = fPHeapMax45.max();
        fPHeapMax45.imprime();
        ds.Item[] itemArray51 = new ds.Item[] {};
        fPHeapMax45.copia(itemArray51);
        fPHeapMax45.constroi();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax(100);
        ds.Item[] itemArray56 = new ds.Item[] {};
        fPHeapMax55.copia(itemArray56);
        fPHeapMax45.copia(itemArray56);
        fPHeapMax41.copia(itemArray56);
        fPHeapMax33.copia(itemArray56);
        fPHeapMax25.copia(itemArray56);
        fPHeapMax23.copia(itemArray56);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) itemArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNull(item49);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray56);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(100);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        fPHeapMax8.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax16.constroi();
        ds.Item item18 = fPHeapMax16.max();
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) '#');
        fPHeapMax22.imprime();
        ds.Item item24 = fPHeapMax22.max();
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax22.copia(itemArray26);
        fPHeapMax16.copia(itemArray26);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax30.constroi();
        ds.Item item32 = fPHeapMax30.max();
        fPHeapMax30.constroi();
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) '#');
        fPHeapMax36.imprime();
        ds.Item item38 = fPHeapMax36.max();
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax36.copia(itemArray40);
        fPHeapMax30.copia(itemArray40);
        fPHeapMax16.copia(itemArray40);
        fPHeapMax8.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.Item item9 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        ds.Item item11 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray13);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(100);
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray18);
        fPHeapMax7.copia(itemArray18);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(100);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray26);
        fPHeapMax22.copia(itemArray26);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax(100);
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray31);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax34.constroi();
        ds.Item item36 = fPHeapMax34.max();
        fPHeapMax34.constroi();
        ds.Item item38 = fPHeapMax34.max();
        fPHeapMax34.imprime();
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax34.copia(itemArray40);
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax(100);
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray45);
        fPHeapMax34.copia(itemArray45);
        fPHeapMax30.copia(itemArray45);
        fPHeapMax22.copia(itemArray45);
        fPHeapMax7.copia(itemArray45);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) fPHeapMax7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        fPHeapMax9.imprime();
        ds.Item item11 = fPHeapMax9.max();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax9.copia(itemArray13);
        fPHeapMax7.copia(itemArray13);
        fPHeapMax7.constroi();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax19.constroi();
        ds.Item item21 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        ds.Item item23 = fPHeapMax19.max();
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) '#');
        fPHeapMax26.imprime();
        ds.Item item28 = fPHeapMax26.max();
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax26.copia(itemArray30);
        fPHeapMax19.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax5.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        java.lang.Class<?> wildcardClass36 = itemArray30.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax1.copia(itemArray5);
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.Item item17 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) '#');
        fPHeapMax19.imprime();
        ds.Item item21 = fPHeapMax19.max();
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax19.copia(itemArray23);
        fPHeapMax13.copia(itemArray23);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax32.constroi();
        ds.Item item34 = fPHeapMax32.max();
        fPHeapMax32.constroi();
        ds.Item item36 = fPHeapMax32.max();
        fPHeapMax32.imprime();
        ds.Item[] itemArray38 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray38);
        fPHeapMax30.copia(itemArray38);
        fPHeapMax27.copia(itemArray38);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax(100);
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray44);
        fPHeapMax27.copia(itemArray44);
        fPHeapMax13.copia(itemArray44);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) itemArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '#');
        fPHeapMax11.imprime();
        ds.Item item13 = fPHeapMax11.max();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax11.copia(itemArray15);
        fPHeapMax5.copia(itemArray15);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax24.constroi();
        ds.Item item26 = fPHeapMax24.max();
        fPHeapMax24.constroi();
        ds.Item item28 = fPHeapMax24.max();
        fPHeapMax24.imprime();
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax19.copia(itemArray30);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax(100);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray36);
        fPHeapMax19.copia(itemArray36);
        fPHeapMax5.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item41 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.imprime();
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item20 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item22 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item22);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax20.constroi();
        ds.Item item22 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        ds.Item item24 = fPHeapMax20.max();
        fPHeapMax20.imprime();
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax15.copia(itemArray26);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(100);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax31.copia(itemArray32);
        fPHeapMax15.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.imprime();
        ds.Item item37 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item37);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray15);
        fPHeapMax9.constroi();
        ds.Item item18 = fPHeapMax9.max();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.Item item23 = fPHeapMax1.max();
        ds.Item item24 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = item24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item24);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(100);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(100);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray20);
        fPHeapMax16.copia(itemArray20);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(100);
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray25);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax28.constroi();
        ds.Item item30 = fPHeapMax28.max();
        fPHeapMax28.constroi();
        ds.Item item32 = fPHeapMax28.max();
        fPHeapMax28.imprime();
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax28.copia(itemArray34);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax(100);
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax38.copia(itemArray39);
        fPHeapMax28.copia(itemArray39);
        fPHeapMax24.copia(itemArray39);
        fPHeapMax16.copia(itemArray39);
        fPHeapMax1.copia(itemArray39);
        fPHeapMax1.refaz((int) (short) 0, (-1));
        ds.Item item48 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test682");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        fPHeapMax18.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(100);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax9.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item34 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) '#');
        fPHeapMax36.imprime();
        fPHeapMax36.constroi();
        fPHeapMax36.constroi();
        fPHeapMax36.imprime();
        fPHeapMax36.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax45.constroi();
        ds.Item item47 = fPHeapMax45.max();
        fPHeapMax45.constroi();
        ds.Item item49 = fPHeapMax45.max();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) '#');
        fPHeapMax51.imprime();
        ds.Item item53 = fPHeapMax51.max();
        ds.Item item54 = null;
        ds.Item[] itemArray55 = new ds.Item[] { item54 };
        fPHeapMax51.copia(itemArray55);
        fPHeapMax45.copia(itemArray55);
        fPHeapMax36.copia(itemArray55);
        ds.Item item59 = fPHeapMax36.max();
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) '#');
        fPHeapMax61.imprime();
        fPHeapMax61.constroi();
        fPHeapMax61.constroi();
        fPHeapMax61.imprime();
        fPHeapMax61.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax70.constroi();
        ds.Item item72 = fPHeapMax70.max();
        fPHeapMax70.constroi();
        ds.Item item74 = fPHeapMax70.max();
        ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((int) '#');
        fPHeapMax76.imprime();
        ds.Item item78 = fPHeapMax76.max();
        ds.Item item79 = null;
        ds.Item[] itemArray80 = new ds.Item[] { item79 };
        fPHeapMax76.copia(itemArray80);
        fPHeapMax70.copia(itemArray80);
        fPHeapMax61.copia(itemArray80);
        fPHeapMax36.copia(itemArray80);
        fPHeapMax1.copia(itemArray80);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item86 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNull(item49);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNull(item72);
        org.junit.Assert.assertNull(item74);
        org.junit.Assert.assertNull(item78);
        org.junit.Assert.assertNotNull(itemArray80);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test683");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass7 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test684");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 1);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) '#');
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax23.constroi();
        ds.Item item25 = fPHeapMax23.max();
        fPHeapMax23.constroi();
        ds.Item item27 = fPHeapMax23.max();
        fPHeapMax23.imprime();
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        fPHeapMax19.copia(itemArray29);
        fPHeapMax13.copia(itemArray29);
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) '#');
        fPHeapMax37.imprime();
        fPHeapMax37.constroi();
        fPHeapMax37.constroi();
        fPHeapMax37.imprime();
        fPHeapMax37.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax46.constroi();
        ds.Item item48 = fPHeapMax46.max();
        fPHeapMax46.constroi();
        ds.Item item50 = fPHeapMax46.max();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) '#');
        fPHeapMax52.imprime();
        ds.Item item54 = fPHeapMax52.max();
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax52.copia(itemArray56);
        fPHeapMax46.copia(itemArray56);
        fPHeapMax37.copia(itemArray56);
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax61.constroi();
        ds.Item item63 = fPHeapMax61.max();
        fPHeapMax61.constroi();
        ds.Item item65 = fPHeapMax61.max();
        fPHeapMax61.imprime();
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) '#');
        fPHeapMax68.imprime();
        ds.Item item70 = fPHeapMax68.max();
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        fPHeapMax68.copia(itemArray72);
        fPHeapMax61.copia(itemArray72);
        fPHeapMax37.copia(itemArray72);
        fPHeapMax13.copia(itemArray72);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) fPHeapMax13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNull(item63);
        org.junit.Assert.assertNull(item65);
        org.junit.Assert.assertNull(item70);
        org.junit.Assert.assertNotNull(itemArray72);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test685");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax7.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax24.imprime();
        fPHeapMax24.imprime();
        ds.Item item27 = fPHeapMax24.max();
        fPHeapMax24.constroi();
        ds.Item item29 = fPHeapMax24.max();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax(100);
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax34.copia(itemArray35);
        fPHeapMax31.copia(itemArray35);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax(100);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray40);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax43.constroi();
        ds.Item item45 = fPHeapMax43.max();
        fPHeapMax43.constroi();
        ds.Item item47 = fPHeapMax43.max();
        fPHeapMax43.imprime();
        ds.Item[] itemArray49 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray49);
        fPHeapMax43.constroi();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax(100);
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMax53.copia(itemArray54);
        fPHeapMax43.copia(itemArray54);
        fPHeapMax39.copia(itemArray54);
        fPHeapMax31.copia(itemArray54);
        fPHeapMax24.copia(itemArray54);
        fPHeapMax1.copia(itemArray54);
        ds.Item item61 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNull(item61);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test686");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test687");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(100);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(100);
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray10);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.Item item17 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(100);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray24);
        fPHeapMax13.copia(itemArray24);
        fPHeapMax9.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax35.constroi();
        ds.Item item37 = fPHeapMax35.max();
        fPHeapMax35.constroi();
        ds.Item item39 = fPHeapMax35.max();
        fPHeapMax35.imprime();
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray41);
        fPHeapMax33.copia(itemArray41);
        fPHeapMax30.copia(itemArray41);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax(100);
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax46.copia(itemArray47);
        fPHeapMax30.copia(itemArray47);
        fPHeapMax1.copia(itemArray47);
        fPHeapMax1.imprime();
        ds.Item item52 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNull(item52);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test688");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.Item item2 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test689");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, 0);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test690");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        fPHeapMax10.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(100);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.Item item23 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test691");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        fPHeapMax9.imprime();
        ds.Item item11 = fPHeapMax9.max();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item16 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test692");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        ds.Item item10 = fPHeapMax8.max();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax8.copia(itemArray12);
        fPHeapMax6.copia(itemArray12);
        fPHeapMax6.constroi();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        ds.Item item22 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) '#');
        fPHeapMax25.imprime();
        ds.Item item27 = fPHeapMax25.max();
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax25.copia(itemArray29);
        fPHeapMax18.copia(itemArray29);
        fPHeapMax6.copia(itemArray29);
        fPHeapMax4.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray29);
    }
}

