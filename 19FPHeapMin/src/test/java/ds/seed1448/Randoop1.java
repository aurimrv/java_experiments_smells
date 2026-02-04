package ds.seed1448;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0501");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin14.copia(itemArray15);
        fPHeapMin12.copia(itemArray15);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        fPHeapMin12.copia(itemArray21);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin12.refaz((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0502");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) (byte) 10, 10);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin10.imprime();
        fPHeapMin10.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin10.copia(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray15);
        fPHeapMin20.constroi();
        fPHeapMin20.constroi();
        ds.Item[] itemArray23 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
        fPHeapMin30.refaz(1, 0);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMin30.copia(itemArray34);
        fPHeapMin28.copia(itemArray34);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray34);
        fPHeapMin26.copia(itemArray34);
        ds.Item[] itemArray39 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray39);
        fPHeapMin26.copia(itemArray39);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray39);
        fPHeapMin20.copia(itemArray39);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(100);
        fPHeapMin47.refaz(1, 0);
        fPHeapMin47.constroi();
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin53.imprime();
        fPHeapMin53.constroi();
        fPHeapMin53.constroi();
        fPHeapMin53.imprime();
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin59.imprime();
        fPHeapMin59.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray64 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray64);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray64);
        fPHeapMin59.copia(itemArray64);
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(itemArray64);
        fPHeapMin53.copia(itemArray64);
        fPHeapMin47.copia(itemArray64);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(itemArray64);
        fPHeapMin20.copia(itemArray64);
        fPHeapMin1.copia(itemArray64);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item74 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray64);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0503");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) ' ', (int) (short) 0);
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item8 = fPHeapMin1.min();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0504");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz(1, 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray7);
        fPHeapMin12.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin12.refaz(100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0505");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin7.imprime();
        fPHeapMin7.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        fPHeapMin7.copia(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        fPHeapMin17.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) -1, (java.lang.Object) fPHeapMin17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0506");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin16.diminuiChave((int) '4', (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0507");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz((int) (short) 1, 0);
        ds.Item item7 = fPHeapMin3.min();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz(1, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray15);
        fPHeapMin9.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin3.copia(itemArray15);
        fPHeapMin1.copia(itemArray15);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item22 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0508");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMin5.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0509");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz(1, 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
        fPHeapMin17.refaz(1, 0);
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMin17.copia(itemArray21);
        fPHeapMin15.copia(itemArray21);
        fPHeapMin13.copia(itemArray21);
        fPHeapMin13.constroi();
        fPHeapMin13.constroi();
        java.lang.Class<?> wildcardClass27 = fPHeapMin13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin10.diminuiChave((int) 'a', (java.lang.Object) fPHeapMin13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0510");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin11.diminuiChave((int) 'a', (java.lang.Object) fPHeapMin14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0511");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin14.copia(itemArray15);
        fPHeapMin12.copia(itemArray15);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        fPHeapMin12.copia(itemArray21);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray24);
        fPHeapMin12.copia(itemArray24);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        fPHeapMin12.copia(itemArray32);
        fPHeapMin12.constroi();
        fPHeapMin12.imprime();
        fPHeapMin12.imprime();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0512");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz(1, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray11);
        fPHeapMin5.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin3.copia(itemArray11);
        fPHeapMin3.constroi();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin18.constroi();
        ds.Item item20 = fPHeapMin18.min();
        fPHeapMin18.constroi();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        fPHeapMin25.refaz(1, 0);
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMin25.copia(itemArray29);
        fPHeapMin23.copia(itemArray29);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray29);
        fPHeapMin18.copia(itemArray29);
        fPHeapMin3.copia(itemArray29);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item35 = fPHeapMin3.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0513");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        fPHeapMin1.copia(itemArray4);
        ds.Item item6 = fPHeapMin1.min();
        ds.Item item7 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0514");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin14.copia(itemArray15);
        fPHeapMin12.copia(itemArray15);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        fPHeapMin12.copia(itemArray21);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item24 = fPHeapMin12.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0515");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0516");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        ds.Item item4 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0517");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0518");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.refaz((int) (short) 1, 0);
        ds.Item item8 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz(1, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        fPHeapMin1.refaz((int) (short) 1, 0);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
        fPHeapMin27.refaz(1, 0);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(100);
        fPHeapMin36.refaz(1, 0);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMin36.copia(itemArray40);
        fPHeapMin34.copia(itemArray40);
        fPHeapMin32.copia(itemArray40);
        ds.Item item44 = fPHeapMin32.min();
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin46.imprime();
        fPHeapMin46.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray51 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray51);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray51);
        fPHeapMin46.copia(itemArray51);
        fPHeapMin32.copia(itemArray51);
        fPHeapMin27.copia(itemArray51);
        fPHeapMin1.copia(itemArray51);
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray51);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item59 = fPHeapMin58.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0519");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass4 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0520");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin6.imprime();
        fPHeapMin6.constroi();
        fPHeapMin6.constroi();
        fPHeapMin6.imprime();
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item14 = fPHeapMin13.min();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        fPHeapMin16.refaz((int) (short) 1, 0);
        ds.Item item20 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
        fPHeapMin24.refaz(1, 0);
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMin24.copia(itemArray28);
        fPHeapMin22.copia(itemArray28);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray28);
        fPHeapMin16.copia(itemArray28);
        fPHeapMin13.copia(itemArray28);
        fPHeapMin6.copia(itemArray28);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray28);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((-1), (java.lang.Object) fPHeapMin35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0521");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz(1, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray11);
        fPHeapMin5.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin3.copia(itemArray16);
        fPHeapMin3.imprime();
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin3.insere(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0522");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        fPHeapMin1.imprime();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0523");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin8.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
        fPHeapMin22.refaz(1, 0);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin22.copia(itemArray26);
        fPHeapMin20.copia(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray26);
        fPHeapMin1.copia(itemArray26);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
        fPHeapMin34.refaz((int) (short) 1, 0);
        ds.Item item38 = fPHeapMin34.min();
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
        fPHeapMin42.refaz(1, 0);
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMin42.copia(itemArray46);
        fPHeapMin40.copia(itemArray46);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray46);
        fPHeapMin34.copia(itemArray46);
        fPHeapMin32.copia(itemArray46);
        fPHeapMin1.copia(itemArray46);
        ds.Item item53 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item56 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNull(item53);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0524");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0525");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.constroi();
        fPHeapMin8.constroi();
        ds.Item item12 = fPHeapMin8.min();
        fPHeapMin8.refaz((int) (short) 1, (int) (short) 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        fPHeapMin23.refaz(1, 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        fPHeapMin19.copia(itemArray27);
        fPHeapMin8.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray27);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item35 = fPHeapMin34.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0526");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin6.imprime();
        fPHeapMin6.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin6.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray20);
        fPHeapMin19.copia(itemArray20);
        fPHeapMin17.copia(itemArray20);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        fPHeapMin17.copia(itemArray26);
        ds.Item[] itemArray29 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray29);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray29);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray29);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray29);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray29);
        fPHeapMin17.copia(itemArray29);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray37);
        fPHeapMin17.copia(itemArray37);
        fPHeapMin17.constroi();
        java.lang.Class<?> wildcardClass41 = fPHeapMin17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(100, (java.lang.Object) wildcardClass41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0527");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0528");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0529");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin3.imprime();
        fPHeapMin3.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin3.copia(itemArray8);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray8);
        fPHeapMin15.imprime();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
        fPHeapMin22.refaz(1, 0);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin22.copia(itemArray26);
        fPHeapMin20.copia(itemArray26);
        fPHeapMin18.copia(itemArray26);
        fPHeapMin15.copia(itemArray26);
        fPHeapMin1.copia(itemArray26);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0530");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0531");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0532");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0533");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item15 = fPHeapMin1.min();
        ds.Item item16 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item18 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0534");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) ' ', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0535");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0536");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.refaz((int) (short) 100, 0);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin10.imprime();
        fPHeapMin10.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin10.copia(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        fPHeapMin23.copia(itemArray24);
        fPHeapMin21.copia(itemArray24);
        ds.Item[] itemArray30 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        fPHeapMin21.copia(itemArray30);
        ds.Item[] itemArray33 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray33);
        fPHeapMin21.copia(itemArray33);
        fPHeapMin1.copia(itemArray33);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
        fPHeapMin42.refaz((int) (short) 1, 0);
        ds.Item item46 = fPHeapMin42.min();
        fPHeapMin42.constroi();
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin49.imprime();
        fPHeapMin49.constroi();
        fPHeapMin49.constroi();
        ds.Item item53 = fPHeapMin49.min();
        fPHeapMin49.refaz((int) (short) 1, (int) (short) 0);
        ds.Item[] itemArray57 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray57);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray57);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray57);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(100);
        fPHeapMin64.refaz(1, 0);
        ds.Item[] itemArray68 = new ds.Item[] {};
        fPHeapMin64.copia(itemArray68);
        fPHeapMin62.copia(itemArray68);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(itemArray68);
        fPHeapMin60.copia(itemArray68);
        fPHeapMin49.copia(itemArray68);
        fPHeapMin42.copia(itemArray68);
        fPHeapMin1.copia(itemArray68);
        ds.FPHeapMin fPHeapMin76 = new ds.FPHeapMin(itemArray68);
        ds.FPHeapMin fPHeapMin77 = new ds.FPHeapMin(itemArray68);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin77.refaz((int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray68);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0537");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) (short) 1, (int) (short) 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        fPHeapMin16.refaz(1, 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray20);
        fPHeapMin14.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray20);
        fPHeapMin12.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        java.lang.Class<?> wildcardClass26 = itemArray20.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0538");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray6);
        fPHeapMin13.imprime();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
        fPHeapMin20.refaz(1, 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin20.copia(itemArray24);
        fPHeapMin18.copia(itemArray24);
        fPHeapMin16.copia(itemArray24);
        fPHeapMin13.copia(itemArray24);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray24);
        fPHeapMin29.constroi();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0539");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin15.refaz(100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0540");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0541");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0542");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        ds.Item item7 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0543");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin6.imprime();
        ds.Item item8 = fPHeapMin6.min();
        fPHeapMin6.imprime();
        fPHeapMin6.constroi();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz((int) (short) 1, 0);
        ds.Item item16 = fPHeapMin12.min();
        fPHeapMin12.constroi();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin19.imprime();
        fPHeapMin19.constroi();
        fPHeapMin19.constroi();
        ds.Item item23 = fPHeapMin19.min();
        fPHeapMin19.refaz((int) (short) 1, (int) (short) 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
        fPHeapMin34.refaz(1, 0);
        ds.Item[] itemArray38 = new ds.Item[] {};
        fPHeapMin34.copia(itemArray38);
        fPHeapMin32.copia(itemArray38);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray38);
        fPHeapMin30.copia(itemArray38);
        fPHeapMin19.copia(itemArray38);
        fPHeapMin12.copia(itemArray38);
        fPHeapMin6.copia(itemArray38);
        java.lang.Class<?> wildcardClass46 = fPHeapMin6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin3.diminuiChave((-1), (java.lang.Object) wildcardClass46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0544");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((-1), obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0545");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        fPHeapMin11.constroi();
        fPHeapMin11.constroi();
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        fPHeapMin21.refaz(1, 0);
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray25);
        fPHeapMin19.copia(itemArray25);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray25);
        fPHeapMin17.copia(itemArray25);
        ds.Item[] itemArray30 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray30);
        fPHeapMin17.copia(itemArray30);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray30);
        fPHeapMin11.copia(itemArray30);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray30);
        fPHeapMin37.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item39 = fPHeapMin37.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0546");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        fPHeapMin9.refaz(1, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin19.imprime();
        fPHeapMin19.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        fPHeapMin19.copia(itemArray24);
        fPHeapMin1.copia(itemArray24);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item29 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0547");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item16 = fPHeapMin15.min();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.refaz((int) (short) 1, 0);
        ds.Item item22 = fPHeapMin18.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
        fPHeapMin26.refaz(1, 0);
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray30);
        fPHeapMin24.copia(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray30);
        fPHeapMin18.copia(itemArray30);
        fPHeapMin15.copia(itemArray30);
        fPHeapMin15.refaz((int) (short) 1, 0);
        fPHeapMin15.constroi();
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
        fPHeapMin41.refaz(1, 0);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
        fPHeapMin50.refaz(1, 0);
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMin50.copia(itemArray54);
        fPHeapMin48.copia(itemArray54);
        fPHeapMin46.copia(itemArray54);
        ds.Item item58 = fPHeapMin46.min();
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin60.imprime();
        fPHeapMin60.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray65 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray65);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray65);
        fPHeapMin60.copia(itemArray65);
        fPHeapMin46.copia(itemArray65);
        fPHeapMin41.copia(itemArray65);
        fPHeapMin15.copia(itemArray65);
        ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(itemArray65);
        fPHeapMin1.copia(itemArray65);
        java.lang.Class<?> wildcardClass74 = itemArray65.getClass();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNull(item58);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0548");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0549");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item15 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0550");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin6.imprime();
        fPHeapMin6.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin6.copia(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.Item item23 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0551");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0552");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.diminuiChave((int) ' ', (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0553");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin6.imprime();
        fPHeapMin6.constroi();
        fPHeapMin6.constroi();
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin12.imprime();
        fPHeapMin12.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray17 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        fPHeapMin12.copia(itemArray17);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray17);
        fPHeapMin6.copia(itemArray17);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray17);
        fPHeapMin1.copia(itemArray17);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0554");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.refaz(0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMin2.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0555");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin7.imprime();
        fPHeapMin7.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        fPHeapMin7.copia(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0556");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray6);
        fPHeapMin13.imprime();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
        fPHeapMin20.refaz(1, 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin20.copia(itemArray24);
        fPHeapMin18.copia(itemArray24);
        fPHeapMin16.copia(itemArray24);
        fPHeapMin13.copia(itemArray24);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray24);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item30 = fPHeapMin29.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0557");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        fPHeapMin11.constroi();
        fPHeapMin11.constroi();
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        fPHeapMin21.refaz(1, 0);
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray25);
        fPHeapMin19.copia(itemArray25);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray25);
        fPHeapMin17.copia(itemArray25);
        ds.Item[] itemArray30 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray30);
        fPHeapMin17.copia(itemArray30);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray30);
        fPHeapMin11.copia(itemArray30);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
        fPHeapMin38.refaz(1, 0);
        fPHeapMin38.constroi();
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin44.imprime();
        fPHeapMin44.constroi();
        fPHeapMin44.constroi();
        fPHeapMin44.imprime();
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin50.imprime();
        fPHeapMin50.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray55 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray55);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray55);
        fPHeapMin50.copia(itemArray55);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray55);
        fPHeapMin44.copia(itemArray55);
        fPHeapMin38.copia(itemArray55);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray55);
        fPHeapMin11.copia(itemArray55);
        ds.Item item64 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin11.insere(item64);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray55);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0558");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
        fPHeapMin10.refaz(1, 0);
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray14);
        fPHeapMin8.copia(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray14);
        fPHeapMin6.copia(itemArray14);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray14);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) -1, (java.lang.Object) itemArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0559");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.refaz((int) 'a', (int) (byte) 1);
        fPHeapMin1.imprime();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0560");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.refaz((int) (short) 1, 0);
        ds.Item item8 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz(1, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        fPHeapMin1.refaz((int) (short) 1, 0);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
        fPHeapMin27.refaz(1, 0);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(100);
        fPHeapMin36.refaz(1, 0);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMin36.copia(itemArray40);
        fPHeapMin34.copia(itemArray40);
        fPHeapMin32.copia(itemArray40);
        ds.Item item44 = fPHeapMin32.min();
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin46.imprime();
        fPHeapMin46.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray51 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray51);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray51);
        fPHeapMin46.copia(itemArray51);
        fPHeapMin32.copia(itemArray51);
        fPHeapMin27.copia(itemArray51);
        fPHeapMin1.copia(itemArray51);
        ds.Item item58 = fPHeapMin1.min();
        ds.Item item59 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNull(item58);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0561");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin7.imprime();
        fPHeapMin7.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        fPHeapMin7.copia(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray12);
        fPHeapMin19.imprime();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
        fPHeapMin26.refaz(1, 0);
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray30);
        fPHeapMin24.copia(itemArray30);
        fPHeapMin22.copia(itemArray30);
        fPHeapMin19.copia(itemArray30);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 100, (java.lang.Object) itemArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0562");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0563");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin14.copia(itemArray15);
        fPHeapMin12.copia(itemArray15);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin23.constroi();
        fPHeapMin23.imprime();
        ds.Item item26 = fPHeapMin23.min();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
        fPHeapMin28.refaz(1, 0);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMin28.copia(itemArray32);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin35.imprime();
        fPHeapMin35.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray40 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray40);
        fPHeapMin35.copia(itemArray40);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray40);
        fPHeapMin28.copia(itemArray40);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(100);
        fPHeapMin49.refaz(1, 0);
        ds.Item[] itemArray53 = new ds.Item[] {};
        fPHeapMin49.copia(itemArray53);
        fPHeapMin47.copia(itemArray53);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray53);
        fPHeapMin28.copia(itemArray53);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(100);
        fPHeapMin61.refaz((int) (short) 1, 0);
        ds.Item item65 = fPHeapMin61.min();
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin(100);
        fPHeapMin69.refaz(1, 0);
        ds.Item[] itemArray73 = new ds.Item[] {};
        fPHeapMin69.copia(itemArray73);
        fPHeapMin67.copia(itemArray73);
        ds.FPHeapMin fPHeapMin76 = new ds.FPHeapMin(itemArray73);
        fPHeapMin61.copia(itemArray73);
        fPHeapMin59.copia(itemArray73);
        fPHeapMin28.copia(itemArray73);
        fPHeapMin23.copia(itemArray73);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin12.diminuiChave((int) (short) 0, (java.lang.Object) fPHeapMin23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNull(item65);
        org.junit.Assert.assertNotNull(itemArray73);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0564");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        fPHeapMin10.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin14.imprime();
        fPHeapMin14.constroi();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin18.imprime();
        fPHeapMin18.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray23 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray23);
        fPHeapMin18.copia(itemArray23);
        fPHeapMin14.copia(itemArray23);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin31.imprime();
        fPHeapMin31.constroi();
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin35.imprime();
        fPHeapMin35.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray40 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray40);
        fPHeapMin35.copia(itemArray40);
        fPHeapMin31.copia(itemArray40);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMin31.copia(itemArray46);
        fPHeapMin29.copia(itemArray46);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin10.diminuiChave((int) (byte) 10, (java.lang.Object) itemArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0565");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        fPHeapMin11.constroi();
        fPHeapMin11.constroi();
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        fPHeapMin21.refaz(1, 0);
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray25);
        fPHeapMin19.copia(itemArray25);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray25);
        fPHeapMin17.copia(itemArray25);
        ds.Item[] itemArray30 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray30);
        fPHeapMin17.copia(itemArray30);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray30);
        fPHeapMin11.copia(itemArray30);
        java.lang.Class<?> wildcardClass37 = fPHeapMin11.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0566");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item item13 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin15.imprime();
        fPHeapMin15.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin15.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
        fPHeapMin30.refaz(1, 0);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMin30.copia(itemArray34);
        fPHeapMin28.copia(itemArray34);
        fPHeapMin28.imprime();
        ds.Item[] itemArray38 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(100);
        fPHeapMin45.refaz(1, 0);
        ds.Item[] itemArray49 = new ds.Item[] {};
        fPHeapMin45.copia(itemArray49);
        fPHeapMin43.copia(itemArray49);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray49);
        fPHeapMin41.copia(itemArray49);
        ds.Item[] itemArray54 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray54);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray54);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray54);
        fPHeapMin41.copia(itemArray54);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray54);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray54);
        fPHeapMin28.copia(itemArray54);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin25.diminuiChave((int) ' ', (java.lang.Object) fPHeapMin28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0567");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0568");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.constroi();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0569");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz((int) (short) 1, 0);
        ds.Item item7 = fPHeapMin3.min();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz(1, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray15);
        fPHeapMin9.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin3.copia(itemArray15);
        fPHeapMin1.copia(itemArray15);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin22.constroi();
        ds.Item item24 = fPHeapMin22.min();
        fPHeapMin22.constroi();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin27.imprime();
        fPHeapMin27.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray32);
        fPHeapMin27.copia(itemArray32);
        fPHeapMin22.copia(itemArray32);
        ds.Item[] itemArray37 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray37);
        fPHeapMin22.copia(itemArray37);
        fPHeapMin1.copia(itemArray37);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray37);
        fPHeapMin45.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item47 = fPHeapMin45.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0570");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        fPHeapMin1.copia(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin6.constroi();
        fPHeapMin6.imprime();
        java.lang.Class<?> wildcardClass9 = fPHeapMin6.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0571");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.refaz((int) 'a', (int) (byte) 1);
        fPHeapMin1.constroi();
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0572");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        fPHeapMin11.constroi();
        fPHeapMin11.constroi();
        fPHeapMin11.imprime();
        fPHeapMin11.imprime();
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0573");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.refaz((int) (short) 1, 0);
        ds.Item item8 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz(1, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray16);
        fPHeapMin22.constroi();
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin26.imprime();
        fPHeapMin26.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin26.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray31);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin22.diminuiChave(0, (java.lang.Object) itemArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0574");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray0);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin4.diminuiChave((int) 'a', obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0575");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz((int) (short) 1, 0);
        ds.Item item7 = fPHeapMin3.min();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz(1, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray15);
        fPHeapMin9.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin3.copia(itemArray15);
        fPHeapMin1.copia(itemArray15);
        fPHeapMin1.imprime();
        java.lang.Object obj23 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(10, obj23);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0576");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        ds.Item item7 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item9 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0577");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz(1, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray11);
        fPHeapMin5.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin3.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray16);
        fPHeapMin22.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item24 = fPHeapMin22.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0578");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item16 = fPHeapMin15.min();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.refaz((int) (short) 1, 0);
        ds.Item item22 = fPHeapMin18.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
        fPHeapMin26.refaz(1, 0);
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray30);
        fPHeapMin24.copia(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray30);
        fPHeapMin18.copia(itemArray30);
        fPHeapMin15.copia(itemArray30);
        fPHeapMin15.refaz((int) (short) 1, 0);
        fPHeapMin15.constroi();
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
        fPHeapMin41.refaz(1, 0);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
        fPHeapMin50.refaz(1, 0);
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMin50.copia(itemArray54);
        fPHeapMin48.copia(itemArray54);
        fPHeapMin46.copia(itemArray54);
        ds.Item item58 = fPHeapMin46.min();
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin60.imprime();
        fPHeapMin60.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray65 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray65);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray65);
        fPHeapMin60.copia(itemArray65);
        fPHeapMin46.copia(itemArray65);
        fPHeapMin41.copia(itemArray65);
        fPHeapMin15.copia(itemArray65);
        ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(itemArray65);
        fPHeapMin1.copia(itemArray65);
        ds.Item item74 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNull(item58);
        org.junit.Assert.assertNotNull(itemArray65);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0579");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        fPHeapMin11.constroi();
        fPHeapMin11.constroi();
        fPHeapMin11.constroi();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin17.imprime();
        fPHeapMin17.imprime();
        fPHeapMin17.imprime();
        fPHeapMin17.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin11.diminuiChave(10, (java.lang.Object) fPHeapMin17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0580");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.constroi();
        fPHeapMin8.constroi();
        ds.Item item12 = fPHeapMin8.min();
        fPHeapMin8.refaz((int) (short) 1, (int) (short) 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        fPHeapMin23.refaz(1, 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        fPHeapMin19.copia(itemArray27);
        fPHeapMin8.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray27);
        ds.Item item35 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin34.insere(item35);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0581");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
        fPHeapMin15.refaz(1, 0);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMin15.copia(itemArray19);
        fPHeapMin13.copia(itemArray19);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray19);
        fPHeapMin11.copia(itemArray19);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        fPHeapMin11.copia(itemArray24);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray24);
        java.lang.Class<?> wildcardClass31 = fPHeapMin30.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 100, (java.lang.Object) fPHeapMin30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0582");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0583");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz(1, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray11);
        fPHeapMin5.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin3.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item22 = fPHeapMin21.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0584");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass5 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0585");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0586");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0587");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        fPHeapMin9.refaz(1, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin18.refaz((int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0588");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) ' ', (int) (short) 0);
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item8 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz(1, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin23.imprime();
        fPHeapMin23.constroi();
        fPHeapMin23.constroi();
        fPHeapMin23.imprime();
        fPHeapMin23.imprime();
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item31 = fPHeapMin30.min();
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
        fPHeapMin33.refaz((int) (short) 1, 0);
        ds.Item item37 = fPHeapMin33.min();
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
        fPHeapMin41.refaz(1, 0);
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMin41.copia(itemArray45);
        fPHeapMin39.copia(itemArray45);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray45);
        fPHeapMin33.copia(itemArray45);
        fPHeapMin30.copia(itemArray45);
        fPHeapMin23.copia(itemArray45);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray45);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray45);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray45);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin56.imprime();
        fPHeapMin56.constroi();
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin60.imprime();
        fPHeapMin60.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray65 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray65);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray65);
        fPHeapMin60.copia(itemArray65);
        fPHeapMin56.copia(itemArray65);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(100);
        fPHeapMin71.refaz((int) (short) 1, 0);
        ds.Item item75 = fPHeapMin71.min();
        ds.FPHeapMin fPHeapMin77 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin79 = new ds.FPHeapMin(100);
        fPHeapMin79.refaz(1, 0);
        ds.Item[] itemArray83 = new ds.Item[] {};
        fPHeapMin79.copia(itemArray83);
        fPHeapMin77.copia(itemArray83);
        ds.FPHeapMin fPHeapMin86 = new ds.FPHeapMin(itemArray83);
        fPHeapMin71.copia(itemArray83);
        fPHeapMin56.copia(itemArray83);
        fPHeapMin54.copia(itemArray83);
        fPHeapMin1.copia(itemArray83);
        ds.FPHeapMin fPHeapMin91 = new ds.FPHeapMin(itemArray83);
        java.lang.Class<?> wildcardClass92 = itemArray83.getClass();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNull(item75);
        org.junit.Assert.assertNotNull(itemArray83);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0589");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0590");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        fPHeapMin1.constroi();
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0591");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin7.imprime();
        fPHeapMin7.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        fPHeapMin7.copia(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        java.lang.Class<?> wildcardClass18 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0592");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz((int) (short) 1, 0);
        ds.Item item7 = fPHeapMin3.min();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz(1, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray15);
        fPHeapMin9.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin3.copia(itemArray15);
        fPHeapMin1.copia(itemArray15);
        fPHeapMin1.imprime();
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0593");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        fPHeapMin10.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        fPHeapMin14.refaz(1, 0);
        java.lang.Class<?> wildcardClass18 = fPHeapMin14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin10.diminuiChave((int) (byte) 0, (java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0594");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) ' ', obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0595");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0596");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin18.diminuiChave(1, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0597");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray4);
        fPHeapMin10.imprime();
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0598");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0599");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        fPHeapMin8.refaz(1, 0);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray12);
        fPHeapMin6.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0600");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin14.copia(itemArray15);
        fPHeapMin12.copia(itemArray15);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        fPHeapMin12.copia(itemArray21);
        fPHeapMin12.constroi();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0601");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin18.constroi();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin23.imprime();
        fPHeapMin23.constroi();
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        fPHeapMin23.copia(itemArray26);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray26);
        fPHeapMin21.copia(itemArray26);
        fPHeapMin18.copia(itemArray26);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item35 = fPHeapMin18.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0602");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        fPHeapMin2.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin2.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0603");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin9.imprime();
        fPHeapMin9.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        fPHeapMin9.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray12);
        fPHeapMin7.copia(itemArray12);
        fPHeapMin1.copia(itemArray12);
        java.lang.Class<?> wildcardClass21 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0604");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin14.copia(itemArray15);
        fPHeapMin12.copia(itemArray15);
        fPHeapMin12.imprime();
        fPHeapMin12.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = fPHeapMin12.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0605");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin16.refaz((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0606");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item7 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0607");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) ' ', (int) (short) 0);
        fPHeapMin1.constroi();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0608");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz(1, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray11);
        fPHeapMin5.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin3.copia(itemArray11);
        fPHeapMin3.constroi();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        fPHeapMin19.refaz(1, 0);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray23);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin26.imprime();
        fPHeapMin26.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin26.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        fPHeapMin19.copia(itemArray31);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
        fPHeapMin40.refaz(1, 0);
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMin40.copia(itemArray44);
        fPHeapMin38.copia(itemArray44);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray44);
        fPHeapMin19.copia(itemArray44);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(100);
        fPHeapMin52.refaz((int) (short) 1, 0);
        ds.Item item56 = fPHeapMin52.min();
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(100);
        fPHeapMin60.refaz(1, 0);
        ds.Item[] itemArray64 = new ds.Item[] {};
        fPHeapMin60.copia(itemArray64);
        fPHeapMin58.copia(itemArray64);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray64);
        fPHeapMin52.copia(itemArray64);
        fPHeapMin50.copia(itemArray64);
        fPHeapMin19.copia(itemArray64);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin3.diminuiChave((-1), (java.lang.Object) fPHeapMin19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNull(item56);
        org.junit.Assert.assertNotNull(itemArray64);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0609");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz(1, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray11);
        fPHeapMin5.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
        fPHeapMin20.refaz(1, 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin20.copia(itemArray24);
        fPHeapMin18.copia(itemArray24);
        fPHeapMin18.imprime();
        fPHeapMin18.refaz((int) (byte) 1, (int) (short) -1);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin32.imprime();
        fPHeapMin32.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray37 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray37);
        fPHeapMin32.copia(itemArray37);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray37);
        fPHeapMin42.constroi();
        fPHeapMin42.constroi();
        ds.Item[] itemArray45 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray45);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray45);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray45);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(100);
        fPHeapMin52.refaz(1, 0);
        ds.Item[] itemArray56 = new ds.Item[] {};
        fPHeapMin52.copia(itemArray56);
        fPHeapMin50.copia(itemArray56);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray56);
        fPHeapMin48.copia(itemArray56);
        ds.Item[] itemArray61 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray61);
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(itemArray61);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray61);
        fPHeapMin48.copia(itemArray61);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray61);
        fPHeapMin42.copia(itemArray61);
        ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin(100);
        fPHeapMin69.refaz(1, 0);
        fPHeapMin69.constroi();
        ds.FPHeapMin fPHeapMin75 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin75.imprime();
        fPHeapMin75.constroi();
        fPHeapMin75.constroi();
        fPHeapMin75.imprime();
        ds.FPHeapMin fPHeapMin81 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin81.imprime();
        fPHeapMin81.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray86 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin87 = new ds.FPHeapMin(itemArray86);
        ds.FPHeapMin fPHeapMin88 = new ds.FPHeapMin(itemArray86);
        fPHeapMin81.copia(itemArray86);
        ds.FPHeapMin fPHeapMin90 = new ds.FPHeapMin(itemArray86);
        fPHeapMin75.copia(itemArray86);
        fPHeapMin69.copia(itemArray86);
        ds.FPHeapMin fPHeapMin93 = new ds.FPHeapMin(itemArray86);
        fPHeapMin42.copia(itemArray86);
        ds.FPHeapMin fPHeapMin95 = new ds.FPHeapMin(itemArray86);
        ds.FPHeapMin fPHeapMin96 = new ds.FPHeapMin(itemArray86);
        fPHeapMin18.copia(itemArray86);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin3.diminuiChave(100, (java.lang.Object) itemArray86);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray86);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0610");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
        fPHeapMin10.refaz(1, 0);
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray14);
        fPHeapMin8.copia(itemArray14);
        fPHeapMin6.copia(itemArray14);
        ds.Item item18 = fPHeapMin6.min();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin20.imprime();
        fPHeapMin20.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray25);
        fPHeapMin20.copia(itemArray25);
        fPHeapMin6.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray25);
        fPHeapMin31.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin31.refaz((int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0611");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass5 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0612");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
        fPHeapMin10.refaz(1, 0);
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray14);
        fPHeapMin8.copia(itemArray14);
        fPHeapMin6.copia(itemArray14);
        ds.Item item18 = fPHeapMin6.min();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin20.imprime();
        fPHeapMin20.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray25);
        fPHeapMin20.copia(itemArray25);
        fPHeapMin6.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray25);
        ds.Item item33 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin32.insere(item33);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0613");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item14 = fPHeapMin13.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0614");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin4.imprime();
        fPHeapMin4.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin4.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray9);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0615");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        fPHeapMin1.copia(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin6.constroi();
        fPHeapMin6.imprime();
        fPHeapMin6.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin6.refaz((int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0616");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin4.imprime();
        fPHeapMin4.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin4.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin15.constroi();
        ds.Item item17 = fPHeapMin15.min();
        fPHeapMin15.constroi();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin20.imprime();
        fPHeapMin20.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray25);
        fPHeapMin20.copia(itemArray25);
        fPHeapMin15.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        java.lang.Class<?> wildcardClass31 = itemArray25.getClass();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0617");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0618");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin7.imprime();
        fPHeapMin7.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        fPHeapMin7.copia(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray12);
        fPHeapMin18.constroi();
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin18.insere(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0619");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin4.imprime();
        fPHeapMin4.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin4.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin15.constroi();
        ds.Item item17 = fPHeapMin15.min();
        fPHeapMin15.constroi();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin20.imprime();
        fPHeapMin20.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray25);
        fPHeapMin20.copia(itemArray25);
        fPHeapMin15.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray25);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin31.refaz((int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0620");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 10, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0621");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz(1, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray11);
        fPHeapMin5.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin3.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin21.refaz((int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0622");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) ' ', (int) (short) 0);
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item8 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz(1, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        fPHeapMin1.copia(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item22 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0623");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.refaz((int) (short) 1, 0);
        ds.Item item8 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz(1, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray16);
        fPHeapMin22.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin22.refaz(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0624");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.Item item10 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item14 = fPHeapMin13.min();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item17 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        fPHeapMin19.refaz((int) (short) 1, 0);
        ds.Item item23 = fPHeapMin19.min();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
        fPHeapMin27.refaz(1, 0);
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMin27.copia(itemArray31);
        fPHeapMin25.copia(itemArray31);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray31);
        fPHeapMin19.copia(itemArray31);
        fPHeapMin16.copia(itemArray31);
        fPHeapMin13.copia(itemArray31);
        fPHeapMin1.copia(itemArray31);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0625");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz(1, 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray7);
        java.lang.Class<?> wildcardClass13 = fPHeapMin12.getClass();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0626");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin8.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
        fPHeapMin22.refaz(1, 0);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin22.copia(itemArray26);
        fPHeapMin20.copia(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray26);
        fPHeapMin1.copia(itemArray26);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
        fPHeapMin34.refaz((int) (short) 1, 0);
        ds.Item item38 = fPHeapMin34.min();
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
        fPHeapMin42.refaz(1, 0);
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMin42.copia(itemArray46);
        fPHeapMin40.copia(itemArray46);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray46);
        fPHeapMin34.copia(itemArray46);
        fPHeapMin32.copia(itemArray46);
        fPHeapMin1.copia(itemArray46);
        java.lang.Class<?> wildcardClass53 = itemArray46.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0627");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.constroi();
        fPHeapMin8.constroi();
        ds.Item item12 = fPHeapMin8.min();
        fPHeapMin8.refaz((int) (short) 1, (int) (short) 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        fPHeapMin23.refaz(1, 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        fPHeapMin19.copia(itemArray27);
        fPHeapMin8.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(100);
        fPHeapMin37.refaz(1, 0);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(100);
        fPHeapMin46.refaz(1, 0);
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMin46.copia(itemArray50);
        fPHeapMin44.copia(itemArray50);
        fPHeapMin42.copia(itemArray50);
        ds.Item item54 = fPHeapMin42.min();
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin56.imprime();
        fPHeapMin56.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray61 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray61);
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(itemArray61);
        fPHeapMin56.copia(itemArray61);
        fPHeapMin42.copia(itemArray61);
        fPHeapMin37.copia(itemArray61);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray61);
        fPHeapMin67.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin34.diminuiChave(100, (java.lang.Object) fPHeapMin67);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNotNull(itemArray61);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0628");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin14.copia(itemArray15);
        fPHeapMin12.copia(itemArray15);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        fPHeapMin12.copia(itemArray21);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray24);
        fPHeapMin12.copia(itemArray24);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        fPHeapMin12.copia(itemArray32);
        fPHeapMin12.constroi();
        ds.Item item36 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin12.insere(item36);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0629");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0630");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin6.imprime();
        fPHeapMin6.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin6.copia(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray16);
        fPHeapMin1.copia(itemArray16);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0631");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item item13 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin15.imprime();
        fPHeapMin15.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin15.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item26 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0632");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz(1, 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray7);
        fPHeapMin10.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMin10.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0633");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin8.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
        fPHeapMin22.refaz(1, 0);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin22.copia(itemArray26);
        fPHeapMin20.copia(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray26);
        fPHeapMin1.copia(itemArray26);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item33 = fPHeapMin32.min();
        fPHeapMin32.constroi();
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin36.imprime();
        fPHeapMin36.constroi();
        fPHeapMin36.constroi();
        fPHeapMin36.imprime();
        fPHeapMin36.imprime();
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item44 = fPHeapMin43.min();
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(100);
        fPHeapMin46.refaz((int) (short) 1, 0);
        ds.Item item50 = fPHeapMin46.min();
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(100);
        fPHeapMin54.refaz(1, 0);
        ds.Item[] itemArray58 = new ds.Item[] {};
        fPHeapMin54.copia(itemArray58);
        fPHeapMin52.copia(itemArray58);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(itemArray58);
        fPHeapMin46.copia(itemArray58);
        fPHeapMin43.copia(itemArray58);
        fPHeapMin36.copia(itemArray58);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray58);
        fPHeapMin32.copia(itemArray58);
        fPHeapMin1.copia(itemArray58);
        java.lang.Class<?> wildcardClass68 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0634");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0635");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz((int) (short) 1, 0);
        ds.Item item7 = fPHeapMin3.min();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz(1, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray15);
        fPHeapMin9.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin3.copia(itemArray15);
        fPHeapMin1.copia(itemArray15);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin22.constroi();
        ds.Item item24 = fPHeapMin22.min();
        fPHeapMin22.constroi();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin27.imprime();
        fPHeapMin27.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray32);
        fPHeapMin27.copia(itemArray32);
        fPHeapMin22.copia(itemArray32);
        ds.Item[] itemArray37 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray37);
        fPHeapMin22.copia(itemArray37);
        fPHeapMin1.copia(itemArray37);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray37);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin45.diminuiChave((int) (short) 10, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0636");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.constroi();
        fPHeapMin5.constroi();
        fPHeapMin5.imprime();
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item13 = fPHeapMin12.min();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
        fPHeapMin15.refaz((int) (short) 1, 0);
        ds.Item item19 = fPHeapMin15.min();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        fPHeapMin23.refaz(1, 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        fPHeapMin15.copia(itemArray27);
        fPHeapMin12.copia(itemArray27);
        fPHeapMin5.copia(itemArray27);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray27);
        fPHeapMin1.copia(itemArray27);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0637");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.refaz(1, (int) (byte) 0);
        ds.Item item7 = fPHeapMin1.min();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0638");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin19.imprime();
        fPHeapMin19.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        fPHeapMin19.copia(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray24);
        fPHeapMin29.constroi();
        fPHeapMin29.constroi();
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
        fPHeapMin39.refaz(1, 0);
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMin39.copia(itemArray43);
        fPHeapMin37.copia(itemArray43);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray43);
        fPHeapMin35.copia(itemArray43);
        ds.Item[] itemArray48 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray48);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray48);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray48);
        fPHeapMin35.copia(itemArray48);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray48);
        fPHeapMin29.copia(itemArray48);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(100);
        fPHeapMin56.refaz(1, 0);
        fPHeapMin56.constroi();
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin62.imprime();
        fPHeapMin62.constroi();
        fPHeapMin62.constroi();
        fPHeapMin62.imprime();
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin68.imprime();
        fPHeapMin68.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray73 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin(itemArray73);
        ds.FPHeapMin fPHeapMin75 = new ds.FPHeapMin(itemArray73);
        fPHeapMin68.copia(itemArray73);
        ds.FPHeapMin fPHeapMin77 = new ds.FPHeapMin(itemArray73);
        fPHeapMin62.copia(itemArray73);
        fPHeapMin56.copia(itemArray73);
        ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin(itemArray73);
        fPHeapMin29.copia(itemArray73);
        fPHeapMin17.copia(itemArray73);
        fPHeapMin1.copia(itemArray73);
        ds.Item item84 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray73);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0639");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item item13 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
        fPHeapMin15.refaz((int) (short) 1, 0);
        ds.Item item19 = fPHeapMin15.min();
        fPHeapMin15.refaz((int) (byte) 10, 10);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin24.imprime();
        fPHeapMin24.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray29 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray29);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray29);
        fPHeapMin24.copia(itemArray29);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray29);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray29);
        fPHeapMin34.constroi();
        fPHeapMin34.constroi();
        ds.Item[] itemArray37 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(100);
        fPHeapMin44.refaz(1, 0);
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMin44.copia(itemArray48);
        fPHeapMin42.copia(itemArray48);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray48);
        fPHeapMin40.copia(itemArray48);
        ds.Item[] itemArray53 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray53);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray53);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray53);
        fPHeapMin40.copia(itemArray53);
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray53);
        fPHeapMin34.copia(itemArray53);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(100);
        fPHeapMin61.refaz(1, 0);
        fPHeapMin61.constroi();
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin67.imprime();
        fPHeapMin67.constroi();
        fPHeapMin67.constroi();
        fPHeapMin67.imprime();
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin73.imprime();
        fPHeapMin73.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray78 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin79 = new ds.FPHeapMin(itemArray78);
        ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin(itemArray78);
        fPHeapMin73.copia(itemArray78);
        ds.FPHeapMin fPHeapMin82 = new ds.FPHeapMin(itemArray78);
        fPHeapMin67.copia(itemArray78);
        fPHeapMin61.copia(itemArray78);
        ds.FPHeapMin fPHeapMin85 = new ds.FPHeapMin(itemArray78);
        fPHeapMin34.copia(itemArray78);
        fPHeapMin15.copia(itemArray78);
        fPHeapMin1.copia(itemArray78);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray78);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0640");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) (byte) 10, 10);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin10.imprime();
        fPHeapMin10.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin10.copia(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray15);
        fPHeapMin20.constroi();
        fPHeapMin20.constroi();
        ds.Item[] itemArray23 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
        fPHeapMin30.refaz(1, 0);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMin30.copia(itemArray34);
        fPHeapMin28.copia(itemArray34);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray34);
        fPHeapMin26.copia(itemArray34);
        ds.Item[] itemArray39 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray39);
        fPHeapMin26.copia(itemArray39);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray39);
        fPHeapMin20.copia(itemArray39);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(100);
        fPHeapMin47.refaz(1, 0);
        fPHeapMin47.constroi();
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin53.imprime();
        fPHeapMin53.constroi();
        fPHeapMin53.constroi();
        fPHeapMin53.imprime();
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin59.imprime();
        fPHeapMin59.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray64 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray64);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray64);
        fPHeapMin59.copia(itemArray64);
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(itemArray64);
        fPHeapMin53.copia(itemArray64);
        fPHeapMin47.copia(itemArray64);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(itemArray64);
        fPHeapMin20.copia(itemArray64);
        fPHeapMin1.copia(itemArray64);
        java.lang.Class<?> wildcardClass74 = itemArray64.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0641");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0642");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) ' ', (int) (short) 0);
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0643");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item9 = fPHeapMin8.min();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz((int) (short) 1, 0);
        ds.Item item15 = fPHeapMin11.min();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        fPHeapMin19.refaz(1, 0);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray23);
        fPHeapMin17.copia(itemArray23);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray23);
        fPHeapMin11.copia(itemArray23);
        fPHeapMin8.copia(itemArray23);
        fPHeapMin1.copia(itemArray23);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray23);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item33 = fPHeapMin32.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0644");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray6);
        fPHeapMin13.imprime();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
        fPHeapMin20.refaz(1, 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin20.copia(itemArray24);
        fPHeapMin18.copia(itemArray24);
        fPHeapMin16.copia(itemArray24);
        fPHeapMin13.copia(itemArray24);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item29 = fPHeapMin13.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0645");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        fPHeapMin10.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        fPHeapMin19.refaz(1, 0);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray23);
        fPHeapMin17.copia(itemArray23);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray23);
        fPHeapMin15.copia(itemArray23);
        fPHeapMin10.copia(itemArray23);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item29 = fPHeapMin10.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0646");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin12.imprime();
        fPHeapMin12.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray17 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        fPHeapMin12.copia(itemArray17);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray17);
        fPHeapMin5.copia(itemArray17);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
        fPHeapMin26.refaz(1, 0);
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray30);
        fPHeapMin24.copia(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray30);
        fPHeapMin5.copia(itemArray30);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
        fPHeapMin38.refaz((int) (short) 1, 0);
        ds.Item item42 = fPHeapMin38.min();
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(100);
        fPHeapMin46.refaz(1, 0);
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMin46.copia(itemArray50);
        fPHeapMin44.copia(itemArray50);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray50);
        fPHeapMin38.copia(itemArray50);
        fPHeapMin36.copia(itemArray50);
        fPHeapMin5.copia(itemArray50);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray50);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '#', (java.lang.Object) fPHeapMin57);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item42);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0647");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz(1, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray11);
        fPHeapMin5.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin3.copia(itemArray11);
        fPHeapMin3.constroi();
        fPHeapMin3.imprime();
        fPHeapMin3.constroi();
        java.lang.Class<?> wildcardClass19 = fPHeapMin3.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0648");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.refaz((int) (short) 1, 0);
        ds.Item item8 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz(1, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        fPHeapMin1.refaz((int) (short) 1, 0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0649");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray0);
        fPHeapMin4.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin7.imprime();
        fPHeapMin7.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        fPHeapMin7.copia(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray12);
        fPHeapMin19.imprime();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
        fPHeapMin26.refaz(1, 0);
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray30);
        fPHeapMin24.copia(itemArray30);
        fPHeapMin22.copia(itemArray30);
        fPHeapMin19.copia(itemArray30);
        fPHeapMin4.copia(itemArray30);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item36 = fPHeapMin4.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0650");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0651");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.refaz((int) (short) 1, 0);
        ds.Item item8 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz(1, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        fPHeapMin1.refaz((int) (short) 1, 0);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
        fPHeapMin27.refaz(1, 0);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(100);
        fPHeapMin36.refaz(1, 0);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMin36.copia(itemArray40);
        fPHeapMin34.copia(itemArray40);
        fPHeapMin32.copia(itemArray40);
        ds.Item item44 = fPHeapMin32.min();
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin46.imprime();
        fPHeapMin46.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray51 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray51);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray51);
        fPHeapMin46.copia(itemArray51);
        fPHeapMin32.copia(itemArray51);
        fPHeapMin27.copia(itemArray51);
        fPHeapMin1.copia(itemArray51);
        fPHeapMin1.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0652");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass5 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0653");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass8 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0654");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0655");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0656");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        fPHeapMin1.constroi();
        fPHeapMin1.refaz((int) '4', (int) (byte) -1);
        fPHeapMin1.imprime();
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0657");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        fPHeapMin6.refaz(1, 0);
        fPHeapMin6.constroi();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin12.imprime();
        fPHeapMin12.constroi();
        fPHeapMin12.constroi();
        fPHeapMin12.imprime();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin18.imprime();
        fPHeapMin18.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray23 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray23);
        fPHeapMin18.copia(itemArray23);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray23);
        fPHeapMin12.copia(itemArray23);
        fPHeapMin6.copia(itemArray23);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray23);
        fPHeapMin1.copia(itemArray23);
        java.lang.Class<?> wildcardClass32 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0658");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 0);
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin8.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray22);
        fPHeapMin21.copia(itemArray22);
        fPHeapMin19.copia(itemArray22);
        ds.Item[] itemArray28 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        fPHeapMin19.copia(itemArray28);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        fPHeapMin19.copia(itemArray31);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray39);
        fPHeapMin19.copia(itemArray39);
        fPHeapMin5.copia(itemArray39);
        fPHeapMin1.copia(itemArray39);
        ds.Item item44 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0659");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz(1, 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray7);
        fPHeapMin10.imprime();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item15 = fPHeapMin14.min();
        fPHeapMin14.constroi();
        fPHeapMin14.constroi();
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray18);
        fPHeapMin22.constroi();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin25.imprime();
        fPHeapMin25.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray30 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        fPHeapMin25.copia(itemArray30);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray30);
        fPHeapMin37.imprime();
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(100);
        fPHeapMin44.refaz(1, 0);
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMin44.copia(itemArray48);
        fPHeapMin42.copia(itemArray48);
        fPHeapMin40.copia(itemArray48);
        fPHeapMin37.copia(itemArray48);
        fPHeapMin22.copia(itemArray48);
        fPHeapMin14.copia(itemArray48);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin10.diminuiChave(10, (java.lang.Object) fPHeapMin14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray48);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0660");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.constroi();
        fPHeapMin8.constroi();
        ds.Item item12 = fPHeapMin8.min();
        fPHeapMin8.refaz((int) (short) 1, (int) (short) 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        fPHeapMin23.refaz(1, 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        fPHeapMin19.copia(itemArray27);
        fPHeapMin8.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        fPHeapMin1.imprime();
        ds.Item item35 = fPHeapMin1.min();
        ds.Item item36 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item35);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0661");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin1.copia(itemArray16);
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass19 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0662");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0663");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0664");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin6.imprime();
        fPHeapMin6.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin6.copia(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item26 = fPHeapMin25.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '#', (java.lang.Object) fPHeapMin25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item26);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0665");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMin7.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0666");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.refaz((int) 'a', (int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz(0, (int) (byte) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0667");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item15 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item18 = fPHeapMin17.min();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
        fPHeapMin20.refaz((int) (short) 1, 0);
        ds.Item item24 = fPHeapMin20.min();
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
        fPHeapMin28.refaz(1, 0);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMin28.copia(itemArray32);
        fPHeapMin26.copia(itemArray32);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray32);
        fPHeapMin20.copia(itemArray32);
        fPHeapMin17.copia(itemArray32);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray32);
        fPHeapMin1.copia(itemArray32);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0668");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz((int) (short) 1, 0);
        ds.Item item11 = fPHeapMin7.min();
        fPHeapMin7.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin14.imprime();
        fPHeapMin14.constroi();
        fPHeapMin14.constroi();
        ds.Item item18 = fPHeapMin14.min();
        fPHeapMin14.refaz((int) (short) 1, (int) (short) 0);
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
        fPHeapMin29.refaz(1, 0);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray33);
        fPHeapMin27.copia(itemArray33);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray33);
        fPHeapMin25.copia(itemArray33);
        fPHeapMin14.copia(itemArray33);
        fPHeapMin7.copia(itemArray33);
        fPHeapMin1.copia(itemArray33);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray33);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0669");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0670");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        fPHeapMin6.refaz(1, 0);
        fPHeapMin6.constroi();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin12.imprime();
        fPHeapMin12.constroi();
        fPHeapMin12.constroi();
        fPHeapMin12.imprime();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin18.imprime();
        fPHeapMin18.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray23 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray23);
        fPHeapMin18.copia(itemArray23);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray23);
        fPHeapMin12.copia(itemArray23);
        fPHeapMin6.copia(itemArray23);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray23);
        fPHeapMin1.copia(itemArray23);
        ds.Item item32 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0671");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0672");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz(1, 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray7);
        fPHeapMin10.imprime();
        fPHeapMin10.imprime();
        fPHeapMin10.constroi();
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0673");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        ds.Item item7 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin11.imprime();
        fPHeapMin11.constroi();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin15.imprime();
        fPHeapMin15.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin15.copia(itemArray20);
        fPHeapMin11.copia(itemArray20);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMin11.copia(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin28.constroi();
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin33.imprime();
        fPHeapMin33.constroi();
        ds.Item[] itemArray36 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray36);
        fPHeapMin33.copia(itemArray36);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray36);
        fPHeapMin31.copia(itemArray36);
        fPHeapMin28.copia(itemArray36);
        fPHeapMin28.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(10, (java.lang.Object) fPHeapMin28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0674");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray0);
        fPHeapMin4.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin7.imprime();
        fPHeapMin7.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        fPHeapMin7.copia(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray12);
        fPHeapMin19.imprime();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
        fPHeapMin26.refaz(1, 0);
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray30);
        fPHeapMin24.copia(itemArray30);
        fPHeapMin22.copia(itemArray30);
        fPHeapMin19.copia(itemArray30);
        fPHeapMin4.copia(itemArray30);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin4.refaz((int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0675");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        fPHeapMin2.constroi();
        fPHeapMin2.constroi();
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0676");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0677");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray0);
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin9.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.diminuiChave((int) (short) 1, (java.lang.Object) fPHeapMin9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0678");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin18.imprime();
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (byte) 10);
        ds.Item item23 = fPHeapMin22.min();
        ds.Item item24 = fPHeapMin22.min();
        fPHeapMin22.refaz(1, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin29.imprime();
        fPHeapMin29.constroi();
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin33.imprime();
        fPHeapMin33.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray38 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray38);
        fPHeapMin33.copia(itemArray38);
        fPHeapMin29.copia(itemArray38);
        ds.Item item43 = fPHeapMin29.min();
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item46 = fPHeapMin45.min();
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
        fPHeapMin48.refaz((int) (short) 1, 0);
        ds.Item item52 = fPHeapMin48.min();
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(100);
        fPHeapMin56.refaz(1, 0);
        ds.Item[] itemArray60 = new ds.Item[] {};
        fPHeapMin56.copia(itemArray60);
        fPHeapMin54.copia(itemArray60);
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(itemArray60);
        fPHeapMin48.copia(itemArray60);
        fPHeapMin45.copia(itemArray60);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray60);
        fPHeapMin29.copia(itemArray60);
        fPHeapMin22.copia(itemArray60);
        fPHeapMin18.copia(itemArray60);
        ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin((int) (byte) 1);
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin74.imprime();
        fPHeapMin74.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray79 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin(itemArray79);
        ds.FPHeapMin fPHeapMin81 = new ds.FPHeapMin(itemArray79);
        fPHeapMin74.copia(itemArray79);
        fPHeapMin72.copia(itemArray79);
        ds.FPHeapMin fPHeapMin84 = new ds.FPHeapMin(itemArray79);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin18.diminuiChave(0, (java.lang.Object) fPHeapMin84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray79);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0679");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        fPHeapMin1.copia(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin10.imprime();
        fPHeapMin10.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin14.imprime();
        fPHeapMin14.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        fPHeapMin14.copia(itemArray19);
        fPHeapMin10.copia(itemArray19);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin10.copia(itemArray25);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray25);
        fPHeapMin27.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin7.diminuiChave((int) (byte) 0, (java.lang.Object) fPHeapMin27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0680");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin18.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin18.refaz((int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0681");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin6.imprime();
        fPHeapMin6.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin6.copia(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.Item item16 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin18.imprime();
        fPHeapMin18.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray23 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray23);
        fPHeapMin18.copia(itemArray23);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray32);
        fPHeapMin31.copia(itemArray32);
        fPHeapMin29.copia(itemArray32);
        ds.Item[] itemArray38 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray38);
        fPHeapMin29.copia(itemArray38);
        ds.Item[] itemArray41 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray41);
        fPHeapMin29.copia(itemArray41);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray49);
        fPHeapMin29.copia(itemArray49);
        fPHeapMin1.copia(itemArray49);
        ds.Item item53 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0682");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item9 = fPHeapMin8.min();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz((int) (short) 1, 0);
        ds.Item item15 = fPHeapMin11.min();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        fPHeapMin19.refaz(1, 0);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray23);
        fPHeapMin17.copia(itemArray23);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray23);
        fPHeapMin11.copia(itemArray23);
        fPHeapMin8.copia(itemArray23);
        fPHeapMin1.copia(itemArray23);
        ds.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0683");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray9);
        fPHeapMin15.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = fPHeapMin15.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0684");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        fPHeapMin1.imprime();
        ds.Item item14 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin16.imprime();
        fPHeapMin16.constroi();
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray19);
        fPHeapMin16.copia(itemArray19);
        fPHeapMin16.imprime();
        fPHeapMin16.imprime();
        fPHeapMin16.imprime();
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin29.imprime();
        fPHeapMin29.constroi();
        fPHeapMin29.constroi();
        fPHeapMin29.imprime();
        fPHeapMin29.imprime();
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item37 = fPHeapMin36.min();
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
        fPHeapMin39.refaz((int) (short) 1, 0);
        ds.Item item43 = fPHeapMin39.min();
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(100);
        fPHeapMin47.refaz(1, 0);
        ds.Item[] itemArray51 = new ds.Item[] {};
        fPHeapMin47.copia(itemArray51);
        fPHeapMin45.copia(itemArray51);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray51);
        fPHeapMin39.copia(itemArray51);
        fPHeapMin36.copia(itemArray51);
        fPHeapMin29.copia(itemArray51);
        fPHeapMin16.copia(itemArray51);
        fPHeapMin1.copia(itemArray51);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0685");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0686");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0687");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0688");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz(1, 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 1, (int) (short) -1);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin15.imprime();
        fPHeapMin15.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin15.copia(itemArray20);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray20);
        fPHeapMin25.constroi();
        fPHeapMin25.constroi();
        ds.Item[] itemArray28 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(100);
        fPHeapMin35.refaz(1, 0);
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMin35.copia(itemArray39);
        fPHeapMin33.copia(itemArray39);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray39);
        fPHeapMin31.copia(itemArray39);
        ds.Item[] itemArray44 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray44);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray44);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray44);
        fPHeapMin31.copia(itemArray44);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray44);
        fPHeapMin25.copia(itemArray44);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(100);
        fPHeapMin52.refaz(1, 0);
        fPHeapMin52.constroi();
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin58.imprime();
        fPHeapMin58.constroi();
        fPHeapMin58.constroi();
        fPHeapMin58.imprime();
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin64.imprime();
        fPHeapMin64.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray69 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(itemArray69);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(itemArray69);
        fPHeapMin64.copia(itemArray69);
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin(itemArray69);
        fPHeapMin58.copia(itemArray69);
        fPHeapMin52.copia(itemArray69);
        ds.FPHeapMin fPHeapMin76 = new ds.FPHeapMin(itemArray69);
        fPHeapMin25.copia(itemArray69);
        ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin(itemArray69);
        ds.FPHeapMin fPHeapMin79 = new ds.FPHeapMin(itemArray69);
        fPHeapMin1.copia(itemArray69);
        ds.FPHeapMin fPHeapMin81 = new ds.FPHeapMin(itemArray69);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray69);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0689");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        fPHeapMin1.copia(itemArray4);
        ds.Item item6 = fPHeapMin1.min();
        ds.Item item7 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0690");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item15 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item17 = fPHeapMin1.min();
        ds.Item item18 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0691");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) (byte) 10, 10);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        fPHeapMin16.refaz(1, 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray20);
        fPHeapMin14.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray20);
        fPHeapMin12.copia(itemArray20);
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray25);
        fPHeapMin12.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0692");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item15 = fPHeapMin1.min();
        ds.Item item16 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0693");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin14.copia(itemArray15);
        fPHeapMin12.copia(itemArray15);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        fPHeapMin12.copia(itemArray21);
        fPHeapMin12.imprime();
        fPHeapMin12.imprime();
        java.lang.Class<?> wildcardClass26 = fPHeapMin12.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0694");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin6.imprime();
        fPHeapMin6.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin6.copia(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.Item item16 = fPHeapMin1.min();
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0695");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0696");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0697");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0698");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        fPHeapMin2.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray19);
        fPHeapMin18.copia(itemArray19);
        fPHeapMin16.copia(itemArray19);
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        fPHeapMin16.copia(itemArray25);
        ds.Item[] itemArray28 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray28);
        fPHeapMin16.copia(itemArray28);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray36);
        fPHeapMin16.copia(itemArray36);
        fPHeapMin2.copia(itemArray36);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray36);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item41 = fPHeapMin40.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0699");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        fPHeapMin11.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin11.refaz((int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0700");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) ' ', obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0701");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.refaz((int) (short) 1, 0);
        ds.Item item8 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz(1, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        fPHeapMin1.refaz((int) (short) 1, 0);
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass26 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0702");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0703");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        ds.Item item7 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0704");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin14.copia(itemArray15);
        fPHeapMin12.copia(itemArray15);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        fPHeapMin12.copia(itemArray21);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray24);
        fPHeapMin12.copia(itemArray24);
        java.lang.Class<?> wildcardClass31 = fPHeapMin12.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0705");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item item13 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = item13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0706");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item item13 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin15.imprime();
        fPHeapMin15.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin15.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray20);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin25.refaz(1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0707");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item10 = fPHeapMin9.min();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin9.copia(itemArray12);
        fPHeapMin7.copia(itemArray12);
        fPHeapMin7.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = fPHeapMin7.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0708");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item item13 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin15.imprime();
        fPHeapMin15.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin15.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
        fPHeapMin29.refaz(1, 0);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray33);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin36.imprime();
        fPHeapMin36.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray41 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        fPHeapMin36.copia(itemArray41);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray41);
        fPHeapMin29.copia(itemArray41);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
        fPHeapMin50.refaz(1, 0);
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMin50.copia(itemArray54);
        fPHeapMin48.copia(itemArray54);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray54);
        fPHeapMin29.copia(itemArray54);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(100);
        fPHeapMin62.refaz((int) (short) 1, 0);
        ds.Item item66 = fPHeapMin62.min();
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(100);
        fPHeapMin70.refaz(1, 0);
        ds.Item[] itemArray74 = new ds.Item[] {};
        fPHeapMin70.copia(itemArray74);
        fPHeapMin68.copia(itemArray74);
        ds.FPHeapMin fPHeapMin77 = new ds.FPHeapMin(itemArray74);
        fPHeapMin62.copia(itemArray74);
        fPHeapMin60.copia(itemArray74);
        fPHeapMin29.copia(itemArray74);
        ds.FPHeapMin fPHeapMin81 = new ds.FPHeapMin(itemArray74);
        fPHeapMin27.copia(itemArray74);
        ds.FPHeapMin fPHeapMin83 = new ds.FPHeapMin(itemArray74);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin83.refaz((int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNull(item66);
        org.junit.Assert.assertNotNull(itemArray74);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0709");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin1.copia(itemArray16);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0710");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item15 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin19.imprime();
        fPHeapMin19.constroi();
        fPHeapMin19.constroi();
        ds.Item item23 = fPHeapMin19.min();
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
        fPHeapMin31.refaz(1, 0);
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMin31.copia(itemArray35);
        fPHeapMin29.copia(itemArray35);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray35);
        fPHeapMin27.copia(itemArray35);
        ds.Item[] itemArray40 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray40);
        fPHeapMin27.copia(itemArray40);
        fPHeapMin19.copia(itemArray40);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '#', (java.lang.Object) itemArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0711");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz(1, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray11);
        fPHeapMin5.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin3.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray16);
        fPHeapMin22.imprime();
        fPHeapMin22.imprime();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0712");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin8.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
        fPHeapMin22.refaz(1, 0);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin22.copia(itemArray26);
        fPHeapMin20.copia(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray26);
        fPHeapMin1.copia(itemArray26);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
        fPHeapMin34.refaz((int) (short) 1, 0);
        ds.Item item38 = fPHeapMin34.min();
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
        fPHeapMin42.refaz(1, 0);
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMin42.copia(itemArray46);
        fPHeapMin40.copia(itemArray46);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray46);
        fPHeapMin34.copia(itemArray46);
        fPHeapMin32.copia(itemArray46);
        fPHeapMin1.copia(itemArray46);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray46);
        fPHeapMin53.imprime();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0713");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.refaz((int) (short) 1, 0);
        ds.Item item8 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz(1, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        fPHeapMin1.refaz((int) (short) 1, 0);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
        fPHeapMin27.refaz(1, 0);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(100);
        fPHeapMin36.refaz(1, 0);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMin36.copia(itemArray40);
        fPHeapMin34.copia(itemArray40);
        fPHeapMin32.copia(itemArray40);
        ds.Item item44 = fPHeapMin32.min();
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin46.imprime();
        fPHeapMin46.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray51 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray51);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray51);
        fPHeapMin46.copia(itemArray51);
        fPHeapMin32.copia(itemArray51);
        fPHeapMin27.copia(itemArray51);
        fPHeapMin1.copia(itemArray51);
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray51);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray51);
        fPHeapMin59.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0714");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item15 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin19.imprime();
        fPHeapMin19.constroi();
        fPHeapMin19.constroi();
        fPHeapMin19.imprime();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin25.imprime();
        fPHeapMin25.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray30 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        fPHeapMin25.copia(itemArray30);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray30);
        fPHeapMin19.copia(itemArray30);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray30);
        fPHeapMin1.copia(itemArray30);
        fPHeapMin1.constroi();
        ds.Item item39 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item39);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0715");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass5 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0716");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin6.imprime();
        fPHeapMin6.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin6.copia(itemArray11);
        fPHeapMin1.copia(itemArray11);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin19.imprime();
        fPHeapMin19.constroi();
        fPHeapMin19.constroi();
        fPHeapMin19.imprime();
        fPHeapMin19.imprime();
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item27 = fPHeapMin26.min();
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
        fPHeapMin29.refaz((int) (short) 1, 0);
        ds.Item item33 = fPHeapMin29.min();
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(100);
        fPHeapMin37.refaz(1, 0);
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMin37.copia(itemArray41);
        fPHeapMin35.copia(itemArray41);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray41);
        fPHeapMin29.copia(itemArray41);
        fPHeapMin26.copia(itemArray41);
        fPHeapMin19.copia(itemArray41);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray41);
        fPHeapMin1.copia(itemArray41);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0717");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item item13 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin15.imprime();
        fPHeapMin15.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin15.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
        fPHeapMin29.refaz(1, 0);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray33);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin36.imprime();
        fPHeapMin36.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray41 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        fPHeapMin36.copia(itemArray41);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray41);
        fPHeapMin29.copia(itemArray41);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
        fPHeapMin50.refaz(1, 0);
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMin50.copia(itemArray54);
        fPHeapMin48.copia(itemArray54);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray54);
        fPHeapMin29.copia(itemArray54);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(100);
        fPHeapMin62.refaz((int) (short) 1, 0);
        ds.Item item66 = fPHeapMin62.min();
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(100);
        fPHeapMin70.refaz(1, 0);
        ds.Item[] itemArray74 = new ds.Item[] {};
        fPHeapMin70.copia(itemArray74);
        fPHeapMin68.copia(itemArray74);
        ds.FPHeapMin fPHeapMin77 = new ds.FPHeapMin(itemArray74);
        fPHeapMin62.copia(itemArray74);
        fPHeapMin60.copia(itemArray74);
        fPHeapMin29.copia(itemArray74);
        ds.FPHeapMin fPHeapMin81 = new ds.FPHeapMin(itemArray74);
        fPHeapMin27.copia(itemArray74);
        ds.FPHeapMin fPHeapMin83 = new ds.FPHeapMin(itemArray74);
        fPHeapMin83.constroi();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNull(item66);
        org.junit.Assert.assertNotNull(itemArray74);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0718");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz((int) (short) 1, 0);
        ds.Item item7 = fPHeapMin3.min();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz(1, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray15);
        fPHeapMin9.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin3.copia(itemArray15);
        fPHeapMin1.copia(itemArray15);
        fPHeapMin1.imprime();
        ds.Item item22 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item22);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0719");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) ' ', (int) (short) 0);
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item8 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz(1, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        fPHeapMin1.copia(itemArray16);
        java.lang.Class<?> wildcardClass22 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0720");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item item13 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin15.imprime();
        fPHeapMin15.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin15.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item27 = fPHeapMin1.min();
        ds.Item item28 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item28);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0721");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        fPHeapMin2.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray19);
        fPHeapMin18.copia(itemArray19);
        fPHeapMin16.copia(itemArray19);
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        fPHeapMin16.copia(itemArray25);
        ds.Item[] itemArray28 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray28);
        fPHeapMin16.copia(itemArray28);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray36);
        fPHeapMin16.copia(itemArray36);
        fPHeapMin2.copia(itemArray36);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item40 = fPHeapMin2.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0722");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item4 = fPHeapMin1.min();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        fPHeapMin16.refaz(1, 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin23.imprime();
        fPHeapMin23.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray28 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin23.copia(itemArray28);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray28);
        fPHeapMin16.copia(itemArray28);
        fPHeapMin1.copia(itemArray28);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0723");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz(1, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray11);
        fPHeapMin5.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin3.copia(itemArray11);
        fPHeapMin3.constroi();
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
        fPHeapMin24.refaz(1, 0);
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMin24.copia(itemArray28);
        fPHeapMin22.copia(itemArray28);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray28);
        fPHeapMin20.copia(itemArray28);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray28);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin3.diminuiChave((int) (short) 10, (java.lang.Object) fPHeapMin35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0724");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin6.imprime();
        fPHeapMin6.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin6.copia(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray16);
        fPHeapMin1.copia(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0725");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0726");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.refaz((int) (short) 1, 0);
        ds.Item item8 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz(1, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        fPHeapMin1.refaz((int) (short) 1, 0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0727");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray10);
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin16.insere(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0728");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin14.copia(itemArray15);
        fPHeapMin12.copia(itemArray15);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        fPHeapMin12.copia(itemArray21);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray24);
        fPHeapMin12.copia(itemArray24);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        fPHeapMin12.copia(itemArray32);
        fPHeapMin12.constroi();
        fPHeapMin12.constroi();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0729");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        fPHeapMin6.refaz(1, 0);
        fPHeapMin6.constroi();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin12.imprime();
        fPHeapMin12.constroi();
        fPHeapMin12.constroi();
        fPHeapMin12.imprime();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin18.imprime();
        fPHeapMin18.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray23 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray23);
        fPHeapMin18.copia(itemArray23);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray23);
        fPHeapMin12.copia(itemArray23);
        fPHeapMin6.copia(itemArray23);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray23);
        fPHeapMin1.copia(itemArray23);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin36.imprime();
        fPHeapMin36.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray41 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        fPHeapMin36.copia(itemArray41);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray41);
        fPHeapMin34.copia(itemArray41);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) -1, (java.lang.Object) itemArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0730");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz(1, 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.refaz(1, 0);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin18.copia(itemArray22);
        fPHeapMin16.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray22);
        fPHeapMin14.copia(itemArray22);
        ds.Item[] itemArray27 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        fPHeapMin14.copia(itemArray27);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray27);
        ds.Item item36 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin35.insere(item36);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0731");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0732");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) ' ', (int) (short) 0);
        ds.Item item6 = fPHeapMin1.min();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0733");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) ' ', (int) (short) 0);
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0734");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0735");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        fPHeapMin9.refaz(1, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0736");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.refaz((int) 'a', (int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz(0, (int) (byte) -1);
        fPHeapMin1.constroi();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0737");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item9 = fPHeapMin8.min();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz((int) (short) 1, 0);
        ds.Item item15 = fPHeapMin11.min();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        fPHeapMin19.refaz(1, 0);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray23);
        fPHeapMin17.copia(itemArray23);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray23);
        fPHeapMin11.copia(itemArray23);
        fPHeapMin8.copia(itemArray23);
        fPHeapMin1.copia(itemArray23);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray23);
        fPHeapMin30.imprime();
        fPHeapMin30.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin30.diminuiChave(0, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0738");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item9 = fPHeapMin8.min();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz((int) (short) 1, 0);
        ds.Item item15 = fPHeapMin11.min();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        fPHeapMin19.refaz(1, 0);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray23);
        fPHeapMin17.copia(itemArray23);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray23);
        fPHeapMin11.copia(itemArray23);
        fPHeapMin8.copia(itemArray23);
        fPHeapMin1.copia(itemArray23);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray23);
        ds.Item item33 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin32.insere(item33);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0739");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) (short) 1, (int) (short) 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        fPHeapMin16.refaz(1, 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray20);
        fPHeapMin14.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray20);
        fPHeapMin12.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        fPHeapMin1.imprime();
        ds.Item item27 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass29 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0740");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.refaz((int) (short) 0, (int) (byte) -1);
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0741");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item6 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0742");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray0);
        fPHeapMin4.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin7.imprime();
        fPHeapMin7.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        fPHeapMin7.copia(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray12);
        fPHeapMin19.imprime();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
        fPHeapMin26.refaz(1, 0);
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray30);
        fPHeapMin24.copia(itemArray30);
        fPHeapMin22.copia(itemArray30);
        fPHeapMin19.copia(itemArray30);
        fPHeapMin4.copia(itemArray30);
        fPHeapMin4.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item37 = fPHeapMin4.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0743");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        fPHeapMin10.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin14.imprime();
        fPHeapMin14.constroi();
        fPHeapMin14.constroi();
        fPHeapMin14.imprime();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin20.imprime();
        fPHeapMin20.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray25);
        fPHeapMin20.copia(itemArray25);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray25);
        fPHeapMin14.copia(itemArray25);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray25);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin10.diminuiChave((-1), (java.lang.Object) itemArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0744");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.constroi();
        fPHeapMin8.constroi();
        ds.Item item12 = fPHeapMin8.min();
        fPHeapMin8.refaz((int) (short) 1, (int) (short) 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        fPHeapMin23.refaz(1, 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        fPHeapMin19.copia(itemArray27);
        fPHeapMin8.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        fPHeapMin1.imprime();
        ds.Item item35 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray40 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray40);
        fPHeapMin39.copia(itemArray40);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item48 = fPHeapMin47.min();
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMin47.copia(itemArray50);
        fPHeapMin45.copia(itemArray50);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '#', (java.lang.Object) fPHeapMin45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0745");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        fPHeapMin8.refaz(1, 0);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray12);
        fPHeapMin6.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0746");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        fPHeapMin10.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item15 = fPHeapMin14.min();
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin14.copia(itemArray17);
        fPHeapMin14.refaz((int) (short) 100, 0);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin23.imprime();
        fPHeapMin23.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray28 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin23.copia(itemArray28);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray37 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray37);
        fPHeapMin36.copia(itemArray37);
        fPHeapMin34.copia(itemArray37);
        ds.Item[] itemArray43 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray43);
        fPHeapMin34.copia(itemArray43);
        ds.Item[] itemArray46 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray46);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray46);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray46);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray46);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray46);
        fPHeapMin34.copia(itemArray46);
        fPHeapMin14.copia(itemArray46);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(100);
        fPHeapMin55.refaz((int) (short) 1, 0);
        ds.Item item59 = fPHeapMin55.min();
        fPHeapMin55.constroi();
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin62.imprime();
        fPHeapMin62.constroi();
        fPHeapMin62.constroi();
        ds.Item item66 = fPHeapMin62.min();
        fPHeapMin62.refaz((int) (short) 1, (int) (short) 0);
        ds.Item[] itemArray70 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(itemArray70);
        ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(itemArray70);
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin(itemArray70);
        ds.FPHeapMin fPHeapMin75 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin77 = new ds.FPHeapMin(100);
        fPHeapMin77.refaz(1, 0);
        ds.Item[] itemArray81 = new ds.Item[] {};
        fPHeapMin77.copia(itemArray81);
        fPHeapMin75.copia(itemArray81);
        ds.FPHeapMin fPHeapMin84 = new ds.FPHeapMin(itemArray81);
        fPHeapMin73.copia(itemArray81);
        fPHeapMin62.copia(itemArray81);
        fPHeapMin55.copia(itemArray81);
        fPHeapMin14.copia(itemArray81);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin10.diminuiChave(1, (java.lang.Object) itemArray81);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNull(item66);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(itemArray81);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0747");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item item13 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin15.imprime();
        fPHeapMin15.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin15.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0748");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0749");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        fPHeapMin9.refaz(1, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin19.imprime();
        fPHeapMin19.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        fPHeapMin19.copia(itemArray24);
        fPHeapMin1.copia(itemArray24);
        fPHeapMin1.constroi();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0750");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        fPHeapMin11.constroi();
        fPHeapMin11.constroi();
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        fPHeapMin21.refaz(1, 0);
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray25);
        fPHeapMin19.copia(itemArray25);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray25);
        fPHeapMin17.copia(itemArray25);
        ds.Item[] itemArray30 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray30);
        fPHeapMin17.copia(itemArray30);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray30);
        fPHeapMin11.copia(itemArray30);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
        fPHeapMin38.refaz(1, 0);
        fPHeapMin38.constroi();
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin44.imprime();
        fPHeapMin44.constroi();
        fPHeapMin44.constroi();
        fPHeapMin44.imprime();
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin50.imprime();
        fPHeapMin50.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray55 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray55);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray55);
        fPHeapMin50.copia(itemArray55);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray55);
        fPHeapMin44.copia(itemArray55);
        fPHeapMin38.copia(itemArray55);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray55);
        fPHeapMin11.copia(itemArray55);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray55);
        fPHeapMin64.constroi();
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(100);
        fPHeapMin68.refaz(1, 0);
        ds.Item[] itemArray72 = new ds.Item[] {};
        fPHeapMin68.copia(itemArray72);
        ds.Item item74 = fPHeapMin68.min();
        fPHeapMin68.imprime();
        ds.FPHeapMin fPHeapMin77 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin77.imprime();
        ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin80.imprime();
        fPHeapMin80.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray85 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin86 = new ds.FPHeapMin(itemArray85);
        ds.FPHeapMin fPHeapMin87 = new ds.FPHeapMin(itemArray85);
        fPHeapMin80.copia(itemArray85);
        fPHeapMin77.copia(itemArray85);
        fPHeapMin68.copia(itemArray85);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin64.diminuiChave((int) (short) -1, (java.lang.Object) fPHeapMin68);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNull(item74);
        org.junit.Assert.assertNotNull(itemArray85);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0751");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item item13 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin15.imprime();
        fPHeapMin15.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin15.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item29 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0752");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz(1, 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) ' ');
        fPHeapMin15.imprime();
        fPHeapMin15.refaz((int) ' ', (int) (short) 0);
        ds.Item item20 = fPHeapMin15.min();
        fPHeapMin15.constroi();
        ds.Item item22 = fPHeapMin15.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
        fPHeapMin26.refaz(1, 0);
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray30);
        fPHeapMin24.copia(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray30);
        fPHeapMin15.copia(itemArray30);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray30);
        fPHeapMin13.copia(itemArray30);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0753");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item4 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        fPHeapMin6.refaz(1, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin13.imprime();
        fPHeapMin13.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin13.copia(itemArray18);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray18);
        fPHeapMin6.copia(itemArray18);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
        fPHeapMin27.refaz(1, 0);
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMin27.copia(itemArray31);
        fPHeapMin25.copia(itemArray31);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray31);
        fPHeapMin6.copia(itemArray31);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
        fPHeapMin39.refaz((int) (short) 1, 0);
        ds.Item item43 = fPHeapMin39.min();
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(100);
        fPHeapMin47.refaz(1, 0);
        ds.Item[] itemArray51 = new ds.Item[] {};
        fPHeapMin47.copia(itemArray51);
        fPHeapMin45.copia(itemArray51);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray51);
        fPHeapMin39.copia(itemArray51);
        fPHeapMin37.copia(itemArray51);
        fPHeapMin6.copia(itemArray51);
        fPHeapMin1.copia(itemArray51);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin60.imprime();
        fPHeapMin60.constroi();
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin64.imprime();
        fPHeapMin64.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray69 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(itemArray69);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(itemArray69);
        fPHeapMin64.copia(itemArray69);
        fPHeapMin60.copia(itemArray69);
        ds.Item item74 = null;
        ds.Item[] itemArray75 = new ds.Item[] { item74 };
        fPHeapMin60.copia(itemArray75);
        fPHeapMin1.copia(itemArray75);
        ds.Item item78 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(itemArray75);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0754");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray1);
        fPHeapMin2.refaz(0, (-1));
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(10);
        ds.Item item9 = fPHeapMin8.min();
        ds.Item item10 = fPHeapMin8.min();
        java.lang.Class<?> wildcardClass11 = fPHeapMin8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.diminuiChave((int) 'a', (java.lang.Object) fPHeapMin8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0755");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin3.imprime();
        fPHeapMin3.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin3.copia(itemArray8);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray8);
        fPHeapMin13.constroi();
        fPHeapMin13.constroi();
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        fPHeapMin23.refaz(1, 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        fPHeapMin19.copia(itemArray27);
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray32);
        fPHeapMin19.copia(itemArray32);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray32);
        fPHeapMin13.copia(itemArray32);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
        fPHeapMin40.refaz(1, 0);
        fPHeapMin40.constroi();
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin46.imprime();
        fPHeapMin46.constroi();
        fPHeapMin46.constroi();
        fPHeapMin46.imprime();
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin52.imprime();
        fPHeapMin52.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray57 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray57);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray57);
        fPHeapMin52.copia(itemArray57);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(itemArray57);
        fPHeapMin46.copia(itemArray57);
        fPHeapMin40.copia(itemArray57);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray57);
        fPHeapMin13.copia(itemArray57);
        fPHeapMin1.copia(itemArray57);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray57);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin67.refaz((int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray57);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0756");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin4.imprime();
        fPHeapMin4.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin4.copia(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray18);
        fPHeapMin17.copia(itemArray18);
        fPHeapMin15.copia(itemArray18);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        fPHeapMin15.copia(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
        fPHeapMin32.refaz(1, 0);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMin32.copia(itemArray36);
        fPHeapMin30.copia(itemArray36);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray36);
        fPHeapMin28.copia(itemArray36);
        fPHeapMin15.copia(itemArray36);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '4', (java.lang.Object) itemArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0757");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        fPHeapMin1.constroi();
        fPHeapMin1.refaz((int) '4', (int) (byte) -1);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin10.imprime();
        fPHeapMin10.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin10.copia(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray15);
        fPHeapMin22.imprime();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
        fPHeapMin29.refaz(1, 0);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray33);
        fPHeapMin27.copia(itemArray33);
        fPHeapMin25.copia(itemArray33);
        fPHeapMin22.copia(itemArray33);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray33);
        fPHeapMin1.copia(itemArray33);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray33);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0758");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz((int) (short) 1, 0);
        ds.Item item7 = fPHeapMin3.min();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz(1, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray15);
        fPHeapMin9.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin3.copia(itemArray15);
        fPHeapMin1.copia(itemArray15);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin23.imprime();
        fPHeapMin23.constroi();
        fPHeapMin23.constroi();
        ds.Item item27 = fPHeapMin23.min();
        fPHeapMin23.refaz((int) (short) 1, (int) (short) 0);
        fPHeapMin23.constroi();
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
        fPHeapMin33.refaz(1, 0);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
        fPHeapMin38.refaz(1, 0);
        fPHeapMin38.constroi();
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin44.imprime();
        fPHeapMin44.constroi();
        fPHeapMin44.constroi();
        fPHeapMin44.imprime();
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin50.imprime();
        fPHeapMin50.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray55 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray55);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray55);
        fPHeapMin50.copia(itemArray55);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray55);
        fPHeapMin44.copia(itemArray55);
        fPHeapMin38.copia(itemArray55);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray55);
        fPHeapMin33.copia(itemArray55);
        fPHeapMin23.copia(itemArray55);
        fPHeapMin1.copia(itemArray55);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(100);
        fPHeapMin67.refaz(1, 0);
        ds.Item[] itemArray71 = new ds.Item[] {};
        fPHeapMin67.copia(itemArray71);
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin74.imprime();
        fPHeapMin74.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray79 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin(itemArray79);
        ds.FPHeapMin fPHeapMin81 = new ds.FPHeapMin(itemArray79);
        fPHeapMin74.copia(itemArray79);
        ds.FPHeapMin fPHeapMin83 = new ds.FPHeapMin(itemArray79);
        fPHeapMin67.copia(itemArray79);
        ds.FPHeapMin fPHeapMin86 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin88 = new ds.FPHeapMin(100);
        fPHeapMin88.refaz(1, 0);
        ds.Item[] itemArray92 = new ds.Item[] {};
        fPHeapMin88.copia(itemArray92);
        fPHeapMin86.copia(itemArray92);
        ds.FPHeapMin fPHeapMin95 = new ds.FPHeapMin(itemArray92);
        fPHeapMin67.copia(itemArray92);
        fPHeapMin1.copia(itemArray92);
        ds.FPHeapMin fPHeapMin98 = new ds.FPHeapMin(itemArray92);
        java.lang.Class<?> wildcardClass99 = itemArray92.getClass();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertNotNull(itemArray92);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0759");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        ds.Item item7 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0760");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item4 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin7.imprime();
        fPHeapMin7.constroi();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin11.imprime();
        fPHeapMin11.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin11.copia(itemArray16);
        fPHeapMin7.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin24.imprime();
        fPHeapMin24.constroi();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin28.imprime();
        fPHeapMin28.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray33 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray33);
        fPHeapMin28.copia(itemArray33);
        fPHeapMin24.copia(itemArray33);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMin24.copia(itemArray39);
        fPHeapMin22.copia(itemArray39);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(10, (java.lang.Object) fPHeapMin22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0761");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin4.imprime();
        fPHeapMin4.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin4.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0762");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item9 = fPHeapMin8.min();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz((int) (short) 1, 0);
        ds.Item item15 = fPHeapMin11.min();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        fPHeapMin19.refaz(1, 0);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray23);
        fPHeapMin17.copia(itemArray23);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray23);
        fPHeapMin11.copia(itemArray23);
        fPHeapMin8.copia(itemArray23);
        fPHeapMin1.copia(itemArray23);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray23);
        fPHeapMin30.imprime();
        fPHeapMin30.constroi();
        fPHeapMin30.imprime();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0763");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray6);
        fPHeapMin13.imprime();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
        fPHeapMin20.refaz(1, 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin20.copia(itemArray24);
        fPHeapMin18.copia(itemArray24);
        fPHeapMin16.copia(itemArray24);
        fPHeapMin13.copia(itemArray24);
        fPHeapMin13.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin13.refaz(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0764");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz(1, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray11);
        fPHeapMin5.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin3.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray16);
        fPHeapMin22.imprime();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (byte) 1);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin27.imprime();
        fPHeapMin27.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray32);
        fPHeapMin27.copia(itemArray32);
        fPHeapMin25.copia(itemArray32);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray32);
        fPHeapMin22.copia(itemArray32);
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0765");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass4 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0766");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0767");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) ' ', (int) (short) 0);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0768");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item9 = fPHeapMin8.min();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz((int) (short) 1, 0);
        ds.Item item15 = fPHeapMin11.min();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        fPHeapMin19.refaz(1, 0);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray23);
        fPHeapMin17.copia(itemArray23);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray23);
        fPHeapMin11.copia(itemArray23);
        fPHeapMin8.copia(itemArray23);
        fPHeapMin1.copia(itemArray23);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray23);
        fPHeapMin30.imprime();
        fPHeapMin30.constroi();
        java.lang.Class<?> wildcardClass33 = fPHeapMin30.getClass();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0769");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0770");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin14.copia(itemArray15);
        fPHeapMin12.copia(itemArray15);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        fPHeapMin12.copia(itemArray21);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
        fPHeapMin29.refaz(1, 0);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray33);
        fPHeapMin27.copia(itemArray33);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray33);
        fPHeapMin25.copia(itemArray33);
        fPHeapMin12.copia(itemArray33);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item40 = fPHeapMin12.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0771");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        fPHeapMin1.imprime();
        ds.Item item14 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) 'a', (int) 'a');
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0772");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz(1, 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray7);
        fPHeapMin12.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin12.refaz((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0773");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item2 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0774");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = fPHeapMin14.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0775");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.refaz((int) (short) 100, 0);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin10.imprime();
        fPHeapMin10.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin10.copia(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        fPHeapMin23.copia(itemArray24);
        fPHeapMin21.copia(itemArray24);
        ds.Item[] itemArray30 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        fPHeapMin21.copia(itemArray30);
        ds.Item[] itemArray33 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray33);
        fPHeapMin21.copia(itemArray33);
        fPHeapMin1.copia(itemArray33);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
        fPHeapMin42.refaz((int) (short) 1, 0);
        ds.Item item46 = fPHeapMin42.min();
        fPHeapMin42.constroi();
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin49.imprime();
        fPHeapMin49.constroi();
        fPHeapMin49.constroi();
        ds.Item item53 = fPHeapMin49.min();
        fPHeapMin49.refaz((int) (short) 1, (int) (short) 0);
        ds.Item[] itemArray57 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray57);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray57);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray57);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(100);
        fPHeapMin64.refaz(1, 0);
        ds.Item[] itemArray68 = new ds.Item[] {};
        fPHeapMin64.copia(itemArray68);
        fPHeapMin62.copia(itemArray68);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(itemArray68);
        fPHeapMin60.copia(itemArray68);
        fPHeapMin49.copia(itemArray68);
        fPHeapMin42.copia(itemArray68);
        fPHeapMin1.copia(itemArray68);
        ds.Item item76 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray68);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0776");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 0);
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin8.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray22);
        fPHeapMin21.copia(itemArray22);
        fPHeapMin19.copia(itemArray22);
        ds.Item[] itemArray28 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        fPHeapMin19.copia(itemArray28);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        fPHeapMin19.copia(itemArray31);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray39);
        fPHeapMin19.copia(itemArray39);
        fPHeapMin5.copia(itemArray39);
        fPHeapMin1.copia(itemArray39);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item44 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0777");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray0);
        fPHeapMin4.constroi();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item9 = fPHeapMin8.min();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz((int) (short) 1, 0);
        ds.Item item15 = fPHeapMin11.min();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        fPHeapMin19.refaz(1, 0);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray23);
        fPHeapMin17.copia(itemArray23);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray23);
        fPHeapMin11.copia(itemArray23);
        fPHeapMin8.copia(itemArray23);
        fPHeapMin8.refaz((int) (short) 1, 0);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin((int) (short) 100);
        fPHeapMin33.imprime();
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item37 = fPHeapMin36.min();
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
        fPHeapMin39.refaz((int) (short) 1, 0);
        ds.Item item43 = fPHeapMin39.min();
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(100);
        fPHeapMin47.refaz(1, 0);
        ds.Item[] itemArray51 = new ds.Item[] {};
        fPHeapMin47.copia(itemArray51);
        fPHeapMin45.copia(itemArray51);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray51);
        fPHeapMin39.copia(itemArray51);
        fPHeapMin36.copia(itemArray51);
        fPHeapMin36.refaz((int) (short) 1, 0);
        fPHeapMin36.constroi();
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(100);
        fPHeapMin62.refaz(1, 0);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(100);
        fPHeapMin71.refaz(1, 0);
        ds.Item[] itemArray75 = new ds.Item[] {};
        fPHeapMin71.copia(itemArray75);
        fPHeapMin69.copia(itemArray75);
        fPHeapMin67.copia(itemArray75);
        ds.Item item79 = fPHeapMin67.min();
        ds.FPHeapMin fPHeapMin81 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin81.imprime();
        fPHeapMin81.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray86 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin87 = new ds.FPHeapMin(itemArray86);
        ds.FPHeapMin fPHeapMin88 = new ds.FPHeapMin(itemArray86);
        fPHeapMin81.copia(itemArray86);
        fPHeapMin67.copia(itemArray86);
        fPHeapMin62.copia(itemArray86);
        fPHeapMin36.copia(itemArray86);
        ds.FPHeapMin fPHeapMin93 = new ds.FPHeapMin(itemArray86);
        ds.FPHeapMin fPHeapMin94 = new ds.FPHeapMin(itemArray86);
        fPHeapMin33.copia(itemArray86);
        fPHeapMin8.copia(itemArray86);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin4.diminuiChave((int) (byte) -1, (java.lang.Object) itemArray86);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertNull(item79);
        org.junit.Assert.assertNotNull(itemArray86);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0778");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0779");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        ds.Item item7 = fPHeapMin1.min();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0780");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        fPHeapMin11.constroi();
        fPHeapMin11.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin11.refaz(1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0781");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item5 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz((int) (short) 1, 0);
        ds.Item item11 = fPHeapMin7.min();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
        fPHeapMin15.refaz(1, 0);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMin15.copia(itemArray19);
        fPHeapMin13.copia(itemArray19);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray19);
        fPHeapMin7.copia(itemArray19);
        fPHeapMin4.copia(itemArray19);
        fPHeapMin4.refaz((int) (short) 1, 0);
        fPHeapMin4.constroi();
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
        fPHeapMin30.refaz(1, 0);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
        fPHeapMin39.refaz(1, 0);
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMin39.copia(itemArray43);
        fPHeapMin37.copia(itemArray43);
        fPHeapMin35.copia(itemArray43);
        ds.Item item47 = fPHeapMin35.min();
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin49.imprime();
        fPHeapMin49.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray54 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray54);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray54);
        fPHeapMin49.copia(itemArray54);
        fPHeapMin35.copia(itemArray54);
        fPHeapMin30.copia(itemArray54);
        fPHeapMin4.copia(itemArray54);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(itemArray54);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray54);
        fPHeapMin1.copia(itemArray54);
        fPHeapMin1.refaz((int) 'a', (int) '#');
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0782");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz(1, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray11);
        fPHeapMin5.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin3.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray16);
        fPHeapMin21.constroi();
        fPHeapMin21.imprime();
        fPHeapMin21.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item25 = fPHeapMin21.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0783");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item9 = fPHeapMin8.min();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin8.copia(itemArray11);
        fPHeapMin8.refaz((int) (short) 100, 0);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin17.imprime();
        fPHeapMin17.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        fPHeapMin17.copia(itemArray22);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray31);
        fPHeapMin30.copia(itemArray31);
        fPHeapMin28.copia(itemArray31);
        ds.Item[] itemArray37 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray37);
        fPHeapMin28.copia(itemArray37);
        ds.Item[] itemArray40 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray40);
        fPHeapMin28.copia(itemArray40);
        fPHeapMin8.copia(itemArray40);
        fPHeapMin1.copia(itemArray40);
        ds.Item item49 = fPHeapMin1.min();
        ds.Item item50 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item49);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0784");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz(1, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray11);
        fPHeapMin5.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin3.copia(itemArray11);
        fPHeapMin3.constroi();
        fPHeapMin3.imprime();
        fPHeapMin3.constroi();
        fPHeapMin3.imprime();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0785");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin7.copia(itemArray8);
        fPHeapMin7.imprime();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0786");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) (short) 1, (int) (short) 0);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0787");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin14.imprime();
        fPHeapMin14.constroi();
        fPHeapMin14.constroi();
        fPHeapMin14.imprime();
        fPHeapMin14.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item22 = fPHeapMin21.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
        fPHeapMin24.refaz((int) (short) 1, 0);
        ds.Item item28 = fPHeapMin24.min();
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
        fPHeapMin32.refaz(1, 0);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMin32.copia(itemArray36);
        fPHeapMin30.copia(itemArray36);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray36);
        fPHeapMin24.copia(itemArray36);
        fPHeapMin21.copia(itemArray36);
        fPHeapMin14.copia(itemArray36);
        fPHeapMin1.copia(itemArray36);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray36);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0788");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        fPHeapMin1.copia(itemArray4);
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0789");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        fPHeapMin11.constroi();
        fPHeapMin11.constroi();
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        fPHeapMin21.refaz(1, 0);
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray25);
        fPHeapMin19.copia(itemArray25);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray25);
        fPHeapMin17.copia(itemArray25);
        ds.Item[] itemArray30 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray30);
        fPHeapMin17.copia(itemArray30);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray30);
        fPHeapMin11.copia(itemArray30);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
        fPHeapMin38.refaz(1, 0);
        fPHeapMin38.constroi();
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin44.imprime();
        fPHeapMin44.constroi();
        fPHeapMin44.constroi();
        fPHeapMin44.imprime();
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin50.imprime();
        fPHeapMin50.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray55 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray55);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray55);
        fPHeapMin50.copia(itemArray55);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray55);
        fPHeapMin44.copia(itemArray55);
        fPHeapMin38.copia(itemArray55);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray55);
        fPHeapMin11.copia(itemArray55);
        fPHeapMin11.imprime();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray55);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0790");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz((int) (short) 1, 0);
        ds.Item item7 = fPHeapMin3.min();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz(1, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray15);
        fPHeapMin9.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin3.copia(itemArray15);
        fPHeapMin1.copia(itemArray15);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin22.constroi();
        ds.Item item24 = fPHeapMin22.min();
        fPHeapMin22.constroi();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin27.imprime();
        fPHeapMin27.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray32);
        fPHeapMin27.copia(itemArray32);
        fPHeapMin22.copia(itemArray32);
        ds.Item[] itemArray37 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray37);
        fPHeapMin22.copia(itemArray37);
        fPHeapMin1.copia(itemArray37);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray37);
        fPHeapMin45.constroi();
        fPHeapMin45.imprime();
        ds.Item item48 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin45.insere(item48);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0791");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        fPHeapMin1.copia(itemArray4);
        ds.Item item6 = fPHeapMin1.min();
        ds.Item item7 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0792");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item item13 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin15.imprime();
        fPHeapMin15.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin15.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray20);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item27 = fPHeapMin26.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0793");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0794");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item5 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz((int) (short) 1, 0);
        ds.Item item11 = fPHeapMin7.min();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
        fPHeapMin15.refaz(1, 0);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMin15.copia(itemArray19);
        fPHeapMin13.copia(itemArray19);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray19);
        fPHeapMin7.copia(itemArray19);
        fPHeapMin4.copia(itemArray19);
        fPHeapMin4.refaz((int) (short) 1, 0);
        fPHeapMin4.constroi();
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
        fPHeapMin30.refaz(1, 0);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
        fPHeapMin39.refaz(1, 0);
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMin39.copia(itemArray43);
        fPHeapMin37.copia(itemArray43);
        fPHeapMin35.copia(itemArray43);
        ds.Item item47 = fPHeapMin35.min();
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin49.imprime();
        fPHeapMin49.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray54 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray54);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray54);
        fPHeapMin49.copia(itemArray54);
        fPHeapMin35.copia(itemArray54);
        fPHeapMin30.copia(itemArray54);
        fPHeapMin4.copia(itemArray54);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(itemArray54);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray54);
        fPHeapMin1.copia(itemArray54);
        ds.Item item64 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNull(item64);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0795");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin8.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
        fPHeapMin22.refaz(1, 0);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin22.copia(itemArray26);
        fPHeapMin20.copia(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray26);
        fPHeapMin1.copia(itemArray26);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
        fPHeapMin34.refaz((int) (short) 1, 0);
        ds.Item item38 = fPHeapMin34.min();
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
        fPHeapMin42.refaz(1, 0);
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMin42.copia(itemArray46);
        fPHeapMin40.copia(itemArray46);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray46);
        fPHeapMin34.copia(itemArray46);
        fPHeapMin32.copia(itemArray46);
        fPHeapMin1.copia(itemArray46);
        ds.Item item53 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0796");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        fPHeapMin9.refaz(1, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin19.imprime();
        fPHeapMin19.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        fPHeapMin19.copia(itemArray24);
        fPHeapMin1.copia(itemArray24);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray24);
        fPHeapMin30.imprime();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0797");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0798");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        fPHeapMin9.refaz(1, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass19 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0799");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.Item item10 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) ' ');
        fPHeapMin12.imprime();
        fPHeapMin12.refaz((int) ' ', (int) (short) 0);
        ds.Item item17 = fPHeapMin12.min();
        fPHeapMin12.imprime();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
        fPHeapMin24.refaz(1, 0);
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMin24.copia(itemArray28);
        fPHeapMin22.copia(itemArray28);
        fPHeapMin20.copia(itemArray28);
        ds.Item item32 = fPHeapMin20.min();
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin34.imprime();
        fPHeapMin34.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray39 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray39);
        fPHeapMin34.copia(itemArray39);
        fPHeapMin20.copia(itemArray39);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray39);
        fPHeapMin12.copia(itemArray39);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray39);
        fPHeapMin1.copia(itemArray39);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0800");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray9);
        java.lang.Class<?> wildcardClass15 = fPHeapMin14.getClass();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0801");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = item3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0802");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        fPHeapMin11.constroi();
        fPHeapMin11.constroi();
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        fPHeapMin21.refaz(1, 0);
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray25);
        fPHeapMin19.copia(itemArray25);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray25);
        fPHeapMin17.copia(itemArray25);
        ds.Item[] itemArray30 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray30);
        fPHeapMin17.copia(itemArray30);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray30);
        fPHeapMin11.copia(itemArray30);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray30);
        fPHeapMin37.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item39 = fPHeapMin37.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0803");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin1.copia(itemArray7);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0804");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.refaz((int) 'a', (int) (byte) 1);
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) '4', 0);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0805");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.refaz((int) (short) 1, 0);
        ds.Item item8 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz(1, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item25 = fPHeapMin24.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0806");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin8.imprime();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin11.imprime();
        fPHeapMin11.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin11.copia(itemArray16);
        fPHeapMin8.copia(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin22.constroi();
        ds.Item item24 = fPHeapMin22.min();
        fPHeapMin22.constroi();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin27.imprime();
        fPHeapMin27.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray32);
        fPHeapMin27.copia(itemArray32);
        fPHeapMin22.copia(itemArray32);
        fPHeapMin8.copia(itemArray32);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray32);
        fPHeapMin5.copia(itemArray32);
        fPHeapMin1.copia(itemArray32);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0807");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
        fPHeapMin10.refaz(1, 0);
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray14);
        fPHeapMin8.copia(itemArray14);
        fPHeapMin6.copia(itemArray14);
        ds.Item item18 = fPHeapMin6.min();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin20.imprime();
        fPHeapMin20.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray25);
        fPHeapMin20.copia(itemArray25);
        fPHeapMin6.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(100);
        fPHeapMin35.refaz(1, 0);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(100);
        fPHeapMin44.refaz(1, 0);
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMin44.copia(itemArray48);
        fPHeapMin42.copia(itemArray48);
        fPHeapMin40.copia(itemArray48);
        ds.Item item52 = fPHeapMin40.min();
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin54.imprime();
        fPHeapMin54.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray59 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray59);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(itemArray59);
        fPHeapMin54.copia(itemArray59);
        fPHeapMin40.copia(itemArray59);
        fPHeapMin35.copia(itemArray59);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray59);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray59);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin32.diminuiChave((int) (byte) 100, (java.lang.Object) fPHeapMin66);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNotNull(itemArray59);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0808");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        java.lang.Class<?> wildcardClass14 = fPHeapMin13.getClass();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0809");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item9 = fPHeapMin8.min();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz((int) (short) 1, 0);
        ds.Item item15 = fPHeapMin11.min();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        fPHeapMin19.refaz(1, 0);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray23);
        fPHeapMin17.copia(itemArray23);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray23);
        fPHeapMin11.copia(itemArray23);
        fPHeapMin8.copia(itemArray23);
        fPHeapMin1.copia(itemArray23);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray23);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item32 = fPHeapMin31.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0810");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz(1, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray11);
        fPHeapMin5.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin3.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray16);
        java.lang.Class<?> wildcardClass23 = itemArray16.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0811");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0812");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item4 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0813");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin17.imprime();
        fPHeapMin17.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        fPHeapMin17.copia(itemArray22);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray22);
        fPHeapMin27.constroi();
        fPHeapMin27.constroi();
        ds.Item[] itemArray30 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(100);
        fPHeapMin37.refaz(1, 0);
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMin37.copia(itemArray41);
        fPHeapMin35.copia(itemArray41);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray41);
        fPHeapMin33.copia(itemArray41);
        ds.Item[] itemArray46 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray46);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray46);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray46);
        fPHeapMin33.copia(itemArray46);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray46);
        fPHeapMin27.copia(itemArray46);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((-1), (java.lang.Object) fPHeapMin27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0814");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) ' ', (int) (short) 0);
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
        fPHeapMin13.refaz(1, 0);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMin13.copia(itemArray17);
        fPHeapMin11.copia(itemArray17);
        fPHeapMin9.copia(itemArray17);
        ds.Item item21 = fPHeapMin9.min();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin23.imprime();
        fPHeapMin23.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray28 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin23.copia(itemArray28);
        fPHeapMin9.copia(itemArray28);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray28);
        fPHeapMin1.copia(itemArray28);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray28);
        java.lang.Class<?> wildcardClass36 = itemArray28.getClass();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0815");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0816");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0817");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.constroi();
        fPHeapMin8.imprime();
        ds.Item item11 = fPHeapMin8.min();
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        fPHeapMin8.copia(itemArray12);
        fPHeapMin8.imprime();
        fPHeapMin8.constroi();
        fPHeapMin8.imprime();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        fPHeapMin23.refaz(1, 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin30.imprime();
        fPHeapMin30.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray35 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray35);
        fPHeapMin30.copia(itemArray35);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray35);
        fPHeapMin23.copia(itemArray35);
        fPHeapMin8.copia(itemArray35);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(100);
        fPHeapMin45.refaz((int) (short) 1, 0);
        ds.Item item49 = fPHeapMin45.min();
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(100);
        fPHeapMin53.refaz(1, 0);
        ds.Item[] itemArray57 = new ds.Item[] {};
        fPHeapMin53.copia(itemArray57);
        fPHeapMin51.copia(itemArray57);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray57);
        fPHeapMin45.copia(itemArray57);
        fPHeapMin43.copia(itemArray57);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin64.constroi();
        ds.Item item66 = fPHeapMin64.min();
        fPHeapMin64.constroi();
        ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin69.imprime();
        fPHeapMin69.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray74 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin75 = new ds.FPHeapMin(itemArray74);
        ds.FPHeapMin fPHeapMin76 = new ds.FPHeapMin(itemArray74);
        fPHeapMin69.copia(itemArray74);
        fPHeapMin64.copia(itemArray74);
        ds.Item[] itemArray79 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin(itemArray79);
        ds.FPHeapMin fPHeapMin81 = new ds.FPHeapMin(itemArray79);
        ds.FPHeapMin fPHeapMin82 = new ds.FPHeapMin(itemArray79);
        ds.FPHeapMin fPHeapMin83 = new ds.FPHeapMin(itemArray79);
        ds.FPHeapMin fPHeapMin84 = new ds.FPHeapMin(itemArray79);
        fPHeapMin64.copia(itemArray79);
        fPHeapMin43.copia(itemArray79);
        fPHeapMin8.copia(itemArray79);
        ds.Item item88 = fPHeapMin8.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 0, (java.lang.Object) item88);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNull(item49);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNull(item66);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertNull(item88);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0818");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin13.constroi();
        fPHeapMin13.imprime();
        fPHeapMin13.imprime();
        fPHeapMin13.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        fPHeapMin23.refaz(1, 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray27);
        fPHeapMin19.copia(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray27);
        fPHeapMin13.copia(itemArray27);
        fPHeapMin11.copia(itemArray27);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0819");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz(1, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray11);
        fPHeapMin5.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin3.copia(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = fPHeapMin3.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0820");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item15 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item18 = fPHeapMin17.min();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
        fPHeapMin20.refaz((int) (short) 1, 0);
        ds.Item item24 = fPHeapMin20.min();
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
        fPHeapMin28.refaz(1, 0);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMin28.copia(itemArray32);
        fPHeapMin26.copia(itemArray32);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray32);
        fPHeapMin20.copia(itemArray32);
        fPHeapMin17.copia(itemArray32);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray32);
        fPHeapMin1.copia(itemArray32);
        ds.Item item40 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0821");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0822");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin6.imprime();
        fPHeapMin6.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin6.copia(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray16);
        fPHeapMin1.copia(itemArray16);
        java.lang.Class<?> wildcardClass23 = itemArray16.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0823");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = fPHeapMin15.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0824");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz(1, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray11);
        fPHeapMin5.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray11);
        java.lang.Class<?> wildcardClass21 = itemArray11.getClass();
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0825");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0826");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
        fPHeapMin1.constroi();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0827");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz((int) (short) 1, 0);
        ds.Item item7 = fPHeapMin3.min();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz(1, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray15);
        fPHeapMin9.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin3.copia(itemArray15);
        fPHeapMin1.copia(itemArray15);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin23.imprime();
        fPHeapMin23.constroi();
        fPHeapMin23.constroi();
        fPHeapMin23.imprime();
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin29.imprime();
        fPHeapMin29.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray34 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray34);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray34);
        fPHeapMin29.copia(itemArray34);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray34);
        fPHeapMin23.copia(itemArray34);
        fPHeapMin1.copia(itemArray34);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray34);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0828");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.refaz(1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0829");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz((int) (short) 1, 0);
        ds.Item item11 = fPHeapMin7.min();
        fPHeapMin7.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin14.imprime();
        fPHeapMin14.constroi();
        fPHeapMin14.constroi();
        ds.Item item18 = fPHeapMin14.min();
        fPHeapMin14.refaz((int) (short) 1, (int) (short) 0);
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
        fPHeapMin29.refaz(1, 0);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray33);
        fPHeapMin27.copia(itemArray33);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray33);
        fPHeapMin25.copia(itemArray33);
        fPHeapMin14.copia(itemArray33);
        fPHeapMin7.copia(itemArray33);
        fPHeapMin1.copia(itemArray33);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray33);
        ds.Item item42 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin41.insere(item42);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0830");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.refaz(1, 0);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray8);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((-1), (java.lang.Object) itemArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0831");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item10 = fPHeapMin9.min();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin9.copia(itemArray12);
        fPHeapMin7.copia(itemArray12);
        fPHeapMin7.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin7.refaz((int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0832");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.refaz((int) (short) 1, 0);
        ds.Item item8 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz(1, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        fPHeapMin1.refaz((int) (short) 1, 0);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
        fPHeapMin27.refaz(1, 0);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(100);
        fPHeapMin36.refaz(1, 0);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMin36.copia(itemArray40);
        fPHeapMin34.copia(itemArray40);
        fPHeapMin32.copia(itemArray40);
        ds.Item item44 = fPHeapMin32.min();
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin46.imprime();
        fPHeapMin46.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray51 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray51);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray51);
        fPHeapMin46.copia(itemArray51);
        fPHeapMin32.copia(itemArray51);
        fPHeapMin27.copia(itemArray51);
        fPHeapMin1.copia(itemArray51);
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray51);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin60.imprime();
        fPHeapMin60.constroi();
        fPHeapMin60.constroi();
        ds.Item item64 = fPHeapMin60.min();
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin68.imprime();
        fPHeapMin68.constroi();
        ds.Item[] itemArray71 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(itemArray71);
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin(itemArray71);
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin(itemArray71);
        ds.FPHeapMin fPHeapMin75 = new ds.FPHeapMin(itemArray71);
        fPHeapMin68.copia(itemArray71);
        ds.FPHeapMin fPHeapMin77 = new ds.FPHeapMin(itemArray71);
        fPHeapMin66.copia(itemArray71);
        fPHeapMin60.copia(itemArray71);
        fPHeapMin58.copia(itemArray71);
        ds.FPHeapMin fPHeapMin81 = new ds.FPHeapMin(itemArray71);
        ds.Item item82 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin81.insere(item82);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNull(item64);
        org.junit.Assert.assertNotNull(itemArray71);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0833");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray10);
        ds.Item[] itemArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin16.copia(itemArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0834");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin18.constroi();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin23.imprime();
        fPHeapMin23.constroi();
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray26);
        fPHeapMin23.copia(itemArray26);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray26);
        fPHeapMin21.copia(itemArray26);
        fPHeapMin18.copia(itemArray26);
        java.lang.Class<?> wildcardClass35 = itemArray26.getClass();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0835");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz((int) (short) 1, 0);
        ds.Item item7 = fPHeapMin3.min();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz(1, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray15);
        fPHeapMin9.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin3.copia(itemArray15);
        fPHeapMin1.copia(itemArray15);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
        fPHeapMin28.refaz(1, 0);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMin28.copia(itemArray32);
        fPHeapMin26.copia(itemArray32);
        fPHeapMin24.copia(itemArray32);
        ds.Item item36 = fPHeapMin24.min();
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin38.imprime();
        fPHeapMin38.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray43 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray43);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray43);
        fPHeapMin38.copia(itemArray43);
        fPHeapMin24.copia(itemArray43);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(100, (java.lang.Object) fPHeapMin24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0836");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray6);
        java.lang.Class<?> wildcardClass16 = itemArray6.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0837");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        fPHeapMin9.refaz(1, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin19.imprime();
        fPHeapMin19.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        fPHeapMin19.copia(itemArray24);
        fPHeapMin1.copia(itemArray24);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass31 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0838");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item item13 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin15.imprime();
        fPHeapMin15.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin15.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item[] itemArray29 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray29);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray29);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray29);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(100);
        fPHeapMin36.refaz(1, 0);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMin36.copia(itemArray40);
        fPHeapMin34.copia(itemArray40);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray40);
        fPHeapMin32.copia(itemArray40);
        ds.Item[] itemArray45 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray45);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray45);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray45);
        fPHeapMin32.copia(itemArray45);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray45);
        fPHeapMin50.imprime();
        ds.Item[] itemArray52 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray52);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray52);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray52);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray52);
        fPHeapMin50.copia(itemArray52);
        fPHeapMin1.copia(itemArray52);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray52);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0839");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        fPHeapMin1.copia(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin6.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin6.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0840");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) (short) 1, (int) (short) 0);
        fPHeapMin1.constroi();
        ds.Item item10 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0841");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item4 = fPHeapMin1.min();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        fPHeapMin1.constroi();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0842");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin18.imprime();
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (byte) 10);
        ds.Item item23 = fPHeapMin22.min();
        ds.Item item24 = fPHeapMin22.min();
        fPHeapMin22.refaz(1, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin29.imprime();
        fPHeapMin29.constroi();
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin33.imprime();
        fPHeapMin33.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray38 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray38);
        fPHeapMin33.copia(itemArray38);
        fPHeapMin29.copia(itemArray38);
        ds.Item item43 = fPHeapMin29.min();
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item46 = fPHeapMin45.min();
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
        fPHeapMin48.refaz((int) (short) 1, 0);
        ds.Item item52 = fPHeapMin48.min();
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(100);
        fPHeapMin56.refaz(1, 0);
        ds.Item[] itemArray60 = new ds.Item[] {};
        fPHeapMin56.copia(itemArray60);
        fPHeapMin54.copia(itemArray60);
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(itemArray60);
        fPHeapMin48.copia(itemArray60);
        fPHeapMin45.copia(itemArray60);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray60);
        fPHeapMin29.copia(itemArray60);
        fPHeapMin22.copia(itemArray60);
        fPHeapMin18.copia(itemArray60);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item70 = fPHeapMin18.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNotNull(itemArray60);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0843");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin9.imprime();
        fPHeapMin9.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        fPHeapMin9.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray12);
        fPHeapMin7.copia(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray12);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0844");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        java.lang.Class<?> wildcardClass7 = itemArray5.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0845");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin4.constroi();
        fPHeapMin4.imprime();
        ds.Item item7 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        fPHeapMin9.refaz(1, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin16.imprime();
        fPHeapMin16.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        fPHeapMin16.copia(itemArray21);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray21);
        fPHeapMin9.copia(itemArray21);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
        fPHeapMin30.refaz(1, 0);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMin30.copia(itemArray34);
        fPHeapMin28.copia(itemArray34);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray34);
        fPHeapMin9.copia(itemArray34);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
        fPHeapMin42.refaz((int) (short) 1, 0);
        ds.Item item46 = fPHeapMin42.min();
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
        fPHeapMin50.refaz(1, 0);
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMin50.copia(itemArray54);
        fPHeapMin48.copia(itemArray54);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray54);
        fPHeapMin42.copia(itemArray54);
        fPHeapMin40.copia(itemArray54);
        fPHeapMin9.copia(itemArray54);
        fPHeapMin4.copia(itemArray54);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 100, (java.lang.Object) itemArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0846");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        ds.Item item7 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0847");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        fPHeapMin1.constroi();
        fPHeapMin1.refaz((int) '4', (int) (byte) -1);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin10.imprime();
        fPHeapMin10.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin10.copia(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray15);
        fPHeapMin22.imprime();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
        fPHeapMin29.refaz(1, 0);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray33);
        fPHeapMin27.copia(itemArray33);
        fPHeapMin25.copia(itemArray33);
        fPHeapMin22.copia(itemArray33);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray33);
        fPHeapMin1.copia(itemArray33);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item40 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0848");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.Item item10 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0849");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) ' ', (int) (short) 0);
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item8 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz(1, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin23.imprime();
        fPHeapMin23.constroi();
        fPHeapMin23.constroi();
        fPHeapMin23.imprime();
        fPHeapMin23.imprime();
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item31 = fPHeapMin30.min();
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
        fPHeapMin33.refaz((int) (short) 1, 0);
        ds.Item item37 = fPHeapMin33.min();
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
        fPHeapMin41.refaz(1, 0);
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMin41.copia(itemArray45);
        fPHeapMin39.copia(itemArray45);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray45);
        fPHeapMin33.copia(itemArray45);
        fPHeapMin30.copia(itemArray45);
        fPHeapMin23.copia(itemArray45);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray45);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray45);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray45);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin56.imprime();
        fPHeapMin56.constroi();
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin60.imprime();
        fPHeapMin60.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray65 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray65);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray65);
        fPHeapMin60.copia(itemArray65);
        fPHeapMin56.copia(itemArray65);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(100);
        fPHeapMin71.refaz((int) (short) 1, 0);
        ds.Item item75 = fPHeapMin71.min();
        ds.FPHeapMin fPHeapMin77 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin79 = new ds.FPHeapMin(100);
        fPHeapMin79.refaz(1, 0);
        ds.Item[] itemArray83 = new ds.Item[] {};
        fPHeapMin79.copia(itemArray83);
        fPHeapMin77.copia(itemArray83);
        ds.FPHeapMin fPHeapMin86 = new ds.FPHeapMin(itemArray83);
        fPHeapMin71.copia(itemArray83);
        fPHeapMin56.copia(itemArray83);
        fPHeapMin54.copia(itemArray83);
        fPHeapMin1.copia(itemArray83);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item91 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNull(item75);
        org.junit.Assert.assertNotNull(itemArray83);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0850");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin18.imprime();
        fPHeapMin18.imprime();
        fPHeapMin18.imprime();
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin18.insere(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0851");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0852");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        fPHeapMin2.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray19);
        fPHeapMin18.copia(itemArray19);
        fPHeapMin16.copia(itemArray19);
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        fPHeapMin16.copia(itemArray25);
        ds.Item[] itemArray28 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray28);
        fPHeapMin16.copia(itemArray28);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray36);
        fPHeapMin16.copia(itemArray36);
        fPHeapMin2.copia(itemArray36);
        fPHeapMin2.constroi();
        fPHeapMin2.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin2.refaz((int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0853");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin1.copia(itemArray16);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
        fPHeapMin22.refaz((int) (short) 1, 0);
        ds.Item item26 = fPHeapMin22.min();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
        fPHeapMin30.refaz(1, 0);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMin30.copia(itemArray34);
        fPHeapMin28.copia(itemArray34);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray34);
        fPHeapMin22.copia(itemArray34);
        fPHeapMin20.copia(itemArray34);
        fPHeapMin1.copia(itemArray34);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin((int) (short) 100);
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMin43.copia(itemArray44);
        fPHeapMin43.imprime();
        fPHeapMin43.imprime();
        fPHeapMin43.refaz((int) (short) 1, (int) (byte) 0);
        fPHeapMin43.refaz((int) (short) 100, (int) (byte) 0);
        fPHeapMin43.refaz((int) (short) 100, 10);
        fPHeapMin43.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 0, (java.lang.Object) fPHeapMin43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0854");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) (byte) 10, 10);
        ds.Item item9 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = item9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0855");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) (byte) 10, 1);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item8 = fPHeapMin7.min();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin7.copia(itemArray10);
        fPHeapMin7.refaz((int) (short) 100, 0);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin16.imprime();
        fPHeapMin16.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        fPHeapMin16.copia(itemArray21);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray30 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray30);
        fPHeapMin29.copia(itemArray30);
        fPHeapMin27.copia(itemArray30);
        ds.Item[] itemArray36 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray36);
        fPHeapMin27.copia(itemArray36);
        ds.Item[] itemArray39 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray39);
        fPHeapMin27.copia(itemArray39);
        fPHeapMin7.copia(itemArray39);
        fPHeapMin1.copia(itemArray39);
        java.lang.Class<?> wildcardClass48 = itemArray39.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0856");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        fPHeapMin1.copia(itemArray4);
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass10 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0857");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin8.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
        fPHeapMin22.refaz(1, 0);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin22.copia(itemArray26);
        fPHeapMin20.copia(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray26);
        fPHeapMin1.copia(itemArray26);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
        fPHeapMin34.refaz((int) (short) 1, 0);
        ds.Item item38 = fPHeapMin34.min();
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
        fPHeapMin42.refaz(1, 0);
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMin42.copia(itemArray46);
        fPHeapMin40.copia(itemArray46);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray46);
        fPHeapMin34.copia(itemArray46);
        fPHeapMin32.copia(itemArray46);
        fPHeapMin1.copia(itemArray46);
        ds.Item item53 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(100);
        fPHeapMin58.refaz(1, 0);
        ds.Item[] itemArray62 = new ds.Item[] {};
        fPHeapMin58.copia(itemArray62);
        fPHeapMin56.copia(itemArray62);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray62);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray62);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray62);
        fPHeapMin1.copia(itemArray62);
        java.lang.Class<?> wildcardClass69 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0858");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
        fPHeapMin13.refaz(1, 0);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMin13.copia(itemArray17);
        fPHeapMin11.copia(itemArray17);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray17);
        fPHeapMin9.copia(itemArray17);
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray22);
        fPHeapMin9.copia(itemArray22);
        fPHeapMin1.copia(itemArray22);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray22);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item29 = fPHeapMin28.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0859");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 100);
        fPHeapMin7.imprime();
        fPHeapMin7.refaz(100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((-1), (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0860");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray6);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin15.refaz((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0861");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) (short) 1, (int) (short) 0);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz(1, 0);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        fPHeapMin16.refaz(1, 0);
        fPHeapMin16.constroi();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin22.imprime();
        fPHeapMin22.constroi();
        fPHeapMin22.constroi();
        fPHeapMin22.imprime();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin28.imprime();
        fPHeapMin28.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray33 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray33);
        fPHeapMin28.copia(itemArray33);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray33);
        fPHeapMin22.copia(itemArray33);
        fPHeapMin16.copia(itemArray33);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray33);
        fPHeapMin11.copia(itemArray33);
        fPHeapMin1.copia(itemArray33);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray33);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item44 = fPHeapMin43.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0862");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin14.copia(itemArray15);
        fPHeapMin12.copia(itemArray15);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        fPHeapMin12.copia(itemArray21);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray24);
        fPHeapMin12.copia(itemArray24);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        fPHeapMin12.copia(itemArray32);
        fPHeapMin12.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item36 = fPHeapMin12.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0863");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item4 = fPHeapMin1.min();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item16 = fPHeapMin15.min();
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin15.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
        fPHeapMin20.imprime();
        fPHeapMin20.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '4', (java.lang.Object) fPHeapMin20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0864");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        fPHeapMin9.refaz(1, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin19.imprime();
        fPHeapMin19.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        fPHeapMin19.copia(itemArray24);
        fPHeapMin1.copia(itemArray24);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
        fPHeapMin32.refaz(1, 0);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMin32.copia(itemArray36);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray36);
        ds.Item[] itemArray39 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray39);
        fPHeapMin38.copia(itemArray39);
        fPHeapMin30.copia(itemArray39);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0865");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz(1, 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 100, obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0866");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) (byte) 10, 10);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin10.imprime();
        fPHeapMin10.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin10.copia(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray15);
        fPHeapMin20.constroi();
        fPHeapMin20.constroi();
        ds.Item[] itemArray23 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
        fPHeapMin30.refaz(1, 0);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMin30.copia(itemArray34);
        fPHeapMin28.copia(itemArray34);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray34);
        fPHeapMin26.copia(itemArray34);
        ds.Item[] itemArray39 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray39);
        fPHeapMin26.copia(itemArray39);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray39);
        fPHeapMin20.copia(itemArray39);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(100);
        fPHeapMin47.refaz(1, 0);
        fPHeapMin47.constroi();
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin53.imprime();
        fPHeapMin53.constroi();
        fPHeapMin53.constroi();
        fPHeapMin53.imprime();
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin59.imprime();
        fPHeapMin59.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray64 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray64);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray64);
        fPHeapMin59.copia(itemArray64);
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(itemArray64);
        fPHeapMin53.copia(itemArray64);
        fPHeapMin47.copia(itemArray64);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(itemArray64);
        fPHeapMin20.copia(itemArray64);
        fPHeapMin1.copia(itemArray64);
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin(itemArray64);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item75 = fPHeapMin74.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray64);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0867");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.constroi();
        fPHeapMin5.constroi();
        fPHeapMin5.imprime();
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item13 = fPHeapMin12.min();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
        fPHeapMin15.refaz((int) (short) 1, 0);
        ds.Item item19 = fPHeapMin15.min();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        fPHeapMin23.refaz(1, 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        fPHeapMin15.copia(itemArray27);
        fPHeapMin12.copia(itemArray27);
        fPHeapMin5.copia(itemArray27);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray27);
        fPHeapMin1.copia(itemArray27);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0868");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 100);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin10.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin13.imprime();
        fPHeapMin13.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin13.copia(itemArray18);
        fPHeapMin10.copia(itemArray18);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin24.constroi();
        ds.Item item26 = fPHeapMin24.min();
        fPHeapMin24.constroi();
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin29.imprime();
        fPHeapMin29.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray34 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray34);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray34);
        fPHeapMin29.copia(itemArray34);
        fPHeapMin24.copia(itemArray34);
        fPHeapMin10.copia(itemArray34);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray34);
        fPHeapMin5.copia(itemArray34);
        fPHeapMin1.copia(itemArray34);
        java.lang.Class<?> wildcardClass43 = itemArray34.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0869");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin1.copia(itemArray16);
        fPHeapMin1.constroi();
        ds.Item item19 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0870");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.refaz((int) 'a', (int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz(0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0871");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.Item item10 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin12.imprime();
        fPHeapMin12.constroi();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin16.imprime();
        fPHeapMin16.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        fPHeapMin16.copia(itemArray21);
        fPHeapMin12.copia(itemArray21);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin29.imprime();
        fPHeapMin29.constroi();
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin33.imprime();
        fPHeapMin33.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray38 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray38);
        fPHeapMin33.copia(itemArray38);
        fPHeapMin29.copia(itemArray38);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMin29.copia(itemArray44);
        fPHeapMin27.copia(itemArray44);
        fPHeapMin1.copia(itemArray44);
        java.lang.Class<?> wildcardClass48 = itemArray44.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0872");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item item13 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin15.imprime();
        fPHeapMin15.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin15.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray20);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin27.refaz((int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0873");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.Item item10 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin12.imprime();
        fPHeapMin12.constroi();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin16.imprime();
        fPHeapMin16.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        fPHeapMin16.copia(itemArray21);
        fPHeapMin12.copia(itemArray21);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin29.imprime();
        fPHeapMin29.constroi();
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin33.imprime();
        fPHeapMin33.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray38 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray38);
        fPHeapMin33.copia(itemArray38);
        fPHeapMin29.copia(itemArray38);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMin29.copia(itemArray44);
        fPHeapMin27.copia(itemArray44);
        fPHeapMin1.copia(itemArray44);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray44);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin50.imprime();
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin53.imprime();
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin56.imprime();
        fPHeapMin56.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray61 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray61);
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(itemArray61);
        fPHeapMin56.copia(itemArray61);
        fPHeapMin53.copia(itemArray61);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin67.constroi();
        ds.Item item69 = fPHeapMin67.min();
        fPHeapMin67.constroi();
        ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin72.imprime();
        fPHeapMin72.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray77 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin(itemArray77);
        ds.FPHeapMin fPHeapMin79 = new ds.FPHeapMin(itemArray77);
        fPHeapMin72.copia(itemArray77);
        fPHeapMin67.copia(itemArray77);
        fPHeapMin53.copia(itemArray77);
        ds.FPHeapMin fPHeapMin83 = new ds.FPHeapMin(itemArray77);
        fPHeapMin50.copia(itemArray77);
        ds.FPHeapMin fPHeapMin85 = new ds.FPHeapMin(itemArray77);
        fPHeapMin48.copia(itemArray77);
        fPHeapMin48.constroi();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNull(item69);
        org.junit.Assert.assertNotNull(itemArray77);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0874");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin3.imprime();
        fPHeapMin3.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin3.copia(itemArray8);
        fPHeapMin1.copia(itemArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0875");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin7.imprime();
        fPHeapMin7.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        fPHeapMin7.copia(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray12);
        fPHeapMin18.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item20 = fPHeapMin18.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0876");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin7.imprime();
        fPHeapMin7.constroi();
        fPHeapMin7.constroi();
        fPHeapMin7.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin13.imprime();
        fPHeapMin13.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin13.copia(itemArray18);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray18);
        fPHeapMin7.copia(itemArray18);
        fPHeapMin1.copia(itemArray18);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray18);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item26 = fPHeapMin25.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0877");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        fPHeapMin11.constroi();
        fPHeapMin11.constroi();
        fPHeapMin11.imprime();
        fPHeapMin11.constroi();
        fPHeapMin11.constroi();
        java.lang.Class<?> wildcardClass17 = fPHeapMin11.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0878");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 100);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin10.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin13.imprime();
        fPHeapMin13.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin13.copia(itemArray18);
        fPHeapMin10.copia(itemArray18);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin24.constroi();
        ds.Item item26 = fPHeapMin24.min();
        fPHeapMin24.constroi();
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin29.imprime();
        fPHeapMin29.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray34 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray34);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray34);
        fPHeapMin29.copia(itemArray34);
        fPHeapMin24.copia(itemArray34);
        fPHeapMin10.copia(itemArray34);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray34);
        fPHeapMin5.copia(itemArray34);
        fPHeapMin1.copia(itemArray34);
        ds.Item[] itemArray43 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.copia(itemArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0879");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz((int) (short) 1, 0);
        ds.Item item7 = fPHeapMin3.min();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz(1, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray15);
        fPHeapMin9.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin3.copia(itemArray15);
        fPHeapMin1.copia(itemArray15);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin23.imprime();
        fPHeapMin23.constroi();
        fPHeapMin23.constroi();
        ds.Item item27 = fPHeapMin23.min();
        fPHeapMin23.refaz((int) (short) 1, (int) (short) 0);
        fPHeapMin23.constroi();
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
        fPHeapMin33.refaz(1, 0);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
        fPHeapMin38.refaz(1, 0);
        fPHeapMin38.constroi();
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin44.imprime();
        fPHeapMin44.constroi();
        fPHeapMin44.constroi();
        fPHeapMin44.imprime();
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin50.imprime();
        fPHeapMin50.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray55 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray55);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray55);
        fPHeapMin50.copia(itemArray55);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray55);
        fPHeapMin44.copia(itemArray55);
        fPHeapMin38.copia(itemArray55);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray55);
        fPHeapMin33.copia(itemArray55);
        fPHeapMin23.copia(itemArray55);
        fPHeapMin1.copia(itemArray55);
        java.lang.Class<?> wildcardClass66 = itemArray55.getClass();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0880");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) (byte) 10, 1);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item8 = fPHeapMin7.min();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin7.copia(itemArray10);
        fPHeapMin7.refaz((int) (short) 100, 0);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin16.imprime();
        fPHeapMin16.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        fPHeapMin16.copia(itemArray21);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray30 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray30);
        fPHeapMin29.copia(itemArray30);
        fPHeapMin27.copia(itemArray30);
        ds.Item[] itemArray36 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray36);
        fPHeapMin27.copia(itemArray36);
        ds.Item[] itemArray39 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray39);
        fPHeapMin27.copia(itemArray39);
        fPHeapMin7.copia(itemArray39);
        fPHeapMin1.copia(itemArray39);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
        fPHeapMin50.refaz((int) (short) 1, 0);
        ds.Item item54 = fPHeapMin50.min();
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(100);
        fPHeapMin58.refaz(1, 0);
        ds.Item[] itemArray62 = new ds.Item[] {};
        fPHeapMin58.copia(itemArray62);
        fPHeapMin56.copia(itemArray62);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray62);
        fPHeapMin50.copia(itemArray62);
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin68.imprime();
        fPHeapMin68.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray73 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin(itemArray73);
        ds.FPHeapMin fPHeapMin75 = new ds.FPHeapMin(itemArray73);
        fPHeapMin68.copia(itemArray73);
        fPHeapMin50.copia(itemArray73);
        ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin(itemArray73);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 0, (java.lang.Object) itemArray73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray73);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0881");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin14.copia(itemArray15);
        fPHeapMin12.copia(itemArray15);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        fPHeapMin12.copia(itemArray21);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray24);
        fPHeapMin12.copia(itemArray24);
        fPHeapMin12.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin12.refaz((int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0882");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        fPHeapMin1.constroi();
        ds.Item[] itemArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.copia(itemArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0883");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
        fPHeapMin10.refaz(1, 0);
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray14);
        fPHeapMin8.copia(itemArray14);
        fPHeapMin6.copia(itemArray14);
        ds.Item item18 = fPHeapMin6.min();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin20.imprime();
        fPHeapMin20.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray25);
        fPHeapMin20.copia(itemArray25);
        fPHeapMin6.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray25);
        ds.Item item32 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin31.insere(item32);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0884");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.refaz((int) (short) 1, 0);
        ds.Item item8 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz(1, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (short) 100);
        fPHeapMin26.imprime();
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item30 = fPHeapMin29.min();
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
        fPHeapMin32.refaz((int) (short) 1, 0);
        ds.Item item36 = fPHeapMin32.min();
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
        fPHeapMin40.refaz(1, 0);
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMin40.copia(itemArray44);
        fPHeapMin38.copia(itemArray44);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray44);
        fPHeapMin32.copia(itemArray44);
        fPHeapMin29.copia(itemArray44);
        fPHeapMin29.refaz((int) (short) 1, 0);
        fPHeapMin29.constroi();
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(100);
        fPHeapMin55.refaz(1, 0);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(100);
        fPHeapMin64.refaz(1, 0);
        ds.Item[] itemArray68 = new ds.Item[] {};
        fPHeapMin64.copia(itemArray68);
        fPHeapMin62.copia(itemArray68);
        fPHeapMin60.copia(itemArray68);
        ds.Item item72 = fPHeapMin60.min();
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin74.imprime();
        fPHeapMin74.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray79 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin(itemArray79);
        ds.FPHeapMin fPHeapMin81 = new ds.FPHeapMin(itemArray79);
        fPHeapMin74.copia(itemArray79);
        fPHeapMin60.copia(itemArray79);
        fPHeapMin55.copia(itemArray79);
        fPHeapMin29.copia(itemArray79);
        ds.FPHeapMin fPHeapMin86 = new ds.FPHeapMin(itemArray79);
        ds.FPHeapMin fPHeapMin87 = new ds.FPHeapMin(itemArray79);
        fPHeapMin26.copia(itemArray79);
        fPHeapMin1.copia(itemArray79);
        ds.Item item90 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNull(item72);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertNull(item90);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0885");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin14.copia(itemArray15);
        fPHeapMin12.copia(itemArray15);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        fPHeapMin12.copia(itemArray21);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray24);
        fPHeapMin12.copia(itemArray24);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        fPHeapMin12.copia(itemArray32);
        fPHeapMin12.constroi();
        fPHeapMin12.imprime();
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin38.imprime();
        fPHeapMin38.constroi();
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin42.imprime();
        fPHeapMin42.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray47 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray47);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray47);
        fPHeapMin42.copia(itemArray47);
        fPHeapMin38.copia(itemArray47);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray47);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray47);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin55.imprime();
        fPHeapMin55.constroi();
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin59.imprime();
        fPHeapMin59.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray64 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray64);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray64);
        fPHeapMin59.copia(itemArray64);
        fPHeapMin55.copia(itemArray64);
        ds.Item item69 = null;
        ds.Item[] itemArray70 = new ds.Item[] { item69 };
        fPHeapMin55.copia(itemArray70);
        fPHeapMin53.copia(itemArray70);
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin(itemArray70);
        fPHeapMin12.copia(itemArray70);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item75 = fPHeapMin12.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray70);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0886");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin4.constroi();
        fPHeapMin4.imprime();
        ds.Item item7 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        fPHeapMin9.refaz(1, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin16.imprime();
        fPHeapMin16.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        fPHeapMin16.copia(itemArray21);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray21);
        fPHeapMin9.copia(itemArray21);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
        fPHeapMin30.refaz(1, 0);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMin30.copia(itemArray34);
        fPHeapMin28.copia(itemArray34);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray34);
        fPHeapMin9.copia(itemArray34);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
        fPHeapMin42.refaz((int) (short) 1, 0);
        ds.Item item46 = fPHeapMin42.min();
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
        fPHeapMin50.refaz(1, 0);
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMin50.copia(itemArray54);
        fPHeapMin48.copia(itemArray54);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray54);
        fPHeapMin42.copia(itemArray54);
        fPHeapMin40.copia(itemArray54);
        fPHeapMin9.copia(itemArray54);
        fPHeapMin4.copia(itemArray54);
        fPHeapMin1.copia(itemArray54);
        java.lang.Class<?> wildcardClass63 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0887");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0888");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0889");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item6 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0890");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0891");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
        fPHeapMin13.refaz(1, 0);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMin13.copia(itemArray17);
        fPHeapMin11.copia(itemArray17);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray17);
        fPHeapMin9.copia(itemArray17);
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray22);
        fPHeapMin9.copia(itemArray22);
        fPHeapMin1.copia(itemArray22);
        ds.Item item28 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0892");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin1.copia(itemArray16);
        ds.Item item18 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = item18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0893");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item22 = fPHeapMin21.min();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin21.copia(itemArray24);
        fPHeapMin21.refaz((int) (short) 100, 0);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin30.imprime();
        fPHeapMin30.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray35 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray35);
        fPHeapMin30.copia(itemArray35);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray35);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray35);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray35);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray44 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray44);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray44);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray44);
        fPHeapMin43.copia(itemArray44);
        fPHeapMin41.copia(itemArray44);
        ds.Item[] itemArray50 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray50);
        fPHeapMin41.copia(itemArray50);
        ds.Item[] itemArray53 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray53);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray53);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray53);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray53);
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray53);
        fPHeapMin41.copia(itemArray53);
        fPHeapMin21.copia(itemArray53);
        fPHeapMin18.copia(itemArray53);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray53);
        ds.Item item63 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin62.insere(item63);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray53);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0894");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
        fPHeapMin10.refaz(1, 0);
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray14);
        fPHeapMin8.copia(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin20.imprime();
        fPHeapMin20.constroi();
        fPHeapMin20.constroi();
        fPHeapMin20.imprime();
        fPHeapMin20.imprime();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item28 = fPHeapMin27.min();
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
        fPHeapMin30.refaz((int) (short) 1, 0);
        ds.Item item34 = fPHeapMin30.min();
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
        fPHeapMin38.refaz(1, 0);
        ds.Item[] itemArray42 = new ds.Item[] {};
        fPHeapMin38.copia(itemArray42);
        fPHeapMin36.copia(itemArray42);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray42);
        fPHeapMin30.copia(itemArray42);
        fPHeapMin27.copia(itemArray42);
        fPHeapMin20.copia(itemArray42);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray42);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray42);
        fPHeapMin18.copia(itemArray42);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 0, (java.lang.Object) itemArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0895");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz(1, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray11);
        fPHeapMin5.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin3.copia(itemArray11);
        fPHeapMin3.constroi();
        fPHeapMin3.imprime();
        java.lang.Class<?> wildcardClass18 = fPHeapMin3.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0896");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        fPHeapMin9.refaz(1, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0897");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) ' ', (int) (short) 0);
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
        fPHeapMin13.refaz(1, 0);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMin13.copia(itemArray17);
        fPHeapMin11.copia(itemArray17);
        fPHeapMin9.copia(itemArray17);
        ds.Item item21 = fPHeapMin9.min();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin23.imprime();
        fPHeapMin23.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray28 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin23.copia(itemArray28);
        fPHeapMin9.copia(itemArray28);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray28);
        fPHeapMin1.copia(itemArray28);
        ds.Item item35 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0898");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.refaz(1, (int) (byte) -1);
        fPHeapMin1.constroi();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0899");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item4 = fPHeapMin1.min();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0900");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz(1, 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.refaz(1, 0);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin18.copia(itemArray22);
        fPHeapMin16.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray22);
        fPHeapMin14.copia(itemArray22);
        ds.Item[] itemArray27 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        fPHeapMin14.copia(itemArray27);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray27);
        fPHeapMin1.copia(itemArray27);
        java.lang.Class<?> wildcardClass35 = itemArray27.getClass();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0901");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        fPHeapMin3.constroi();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin3.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0902");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
        fPHeapMin10.refaz(1, 0);
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray14);
        fPHeapMin8.copia(itemArray14);
        fPHeapMin6.copia(itemArray14);
        ds.Item item18 = fPHeapMin6.min();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin20.imprime();
        fPHeapMin20.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray25);
        fPHeapMin20.copia(itemArray25);
        fPHeapMin6.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray25);
        java.lang.Class<?> wildcardClass33 = fPHeapMin32.getClass();
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0903");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        fPHeapMin1.constroi();
        fPHeapMin1.refaz((int) '4', (int) (byte) -1);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin10.imprime();
        fPHeapMin10.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin10.copia(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray15);
        fPHeapMin22.imprime();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
        fPHeapMin29.refaz(1, 0);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray33);
        fPHeapMin27.copia(itemArray33);
        fPHeapMin25.copia(itemArray33);
        fPHeapMin22.copia(itemArray33);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray33);
        fPHeapMin1.copia(itemArray33);
        fPHeapMin1.constroi();
        fPHeapMin1.refaz(0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0904");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin7.imprime();
        fPHeapMin7.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        fPHeapMin7.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin18.constroi();
        ds.Item item20 = fPHeapMin18.min();
        fPHeapMin18.constroi();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin23.imprime();
        fPHeapMin23.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray28 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin23.copia(itemArray28);
        fPHeapMin18.copia(itemArray28);
        fPHeapMin4.copia(itemArray28);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray28);
        fPHeapMin1.copia(itemArray28);
        fPHeapMin1.refaz((int) (byte) 10, (int) (short) 0);
        ds.Item item39 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0905");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        fPHeapMin16.refaz((int) (short) 1, 0);
        ds.Item item20 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
        fPHeapMin24.refaz(1, 0);
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMin24.copia(itemArray28);
        fPHeapMin22.copia(itemArray28);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray28);
        fPHeapMin16.copia(itemArray28);
        fPHeapMin1.copia(itemArray28);
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0906");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item item13 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin15.imprime();
        fPHeapMin15.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin15.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item27 = fPHeapMin1.min();
        ds.Item item28 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item28);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0907");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin3.imprime();
        fPHeapMin3.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin3.copia(itemArray8);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray8);
        fPHeapMin13.constroi();
        fPHeapMin13.constroi();
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        fPHeapMin23.refaz(1, 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        fPHeapMin19.copia(itemArray27);
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray32);
        fPHeapMin19.copia(itemArray32);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray32);
        fPHeapMin13.copia(itemArray32);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
        fPHeapMin40.refaz(1, 0);
        fPHeapMin40.constroi();
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin46.imprime();
        fPHeapMin46.constroi();
        fPHeapMin46.constroi();
        fPHeapMin46.imprime();
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin52.imprime();
        fPHeapMin52.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray57 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray57);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray57);
        fPHeapMin52.copia(itemArray57);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(itemArray57);
        fPHeapMin46.copia(itemArray57);
        fPHeapMin40.copia(itemArray57);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray57);
        fPHeapMin13.copia(itemArray57);
        fPHeapMin1.copia(itemArray57);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray57);
        fPHeapMin67.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item69 = fPHeapMin67.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray57);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0908");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.Item item10 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin12.imprime();
        fPHeapMin12.constroi();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin16.imprime();
        fPHeapMin16.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        fPHeapMin16.copia(itemArray21);
        fPHeapMin12.copia(itemArray21);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin29.imprime();
        fPHeapMin29.constroi();
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin33.imprime();
        fPHeapMin33.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray38 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray38);
        fPHeapMin33.copia(itemArray38);
        fPHeapMin29.copia(itemArray38);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMin29.copia(itemArray44);
        fPHeapMin27.copia(itemArray44);
        fPHeapMin1.copia(itemArray44);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray44);
        ds.Item item49 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin48.insere(item49);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0909");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item6 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0910");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin8.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
        fPHeapMin22.refaz(1, 0);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin22.copia(itemArray26);
        fPHeapMin20.copia(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray26);
        fPHeapMin1.copia(itemArray26);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item33 = fPHeapMin32.min();
        fPHeapMin32.constroi();
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin36.imprime();
        fPHeapMin36.constroi();
        fPHeapMin36.constroi();
        fPHeapMin36.imprime();
        fPHeapMin36.imprime();
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item44 = fPHeapMin43.min();
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(100);
        fPHeapMin46.refaz((int) (short) 1, 0);
        ds.Item item50 = fPHeapMin46.min();
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(100);
        fPHeapMin54.refaz(1, 0);
        ds.Item[] itemArray58 = new ds.Item[] {};
        fPHeapMin54.copia(itemArray58);
        fPHeapMin52.copia(itemArray58);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(itemArray58);
        fPHeapMin46.copia(itemArray58);
        fPHeapMin43.copia(itemArray58);
        fPHeapMin36.copia(itemArray58);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray58);
        fPHeapMin32.copia(itemArray58);
        fPHeapMin1.copia(itemArray58);
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(itemArray58);
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin70.imprime();
        fPHeapMin70.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray75 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin76 = new ds.FPHeapMin(itemArray75);
        ds.FPHeapMin fPHeapMin77 = new ds.FPHeapMin(itemArray75);
        fPHeapMin70.copia(itemArray75);
        fPHeapMin68.copia(itemArray75);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item80 = fPHeapMin68.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray75);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0911");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        fPHeapMin8.refaz(1, 0);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray12);
        fPHeapMin6.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        fPHeapMin4.constroi();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item19 = fPHeapMin18.min();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        fPHeapMin21.refaz((int) (short) 1, 0);
        ds.Item item25 = fPHeapMin21.min();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
        fPHeapMin29.refaz(1, 0);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray33);
        fPHeapMin27.copia(itemArray33);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray33);
        fPHeapMin21.copia(itemArray33);
        fPHeapMin18.copia(itemArray33);
        fPHeapMin18.refaz((int) (short) 1, 0);
        fPHeapMin18.constroi();
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(100);
        fPHeapMin44.refaz(1, 0);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(100);
        fPHeapMin53.refaz(1, 0);
        ds.Item[] itemArray57 = new ds.Item[] {};
        fPHeapMin53.copia(itemArray57);
        fPHeapMin51.copia(itemArray57);
        fPHeapMin49.copia(itemArray57);
        ds.Item item61 = fPHeapMin49.min();
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin63.imprime();
        fPHeapMin63.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray68 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin(itemArray68);
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(itemArray68);
        fPHeapMin63.copia(itemArray68);
        fPHeapMin49.copia(itemArray68);
        fPHeapMin44.copia(itemArray68);
        fPHeapMin18.copia(itemArray68);
        ds.FPHeapMin fPHeapMin75 = new ds.FPHeapMin(itemArray68);
        fPHeapMin4.copia(itemArray68);
        fPHeapMin1.copia(itemArray68);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNull(item61);
        org.junit.Assert.assertNotNull(itemArray68);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0912");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item9 = fPHeapMin8.min();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz((int) (short) 1, 0);
        ds.Item item15 = fPHeapMin11.min();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        fPHeapMin19.refaz(1, 0);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray23);
        fPHeapMin17.copia(itemArray23);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray23);
        fPHeapMin11.copia(itemArray23);
        fPHeapMin8.copia(itemArray23);
        fPHeapMin1.copia(itemArray23);
        fPHeapMin1.refaz((int) (short) 1, 0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray37 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray37);
        fPHeapMin36.copia(itemArray37);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray37);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item45 = fPHeapMin44.min();
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMin44.copia(itemArray47);
        fPHeapMin42.copia(itemArray47);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray47);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(10, (java.lang.Object) fPHeapMin50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0913");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin4.imprime();
        fPHeapMin4.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin4.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin15.constroi();
        ds.Item item17 = fPHeapMin15.min();
        fPHeapMin15.constroi();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin20.imprime();
        fPHeapMin20.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray25);
        fPHeapMin20.copia(itemArray25);
        fPHeapMin15.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item31 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0914");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = fPHeapMin1.min();
        ds.Item item4 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0915");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (short) 1, (int) (byte) 0);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0916");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.constroi();
        fPHeapMin8.constroi();
        fPHeapMin8.imprime();
        fPHeapMin8.imprime();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item16 = fPHeapMin15.min();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.refaz((int) (short) 1, 0);
        ds.Item item22 = fPHeapMin18.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
        fPHeapMin26.refaz(1, 0);
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray30);
        fPHeapMin24.copia(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray30);
        fPHeapMin18.copia(itemArray30);
        fPHeapMin15.copia(itemArray30);
        fPHeapMin8.copia(itemArray30);
        fPHeapMin8.refaz((int) (short) 1, 0);
        fPHeapMin8.imprime();
        ds.Item item41 = fPHeapMin8.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 1, (java.lang.Object) item41);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item41);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0917");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 1, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0918");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0919");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item9 = fPHeapMin8.min();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz((int) (short) 1, 0);
        ds.Item item15 = fPHeapMin11.min();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        fPHeapMin19.refaz(1, 0);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray23);
        fPHeapMin17.copia(itemArray23);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray23);
        fPHeapMin11.copia(itemArray23);
        fPHeapMin8.copia(itemArray23);
        fPHeapMin1.copia(itemArray23);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray23);
        fPHeapMin32.constroi();
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin35.imprime();
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin38.constroi();
        fPHeapMin38.imprime();
        ds.Item item41 = fPHeapMin38.min();
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(100);
        fPHeapMin43.refaz(1, 0);
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMin43.copia(itemArray47);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin50.imprime();
        fPHeapMin50.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray55 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray55);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray55);
        fPHeapMin50.copia(itemArray55);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray55);
        fPHeapMin43.copia(itemArray55);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(100);
        fPHeapMin64.refaz(1, 0);
        ds.Item[] itemArray68 = new ds.Item[] {};
        fPHeapMin64.copia(itemArray68);
        fPHeapMin62.copia(itemArray68);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(itemArray68);
        fPHeapMin43.copia(itemArray68);
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin76 = new ds.FPHeapMin(100);
        fPHeapMin76.refaz((int) (short) 1, 0);
        ds.Item item80 = fPHeapMin76.min();
        ds.FPHeapMin fPHeapMin82 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin84 = new ds.FPHeapMin(100);
        fPHeapMin84.refaz(1, 0);
        ds.Item[] itemArray88 = new ds.Item[] {};
        fPHeapMin84.copia(itemArray88);
        fPHeapMin82.copia(itemArray88);
        ds.FPHeapMin fPHeapMin91 = new ds.FPHeapMin(itemArray88);
        fPHeapMin76.copia(itemArray88);
        fPHeapMin74.copia(itemArray88);
        fPHeapMin43.copia(itemArray88);
        fPHeapMin38.copia(itemArray88);
        fPHeapMin35.copia(itemArray88);
        fPHeapMin32.copia(itemArray88);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNull(item80);
        org.junit.Assert.assertNotNull(itemArray88);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0920");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0921");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item4 = fPHeapMin1.min();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray5);
        fPHeapMin1.copia(itemArray5);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        fPHeapMin16.refaz(1, 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin23.imprime();
        fPHeapMin23.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray28 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin23.copia(itemArray28);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray28);
        fPHeapMin16.copia(itemArray28);
        fPHeapMin1.copia(itemArray28);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
        fPHeapMin38.refaz((int) (short) 1, 0);
        ds.Item item42 = fPHeapMin38.min();
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(100);
        fPHeapMin46.refaz(1, 0);
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMin46.copia(itemArray50);
        fPHeapMin44.copia(itemArray50);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray50);
        fPHeapMin38.copia(itemArray50);
        fPHeapMin36.copia(itemArray50);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin57.constroi();
        ds.Item item59 = fPHeapMin57.min();
        fPHeapMin57.constroi();
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin62.imprime();
        fPHeapMin62.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray67 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(itemArray67);
        ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin(itemArray67);
        fPHeapMin62.copia(itemArray67);
        fPHeapMin57.copia(itemArray67);
        ds.Item[] itemArray72 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin(itemArray72);
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin(itemArray72);
        ds.FPHeapMin fPHeapMin75 = new ds.FPHeapMin(itemArray72);
        ds.FPHeapMin fPHeapMin76 = new ds.FPHeapMin(itemArray72);
        ds.FPHeapMin fPHeapMin77 = new ds.FPHeapMin(itemArray72);
        fPHeapMin57.copia(itemArray72);
        fPHeapMin36.copia(itemArray72);
        fPHeapMin1.copia(itemArray72);
        ds.Item item81 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item83 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item42);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNull(item81);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0922");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0923");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0924");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) (byte) 10, 1);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz((int) (short) 1, 0);
        ds.Item item11 = fPHeapMin7.min();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
        fPHeapMin15.refaz(1, 0);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMin15.copia(itemArray19);
        fPHeapMin13.copia(itemArray19);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray19);
        fPHeapMin7.copia(itemArray19);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin25.imprime();
        fPHeapMin25.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray30 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        fPHeapMin25.copia(itemArray30);
        fPHeapMin7.copia(itemArray30);
        fPHeapMin1.copia(itemArray30);
        java.lang.Class<?> wildcardClass36 = itemArray30.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0925");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        fPHeapMin1.copia(itemArray4);
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item9 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0926");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0927");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item item5 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = item5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0928");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin14.copia(itemArray15);
        fPHeapMin12.copia(itemArray15);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin22.imprime();
        fPHeapMin22.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray27);
        fPHeapMin22.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray27);
        fPHeapMin31.imprime();
        ds.Item[] itemArray33 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
        fPHeapMin40.refaz(1, 0);
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMin40.copia(itemArray44);
        fPHeapMin38.copia(itemArray44);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray44);
        fPHeapMin36.copia(itemArray44);
        fPHeapMin31.copia(itemArray44);
        fPHeapMin12.copia(itemArray44);
        java.lang.Class<?> wildcardClass51 = itemArray44.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0929");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz((int) (short) 1, 0);
        ds.Item item7 = fPHeapMin3.min();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz(1, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray15);
        fPHeapMin9.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin3.copia(itemArray15);
        fPHeapMin1.copia(itemArray15);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin23.imprime();
        fPHeapMin23.constroi();
        fPHeapMin23.constroi();
        ds.Item item27 = fPHeapMin23.min();
        fPHeapMin23.refaz((int) (short) 1, (int) (short) 0);
        fPHeapMin23.constroi();
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
        fPHeapMin33.refaz(1, 0);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
        fPHeapMin38.refaz(1, 0);
        fPHeapMin38.constroi();
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin44.imprime();
        fPHeapMin44.constroi();
        fPHeapMin44.constroi();
        fPHeapMin44.imprime();
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin50.imprime();
        fPHeapMin50.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray55 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray55);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray55);
        fPHeapMin50.copia(itemArray55);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray55);
        fPHeapMin44.copia(itemArray55);
        fPHeapMin38.copia(itemArray55);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray55);
        fPHeapMin33.copia(itemArray55);
        fPHeapMin23.copia(itemArray55);
        fPHeapMin1.copia(itemArray55);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(100);
        fPHeapMin67.refaz(1, 0);
        ds.Item[] itemArray71 = new ds.Item[] {};
        fPHeapMin67.copia(itemArray71);
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin74.imprime();
        fPHeapMin74.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray79 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin(itemArray79);
        ds.FPHeapMin fPHeapMin81 = new ds.FPHeapMin(itemArray79);
        fPHeapMin74.copia(itemArray79);
        ds.FPHeapMin fPHeapMin83 = new ds.FPHeapMin(itemArray79);
        fPHeapMin67.copia(itemArray79);
        ds.FPHeapMin fPHeapMin86 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin88 = new ds.FPHeapMin(100);
        fPHeapMin88.refaz(1, 0);
        ds.Item[] itemArray92 = new ds.Item[] {};
        fPHeapMin88.copia(itemArray92);
        fPHeapMin86.copia(itemArray92);
        ds.FPHeapMin fPHeapMin95 = new ds.FPHeapMin(itemArray92);
        fPHeapMin67.copia(itemArray92);
        fPHeapMin1.copia(itemArray92);
        ds.FPHeapMin fPHeapMin98 = new ds.FPHeapMin(itemArray92);
        ds.FPHeapMin fPHeapMin99 = new ds.FPHeapMin(itemArray92);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertNotNull(itemArray92);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0930");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item7 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0931");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item8 = fPHeapMin7.min();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin7.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0932");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin14.copia(itemArray15);
        fPHeapMin12.copia(itemArray15);
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        fPHeapMin12.copia(itemArray21);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray24);
        fPHeapMin12.copia(itemArray24);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray24);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0933");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray0);
        fPHeapMin4.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin7.imprime();
        fPHeapMin7.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        fPHeapMin7.copia(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray12);
        fPHeapMin19.imprime();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
        fPHeapMin26.refaz(1, 0);
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray30);
        fPHeapMin24.copia(itemArray30);
        fPHeapMin22.copia(itemArray30);
        fPHeapMin19.copia(itemArray30);
        fPHeapMin4.copia(itemArray30);
        fPHeapMin4.constroi();
        fPHeapMin4.constroi();
        fPHeapMin4.constroi();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0934");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray9);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0935");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.refaz(10, (int) (short) 10);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0936");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) (short) 1, 0);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0937");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray0);
        fPHeapMin4.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMin4.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0938");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin8.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item21 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.Item item23 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0939");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin8.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
        fPHeapMin22.refaz(1, 0);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin22.copia(itemArray26);
        fPHeapMin20.copia(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray26);
        fPHeapMin1.copia(itemArray26);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0940");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin4.imprime();
        fPHeapMin4.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin4.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray9);
        fPHeapMin14.imprime();
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0941");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin6.imprime();
        fPHeapMin6.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin6.copia(itemArray11);
        fPHeapMin1.copia(itemArray11);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0942");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0943");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item9 = fPHeapMin8.min();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin8.copia(itemArray11);
        fPHeapMin8.refaz((int) (short) 100, 0);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin17.imprime();
        fPHeapMin17.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        fPHeapMin17.copia(itemArray22);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray31);
        fPHeapMin30.copia(itemArray31);
        fPHeapMin28.copia(itemArray31);
        ds.Item[] itemArray37 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray37);
        fPHeapMin28.copia(itemArray37);
        ds.Item[] itemArray40 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray40);
        fPHeapMin28.copia(itemArray40);
        fPHeapMin8.copia(itemArray40);
        fPHeapMin1.copia(itemArray40);
        ds.Item item49 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item50 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item49);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0944");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        fPHeapMin1.copia(itemArray9);
        fPHeapMin1.imprime();
        ds.Item item16 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0945");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        fPHeapMin1.constroi();
        fPHeapMin1.refaz((int) '4', (int) (byte) -1);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin10.imprime();
        fPHeapMin10.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin10.copia(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray15);
        fPHeapMin22.imprime();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
        fPHeapMin29.refaz(1, 0);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray33);
        fPHeapMin27.copia(itemArray33);
        fPHeapMin25.copia(itemArray33);
        fPHeapMin22.copia(itemArray33);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray33);
        fPHeapMin1.copia(itemArray33);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
        fPHeapMin42.refaz((int) (short) 1, 0);
        ds.Item item46 = fPHeapMin42.min();
        fPHeapMin42.constroi();
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin49.imprime();
        fPHeapMin49.constroi();
        fPHeapMin49.constroi();
        ds.Item item53 = fPHeapMin49.min();
        fPHeapMin49.refaz((int) (short) 1, (int) (short) 0);
        ds.Item[] itemArray57 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray57);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray57);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray57);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(100);
        fPHeapMin64.refaz(1, 0);
        ds.Item[] itemArray68 = new ds.Item[] {};
        fPHeapMin64.copia(itemArray68);
        fPHeapMin62.copia(itemArray68);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(itemArray68);
        fPHeapMin60.copia(itemArray68);
        fPHeapMin49.copia(itemArray68);
        fPHeapMin42.copia(itemArray68);
        fPHeapMin1.copia(itemArray68);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray68);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0946");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.refaz((int) (short) 1, 0);
        ds.Item item8 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz(1, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        fPHeapMin1.refaz((int) (short) 1, 0);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
        fPHeapMin27.refaz(1, 0);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(100);
        fPHeapMin36.refaz(1, 0);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMin36.copia(itemArray40);
        fPHeapMin34.copia(itemArray40);
        fPHeapMin32.copia(itemArray40);
        ds.Item item44 = fPHeapMin32.min();
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin46.imprime();
        fPHeapMin46.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray51 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray51);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray51);
        fPHeapMin46.copia(itemArray51);
        fPHeapMin32.copia(itemArray51);
        fPHeapMin27.copia(itemArray51);
        fPHeapMin1.copia(itemArray51);
        ds.Item item58 = fPHeapMin1.min();
        fPHeapMin1.refaz(10, 1);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNull(item58);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0947");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin6.imprime();
        fPHeapMin6.constroi();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin10.imprime();
        fPHeapMin10.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin10.copia(itemArray15);
        fPHeapMin6.copia(itemArray15);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray15);
        fPHeapMin1.copia(itemArray15);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin23.imprime();
        fPHeapMin23.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray28 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin23.copia(itemArray28);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray28);
        fPHeapMin1.copia(itemArray28);
        ds.Item item34 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item34);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0948");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        fPHeapMin10.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        fPHeapMin19.refaz(1, 0);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray23);
        fPHeapMin17.copia(itemArray23);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray23);
        fPHeapMin15.copia(itemArray23);
        fPHeapMin10.copia(itemArray23);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin30.imprime();
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin33.constroi();
        fPHeapMin33.imprime();
        ds.Item item36 = fPHeapMin33.min();
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
        fPHeapMin38.refaz(1, 0);
        ds.Item[] itemArray42 = new ds.Item[] {};
        fPHeapMin38.copia(itemArray42);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin45.imprime();
        fPHeapMin45.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray50 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray50);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray50);
        fPHeapMin45.copia(itemArray50);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray50);
        fPHeapMin38.copia(itemArray50);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(100);
        fPHeapMin59.refaz(1, 0);
        ds.Item[] itemArray63 = new ds.Item[] {};
        fPHeapMin59.copia(itemArray63);
        fPHeapMin57.copia(itemArray63);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray63);
        fPHeapMin38.copia(itemArray63);
        ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(100);
        fPHeapMin71.refaz((int) (short) 1, 0);
        ds.Item item75 = fPHeapMin71.min();
        ds.FPHeapMin fPHeapMin77 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin79 = new ds.FPHeapMin(100);
        fPHeapMin79.refaz(1, 0);
        ds.Item[] itemArray83 = new ds.Item[] {};
        fPHeapMin79.copia(itemArray83);
        fPHeapMin77.copia(itemArray83);
        ds.FPHeapMin fPHeapMin86 = new ds.FPHeapMin(itemArray83);
        fPHeapMin71.copia(itemArray83);
        fPHeapMin69.copia(itemArray83);
        fPHeapMin38.copia(itemArray83);
        fPHeapMin33.copia(itemArray83);
        fPHeapMin30.copia(itemArray83);
        fPHeapMin10.copia(itemArray83);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNull(item75);
        org.junit.Assert.assertNotNull(itemArray83);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0949");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        fPHeapMin9.refaz(1, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin19.imprime();
        fPHeapMin19.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        fPHeapMin19.copia(itemArray24);
        fPHeapMin1.copia(itemArray24);
        fPHeapMin1.imprime();
        ds.Item item30 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item30);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0950");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item4 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        fPHeapMin6.refaz(1, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin13.imprime();
        fPHeapMin13.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin13.copia(itemArray18);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray18);
        fPHeapMin6.copia(itemArray18);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
        fPHeapMin27.refaz(1, 0);
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMin27.copia(itemArray31);
        fPHeapMin25.copia(itemArray31);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray31);
        fPHeapMin6.copia(itemArray31);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
        fPHeapMin39.refaz((int) (short) 1, 0);
        ds.Item item43 = fPHeapMin39.min();
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(100);
        fPHeapMin47.refaz(1, 0);
        ds.Item[] itemArray51 = new ds.Item[] {};
        fPHeapMin47.copia(itemArray51);
        fPHeapMin45.copia(itemArray51);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray51);
        fPHeapMin39.copia(itemArray51);
        fPHeapMin37.copia(itemArray51);
        fPHeapMin6.copia(itemArray51);
        fPHeapMin1.copia(itemArray51);
        ds.Item item59 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNull(item59);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0951");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray0);
        fPHeapMin4.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin7.imprime();
        fPHeapMin7.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        fPHeapMin7.copia(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray12);
        fPHeapMin19.imprime();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
        fPHeapMin26.refaz(1, 0);
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray30);
        fPHeapMin24.copia(itemArray30);
        fPHeapMin22.copia(itemArray30);
        fPHeapMin19.copia(itemArray30);
        fPHeapMin4.copia(itemArray30);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray30);
        java.lang.Class<?> wildcardClass37 = fPHeapMin36.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0952");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.refaz((int) 'a', (int) (byte) 1);
        ds.Item item5 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item8 = fPHeapMin7.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item11 = fPHeapMin10.min();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
        fPHeapMin13.refaz((int) (short) 1, 0);
        ds.Item item17 = fPHeapMin13.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        fPHeapMin21.refaz(1, 0);
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray25);
        fPHeapMin19.copia(itemArray25);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray25);
        fPHeapMin13.copia(itemArray25);
        fPHeapMin10.copia(itemArray25);
        fPHeapMin7.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray25);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0953");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin14.copia(itemArray15);
        fPHeapMin12.copia(itemArray15);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin22.imprime();
        fPHeapMin22.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray27);
        fPHeapMin22.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray27);
        fPHeapMin31.imprime();
        ds.Item[] itemArray33 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
        fPHeapMin40.refaz(1, 0);
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMin40.copia(itemArray44);
        fPHeapMin38.copia(itemArray44);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray44);
        fPHeapMin36.copia(itemArray44);
        fPHeapMin31.copia(itemArray44);
        fPHeapMin12.copia(itemArray44);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin12.refaz((int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0954");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin7.imprime();
        fPHeapMin7.constroi();
        fPHeapMin7.constroi();
        fPHeapMin7.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin13.imprime();
        fPHeapMin13.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin13.copia(itemArray18);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray18);
        fPHeapMin7.copia(itemArray18);
        fPHeapMin1.copia(itemArray18);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray18);
        fPHeapMin25.constroi();
        fPHeapMin25.constroi();
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0955");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.refaz((int) (short) 1, 0);
        ds.Item item8 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz(1, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (short) 100);
        fPHeapMin26.imprime();
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item30 = fPHeapMin29.min();
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
        fPHeapMin32.refaz((int) (short) 1, 0);
        ds.Item item36 = fPHeapMin32.min();
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
        fPHeapMin40.refaz(1, 0);
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMin40.copia(itemArray44);
        fPHeapMin38.copia(itemArray44);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray44);
        fPHeapMin32.copia(itemArray44);
        fPHeapMin29.copia(itemArray44);
        fPHeapMin29.refaz((int) (short) 1, 0);
        fPHeapMin29.constroi();
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(100);
        fPHeapMin55.refaz(1, 0);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(100);
        fPHeapMin64.refaz(1, 0);
        ds.Item[] itemArray68 = new ds.Item[] {};
        fPHeapMin64.copia(itemArray68);
        fPHeapMin62.copia(itemArray68);
        fPHeapMin60.copia(itemArray68);
        ds.Item item72 = fPHeapMin60.min();
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin74.imprime();
        fPHeapMin74.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray79 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin(itemArray79);
        ds.FPHeapMin fPHeapMin81 = new ds.FPHeapMin(itemArray79);
        fPHeapMin74.copia(itemArray79);
        fPHeapMin60.copia(itemArray79);
        fPHeapMin55.copia(itemArray79);
        fPHeapMin29.copia(itemArray79);
        ds.FPHeapMin fPHeapMin86 = new ds.FPHeapMin(itemArray79);
        ds.FPHeapMin fPHeapMin87 = new ds.FPHeapMin(itemArray79);
        fPHeapMin26.copia(itemArray79);
        fPHeapMin1.copia(itemArray79);
        fPHeapMin1.refaz((int) 'a', (int) (byte) -1);
        ds.Item item93 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNull(item72);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertNull(item93);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0956");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin6.imprime();
        fPHeapMin6.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin6.copia(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin24.imprime();
        fPHeapMin24.constroi();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin28.imprime();
        fPHeapMin28.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray33 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray33);
        fPHeapMin28.copia(itemArray33);
        fPHeapMin24.copia(itemArray33);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin41.imprime();
        fPHeapMin41.constroi();
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin45.imprime();
        fPHeapMin45.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray50 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray50);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray50);
        fPHeapMin45.copia(itemArray50);
        fPHeapMin41.copia(itemArray50);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMin41.copia(itemArray56);
        fPHeapMin39.copia(itemArray56);
        fPHeapMin1.copia(itemArray56);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray56);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0957");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.Item item10 = fPHeapMin1.min();
        ds.Item item11 = fPHeapMin1.min();
        ds.Item item12 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0958");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.refaz(1, (int) (byte) 0);
        ds.Item item7 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0959");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin8.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
        fPHeapMin22.refaz(1, 0);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin22.copia(itemArray26);
        fPHeapMin20.copia(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray26);
        fPHeapMin1.copia(itemArray26);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
        fPHeapMin34.refaz((int) (short) 1, 0);
        ds.Item item38 = fPHeapMin34.min();
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
        fPHeapMin42.refaz(1, 0);
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMin42.copia(itemArray46);
        fPHeapMin40.copia(itemArray46);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray46);
        fPHeapMin34.copia(itemArray46);
        fPHeapMin32.copia(itemArray46);
        fPHeapMin1.copia(itemArray46);
        ds.Item item53 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item56 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNull(item56);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0960");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin14.copia(itemArray15);
        fPHeapMin12.copia(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = fPHeapMin12.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0961");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin7.imprime();
        fPHeapMin7.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        fPHeapMin7.copia(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        fPHeapMin1.copia(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0962");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray6);
        fPHeapMin13.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = fPHeapMin13.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0963");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0964");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0965");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.refaz(0, (int) (byte) -1);
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0966");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) ' ', (int) (short) 0);
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin9.imprime();
        fPHeapMin9.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray14);
        fPHeapMin9.copia(itemArray14);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray23 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray23);
        fPHeapMin22.copia(itemArray23);
        fPHeapMin20.copia(itemArray23);
        ds.Item[] itemArray29 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray29);
        fPHeapMin20.copia(itemArray29);
        fPHeapMin1.copia(itemArray29);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0967");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0968");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        fPHeapMin6.refaz(1, 0);
        fPHeapMin6.constroi();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin12.imprime();
        fPHeapMin12.constroi();
        fPHeapMin12.constroi();
        fPHeapMin12.imprime();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin18.imprime();
        fPHeapMin18.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray23 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray23);
        fPHeapMin18.copia(itemArray23);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray23);
        fPHeapMin12.copia(itemArray23);
        fPHeapMin6.copia(itemArray23);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray23);
        fPHeapMin1.copia(itemArray23);
        ds.Item item32 = fPHeapMin1.min();
        ds.Item item33 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNull(item33);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0969");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        fPHeapMin2.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray19);
        fPHeapMin18.copia(itemArray19);
        fPHeapMin16.copia(itemArray19);
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        fPHeapMin16.copia(itemArray25);
        ds.Item[] itemArray28 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray28);
        fPHeapMin16.copia(itemArray28);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray36);
        fPHeapMin16.copia(itemArray36);
        fPHeapMin2.copia(itemArray36);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray36);
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0970");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0971");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        fPHeapMin11.constroi();
        fPHeapMin11.constroi();
        fPHeapMin11.imprime();
        fPHeapMin11.constroi();
        fPHeapMin11.constroi();
        fPHeapMin11.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        fPHeapMin19.refaz((int) (short) 1, 0);
        ds.Item item23 = fPHeapMin19.min();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
        fPHeapMin27.refaz(1, 0);
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMin27.copia(itemArray31);
        fPHeapMin25.copia(itemArray31);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray31);
        fPHeapMin19.copia(itemArray31);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin37.imprime();
        fPHeapMin37.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray42 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray42);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray42);
        fPHeapMin37.copia(itemArray42);
        fPHeapMin19.copia(itemArray42);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray42);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray42);
        fPHeapMin11.copia(itemArray42);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0972");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        fPHeapMin2.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMin2.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0973");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz((int) (short) 1, 0);
        ds.Item item7 = fPHeapMin3.min();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz(1, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray15);
        fPHeapMin9.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray15);
        fPHeapMin3.copia(itemArray15);
        fPHeapMin1.copia(itemArray15);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin23.imprime();
        fPHeapMin23.constroi();
        fPHeapMin23.constroi();
        ds.Item item27 = fPHeapMin23.min();
        fPHeapMin23.refaz((int) (short) 1, (int) (short) 0);
        fPHeapMin23.constroi();
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
        fPHeapMin33.refaz(1, 0);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
        fPHeapMin38.refaz(1, 0);
        fPHeapMin38.constroi();
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin44.imprime();
        fPHeapMin44.constroi();
        fPHeapMin44.constroi();
        fPHeapMin44.imprime();
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin50.imprime();
        fPHeapMin50.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray55 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray55);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray55);
        fPHeapMin50.copia(itemArray55);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray55);
        fPHeapMin44.copia(itemArray55);
        fPHeapMin38.copia(itemArray55);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray55);
        fPHeapMin33.copia(itemArray55);
        fPHeapMin23.copia(itemArray55);
        fPHeapMin1.copia(itemArray55);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray55);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin66.refaz(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray55);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0974");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin14.imprime();
        fPHeapMin14.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        fPHeapMin14.copia(itemArray19);
        ds.Item item23 = fPHeapMin14.min();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin25.imprime();
        fPHeapMin25.constroi();
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin29.imprime();
        fPHeapMin29.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray34 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray34);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray34);
        fPHeapMin29.copia(itemArray34);
        fPHeapMin25.copia(itemArray34);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray34);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray34);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin42.imprime();
        fPHeapMin42.constroi();
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin46.imprime();
        fPHeapMin46.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray51 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray51);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray51);
        fPHeapMin46.copia(itemArray51);
        fPHeapMin42.copia(itemArray51);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMin42.copia(itemArray57);
        fPHeapMin40.copia(itemArray57);
        fPHeapMin14.copia(itemArray57);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(itemArray57);
        fPHeapMin1.copia(itemArray57);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray57);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0975");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item8 = fPHeapMin7.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
        fPHeapMin10.refaz((int) (short) 1, 0);
        ds.Item item14 = fPHeapMin10.min();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.refaz(1, 0);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin18.copia(itemArray22);
        fPHeapMin16.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray22);
        fPHeapMin10.copia(itemArray22);
        fPHeapMin7.copia(itemArray22);
        fPHeapMin7.refaz((int) (short) 1, 0);
        fPHeapMin7.constroi();
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
        fPHeapMin33.refaz(1, 0);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
        fPHeapMin42.refaz(1, 0);
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMin42.copia(itemArray46);
        fPHeapMin40.copia(itemArray46);
        fPHeapMin38.copia(itemArray46);
        ds.Item item50 = fPHeapMin38.min();
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin52.imprime();
        fPHeapMin52.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray57 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray57);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray57);
        fPHeapMin52.copia(itemArray57);
        fPHeapMin38.copia(itemArray57);
        fPHeapMin33.copia(itemArray57);
        fPHeapMin7.copia(itemArray57);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray57);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin66.imprime();
        fPHeapMin66.constroi();
        fPHeapMin66.constroi();
        ds.Item item70 = fPHeapMin66.min();
        ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin74.imprime();
        fPHeapMin74.constroi();
        ds.Item[] itemArray77 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin(itemArray77);
        ds.FPHeapMin fPHeapMin79 = new ds.FPHeapMin(itemArray77);
        ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin(itemArray77);
        ds.FPHeapMin fPHeapMin81 = new ds.FPHeapMin(itemArray77);
        fPHeapMin74.copia(itemArray77);
        ds.FPHeapMin fPHeapMin83 = new ds.FPHeapMin(itemArray77);
        fPHeapMin72.copia(itemArray77);
        fPHeapMin66.copia(itemArray77);
        fPHeapMin64.copia(itemArray77);
        ds.FPHeapMin fPHeapMin87 = new ds.FPHeapMin(itemArray77);
        fPHeapMin1.copia(itemArray77);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNull(item70);
        org.junit.Assert.assertNotNull(itemArray77);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0976");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin4.imprime();
        fPHeapMin4.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin4.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin14.refaz((int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0977");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0978");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (short) 1, (int) (byte) 0);
        fPHeapMin1.refaz((int) (short) 100, (int) (byte) 0);
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0979");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz(1, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray11);
        fPHeapMin5.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin3.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray16);
        fPHeapMin22.imprime();
        fPHeapMin22.constroi();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0980");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0981");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin4.imprime();
        fPHeapMin4.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin4.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin15.constroi();
        ds.Item item17 = fPHeapMin15.min();
        fPHeapMin15.constroi();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin20.imprime();
        fPHeapMin20.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray25);
        fPHeapMin20.copia(itemArray25);
        fPHeapMin15.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray25);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin31.refaz(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0982");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.refaz((int) (short) 1, 0);
        ds.Item item8 = fPHeapMin4.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz(1, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        fPHeapMin1.refaz((int) (short) 1, 0);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
        fPHeapMin27.refaz(1, 0);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(100);
        fPHeapMin36.refaz(1, 0);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMin36.copia(itemArray40);
        fPHeapMin34.copia(itemArray40);
        fPHeapMin32.copia(itemArray40);
        ds.Item item44 = fPHeapMin32.min();
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin46.imprime();
        fPHeapMin46.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray51 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray51);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray51);
        fPHeapMin46.copia(itemArray51);
        fPHeapMin32.copia(itemArray51);
        fPHeapMin27.copia(itemArray51);
        fPHeapMin1.copia(itemArray51);
        java.lang.Class<?> wildcardClass58 = itemArray51.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0983");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item item6 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0984");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin8.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
        fPHeapMin22.refaz(1, 0);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin22.copia(itemArray26);
        fPHeapMin20.copia(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray26);
        fPHeapMin1.copia(itemArray26);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item33 = fPHeapMin32.min();
        fPHeapMin32.constroi();
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin36.imprime();
        fPHeapMin36.constroi();
        fPHeapMin36.constroi();
        fPHeapMin36.imprime();
        fPHeapMin36.imprime();
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item44 = fPHeapMin43.min();
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(100);
        fPHeapMin46.refaz((int) (short) 1, 0);
        ds.Item item50 = fPHeapMin46.min();
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(100);
        fPHeapMin54.refaz(1, 0);
        ds.Item[] itemArray58 = new ds.Item[] {};
        fPHeapMin54.copia(itemArray58);
        fPHeapMin52.copia(itemArray58);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(itemArray58);
        fPHeapMin46.copia(itemArray58);
        fPHeapMin43.copia(itemArray58);
        fPHeapMin36.copia(itemArray58);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray58);
        fPHeapMin32.copia(itemArray58);
        fPHeapMin1.copia(itemArray58);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin((int) (byte) 100);
        java.lang.Class<?> wildcardClass72 = fPHeapMin71.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((-1), (java.lang.Object) wildcardClass72);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0985");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.imprime();
        fPHeapMin5.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin5.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item22 = fPHeapMin21.min();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin21.copia(itemArray24);
        fPHeapMin21.refaz((int) (short) 100, 0);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin30.imprime();
        fPHeapMin30.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray35 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray35);
        fPHeapMin30.copia(itemArray35);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray35);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray35);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray35);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray44 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray44);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray44);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray44);
        fPHeapMin43.copia(itemArray44);
        fPHeapMin41.copia(itemArray44);
        ds.Item[] itemArray50 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray50);
        fPHeapMin41.copia(itemArray50);
        ds.Item[] itemArray53 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray53);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray53);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray53);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray53);
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray53);
        fPHeapMin41.copia(itemArray53);
        fPHeapMin21.copia(itemArray53);
        fPHeapMin18.copia(itemArray53);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray53);
        fPHeapMin62.constroi();
        ds.Item item64 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin62.insere(item64);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray53);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0986");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (short) 1, (int) (byte) 0);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0987");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        ds.Item item7 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin10.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin13.imprime();
        fPHeapMin13.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin13.copia(itemArray18);
        fPHeapMin10.copia(itemArray18);
        fPHeapMin1.copia(itemArray18);
        fPHeapMin1.imprime();
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0988");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        fPHeapMin1.constroi();
        fPHeapMin1.refaz((int) '4', (int) (byte) -1);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin10.imprime();
        fPHeapMin10.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin10.copia(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray15);
        fPHeapMin22.imprime();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
        fPHeapMin29.refaz(1, 0);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray33);
        fPHeapMin27.copia(itemArray33);
        fPHeapMin25.copia(itemArray33);
        fPHeapMin22.copia(itemArray33);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray33);
        fPHeapMin1.copia(itemArray33);
        ds.Item item40 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0989");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.constroi();
        fPHeapMin8.constroi();
        ds.Item item12 = fPHeapMin8.min();
        fPHeapMin8.refaz((int) (short) 1, (int) (short) 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        fPHeapMin23.refaz(1, 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        fPHeapMin19.copia(itemArray27);
        fPHeapMin8.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray27);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item35 = fPHeapMin34.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0990");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin6.imprime();
        fPHeapMin6.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin6.copia(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray16);
        fPHeapMin1.copia(itemArray16);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0991");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item[] itemArray4 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray4);
        fPHeapMin1.copia(itemArray4);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray4);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMin11.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0992");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin4.imprime();
        fPHeapMin4.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin4.copia(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray18);
        fPHeapMin17.copia(itemArray18);
        fPHeapMin15.copia(itemArray18);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        fPHeapMin15.copia(itemArray24);
        ds.Item[] itemArray27 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray27);
        fPHeapMin15.copia(itemArray27);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        fPHeapMin15.copia(itemArray35);
        fPHeapMin15.constroi();
        fPHeapMin15.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 10, (java.lang.Object) fPHeapMin15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0993");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz(1, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray11);
        fPHeapMin5.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin3.copia(itemArray11);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin3.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray16);
        fPHeapMin21.constroi();
        fPHeapMin21.imprime();
        fPHeapMin21.imprime();
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
        fPHeapMin26.refaz(1, 0);
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin33.imprime();
        fPHeapMin33.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray38 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray38);
        fPHeapMin33.copia(itemArray38);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray38);
        fPHeapMin26.copia(itemArray38);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(100);
        fPHeapMin47.refaz(1, 0);
        ds.Item[] itemArray51 = new ds.Item[] {};
        fPHeapMin47.copia(itemArray51);
        fPHeapMin45.copia(itemArray51);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray51);
        fPHeapMin26.copia(itemArray51);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(100);
        fPHeapMin57.refaz(1, 0);
        ds.Item[] itemArray61 = new ds.Item[] {};
        fPHeapMin57.copia(itemArray61);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin64.imprime();
        fPHeapMin64.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray69 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(itemArray69);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(itemArray69);
        fPHeapMin64.copia(itemArray69);
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin(itemArray69);
        fPHeapMin57.copia(itemArray69);
        ds.FPHeapMin fPHeapMin75 = new ds.FPHeapMin(itemArray69);
        fPHeapMin26.copia(itemArray69);
        fPHeapMin21.copia(itemArray69);
        ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin(itemArray69);
        ds.Item item79 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin78.insere(item79);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray69);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0994");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item6 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0995");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item[] itemArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.copia(itemArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0996");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0997");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) ' ', (int) (short) 0);
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0998");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin8.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
        fPHeapMin22.refaz(1, 0);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin22.copia(itemArray26);
        fPHeapMin20.copia(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray26);
        fPHeapMin1.copia(itemArray26);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
        fPHeapMin34.refaz((int) (short) 1, 0);
        ds.Item item38 = fPHeapMin34.min();
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
        fPHeapMin42.refaz(1, 0);
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMin42.copia(itemArray46);
        fPHeapMin40.copia(itemArray46);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray46);
        fPHeapMin34.copia(itemArray46);
        fPHeapMin32.copia(itemArray46);
        fPHeapMin1.copia(itemArray46);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray46);
        fPHeapMin53.constroi();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0999");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin8.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
        fPHeapMin22.refaz(1, 0);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin22.copia(itemArray26);
        fPHeapMin20.copia(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray26);
        fPHeapMin1.copia(itemArray26);
        ds.Item item31 = fPHeapMin1.min();
        java.lang.Class<?> wildcardClass32 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test1000");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        fPHeapMin1.constroi();
        ds.Item item14 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.refaz(1, 0);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin18.copia(itemArray22);
        fPHeapMin16.copia(itemArray22);
        fPHeapMin16.imprime();
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
        fPHeapMin33.refaz(1, 0);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMin33.copia(itemArray37);
        fPHeapMin31.copia(itemArray37);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray37);
        fPHeapMin29.copia(itemArray37);
        ds.Item[] itemArray42 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray42);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray42);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray42);
        fPHeapMin29.copia(itemArray42);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray42);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray42);
        fPHeapMin16.copia(itemArray42);
        fPHeapMin1.copia(itemArray42);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray42);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray42);
    }
}

