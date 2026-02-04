package ds.seed5503;

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
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax1.copia(itemArray11);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '#');
        fPHeapMax4.imprime();
        fPHeapMax4.imprime();
        fPHeapMax4.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray17);
        fPHeapMax11.copia(itemArray17);
        fPHeapMax4.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass23 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) '#');
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray18);
        fPHeapMax13.copia(itemArray18);
        fPHeapMax13.imprime();
        fPHeapMax13.imprime();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax13.copia(itemArray24);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) '#');
        fPHeapMax27.imprime();
        fPHeapMax27.imprime();
        fPHeapMax27.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax34.copia(itemArray35);
        fPHeapMax27.copia(itemArray35);
        fPHeapMax13.copia(itemArray35);
        fPHeapMax1.copia(itemArray35);
        ds.Item item40 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax44.refaz((int) (short) 1, 1);
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMax49.copia(itemArray50);
        fPHeapMax49.constroi();
        fPHeapMax49.refaz((int) (short) 10, (int) (short) -1);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) '#');
        fPHeapMax57.imprime();
        fPHeapMax57.imprime();
        fPHeapMax57.imprime();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) '#');
        fPHeapMax62.imprime();
        fPHeapMax62.constroi();
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray67 = new ds.Item[] {};
        fPHeapMax66.copia(itemArray67);
        fPHeapMax62.copia(itemArray67);
        fPHeapMax57.copia(itemArray67);
        fPHeapMax49.copia(itemArray67);
        fPHeapMax44.copia(itemArray67);
        fPHeapMax42.copia(itemArray67);
        fPHeapMax1.copia(itemArray67);
        fPHeapMax1.imprime();
        ds.Item item76 = fPHeapMax1.max();
        ds.Item item77 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNull(item76);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '#');
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        fPHeapMax4.copia(itemArray9);
        fPHeapMax4.imprime();
        fPHeapMax4.imprime();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax4.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.Item item18 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '#');
        fPHeapMax20.imprime();
        fPHeapMax20.imprime();
        fPHeapMax20.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        fPHeapMax20.imprime();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax20.copia(itemArray35);
        ds.Item item38 = fPHeapMax20.max();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) '#');
        fPHeapMax40.imprime();
        fPHeapMax40.constroi();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray45);
        fPHeapMax40.copia(itemArray45);
        fPHeapMax20.copia(itemArray45);
        fPHeapMax1.copia(itemArray45);
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) '#');
        fPHeapMax51.imprime();
        fPHeapMax51.imprime();
        fPHeapMax51.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray59 = new ds.Item[] {};
        fPHeapMax58.copia(itemArray59);
        fPHeapMax58.constroi();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray64 = new ds.Item[] {};
        fPHeapMax63.copia(itemArray64);
        fPHeapMax58.copia(itemArray64);
        fPHeapMax51.copia(itemArray64);
        fPHeapMax51.refaz((int) ' ', 0);
        fPHeapMax51.constroi();
        fPHeapMax51.imprime();
        ds.Item item73 = fPHeapMax51.max();
        ds.FPHeapMax fPHeapMax75 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax75.imprime();
        ds.FPHeapMax fPHeapMax78 = new ds.FPHeapMax((int) '#');
        fPHeapMax78.imprime();
        fPHeapMax78.constroi();
        ds.FPHeapMax fPHeapMax82 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray83 = new ds.Item[] {};
        fPHeapMax82.copia(itemArray83);
        fPHeapMax78.copia(itemArray83);
        fPHeapMax75.copia(itemArray83);
        fPHeapMax51.copia(itemArray83);
        fPHeapMax1.copia(itemArray83);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNull(item73);
        org.junit.Assert.assertNotNull(itemArray83);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        fPHeapMax7.copia(itemArray12);
        fPHeapMax7.imprime();
        fPHeapMax7.imprime();
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax7.copia(itemArray18);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) '#');
        fPHeapMax21.imprime();
        fPHeapMax21.imprime();
        fPHeapMax21.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax28.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        fPHeapMax7.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 1, 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray7);
        fPHeapMax6.constroi();
        fPHeapMax6.refaz((int) (short) 10, (int) (short) -1);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '#');
        fPHeapMax14.imprime();
        fPHeapMax14.imprime();
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) '#');
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray24);
        fPHeapMax19.copia(itemArray24);
        fPHeapMax14.copia(itemArray24);
        fPHeapMax6.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) '#');
        fPHeapMax31.imprime();
        fPHeapMax31.imprime();
        fPHeapMax31.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax38.copia(itemArray39);
        fPHeapMax31.copia(itemArray39);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) '#');
        fPHeapMax43.imprime();
        fPHeapMax43.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMax47.copia(itemArray48);
        fPHeapMax43.copia(itemArray48);
        fPHeapMax43.imprime();
        fPHeapMax43.imprime();
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        fPHeapMax43.copia(itemArray54);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) '#');
        fPHeapMax57.imprime();
        fPHeapMax57.imprime();
        fPHeapMax57.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray65 = new ds.Item[] {};
        fPHeapMax64.copia(itemArray65);
        fPHeapMax57.copia(itemArray65);
        fPHeapMax43.copia(itemArray65);
        fPHeapMax31.copia(itemArray65);
        fPHeapMax1.copia(itemArray65);
        fPHeapMax1.refaz(100, 0);
        ds.Item item74 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax77 = new ds.FPHeapMax((int) '#');
        fPHeapMax77.constroi();
        ds.FPHeapMax fPHeapMax80 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray81 = new ds.Item[] {};
        fPHeapMax80.copia(itemArray81);
        fPHeapMax77.copia(itemArray81);
        fPHeapMax1.copia(itemArray81);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item85 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNull(item74);
        org.junit.Assert.assertNotNull(itemArray81);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
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
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item19 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 64");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray14);
        fPHeapMax8.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        fPHeapMax1.refaz((int) ' ', 0);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item23 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax25.imprime();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) '#');
        fPHeapMax28.imprime();
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray33);
        fPHeapMax28.copia(itemArray33);
        fPHeapMax25.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        java.lang.Class<?> wildcardClass38 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.constroi();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        fPHeapMax7.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax20.refaz((int) (short) 1, 1);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray26);
        fPHeapMax25.constroi();
        fPHeapMax25.refaz((int) (short) 10, (int) (short) -1);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) '#');
        fPHeapMax33.imprime();
        fPHeapMax33.imprime();
        fPHeapMax33.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) '#');
        fPHeapMax38.imprime();
        fPHeapMax38.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMax42.copia(itemArray43);
        fPHeapMax38.copia(itemArray43);
        fPHeapMax33.copia(itemArray43);
        fPHeapMax25.copia(itemArray43);
        fPHeapMax20.copia(itemArray43);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) '#');
        fPHeapMax50.imprime();
        fPHeapMax50.imprime();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) '#');
        fPHeapMax54.imprime();
        fPHeapMax54.constroi();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray59 = new ds.Item[] {};
        fPHeapMax58.copia(itemArray59);
        fPHeapMax54.copia(itemArray59);
        fPHeapMax54.imprime();
        fPHeapMax54.imprime();
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax54.copia(itemArray65);
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) '#');
        fPHeapMax68.imprime();
        fPHeapMax68.imprime();
        fPHeapMax68.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax75 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray76 = new ds.Item[] {};
        fPHeapMax75.copia(itemArray76);
        fPHeapMax68.copia(itemArray76);
        fPHeapMax54.copia(itemArray76);
        fPHeapMax50.copia(itemArray76);
        fPHeapMax20.copia(itemArray76);
        fPHeapMax1.copia(itemArray76);
        ds.Item item83 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNull(item83);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz((int) 'a', (int) (short) 0);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '#');
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        fPHeapMax4.copia(itemArray9);
        fPHeapMax4.imprime();
        fPHeapMax4.imprime();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax4.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.constroi();
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.refaz((int) (byte) 10, 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) '#');
        fPHeapMax17.imprime();
        fPHeapMax17.imprime();
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) '#');
        fPHeapMax22.imprime();
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax22.copia(itemArray27);
        fPHeapMax17.copia(itemArray27);
        fPHeapMax13.copia(itemArray27);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) '#');
        fPHeapMax34.imprime();
        ds.Item item36 = fPHeapMax34.max();
        ds.Item item37 = fPHeapMax34.max();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray40);
        fPHeapMax34.copia(itemArray40);
        fPHeapMax13.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        ds.Item[] itemArray45 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) '#');
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray18);
        fPHeapMax13.copia(itemArray18);
        fPHeapMax13.imprime();
        fPHeapMax13.imprime();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax13.copia(itemArray24);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) '#');
        fPHeapMax27.imprime();
        fPHeapMax27.imprime();
        fPHeapMax27.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax34.copia(itemArray35);
        fPHeapMax27.copia(itemArray35);
        fPHeapMax13.copia(itemArray35);
        fPHeapMax1.copia(itemArray35);
        ds.Item item40 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax44.refaz((int) (short) 1, 1);
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMax49.copia(itemArray50);
        fPHeapMax49.constroi();
        fPHeapMax49.refaz((int) (short) 10, (int) (short) -1);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) '#');
        fPHeapMax57.imprime();
        fPHeapMax57.imprime();
        fPHeapMax57.imprime();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) '#');
        fPHeapMax62.imprime();
        fPHeapMax62.constroi();
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray67 = new ds.Item[] {};
        fPHeapMax66.copia(itemArray67);
        fPHeapMax62.copia(itemArray67);
        fPHeapMax57.copia(itemArray67);
        fPHeapMax49.copia(itemArray67);
        fPHeapMax44.copia(itemArray67);
        fPHeapMax42.copia(itemArray67);
        fPHeapMax1.copia(itemArray67);
        fPHeapMax1.imprime();
        ds.Item item76 = fPHeapMax1.max();
        ds.Item item77 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNull(item76);
        org.junit.Assert.assertNull(item77);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) '#');
        fPHeapMax13.imprime();
        fPHeapMax13.imprime();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) '#');
        fPHeapMax18.imprime();
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray23);
        fPHeapMax18.copia(itemArray23);
        fPHeapMax13.copia(itemArray23);
        fPHeapMax9.copia(itemArray23);
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) '#');
        fPHeapMax30.imprime();
        ds.Item item32 = fPHeapMax30.max();
        ds.Item item33 = fPHeapMax30.max();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray36);
        fPHeapMax30.copia(itemArray36);
        fPHeapMax9.copia(itemArray36);
        fPHeapMax7.copia(itemArray36);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) '#');
        fPHeapMax42.imprime();
        fPHeapMax42.imprime();
        fPHeapMax42.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMax49.copia(itemArray50);
        fPHeapMax49.constroi();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray55 = new ds.Item[] {};
        fPHeapMax54.copia(itemArray55);
        fPHeapMax49.copia(itemArray55);
        fPHeapMax42.copia(itemArray55);
        fPHeapMax7.copia(itemArray55);
        fPHeapMax1.copia(itemArray55);
        ds.Item item61 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray55);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) '#');
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray18);
        fPHeapMax13.copia(itemArray18);
        fPHeapMax13.imprime();
        fPHeapMax13.imprime();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax13.copia(itemArray24);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) '#');
        fPHeapMax27.imprime();
        fPHeapMax27.imprime();
        fPHeapMax27.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax34.copia(itemArray35);
        fPHeapMax27.copia(itemArray35);
        fPHeapMax13.copia(itemArray35);
        fPHeapMax1.copia(itemArray35);
        ds.Item item40 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item42 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item42);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '#');
        fPHeapMax6.imprime();
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '#');
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray15);
        fPHeapMax10.copia(itemArray15);
        fPHeapMax10.imprime();
        fPHeapMax10.imprime();
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax10.copia(itemArray21);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) '#');
        fPHeapMax24.imprime();
        fPHeapMax24.imprime();
        fPHeapMax24.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax31.copia(itemArray32);
        fPHeapMax24.copia(itemArray32);
        fPHeapMax10.copia(itemArray32);
        fPHeapMax6.copia(itemArray32);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) '#');
        fPHeapMax39.imprime();
        fPHeapMax39.imprime();
        fPHeapMax39.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax46.copia(itemArray47);
        fPHeapMax39.copia(itemArray47);
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) '#');
        fPHeapMax51.imprime();
        fPHeapMax51.constroi();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray56 = new ds.Item[] {};
        fPHeapMax55.copia(itemArray56);
        fPHeapMax51.copia(itemArray56);
        fPHeapMax51.imprime();
        fPHeapMax51.imprime();
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMax51.copia(itemArray62);
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) '#');
        fPHeapMax65.imprime();
        fPHeapMax65.imprime();
        fPHeapMax65.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax72 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray73 = new ds.Item[] {};
        fPHeapMax72.copia(itemArray73);
        fPHeapMax65.copia(itemArray73);
        fPHeapMax51.copia(itemArray73);
        fPHeapMax39.copia(itemArray73);
        fPHeapMax6.copia(itemArray73);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) itemArray73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray73);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
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
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (short) 1, (-1));
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray6);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray11);
        fPHeapMax5.copia(itemArray11);
        fPHeapMax5.imprime();
        fPHeapMax5.imprime();
        fPHeapMax5.imprime();
        ds.Item item17 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray20);
        fPHeapMax19.constroi();
        fPHeapMax19.refaz((int) (short) 10, (int) (short) -1);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) '#');
        fPHeapMax27.imprime();
        fPHeapMax27.imprime();
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) '#');
        fPHeapMax32.imprime();
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray37);
        fPHeapMax32.copia(itemArray37);
        fPHeapMax27.copia(itemArray37);
        fPHeapMax19.copia(itemArray37);
        fPHeapMax5.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) '#');
        fPHeapMax45.imprime();
        ds.Item item47 = fPHeapMax45.max();
        ds.Item item48 = fPHeapMax45.max();
        ds.Item item49 = fPHeapMax45.max();
        fPHeapMax45.imprime();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) 'a');
        ds.Item item55 = fPHeapMax54.max();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax57.imprime();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) '#');
        fPHeapMax60.imprime();
        fPHeapMax60.constroi();
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray65 = new ds.Item[] {};
        fPHeapMax64.copia(itemArray65);
        fPHeapMax60.copia(itemArray65);
        fPHeapMax57.copia(itemArray65);
        fPHeapMax54.copia(itemArray65);
        fPHeapMax52.copia(itemArray65);
        fPHeapMax45.copia(itemArray65);
        fPHeapMax1.copia(itemArray65);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax75 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray76 = new ds.Item[] {};
        fPHeapMax75.copia(itemArray76);
        fPHeapMax75.constroi();
        ds.FPHeapMax fPHeapMax80 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray81 = new ds.Item[] {};
        fPHeapMax80.copia(itemArray81);
        fPHeapMax75.copia(itemArray81);
        fPHeapMax1.copia(itemArray81);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNull(item49);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNotNull(itemArray81);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.refaz((int) (short) 1, 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray7);
        fPHeapMax6.constroi();
        fPHeapMax6.refaz((int) (short) 10, (int) (short) -1);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '#');
        fPHeapMax14.imprime();
        fPHeapMax14.imprime();
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) '#');
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray24);
        fPHeapMax19.copia(itemArray24);
        fPHeapMax14.copia(itemArray24);
        fPHeapMax6.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) '#');
        fPHeapMax31.imprime();
        fPHeapMax31.imprime();
        fPHeapMax31.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax38.copia(itemArray39);
        fPHeapMax31.copia(itemArray39);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) '#');
        fPHeapMax43.imprime();
        fPHeapMax43.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMax47.copia(itemArray48);
        fPHeapMax43.copia(itemArray48);
        fPHeapMax43.imprime();
        fPHeapMax43.imprime();
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        fPHeapMax43.copia(itemArray54);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) '#');
        fPHeapMax57.imprime();
        fPHeapMax57.imprime();
        fPHeapMax57.refaz((int) ' ', (int) (short) -1);
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) '#');
        ds.Item[] itemArray65 = new ds.Item[] {};
        fPHeapMax64.copia(itemArray65);
        fPHeapMax57.copia(itemArray65);
        fPHeapMax43.copia(itemArray65);
        fPHeapMax31.copia(itemArray65);
        fPHeapMax1.copia(itemArray65);
        fPHeapMax1.refaz(100, 0);
        ds.Item item74 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass76 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNull(item74);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }
}

