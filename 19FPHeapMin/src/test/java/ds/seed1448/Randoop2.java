package ds.seed1448;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1001");
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
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (short) 100);
        fPHeapMin24.imprime();
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
        fPHeapMin27.refaz((int) (short) 1, 0);
        fPHeapMin27.constroi();
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(100);
        fPHeapMin53.refaz(1, 0);
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(100);
        fPHeapMin62.refaz(1, 0);
        ds.Item[] itemArray66 = new ds.Item[] {};
        fPHeapMin62.copia(itemArray66);
        fPHeapMin60.copia(itemArray66);
        fPHeapMin58.copia(itemArray66);
        ds.Item item70 = fPHeapMin58.min();
        ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin72.imprime();
        fPHeapMin72.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray77 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin(itemArray77);
        ds.FPHeapMin fPHeapMin79 = new ds.FPHeapMin(itemArray77);
        fPHeapMin72.copia(itemArray77);
        fPHeapMin58.copia(itemArray77);
        fPHeapMin53.copia(itemArray77);
        fPHeapMin27.copia(itemArray77);
        ds.FPHeapMin fPHeapMin84 = new ds.FPHeapMin(itemArray77);
        ds.FPHeapMin fPHeapMin85 = new ds.FPHeapMin(itemArray77);
        fPHeapMin24.copia(itemArray77);
        ds.FPHeapMin fPHeapMin87 = new ds.FPHeapMin(itemArray77);
        ds.FPHeapMin fPHeapMin88 = new ds.FPHeapMin(itemArray77);
        fPHeapMin1.copia(itemArray77);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNull(item70);
        org.junit.Assert.assertNotNull(itemArray77);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1002");
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
        java.lang.Class<?> wildcardClass32 = fPHeapMin12.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1003");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item49 = fPHeapMin48.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1004");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1005");
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
        java.lang.Class<?> wildcardClass36 = fPHeapMin35.getClass();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1006");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        ds.Item item2 = fPHeapMin1.min();
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
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1007");
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
        fPHeapMin23.imprime();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1008");
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
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin15.insere(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1009");
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
        java.lang.Class<?> wildcardClass30 = itemArray24.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1010");
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
            ds.Item item33 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1011");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz((int) (short) 1, 0);
        ds.Item item9 = fPHeapMin5.min();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
        fPHeapMin13.refaz(1, 0);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMin13.copia(itemArray17);
        fPHeapMin11.copia(itemArray17);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray17);
        fPHeapMin5.copia(itemArray17);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin23.imprime();
        fPHeapMin23.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray28 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin23.copia(itemArray28);
        fPHeapMin5.copia(itemArray28);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray28);
        fPHeapMin1.copia(itemArray28);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1012");
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
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray25);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1013");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) (byte) 10, 10);
        ds.Item item9 = fPHeapMin1.min();
        fPHeapMin1.refaz(1, 0);
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1014");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        fPHeapMin5.refaz(1, 0);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item item13 = fPHeapMin1.min();
        ds.Item item14 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1015");
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
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray15);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1016");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1017");
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
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1018");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.refaz((int) (short) 1, 0);
        ds.Item item8 = fPHeapMin4.min();
        fPHeapMin4.refaz((int) (byte) 10, 10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin13.imprime();
        fPHeapMin13.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin13.copia(itemArray18);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray18);
        fPHeapMin23.constroi();
        fPHeapMin23.constroi();
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
        fPHeapMin23.copia(itemArray42);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
        fPHeapMin50.refaz(1, 0);
        fPHeapMin50.constroi();
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin56.imprime();
        fPHeapMin56.constroi();
        fPHeapMin56.constroi();
        fPHeapMin56.imprime();
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin62.imprime();
        fPHeapMin62.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray67 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(itemArray67);
        ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin(itemArray67);
        fPHeapMin62.copia(itemArray67);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(itemArray67);
        fPHeapMin56.copia(itemArray67);
        fPHeapMin50.copia(itemArray67);
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin(itemArray67);
        fPHeapMin23.copia(itemArray67);
        fPHeapMin4.copia(itemArray67);
        fPHeapMin1.copia(itemArray67);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item78 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray67);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1019");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz((int) (short) 1, 0);
        ds.Item item11 = fPHeapMin7.min();
        fPHeapMin7.constroi();
        fPHeapMin7.imprime();
        java.lang.Class<?> wildcardClass14 = fPHeapMin7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((-1), (java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1020");
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
        fPHeapMin18.imprime();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1021");
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
        fPHeapMin68.constroi();
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
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1022");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass4 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1023");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
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
        fPHeapMin1.copia(itemArray8);
        java.lang.Class<?> wildcardClass17 = itemArray8.getClass();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1024");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) ' ', (int) (short) 0);
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item8 = fPHeapMin1.min();
        fPHeapMin1.refaz((int) (short) 1, 0);
        fPHeapMin1.constroi();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1025");
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
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin29.constroi();
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin33.constroi();
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
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray50 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray50);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray50);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray50);
        fPHeapMin49.copia(itemArray50);
        fPHeapMin47.copia(itemArray50);
        ds.Item[] itemArray56 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray56);
        fPHeapMin47.copia(itemArray56);
        ds.Item[] itemArray59 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray59);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(itemArray59);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray59);
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(itemArray59);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray59);
        fPHeapMin47.copia(itemArray59);
        ds.Item item66 = null;
        ds.Item[] itemArray67 = new ds.Item[] { item66 };
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(itemArray67);
        fPHeapMin47.copia(itemArray67);
        fPHeapMin33.copia(itemArray67);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(itemArray67);
        fPHeapMin29.copia(itemArray67);
        fPHeapMin1.copia(itemArray67);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray67);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1026");
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
            fPHeapMin2.refaz((int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1027");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = fPHeapMin3.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1028");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item28 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1029");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
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
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin22.imprime();
        fPHeapMin22.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray27);
        fPHeapMin22.copia(itemArray27);
        fPHeapMin4.copia(itemArray27);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray27);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1030");
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
        fPHeapMin1.refaz(100, (int) (byte) 100);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNull(item72);
        org.junit.Assert.assertNotNull(itemArray79);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1031");
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
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNull(item53);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1032");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item25 = fPHeapMin12.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1033");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        fPHeapMin1.copia(itemArray4);
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
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1034");
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
        fPHeapMin1.constroi();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1035");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1036");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz(1, 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray7);
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin12.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1037");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1038");
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
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1039");
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
            fPHeapMin26.refaz((int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1040");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz(1, 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1041");
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
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        fPHeapMin25.refaz(1, 0);
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMin25.copia(itemArray29);
        fPHeapMin23.copia(itemArray29);
        fPHeapMin21.copia(itemArray29);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray29);
        fPHeapMin1.copia(itemArray29);
        java.lang.Class<?> wildcardClass35 = itemArray29.getClass();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1042");
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
        ds.Item item15 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1043");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1044");
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
        ds.Item item15 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1045");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin3.imprime();
        fPHeapMin3.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin3.copia(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray8);
        java.lang.Class<?> wildcardClass14 = itemArray8.getClass();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1046");
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
        fPHeapMin1.refaz((int) (short) 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1047");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item4 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = item4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1048");
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
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin((int) (byte) 10);
        ds.Item item53 = fPHeapMin52.min();
        ds.Item item54 = fPHeapMin52.min();
        fPHeapMin52.refaz(1, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin59.imprime();
        fPHeapMin59.constroi();
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin63.imprime();
        fPHeapMin63.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray68 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin(itemArray68);
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(itemArray68);
        fPHeapMin63.copia(itemArray68);
        fPHeapMin59.copia(itemArray68);
        ds.Item item73 = fPHeapMin59.min();
        ds.FPHeapMin fPHeapMin75 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item76 = fPHeapMin75.min();
        ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin(100);
        fPHeapMin78.refaz((int) (short) 1, 0);
        ds.Item item82 = fPHeapMin78.min();
        ds.FPHeapMin fPHeapMin84 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin86 = new ds.FPHeapMin(100);
        fPHeapMin86.refaz(1, 0);
        ds.Item[] itemArray90 = new ds.Item[] {};
        fPHeapMin86.copia(itemArray90);
        fPHeapMin84.copia(itemArray90);
        ds.FPHeapMin fPHeapMin93 = new ds.FPHeapMin(itemArray90);
        fPHeapMin78.copia(itemArray90);
        fPHeapMin75.copia(itemArray90);
        ds.FPHeapMin fPHeapMin96 = new ds.FPHeapMin(itemArray90);
        fPHeapMin59.copia(itemArray90);
        fPHeapMin52.copia(itemArray90);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 10, (java.lang.Object) fPHeapMin52);
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
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNull(item73);
        org.junit.Assert.assertNull(item76);
        org.junit.Assert.assertNull(item82);
        org.junit.Assert.assertNotNull(itemArray90);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1049");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (short) 1, (int) (byte) 0);
        fPHeapMin1.refaz((int) (short) 100, (int) (byte) 0);
        fPHeapMin1.refaz((int) (short) 100, 10);
        java.lang.Class<?> wildcardClass15 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1050");
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
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin44.imprime();
        fPHeapMin44.constroi();
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin48.imprime();
        fPHeapMin48.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray53 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray53);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray53);
        fPHeapMin48.copia(itemArray53);
        fPHeapMin44.copia(itemArray53);
        ds.Item item58 = fPHeapMin44.min();
        fPHeapMin44.constroi();
        fPHeapMin44.imprime();
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
        ds.FPHeapMin fPHeapMin79 = new ds.FPHeapMin(itemArray73);
        fPHeapMin44.copia(itemArray73);
        fPHeapMin1.copia(itemArray73);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNull(item58);
        org.junit.Assert.assertNotNull(itemArray73);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1051");
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
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin27.imprime();
        fPHeapMin27.constroi();
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin31.imprime();
        fPHeapMin31.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray36 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray36);
        fPHeapMin31.copia(itemArray36);
        fPHeapMin27.copia(itemArray36);
        ds.Item item41 = fPHeapMin27.min();
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
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray58);
        fPHeapMin27.copia(itemArray58);
        fPHeapMin25.copia(itemArray58);
        ds.Item item67 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin25.insere(item67);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1052");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) ' ', (int) (short) 0);
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item8 = fPHeapMin1.min();
        ds.Item item9 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin12.imprime();
        fPHeapMin12.constroi();
        java.lang.Class<?> wildcardClass15 = fPHeapMin12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 100, (java.lang.Object) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1053");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz(1, 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin15.imprime();
        fPHeapMin15.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin15.copia(itemArray20);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray20);
        fPHeapMin25.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 100, (java.lang.Object) fPHeapMin25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1054");
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
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item27);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1055");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        fPHeapMin1.copia(itemArray4);
        ds.Item item6 = fPHeapMin1.min();
        ds.Item item7 = fPHeapMin1.min();
        ds.Item item8 = fPHeapMin1.min();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1056");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz(1, 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1057");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray6);
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin11.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1058");
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
            fPHeapMin34.refaz((int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1059");
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
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item36 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1060");
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
        fPHeapMin1.refaz((int) (byte) 1, (int) (short) 0);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
        fPHeapMin32.refaz(1, 0);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMin32.copia(itemArray36);
        fPHeapMin30.copia(itemArray36);
        fPHeapMin28.copia(itemArray36);
        fPHeapMin1.copia(itemArray36);
        java.lang.Class<?> wildcardClass41 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1061");
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
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1062");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
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
        fPHeapMin9.constroi();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin24.constroi();
        ds.Item item26 = fPHeapMin24.min();
        fPHeapMin24.constroi();
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
        fPHeapMin31.refaz(1, 0);
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMin31.copia(itemArray35);
        fPHeapMin29.copia(itemArray35);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray35);
        fPHeapMin24.copia(itemArray35);
        fPHeapMin9.copia(itemArray35);
        java.lang.Class<?> wildcardClass41 = itemArray35.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) ' ', (java.lang.Object) wildcardClass41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1063");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.Item item10 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
        fPHeapMin17.refaz(1, 0);
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMin17.copia(itemArray21);
        fPHeapMin15.copia(itemArray21);
        fPHeapMin13.copia(itemArray21);
        ds.Item item25 = fPHeapMin13.min();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin27.imprime();
        fPHeapMin27.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray32);
        fPHeapMin27.copia(itemArray32);
        fPHeapMin13.copia(itemArray32);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin39.imprime();
        fPHeapMin39.constroi();
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin43.imprime();
        fPHeapMin43.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray48 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray48);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray48);
        fPHeapMin43.copia(itemArray48);
        fPHeapMin39.copia(itemArray48);
        ds.Item item53 = fPHeapMin39.min();
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item56 = fPHeapMin55.min();
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(100);
        fPHeapMin58.refaz((int) (short) 1, 0);
        ds.Item item62 = fPHeapMin58.min();
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(100);
        fPHeapMin66.refaz(1, 0);
        ds.Item[] itemArray70 = new ds.Item[] {};
        fPHeapMin66.copia(itemArray70);
        fPHeapMin64.copia(itemArray70);
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin(itemArray70);
        fPHeapMin58.copia(itemArray70);
        fPHeapMin55.copia(itemArray70);
        ds.FPHeapMin fPHeapMin76 = new ds.FPHeapMin(itemArray70);
        fPHeapMin39.copia(itemArray70);
        fPHeapMin37.copia(itemArray70);
        fPHeapMin1.copia(itemArray70);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNull(item56);
        org.junit.Assert.assertNull(item62);
        org.junit.Assert.assertNotNull(itemArray70);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1064");
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
        java.lang.Class<?> wildcardClass15 = itemArray9.getClass();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1065");
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
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray28);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item37 = fPHeapMin36.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1066");
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
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin38.imprime();
        fPHeapMin38.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray43 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray43);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray43);
        fPHeapMin38.copia(itemArray43);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray43);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray43);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray43);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray43);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin4.diminuiChave((int) (short) 10, (java.lang.Object) itemArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1067");
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
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item35 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1068");
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
        fPHeapMin1.refaz((int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNull(item58);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1069");
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
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin27.imprime();
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin30.imprime();
        fPHeapMin30.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray35 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray35);
        fPHeapMin30.copia(itemArray35);
        fPHeapMin27.copia(itemArray35);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin41.constroi();
        ds.Item item43 = fPHeapMin41.min();
        fPHeapMin41.constroi();
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin46.imprime();
        fPHeapMin46.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray51 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray51);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray51);
        fPHeapMin46.copia(itemArray51);
        fPHeapMin41.copia(itemArray51);
        fPHeapMin27.copia(itemArray51);
        fPHeapMin1.copia(itemArray51);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1070");
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
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1071");
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
        fPHeapMin1.refaz((int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1072");
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
        ds.Item item22 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item22);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1073");
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
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin16.refaz(1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1074");
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
        fPHeapMin1.refaz((int) '#', (-1));
        java.lang.Class<?> wildcardClass36 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1075");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        fPHeapMin1.copia(itemArray4);
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin13.imprime();
        fPHeapMin13.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin13.copia(itemArray18);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray18);
        fPHeapMin23.constroi();
        fPHeapMin23.constroi();
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
        fPHeapMin23.copia(itemArray42);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
        fPHeapMin50.refaz(1, 0);
        fPHeapMin50.constroi();
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin56.imprime();
        fPHeapMin56.constroi();
        fPHeapMin56.constroi();
        fPHeapMin56.imprime();
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin62.imprime();
        fPHeapMin62.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray67 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(itemArray67);
        ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin(itemArray67);
        fPHeapMin62.copia(itemArray67);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(itemArray67);
        fPHeapMin56.copia(itemArray67);
        fPHeapMin50.copia(itemArray67);
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin(itemArray67);
        fPHeapMin23.copia(itemArray67);
        fPHeapMin11.copia(itemArray67);
        fPHeapMin1.copia(itemArray67);
        ds.Item item78 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNull(item78);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1076");
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
            fPHeapMin1.refaz((-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1077");
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
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        fPHeapMin23.refaz(1, 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        fPHeapMin15.copia(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin33.imprime();
        fPHeapMin33.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray38 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray38);
        fPHeapMin33.copia(itemArray38);
        fPHeapMin15.copia(itemArray38);
        fPHeapMin1.copia(itemArray38);
        fPHeapMin1.refaz((int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1078");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        fPHeapMin1.copia(itemArray4);
        ds.Item item6 = fPHeapMin1.min();
        ds.Item item7 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item9 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1079");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.refaz(1, 0);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin11.imprime();
        fPHeapMin11.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin11.copia(itemArray16);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        fPHeapMin25.refaz(1, 0);
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMin25.copia(itemArray29);
        fPHeapMin23.copia(itemArray29);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray29);
        fPHeapMin4.copia(itemArray29);
        fPHeapMin1.copia(itemArray29);
        fPHeapMin1.refaz(0, (-1));
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1080");
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
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1081");
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
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        fPHeapMin23.refaz(1, 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        fPHeapMin15.copia(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin33.imprime();
        fPHeapMin33.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray38 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray38);
        fPHeapMin33.copia(itemArray38);
        fPHeapMin15.copia(itemArray38);
        fPHeapMin1.copia(itemArray38);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin45.imprime();
        fPHeapMin45.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray50 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray50);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray50);
        fPHeapMin45.copia(itemArray50);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray50);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray50);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray50);
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray59 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray59);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(itemArray59);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray59);
        fPHeapMin58.copia(itemArray59);
        fPHeapMin56.copia(itemArray59);
        ds.Item[] itemArray65 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray65);
        fPHeapMin56.copia(itemArray65);
        ds.Item[] itemArray68 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin(itemArray68);
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(itemArray68);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(itemArray68);
        ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(itemArray68);
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin(itemArray68);
        fPHeapMin56.copia(itemArray68);
        ds.Item item75 = null;
        ds.Item[] itemArray76 = new ds.Item[] { item75 };
        ds.FPHeapMin fPHeapMin77 = new ds.FPHeapMin(itemArray76);
        fPHeapMin56.copia(itemArray76);
        ds.FPHeapMin fPHeapMin79 = new ds.FPHeapMin(itemArray76);
        fPHeapMin1.copia(itemArray76);
        ds.Item item81 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNull(item81);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1082");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        fPHeapMin8.refaz(1, 0);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray12);
        fPHeapMin6.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.Item item16 = fPHeapMin4.min();
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
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin36.imprime();
        fPHeapMin36.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray41 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        fPHeapMin36.copia(itemArray41);
        fPHeapMin18.copia(itemArray41);
        fPHeapMin4.copia(itemArray41);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin48.imprime();
        fPHeapMin48.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray53 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray53);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray53);
        fPHeapMin48.copia(itemArray53);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray53);
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray53);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray53);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray62 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(itemArray62);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray62);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray62);
        fPHeapMin61.copia(itemArray62);
        fPHeapMin59.copia(itemArray62);
        ds.Item[] itemArray68 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin(itemArray68);
        fPHeapMin59.copia(itemArray68);
        ds.Item[] itemArray71 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(itemArray71);
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin(itemArray71);
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin(itemArray71);
        ds.FPHeapMin fPHeapMin75 = new ds.FPHeapMin(itemArray71);
        ds.FPHeapMin fPHeapMin76 = new ds.FPHeapMin(itemArray71);
        fPHeapMin59.copia(itemArray71);
        ds.Item item78 = null;
        ds.Item[] itemArray79 = new ds.Item[] { item78 };
        ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin(itemArray79);
        fPHeapMin59.copia(itemArray79);
        ds.FPHeapMin fPHeapMin82 = new ds.FPHeapMin(itemArray79);
        fPHeapMin4.copia(itemArray79);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '#', (java.lang.Object) fPHeapMin4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray79);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1083");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item5 = fPHeapMin4.min();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin4.copia(itemArray7);
        fPHeapMin4.refaz((int) (short) 100, 0);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin13.imprime();
        fPHeapMin13.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin13.copia(itemArray18);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray27 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray27);
        fPHeapMin26.copia(itemArray27);
        fPHeapMin24.copia(itemArray27);
        ds.Item[] itemArray33 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray33);
        fPHeapMin24.copia(itemArray33);
        ds.Item[] itemArray36 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray36);
        fPHeapMin24.copia(itemArray36);
        fPHeapMin4.copia(itemArray36);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(100);
        fPHeapMin45.refaz((int) (short) 1, 0);
        ds.Item item49 = fPHeapMin45.min();
        fPHeapMin45.constroi();
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin52.imprime();
        fPHeapMin52.constroi();
        fPHeapMin52.constroi();
        ds.Item item56 = fPHeapMin52.min();
        fPHeapMin52.refaz((int) (short) 1, (int) (short) 0);
        ds.Item[] itemArray60 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(itemArray60);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray60);
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(itemArray60);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(100);
        fPHeapMin67.refaz(1, 0);
        ds.Item[] itemArray71 = new ds.Item[] {};
        fPHeapMin67.copia(itemArray71);
        fPHeapMin65.copia(itemArray71);
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin(itemArray71);
        fPHeapMin63.copia(itemArray71);
        fPHeapMin52.copia(itemArray71);
        fPHeapMin45.copia(itemArray71);
        fPHeapMin4.copia(itemArray71);
        ds.FPHeapMin fPHeapMin79 = new ds.FPHeapMin(itemArray71);
        ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin(itemArray71);
        ds.FPHeapMin fPHeapMin81 = new ds.FPHeapMin(itemArray71);
        fPHeapMin1.copia(itemArray71);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNull(item49);
        org.junit.Assert.assertNull(item56);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray71);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1084");
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
        fPHeapMin3.constroi();
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin3.insere(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1085");
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
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray39);
        java.lang.Class<?> wildcardClass45 = itemArray39.getClass();
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1086");
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
            ds.Item item35 = fPHeapMin18.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1087");
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
        fPHeapMin1.refaz((int) 'a', (int) (byte) 10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1088");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item54 = fPHeapMin53.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1089");
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
        fPHeapMin1.refaz((int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item35);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1090");
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
            fPHeapMin4.refaz((int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1091");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz(1, 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray7);
        fPHeapMin11.imprime();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin14.constroi();
        ds.Item item16 = fPHeapMin14.min();
        fPHeapMin14.constroi();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin19.imprime();
        fPHeapMin19.constroi();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin23.imprime();
        fPHeapMin23.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray28 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin23.copia(itemArray28);
        fPHeapMin19.copia(itemArray28);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray28);
        fPHeapMin14.copia(itemArray28);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin36.imprime();
        fPHeapMin36.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray41 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        fPHeapMin36.copia(itemArray41);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray41);
        fPHeapMin14.copia(itemArray41);
        fPHeapMin11.copia(itemArray41);
        java.lang.Object obj49 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin11.diminuiChave(100, obj49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1092");
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
        ds.FPHeapMin fPHeapMin92 = new ds.FPHeapMin(itemArray83);
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
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1093");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.refaz((int) (short) 1, 0);
        ds.Item item8 = fPHeapMin4.min();
        fPHeapMin4.refaz((int) (byte) 10, 10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin13.imprime();
        fPHeapMin13.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin13.copia(itemArray18);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray18);
        fPHeapMin23.constroi();
        fPHeapMin23.constroi();
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
        fPHeapMin23.copia(itemArray42);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
        fPHeapMin50.refaz(1, 0);
        fPHeapMin50.constroi();
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin56.imprime();
        fPHeapMin56.constroi();
        fPHeapMin56.constroi();
        fPHeapMin56.imprime();
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin62.imprime();
        fPHeapMin62.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray67 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(itemArray67);
        ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin(itemArray67);
        fPHeapMin62.copia(itemArray67);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(itemArray67);
        fPHeapMin56.copia(itemArray67);
        fPHeapMin50.copia(itemArray67);
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin(itemArray67);
        fPHeapMin23.copia(itemArray67);
        fPHeapMin4.copia(itemArray67);
        fPHeapMin1.copia(itemArray67);
        ds.FPHeapMin fPHeapMin79 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin79.imprime();
        fPHeapMin79.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray84 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin85 = new ds.FPHeapMin(itemArray84);
        ds.FPHeapMin fPHeapMin86 = new ds.FPHeapMin(itemArray84);
        fPHeapMin79.copia(itemArray84);
        ds.FPHeapMin fPHeapMin88 = new ds.FPHeapMin(itemArray84);
        ds.FPHeapMin fPHeapMin89 = new ds.FPHeapMin(itemArray84);
        ds.FPHeapMin fPHeapMin90 = new ds.FPHeapMin(itemArray84);
        ds.FPHeapMin fPHeapMin92 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray93 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin94 = new ds.FPHeapMin(itemArray93);
        ds.FPHeapMin fPHeapMin95 = new ds.FPHeapMin(itemArray93);
        ds.FPHeapMin fPHeapMin96 = new ds.FPHeapMin(itemArray93);
        fPHeapMin92.copia(itemArray93);
        fPHeapMin90.copia(itemArray93);
        fPHeapMin1.copia(itemArray93);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray84);
        org.junit.Assert.assertNotNull(itemArray93);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1094");
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
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray54);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray68 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin(itemArray68);
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(itemArray68);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(itemArray68);
        fPHeapMin67.copia(itemArray68);
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin(itemArray68);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin64.diminuiChave((int) (byte) -1, (java.lang.Object) itemArray68);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray68);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1095");
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
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1096");
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
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray20);
        fPHeapMin19.copia(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray20);
        fPHeapMin1.copia(itemArray20);
        java.lang.Class<?> wildcardClass27 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1097");
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
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item27 = fPHeapMin26.min();
        fPHeapMin26.constroi();
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin30.imprime();
        fPHeapMin30.constroi();
        fPHeapMin30.constroi();
        fPHeapMin30.imprime();
        fPHeapMin30.imprime();
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item38 = fPHeapMin37.min();
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
        fPHeapMin40.refaz((int) (short) 1, 0);
        ds.Item item44 = fPHeapMin40.min();
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
        fPHeapMin48.refaz(1, 0);
        ds.Item[] itemArray52 = new ds.Item[] {};
        fPHeapMin48.copia(itemArray52);
        fPHeapMin46.copia(itemArray52);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray52);
        fPHeapMin40.copia(itemArray52);
        fPHeapMin37.copia(itemArray52);
        fPHeapMin30.copia(itemArray52);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray52);
        fPHeapMin26.copia(itemArray52);
        fPHeapMin26.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin23.diminuiChave((int) (short) -1, (java.lang.Object) fPHeapMin26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNotNull(itemArray52);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1098");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1099");
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
        ds.FPHeapMin fPHeapMin87 = new ds.FPHeapMin(itemArray77);
        ds.Item item88 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin87.insere(item88);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
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
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1100");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1101");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item65 = fPHeapMin64.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray55);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1102");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) ' ', (int) (short) 0);
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1103");
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
        ds.FPHeapMin fPHeapMin82 = new ds.FPHeapMin(itemArray71);
        fPHeapMin82.constroi();
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
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1104");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) ' ', (int) (short) 0);
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1105");
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
        fPHeapMin11.constroi();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1106");
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
        java.lang.Class<?> wildcardClass31 = fPHeapMin30.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1107");
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
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin57.constroi();
        ds.Item item59 = fPHeapMin57.min();
        fPHeapMin57.constroi();
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin62.imprime();
        fPHeapMin62.constroi();
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin66.imprime();
        fPHeapMin66.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray71 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(itemArray71);
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin(itemArray71);
        fPHeapMin66.copia(itemArray71);
        fPHeapMin62.copia(itemArray71);
        ds.FPHeapMin fPHeapMin76 = new ds.FPHeapMin(itemArray71);
        fPHeapMin57.copia(itemArray71);
        fPHeapMin1.copia(itemArray71);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNotNull(itemArray71);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1108");
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
        java.lang.Class<?> wildcardClass40 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1109");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) ' ', (int) (short) 0);
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item10 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1110");
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
            fPHeapMin12.refaz((int) (byte) -1, 0);
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
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1111");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz(1, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray15);
        fPHeapMin9.copia(itemArray15);
        fPHeapMin7.copia(itemArray15);
        ds.Item item19 = fPHeapMin7.min();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin21.imprime();
        fPHeapMin21.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray26);
        fPHeapMin21.copia(itemArray26);
        fPHeapMin7.copia(itemArray26);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray26);
        fPHeapMin1.copia(itemArray26);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1112");
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
        fPHeapMin81.imprime();
        ds.Item item83 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin81.insere(item83);
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
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1113");
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
        java.lang.Class<?> wildcardClass39 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1114");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass6 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1115");
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
        fPHeapMin1.constroi();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1116");
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
            ds.Item item24 = fPHeapMin22.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1117");
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
        ds.Item item83 = fPHeapMin1.min();
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
        org.junit.Assert.assertNull(item83);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1118");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        fPHeapMin1.copia(itemArray6);
        ds.Item item10 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
        fPHeapMin17.refaz(1, 0);
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMin17.copia(itemArray21);
        fPHeapMin15.copia(itemArray21);
        fPHeapMin13.copia(itemArray21);
        ds.Item item25 = fPHeapMin13.min();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin27.imprime();
        fPHeapMin27.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray32);
        fPHeapMin27.copia(itemArray32);
        fPHeapMin13.copia(itemArray32);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin39.imprime();
        fPHeapMin39.constroi();
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin43.imprime();
        fPHeapMin43.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray48 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray48);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray48);
        fPHeapMin43.copia(itemArray48);
        fPHeapMin39.copia(itemArray48);
        ds.Item item53 = fPHeapMin39.min();
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item56 = fPHeapMin55.min();
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(100);
        fPHeapMin58.refaz((int) (short) 1, 0);
        ds.Item item62 = fPHeapMin58.min();
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(100);
        fPHeapMin66.refaz(1, 0);
        ds.Item[] itemArray70 = new ds.Item[] {};
        fPHeapMin66.copia(itemArray70);
        fPHeapMin64.copia(itemArray70);
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin(itemArray70);
        fPHeapMin58.copia(itemArray70);
        fPHeapMin55.copia(itemArray70);
        ds.FPHeapMin fPHeapMin76 = new ds.FPHeapMin(itemArray70);
        fPHeapMin39.copia(itemArray70);
        fPHeapMin37.copia(itemArray70);
        fPHeapMin1.copia(itemArray70);
        java.lang.Class<?> wildcardClass80 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNull(item56);
        org.junit.Assert.assertNull(item62);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1119");
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
        ds.Item item55 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNull(item55);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1120");
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
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1121");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item item2 = fPHeapMin1.min();
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
        fPHeapMin1.copia(itemArray19);
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1122");
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
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray20);
        fPHeapMin19.copia(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray20);
        fPHeapMin1.copia(itemArray20);
        java.lang.Class<?> wildcardClass27 = itemArray20.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1123");
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
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (short) -1);
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
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray28);
        fPHeapMin21.copia(itemArray28);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray28);
        fPHeapMin1.copia(itemArray28);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1124");
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
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 100);
        fPHeapMin19.imprime();
        fPHeapMin19.refaz(100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin15.diminuiChave(0, (java.lang.Object) fPHeapMin19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1125");
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
        ds.Item item34 = fPHeapMin1.min();
        ds.Item item35 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass36 = item35.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item35);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1126");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.refaz(1, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.constroi();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin12.imprime();
        fPHeapMin12.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray17 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        fPHeapMin12.copia(itemArray17);
        fPHeapMin8.copia(itemArray17);
        ds.Item item22 = fPHeapMin8.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item25 = fPHeapMin24.min();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
        fPHeapMin27.refaz((int) (short) 1, 0);
        ds.Item item31 = fPHeapMin27.min();
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(100);
        fPHeapMin35.refaz(1, 0);
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMin35.copia(itemArray39);
        fPHeapMin33.copia(itemArray39);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray39);
        fPHeapMin27.copia(itemArray39);
        fPHeapMin24.copia(itemArray39);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray39);
        fPHeapMin8.copia(itemArray39);
        fPHeapMin1.copia(itemArray39);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1127");
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
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin18.refaz((int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1128");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.refaz(1, (int) (short) -1);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1129");
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
        fPHeapMin12.imprime();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin17.imprime();
        fPHeapMin17.refaz((int) (byte) 10, 0);
        fPHeapMin17.imprime();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin24.constroi();
        ds.Item item26 = fPHeapMin24.min();
        fPHeapMin24.constroi();
        fPHeapMin24.constroi();
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin30.imprime();
        fPHeapMin30.constroi();
        ds.Item[] itemArray33 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray33);
        fPHeapMin30.copia(itemArray33);
        fPHeapMin24.copia(itemArray33);
        fPHeapMin17.copia(itemArray33);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin12.diminuiChave((int) (byte) 0, (java.lang.Object) fPHeapMin17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1130");
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
        java.lang.Class<?> wildcardClass16 = fPHeapMin11.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1131");
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
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin38.imprime();
        fPHeapMin38.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray43 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray43);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray43);
        fPHeapMin38.copia(itemArray43);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray43);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray43);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray43);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray43);
        fPHeapMin36.copia(itemArray43);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray43);
        fPHeapMin1.copia(itemArray43);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray43);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1132");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz(100, (int) (byte) 100);
        ds.Item item6 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1133");
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
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray25);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1134");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item92 = fPHeapMin91.retiraMin();
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
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1135");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin7.copia(itemArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMin7.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1136");
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
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1137");
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
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(100);
        fPHeapMin57.refaz(1, 0);
        ds.Item[] itemArray61 = new ds.Item[] {};
        fPHeapMin57.copia(itemArray61);
        fPHeapMin55.copia(itemArray61);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray61);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray61);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray61);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray61);
        fPHeapMin1.copia(itemArray61);
        ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin(itemArray61);
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(itemArray61);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNotNull(itemArray61);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1138");
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
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin48.imprime();
        fPHeapMin48.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray53 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray53);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray53);
        fPHeapMin48.copia(itemArray53);
        fPHeapMin30.copia(itemArray53);
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray53);
        fPHeapMin28.copia(itemArray53);
        fPHeapMin28.imprime();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray53);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1139");
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
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray12);
        java.lang.Class<?> wildcardClass20 = fPHeapMin19.getClass();
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1140");
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
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray26);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray26);
        fPHeapMin33.constroi();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1141");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1142");
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
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray28);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1143");
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
        fPHeapMin1.constroi();
        ds.Item item20 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1144");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        fPHeapMin1.constroi();
        ds.Item item6 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1145");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        ds.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1146");
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
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (short) 100);
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMin28.copia(itemArray29);
        fPHeapMin28.imprime();
        fPHeapMin28.imprime();
        fPHeapMin28.refaz((int) (short) 1, (int) (byte) 0);
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
        fPHeapMin37.constroi();
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin59.imprime();
        fPHeapMin59.constroi();
        fPHeapMin59.constroi();
        fPHeapMin59.imprime();
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin65.imprime();
        fPHeapMin65.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray70 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(itemArray70);
        ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(itemArray70);
        fPHeapMin65.copia(itemArray70);
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin(itemArray70);
        fPHeapMin59.copia(itemArray70);
        fPHeapMin37.copia(itemArray70);
        fPHeapMin28.copia(itemArray70);
        fPHeapMin1.copia(itemArray70);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray70);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1147");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin7.imprime();
        fPHeapMin7.constroi();
        ds.Item[] itemArray10 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray10);
        fPHeapMin7.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray10);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1148");
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
            fPHeapMin1.refaz((int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1149");
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
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray16);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1150");
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
        ds.Item item68 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin67.insere(item68);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray57);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1151");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz(1, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin14.imprime();
        fPHeapMin14.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        fPHeapMin14.copia(itemArray19);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray19);
        fPHeapMin7.copia(itemArray19);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
        fPHeapMin28.refaz(1, 0);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMin28.copia(itemArray32);
        fPHeapMin26.copia(itemArray32);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray32);
        fPHeapMin7.copia(itemArray32);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
        fPHeapMin40.refaz((int) (short) 1, 0);
        ds.Item item44 = fPHeapMin40.min();
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
        fPHeapMin48.refaz(1, 0);
        ds.Item[] itemArray52 = new ds.Item[] {};
        fPHeapMin48.copia(itemArray52);
        fPHeapMin46.copia(itemArray52);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray52);
        fPHeapMin40.copia(itemArray52);
        fPHeapMin38.copia(itemArray52);
        fPHeapMin7.copia(itemArray52);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray52);
        fPHeapMin1.copia(itemArray52);
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin63.imprime();
        fPHeapMin63.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray68 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin(itemArray68);
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(itemArray68);
        fPHeapMin63.copia(itemArray68);
        ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(itemArray68);
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin(itemArray68);
        fPHeapMin73.constroi();
        fPHeapMin73.constroi();
        fPHeapMin73.imprime();
        fPHeapMin73.constroi();
        fPHeapMin73.constroi();
        fPHeapMin73.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 100, (java.lang.Object) fPHeapMin73);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray68);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1152");
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
        ds.Item[] itemArray30 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        fPHeapMin32.constroi();
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin35.imprime();
        fPHeapMin35.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray40 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray40);
        fPHeapMin35.copia(itemArray40);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray49 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray49);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray49);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray49);
        fPHeapMin48.copia(itemArray49);
        fPHeapMin46.copia(itemArray49);
        ds.Item[] itemArray55 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray55);
        fPHeapMin46.copia(itemArray55);
        ds.Item[] itemArray58 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray58);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray58);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(itemArray58);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray58);
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(itemArray58);
        fPHeapMin46.copia(itemArray58);
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray66);
        fPHeapMin46.copia(itemArray66);
        fPHeapMin32.copia(itemArray66);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin13.diminuiChave((int) (byte) 100, (java.lang.Object) itemArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray66);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1153");
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
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray11);
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1154");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1155");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        fPHeapMin1.constroi();
        fPHeapMin1.refaz((int) '4', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1156");
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
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray24);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item31 = fPHeapMin30.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1157");
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
        fPHeapMin1.imprime();
        ds.Item item16 = fPHeapMin1.min();
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1158");
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
        ds.Item item22 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item24 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item24);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1159");
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
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1160");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz(1, 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray7);
        fPHeapMin11.imprime();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin14.constroi();
        ds.Item item16 = fPHeapMin14.min();
        fPHeapMin14.constroi();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin19.imprime();
        fPHeapMin19.constroi();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin23.imprime();
        fPHeapMin23.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray28 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin23.copia(itemArray28);
        fPHeapMin19.copia(itemArray28);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray28);
        fPHeapMin14.copia(itemArray28);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin36.imprime();
        fPHeapMin36.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray41 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        fPHeapMin36.copia(itemArray41);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray41);
        fPHeapMin14.copia(itemArray41);
        fPHeapMin11.copia(itemArray41);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray41);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1161");
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
        ds.Item item67 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.Item item69 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNull(item67);
        org.junit.Assert.assertNull(item69);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1162");
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
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.refaz(0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1163");
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
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) ' ');
        fPHeapMin20.imprime();
        fPHeapMin20.refaz((int) ' ', (int) (short) 0);
        ds.Item item25 = fPHeapMin20.min();
        fPHeapMin20.imprime();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
        fPHeapMin32.refaz(1, 0);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMin32.copia(itemArray36);
        fPHeapMin30.copia(itemArray36);
        fPHeapMin28.copia(itemArray36);
        ds.Item item40 = fPHeapMin28.min();
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin42.imprime();
        fPHeapMin42.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray47 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray47);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray47);
        fPHeapMin42.copia(itemArray47);
        fPHeapMin28.copia(itemArray47);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray47);
        fPHeapMin20.copia(itemArray47);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray47);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray47);
        fPHeapMin1.copia(itemArray47);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1164");
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
            fPHeapMin7.refaz(100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1165");
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
        fPHeapMin3.constroi();
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
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
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray54);
        fPHeapMin34.copia(itemArray54);
        fPHeapMin20.copia(itemArray54);
        fPHeapMin20.constroi();
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin60.imprime();
        fPHeapMin60.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray65 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray65);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray65);
        fPHeapMin60.copia(itemArray65);
        ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin(itemArray65);
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(itemArray65);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(itemArray65);
        ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(itemArray65);
        fPHeapMin20.copia(itemArray65);
        fPHeapMin3.copia(itemArray65);
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray65);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1166");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin3.imprime();
        fPHeapMin3.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray8 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin3.copia(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = fPHeapMin14.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1167");
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
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 0, obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1168");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1169");
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
        ds.Item item17 = fPHeapMin16.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        fPHeapMin19.refaz((int) (short) 1, 0);
        ds.Item item23 = fPHeapMin19.min();
        fPHeapMin19.refaz((int) (byte) 10, 10);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin28.imprime();
        fPHeapMin28.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray33 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray33);
        fPHeapMin28.copia(itemArray33);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray33);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray33);
        fPHeapMin38.constroi();
        fPHeapMin38.constroi();
        ds.Item[] itemArray41 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
        fPHeapMin48.refaz(1, 0);
        ds.Item[] itemArray52 = new ds.Item[] {};
        fPHeapMin48.copia(itemArray52);
        fPHeapMin46.copia(itemArray52);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray52);
        fPHeapMin44.copia(itemArray52);
        ds.Item[] itemArray57 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray57);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray57);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray57);
        fPHeapMin44.copia(itemArray57);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray57);
        fPHeapMin38.copia(itemArray57);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(100);
        fPHeapMin65.refaz(1, 0);
        fPHeapMin65.constroi();
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin71.imprime();
        fPHeapMin71.constroi();
        fPHeapMin71.constroi();
        fPHeapMin71.imprime();
        ds.FPHeapMin fPHeapMin77 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin77.imprime();
        fPHeapMin77.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray82 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin83 = new ds.FPHeapMin(itemArray82);
        ds.FPHeapMin fPHeapMin84 = new ds.FPHeapMin(itemArray82);
        fPHeapMin77.copia(itemArray82);
        ds.FPHeapMin fPHeapMin86 = new ds.FPHeapMin(itemArray82);
        fPHeapMin71.copia(itemArray82);
        fPHeapMin65.copia(itemArray82);
        ds.FPHeapMin fPHeapMin89 = new ds.FPHeapMin(itemArray82);
        fPHeapMin38.copia(itemArray82);
        fPHeapMin19.copia(itemArray82);
        fPHeapMin16.copia(itemArray82);
        fPHeapMin1.copia(itemArray82);
        ds.FPHeapMin fPHeapMin94 = new ds.FPHeapMin(itemArray82);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray82);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1170");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        fPHeapMin9.refaz(1, 0);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin15.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        fPHeapMin1.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1171");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item38 = fPHeapMin37.min();
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
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1172");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (byte) 10, (int) (short) 0);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1173");
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
        java.lang.Class<?> wildcardClass21 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1174");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.refaz((int) 'a', (int) (byte) 1);
        fPHeapMin1.refaz((int) ' ', 10);
        fPHeapMin1.imprime();
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1175");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz(1, 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin13.imprime();
        fPHeapMin13.constroi();
        fPHeapMin13.constroi();
        ds.Item item17 = fPHeapMin13.min();
        ds.Item item18 = fPHeapMin13.min();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin20.imprime();
        fPHeapMin20.constroi();
        fPHeapMin20.constroi();
        fPHeapMin20.imprime();
        fPHeapMin20.constroi();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item28 = fPHeapMin27.min();
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin27.copia(itemArray30);
        fPHeapMin27.refaz((int) (short) 100, 0);
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
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray50 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray50);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray50);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray50);
        fPHeapMin49.copia(itemArray50);
        fPHeapMin47.copia(itemArray50);
        ds.Item[] itemArray56 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray56);
        fPHeapMin47.copia(itemArray56);
        ds.Item[] itemArray59 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray59);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(itemArray59);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray59);
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(itemArray59);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray59);
        fPHeapMin47.copia(itemArray59);
        fPHeapMin27.copia(itemArray59);
        fPHeapMin20.copia(itemArray59);
        ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin69.imprime();
        fPHeapMin69.constroi();
        fPHeapMin69.constroi();
        ds.Item item73 = fPHeapMin69.min();
        ds.Item[] itemArray74 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin75 = new ds.FPHeapMin(itemArray74);
        ds.FPHeapMin fPHeapMin76 = new ds.FPHeapMin(itemArray74);
        ds.FPHeapMin fPHeapMin77 = new ds.FPHeapMin(itemArray74);
        ds.FPHeapMin fPHeapMin79 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin81 = new ds.FPHeapMin(100);
        fPHeapMin81.refaz(1, 0);
        ds.Item[] itemArray85 = new ds.Item[] {};
        fPHeapMin81.copia(itemArray85);
        fPHeapMin79.copia(itemArray85);
        ds.FPHeapMin fPHeapMin88 = new ds.FPHeapMin(itemArray85);
        fPHeapMin77.copia(itemArray85);
        ds.Item[] itemArray90 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin91 = new ds.FPHeapMin(itemArray90);
        ds.FPHeapMin fPHeapMin92 = new ds.FPHeapMin(itemArray90);
        ds.FPHeapMin fPHeapMin93 = new ds.FPHeapMin(itemArray90);
        fPHeapMin77.copia(itemArray90);
        fPHeapMin69.copia(itemArray90);
        ds.FPHeapMin fPHeapMin96 = new ds.FPHeapMin(itemArray90);
        fPHeapMin20.copia(itemArray90);
        fPHeapMin13.copia(itemArray90);
        fPHeapMin1.copia(itemArray90);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNull(item73);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray85);
        org.junit.Assert.assertNotNull(itemArray90);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1176");
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
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin21.imprime();
        fPHeapMin21.constroi();
        fPHeapMin21.constroi();
        fPHeapMin21.imprime();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin27.imprime();
        fPHeapMin27.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray32);
        fPHeapMin27.copia(itemArray32);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray32);
        fPHeapMin21.copia(itemArray32);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray32);
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
        fPHeapMin39.copia(itemArray50);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin18.diminuiChave((int) (byte) -1, (java.lang.Object) fPHeapMin39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1177");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass4 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1178");
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
        java.lang.Class<?> wildcardClass31 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1179");
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
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray29);
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1180");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.refaz(1, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin8.imprime();
        fPHeapMin8.constroi();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin12.imprime();
        fPHeapMin12.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray17 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        fPHeapMin12.copia(itemArray17);
        fPHeapMin8.copia(itemArray17);
        ds.Item item22 = fPHeapMin8.min();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item25 = fPHeapMin24.min();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
        fPHeapMin27.refaz((int) (short) 1, 0);
        ds.Item item31 = fPHeapMin27.min();
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(100);
        fPHeapMin35.refaz(1, 0);
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMin35.copia(itemArray39);
        fPHeapMin33.copia(itemArray39);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray39);
        fPHeapMin27.copia(itemArray39);
        fPHeapMin24.copia(itemArray39);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray39);
        fPHeapMin8.copia(itemArray39);
        fPHeapMin1.copia(itemArray39);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray39);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1181");
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
        java.lang.Object obj48 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin45.diminuiChave(0, obj48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
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
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1182");
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
        ds.Item item15 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray18);
        fPHeapMin17.copia(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray18);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item26 = fPHeapMin25.min();
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMin25.copia(itemArray28);
        fPHeapMin23.copia(itemArray28);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray28);
        fPHeapMin1.copia(itemArray28);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1183");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.refaz((int) (short) 1, (int) (byte) -1);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        fPHeapMin16.refaz(1, 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray20);
        fPHeapMin14.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray20);
        fPHeapMin12.copia(itemArray20);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray20);
        fPHeapMin1.copia(itemArray20);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin31.imprime();
        fPHeapMin31.constroi();
        fPHeapMin31.constroi();
        ds.Item item35 = fPHeapMin31.min();
        ds.Item[] itemArray36 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(100);
        fPHeapMin43.refaz(1, 0);
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMin43.copia(itemArray47);
        fPHeapMin41.copia(itemArray47);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray47);
        fPHeapMin39.copia(itemArray47);
        ds.Item[] itemArray52 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray52);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray52);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray52);
        fPHeapMin39.copia(itemArray52);
        fPHeapMin31.copia(itemArray52);
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray52);
        fPHeapMin29.copia(itemArray52);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray52);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray52);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1184");
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
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin15.refaz((int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1185");
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
        ds.Item item69 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item69);
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
        org.junit.Assert.assertNotNull(itemArray62);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1186");
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
        fPHeapMin2.imprime();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1187");
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
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin16.refaz((int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1188");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz(1, 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray7);
        fPHeapMin11.imprime();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin15.imprime();
        fPHeapMin15.constroi();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin19.imprime();
        fPHeapMin19.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        fPHeapMin19.copia(itemArray24);
        fPHeapMin15.copia(itemArray24);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin32.imprime();
        fPHeapMin32.constroi();
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin36.imprime();
        fPHeapMin36.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray41 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        fPHeapMin36.copia(itemArray41);
        fPHeapMin32.copia(itemArray41);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMin32.copia(itemArray47);
        fPHeapMin30.copia(itemArray47);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray47);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin11.diminuiChave((int) (byte) -1, (java.lang.Object) itemArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1189");
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
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray30);
        fPHeapMin38.imprime();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1190");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz(1, 0);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray5);
        ds.Item item7 = fPHeapMin1.min();
        fPHeapMin1.imprime();
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
        java.lang.Class<?> wildcardClass24 = itemArray18.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1191");
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
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1192");
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
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray10);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1193");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz(1, 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray7);
        fPHeapMin11.imprime();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin15.imprime();
        fPHeapMin15.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin15.copia(itemArray20);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray20);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray29 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray29);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray29);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray29);
        fPHeapMin28.copia(itemArray29);
        fPHeapMin26.copia(itemArray29);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin11.diminuiChave((int) 'a', (java.lang.Object) fPHeapMin26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1194");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        ds.Item item6 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin8.constroi();
        ds.Item item10 = fPHeapMin8.min();
        fPHeapMin8.constroi();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
        fPHeapMin15.refaz(1, 0);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMin15.copia(itemArray19);
        fPHeapMin13.copia(itemArray19);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray19);
        fPHeapMin8.copia(itemArray19);
        fPHeapMin1.copia(itemArray19);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1195");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        fPHeapMin3.constroi();
        fPHeapMin3.constroi();
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1196");
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
        ds.Item item45 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item45);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1197");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        fPHeapMin7.refaz(1, 0);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray11);
        ds.Item item13 = fPHeapMin7.min();
        fPHeapMin7.imprime();
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin16.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin19.imprime();
        fPHeapMin19.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        fPHeapMin19.copia(itemArray24);
        fPHeapMin16.copia(itemArray24);
        fPHeapMin7.copia(itemArray24);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray24);
        fPHeapMin5.copia(itemArray24);
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1198");
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
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1199");
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
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item42 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1200");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item44 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1201");
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
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray55);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray55);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray55);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1202");
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
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        fPHeapMin23.refaz(1, 0);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin19.copia(itemArray27);
        ds.Item item31 = fPHeapMin19.min();
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin33.imprime();
        fPHeapMin33.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray38 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray38);
        fPHeapMin33.copia(itemArray38);
        fPHeapMin19.copia(itemArray38);
        fPHeapMin19.constroi();
        fPHeapMin19.constroi();
        fPHeapMin19.constroi();
        fPHeapMin19.constroi();
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
        fPHeapMin48.refaz((int) (short) 1, 0);
        ds.Item item52 = fPHeapMin48.min();
        fPHeapMin48.constroi();
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin55.imprime();
        fPHeapMin55.constroi();
        fPHeapMin55.constroi();
        ds.Item item59 = fPHeapMin55.min();
        fPHeapMin55.refaz((int) (short) 1, (int) (short) 0);
        ds.Item[] itemArray63 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray63);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray63);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray63);
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(100);
        fPHeapMin70.refaz(1, 0);
        ds.Item[] itemArray74 = new ds.Item[] {};
        fPHeapMin70.copia(itemArray74);
        fPHeapMin68.copia(itemArray74);
        ds.FPHeapMin fPHeapMin77 = new ds.FPHeapMin(itemArray74);
        fPHeapMin66.copia(itemArray74);
        fPHeapMin55.copia(itemArray74);
        fPHeapMin48.copia(itemArray74);
        ds.FPHeapMin fPHeapMin81 = new ds.FPHeapMin(itemArray74);
        ds.FPHeapMin fPHeapMin83 = new ds.FPHeapMin((int) (byte) 1);
        ds.FPHeapMin fPHeapMin85 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin85.imprime();
        fPHeapMin85.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray90 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin91 = new ds.FPHeapMin(itemArray90);
        ds.FPHeapMin fPHeapMin92 = new ds.FPHeapMin(itemArray90);
        fPHeapMin85.copia(itemArray90);
        fPHeapMin83.copia(itemArray90);
        ds.FPHeapMin fPHeapMin95 = new ds.FPHeapMin(itemArray90);
        ds.FPHeapMin fPHeapMin96 = new ds.FPHeapMin(itemArray90);
        fPHeapMin81.copia(itemArray90);
        fPHeapMin19.copia(itemArray90);
        fPHeapMin1.copia(itemArray90);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray90);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1203");
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
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.refaz(1, 0);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin18.copia(itemArray22);
        fPHeapMin16.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray22);
        fPHeapMin14.copia(itemArray22);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray22);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin11.diminuiChave((int) ' ', (java.lang.Object) fPHeapMin29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1204");
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
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1205");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.refaz((int) (short) 1, 0);
        fPHeapMin1.imprime();
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1206");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item20 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1207");
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
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin21.imprime();
        fPHeapMin21.constroi();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin25.imprime();
        fPHeapMin25.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray30 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        fPHeapMin25.copia(itemArray30);
        fPHeapMin21.copia(itemArray30);
        fPHeapMin19.copia(itemArray30);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray38 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray38);
        fPHeapMin37.copia(itemArray38);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray38);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item46 = fPHeapMin45.min();
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMin45.copia(itemArray48);
        fPHeapMin43.copia(itemArray48);
        fPHeapMin19.copia(itemArray48);
        fPHeapMin19.constroi();
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNotNull(itemArray48);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1208");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (short) 1, (int) (byte) 0);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz((int) (short) 1, 0);
        ds.Item item16 = fPHeapMin12.min();
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
        fPHeapMin20.refaz(1, 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin20.copia(itemArray24);
        fPHeapMin18.copia(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray24);
        fPHeapMin12.copia(itemArray24);
        fPHeapMin10.copia(itemArray24);
        fPHeapMin10.constroi();
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin32.imprime();
        fPHeapMin32.constroi();
        fPHeapMin32.constroi();
        fPHeapMin32.imprime();
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin38.imprime();
        fPHeapMin38.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray43 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray43);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray43);
        fPHeapMin38.copia(itemArray43);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray43);
        fPHeapMin32.copia(itemArray43);
        fPHeapMin10.copia(itemArray43);
        fPHeapMin1.copia(itemArray43);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray43);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin53.imprime();
        fPHeapMin53.constroi();
        fPHeapMin53.constroi();
        ds.Item item57 = fPHeapMin53.min();
        fPHeapMin53.refaz((int) (short) 1, (int) (short) 0);
        fPHeapMin53.constroi();
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(100);
        fPHeapMin63.refaz(1, 0);
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(100);
        fPHeapMin68.refaz(1, 0);
        fPHeapMin68.constroi();
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin74.imprime();
        fPHeapMin74.constroi();
        fPHeapMin74.constroi();
        fPHeapMin74.imprime();
        ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin80.imprime();
        fPHeapMin80.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray85 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin86 = new ds.FPHeapMin(itemArray85);
        ds.FPHeapMin fPHeapMin87 = new ds.FPHeapMin(itemArray85);
        fPHeapMin80.copia(itemArray85);
        ds.FPHeapMin fPHeapMin89 = new ds.FPHeapMin(itemArray85);
        fPHeapMin74.copia(itemArray85);
        fPHeapMin68.copia(itemArray85);
        ds.FPHeapMin fPHeapMin92 = new ds.FPHeapMin(itemArray85);
        fPHeapMin63.copia(itemArray85);
        fPHeapMin53.copia(itemArray85);
        fPHeapMin51.copia(itemArray85);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item57);
        org.junit.Assert.assertNotNull(itemArray85);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1209");
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
            fPHeapMin74.refaz(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1210");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        fPHeapMin1.constroi();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.constroi();
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
            fPHeapMin1.diminuiChave((int) ' ', (java.lang.Object) item88);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
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
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1211");
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
        fPHeapMin3.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item36 = fPHeapMin3.min();
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
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1212");
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
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item17 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1213");
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
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
        fPHeapMin27.refaz(1, 0);
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMin27.copia(itemArray31);
        fPHeapMin25.copia(itemArray31);
        fPHeapMin23.copia(itemArray31);
        ds.Item item35 = fPHeapMin23.min();
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin37.imprime();
        fPHeapMin37.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray42 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray42);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray42);
        fPHeapMin37.copia(itemArray42);
        fPHeapMin23.copia(itemArray42);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray42);
        fPHeapMin1.copia(itemArray42);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1214");
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
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray15);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1215");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin5.constroi();
        ds.Item item7 = fPHeapMin5.min();
        fPHeapMin5.constroi();
        fPHeapMin5.constroi();
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        fPHeapMin11.refaz(1, 0);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin18.imprime();
        fPHeapMin18.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray23 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray23);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray23);
        fPHeapMin18.copia(itemArray23);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray23);
        fPHeapMin11.copia(itemArray23);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
        fPHeapMin32.refaz(1, 0);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMin32.copia(itemArray36);
        fPHeapMin30.copia(itemArray36);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray36);
        fPHeapMin11.copia(itemArray36);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin((int) (short) 10);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(100);
        fPHeapMin44.refaz((int) (short) 1, 0);
        ds.Item item48 = fPHeapMin44.min();
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(100);
        fPHeapMin52.refaz(1, 0);
        ds.Item[] itemArray56 = new ds.Item[] {};
        fPHeapMin52.copia(itemArray56);
        fPHeapMin50.copia(itemArray56);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray56);
        fPHeapMin44.copia(itemArray56);
        fPHeapMin42.copia(itemArray56);
        fPHeapMin11.copia(itemArray56);
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(itemArray56);
        fPHeapMin5.copia(itemArray56);
        fPHeapMin1.copia(itemArray56);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNotNull(itemArray56);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1216");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item5 = fPHeapMin1.min();
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass8 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1217");
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
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(100);
        fPHeapMin57.refaz(1, 0);
        ds.Item[] itemArray61 = new ds.Item[] {};
        fPHeapMin57.copia(itemArray61);
        fPHeapMin55.copia(itemArray61);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray61);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray61);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray61);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray61);
        fPHeapMin1.copia(itemArray61);
        ds.Item item69 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNull(item69);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1218");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.refaz(1, 0);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin12.refaz((int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1219");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) ' ', (int) (short) 0);
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item8 = fPHeapMin1.min();
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '4', obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1220");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = null;
        ds.Item[] itemArray4 = new ds.Item[] { item3 };
        fPHeapMin1.copia(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        fPHeapMin6.constroi();
        fPHeapMin6.imprime();
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz(1, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin((int) (short) 10);
        fPHeapMin19.imprime();
        fPHeapMin19.refaz((int) (byte) 10, 0);
        ds.Item[] itemArray24 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        fPHeapMin19.copia(itemArray24);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray24);
        fPHeapMin12.copia(itemArray24);
        java.lang.Class<?> wildcardClass30 = itemArray24.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin6.diminuiChave((int) (short) 10, (java.lang.Object) itemArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1221");
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
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1222");
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
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass30 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1223");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item34 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1224");
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
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray32);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin35.refaz((int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1225");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin2 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray0);
        java.lang.Class<?> wildcardClass7 = fPHeapMin6.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1226");
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
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item43 = fPHeapMin42.min();
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMin42.copia(itemArray45);
        fPHeapMin1.copia(itemArray45);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item48 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1227");
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
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray24);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray24);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1228");
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
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin16.refaz((int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1229");
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
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        java.lang.Class<?> wildcardClass16 = fPHeapMin15.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1230");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (byte) 10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        fPHeapMin12.refaz(1, 0);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin8.copia(itemArray16);
        fPHeapMin1.copia(itemArray16);
        fPHeapMin1.imprime();
        ds.Item item23 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1231");
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
        fPHeapMin12.imprime();
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin12.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1232");
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
        ds.Item item59 = fPHeapMin1.min();
        ds.Item item60 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item60);
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
        org.junit.Assert.assertNull(item59);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1233");
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
        ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin(itemArray62);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNotNull(itemArray62);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1234");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) (short) 1, (int) (byte) 0);
        fPHeapMin1.refaz((int) (short) 100, (int) (byte) 0);
        fPHeapMin1.refaz((int) (short) 100, 10);
        fPHeapMin1.constroi();
        ds.Item item16 = fPHeapMin1.min();
        ds.Item item17 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1235");
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
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1236");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item item3 = fPHeapMin1.min();
        fPHeapMin1.refaz(1, (int) (byte) -1);
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass8 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1237");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item66 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray55);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1238");
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
        fPHeapMin3.imprime();
        fPHeapMin3.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item37 = fPHeapMin3.min();
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
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1239");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.Item[] itemArray2 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray2);
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.constroi();
        ds.Item item8 = fPHeapMin1.min();
        ds.Item item9 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1240");
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
        java.lang.Class<?> wildcardClass19 = itemArray12.getClass();
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1241");
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
        fPHeapMin35.constroi();
        fPHeapMin35.constroi();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1242");
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
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray12);
        ds.Item[] itemArray21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin20.copia(itemArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1243");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) ' ', (int) (short) 0);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }
}

