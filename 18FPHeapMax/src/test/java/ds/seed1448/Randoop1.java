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
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0502");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0503");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.imprime();
        ds.Item item7 = fPHeapMax5.max();
        ds.Item item8 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax14.copia(itemArray22);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        fPHeapMax14.copia(itemArray34);
        fPHeapMax11.copia(itemArray34);
        fPHeapMax5.copia(itemArray34);
        fPHeapMax3.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        ds.Item item42 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0504");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0505");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0506");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        fPHeapMax4.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        java.lang.Class<?> wildcardClass21 = itemArray16.getClass();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0507");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.refaz((int) (short) 100, (int) '#');
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item33 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0508");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0509");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass7 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0510");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray5);
        ds.Item item7 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass8 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0511");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.Item item24 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item24);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0512");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        fPHeapMax7.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item45 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0513");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item5 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax25.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax25.copia(itemArray33);
        fPHeapMax13.copia(itemArray33);
        fPHeapMax10.copia(itemArray33);
        fPHeapMax8.copia(itemArray33);
        fPHeapMax4.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax43.constroi();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMax46.copia(itemArray48);
        fPHeapMax43.copia(itemArray48);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) fPHeapMax43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray48);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0514");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item[] itemArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0515");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.refaz((int) (byte) 10, (-1));
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax28.refaz((int) '4', 0);
        fPHeapMax28.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax34.constroi();
        fPHeapMax34.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax38.constroi();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax38.copia(itemArray46);
        fPHeapMax34.copia(itemArray46);
        fPHeapMax28.copia(itemArray46);
        fPHeapMax1.copia(itemArray46);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0516");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0517");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz(1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0518");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 100, (int) (short) 1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray19);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray33);
        fPHeapMax8.copia(itemArray33);
        ds.Item item36 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        fPHeapMax8.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax42.refaz((int) '4', 0);
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax42.copia(itemArray50);
        fPHeapMax8.copia(itemArray50);
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax59.imprime();
        ds.Item item61 = fPHeapMax59.max();
        ds.Item item62 = fPHeapMax59.max();
        fPHeapMax59.constroi();
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax65.constroi();
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item69 = null;
        ds.Item[] itemArray70 = new ds.Item[] { item69 };
        fPHeapMax68.copia(itemArray70);
        fPHeapMax68.constroi();
        ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item75 = null;
        ds.Item[] itemArray76 = new ds.Item[] { item75 };
        fPHeapMax74.copia(itemArray76);
        fPHeapMax68.copia(itemArray76);
        ds.FPHeapMax fPHeapMax80 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item81 = null;
        ds.Item[] itemArray82 = new ds.Item[] { item81 };
        fPHeapMax80.copia(itemArray82);
        fPHeapMax80.constroi();
        ds.FPHeapMax fPHeapMax86 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item87 = null;
        ds.Item[] itemArray88 = new ds.Item[] { item87 };
        fPHeapMax86.copia(itemArray88);
        fPHeapMax80.copia(itemArray88);
        fPHeapMax68.copia(itemArray88);
        fPHeapMax65.copia(itemArray88);
        fPHeapMax59.copia(itemArray88);
        fPHeapMax57.copia(itemArray88);
        fPHeapMax8.copia(itemArray88);
        fPHeapMax1.copia(itemArray88);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item97 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNull(item61);
        org.junit.Assert.assertNull(item62);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNotNull(itemArray82);
        org.junit.Assert.assertNotNull(itemArray88);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0519");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item6 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax32.copia(itemArray40);
        fPHeapMax20.copia(itemArray40);
        fPHeapMax17.copia(itemArray40);
        fPHeapMax15.copia(itemArray40);
        fPHeapMax11.copia(itemArray40);
        fPHeapMax5.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        ds.Item item49 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0520");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.refaz((int) ' ', 1);
        ds.Item item38 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0521");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax51.imprime();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        fPHeapMax54.constroi();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMax60.copia(itemArray62);
        fPHeapMax54.copia(itemArray62);
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item67 = null;
        ds.Item[] itemArray68 = new ds.Item[] { item67 };
        fPHeapMax66.copia(itemArray68);
        fPHeapMax66.constroi();
        ds.FPHeapMax fPHeapMax72 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item73 = null;
        ds.Item[] itemArray74 = new ds.Item[] { item73 };
        fPHeapMax72.copia(itemArray74);
        fPHeapMax66.copia(itemArray74);
        fPHeapMax54.copia(itemArray74);
        fPHeapMax51.copia(itemArray74);
        fPHeapMax49.copia(itemArray74);
        fPHeapMax1.copia(itemArray74);
        ds.FPHeapMax fPHeapMax83 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item84 = null;
        ds.Item[] itemArray85 = new ds.Item[] { item84 };
        fPHeapMax83.copia(itemArray85);
        fPHeapMax83.imprime();
        fPHeapMax83.refaz((int) (short) 10, (int) (byte) 10);
        fPHeapMax83.constroi();
        fPHeapMax83.constroi();
        java.lang.Class<?> wildcardClass93 = fPHeapMax83.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray85);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0522");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax19.copia(itemArray27);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax31.copia(itemArray39);
        fPHeapMax19.copia(itemArray39);
        fPHeapMax16.copia(itemArray39);
        fPHeapMax10.copia(itemArray39);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax46.imprime();
        fPHeapMax46.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax50.copia(itemArray58);
        fPHeapMax46.copia(itemArray58);
        fPHeapMax10.copia(itemArray58);
        fPHeapMax1.copia(itemArray58);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax67.constroi();
        ds.Item item69 = fPHeapMax67.max();
        fPHeapMax67.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) fPHeapMax67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNull(item69);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0523");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax11.constroi();
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax15.copia(itemArray20);
        fPHeapMax11.copia(itemArray20);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax25.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax25.copia(itemArray33);
        fPHeapMax11.copia(itemArray33);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0524");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) 'a', (int) (short) 10);
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
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0525");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item20 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0526");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax4.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax41.copia(itemArray49);
        fPHeapMax29.copia(itemArray49);
        fPHeapMax26.copia(itemArray49);
        fPHeapMax20.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        ds.Item item56 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item58 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item56);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0527");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0528");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0529");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.constroi();
        ds.Item item28 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0530");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) 'a', (int) (short) 10);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0531");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0532");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) 'a', (int) (short) 1);
        ds.Item item34 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0533");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0534");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0535");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        fPHeapMax16.copia(itemArray28);
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) fPHeapMax16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0536");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax7.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0537");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax11.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax5.copia(itemArray16);
        fPHeapMax5.constroi();
        java.lang.Class<?> wildcardClass22 = fPHeapMax5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0538");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) 'a', (int) (short) 10);
        ds.Item item8 = fPHeapMax1.max();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0539");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0540");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass31 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0541");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 1, 1);
        java.lang.Class<?> wildcardClass9 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0542");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0543");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax12.constroi();
        fPHeapMax12.constroi();
        fPHeapMax12.refaz((int) (byte) 100, (int) (short) 1);
        fPHeapMax12.refaz((int) 'a', (int) 'a');
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax22.refaz((int) '4', 0);
        fPHeapMax22.imprime();
        fPHeapMax22.refaz((int) (byte) 100, 0);
        fPHeapMax22.imprime();
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax33.constroi();
        fPHeapMax33.constroi();
        fPHeapMax33.constroi();
        fPHeapMax33.constroi();
        ds.Item item38 = fPHeapMax33.max();
        fPHeapMax33.imprime();
        fPHeapMax33.imprime();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax42.refaz((int) '4', 0);
        fPHeapMax42.imprime();
        fPHeapMax42.refaz((int) (byte) 100, 0);
        ds.Item item50 = fPHeapMax42.max();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item53 = fPHeapMax52.max();
        fPHeapMax52.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax58.imprime();
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        fPHeapMax61.copia(itemArray63);
        fPHeapMax61.constroi();
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item68 = null;
        ds.Item[] itemArray69 = new ds.Item[] { item68 };
        fPHeapMax67.copia(itemArray69);
        fPHeapMax61.copia(itemArray69);
        ds.FPHeapMax fPHeapMax73 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item74 = null;
        ds.Item[] itemArray75 = new ds.Item[] { item74 };
        fPHeapMax73.copia(itemArray75);
        fPHeapMax73.constroi();
        ds.FPHeapMax fPHeapMax79 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item80 = null;
        ds.Item[] itemArray81 = new ds.Item[] { item80 };
        fPHeapMax79.copia(itemArray81);
        fPHeapMax73.copia(itemArray81);
        fPHeapMax61.copia(itemArray81);
        fPHeapMax58.copia(itemArray81);
        fPHeapMax56.copia(itemArray81);
        fPHeapMax52.copia(itemArray81);
        fPHeapMax42.copia(itemArray81);
        fPHeapMax33.copia(itemArray81);
        fPHeapMax22.copia(itemArray81);
        fPHeapMax12.copia(itemArray81);
        fPHeapMax12.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) fPHeapMax12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertNotNull(itemArray81);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0544");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        fPHeapMax7.constroi();
        fPHeapMax7.constroi();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.refaz((int) '4', 0);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax7.copia(itemArray21);
        java.lang.Class<?> wildcardClass25 = fPHeapMax7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) wildcardClass25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0545");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax4.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        java.lang.Class<?> wildcardClass29 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0546");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax14.copia(itemArray22);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        fPHeapMax14.copia(itemArray34);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) itemArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0547");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0548");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item32 = fPHeapMax1.max();
        ds.Item item33 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item32);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0549");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax10.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        ds.Item item36 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax39.constroi();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMax45.copia(itemArray47);
        fPHeapMax39.copia(itemArray47);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) itemArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0550");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax33.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax33.copia(itemArray41);
        fPHeapMax21.copia(itemArray41);
        fPHeapMax18.copia(itemArray41);
        fPHeapMax11.copia(itemArray41);
        fPHeapMax1.copia(itemArray41);
        fPHeapMax1.imprime();
        ds.Item item49 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0551");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.Item item25 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax27.imprime();
        ds.Item item29 = fPHeapMax27.max();
        ds.Item item30 = fPHeapMax27.max();
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax33.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax36.copia(itemArray44);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax48.constroi();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        fPHeapMax48.copia(itemArray56);
        fPHeapMax36.copia(itemArray56);
        fPHeapMax33.copia(itemArray56);
        fPHeapMax27.copia(itemArray56);
        fPHeapMax1.copia(itemArray56);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item63 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray56);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0552");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
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
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0553");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax4.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax41.copia(itemArray49);
        fPHeapMax29.copia(itemArray49);
        fPHeapMax26.copia(itemArray49);
        fPHeapMax20.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        ds.Item item56 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax60.constroi();
        fPHeapMax60.imprime();
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax64.constroi();
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item68 = null;
        ds.Item[] itemArray69 = new ds.Item[] { item68 };
        fPHeapMax67.copia(itemArray69);
        fPHeapMax64.copia(itemArray69);
        fPHeapMax60.copia(itemArray69);
        fPHeapMax58.copia(itemArray69);
        fPHeapMax1.copia(itemArray69);
        java.lang.Class<?> wildcardClass75 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item56);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0554");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.Item item25 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax27.imprime();
        ds.Item item29 = fPHeapMax27.max();
        ds.Item item30 = fPHeapMax27.max();
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax33.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax36.copia(itemArray44);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax48.constroi();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        fPHeapMax48.copia(itemArray56);
        fPHeapMax36.copia(itemArray56);
        fPHeapMax33.copia(itemArray56);
        fPHeapMax27.copia(itemArray56);
        fPHeapMax1.copia(itemArray56);
        fPHeapMax1.refaz((int) (short) 1, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item69 = fPHeapMax68.max();
        fPHeapMax68.constroi();
        ds.Item item71 = fPHeapMax68.max();
        ds.Item item72 = fPHeapMax68.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNull(item69);
        org.junit.Assert.assertNull(item71);
        org.junit.Assert.assertNull(item72);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0555");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0556");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.refaz((int) '4', 0);
        fPHeapMax8.imprime();
        fPHeapMax8.refaz((int) (byte) 100, 0);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax38.constroi();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax38.copia(itemArray46);
        fPHeapMax26.copia(itemArray46);
        fPHeapMax23.copia(itemArray46);
        fPHeapMax17.copia(itemArray46);
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax53.imprime();
        fPHeapMax53.constroi();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        fPHeapMax57.constroi();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        fPHeapMax57.copia(itemArray65);
        fPHeapMax53.copia(itemArray65);
        fPHeapMax17.copia(itemArray65);
        fPHeapMax8.copia(itemArray65);
        fPHeapMax1.copia(itemArray65);
        ds.Item item72 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass74 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNull(item72);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0557");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0558");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax19.copia(itemArray27);
        fPHeapMax7.copia(itemArray27);
        ds.Item item31 = fPHeapMax7.max();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax38.constroi();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax38.copia(itemArray46);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax50.copia(itemArray58);
        fPHeapMax38.copia(itemArray58);
        fPHeapMax35.copia(itemArray58);
        fPHeapMax33.copia(itemArray58);
        fPHeapMax33.imprime();
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax66.constroi();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item70 = null;
        ds.Item[] itemArray71 = new ds.Item[] { item70 };
        fPHeapMax69.copia(itemArray71);
        fPHeapMax66.copia(itemArray71);
        fPHeapMax33.copia(itemArray71);
        fPHeapMax7.copia(itemArray71);
        fPHeapMax1.copia(itemArray71);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item78 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray71);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0559");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 10, 10);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.refaz((int) '4', 0);
        fPHeapMax13.imprime();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax25.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax25.copia(itemArray33);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax37.constroi();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax37.copia(itemArray45);
        fPHeapMax25.copia(itemArray45);
        fPHeapMax22.copia(itemArray45);
        fPHeapMax20.copia(itemArray45);
        fPHeapMax20.imprime();
        ds.Item item52 = fPHeapMax20.max();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax54.constroi();
        fPHeapMax54.constroi();
        fPHeapMax54.constroi();
        fPHeapMax54.constroi();
        ds.Item item59 = fPHeapMax54.max();
        fPHeapMax54.imprime();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax62.constroi();
        fPHeapMax62.imprime();
        fPHeapMax62.imprime();
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax67.imprime();
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        fPHeapMax70.copia(itemArray72);
        fPHeapMax70.constroi();
        ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item77 = null;
        ds.Item[] itemArray78 = new ds.Item[] { item77 };
        fPHeapMax76.copia(itemArray78);
        fPHeapMax70.copia(itemArray78);
        ds.FPHeapMax fPHeapMax82 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item83 = null;
        ds.Item[] itemArray84 = new ds.Item[] { item83 };
        fPHeapMax82.copia(itemArray84);
        fPHeapMax82.constroi();
        ds.FPHeapMax fPHeapMax88 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item89 = null;
        ds.Item[] itemArray90 = new ds.Item[] { item89 };
        fPHeapMax88.copia(itemArray90);
        fPHeapMax82.copia(itemArray90);
        fPHeapMax70.copia(itemArray90);
        fPHeapMax67.copia(itemArray90);
        fPHeapMax62.copia(itemArray90);
        fPHeapMax54.copia(itemArray90);
        fPHeapMax20.copia(itemArray90);
        fPHeapMax13.copia(itemArray90);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(itemArray78);
        org.junit.Assert.assertNotNull(itemArray84);
        org.junit.Assert.assertNotNull(itemArray90);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0560");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax19.copia(itemArray27);
        fPHeapMax7.copia(itemArray27);
        fPHeapMax4.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.refaz((int) '4', (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0561");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax4.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.constroi();
        ds.Item item30 = fPHeapMax1.max();
        ds.Item item31 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNull(item31);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0562");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0563");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0564");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0565");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) 'a', (int) (short) 1);
        ds.Item item34 = fPHeapMax1.max();
        ds.Item[] itemArray35 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item34);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0566");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0567");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass20 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0568");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item25 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0569");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0570");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax44.copia(itemArray49);
        fPHeapMax11.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        java.lang.Class<?> wildcardClass54 = itemArray49.getClass();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0571");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax4.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax31.copia(itemArray39);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax43.constroi();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax43.copia(itemArray51);
        fPHeapMax31.copia(itemArray51);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) fPHeapMax31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0572");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0573");
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
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0574");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 100, (int) (short) 1);
        fPHeapMax1.refaz((int) 'a', (int) 'a');
        java.lang.Class<?> wildcardClass10 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0575");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) '4', (int) ' ');
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass34 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0576");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax36.copia(itemArray44);
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray47);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax50.copia(itemArray58);
        ds.Item[] itemArray61 = new ds.Item[] {};
        fPHeapMax50.copia(itemArray61);
        fPHeapMax36.copia(itemArray61);
        fPHeapMax31.copia(itemArray61);
        fPHeapMax1.copia(itemArray61);
        fPHeapMax1.refaz((int) (byte) 1, (int) (short) 1);
        ds.Item item69 = fPHeapMax1.max();
        ds.Item item70 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNull(item69);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0577");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item5 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax25.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax25.copia(itemArray33);
        fPHeapMax13.copia(itemArray33);
        fPHeapMax10.copia(itemArray33);
        fPHeapMax8.copia(itemArray33);
        fPHeapMax4.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item41 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0578");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
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
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0579");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.imprime();
        fPHeapMax4.refaz((int) (short) 10, (int) (byte) 10);
        fPHeapMax4.constroi();
        fPHeapMax4.constroi();
        fPHeapMax4.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0580");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.refaz((int) '4', 0);
        fPHeapMax8.imprime();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax32.copia(itemArray40);
        fPHeapMax20.copia(itemArray40);
        fPHeapMax17.copia(itemArray40);
        fPHeapMax15.copia(itemArray40);
        fPHeapMax15.imprime();
        ds.Item item47 = fPHeapMax15.max();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax49.constroi();
        fPHeapMax49.constroi();
        fPHeapMax49.constroi();
        fPHeapMax49.constroi();
        ds.Item item54 = fPHeapMax49.max();
        fPHeapMax49.imprime();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax57.constroi();
        fPHeapMax57.imprime();
        fPHeapMax57.imprime();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax62.imprime();
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item66 = null;
        ds.Item[] itemArray67 = new ds.Item[] { item66 };
        fPHeapMax65.copia(itemArray67);
        fPHeapMax65.constroi();
        ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item72 = null;
        ds.Item[] itemArray73 = new ds.Item[] { item72 };
        fPHeapMax71.copia(itemArray73);
        fPHeapMax65.copia(itemArray73);
        ds.FPHeapMax fPHeapMax77 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item78 = null;
        ds.Item[] itemArray79 = new ds.Item[] { item78 };
        fPHeapMax77.copia(itemArray79);
        fPHeapMax77.constroi();
        ds.FPHeapMax fPHeapMax83 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item84 = null;
        ds.Item[] itemArray85 = new ds.Item[] { item84 };
        fPHeapMax83.copia(itemArray85);
        fPHeapMax77.copia(itemArray85);
        fPHeapMax65.copia(itemArray85);
        fPHeapMax62.copia(itemArray85);
        fPHeapMax57.copia(itemArray85);
        fPHeapMax49.copia(itemArray85);
        fPHeapMax15.copia(itemArray85);
        fPHeapMax8.copia(itemArray85);
        fPHeapMax1.copia(itemArray85);
        ds.Item item95 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertNotNull(itemArray85);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0581");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax33.constroi();
        fPHeapMax33.imprime();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax37.constroi();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax37.copia(itemArray42);
        fPHeapMax33.copia(itemArray42);
        fPHeapMax33.constroi();
        ds.Item item47 = fPHeapMax33.max();
        ds.Item item48 = fPHeapMax33.max();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item54 = null;
        ds.Item[] itemArray55 = new ds.Item[] { item54 };
        fPHeapMax53.copia(itemArray55);
        fPHeapMax50.copia(itemArray55);
        fPHeapMax50.imprime();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax62.imprime();
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item66 = null;
        ds.Item[] itemArray67 = new ds.Item[] { item66 };
        fPHeapMax65.copia(itemArray67);
        fPHeapMax65.constroi();
        ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item72 = null;
        ds.Item[] itemArray73 = new ds.Item[] { item72 };
        fPHeapMax71.copia(itemArray73);
        fPHeapMax65.copia(itemArray73);
        ds.FPHeapMax fPHeapMax77 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item78 = null;
        ds.Item[] itemArray79 = new ds.Item[] { item78 };
        fPHeapMax77.copia(itemArray79);
        fPHeapMax77.constroi();
        ds.FPHeapMax fPHeapMax83 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item84 = null;
        ds.Item[] itemArray85 = new ds.Item[] { item84 };
        fPHeapMax83.copia(itemArray85);
        fPHeapMax77.copia(itemArray85);
        fPHeapMax65.copia(itemArray85);
        fPHeapMax62.copia(itemArray85);
        fPHeapMax60.copia(itemArray85);
        fPHeapMax50.copia(itemArray85);
        fPHeapMax33.copia(itemArray85);
        fPHeapMax1.copia(itemArray85);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertNotNull(itemArray85);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0582");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        fPHeapMax17.copia(itemArray37);
        fPHeapMax14.copia(itemArray37);
        fPHeapMax9.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) 'a');
        ds.Item item47 = fPHeapMax46.max();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax49.constroi();
        fPHeapMax49.imprime();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax53.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax53.copia(itemArray58);
        fPHeapMax49.copia(itemArray58);
        fPHeapMax46.copia(itemArray58);
        fPHeapMax1.copia(itemArray58);
        ds.Item item64 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0583");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0584");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.refaz(10, 10);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax19.imprime();
        ds.Item item21 = fPHeapMax19.max();
        ds.Item item22 = fPHeapMax19.max();
        ds.Item item23 = fPHeapMax19.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax25.imprime();
        fPHeapMax25.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax34.imprime();
        ds.Item item36 = fPHeapMax34.max();
        ds.Item item37 = fPHeapMax34.max();
        fPHeapMax34.imprime();
        fPHeapMax34.constroi();
        ds.Item item40 = fPHeapMax34.max();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax42.constroi();
        fPHeapMax42.constroi();
        fPHeapMax42.constroi();
        fPHeapMax42.constroi();
        ds.Item item47 = fPHeapMax42.max();
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax50.constroi();
        fPHeapMax50.imprime();
        fPHeapMax50.imprime();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax55.imprime();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMax58.copia(itemArray60);
        fPHeapMax58.constroi();
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        fPHeapMax64.copia(itemArray66);
        fPHeapMax58.copia(itemArray66);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        fPHeapMax70.copia(itemArray72);
        fPHeapMax70.constroi();
        ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item77 = null;
        ds.Item[] itemArray78 = new ds.Item[] { item77 };
        fPHeapMax76.copia(itemArray78);
        fPHeapMax70.copia(itemArray78);
        fPHeapMax58.copia(itemArray78);
        fPHeapMax55.copia(itemArray78);
        fPHeapMax50.copia(itemArray78);
        fPHeapMax42.copia(itemArray78);
        fPHeapMax34.copia(itemArray78);
        fPHeapMax25.copia(itemArray78);
        fPHeapMax19.copia(itemArray78);
        fPHeapMax1.copia(itemArray78);
        ds.Item item89 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(itemArray78);
        org.junit.Assert.assertNull(item89);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0585");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(1);
        ds.Item item5 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray18);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax21.copia(itemArray32);
        fPHeapMax7.copia(itemArray32);
        ds.Item item35 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        fPHeapMax7.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax41.refaz((int) '4', 0);
        fPHeapMax41.imprime();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax41.copia(itemArray49);
        fPHeapMax7.copia(itemArray49);
        fPHeapMax4.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        java.lang.Object obj56 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, obj56);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0586");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax4.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0587");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax19.copia(itemArray27);
        fPHeapMax7.copia(itemArray27);
        fPHeapMax4.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item34 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0588");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        ds.Item item33 = fPHeapMax1.max();
        ds.Item item34 = fPHeapMax1.max();
        ds.Item item35 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass36 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0589");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.refaz(10, 10);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax19.imprime();
        ds.Item item21 = fPHeapMax19.max();
        ds.Item item22 = fPHeapMax19.max();
        ds.Item item23 = fPHeapMax19.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax25.imprime();
        fPHeapMax25.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax34.imprime();
        ds.Item item36 = fPHeapMax34.max();
        ds.Item item37 = fPHeapMax34.max();
        fPHeapMax34.imprime();
        fPHeapMax34.constroi();
        ds.Item item40 = fPHeapMax34.max();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax42.constroi();
        fPHeapMax42.constroi();
        fPHeapMax42.constroi();
        fPHeapMax42.constroi();
        ds.Item item47 = fPHeapMax42.max();
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax50.constroi();
        fPHeapMax50.imprime();
        fPHeapMax50.imprime();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax55.imprime();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMax58.copia(itemArray60);
        fPHeapMax58.constroi();
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        fPHeapMax64.copia(itemArray66);
        fPHeapMax58.copia(itemArray66);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        fPHeapMax70.copia(itemArray72);
        fPHeapMax70.constroi();
        ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item77 = null;
        ds.Item[] itemArray78 = new ds.Item[] { item77 };
        fPHeapMax76.copia(itemArray78);
        fPHeapMax70.copia(itemArray78);
        fPHeapMax58.copia(itemArray78);
        fPHeapMax55.copia(itemArray78);
        fPHeapMax50.copia(itemArray78);
        fPHeapMax42.copia(itemArray78);
        fPHeapMax34.copia(itemArray78);
        fPHeapMax25.copia(itemArray78);
        fPHeapMax19.copia(itemArray78);
        fPHeapMax1.copia(itemArray78);
        ds.Item item89 = fPHeapMax1.max();
        fPHeapMax1.refaz(100, (int) (short) -1);
        ds.Item item93 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(itemArray78);
        org.junit.Assert.assertNull(item89);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0590");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 1);
        ds.Item item9 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0591");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0592");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.refaz(10, 10);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax19.imprime();
        ds.Item item21 = fPHeapMax19.max();
        ds.Item item22 = fPHeapMax19.max();
        ds.Item item23 = fPHeapMax19.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax25.imprime();
        fPHeapMax25.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax34.imprime();
        ds.Item item36 = fPHeapMax34.max();
        ds.Item item37 = fPHeapMax34.max();
        fPHeapMax34.imprime();
        fPHeapMax34.constroi();
        ds.Item item40 = fPHeapMax34.max();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax42.constroi();
        fPHeapMax42.constroi();
        fPHeapMax42.constroi();
        fPHeapMax42.constroi();
        ds.Item item47 = fPHeapMax42.max();
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax50.constroi();
        fPHeapMax50.imprime();
        fPHeapMax50.imprime();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax55.imprime();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMax58.copia(itemArray60);
        fPHeapMax58.constroi();
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        fPHeapMax64.copia(itemArray66);
        fPHeapMax58.copia(itemArray66);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        fPHeapMax70.copia(itemArray72);
        fPHeapMax70.constroi();
        ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item77 = null;
        ds.Item[] itemArray78 = new ds.Item[] { item77 };
        fPHeapMax76.copia(itemArray78);
        fPHeapMax70.copia(itemArray78);
        fPHeapMax58.copia(itemArray78);
        fPHeapMax55.copia(itemArray78);
        fPHeapMax50.copia(itemArray78);
        fPHeapMax42.copia(itemArray78);
        fPHeapMax34.copia(itemArray78);
        fPHeapMax25.copia(itemArray78);
        fPHeapMax19.copia(itemArray78);
        fPHeapMax1.copia(itemArray78);
        ds.Item item89 = fPHeapMax1.max();
        fPHeapMax1.refaz(100, (int) (short) -1);
        ds.Item item93 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(itemArray78);
        org.junit.Assert.assertNull(item89);
        org.junit.Assert.assertNull(item93);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0593");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) 'a');
        ds.Item item7 = fPHeapMax6.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) item7);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0594");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        java.lang.Class<?> wildcardClass6 = fPHeapMax5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0595");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.imprime();
        ds.Item item48 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (short) 100, (int) ' ');
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item53 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item48);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0596");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        ds.Item item33 = fPHeapMax1.max();
        ds.Item item34 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item35 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item34);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0597");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass5 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0598");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0599");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        ds.Item item5 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0600");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.Item item25 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item27 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax29.copia(itemArray40);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax43.constroi();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax43.copia(itemArray51);
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray54);
        fPHeapMax29.copia(itemArray54);
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMax58.copia(itemArray60);
        fPHeapMax29.copia(itemArray60);
        fPHeapMax1.copia(itemArray60);
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax66.imprime();
        ds.Item item68 = fPHeapMax66.max();
        ds.Item item69 = fPHeapMax66.max();
        fPHeapMax66.constroi();
        fPHeapMax66.refaz((int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNull(item68);
        org.junit.Assert.assertNull(item69);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0601");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.constroi();
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0602");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax36.copia(itemArray44);
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray47);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax50.copia(itemArray58);
        ds.Item[] itemArray61 = new ds.Item[] {};
        fPHeapMax50.copia(itemArray61);
        fPHeapMax36.copia(itemArray61);
        fPHeapMax31.copia(itemArray61);
        fPHeapMax1.copia(itemArray61);
        fPHeapMax1.refaz((int) (byte) 1, (int) (short) 1);
        ds.Item item69 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray61);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0603");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.imprime();
        ds.Item item12 = fPHeapMax10.max();
        ds.Item item13 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        ds.Item item16 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        ds.Item item23 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax34.copia(itemArray42);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMax46.copia(itemArray48);
        fPHeapMax46.constroi();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        fPHeapMax52.copia(itemArray54);
        fPHeapMax46.copia(itemArray54);
        fPHeapMax34.copia(itemArray54);
        fPHeapMax31.copia(itemArray54);
        fPHeapMax26.copia(itemArray54);
        fPHeapMax18.copia(itemArray54);
        fPHeapMax10.copia(itemArray54);
        fPHeapMax1.copia(itemArray54);
        fPHeapMax1.constroi();
        ds.Item item64 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0604");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax4.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax41.copia(itemArray49);
        fPHeapMax29.copia(itemArray49);
        fPHeapMax26.copia(itemArray49);
        fPHeapMax20.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        ds.Item item56 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass58 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item56);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0605");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, (int) (byte) 1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0606");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.Item item35 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax37.refaz((int) '4', 0);
        fPHeapMax37.imprime();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax37.copia(itemArray45);
        fPHeapMax1.copia(itemArray45);
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        fPHeapMax51.constroi();
        fPHeapMax51.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray53);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0607");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass9 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0608");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0609");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        fPHeapMax5.copia(itemArray25);
        fPHeapMax5.constroi();
        java.lang.Class<?> wildcardClass30 = fPHeapMax5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0610");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) 'a', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0611");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        ds.Item item33 = fPHeapMax1.max();
        ds.Item item34 = fPHeapMax1.max();
        ds.Item item35 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item34);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0612");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0613");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0614");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(100, 0);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0615");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) 'a', (int) (short) 10);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
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
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0616");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray19);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray33);
        fPHeapMax8.copia(itemArray33);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax8.copia(itemArray39);
        fPHeapMax8.imprime();
        fPHeapMax8.refaz(100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) fPHeapMax8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0617");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        fPHeapMax17.copia(itemArray37);
        fPHeapMax14.copia(itemArray37);
        fPHeapMax9.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        fPHeapMax1.imprime();
        ds.Item item45 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass46 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0618");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.imprime();
        ds.Item item48 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass49 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0619");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (byte) -1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax11.constroi();
        fPHeapMax11.constroi();
        fPHeapMax11.constroi();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax17.refaz((int) '4', 0);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        fPHeapMax11.copia(itemArray25);
        fPHeapMax11.imprime();
        java.lang.Class<?> wildcardClass30 = fPHeapMax11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) wildcardClass30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0620");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray17);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray31);
        fPHeapMax6.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item35 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0621");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax52.imprime();
        ds.Item item54 = fPHeapMax52.max();
        ds.Item item55 = fPHeapMax52.max();
        fPHeapMax52.constroi();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax58.constroi();
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        fPHeapMax61.copia(itemArray63);
        fPHeapMax61.constroi();
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item68 = null;
        ds.Item[] itemArray69 = new ds.Item[] { item68 };
        fPHeapMax67.copia(itemArray69);
        fPHeapMax61.copia(itemArray69);
        ds.FPHeapMax fPHeapMax73 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item74 = null;
        ds.Item[] itemArray75 = new ds.Item[] { item74 };
        fPHeapMax73.copia(itemArray75);
        fPHeapMax73.constroi();
        ds.FPHeapMax fPHeapMax79 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item80 = null;
        ds.Item[] itemArray81 = new ds.Item[] { item80 };
        fPHeapMax79.copia(itemArray81);
        fPHeapMax73.copia(itemArray81);
        fPHeapMax61.copia(itemArray81);
        fPHeapMax58.copia(itemArray81);
        fPHeapMax52.copia(itemArray81);
        fPHeapMax50.copia(itemArray81);
        fPHeapMax1.copia(itemArray81);
        ds.Item item89 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass90 = item89.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertNotNull(itemArray81);
        org.junit.Assert.assertNull(item89);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0622");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0623");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        fPHeapMax17.copia(itemArray37);
        fPHeapMax14.copia(itemArray37);
        fPHeapMax9.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        fPHeapMax1.imprime();
        ds.Item item45 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax48.imprime();
        ds.Item item50 = fPHeapMax48.max();
        fPHeapMax48.constroi();
        java.lang.Class<?> wildcardClass52 = fPHeapMax48.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) wildcardClass52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0624");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0625");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        ds.Item item33 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0626");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0627");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0628");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass9 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0629");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item11 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0630");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.imprime();
        ds.Item item7 = fPHeapMax5.max();
        ds.Item item8 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax14.copia(itemArray22);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        fPHeapMax14.copia(itemArray34);
        fPHeapMax11.copia(itemArray34);
        fPHeapMax5.copia(itemArray34);
        fPHeapMax3.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass43 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0631");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0632");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax34.imprime();
        ds.Item item36 = fPHeapMax34.max();
        ds.Item item37 = fPHeapMax34.max();
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax40.constroi();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax43.constroi();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax43.copia(itemArray51);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax55.constroi();
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        fPHeapMax61.copia(itemArray63);
        fPHeapMax55.copia(itemArray63);
        fPHeapMax43.copia(itemArray63);
        fPHeapMax40.copia(itemArray63);
        fPHeapMax34.copia(itemArray63);
        fPHeapMax1.copia(itemArray63);
        java.lang.Class<?> wildcardClass70 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0633");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item6 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax32.copia(itemArray40);
        fPHeapMax20.copia(itemArray40);
        fPHeapMax17.copia(itemArray40);
        fPHeapMax15.copia(itemArray40);
        fPHeapMax11.copia(itemArray40);
        fPHeapMax5.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        ds.Item item49 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass50 = item49.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item49);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0634");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0635");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) 'a');
        fPHeapMax50.imprime();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax53.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax56.constroi();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMax62.copia(itemArray64);
        fPHeapMax56.copia(itemArray64);
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item69 = null;
        ds.Item[] itemArray70 = new ds.Item[] { item69 };
        fPHeapMax68.copia(itemArray70);
        fPHeapMax68.constroi();
        ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item75 = null;
        ds.Item[] itemArray76 = new ds.Item[] { item75 };
        fPHeapMax74.copia(itemArray76);
        fPHeapMax68.copia(itemArray76);
        fPHeapMax56.copia(itemArray76);
        fPHeapMax53.copia(itemArray76);
        fPHeapMax50.copia(itemArray76);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(itemArray76);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0636");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.Item item25 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 1, 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0637");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item9 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax12.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0638");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.refaz((int) ' ', 1);
        fPHeapMax1.imprime();
        ds.Item item39 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item40 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item39);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0639");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0640");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.Item item19 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0641");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.constroi();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 1, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0642");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        fPHeapMax8.copia(itemArray20);
        fPHeapMax5.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax28.refaz((int) '4', 0);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item34 = fPHeapMax33.max();
        fPHeapMax33.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax39.imprime();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax42.constroi();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax42.copia(itemArray50);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        fPHeapMax54.constroi();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMax60.copia(itemArray62);
        fPHeapMax54.copia(itemArray62);
        fPHeapMax42.copia(itemArray62);
        fPHeapMax39.copia(itemArray62);
        fPHeapMax37.copia(itemArray62);
        fPHeapMax33.copia(itemArray62);
        fPHeapMax28.copia(itemArray62);
        fPHeapMax1.copia(itemArray62);
        ds.Item item71 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray62);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0643");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) '#', 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0644");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.refaz(10, 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax33.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax33.copia(itemArray41);
        fPHeapMax21.copia(itemArray41);
        ds.Item item45 = fPHeapMax21.max();
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item54 = null;
        ds.Item[] itemArray55 = new ds.Item[] { item54 };
        fPHeapMax53.copia(itemArray55);
        fPHeapMax53.constroi();
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMax59.copia(itemArray61);
        fPHeapMax53.copia(itemArray61);
        ds.Item[] itemArray64 = new ds.Item[] {};
        fPHeapMax53.copia(itemArray64);
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item68 = null;
        ds.Item[] itemArray69 = new ds.Item[] { item68 };
        fPHeapMax67.copia(itemArray69);
        fPHeapMax67.constroi();
        ds.FPHeapMax fPHeapMax73 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item74 = null;
        ds.Item[] itemArray75 = new ds.Item[] { item74 };
        fPHeapMax73.copia(itemArray75);
        fPHeapMax67.copia(itemArray75);
        ds.Item[] itemArray78 = new ds.Item[] {};
        fPHeapMax67.copia(itemArray78);
        fPHeapMax53.copia(itemArray78);
        fPHeapMax48.copia(itemArray78);
        fPHeapMax21.copia(itemArray78);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) itemArray78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(itemArray75);
        org.junit.Assert.assertNotNull(itemArray78);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0645");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.imprime();
        ds.Item item48 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item49 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item48);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0646");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax24.constroi();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax24.copia(itemArray32);
        fPHeapMax12.copia(itemArray32);
        fPHeapMax9.copia(itemArray32);
        fPHeapMax7.copia(itemArray32);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) fPHeapMax7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0647");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, 1);
        fPHeapMax1.refaz((int) (byte) 100, 100);
        java.lang.Class<?> wildcardClass12 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0648");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.imprime();
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
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0649");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0650");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax16.refaz((int) '4', 0);
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax22.constroi();
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        fPHeapMax22.copia(itemArray34);
        fPHeapMax16.copia(itemArray34);
        fPHeapMax16.refaz((int) (byte) 10, (-1));
        fPHeapMax16.refaz((int) (byte) 100, (int) (short) 100);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax50.imprime();
        ds.Item item52 = fPHeapMax50.max();
        ds.Item item53 = fPHeapMax50.max();
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax56.constroi();
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMax59.copia(itemArray61);
        fPHeapMax59.constroi();
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item66 = null;
        ds.Item[] itemArray67 = new ds.Item[] { item66 };
        fPHeapMax65.copia(itemArray67);
        fPHeapMax59.copia(itemArray67);
        ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item72 = null;
        ds.Item[] itemArray73 = new ds.Item[] { item72 };
        fPHeapMax71.copia(itemArray73);
        fPHeapMax71.constroi();
        ds.FPHeapMax fPHeapMax77 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item78 = null;
        ds.Item[] itemArray79 = new ds.Item[] { item78 };
        fPHeapMax77.copia(itemArray79);
        fPHeapMax71.copia(itemArray79);
        fPHeapMax59.copia(itemArray79);
        fPHeapMax56.copia(itemArray79);
        fPHeapMax50.copia(itemArray79);
        fPHeapMax48.copia(itemArray79);
        fPHeapMax46.copia(itemArray79);
        fPHeapMax16.copia(itemArray79);
        fPHeapMax1.copia(itemArray79);
        fPHeapMax1.refaz(100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertNotNull(itemArray79);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0651");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0652");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.Item item19 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item22 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0653");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0654");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item11 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = item11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0655");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax33.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax33.copia(itemArray41);
        fPHeapMax21.copia(itemArray41);
        ds.Item item45 = fPHeapMax21.max();
        fPHeapMax21.imprime();
        ds.Item item47 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax49.constroi();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax49.copia(itemArray57);
        ds.Item[] itemArray60 = new ds.Item[] {};
        fPHeapMax49.copia(itemArray60);
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        fPHeapMax63.constroi();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item70 = null;
        ds.Item[] itemArray71 = new ds.Item[] { item70 };
        fPHeapMax69.copia(itemArray71);
        fPHeapMax63.copia(itemArray71);
        ds.Item[] itemArray74 = new ds.Item[] {};
        fPHeapMax63.copia(itemArray74);
        fPHeapMax49.copia(itemArray74);
        ds.FPHeapMax fPHeapMax78 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item79 = null;
        ds.Item[] itemArray80 = new ds.Item[] { item79 };
        fPHeapMax78.copia(itemArray80);
        fPHeapMax49.copia(itemArray80);
        fPHeapMax21.copia(itemArray80);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) itemArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray80);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0656");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax44.copia(itemArray49);
        fPHeapMax11.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item54 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0657");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
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
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0658");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass5 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0659");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax23.copia(itemArray31);
        fPHeapMax11.copia(itemArray31);
        fPHeapMax8.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        ds.Item item37 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0660");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0661");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax44.copia(itemArray49);
        fPHeapMax11.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        ds.Item item54 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0662");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        fPHeapMax17.copia(itemArray37);
        fPHeapMax14.copia(itemArray37);
        fPHeapMax9.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        fPHeapMax1.imprime();
        ds.Item item45 = fPHeapMax1.max();
        ds.Item item46 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax49.constroi();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax49.copia(itemArray57);
        ds.Item[] itemArray60 = new ds.Item[] {};
        fPHeapMax49.copia(itemArray60);
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        fPHeapMax63.constroi();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item70 = null;
        ds.Item[] itemArray71 = new ds.Item[] { item70 };
        fPHeapMax69.copia(itemArray71);
        fPHeapMax63.copia(itemArray71);
        ds.Item[] itemArray74 = new ds.Item[] {};
        fPHeapMax63.copia(itemArray74);
        fPHeapMax49.copia(itemArray74);
        ds.Item item77 = fPHeapMax49.max();
        fPHeapMax49.imprime();
        fPHeapMax49.refaz(100, 10);
        ds.Item item82 = fPHeapMax49.max();
        fPHeapMax49.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNull(item77);
        org.junit.Assert.assertNull(item82);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0663");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax10.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        java.lang.Class<?> wildcardClass36 = itemArray30.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0664");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0665");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 10, 10);
        fPHeapMax1.refaz((int) 'a', (-1));
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 0);
        fPHeapMax16.imprime();
        fPHeapMax16.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0666");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass28 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0667");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0668");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray23);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray37);
        fPHeapMax12.copia(itemArray37);
        fPHeapMax7.copia(itemArray37);
        fPHeapMax7.refaz((int) (byte) 10, (int) (short) -1);
        fPHeapMax7.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0669");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, 10);
        ds.Item item34 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item36 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item34);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0670");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.imprime();
        ds.Item item48 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (short) 100, (int) ' ');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax55.imprime();
        fPHeapMax55.refaz(1, (int) (short) 0);
        ds.Item item60 = fPHeapMax55.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) item60);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNull(item60);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0671");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0672");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax19.copia(itemArray27);
        fPHeapMax7.copia(itemArray27);
        fPHeapMax4.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        ds.Item item33 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item33);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0673");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(100, 0);
        fPHeapMax1.refaz((int) '#', (int) ' ');
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0674");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) 'a', (int) (short) 1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) 'a');
        fPHeapMax37.imprime();
        ds.Item item39 = fPHeapMax37.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) item39);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item39);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0675");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0676");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax17.copia(itemArray22);
        fPHeapMax13.copia(itemArray22);
        fPHeapMax11.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        ds.Item item28 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item32 = fPHeapMax31.max();
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax37.imprime();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax40.constroi();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMax46.copia(itemArray48);
        fPHeapMax40.copia(itemArray48);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        fPHeapMax52.copia(itemArray54);
        fPHeapMax52.constroi();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMax58.copia(itemArray60);
        fPHeapMax52.copia(itemArray60);
        fPHeapMax40.copia(itemArray60);
        fPHeapMax37.copia(itemArray60);
        fPHeapMax35.copia(itemArray60);
        fPHeapMax31.copia(itemArray60);
        fPHeapMax31.constroi();
        java.lang.Class<?> wildcardClass68 = fPHeapMax31.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0677");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, 1);
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0678");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        ds.Item item9 = fPHeapMax1.max();
        ds.Item[] itemArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0679");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        java.lang.Class<?> wildcardClass24 = itemArray19.getClass();
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0680");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax34.copia(itemArray39);
        fPHeapMax1.copia(itemArray39);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0681");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        java.lang.Class<?> wildcardClass32 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0682");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item36 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0683");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz(1, 0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 1, (int) (short) -1);
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0684");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 100, (int) (short) 1);
        fPHeapMax1.refaz((int) 'a', (int) 'a');
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax11.refaz((int) '4', 0);
        fPHeapMax11.imprime();
        fPHeapMax11.refaz((int) (byte) 100, 0);
        fPHeapMax11.imprime();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax22.constroi();
        fPHeapMax22.constroi();
        fPHeapMax22.constroi();
        fPHeapMax22.constroi();
        ds.Item item27 = fPHeapMax22.max();
        fPHeapMax22.imprime();
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax31.refaz((int) '4', 0);
        fPHeapMax31.imprime();
        fPHeapMax31.refaz((int) (byte) 100, 0);
        ds.Item item39 = fPHeapMax31.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item42 = fPHeapMax41.max();
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax47.imprime();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax50.copia(itemArray58);
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMax62.copia(itemArray64);
        fPHeapMax62.constroi();
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item69 = null;
        ds.Item[] itemArray70 = new ds.Item[] { item69 };
        fPHeapMax68.copia(itemArray70);
        fPHeapMax62.copia(itemArray70);
        fPHeapMax50.copia(itemArray70);
        fPHeapMax47.copia(itemArray70);
        fPHeapMax45.copia(itemArray70);
        fPHeapMax41.copia(itemArray70);
        fPHeapMax31.copia(itemArray70);
        fPHeapMax22.copia(itemArray70);
        fPHeapMax11.copia(itemArray70);
        fPHeapMax1.copia(itemArray70);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item82 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item42);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray70);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0685");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.imprime();
        ds.Item item48 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (short) 100, (int) ' ');
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item48);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0686");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax19.copia(itemArray27);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax31.copia(itemArray39);
        fPHeapMax19.copia(itemArray39);
        ds.Item item43 = fPHeapMax19.max();
        fPHeapMax19.imprime();
        ds.Item item45 = fPHeapMax19.max();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax47.constroi();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item54 = null;
        ds.Item[] itemArray55 = new ds.Item[] { item54 };
        fPHeapMax53.copia(itemArray55);
        fPHeapMax47.copia(itemArray55);
        ds.Item[] itemArray58 = new ds.Item[] {};
        fPHeapMax47.copia(itemArray58);
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        fPHeapMax61.copia(itemArray63);
        fPHeapMax61.constroi();
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item68 = null;
        ds.Item[] itemArray69 = new ds.Item[] { item68 };
        fPHeapMax67.copia(itemArray69);
        fPHeapMax61.copia(itemArray69);
        ds.Item[] itemArray72 = new ds.Item[] {};
        fPHeapMax61.copia(itemArray72);
        fPHeapMax47.copia(itemArray72);
        ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item77 = null;
        ds.Item[] itemArray78 = new ds.Item[] { item77 };
        fPHeapMax76.copia(itemArray78);
        fPHeapMax47.copia(itemArray78);
        fPHeapMax19.copia(itemArray78);
        fPHeapMax1.copia(itemArray78);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(itemArray78);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0687");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0688");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax11.refaz((int) '4', 0);
        fPHeapMax11.imprime();
        fPHeapMax11.refaz((int) (byte) 100, 0);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax21.constroi();
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax28.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax31.copia(itemArray39);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax43.constroi();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax43.copia(itemArray51);
        fPHeapMax31.copia(itemArray51);
        fPHeapMax28.copia(itemArray51);
        fPHeapMax21.copia(itemArray51);
        fPHeapMax11.copia(itemArray51);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) itemArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0689");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax36.copia(itemArray44);
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray47);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax50.copia(itemArray58);
        ds.Item[] itemArray61 = new ds.Item[] {};
        fPHeapMax50.copia(itemArray61);
        fPHeapMax36.copia(itemArray61);
        fPHeapMax31.copia(itemArray61);
        fPHeapMax1.copia(itemArray61);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray61);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0690");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        ds.Item item10 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax15.constroi();
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax19.copia(itemArray24);
        fPHeapMax15.copia(itemArray24);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        fPHeapMax15.copia(itemArray37);
        fPHeapMax13.copia(itemArray37);
        fPHeapMax13.constroi();
        ds.Item item43 = fPHeapMax13.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) item43);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item43);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0691");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0692");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0693");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0694");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0695");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, 1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax11.refaz((int) '4', 0);
        fPHeapMax11.imprime();
        fPHeapMax11.refaz((int) (byte) 100, 0);
        ds.Item item19 = fPHeapMax11.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0696");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass7 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0697");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.refaz((int) (byte) 10, (-1));
        ds.Item item27 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass28 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0698");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) 'a', (int) (short) 1);
        ds.Item item36 = fPHeapMax1.max();
        ds.Item item37 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item36);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0699");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        ds.Item item18 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0700");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax(1);
        ds.Item item28 = fPHeapMax27.max();
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray29);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax32.copia(itemArray40);
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray43);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMax46.copia(itemArray48);
        fPHeapMax46.constroi();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        fPHeapMax52.copia(itemArray54);
        fPHeapMax46.copia(itemArray54);
        ds.Item[] itemArray57 = new ds.Item[] {};
        fPHeapMax46.copia(itemArray57);
        fPHeapMax32.copia(itemArray57);
        fPHeapMax27.copia(itemArray57);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray57);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0701");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax21.imprime();
        ds.Item item23 = fPHeapMax21.max();
        fPHeapMax21.constroi();
        fPHeapMax21.refaz(0, (int) (byte) -1);
        fPHeapMax21.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0702");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) 'a', (int) (short) 10);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass9 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0703");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0704");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0705");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0706");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 100, (int) '#');
        java.lang.Class<?> wildcardClass21 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0707");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (byte) -1);
        fPHeapMax1.imprime();
        ds.Item item9 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0708");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0709");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.refaz((int) (short) 100, (int) '#');
        fPHeapMax1.constroi();
        ds.Item item33 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item33);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0710");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0711");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax41.copia(itemArray49);
        fPHeapMax29.copia(itemArray49);
        fPHeapMax26.copia(itemArray49);
        fPHeapMax20.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0712");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax10.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax38.constroi();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax38.copia(itemArray46);
        ds.Item item49 = fPHeapMax38.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) fPHeapMax38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNull(item49);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0713");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.refaz(100, 100);
        fPHeapMax1.refaz((int) (short) 100, (int) ' ');
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.imprime();
        fPHeapMax12.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax21.imprime();
        ds.Item item23 = fPHeapMax21.max();
        ds.Item item24 = fPHeapMax21.max();
        fPHeapMax21.imprime();
        fPHeapMax21.constroi();
        ds.Item item27 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax29.constroi();
        fPHeapMax29.constroi();
        fPHeapMax29.constroi();
        fPHeapMax29.constroi();
        ds.Item item34 = fPHeapMax29.max();
        fPHeapMax29.imprime();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax37.constroi();
        fPHeapMax37.imprime();
        fPHeapMax37.imprime();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMax45.copia(itemArray47);
        fPHeapMax45.constroi();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        fPHeapMax45.copia(itemArray53);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        fPHeapMax57.constroi();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        fPHeapMax57.copia(itemArray65);
        fPHeapMax45.copia(itemArray65);
        fPHeapMax42.copia(itemArray65);
        fPHeapMax37.copia(itemArray65);
        fPHeapMax29.copia(itemArray65);
        fPHeapMax21.copia(itemArray65);
        fPHeapMax12.copia(itemArray65);
        fPHeapMax1.copia(itemArray65);
        java.lang.Class<?> wildcardClass75 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0714");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.Item item34 = fPHeapMax1.max();
        ds.Item item35 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item34);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0715");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, (int) ' ');
        ds.Item item16 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) '#', (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0716");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item11 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.Item item15 = fPHeapMax13.max();
        ds.Item item16 = fPHeapMax13.max();
        fPHeapMax13.refaz((int) 'a', (int) (short) 10);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item23 = fPHeapMax22.max();
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax28.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax31.copia(itemArray39);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax43.constroi();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax43.copia(itemArray51);
        fPHeapMax31.copia(itemArray51);
        fPHeapMax28.copia(itemArray51);
        fPHeapMax26.copia(itemArray51);
        fPHeapMax22.copia(itemArray51);
        fPHeapMax13.copia(itemArray51);
        fPHeapMax1.copia(itemArray51);
        ds.Item item60 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item61 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNull(item60);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0717");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        fPHeapMax7.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item44 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0718");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item9 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = item9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0719");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, (int) ' ');
        ds.Item item16 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass17 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0720");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0721");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0722");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item20 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass22 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0723");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.imprime();
        fPHeapMax26.refaz(1, (int) (short) 0);
        ds.Item item31 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax36.imprime();
        ds.Item item38 = fPHeapMax36.max();
        ds.Item item39 = fPHeapMax36.max();
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax42.constroi();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMax45.copia(itemArray47);
        fPHeapMax45.constroi();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        fPHeapMax45.copia(itemArray53);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        fPHeapMax57.constroi();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        fPHeapMax57.copia(itemArray65);
        fPHeapMax45.copia(itemArray65);
        fPHeapMax42.copia(itemArray65);
        fPHeapMax36.copia(itemArray65);
        fPHeapMax34.copia(itemArray65);
        fPHeapMax26.copia(itemArray65);
        fPHeapMax1.copia(itemArray65);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray65);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0724");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax20.constroi();
        fPHeapMax20.constroi();
        fPHeapMax20.constroi();
        fPHeapMax20.constroi();
        ds.Item item25 = fPHeapMax20.max();
        fPHeapMax20.imprime();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax28.constroi();
        fPHeapMax28.imprime();
        fPHeapMax28.imprime();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax33.imprime();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax36.copia(itemArray44);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax48.constroi();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        fPHeapMax48.copia(itemArray56);
        fPHeapMax36.copia(itemArray56);
        fPHeapMax33.copia(itemArray56);
        fPHeapMax28.copia(itemArray56);
        fPHeapMax20.copia(itemArray56);
        java.lang.Class<?> wildcardClass63 = fPHeapMax20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) wildcardClass63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0725");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.refaz((int) (byte) 10, (-1));
        fPHeapMax1.refaz((int) (byte) 100, (int) (short) 100);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.imprime();
        ds.Item item37 = fPHeapMax35.max();
        ds.Item item38 = fPHeapMax35.max();
        fPHeapMax35.constroi();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax44.copia(itemArray52);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax56.constroi();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMax62.copia(itemArray64);
        fPHeapMax56.copia(itemArray64);
        fPHeapMax44.copia(itemArray64);
        fPHeapMax41.copia(itemArray64);
        fPHeapMax35.copia(itemArray64);
        fPHeapMax33.copia(itemArray64);
        fPHeapMax31.copia(itemArray64);
        fPHeapMax1.copia(itemArray64);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray64);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0726");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.Item item19 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = item19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0727");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        fPHeapMax17.copia(itemArray37);
        fPHeapMax14.copia(itemArray37);
        fPHeapMax9.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        fPHeapMax1.imprime();
        ds.Item item45 = fPHeapMax1.max();
        ds.Item item46 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNull(item46);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0728");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        ds.Item item20 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax24.constroi();
        fPHeapMax24.imprime();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax24.copia(itemArray36);
        fPHeapMax24.constroi();
        fPHeapMax24.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) fPHeapMax24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0729");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.refaz(10, 10);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax19.imprime();
        ds.Item item21 = fPHeapMax19.max();
        ds.Item item22 = fPHeapMax19.max();
        ds.Item item23 = fPHeapMax19.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax25.imprime();
        fPHeapMax25.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax34.imprime();
        ds.Item item36 = fPHeapMax34.max();
        ds.Item item37 = fPHeapMax34.max();
        fPHeapMax34.imprime();
        fPHeapMax34.constroi();
        ds.Item item40 = fPHeapMax34.max();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax42.constroi();
        fPHeapMax42.constroi();
        fPHeapMax42.constroi();
        fPHeapMax42.constroi();
        ds.Item item47 = fPHeapMax42.max();
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax50.constroi();
        fPHeapMax50.imprime();
        fPHeapMax50.imprime();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax55.imprime();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMax58.copia(itemArray60);
        fPHeapMax58.constroi();
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        fPHeapMax64.copia(itemArray66);
        fPHeapMax58.copia(itemArray66);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        fPHeapMax70.copia(itemArray72);
        fPHeapMax70.constroi();
        ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item77 = null;
        ds.Item[] itemArray78 = new ds.Item[] { item77 };
        fPHeapMax76.copia(itemArray78);
        fPHeapMax70.copia(itemArray78);
        fPHeapMax58.copia(itemArray78);
        fPHeapMax55.copia(itemArray78);
        fPHeapMax50.copia(itemArray78);
        fPHeapMax42.copia(itemArray78);
        fPHeapMax34.copia(itemArray78);
        fPHeapMax25.copia(itemArray78);
        fPHeapMax19.copia(itemArray78);
        fPHeapMax1.copia(itemArray78);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass90 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(itemArray78);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0730");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax17.copia(itemArray22);
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
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0731");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item12 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0732");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) '#', (int) (short) -1);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0733");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax32.copia(itemArray40);
        fPHeapMax20.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        ds.Item item45 = fPHeapMax1.max();
        fPHeapMax1.refaz(100, (int) ' ');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        fPHeapMax52.copia(itemArray54);
        fPHeapMax52.constroi();
        fPHeapMax52.constroi();
        ds.Item item58 = fPHeapMax52.max();
        fPHeapMax52.imprime();
        ds.Item item60 = fPHeapMax52.max();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax(1);
        ds.Item item63 = fPHeapMax62.max();
        ds.Item[] itemArray64 = new ds.Item[] {};
        fPHeapMax62.copia(itemArray64);
        fPHeapMax52.copia(itemArray64);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) fPHeapMax52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNull(item58);
        org.junit.Assert.assertNull(item60);
        org.junit.Assert.assertNull(item63);
        org.junit.Assert.assertNotNull(itemArray64);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0734");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.refaz((int) '4', 0);
        fPHeapMax5.imprime();
        fPHeapMax5.refaz((int) (byte) 100, 0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax16.constroi();
        fPHeapMax16.constroi();
        fPHeapMax16.constroi();
        fPHeapMax16.constroi();
        ds.Item item21 = fPHeapMax16.max();
        fPHeapMax16.imprime();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax25.refaz((int) '4', 0);
        fPHeapMax25.imprime();
        fPHeapMax25.refaz((int) (byte) 100, 0);
        ds.Item item33 = fPHeapMax25.max();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item36 = fPHeapMax35.max();
        fPHeapMax35.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax41.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax44.copia(itemArray52);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax56.constroi();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMax62.copia(itemArray64);
        fPHeapMax56.copia(itemArray64);
        fPHeapMax44.copia(itemArray64);
        fPHeapMax41.copia(itemArray64);
        fPHeapMax39.copia(itemArray64);
        fPHeapMax35.copia(itemArray64);
        fPHeapMax25.copia(itemArray64);
        fPHeapMax16.copia(itemArray64);
        fPHeapMax5.copia(itemArray64);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) itemArray64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray64);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0735");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.refaz(10, (int) (short) 10);
        fPHeapMax1.refaz((int) (short) 100, (int) 'a');
        fPHeapMax1.imprime();
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0736");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0737");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        ds.Item item33 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0738");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax4.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax41.copia(itemArray49);
        fPHeapMax29.copia(itemArray49);
        fPHeapMax26.copia(itemArray49);
        fPHeapMax20.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0739");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.Item item34 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax36.constroi();
        fPHeapMax36.imprime();
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax41.constroi();
        fPHeapMax41.constroi();
        fPHeapMax41.constroi();
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax47.refaz((int) '4', 0);
        fPHeapMax47.imprime();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item54 = null;
        ds.Item[] itemArray55 = new ds.Item[] { item54 };
        fPHeapMax53.copia(itemArray55);
        fPHeapMax47.copia(itemArray55);
        fPHeapMax41.copia(itemArray55);
        fPHeapMax36.copia(itemArray55);
        fPHeapMax1.copia(itemArray55);
        java.lang.Class<?> wildcardClass61 = itemArray55.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0740");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0741");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0742");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.refaz((int) '#', (int) ' ');
        ds.Item item30 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item30);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0743");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax34.copia(itemArray39);
        fPHeapMax1.copia(itemArray39);
        fPHeapMax1.refaz(0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item46 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0744");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass12 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0745");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, 10);
        fPHeapMax1.refaz((int) (byte) 1, 1);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0746");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.Item item19 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item22 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item24 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item22);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0747");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax19.copia(itemArray27);
        fPHeapMax7.copia(itemArray27);
        fPHeapMax4.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0748");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass9 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0749");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray24);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax27.copia(itemArray35);
        ds.Item[] itemArray38 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray38);
        fPHeapMax13.copia(itemArray38);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax13.copia(itemArray44);
        fPHeapMax1.copia(itemArray44);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0750");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        fPHeapMax4.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax23.imprime();
        ds.Item item25 = fPHeapMax23.max();
        ds.Item item26 = fPHeapMax23.max();
        ds.Item item27 = fPHeapMax23.max();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.imprime();
        fPHeapMax29.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax38.imprime();
        ds.Item item40 = fPHeapMax38.max();
        ds.Item item41 = fPHeapMax38.max();
        fPHeapMax38.imprime();
        fPHeapMax38.constroi();
        ds.Item item44 = fPHeapMax38.max();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax46.constroi();
        fPHeapMax46.constroi();
        fPHeapMax46.constroi();
        fPHeapMax46.constroi();
        ds.Item item51 = fPHeapMax46.max();
        fPHeapMax46.imprime();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax54.constroi();
        fPHeapMax54.imprime();
        fPHeapMax54.imprime();
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax59.imprime();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMax62.copia(itemArray64);
        fPHeapMax62.constroi();
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item69 = null;
        ds.Item[] itemArray70 = new ds.Item[] { item69 };
        fPHeapMax68.copia(itemArray70);
        fPHeapMax62.copia(itemArray70);
        ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item75 = null;
        ds.Item[] itemArray76 = new ds.Item[] { item75 };
        fPHeapMax74.copia(itemArray76);
        fPHeapMax74.constroi();
        ds.FPHeapMax fPHeapMax80 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item81 = null;
        ds.Item[] itemArray82 = new ds.Item[] { item81 };
        fPHeapMax80.copia(itemArray82);
        fPHeapMax74.copia(itemArray82);
        fPHeapMax62.copia(itemArray82);
        fPHeapMax59.copia(itemArray82);
        fPHeapMax54.copia(itemArray82);
        fPHeapMax46.copia(itemArray82);
        fPHeapMax38.copia(itemArray82);
        fPHeapMax29.copia(itemArray82);
        fPHeapMax23.copia(itemArray82);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) fPHeapMax23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNotNull(itemArray82);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0751");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax44.copia(itemArray49);
        fPHeapMax11.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        ds.Item item54 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item54);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0752");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.Item item8 = fPHeapMax3.max();
        fPHeapMax3.imprime();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax12.refaz((int) '4', 0);
        fPHeapMax12.imprime();
        fPHeapMax12.refaz((int) (byte) 100, 0);
        ds.Item item20 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item23 = fPHeapMax22.max();
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax28.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax31.copia(itemArray39);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax43.constroi();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax43.copia(itemArray51);
        fPHeapMax31.copia(itemArray51);
        fPHeapMax28.copia(itemArray51);
        fPHeapMax26.copia(itemArray51);
        fPHeapMax22.copia(itemArray51);
        fPHeapMax12.copia(itemArray51);
        fPHeapMax3.copia(itemArray51);
        fPHeapMax1.copia(itemArray51);
        java.lang.Class<?> wildcardClass61 = itemArray51.getClass();
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0753");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.refaz((int) '#', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item30 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0754");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) '#', 10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0755");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) 'a', (int) (short) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray23);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray37);
        fPHeapMax12.copia(itemArray37);
        fPHeapMax12.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) fPHeapMax12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0756");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) 'a');
        ds.Item item8 = fPHeapMax7.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax14.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item26 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0757");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz(1, 0);
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.imprime();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        fPHeapMax10.refaz(0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0758");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax19.copia(itemArray27);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax31.copia(itemArray39);
        fPHeapMax19.copia(itemArray39);
        fPHeapMax16.copia(itemArray39);
        fPHeapMax10.copia(itemArray39);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax46.imprime();
        fPHeapMax46.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax50.copia(itemArray58);
        fPHeapMax46.copia(itemArray58);
        fPHeapMax10.copia(itemArray58);
        fPHeapMax1.copia(itemArray58);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0759");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.Item item25 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax29.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax32.copia(itemArray40);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax44.copia(itemArray52);
        fPHeapMax32.copia(itemArray52);
        fPHeapMax29.copia(itemArray52);
        fPHeapMax27.copia(itemArray52);
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax60.constroi();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        fPHeapMax60.copia(itemArray65);
        fPHeapMax27.copia(itemArray65);
        fPHeapMax1.copia(itemArray65);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item71 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray65);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0760");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass9 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0761");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0762");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0763");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0764");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) 'a', (int) (short) 1);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax36.constroi();
        fPHeapMax36.constroi();
        fPHeapMax36.constroi();
        fPHeapMax36.constroi();
        fPHeapMax36.refaz((int) (byte) 10, (int) (byte) 1);
        ds.Item item44 = fPHeapMax36.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) fPHeapMax36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item44);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0765");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        ds.Item item9 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass10 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0766");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        ds.Item item10 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        fPHeapMax8.copia(itemArray20);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0767");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.refaz((int) ' ', 1);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item40 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0768");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass9 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0769");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax44.copia(itemArray49);
        fPHeapMax11.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        ds.Item item54 = fPHeapMax1.max();
        ds.Item item55 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item54);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0770");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax19.copia(itemArray27);
        fPHeapMax7.copia(itemArray27);
        fPHeapMax4.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax36.refaz((int) '4', 0);
        fPHeapMax36.imprime();
        fPHeapMax36.imprime();
        fPHeapMax36.constroi();
        fPHeapMax36.imprime();
        fPHeapMax36.imprime();
        fPHeapMax36.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) fPHeapMax36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0771");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) 'a');
        ds.Item item6 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax12.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax5.copia(itemArray17);
        fPHeapMax5.imprime();
        ds.Item item23 = fPHeapMax5.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0772");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) 'a', (int) (short) 1);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) ' ', 1);
        ds.Item item38 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0773");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax14.copia(itemArray22);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        fPHeapMax14.copia(itemArray34);
        fPHeapMax11.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        java.lang.Class<?> wildcardClass40 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0774");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0775");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.imprime();
        ds.Item item12 = fPHeapMax10.max();
        ds.Item item13 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        ds.Item item16 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        ds.Item item23 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax34.copia(itemArray42);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMax46.copia(itemArray48);
        fPHeapMax46.constroi();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        fPHeapMax52.copia(itemArray54);
        fPHeapMax46.copia(itemArray54);
        fPHeapMax34.copia(itemArray54);
        fPHeapMax31.copia(itemArray54);
        fPHeapMax26.copia(itemArray54);
        fPHeapMax18.copia(itemArray54);
        fPHeapMax10.copia(itemArray54);
        fPHeapMax1.copia(itemArray54);
        fPHeapMax1.imprime();
        ds.Item item64 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0776");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0777");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item20 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax22.constroi();
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        fPHeapMax22.copia(itemArray34);
        fPHeapMax22.constroi();
        ds.Item item39 = fPHeapMax22.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax41.refaz((int) '4', 0);
        fPHeapMax41.imprime();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax41.copia(itemArray49);
        fPHeapMax41.imprime();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax54.constroi();
        fPHeapMax54.constroi();
        fPHeapMax54.constroi();
        fPHeapMax54.constroi();
        ds.Item item59 = fPHeapMax54.max();
        fPHeapMax54.imprime();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax62.constroi();
        fPHeapMax62.imprime();
        fPHeapMax62.imprime();
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax67.imprime();
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        fPHeapMax70.copia(itemArray72);
        fPHeapMax70.constroi();
        ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item77 = null;
        ds.Item[] itemArray78 = new ds.Item[] { item77 };
        fPHeapMax76.copia(itemArray78);
        fPHeapMax70.copia(itemArray78);
        ds.FPHeapMax fPHeapMax82 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item83 = null;
        ds.Item[] itemArray84 = new ds.Item[] { item83 };
        fPHeapMax82.copia(itemArray84);
        fPHeapMax82.constroi();
        ds.FPHeapMax fPHeapMax88 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item89 = null;
        ds.Item[] itemArray90 = new ds.Item[] { item89 };
        fPHeapMax88.copia(itemArray90);
        fPHeapMax82.copia(itemArray90);
        fPHeapMax70.copia(itemArray90);
        fPHeapMax67.copia(itemArray90);
        fPHeapMax62.copia(itemArray90);
        fPHeapMax54.copia(itemArray90);
        fPHeapMax41.copia(itemArray90);
        fPHeapMax22.copia(itemArray90);
        fPHeapMax1.copia(itemArray90);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(itemArray78);
        org.junit.Assert.assertNotNull(itemArray84);
        org.junit.Assert.assertNotNull(itemArray90);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0778");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, (int) (byte) 1);
        ds.Item item9 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax44.imprime();
        ds.Item item46 = fPHeapMax44.max();
        ds.Item item47 = fPHeapMax44.max();
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item54 = null;
        ds.Item[] itemArray55 = new ds.Item[] { item54 };
        fPHeapMax53.copia(itemArray55);
        fPHeapMax53.constroi();
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMax59.copia(itemArray61);
        fPHeapMax53.copia(itemArray61);
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item66 = null;
        ds.Item[] itemArray67 = new ds.Item[] { item66 };
        fPHeapMax65.copia(itemArray67);
        fPHeapMax65.constroi();
        ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item72 = null;
        ds.Item[] itemArray73 = new ds.Item[] { item72 };
        fPHeapMax71.copia(itemArray73);
        fPHeapMax65.copia(itemArray73);
        fPHeapMax53.copia(itemArray73);
        fPHeapMax50.copia(itemArray73);
        fPHeapMax44.copia(itemArray73);
        fPHeapMax11.copia(itemArray73);
        fPHeapMax1.copia(itemArray73);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item81 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray73);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0779");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0780");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0781");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.Item item25 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item27 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.imprime();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax38.constroi();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax38.copia(itemArray46);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax50.copia(itemArray58);
        fPHeapMax38.copia(itemArray58);
        fPHeapMax35.copia(itemArray58);
        fPHeapMax29.copia(itemArray58);
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax65.imprime();
        fPHeapMax65.constroi();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item70 = null;
        ds.Item[] itemArray71 = new ds.Item[] { item70 };
        fPHeapMax69.copia(itemArray71);
        fPHeapMax69.constroi();
        ds.FPHeapMax fPHeapMax75 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item76 = null;
        ds.Item[] itemArray77 = new ds.Item[] { item76 };
        fPHeapMax75.copia(itemArray77);
        fPHeapMax69.copia(itemArray77);
        fPHeapMax65.copia(itemArray77);
        fPHeapMax29.copia(itemArray77);
        fPHeapMax1.copia(itemArray77);
        java.lang.Class<?> wildcardClass83 = itemArray77.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray77);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0782");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        ds.Item item43 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNull(item43);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0783");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        java.lang.Class<?> wildcardClass43 = itemArray36.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0784");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item item12 = fPHeapMax1.max();
        ds.Item[] itemArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0785");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax36.constroi();
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax40.constroi();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax43.constroi();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax43.copia(itemArray51);
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray54);
        fPHeapMax40.copia(itemArray54);
        fPHeapMax36.copia(itemArray54);
        fPHeapMax1.copia(itemArray54);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0786");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.Item item34 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item35 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item34);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0787");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass5 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0788");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
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
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0789");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0790");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0791");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax32.copia(itemArray40);
        fPHeapMax20.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        ds.Item item45 = fPHeapMax1.max();
        fPHeapMax1.refaz(100, (int) ' ');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax52.imprime();
        ds.Item item54 = fPHeapMax52.max();
        ds.Item item55 = fPHeapMax52.max();
        ds.Item item56 = fPHeapMax52.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) item56);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNull(item56);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0792");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.refaz(100, 100);
        fPHeapMax1.refaz((int) (short) 100, (int) ' ');
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.imprime();
        fPHeapMax12.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax21.imprime();
        ds.Item item23 = fPHeapMax21.max();
        ds.Item item24 = fPHeapMax21.max();
        fPHeapMax21.imprime();
        fPHeapMax21.constroi();
        ds.Item item27 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax29.constroi();
        fPHeapMax29.constroi();
        fPHeapMax29.constroi();
        fPHeapMax29.constroi();
        ds.Item item34 = fPHeapMax29.max();
        fPHeapMax29.imprime();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax37.constroi();
        fPHeapMax37.imprime();
        fPHeapMax37.imprime();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMax45.copia(itemArray47);
        fPHeapMax45.constroi();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        fPHeapMax45.copia(itemArray53);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        fPHeapMax57.constroi();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        fPHeapMax57.copia(itemArray65);
        fPHeapMax45.copia(itemArray65);
        fPHeapMax42.copia(itemArray65);
        fPHeapMax37.copia(itemArray65);
        fPHeapMax29.copia(itemArray65);
        fPHeapMax21.copia(itemArray65);
        fPHeapMax12.copia(itemArray65);
        fPHeapMax1.copia(itemArray65);
        ds.Item item75 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray65);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0793");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item16 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) '4', (int) (byte) 10);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0794");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax11.imprime();
        ds.Item item13 = fPHeapMax11.max();
        ds.Item item14 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax32.copia(itemArray40);
        fPHeapMax20.copia(itemArray40);
        fPHeapMax17.copia(itemArray40);
        fPHeapMax11.copia(itemArray40);
        fPHeapMax9.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        ds.Item item48 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0795");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        ds.Item item9 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0796");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray17);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray31);
        fPHeapMax6.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass36 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0797");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass17 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0798");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass11 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0799");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax25.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax25.copia(itemArray33);
        fPHeapMax13.copia(itemArray33);
        fPHeapMax10.copia(itemArray33);
        fPHeapMax8.copia(itemArray33);
        fPHeapMax8.imprime();
        ds.Item item40 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax42.constroi();
        fPHeapMax42.constroi();
        fPHeapMax42.constroi();
        fPHeapMax42.constroi();
        ds.Item item47 = fPHeapMax42.max();
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax50.constroi();
        fPHeapMax50.imprime();
        fPHeapMax50.imprime();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax55.imprime();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMax58.copia(itemArray60);
        fPHeapMax58.constroi();
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        fPHeapMax64.copia(itemArray66);
        fPHeapMax58.copia(itemArray66);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        fPHeapMax70.copia(itemArray72);
        fPHeapMax70.constroi();
        ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item77 = null;
        ds.Item[] itemArray78 = new ds.Item[] { item77 };
        fPHeapMax76.copia(itemArray78);
        fPHeapMax70.copia(itemArray78);
        fPHeapMax58.copia(itemArray78);
        fPHeapMax55.copia(itemArray78);
        fPHeapMax50.copia(itemArray78);
        fPHeapMax42.copia(itemArray78);
        fPHeapMax8.copia(itemArray78);
        fPHeapMax1.copia(itemArray78);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item87 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(itemArray78);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0800");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0801");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax7.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax19.copia(itemArray27);
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray30);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax33.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax33.copia(itemArray41);
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMax33.copia(itemArray44);
        fPHeapMax19.copia(itemArray44);
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        fPHeapMax54.constroi();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMax60.copia(itemArray62);
        fPHeapMax54.copia(itemArray62);
        ds.Item[] itemArray65 = new ds.Item[] {};
        fPHeapMax54.copia(itemArray65);
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item69 = null;
        ds.Item[] itemArray70 = new ds.Item[] { item69 };
        fPHeapMax68.copia(itemArray70);
        fPHeapMax68.constroi();
        ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item75 = null;
        ds.Item[] itemArray76 = new ds.Item[] { item75 };
        fPHeapMax74.copia(itemArray76);
        fPHeapMax68.copia(itemArray76);
        ds.Item[] itemArray79 = new ds.Item[] {};
        fPHeapMax68.copia(itemArray79);
        fPHeapMax54.copia(itemArray79);
        fPHeapMax49.copia(itemArray79);
        fPHeapMax19.copia(itemArray79);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) itemArray79);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNotNull(itemArray79);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0802");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) 'a');
        ds.Item item8 = fPHeapMax7.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax14.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        ds.Item item26 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass27 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0803");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, 1);
        fPHeapMax1.refaz((int) (byte) 100, 100);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0804");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        fPHeapMax4.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item36 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0805");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0806");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
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
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0807");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax10.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax5.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item40 = fPHeapMax39.max();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item43 = fPHeapMax42.max();
        fPHeapMax42.constroi();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax48.imprime();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        fPHeapMax51.constroi();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        fPHeapMax51.copia(itemArray59);
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        fPHeapMax63.constroi();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item70 = null;
        ds.Item[] itemArray71 = new ds.Item[] { item70 };
        fPHeapMax69.copia(itemArray71);
        fPHeapMax63.copia(itemArray71);
        fPHeapMax51.copia(itemArray71);
        fPHeapMax48.copia(itemArray71);
        fPHeapMax46.copia(itemArray71);
        fPHeapMax42.copia(itemArray71);
        fPHeapMax39.copia(itemArray71);
        fPHeapMax1.copia(itemArray71);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray71);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0808");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0809");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.Item item25 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax27.imprime();
        ds.Item item29 = fPHeapMax27.max();
        ds.Item item30 = fPHeapMax27.max();
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax33.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax36.copia(itemArray44);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax48.constroi();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        fPHeapMax48.copia(itemArray56);
        fPHeapMax36.copia(itemArray56);
        fPHeapMax33.copia(itemArray56);
        fPHeapMax27.copia(itemArray56);
        fPHeapMax1.copia(itemArray56);
        java.lang.Class<?> wildcardClass63 = itemArray56.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0810");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
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
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0811");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax4.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0812");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item11 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.Item item15 = fPHeapMax13.max();
        ds.Item item16 = fPHeapMax13.max();
        fPHeapMax13.refaz((int) 'a', (int) (short) 10);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item23 = fPHeapMax22.max();
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax28.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax31.copia(itemArray39);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax43.constroi();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax43.copia(itemArray51);
        fPHeapMax31.copia(itemArray51);
        fPHeapMax28.copia(itemArray51);
        fPHeapMax26.copia(itemArray51);
        fPHeapMax22.copia(itemArray51);
        fPHeapMax13.copia(itemArray51);
        fPHeapMax1.copia(itemArray51);
        ds.Item item60 = fPHeapMax1.max();
        fPHeapMax1.refaz(1, (-1));
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNull(item60);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0813");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax33.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax33.copia(itemArray41);
        fPHeapMax21.copia(itemArray41);
        fPHeapMax18.copia(itemArray41);
        fPHeapMax11.copia(itemArray41);
        fPHeapMax1.copia(itemArray41);
        fPHeapMax1.imprime();
        ds.Item item49 = fPHeapMax1.max();
        ds.Item item50 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNull(item49);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0814");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item9 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax12.imprime();
        ds.Item item14 = fPHeapMax12.max();
        ds.Item item15 = fPHeapMax12.max();
        fPHeapMax12.refaz((int) 'a', (int) (short) 10);
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0815");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.imprime();
        ds.Item item12 = fPHeapMax10.max();
        ds.Item item13 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        ds.Item item16 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        ds.Item item23 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax34.copia(itemArray42);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMax46.copia(itemArray48);
        fPHeapMax46.constroi();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        fPHeapMax52.copia(itemArray54);
        fPHeapMax46.copia(itemArray54);
        fPHeapMax34.copia(itemArray54);
        fPHeapMax31.copia(itemArray54);
        fPHeapMax26.copia(itemArray54);
        fPHeapMax18.copia(itemArray54);
        fPHeapMax10.copia(itemArray54);
        fPHeapMax1.copia(itemArray54);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax66.constroi();
        fPHeapMax66.imprime();
        fPHeapMax66.constroi();
        fPHeapMax66.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) fPHeapMax66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0816");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(100, 0);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass53 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0817");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) 'a', (int) (short) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item11 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0818");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.imprime();
        ds.Item item48 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (short) 100, (int) ' ');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax54.constroi();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        fPHeapMax54.copia(itemArray59);
        fPHeapMax54.imprime();
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax66.imprime();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item70 = null;
        ds.Item[] itemArray71 = new ds.Item[] { item70 };
        fPHeapMax69.copia(itemArray71);
        fPHeapMax69.constroi();
        ds.FPHeapMax fPHeapMax75 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item76 = null;
        ds.Item[] itemArray77 = new ds.Item[] { item76 };
        fPHeapMax75.copia(itemArray77);
        fPHeapMax69.copia(itemArray77);
        ds.FPHeapMax fPHeapMax81 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item82 = null;
        ds.Item[] itemArray83 = new ds.Item[] { item82 };
        fPHeapMax81.copia(itemArray83);
        fPHeapMax81.constroi();
        ds.FPHeapMax fPHeapMax87 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item88 = null;
        ds.Item[] itemArray89 = new ds.Item[] { item88 };
        fPHeapMax87.copia(itemArray89);
        fPHeapMax81.copia(itemArray89);
        fPHeapMax69.copia(itemArray89);
        fPHeapMax66.copia(itemArray89);
        fPHeapMax64.copia(itemArray89);
        fPHeapMax54.copia(itemArray89);
        fPHeapMax1.copia(itemArray89);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray77);
        org.junit.Assert.assertNotNull(itemArray83);
        org.junit.Assert.assertNotNull(itemArray89);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0819");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.refaz(10, 10);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax19.imprime();
        ds.Item item21 = fPHeapMax19.max();
        ds.Item item22 = fPHeapMax19.max();
        ds.Item item23 = fPHeapMax19.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax25.imprime();
        fPHeapMax25.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax34.imprime();
        ds.Item item36 = fPHeapMax34.max();
        ds.Item item37 = fPHeapMax34.max();
        fPHeapMax34.imprime();
        fPHeapMax34.constroi();
        ds.Item item40 = fPHeapMax34.max();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax42.constroi();
        fPHeapMax42.constroi();
        fPHeapMax42.constroi();
        fPHeapMax42.constroi();
        ds.Item item47 = fPHeapMax42.max();
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax50.constroi();
        fPHeapMax50.imprime();
        fPHeapMax50.imprime();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax55.imprime();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMax58.copia(itemArray60);
        fPHeapMax58.constroi();
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        fPHeapMax64.copia(itemArray66);
        fPHeapMax58.copia(itemArray66);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        fPHeapMax70.copia(itemArray72);
        fPHeapMax70.constroi();
        ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item77 = null;
        ds.Item[] itemArray78 = new ds.Item[] { item77 };
        fPHeapMax76.copia(itemArray78);
        fPHeapMax70.copia(itemArray78);
        fPHeapMax58.copia(itemArray78);
        fPHeapMax55.copia(itemArray78);
        fPHeapMax50.copia(itemArray78);
        fPHeapMax42.copia(itemArray78);
        fPHeapMax34.copia(itemArray78);
        fPHeapMax25.copia(itemArray78);
        fPHeapMax19.copia(itemArray78);
        fPHeapMax1.copia(itemArray78);
        java.lang.Class<?> wildcardClass89 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(itemArray78);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0820");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.refaz((int) ' ', (-1));
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0821");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        fPHeapMax7.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        ds.Item item44 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0822");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) 'a');
        ds.Item item8 = fPHeapMax7.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax14.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item25 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0823");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        ds.Item item15 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item17 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0824");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.imprime();
        ds.Item item48 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (short) 100, (int) ' ');
        java.lang.Class<?> wildcardClass52 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0825");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        ds.Item item15 = fPHeapMax1.max();
        fPHeapMax1.refaz(10, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0826");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 10, 10);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        fPHeapMax17.copia(itemArray37);
        fPHeapMax14.copia(itemArray37);
        fPHeapMax12.copia(itemArray37);
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax45.imprime();
        ds.Item item47 = fPHeapMax45.max();
        ds.Item item48 = fPHeapMax45.max();
        fPHeapMax45.constroi();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax51.constroi();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        fPHeapMax54.constroi();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMax60.copia(itemArray62);
        fPHeapMax54.copia(itemArray62);
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item67 = null;
        ds.Item[] itemArray68 = new ds.Item[] { item67 };
        fPHeapMax66.copia(itemArray68);
        fPHeapMax66.constroi();
        ds.FPHeapMax fPHeapMax72 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item73 = null;
        ds.Item[] itemArray74 = new ds.Item[] { item73 };
        fPHeapMax72.copia(itemArray74);
        fPHeapMax66.copia(itemArray74);
        fPHeapMax54.copia(itemArray74);
        fPHeapMax51.copia(itemArray74);
        fPHeapMax45.copia(itemArray74);
        fPHeapMax12.copia(itemArray74);
        fPHeapMax1.copia(itemArray74);
        fPHeapMax1.refaz((int) (short) 10, (-1));
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray74);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0827");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        ds.Item item19 = fPHeapMax14.max();
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax22.constroi();
        fPHeapMax22.imprime();
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax30.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax30.copia(itemArray38);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax42.constroi();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax42.copia(itemArray50);
        fPHeapMax30.copia(itemArray50);
        fPHeapMax27.copia(itemArray50);
        fPHeapMax22.copia(itemArray50);
        fPHeapMax14.copia(itemArray50);
        fPHeapMax1.copia(itemArray50);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax(0);
        fPHeapMax61.imprime();
        fPHeapMax61.imprime();
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax65.constroi();
        ds.Item item67 = fPHeapMax65.max();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item70 = null;
        ds.Item[] itemArray71 = new ds.Item[] { item70 };
        fPHeapMax69.copia(itemArray71);
        fPHeapMax69.constroi();
        ds.FPHeapMax fPHeapMax75 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item76 = null;
        ds.Item[] itemArray77 = new ds.Item[] { item76 };
        fPHeapMax75.copia(itemArray77);
        fPHeapMax69.copia(itemArray77);
        fPHeapMax65.copia(itemArray77);
        fPHeapMax61.copia(itemArray77);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) itemArray77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNull(item67);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray77);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0828");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        fPHeapMax17.copia(itemArray37);
        fPHeapMax14.copia(itemArray37);
        fPHeapMax9.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        fPHeapMax1.imprime();
        ds.Item item45 = fPHeapMax1.max();
        ds.Item item46 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item47 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNull(item46);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0829");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item item12 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass14 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0830");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 100, (int) (short) 100);
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0831");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.Item item25 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax27.imprime();
        ds.Item item29 = fPHeapMax27.max();
        ds.Item item30 = fPHeapMax27.max();
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax33.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax36.copia(itemArray44);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax48.constroi();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        fPHeapMax48.copia(itemArray56);
        fPHeapMax36.copia(itemArray56);
        fPHeapMax33.copia(itemArray56);
        fPHeapMax27.copia(itemArray56);
        fPHeapMax1.copia(itemArray56);
        ds.Item item63 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray56);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0832");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, (int) (byte) 1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass11 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0833");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax14.copia(itemArray22);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        fPHeapMax14.copia(itemArray34);
        fPHeapMax11.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        ds.Item item40 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0834");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 100, (int) (short) 1);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0835");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.Item item34 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item34);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0836");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) 'a', (int) (short) 10);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.constroi();
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0837");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item43 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0838");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) 'a');
        ds.Item item8 = fPHeapMax7.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax14.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.Item item25 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item26 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0839");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz(1, 0);
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0840");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        ds.Item item14 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        ds.Item item16 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(1);
        ds.Item item19 = fPHeapMax18.max();
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray20);
        fPHeapMax8.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.constroi();
        fPHeapMax26.constroi();
        fPHeapMax26.constroi();
        fPHeapMax26.constroi();
        fPHeapMax26.refaz((int) (byte) 10, (int) (byte) 1);
        fPHeapMax26.constroi();
        ds.Item item35 = fPHeapMax26.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) item35);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item35);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0841");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax10.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax5.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax40.constroi();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMax46.copia(itemArray48);
        fPHeapMax40.copia(itemArray48);
        ds.Item[] itemArray51 = new ds.Item[] {};
        fPHeapMax40.copia(itemArray51);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        fPHeapMax54.constroi();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMax60.copia(itemArray62);
        fPHeapMax54.copia(itemArray62);
        ds.Item[] itemArray65 = new ds.Item[] {};
        fPHeapMax54.copia(itemArray65);
        fPHeapMax40.copia(itemArray65);
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item70 = null;
        ds.Item[] itemArray71 = new ds.Item[] { item70 };
        fPHeapMax69.copia(itemArray71);
        fPHeapMax40.copia(itemArray71);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray71);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0842");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(1, (int) (short) 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax25.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax25.copia(itemArray33);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray36);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax39.constroi();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMax45.copia(itemArray47);
        fPHeapMax39.copia(itemArray47);
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray50);
        fPHeapMax25.copia(itemArray50);
        fPHeapMax25.imprime();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMax60.copia(itemArray62);
        fPHeapMax60.constroi();
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item67 = null;
        ds.Item[] itemArray68 = new ds.Item[] { item67 };
        fPHeapMax66.copia(itemArray68);
        fPHeapMax60.copia(itemArray68);
        ds.Item[] itemArray71 = new ds.Item[] {};
        fPHeapMax60.copia(itemArray71);
        ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item75 = null;
        ds.Item[] itemArray76 = new ds.Item[] { item75 };
        fPHeapMax74.copia(itemArray76);
        fPHeapMax74.constroi();
        ds.FPHeapMax fPHeapMax80 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item81 = null;
        ds.Item[] itemArray82 = new ds.Item[] { item81 };
        fPHeapMax80.copia(itemArray82);
        fPHeapMax74.copia(itemArray82);
        ds.Item[] itemArray85 = new ds.Item[] {};
        fPHeapMax74.copia(itemArray85);
        fPHeapMax60.copia(itemArray85);
        fPHeapMax55.copia(itemArray85);
        fPHeapMax25.copia(itemArray85);
        fPHeapMax25.refaz((int) (byte) 1, (int) (short) 1);
        fPHeapMax25.refaz((int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNotNull(itemArray82);
        org.junit.Assert.assertNotNull(itemArray85);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0843");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz(1, 0);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        fPHeapMax8.copia(itemArray20);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) itemArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0844");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0845");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax34.copia(itemArray39);
        fPHeapMax1.copia(itemArray39);
        ds.Item item43 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNull(item43);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0846");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax23.copia(itemArray31);
        fPHeapMax11.copia(itemArray31);
        fPHeapMax8.copia(itemArray31);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) fPHeapMax8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0847");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax51.imprime();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        fPHeapMax54.constroi();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMax60.copia(itemArray62);
        fPHeapMax54.copia(itemArray62);
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item67 = null;
        ds.Item[] itemArray68 = new ds.Item[] { item67 };
        fPHeapMax66.copia(itemArray68);
        fPHeapMax66.constroi();
        ds.FPHeapMax fPHeapMax72 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item73 = null;
        ds.Item[] itemArray74 = new ds.Item[] { item73 };
        fPHeapMax72.copia(itemArray74);
        fPHeapMax66.copia(itemArray74);
        fPHeapMax54.copia(itemArray74);
        fPHeapMax51.copia(itemArray74);
        fPHeapMax49.copia(itemArray74);
        fPHeapMax1.copia(itemArray74);
        fPHeapMax1.imprime();
        ds.Item item82 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray74);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0848");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        ds.Item item20 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 100, (int) (byte) 100);
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0849");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.Item item25 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax27.imprime();
        ds.Item item29 = fPHeapMax27.max();
        ds.Item item30 = fPHeapMax27.max();
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax33.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax36.copia(itemArray44);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax48.constroi();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        fPHeapMax48.copia(itemArray56);
        fPHeapMax36.copia(itemArray56);
        fPHeapMax33.copia(itemArray56);
        fPHeapMax27.copia(itemArray56);
        fPHeapMax1.copia(itemArray56);
        fPHeapMax1.refaz((int) (short) 1, (int) (byte) 1);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray56);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0850");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.refaz(10, 10);
        ds.Item item18 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax21.refaz((int) '4', 0);
        fPHeapMax21.imprime();
        fPHeapMax21.imprime();
        fPHeapMax21.constroi();
        fPHeapMax21.imprime();
        fPHeapMax21.imprime();
        fPHeapMax21.constroi();
        ds.Item item31 = fPHeapMax21.max();
        fPHeapMax21.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) fPHeapMax21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item31);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0851");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.Item item34 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax36.constroi();
        fPHeapMax36.imprime();
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax41.constroi();
        fPHeapMax41.constroi();
        fPHeapMax41.constroi();
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax47.refaz((int) '4', 0);
        fPHeapMax47.imprime();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item54 = null;
        ds.Item[] itemArray55 = new ds.Item[] { item54 };
        fPHeapMax53.copia(itemArray55);
        fPHeapMax47.copia(itemArray55);
        fPHeapMax41.copia(itemArray55);
        fPHeapMax36.copia(itemArray55);
        fPHeapMax1.copia(itemArray55);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass62 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0852");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 10, 10);
        fPHeapMax1.refaz((int) 'a', (-1));
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0853");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.refaz((int) '4', 0);
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax22.constroi();
        fPHeapMax22.constroi();
        fPHeapMax22.constroi();
        fPHeapMax22.constroi();
        ds.Item item27 = fPHeapMax22.max();
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax30.constroi();
        fPHeapMax30.imprime();
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax38.constroi();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax38.copia(itemArray46);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax50.copia(itemArray58);
        fPHeapMax38.copia(itemArray58);
        fPHeapMax35.copia(itemArray58);
        fPHeapMax30.copia(itemArray58);
        fPHeapMax22.copia(itemArray58);
        fPHeapMax9.copia(itemArray58);
        fPHeapMax1.copia(itemArray58);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0854");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        ds.Item item19 = fPHeapMax14.max();
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax22.constroi();
        fPHeapMax22.imprime();
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax30.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax30.copia(itemArray38);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax42.constroi();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax42.copia(itemArray50);
        fPHeapMax30.copia(itemArray50);
        fPHeapMax27.copia(itemArray50);
        fPHeapMax22.copia(itemArray50);
        fPHeapMax14.copia(itemArray50);
        fPHeapMax1.copia(itemArray50);
        fPHeapMax1.constroi();
        ds.Item item59 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0855");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax10.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item37 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0856");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) 'a', (int) (short) 10);
        fPHeapMax1.constroi();
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
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0857");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) 'a', (int) (short) 1);
        fPHeapMax1.refaz((int) 'a', (int) (short) 10);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0858");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass4 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0859");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        ds.Item item19 = fPHeapMax14.max();
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax22.constroi();
        fPHeapMax22.imprime();
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax30.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax30.copia(itemArray38);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax42.constroi();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax42.copia(itemArray50);
        fPHeapMax30.copia(itemArray50);
        fPHeapMax27.copia(itemArray50);
        fPHeapMax22.copia(itemArray50);
        fPHeapMax14.copia(itemArray50);
        fPHeapMax1.copia(itemArray50);
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0860");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0861");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass10 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0862");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz(1, 0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 1, (int) (short) -1);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0863");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0864");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray17);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray31);
        fPHeapMax6.copia(itemArray31);
        ds.Item item34 = fPHeapMax6.max();
        fPHeapMax6.refaz((int) '4', (int) ' ');
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax44.copia(itemArray52);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax56.constroi();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMax62.copia(itemArray64);
        fPHeapMax56.copia(itemArray64);
        fPHeapMax44.copia(itemArray64);
        fPHeapMax41.copia(itemArray64);
        fPHeapMax39.copia(itemArray64);
        fPHeapMax6.copia(itemArray64);
        fPHeapMax1.copia(itemArray64);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray64);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0865");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax17.copia(itemArray22);
        fPHeapMax13.copia(itemArray22);
        fPHeapMax11.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        java.lang.Class<?> wildcardClass28 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0866");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.imprime();
        ds.Item item12 = fPHeapMax10.max();
        ds.Item item13 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        ds.Item item16 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        ds.Item item23 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax34.copia(itemArray42);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMax46.copia(itemArray48);
        fPHeapMax46.constroi();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        fPHeapMax52.copia(itemArray54);
        fPHeapMax46.copia(itemArray54);
        fPHeapMax34.copia(itemArray54);
        fPHeapMax31.copia(itemArray54);
        fPHeapMax26.copia(itemArray54);
        fPHeapMax18.copia(itemArray54);
        fPHeapMax10.copia(itemArray54);
        fPHeapMax1.copia(itemArray54);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0867");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.Item item19 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item22 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass24 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0868");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) '#', (int) '#');
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0869");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax4.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) '#', 0);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0870");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0871");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.refaz((int) '4', 0);
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax15.constroi();
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax19.copia(itemArray27);
        fPHeapMax15.copia(itemArray27);
        fPHeapMax9.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        ds.Item item33 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0872");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax44.copia(itemArray49);
        fPHeapMax11.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        fPHeapMax1.imprime();
        ds.Item item55 = fPHeapMax1.max();
        ds.Item item56 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNull(item56);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0873");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.refaz((int) ' ', 1);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass40 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0874");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, (int) (byte) 1);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax15.refaz((int) '4', 0);
        fPHeapMax15.imprime();
        fPHeapMax15.refaz((int) (byte) 100, 0);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax27.constroi();
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax31.copia(itemArray36);
        fPHeapMax27.copia(itemArray36);
        fPHeapMax25.copia(itemArray36);
        fPHeapMax15.copia(itemArray36);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0875");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) '4', (int) ' ');
        fPHeapMax1.constroi();
        ds.Item item34 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax37.imprime();
        ds.Item item39 = fPHeapMax37.max();
        ds.Item item40 = fPHeapMax37.max();
        fPHeapMax37.refaz((int) 'a', (int) (short) 10);
        fPHeapMax37.constroi();
        fPHeapMax37.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) fPHeapMax37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item40);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0876");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        ds.Item item33 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item36 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item33);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0877");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        fPHeapMax1.refaz((int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0878");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax4.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass30 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0879");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.refaz((int) (byte) 10, (-1));
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item28 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0880");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray24);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax27.copia(itemArray35);
        ds.Item[] itemArray38 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray38);
        fPHeapMax13.copia(itemArray38);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax13.copia(itemArray44);
        fPHeapMax1.copia(itemArray44);
        fPHeapMax1.refaz((int) (byte) 10, 1);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item53 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0881");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0882");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass10 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0883");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0884");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        fPHeapMax4.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0885");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz(1, 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax7.imprime();
        fPHeapMax7.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax16.imprime();
        ds.Item item18 = fPHeapMax16.max();
        ds.Item item19 = fPHeapMax16.max();
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        ds.Item item22 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax24.constroi();
        fPHeapMax24.constroi();
        fPHeapMax24.constroi();
        fPHeapMax24.constroi();
        ds.Item item29 = fPHeapMax24.max();
        fPHeapMax24.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax32.constroi();
        fPHeapMax32.imprime();
        fPHeapMax32.imprime();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax37.imprime();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax40.constroi();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMax46.copia(itemArray48);
        fPHeapMax40.copia(itemArray48);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        fPHeapMax52.copia(itemArray54);
        fPHeapMax52.constroi();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMax58.copia(itemArray60);
        fPHeapMax52.copia(itemArray60);
        fPHeapMax40.copia(itemArray60);
        fPHeapMax37.copia(itemArray60);
        fPHeapMax32.copia(itemArray60);
        fPHeapMax24.copia(itemArray60);
        fPHeapMax16.copia(itemArray60);
        fPHeapMax7.copia(itemArray60);
        fPHeapMax1.copia(itemArray60);
        java.lang.Class<?> wildcardClass70 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0886");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
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
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0887");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        ds.Item item15 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item17 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0888");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        fPHeapMax7.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        java.lang.Class<?> wildcardClass44 = itemArray36.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0889");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass6 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0890");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        ds.Item item15 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item17 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass18 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0891");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax4.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(1);
        ds.Item item33 = fPHeapMax32.max();
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray34);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) itemArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0892");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax17.copia(itemArray22);
        fPHeapMax13.copia(itemArray22);
        fPHeapMax11.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax31.constroi();
        fPHeapMax31.constroi();
        fPHeapMax31.constroi();
        fPHeapMax31.constroi();
        ds.Item item36 = fPHeapMax31.max();
        fPHeapMax31.constroi();
        java.lang.Class<?> wildcardClass38 = fPHeapMax31.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) wildcardClass38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0893");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax7.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        fPHeapMax3.copia(itemArray25);
        fPHeapMax1.copia(itemArray25);
        java.lang.Class<?> wildcardClass30 = itemArray25.getClass();
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0894");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        ds.Item item9 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item12 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax20.copia(itemArray28);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax32.copia(itemArray40);
        fPHeapMax20.copia(itemArray40);
        fPHeapMax17.copia(itemArray40);
        fPHeapMax15.copia(itemArray40);
        fPHeapMax11.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        ds.Item item48 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        fPHeapMax52.copia(itemArray54);
        fPHeapMax52.constroi();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMax58.copia(itemArray60);
        fPHeapMax52.copia(itemArray60);
        ds.Item[] itemArray63 = new ds.Item[] {};
        fPHeapMax52.copia(itemArray63);
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item67 = null;
        ds.Item[] itemArray68 = new ds.Item[] { item67 };
        fPHeapMax66.copia(itemArray68);
        fPHeapMax66.constroi();
        ds.FPHeapMax fPHeapMax72 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item73 = null;
        ds.Item[] itemArray74 = new ds.Item[] { item73 };
        fPHeapMax72.copia(itemArray74);
        fPHeapMax66.copia(itemArray74);
        ds.Item[] itemArray77 = new ds.Item[] {};
        fPHeapMax66.copia(itemArray77);
        fPHeapMax52.copia(itemArray77);
        ds.FPHeapMax fPHeapMax81 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item82 = null;
        ds.Item[] itemArray83 = new ds.Item[] { item82 };
        fPHeapMax81.copia(itemArray83);
        fPHeapMax52.copia(itemArray83);
        fPHeapMax52.refaz((int) ' ', 1);
        fPHeapMax52.imprime();
        fPHeapMax52.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) fPHeapMax52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray77);
        org.junit.Assert.assertNotNull(itemArray83);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0895");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, 10);
        fPHeapMax1.constroi();
        ds.Item item35 = fPHeapMax1.max();
        ds.Item item36 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item35);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0896");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) 'a', (int) (byte) 100);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0897");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        fPHeapMax7.refaz((int) (byte) 100, 0);
        fPHeapMax7.imprime();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray29);
        fPHeapMax7.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.constroi();
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax39.constroi();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMax45.copia(itemArray47);
        fPHeapMax39.copia(itemArray47);
        fPHeapMax35.copia(itemArray47);
        fPHeapMax35.imprime();
        fPHeapMax35.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) fPHeapMax35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0898");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.imprime();
        ds.Item item12 = fPHeapMax10.max();
        ds.Item item13 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        ds.Item item16 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        ds.Item item23 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax34.copia(itemArray42);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMax46.copia(itemArray48);
        fPHeapMax46.constroi();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        fPHeapMax52.copia(itemArray54);
        fPHeapMax46.copia(itemArray54);
        fPHeapMax34.copia(itemArray54);
        fPHeapMax31.copia(itemArray54);
        fPHeapMax26.copia(itemArray54);
        fPHeapMax18.copia(itemArray54);
        fPHeapMax10.copia(itemArray54);
        fPHeapMax1.copia(itemArray54);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass64 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0899");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        java.lang.Class<?> wildcardClass23 = itemArray19.getClass();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0900");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) 'a', (int) (short) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0901");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, 10);
        ds.Item item34 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item37 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax40.constroi();
        fPHeapMax40.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax44.copia(itemArray52);
        fPHeapMax40.copia(itemArray52);
        fPHeapMax40.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) fPHeapMax40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray52);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0902");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.Item item25 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item27 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax29.copia(itemArray40);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax43.constroi();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax43.copia(itemArray51);
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray54);
        fPHeapMax29.copia(itemArray54);
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMax58.copia(itemArray60);
        fPHeapMax29.copia(itemArray60);
        fPHeapMax1.copia(itemArray60);
        ds.Item item64 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray60);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0903");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        fPHeapMax17.copia(itemArray37);
        fPHeapMax14.copia(itemArray37);
        fPHeapMax9.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        fPHeapMax1.imprime();
        ds.Item item45 = fPHeapMax1.max();
        fPHeapMax1.refaz(100, (int) (short) 10);
        java.lang.Class<?> wildcardClass49 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0904");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) 'a');
        ds.Item item8 = fPHeapMax7.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax14.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        ds.Item item26 = fPHeapMax1.max();
        ds.Item item27 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item28 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item27);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0905");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.Item item25 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax27.constroi();
        fPHeapMax27.imprime();
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax32.imprime();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax35.constroi();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax47.constroi();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item54 = null;
        ds.Item[] itemArray55 = new ds.Item[] { item54 };
        fPHeapMax53.copia(itemArray55);
        fPHeapMax47.copia(itemArray55);
        fPHeapMax35.copia(itemArray55);
        fPHeapMax32.copia(itemArray55);
        fPHeapMax27.copia(itemArray55);
        fPHeapMax1.copia(itemArray55);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) '4', (-1));
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray55);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0906");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.refaz((int) '4', 0);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax14.copia(itemArray22);
        fPHeapMax8.copia(itemArray22);
        fPHeapMax3.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        ds.Item item28 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item28);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0907");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.Item item18 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax22.imprime();
        ds.Item item24 = fPHeapMax22.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item27 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        fPHeapMax26.constroi();
        ds.Item item30 = fPHeapMax26.max();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item33 = fPHeapMax32.max();
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax38.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax41.copia(itemArray49);
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item54 = null;
        ds.Item[] itemArray55 = new ds.Item[] { item54 };
        fPHeapMax53.copia(itemArray55);
        fPHeapMax53.constroi();
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMax59.copia(itemArray61);
        fPHeapMax53.copia(itemArray61);
        fPHeapMax41.copia(itemArray61);
        fPHeapMax38.copia(itemArray61);
        fPHeapMax36.copia(itemArray61);
        fPHeapMax32.copia(itemArray61);
        fPHeapMax26.copia(itemArray61);
        fPHeapMax22.copia(itemArray61);
        ds.Item item70 = fPHeapMax22.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNull(item70);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0908");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax24.constroi();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax24.copia(itemArray32);
        fPHeapMax12.copia(itemArray32);
        fPHeapMax9.copia(itemArray32);
        fPHeapMax3.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0909");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item29 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.refaz((int) '4', 0);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0910");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.Item item25 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item27 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax29.copia(itemArray40);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax43.constroi();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax43.copia(itemArray51);
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray54);
        fPHeapMax29.copia(itemArray54);
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMax58.copia(itemArray60);
        fPHeapMax29.copia(itemArray60);
        fPHeapMax1.copia(itemArray60);
        java.lang.Class<?> wildcardClass64 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0911");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0912");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0913");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, (int) ' ');
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) 'a');
        ds.Item item18 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax20.constroi();
        fPHeapMax20.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax24.constroi();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax24.copia(itemArray29);
        fPHeapMax20.copia(itemArray29);
        fPHeapMax17.copia(itemArray29);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax36.imprime();
        ds.Item item38 = fPHeapMax36.max();
        ds.Item item39 = fPHeapMax36.max();
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax42.constroi();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMax45.copia(itemArray47);
        fPHeapMax45.constroi();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        fPHeapMax45.copia(itemArray53);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        fPHeapMax57.constroi();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        fPHeapMax57.copia(itemArray65);
        fPHeapMax45.copia(itemArray65);
        fPHeapMax42.copia(itemArray65);
        fPHeapMax36.copia(itemArray65);
        fPHeapMax17.copia(itemArray65);
        ds.Item item72 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax76.constroi();
        fPHeapMax76.imprime();
        ds.FPHeapMax fPHeapMax80 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax80.constroi();
        ds.FPHeapMax fPHeapMax83 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item84 = null;
        ds.Item[] itemArray85 = new ds.Item[] { item84 };
        fPHeapMax83.copia(itemArray85);
        fPHeapMax80.copia(itemArray85);
        fPHeapMax76.copia(itemArray85);
        fPHeapMax74.copia(itemArray85);
        fPHeapMax17.copia(itemArray85);
        fPHeapMax1.copia(itemArray85);
        ds.Item item92 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNull(item72);
        org.junit.Assert.assertNotNull(itemArray85);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0914");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) 'a', (int) (short) 1);
        ds.Item item36 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax40.constroi();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax43.constroi();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax43.copia(itemArray51);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax55.constroi();
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        fPHeapMax61.copia(itemArray63);
        fPHeapMax55.copia(itemArray63);
        fPHeapMax43.copia(itemArray63);
        fPHeapMax40.copia(itemArray63);
        fPHeapMax38.copia(itemArray63);
        fPHeapMax1.copia(itemArray63);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray63);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0915");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        fPHeapMax7.refaz((int) (byte) 100, 0);
        fPHeapMax7.imprime();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray29);
        fPHeapMax7.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax34.imprime();
        fPHeapMax34.refaz(1, (int) (short) 0);
        ds.Item item39 = fPHeapMax34.max();
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax44.imprime();
        ds.Item item46 = fPHeapMax44.max();
        ds.Item item47 = fPHeapMax44.max();
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item54 = null;
        ds.Item[] itemArray55 = new ds.Item[] { item54 };
        fPHeapMax53.copia(itemArray55);
        fPHeapMax53.constroi();
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMax59.copia(itemArray61);
        fPHeapMax53.copia(itemArray61);
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item66 = null;
        ds.Item[] itemArray67 = new ds.Item[] { item66 };
        fPHeapMax65.copia(itemArray67);
        fPHeapMax65.constroi();
        ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item72 = null;
        ds.Item[] itemArray73 = new ds.Item[] { item72 };
        fPHeapMax71.copia(itemArray73);
        fPHeapMax65.copia(itemArray73);
        fPHeapMax53.copia(itemArray73);
        fPHeapMax50.copia(itemArray73);
        fPHeapMax44.copia(itemArray73);
        fPHeapMax42.copia(itemArray73);
        fPHeapMax34.copia(itemArray73);
        fPHeapMax1.copia(itemArray73);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray73);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0916");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(1, (int) (short) 0);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0917");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0918");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0919");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 100, (int) (short) 1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray19);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray33);
        fPHeapMax8.copia(itemArray33);
        ds.Item item36 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        fPHeapMax8.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax42.refaz((int) '4', 0);
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax42.copia(itemArray50);
        fPHeapMax8.copia(itemArray50);
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax59.imprime();
        ds.Item item61 = fPHeapMax59.max();
        ds.Item item62 = fPHeapMax59.max();
        fPHeapMax59.constroi();
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax65.constroi();
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item69 = null;
        ds.Item[] itemArray70 = new ds.Item[] { item69 };
        fPHeapMax68.copia(itemArray70);
        fPHeapMax68.constroi();
        ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item75 = null;
        ds.Item[] itemArray76 = new ds.Item[] { item75 };
        fPHeapMax74.copia(itemArray76);
        fPHeapMax68.copia(itemArray76);
        ds.FPHeapMax fPHeapMax80 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item81 = null;
        ds.Item[] itemArray82 = new ds.Item[] { item81 };
        fPHeapMax80.copia(itemArray82);
        fPHeapMax80.constroi();
        ds.FPHeapMax fPHeapMax86 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item87 = null;
        ds.Item[] itemArray88 = new ds.Item[] { item87 };
        fPHeapMax86.copia(itemArray88);
        fPHeapMax80.copia(itemArray88);
        fPHeapMax68.copia(itemArray88);
        fPHeapMax65.copia(itemArray88);
        fPHeapMax59.copia(itemArray88);
        fPHeapMax57.copia(itemArray88);
        fPHeapMax8.copia(itemArray88);
        fPHeapMax1.copia(itemArray88);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNull(item61);
        org.junit.Assert.assertNull(item62);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNotNull(itemArray82);
        org.junit.Assert.assertNotNull(itemArray88);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0920");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass5 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0921");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) '#', 10);
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0922");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 100, (int) (short) 1);
        fPHeapMax1.refaz((int) 'a', (int) 'a');
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax11.refaz((int) '4', 0);
        fPHeapMax11.imprime();
        fPHeapMax11.refaz((int) (byte) 100, 0);
        fPHeapMax11.imprime();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax22.constroi();
        fPHeapMax22.constroi();
        fPHeapMax22.constroi();
        fPHeapMax22.constroi();
        ds.Item item27 = fPHeapMax22.max();
        fPHeapMax22.imprime();
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax31.refaz((int) '4', 0);
        fPHeapMax31.imprime();
        fPHeapMax31.refaz((int) (byte) 100, 0);
        ds.Item item39 = fPHeapMax31.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item42 = fPHeapMax41.max();
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax47.imprime();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax50.copia(itemArray58);
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMax62.copia(itemArray64);
        fPHeapMax62.constroi();
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item69 = null;
        ds.Item[] itemArray70 = new ds.Item[] { item69 };
        fPHeapMax68.copia(itemArray70);
        fPHeapMax62.copia(itemArray70);
        fPHeapMax50.copia(itemArray70);
        fPHeapMax47.copia(itemArray70);
        fPHeapMax45.copia(itemArray70);
        fPHeapMax41.copia(itemArray70);
        fPHeapMax31.copia(itemArray70);
        fPHeapMax22.copia(itemArray70);
        fPHeapMax11.copia(itemArray70);
        fPHeapMax1.copia(itemArray70);
        ds.FPHeapMax fPHeapMax82 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax82.imprime();
        fPHeapMax82.constroi();
        ds.FPHeapMax fPHeapMax86 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item87 = null;
        ds.Item[] itemArray88 = new ds.Item[] { item87 };
        fPHeapMax86.copia(itemArray88);
        fPHeapMax86.constroi();
        ds.FPHeapMax fPHeapMax92 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item93 = null;
        ds.Item[] itemArray94 = new ds.Item[] { item93 };
        fPHeapMax92.copia(itemArray94);
        fPHeapMax86.copia(itemArray94);
        fPHeapMax82.copia(itemArray94);
        fPHeapMax1.copia(itemArray94);
        java.lang.Class<?> wildcardClass99 = itemArray94.getClass();
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item42);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(itemArray88);
        org.junit.Assert.assertNotNull(itemArray94);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0923");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass7 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0924");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.refaz((int) (byte) 10, (-1));
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax28.refaz((int) '4', 0);
        fPHeapMax28.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax34.constroi();
        fPHeapMax34.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax38.constroi();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax38.copia(itemArray46);
        fPHeapMax34.copia(itemArray46);
        fPHeapMax28.copia(itemArray46);
        fPHeapMax1.copia(itemArray46);
        ds.Item item52 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0925");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 100, (int) (short) 1);
        fPHeapMax1.refaz((int) 'a', (int) 'a');
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax11.refaz((int) '4', 0);
        fPHeapMax11.imprime();
        fPHeapMax11.refaz((int) (byte) 100, 0);
        fPHeapMax11.imprime();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax22.constroi();
        fPHeapMax22.constroi();
        fPHeapMax22.constroi();
        fPHeapMax22.constroi();
        ds.Item item27 = fPHeapMax22.max();
        fPHeapMax22.imprime();
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax31.refaz((int) '4', 0);
        fPHeapMax31.imprime();
        fPHeapMax31.refaz((int) (byte) 100, 0);
        ds.Item item39 = fPHeapMax31.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item42 = fPHeapMax41.max();
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax47.imprime();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax50.copia(itemArray58);
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMax62.copia(itemArray64);
        fPHeapMax62.constroi();
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item69 = null;
        ds.Item[] itemArray70 = new ds.Item[] { item69 };
        fPHeapMax68.copia(itemArray70);
        fPHeapMax62.copia(itemArray70);
        fPHeapMax50.copia(itemArray70);
        fPHeapMax47.copia(itemArray70);
        fPHeapMax45.copia(itemArray70);
        fPHeapMax41.copia(itemArray70);
        fPHeapMax31.copia(itemArray70);
        fPHeapMax22.copia(itemArray70);
        fPHeapMax11.copia(itemArray70);
        fPHeapMax1.copia(itemArray70);
        ds.FPHeapMax fPHeapMax82 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax82.imprime();
        fPHeapMax82.constroi();
        ds.FPHeapMax fPHeapMax86 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item87 = null;
        ds.Item[] itemArray88 = new ds.Item[] { item87 };
        fPHeapMax86.copia(itemArray88);
        fPHeapMax86.constroi();
        ds.FPHeapMax fPHeapMax92 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item93 = null;
        ds.Item[] itemArray94 = new ds.Item[] { item93 };
        fPHeapMax92.copia(itemArray94);
        fPHeapMax86.copia(itemArray94);
        fPHeapMax82.copia(itemArray94);
        fPHeapMax1.copia(itemArray94);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item42);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(itemArray88);
        org.junit.Assert.assertNotNull(itemArray94);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0926");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax10.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0927");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.refaz((int) (short) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0928");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, (int) ' ');
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) 'a');
        ds.Item item18 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax20.constroi();
        fPHeapMax20.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax24.constroi();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax24.copia(itemArray29);
        fPHeapMax20.copia(itemArray29);
        fPHeapMax17.copia(itemArray29);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax36.imprime();
        ds.Item item38 = fPHeapMax36.max();
        ds.Item item39 = fPHeapMax36.max();
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax42.constroi();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMax45.copia(itemArray47);
        fPHeapMax45.constroi();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        fPHeapMax45.copia(itemArray53);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        fPHeapMax57.constroi();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        fPHeapMax57.copia(itemArray65);
        fPHeapMax45.copia(itemArray65);
        fPHeapMax42.copia(itemArray65);
        fPHeapMax36.copia(itemArray65);
        fPHeapMax17.copia(itemArray65);
        ds.Item item72 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax76.constroi();
        fPHeapMax76.imprime();
        ds.FPHeapMax fPHeapMax80 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax80.constroi();
        ds.FPHeapMax fPHeapMax83 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item84 = null;
        ds.Item[] itemArray85 = new ds.Item[] { item84 };
        fPHeapMax83.copia(itemArray85);
        fPHeapMax80.copia(itemArray85);
        fPHeapMax76.copia(itemArray85);
        fPHeapMax74.copia(itemArray85);
        fPHeapMax17.copia(itemArray85);
        fPHeapMax1.copia(itemArray85);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNull(item72);
        org.junit.Assert.assertNotNull(itemArray85);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0929");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax34.copia(itemArray39);
        fPHeapMax1.copia(itemArray39);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0930");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax4.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.constroi();
        java.lang.Object obj31 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, obj31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0931");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax29.copia(itemArray40);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax43.constroi();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax43.copia(itemArray51);
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray54);
        fPHeapMax29.copia(itemArray54);
        fPHeapMax29.refaz((int) (short) 100, (int) '#');
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax61.constroi();
        ds.Item item63 = fPHeapMax61.max();
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item66 = null;
        ds.Item[] itemArray67 = new ds.Item[] { item66 };
        fPHeapMax65.copia(itemArray67);
        fPHeapMax65.constroi();
        ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item72 = null;
        ds.Item[] itemArray73 = new ds.Item[] { item72 };
        fPHeapMax71.copia(itemArray73);
        fPHeapMax65.copia(itemArray73);
        fPHeapMax61.copia(itemArray73);
        fPHeapMax29.copia(itemArray73);
        fPHeapMax1.copia(itemArray73);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNull(item63);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray73);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0932");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item11 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) ' ', (int) (short) 10);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0933");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0934");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.refaz(0, (int) (byte) -1);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0935");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        ds.Item item19 = fPHeapMax14.max();
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax22.constroi();
        fPHeapMax22.imprime();
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax30.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax30.copia(itemArray38);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax42.constroi();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax42.copia(itemArray50);
        fPHeapMax30.copia(itemArray50);
        fPHeapMax27.copia(itemArray50);
        fPHeapMax22.copia(itemArray50);
        fPHeapMax14.copia(itemArray50);
        fPHeapMax1.copia(itemArray50);
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax60.imprime();
        ds.Item item62 = fPHeapMax60.max();
        ds.Item item63 = fPHeapMax60.max();
        fPHeapMax60.refaz((int) 'a', (int) (short) 10);
        fPHeapMax60.imprime();
        fPHeapMax60.imprime();
        fPHeapMax60.imprime();
        fPHeapMax60.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) fPHeapMax60);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNull(item62);
        org.junit.Assert.assertNull(item63);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0936");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0937");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0938");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.refaz((int) ' ', 1);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass39 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0939");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        ds.Item item13 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax16.constroi();
        fPHeapMax16.constroi();
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0940");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item43 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0941");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax14.copia(itemArray22);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        fPHeapMax14.copia(itemArray34);
        fPHeapMax11.copia(itemArray34);
        fPHeapMax5.copia(itemArray34);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax41.imprime();
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMax45.copia(itemArray47);
        fPHeapMax45.constroi();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        fPHeapMax45.copia(itemArray53);
        fPHeapMax41.copia(itemArray53);
        fPHeapMax5.copia(itemArray53);
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax60.constroi();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        fPHeapMax63.constroi();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item70 = null;
        ds.Item[] itemArray71 = new ds.Item[] { item70 };
        fPHeapMax69.copia(itemArray71);
        fPHeapMax63.copia(itemArray71);
        ds.Item[] itemArray74 = new ds.Item[] {};
        fPHeapMax63.copia(itemArray74);
        fPHeapMax60.copia(itemArray74);
        fPHeapMax5.copia(itemArray74);
        fPHeapMax1.copia(itemArray74);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray74);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0942");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0943");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass6 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0944");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax44.copia(itemArray49);
        fPHeapMax11.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0945");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.Item item8 = fPHeapMax7.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) item8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0946");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0947");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz(1, 0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0948");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.Item item25 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax27.imprime();
        ds.Item item29 = fPHeapMax27.max();
        ds.Item item30 = fPHeapMax27.max();
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax33.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax36.copia(itemArray44);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax48.constroi();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        fPHeapMax48.copia(itemArray56);
        fPHeapMax36.copia(itemArray56);
        fPHeapMax33.copia(itemArray56);
        fPHeapMax27.copia(itemArray56);
        fPHeapMax1.copia(itemArray56);
        fPHeapMax1.refaz((int) (short) 1, (int) (byte) 1);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray56);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0949");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.Item item19 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item21 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0950");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        ds.Item item33 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax36.constroi();
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax40.constroi();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax43.constroi();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax43.copia(itemArray51);
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray54);
        fPHeapMax40.copia(itemArray54);
        fPHeapMax36.copia(itemArray54);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) itemArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0951");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax23.copia(itemArray31);
        fPHeapMax11.copia(itemArray31);
        fPHeapMax8.copia(itemArray31);
        fPHeapMax6.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        ds.Item item38 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0952");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.refaz((int) '4', 0);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        ds.Item item20 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (byte) 100, (int) (byte) 100);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0953");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item20 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax23.constroi();
        ds.Item item25 = fPHeapMax23.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax30.constroi();
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax34.copia(itemArray42);
        fPHeapMax30.copia(itemArray42);
        fPHeapMax27.copia(itemArray42);
        fPHeapMax23.copia(itemArray42);
        fPHeapMax1.copia(itemArray42);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0954");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax27.copia(itemArray35);
        fPHeapMax15.copia(itemArray35);
        fPHeapMax12.copia(itemArray35);
        fPHeapMax10.copia(itemArray35);
        fPHeapMax1.copia(itemArray35);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0955");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, (int) (byte) 1);
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.constroi();
        fPHeapMax13.constroi();
        fPHeapMax13.constroi();
        fPHeapMax13.constroi();
        ds.Item item18 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax21.constroi();
        fPHeapMax21.imprime();
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax41.copia(itemArray49);
        fPHeapMax29.copia(itemArray49);
        fPHeapMax26.copia(itemArray49);
        fPHeapMax21.copia(itemArray49);
        fPHeapMax13.copia(itemArray49);
        fPHeapMax13.imprime();
        java.lang.Class<?> wildcardClass57 = fPHeapMax13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) wildcardClass57);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0956");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        fPHeapMax7.constroi();
        ds.Item item11 = fPHeapMax7.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item14 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax34.copia(itemArray42);
        fPHeapMax22.copia(itemArray42);
        fPHeapMax19.copia(itemArray42);
        fPHeapMax17.copia(itemArray42);
        fPHeapMax13.copia(itemArray42);
        fPHeapMax7.copia(itemArray42);
        fPHeapMax3.copia(itemArray42);
        fPHeapMax1.copia(itemArray42);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0957");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(1, (int) (short) 0);
        fPHeapMax1.imprime();
        ds.Item item23 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0958");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray23);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray37);
        fPHeapMax12.copia(itemArray37);
        ds.Item item40 = fPHeapMax12.max();
        fPHeapMax12.imprime();
        fPHeapMax12.refaz(100, 10);
        fPHeapMax12.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item40);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0959");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item11 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) 'a', (int) (byte) 10);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0960");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        ds.Item item25 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item27 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.imprime();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax38.constroi();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax38.copia(itemArray46);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax50.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax50.copia(itemArray58);
        fPHeapMax38.copia(itemArray58);
        fPHeapMax35.copia(itemArray58);
        fPHeapMax29.copia(itemArray58);
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax65.imprime();
        fPHeapMax65.constroi();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item70 = null;
        ds.Item[] itemArray71 = new ds.Item[] { item70 };
        fPHeapMax69.copia(itemArray71);
        fPHeapMax69.constroi();
        ds.FPHeapMax fPHeapMax75 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item76 = null;
        ds.Item[] itemArray77 = new ds.Item[] { item76 };
        fPHeapMax75.copia(itemArray77);
        fPHeapMax69.copia(itemArray77);
        fPHeapMax65.copia(itemArray77);
        fPHeapMax29.copia(itemArray77);
        fPHeapMax1.copia(itemArray77);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray77);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0961");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass5 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0962");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item20 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass23 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0963");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 10, (int) (byte) 10);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax10.imprime();
        ds.Item item12 = fPHeapMax10.max();
        ds.Item item13 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        ds.Item item16 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        ds.Item item23 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax34.copia(itemArray42);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item47 = null;
        ds.Item[] itemArray48 = new ds.Item[] { item47 };
        fPHeapMax46.copia(itemArray48);
        fPHeapMax46.constroi();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        fPHeapMax52.copia(itemArray54);
        fPHeapMax46.copia(itemArray54);
        fPHeapMax34.copia(itemArray54);
        fPHeapMax31.copia(itemArray54);
        fPHeapMax26.copia(itemArray54);
        fPHeapMax18.copia(itemArray54);
        fPHeapMax10.copia(itemArray54);
        fPHeapMax1.copia(itemArray54);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0964");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray19);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray33);
        fPHeapMax8.copia(itemArray33);
        fPHeapMax3.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        ds.Item item38 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0965");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray24);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax27.copia(itemArray35);
        ds.Item[] itemArray38 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray38);
        fPHeapMax13.copia(itemArray38);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax13.copia(itemArray44);
        fPHeapMax1.copia(itemArray44);
        fPHeapMax1.refaz((int) ' ', (-1));
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0966");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item32 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item33 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item32);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0967");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.Item item35 = fPHeapMax1.max();
        fPHeapMax1.refaz(10, 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item35);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0968");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
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
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0969");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0970");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        fPHeapMax7.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item46 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0971");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax17.copia(itemArray22);
        fPHeapMax13.copia(itemArray22);
        fPHeapMax11.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0972");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(1, (int) (short) 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0973");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass4 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0974");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item17 = fPHeapMax1.max();
        ds.Item item18 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0975");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0976");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0977");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 100, (int) (short) 1);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(100, (-1));
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0978");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item26 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0979");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        ds.Item item6 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax11.constroi();
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        fPHeapMax11.copia(itemArray23);
        fPHeapMax8.copia(itemArray23);
        fPHeapMax4.copia(itemArray23);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax31.refaz((int) '4', 0);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item37 = fPHeapMax36.max();
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMax45.copia(itemArray47);
        fPHeapMax45.constroi();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        fPHeapMax45.copia(itemArray53);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        fPHeapMax57.constroi();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        fPHeapMax57.copia(itemArray65);
        fPHeapMax45.copia(itemArray65);
        fPHeapMax42.copia(itemArray65);
        fPHeapMax40.copia(itemArray65);
        fPHeapMax36.copia(itemArray65);
        fPHeapMax31.copia(itemArray65);
        fPHeapMax4.copia(itemArray65);
        fPHeapMax1.copia(itemArray65);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray65);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0980");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.Item item8 = fPHeapMax3.max();
        fPHeapMax3.imprime();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax12.refaz((int) '4', 0);
        fPHeapMax12.imprime();
        fPHeapMax12.refaz((int) (byte) 100, 0);
        ds.Item item20 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item23 = fPHeapMax22.max();
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax28.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax31.copia(itemArray39);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax43.constroi();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax43.copia(itemArray51);
        fPHeapMax31.copia(itemArray51);
        fPHeapMax28.copia(itemArray51);
        fPHeapMax26.copia(itemArray51);
        fPHeapMax22.copia(itemArray51);
        fPHeapMax12.copia(itemArray51);
        fPHeapMax3.copia(itemArray51);
        fPHeapMax1.copia(itemArray51);
        fPHeapMax1.imprime();
        ds.Item item62 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0981");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item36 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0982");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(1, (int) (short) 0);
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 100, (int) (short) 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax25.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax25.copia(itemArray33);
        fPHeapMax13.copia(itemArray33);
        ds.Item item37 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.Item item39 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax41.copia(itemArray49);
        ds.Item[] itemArray52 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray52);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax55.constroi();
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        fPHeapMax61.copia(itemArray63);
        fPHeapMax55.copia(itemArray63);
        ds.Item[] itemArray66 = new ds.Item[] {};
        fPHeapMax55.copia(itemArray66);
        fPHeapMax41.copia(itemArray66);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        fPHeapMax70.copia(itemArray72);
        fPHeapMax41.copia(itemArray72);
        fPHeapMax13.copia(itemArray72);
        fPHeapMax1.copia(itemArray72);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray72);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0983");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0984");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0985");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray15);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray29);
        fPHeapMax4.copia(itemArray29);
        ds.Item item32 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        fPHeapMax4.refaz((int) (short) 10, 0);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax38.refaz((int) '4', 0);
        fPHeapMax38.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax38.copia(itemArray46);
        fPHeapMax4.copia(itemArray46);
        fPHeapMax1.copia(itemArray46);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax52.imprime();
        fPHeapMax52.refaz(1, (int) (short) 0);
        ds.Item item57 = fPHeapMax52.max();
        fPHeapMax52.constroi();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax62.imprime();
        ds.Item item64 = fPHeapMax62.max();
        ds.Item item65 = fPHeapMax62.max();
        fPHeapMax62.constroi();
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax68.constroi();
        ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item72 = null;
        ds.Item[] itemArray73 = new ds.Item[] { item72 };
        fPHeapMax71.copia(itemArray73);
        fPHeapMax71.constroi();
        ds.FPHeapMax fPHeapMax77 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item78 = null;
        ds.Item[] itemArray79 = new ds.Item[] { item78 };
        fPHeapMax77.copia(itemArray79);
        fPHeapMax71.copia(itemArray79);
        ds.FPHeapMax fPHeapMax83 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item84 = null;
        ds.Item[] itemArray85 = new ds.Item[] { item84 };
        fPHeapMax83.copia(itemArray85);
        fPHeapMax83.constroi();
        ds.FPHeapMax fPHeapMax89 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item90 = null;
        ds.Item[] itemArray91 = new ds.Item[] { item90 };
        fPHeapMax89.copia(itemArray91);
        fPHeapMax83.copia(itemArray91);
        fPHeapMax71.copia(itemArray91);
        fPHeapMax68.copia(itemArray91);
        fPHeapMax62.copia(itemArray91);
        fPHeapMax60.copia(itemArray91);
        fPHeapMax52.copia(itemArray91);
        fPHeapMax1.copia(itemArray91);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNull(item57);
        org.junit.Assert.assertNull(item64);
        org.junit.Assert.assertNull(item65);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertNotNull(itemArray79);
        org.junit.Assert.assertNotNull(itemArray85);
        org.junit.Assert.assertNotNull(itemArray91);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0986");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0987");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax6.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item35 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0988");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        fPHeapMax8.copia(itemArray20);
        fPHeapMax5.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax28.refaz((int) '4', 0);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item34 = fPHeapMax33.max();
        fPHeapMax33.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax39.imprime();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax42.constroi();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax42.copia(itemArray50);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        fPHeapMax54.constroi();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMax60.copia(itemArray62);
        fPHeapMax54.copia(itemArray62);
        fPHeapMax42.copia(itemArray62);
        fPHeapMax39.copia(itemArray62);
        fPHeapMax37.copia(itemArray62);
        fPHeapMax33.copia(itemArray62);
        fPHeapMax28.copia(itemArray62);
        fPHeapMax1.copia(itemArray62);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax74.constroi();
        fPHeapMax74.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray62);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0989");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.refaz((int) ' ', 1);
        fPHeapMax1.imprime();
        ds.Item item39 = fPHeapMax1.max();
        ds.Item item40 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (short) 100, (int) ' ');
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item40);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0990");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0991");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax8.copia(itemArray13);
        fPHeapMax4.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax41.copia(itemArray49);
        fPHeapMax29.copia(itemArray49);
        fPHeapMax26.copia(itemArray49);
        fPHeapMax20.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        fPHeapMax1.refaz((int) '#', (int) (short) 1);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0992");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0993");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax5.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        ds.Item item15 = fPHeapMax1.max();
        ds.Item item16 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax18.copia(itemArray23);
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        fPHeapMax33.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax33.copia(itemArray41);
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMax45.copia(itemArray47);
        fPHeapMax45.constroi();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        fPHeapMax45.copia(itemArray53);
        fPHeapMax33.copia(itemArray53);
        fPHeapMax30.copia(itemArray53);
        fPHeapMax28.copia(itemArray53);
        fPHeapMax18.copia(itemArray53);
        fPHeapMax1.copia(itemArray53);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray53);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0994");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.refaz((int) '4', 0);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, 0);
        ds.Item item9 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0995");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (-1));
        ds.Item item9 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0996");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax10.copia(itemArray30);
        fPHeapMax7.copia(itemArray30);
        fPHeapMax5.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item38 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0997");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 10);
        ds.Item item8 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax16.copia(itemArray36);
        fPHeapMax13.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        fPHeapMax7.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        java.lang.Class<?> wildcardClass44 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0998");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 100, (int) (short) 1);
        fPHeapMax1.refaz((int) 'a', (int) 'a');
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test0999");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(1, (int) (short) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test1000");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax8.refaz((int) '4', 0);
        fPHeapMax8.imprime();
        fPHeapMax8.refaz((int) (byte) 100, 0);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax38.constroi();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax38.copia(itemArray46);
        fPHeapMax26.copia(itemArray46);
        fPHeapMax23.copia(itemArray46);
        fPHeapMax17.copia(itemArray46);
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax53.imprime();
        fPHeapMax53.constroi();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        fPHeapMax57.constroi();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        fPHeapMax57.copia(itemArray65);
        fPHeapMax53.copia(itemArray65);
        fPHeapMax17.copia(itemArray65);
        fPHeapMax8.copia(itemArray65);
        fPHeapMax1.copia(itemArray65);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray65);
    }
}

