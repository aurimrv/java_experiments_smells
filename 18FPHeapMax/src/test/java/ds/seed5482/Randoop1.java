package ds.seed5482;

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
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) 'a');
        fPHeapMax12.refaz(0, (int) (short) -1);
        ds.Item item16 = fPHeapMax12.max();
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray20);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray24);
        fPHeapMax19.copia(itemArray24);
        fPHeapMax12.copia(itemArray24);
        fPHeapMax10.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) '4', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item34 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray10);
        fPHeapMax9.imprime();
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray13);
        fPHeapMax7.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.refaz((int) (short) 10, 1);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(1);
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) fPHeapMax7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) (short) 100, (int) (byte) 0);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass12 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 0, (-1));
        fPHeapMax1.imprime();
        ds.Item item9 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass10 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray7);
        fPHeapMax6.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray10);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) 'a');
        fPHeapMax13.refaz(0, (int) (short) -1);
        ds.Item item17 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray21);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray25);
        fPHeapMax20.copia(itemArray25);
        fPHeapMax13.copia(itemArray25);
        fPHeapMax6.copia(itemArray25);
        fPHeapMax1.copia(itemArray25);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) 'a');
        fPHeapMax12.refaz(0, (int) (short) -1);
        ds.Item item16 = fPHeapMax12.max();
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray20);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray24);
        fPHeapMax19.copia(itemArray24);
        fPHeapMax12.copia(itemArray24);
        fPHeapMax10.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) '4');
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) 'a');
        fPHeapMax39.refaz(0, (int) (short) -1);
        ds.Item item43 = fPHeapMax39.max();
        ds.Item item44 = fPHeapMax39.max();
        fPHeapMax39.imprime();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMax47.copia(itemArray48);
        fPHeapMax39.copia(itemArray48);
        fPHeapMax37.copia(itemArray48);
        fPHeapMax34.copia(itemArray48);
        java.lang.Class<?> wildcardClass53 = itemArray48.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) itemArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) 'a');
        fPHeapMax10.refaz(0, (int) (short) -1);
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray18);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax21.copia(itemArray22);
        fPHeapMax17.copia(itemArray22);
        fPHeapMax10.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) 'a');
        fPHeapMax5.refaz(0, (int) (short) -1);
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray13);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray17);
        fPHeapMax12.copia(itemArray17);
        fPHeapMax5.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.Item item22 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item24 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item24);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) 'a');
        fPHeapMax19.refaz(0, (int) (short) -1);
        ds.Item item23 = fPHeapMax19.max();
        fPHeapMax19.imprime();
        ds.Item item25 = fPHeapMax19.max();
        ds.Item item26 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item30 = fPHeapMax29.max();
        ds.Item item31 = fPHeapMax29.max();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) 'a');
        fPHeapMax33.refaz(0, (int) (short) -1);
        ds.Item item37 = fPHeapMax33.max();
        fPHeapMax33.constroi();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMax40.copia(itemArray41);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray45);
        fPHeapMax40.copia(itemArray45);
        fPHeapMax33.copia(itemArray45);
        fPHeapMax29.copia(itemArray45);
        fPHeapMax19.copia(itemArray45);
        fPHeapMax1.copia(itemArray45);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        ds.Item item7 = fPHeapMax1.max();
        ds.Item item8 = fPHeapMax1.max();
        ds.Item item9 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass11 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) (short) 100, (int) (byte) 0);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 1, 0);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass10 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) 'a');
        fPHeapMax9.refaz(0, (int) (short) -1);
        ds.Item item13 = fPHeapMax9.max();
        ds.Item item14 = fPHeapMax9.max();
        ds.Item item15 = fPHeapMax9.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) 'a');
        fPHeapMax17.constroi();
        fPHeapMax17.refaz((int) '4', (int) (short) 1);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray24);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray28);
        fPHeapMax23.copia(itemArray28);
        fPHeapMax17.copia(itemArray28);
        fPHeapMax9.copia(itemArray28);
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) 'a');
        fPHeapMax37.refaz(0, (int) (short) -1);
        ds.Item item41 = fPHeapMax37.max();
        fPHeapMax37.constroi();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray45);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray49 = new ds.Item[] {};
        fPHeapMax48.copia(itemArray49);
        fPHeapMax44.copia(itemArray49);
        fPHeapMax37.copia(itemArray49);
        fPHeapMax35.copia(itemArray49);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray56 = new ds.Item[] {};
        fPHeapMax55.copia(itemArray56);
        fPHeapMax55.imprime();
        ds.Item[] itemArray59 = new ds.Item[] {};
        fPHeapMax55.copia(itemArray59);
        fPHeapMax35.copia(itemArray59);
        fPHeapMax9.copia(itemArray59);
        fPHeapMax6.copia(itemArray59);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) itemArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray59);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) 'a');
        fPHeapMax4.refaz(0, (int) (short) -1);
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray16);
        fPHeapMax11.copia(itemArray16);
        fPHeapMax4.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(1);
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) 'a');
        fPHeapMax25.refaz(0, (int) (short) -1);
        ds.Item item29 = fPHeapMax25.max();
        fPHeapMax25.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray33);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray37);
        fPHeapMax32.copia(itemArray37);
        fPHeapMax25.copia(itemArray37);
        fPHeapMax22.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        fPHeapMax1.imprime();
        ds.Item item44 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass45 = item44.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item44);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        ds.Item item7 = fPHeapMax1.max();
        ds.Item item8 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) 'a');
        fPHeapMax11.refaz(0, (int) (short) -1);
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray23);
        fPHeapMax18.copia(itemArray23);
        fPHeapMax11.copia(itemArray23);
        fPHeapMax11.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) fPHeapMax11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) -1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) 'a');
        fPHeapMax7.refaz(0, (int) (short) -1);
        ds.Item item11 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray15);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        fPHeapMax14.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax3.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item29 = fPHeapMax28.max();
        ds.Item item30 = fPHeapMax28.max();
        fPHeapMax28.imprime();
        fPHeapMax28.imprime();
        ds.Item item33 = fPHeapMax28.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) item33);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNull(item33);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) 'a');
        fPHeapMax4.refaz(0, (int) (short) -1);
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) 'a');
        fPHeapMax15.refaz(0, (int) (short) -1);
        ds.Item item19 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray23);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax22.copia(itemArray27);
        fPHeapMax15.copia(itemArray27);
        fPHeapMax13.copia(itemArray27);
        fPHeapMax4.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        fPHeapMax11.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.Item item22 = fPHeapMax1.max();
        ds.Item item23 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        ds.Item item18 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item20 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) 'a');
        fPHeapMax12.refaz(0, (int) (short) -1);
        ds.Item item16 = fPHeapMax12.max();
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray20);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray24);
        fPHeapMax19.copia(itemArray24);
        fPHeapMax12.copia(itemArray24);
        fPHeapMax10.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 0);
        ds.Item item33 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) 'a');
        fPHeapMax5.refaz(0, (int) (short) -1);
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray13);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray17);
        fPHeapMax12.copia(itemArray17);
        fPHeapMax5.copia(itemArray17);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray23);
        fPHeapMax22.imprime();
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray26);
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) 'a');
        fPHeapMax32.refaz(0, (int) (short) -1);
        ds.Item item36 = fPHeapMax32.max();
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray40);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray44);
        fPHeapMax39.copia(itemArray44);
        fPHeapMax32.copia(itemArray44);
        fPHeapMax30.copia(itemArray44);
        fPHeapMax22.copia(itemArray44);
        fPHeapMax5.copia(itemArray44);
        fPHeapMax1.copia(itemArray44);
        java.lang.Class<?> wildcardClass52 = itemArray44.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray4);
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) 'a');
        fPHeapMax9.constroi();
        fPHeapMax9.refaz((int) '4', (int) (short) 1);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray16);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray20);
        fPHeapMax15.copia(itemArray20);
        fPHeapMax9.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) '4', (int) (short) 10);
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(1);
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) 'a');
        fPHeapMax7.refaz(0, (int) (short) -1);
        ds.Item item11 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray15);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        fPHeapMax14.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax4.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item27 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item27);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) '4', (int) (short) 1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) 'a');
        fPHeapMax4.refaz(0, (int) (short) -1);
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray16);
        fPHeapMax11.copia(itemArray16);
        fPHeapMax4.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(1);
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) 'a');
        fPHeapMax25.refaz(0, (int) (short) -1);
        ds.Item item29 = fPHeapMax25.max();
        fPHeapMax25.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray33);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray37);
        fPHeapMax32.copia(itemArray37);
        fPHeapMax25.copia(itemArray37);
        fPHeapMax22.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        fPHeapMax1.imprime();
        ds.Item item44 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item44);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        ds.Item item18 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (short) 0);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item24 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        fPHeapMax8.imprime();
        ds.Item item12 = fPHeapMax8.max();
        ds.Item item13 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) fPHeapMax8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(1);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(1);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) 'a');
        fPHeapMax11.refaz(0, (int) (short) -1);
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) -1);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray23);
        fPHeapMax18.copia(itemArray23);
        fPHeapMax11.copia(itemArray23);
        fPHeapMax8.copia(itemArray23);
        fPHeapMax5.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
    }
}

